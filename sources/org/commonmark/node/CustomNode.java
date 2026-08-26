package org.commonmark.node;

public abstract class CustomNode extends Node {
    @Override
    public final void accept(AbstractVisitor abstractVisitor) {
        abstractVisitor.visit(this);
    }
}
