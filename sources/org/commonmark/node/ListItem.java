package org.commonmark.node;

public final class ListItem extends Block {
    @Override
    public final void accept(AbstractVisitor abstractVisitor) {
        abstractVisitor.visit(this);
    }
}
