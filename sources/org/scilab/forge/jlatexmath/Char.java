package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;
public class Char {
    private final char f22564c;
    private final Font font;
    private final int fontCode;
    private final Metrics f22565m;

    public Char(char c10, Font font, int i7, Metrics metrics) {
        this.font = font;
        this.fontCode = i7;
        this.f22564c = c10;
        this.f22565m = metrics;
    }

    public char getChar() {
        return this.f22564c;
    }

    public CharFont getCharFont() {
        return new CharFont(this.f22564c, this.fontCode);
    }

    public float getDepth() {
        return this.f22565m.getDepth();
    }

    public Font getFont() {
        return this.font;
    }

    public int getFontCode() {
        return this.fontCode;
    }

    public float getHeight() {
        return this.f22565m.getHeight();
    }

    public float getItalic() {
        return this.f22565m.getItalic();
    }

    public Metrics getMetrics() {
        return this.f22565m;
    }

    public float getWidth() {
        return this.f22565m.getWidth();
    }
}
