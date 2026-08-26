package org.commonmark.node;

public final class BulletList extends ListBlock {
    public char bulletMarker;

    @Override
    public final void accept(AbstractVisitor abstractVisitor) {
        abstractVisitor.visit(this);
    }
}
