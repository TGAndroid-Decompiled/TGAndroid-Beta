package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;
public class Char {
    private final char f21124c;
    private final Font font;
    private final int fontCode;
    private final Metrics f21125m;

    public Char(char c10, Font font, int i7, Metrics metrics) {
        this.font = font;
        this.fontCode = i7;
        this.f21124c = c10;
        this.f21125m = metrics;
    }

    public char getChar() {
        return this.f21124c;
    }

    public CharFont getCharFont() {
        return new CharFont(this.f21124c, this.fontCode);
    }

    public float getDepth() {
        return this.f21125m.getDepth();
    }

    public Font getFont() {
        return this.font;
    }

    public int getFontCode() {
        return this.fontCode;
    }

    public float getHeight() {
        return this.f21125m.getHeight();
    }

    public float getItalic() {
        return this.f21125m.getItalic();
    }

    public Metrics getMetrics() {
        return this.f21125m;
    }

    public float getWidth() {
        return this.f21125m.getWidth();
    }
}
