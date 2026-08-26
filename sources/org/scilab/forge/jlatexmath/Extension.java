package org.scilab.forge.jlatexmath;

public class Extension {
    private final Char bottom;
    private final Char middle;
    private final Char repeat;
    private final Char top;

    public Extension(Char r1, Char r2, Char r3, Char r4) {
        this.top = r1;
        this.middle = r2;
        this.repeat = r3;
        this.bottom = r4;
    }

    public Char getBottom() {
        return this.bottom;
    }

    public Char getMiddle() {
        return this.middle;
    }

    public Char getRepeat() {
        return this.repeat;
    }

    public Char getTop() {
        return this.top;
    }

    public boolean hasBottom() {
        return this.bottom != null;
    }

    public boolean hasMiddle() {
        return this.middle != null;
    }

    public boolean hasTop() {
        return this.top != null;
    }
}
