package org.commonmark.node;

public final class Emphasis extends Node {
    @Override
    public final void accept(AbstractVisitor abstractVisitor) {
        abstractVisitor.visit(this);
    }
}
