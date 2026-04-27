package org.commonmark.node;

public abstract class Block extends Node {
    @Override
    public Block getParent() {
        return (Block) super.getParent();
    }

    @Override
    protected void setParent(Node node) {
        if (!(node instanceof Block)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        super.setParent(node);
    }
}
