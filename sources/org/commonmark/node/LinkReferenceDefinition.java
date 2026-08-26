package org.commonmark.node;

public final class LinkReferenceDefinition extends Node {
    public String destination;
    public String label;
    public String title;

    @Override
    public final void accept(AbstractVisitor abstractVisitor) {
        abstractVisitor.visitChildren(this);
    }
}
