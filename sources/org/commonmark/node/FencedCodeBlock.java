package org.commonmark.node;

public final class FencedCodeBlock extends Block {
    public char fenceChar;
    public int fenceIndent;
    public int fenceLength;
    public String info;
    public String literal;

    @Override
    public final void accept(AbstractVisitor abstractVisitor) {
        abstractVisitor.visit(this);
    }
}
