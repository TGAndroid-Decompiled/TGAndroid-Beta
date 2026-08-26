package org.commonmark.node;

public abstract class Node {
    public Node parent = null;
    public Node firstChild = null;
    public Node lastChild = null;
    public Node prev = null;
    public Node next = null;

    public abstract void accept(AbstractVisitor abstractVisitor);

    public final void appendChild(Node node) {
        node.unlink();
        node.setParent(this);
        Node node2 = this.lastChild;
        if (node2 == null) {
            this.firstChild = node;
            this.lastChild = node;
        } else {
            node2.next = node;
            node.prev = node2;
            this.lastChild = node;
        }
    }

    public void setParent(Node node) {
        this.parent = node;
    }

    public final String toString() {
        return getClass().getSimpleName() + "{" + toStringAttributes() + "}";
    }

    public String toStringAttributes() {
        return "";
    }

    public final void unlink() {
        Node node = this.prev;
        if (node != null) {
            node.next = this.next;
        } else {
            Node node2 = this.parent;
            if (node2 != null) {
                node2.firstChild = this.next;
            }
        }
        Node node3 = this.next;
        if (node3 != null) {
            node3.prev = node;
        } else {
            Node node4 = this.parent;
            if (node4 != null) {
                node4.lastChild = node;
            }
        }
        this.parent = null;
        this.next = null;
        this.prev = null;
    }
}
