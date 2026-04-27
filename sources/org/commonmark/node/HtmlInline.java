package org.commonmark.node;

public class HtmlInline extends Node {
    private String literal;

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
}
