package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;
public class Char {
    private final char f15777c;
    private final Font font;
    private final int fontCode;
    private final Metrics f15778m;

    public Char(char c10, Font font, int i10, Metrics metrics) {
        this.font = font;
        this.fontCode = i10;
        this.f15777c = c10;
        this.f15778m = metrics;
    }

    public char getChar() {
        return this.f15777c;
    }

    public CharFont getCharFont() {
        return new CharFont(this.f15777c, this.fontCode);
    }

    public float getDepth() {
        return this.f15778m.getDepth();
    }

    public Font getFont() {
        return this.font;
    }

    public int getFontCode() {
        return this.fontCode;
    }

    public float getHeight() {
        return this.f15778m.getHeight();
    }

    public float getItalic() {
        return this.f15778m.getItalic();
    }

    public Metrics getMetrics() {
        return this.f15778m;
    }

    public float getWidth() {
        return this.f15778m.getWidth();
    }
}
