package org.commonmark.node;

public final class Link extends Node {
    public final int $r8$classId;
    public final String destination;
    public final String title;

    public Link(int i, String str, String str2) {
        this.$r8$classId = i;
        this.destination = str;
        this.title = str2;
    }

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

    @Override
    public final String toStringAttributes() {
        switch (this.$r8$classId) {
            case 0:
                return "destination=" + this.destination + ", title=" + this.title;
            default:
                return "destination=" + this.destination + ", title=" + this.title;
        }
    }
}
