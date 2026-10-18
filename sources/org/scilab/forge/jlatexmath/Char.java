package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;
public class Char {
    private final char f17763c;
    private final Font font;
    private final int fontCode;
    private final Metrics f17764m;

    public Char(char c10, Font font, int i10, Metrics metrics) {
        this.font = font;
        this.fontCode = i10;
        this.f17763c = c10;
        this.f17764m = metrics;
    }

    public char getChar() {
        return this.f17763c;
    }

    public CharFont getCharFont() {
        return new CharFont(this.f17763c, this.fontCode);
    }

    public float getDepth() {
        return this.f17764m.getDepth();
    }

    public Font getFont() {
        return this.font;
    }

    public int getFontCode() {
        return this.fontCode;
    }

    public float getHeight() {
        return this.f17764m.getHeight();
    }

    public float getItalic() {
        return this.f17764m.getItalic();
    }

    public Metrics getMetrics() {
        return this.f17764m;
    }

    public float getWidth() {
        return this.f17764m.getWidth();
    }
}
