package org.commonmark.node;

public final class Code extends Node {
    public String literal;

    @Override
    public final void accept(AbstractVisitor abstractVisitor) {
        abstractVisitor.visit(this);
    }
}
