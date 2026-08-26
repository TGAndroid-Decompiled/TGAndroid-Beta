package org.commonmark.node;

public final class Code extends Node {
    public final int $r8$classId;
    public String literal;

    @Override
    public final void accept(AbstractVisitor abstractVisitor) {
        switch (this.$r8$classId) {
            case 0:
                abstractVisitor.visit(this);
                break;
            default:
                abstractVisitor.visit$1(this);
                break;
        }
    }
}
