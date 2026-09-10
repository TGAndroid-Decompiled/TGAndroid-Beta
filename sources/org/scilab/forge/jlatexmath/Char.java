package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;
public class Char {
    private final char f14604c;
    private final Font font;
    private final int fontCode;
    private final Metrics f14605m;

    public Char(char c10, Font font, int i10, Metrics metrics) {
        this.font = font;
        this.fontCode = i10;
        this.f14604c = c10;
        this.f14605m = metrics;
    }

    public char getChar() {
        return this.f14604c;
    }

    public CharFont getCharFont() {
        return new CharFont(this.f14604c, this.fontCode);
    }

    public float getDepth() {
        return this.f14605m.getDepth();
    }

    public Font getFont() {
        return this.font;
    }

    public int getFontCode() {
        return this.fontCode;
    }

    public float getHeight() {
        return this.f14605m.getHeight();
    }

    public float getItalic() {
        return this.f14605m.getItalic();
    }

    public Metrics getMetrics() {
        return this.f14605m;
    }

    public float getWidth() {
        return this.f14605m.getWidth();
    }
}
