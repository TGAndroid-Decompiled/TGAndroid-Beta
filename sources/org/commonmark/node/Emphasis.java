package org.commonmark.node;

public class Emphasis extends Node {
    private String delimiter;

    public Emphasis(String str) {
        this.delimiter = str;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
