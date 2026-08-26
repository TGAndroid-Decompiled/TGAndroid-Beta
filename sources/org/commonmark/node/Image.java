package org.commonmark.node;

public final class Image extends Node {
    public final String destination;
    public final String title;

    public Image(String str, String str2) {
        this.destination = str;
        this.title = str2;
    }

    @Override
    public final void accept(AbstractVisitor abstractVisitor) {
        abstractVisitor.visit(this);
    }

    @Override
    public final String toStringAttributes() {
        return "destination=" + this.destination + ", title=" + this.title;
    }
}
