package org.commonmark.node;

public abstract class CustomBlock extends Block {
    @Override
    public final void accept(AbstractVisitor abstractVisitor) {
        abstractVisitor.visit(this);
    }
}
