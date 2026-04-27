package org.commonmark.node;

public class Image extends Node {
    private String destination;
    private String title;

    public Image(String str, String str2) {
        this.destination = str;
        this.title = str2;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    protected String toStringAttributes() {
        return "destination=" + this.destination + ", title=" + this.title;
    }
}
