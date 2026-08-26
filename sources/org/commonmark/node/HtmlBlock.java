package org.commonmark.node;

public final class HtmlBlock extends Block {
    public String literal;

    @Override
    public final void accept(AbstractVisitor abstractVisitor) {
        abstractVisitor.visit(this);
    }
}
