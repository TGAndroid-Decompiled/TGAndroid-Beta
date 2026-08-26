package org.commonmark.node;

public final class OrderedList extends ListBlock {
    public char delimiter;
    public int startNumber;

    @Override
    public final void accept(AbstractVisitor abstractVisitor) {
        abstractVisitor.visit(this);
    }
}
