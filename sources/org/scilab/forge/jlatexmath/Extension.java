package org.scilab.forge.jlatexmath;
public class Extension {
    private final Char bottom;
    private final Char middle;
    private final Char repeat;
    private final Char top;

    public Extension(Char r12, Char r22, Char r32, Char r42) {
        this.top = r12;
        this.middle = r22;
        this.repeat = r32;
        this.bottom = r42;
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
        if (this.bottom != null) {
            return true;
        }
        return false;
    }

    public boolean hasMiddle() {
        if (this.middle != null) {
            return true;
        }
        return false;
    }

    public boolean hasTop() {
        if (this.top != null) {
            return true;
        }
        return false;
    }
}
