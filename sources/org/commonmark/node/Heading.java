package org.commonmark.node;

public final class Heading extends Block {
    public int level;

    @Override
    public final void accept(AbstractVisitor abstractVisitor) {
        abstractVisitor.visit(this);
    }
}
