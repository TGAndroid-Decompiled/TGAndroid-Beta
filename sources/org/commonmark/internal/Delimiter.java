package org.commonmark.internal;

import org.commonmark.node.Text;

public final class Delimiter {
    public final boolean canClose;
    public final boolean canOpen;
    public final char delimiterChar;
    public Delimiter next;
    public final Text node;
    public Delimiter previous;
    public int length = 1;
    public int originalLength = 1;

    public Delimiter(Text text, char c, boolean z, boolean z2, Delimiter delimiter) {
        this.node = text;
        this.delimiterChar = c;
        this.canOpen = z;
        this.canClose = z2;
        this.previous = delimiter;
    }
}
