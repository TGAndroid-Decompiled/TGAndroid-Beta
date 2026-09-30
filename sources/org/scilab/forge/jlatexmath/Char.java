package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;
public class Char {
    private final char f15793c;
    private final Font font;
    private final int fontCode;
    private final Metrics f15794m;

    public Char(char c10, Font font, int i10, Metrics metrics) {
        this.font = font;
        this.fontCode = i10;
        this.f15793c = c10;
        this.f15794m = metrics;
    }

    public char getChar() {
        return this.f15793c;
    }

    public CharFont getCharFont() {
        return new CharFont(this.f15793c, this.fontCode);
    }

    public float getDepth() {
        return this.f15794m.getDepth();
    }

    public Font getFont() {
        return this.font;
    }

    public int getFontCode() {
        return this.fontCode;
    }

    public float getHeight() {
        return this.f15794m.getHeight();
    }

    public float getItalic() {
        return this.f15794m.getItalic();
    }

    public Metrics getMetrics() {
        return this.f15794m;
    }

    public float getWidth() {
        return this.f15794m.getWidth();
    }
}
