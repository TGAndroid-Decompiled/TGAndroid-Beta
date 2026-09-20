package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;
public class Char {
    private final char f15781c;
    private final Font font;
    private final int fontCode;
    private final Metrics f15782m;

    public Char(char c10, Font font, int i10, Metrics metrics) {
        this.font = font;
        this.fontCode = i10;
        this.f15781c = c10;
        this.f15782m = metrics;
    }

    public char getChar() {
        return this.f15781c;
    }

    public CharFont getCharFont() {
        return new CharFont(this.f15781c, this.fontCode);
    }

    public float getDepth() {
        return this.f15782m.getDepth();
    }

    public Font getFont() {
        return this.font;
    }

    public int getFontCode() {
        return this.fontCode;
    }

    public float getHeight() {
        return this.f15782m.getHeight();
    }

    public float getItalic() {
        return this.f15782m.getItalic();
    }

    public Metrics getMetrics() {
        return this.f15782m;
    }

    public float getWidth() {
        return this.f15782m.getWidth();
    }
}
