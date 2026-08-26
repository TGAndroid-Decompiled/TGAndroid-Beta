package org.commonmark.node;

public final class Paragraph extends Block {
    @Override
    public final void accept(AbstractVisitor abstractVisitor) {
        abstractVisitor.visit(this);
    }
}
