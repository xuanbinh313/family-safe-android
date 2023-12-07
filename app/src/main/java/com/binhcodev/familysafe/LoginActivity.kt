package com.binhcodev.familysafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val edtA = findViewById<EditText>(R.id.num_a)
        val edtB = findViewById<EditText>(R.id.num_b)
        val btnCalculate = findViewById<Button>(R.id.btn_calculate)
        btnCalculate.setOnClickListener {
            var valueA = edtA.text.toString().toInt()
            var valueB = edtB.text.toString().toInt()
            var total = valueA + valueB
            Toast.makeText(this,"$total",Toast.LENGTH_LONG).show()
        }
    }
    fun nextScreen(view: View){
        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}