package org.commonmark.node;

public class BulletList extends ListBlock {
    private char bulletMarker;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public char getBulletMarker() {
        return this.bulletMarker;
    }

    public void setBulletMarker(char c) {
        this.bulletMarker = c;
    }
}
