package com.example.demo.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    
    @RequestMapping(value="index")
    public String index() {
        
        return "index";
    }
    
    @RequestMapping(value="process")
    public void process() {
    	
    }
    
    
}