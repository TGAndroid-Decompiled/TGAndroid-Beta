package org.commonmark.node;

public class Text extends Node {
    private String literal;

    public Text(String str) {
        this.literal = str;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getLiteral() {
        return this.literal;
    }

    public void setLiteral(String str) {
        this.literal = str;
    }

    @Override
    protected String toStringAttributes() {
        return "literal=" + this.literal;
    }
}
