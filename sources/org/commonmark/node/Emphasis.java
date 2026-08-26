package org.commonmark.node;

public final class Emphasis extends Node {
    public final int $r8$classId;

    @Override
    public final void accept(AbstractVisitor abstractVisitor) {
        switch (this.$r8$classId) {
            case 0:
                abstractVisitor.visit(this);
                break;
            case 1:
                abstractVisitor.visit$1(this);
                break;
            case 2:
                abstractVisitor.visit$2(this);
                break;
            default:
                abstractVisitor.visit$3(this);
                break;
        }
    }
}
