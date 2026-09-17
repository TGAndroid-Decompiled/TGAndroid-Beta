package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;
public class Char {
    private final char f15572c;
    private final Font font;
    private final int fontCode;
    private final Metrics f15573m;

    public Char(char c10, Font font, int i10, Metrics metrics) {
        this.font = font;
        this.fontCode = i10;
        this.f15572c = c10;
        this.f15573m = metrics;
    }

    public char getChar() {
        return this.f15572c;
    }

    public CharFont getCharFont() {
        return new CharFont(this.f15572c, this.fontCode);
    }

    public float getDepth() {
        return this.f15573m.getDepth();
    }

    public Font getFont() {
        return this.font;
    }

    public int getFontCode() {
        return this.fontCode;
    }

    public float getHeight() {
        return this.f15573m.getHeight();
    }

    public float getItalic() {
        return this.f15573m.getItalic();
    }

    public Metrics getMetrics() {
        return this.f15573m;
    }

    public float getWidth() {
        return this.f15573m.getWidth();
    }
}
