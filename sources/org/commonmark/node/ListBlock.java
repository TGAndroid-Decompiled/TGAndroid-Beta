package org.commonmark.node;

public abstract class ListBlock extends Block {
    private boolean tight;

    public void setTight(boolean z) {
        this.tight = z;
    }
}
