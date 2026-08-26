package org.commonmark.node;

public final class Text extends Node {
    public String literal;

    public Text(String str) {
        this.literal = str;
    }

    @Override
    public final void accept(AbstractVisitor abstractVisitor) {
        abstractVisitor.visit(this);
    }

    @Override
    public final String toStringAttributes() {
        return "literal=" + this.literal;
    }
}
