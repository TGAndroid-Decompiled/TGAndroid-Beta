package org.commonmark.internal;

import android.support.v4.media.session.MediaSessionCompat;
import org.commonmark.node.Text;

public final class Bracket {
    public boolean allowed;
    public boolean bracketAfter;
    public final boolean image;
    public final int index;
    public final Object node;
    public final Object previous;
    public final Object previousDelimiter;

    public Bracket(boolean z, int i, String str, String str2, MediaSessionCompat.Token token, boolean z2, boolean z3) {
        this.image = z;
        this.index = i;
        this.previous = str;
        this.previousDelimiter = str2;
        this.node = token;
        this.allowed = z2;
        this.bracketAfter = z3;
    }

    public Bracket(Text text, int i, Bracket bracket, Delimiter delimiter, boolean z) {
        this.allowed = true;
        this.bracketAfter = false;
        this.node = text;
        this.index = i;
        this.image = z;
        this.previous = bracket;
        this.previousDelimiter = delimiter;
    }
}
