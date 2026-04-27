package org.commonmark.internal;

import org.commonmark.node.Text;

public class Bracket {
    public boolean allowed = true;
    public boolean bracketAfter = false;
    public final boolean image;
    public final int index;
    public final Text node;
    public final Bracket previous;
    public final Delimiter previousDelimiter;

    public static Bracket link(Text text, int i, Bracket bracket, Delimiter delimiter) {
        return new Bracket(text, i, bracket, delimiter, false);
    }

    public static Bracket image(Text text, int i, Bracket bracket, Delimiter delimiter) {
        return new Bracket(text, i, bracket, delimiter, true);
    }

    private Bracket(Text text, int i, Bracket bracket, Delimiter delimiter, boolean z) {
        this.node = text;
        this.index = i;
        this.image = z;
        this.previous = bracket;
        this.previousDelimiter = delimiter;
    }
}
