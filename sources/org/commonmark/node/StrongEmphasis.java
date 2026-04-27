package org.commonmark.node;

public class StrongEmphasis extends Node {
    private String delimiter;

    public StrongEmphasis(String str) {
        this.delimiter = str;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
