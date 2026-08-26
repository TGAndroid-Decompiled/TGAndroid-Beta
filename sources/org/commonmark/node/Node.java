package org.commonmark.node;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import org.telegram.messenger.audioinfo.m4a.MP4Atom;
import org.telegram.messenger.audioinfo.util.PositionInputStream;
import org.telegram.messenger.audioinfo.util.RangeInputStream;

public abstract class Node {
    public final int $r8$classId;
    public Object firstChild;
    public Object lastChild;
    public Object next;
    public Object parent;
    public Object prev;

    public Node(PositionInputStream positionInputStream, Node node, String str) {
        this.$r8$classId = 1;
        this.parent = positionInputStream;
        this.firstChild = node;
        this.lastChild = str;
        this.prev = new DataInputStream(positionInputStream);
    }

    public abstract void accept(AbstractVisitor abstractVisitor);

    public void appendChild(Node node) {
        node.unlink();
        node.setParent(this);
        Node node2 = (Node) this.lastChild;
        if (node2 == null) {
            this.firstChild = node;
            this.lastChild = node;
        } else {
            node2.next = node;
            node.prev = node2;
            this.lastChild = node;
        }
    }

    public MP4Atom nextChild() throws IOException {
        RangeInputStream rangeInputStream;
        MP4Atom mP4Atom = (MP4Atom) this.next;
        if (mP4Atom != null) {
            while (mP4Atom.getRemaining() > 0) {
                if (((RangeInputStream) ((PositionInputStream) mP4Atom.parent)).skip(mP4Atom.getRemaining()) == 0) {
                    throw new EOFException("Cannot skip atom");
                }
            }
        }
        DataInputStream dataInputStream = (DataInputStream) this.prev;
        int i = dataInputStream.readInt();
        byte[] bArr = new byte[4];
        dataInputStream.readFully(bArr);
        String str = new String(bArr, "ISO8859_1");
        if (i == 1) {
            rangeInputStream = new RangeInputStream((PositionInputStream) this.parent, 16L, dataInputStream.readLong() - 16);
        } else {
            rangeInputStream = new RangeInputStream((PositionInputStream) this.parent, 8L, i - 8);
        }
        MP4Atom mP4Atom2 = new MP4Atom(rangeInputStream, this, str, 0);
        this.next = mP4Atom2;
        return mP4Atom2;
    }

    public void setParent(Node node) {
        this.parent = node;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 0:
                return getClass().getSimpleName() + "{" + toStringAttributes() + "}";
            default:
                return super.toString();
        }
    }

    public String toStringAttributes() {
        return "";
    }

    public void unlink() {
        Node node = (Node) this.prev;
        if (node != null) {
            node.next = (Node) this.next;
        } else {
            Node node2 = (Node) this.parent;
            if (node2 != null) {
                node2.firstChild = (Node) this.next;
            }
        }
        Node node3 = (Node) this.next;
        if (node3 != null) {
            node3.prev = node;
        } else {
            Node node4 = (Node) this.parent;
            if (node4 != null) {
                node4.lastChild = node;
            }
        }
        this.parent = null;
        this.next = null;
        this.prev = null;
    }

    public Node() {
        this.$r8$classId = 0;
        this.parent = null;
        this.firstChild = null;
        this.lastChild = null;
        this.prev = null;
        this.next = null;
    }
}
