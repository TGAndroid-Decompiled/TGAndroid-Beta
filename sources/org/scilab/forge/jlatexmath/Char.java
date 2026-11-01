package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;
public class Char {
    private final char f14318c;
    private final Font font;
    private final int fontCode;
    private final Metrics f14319m;

    public Char(char c10, Font font, int i10, Metrics metrics) {
        this.font = font;
        this.fontCode = i10;
        this.f14318c = c10;
        this.f14319m = metrics;
    }

    public char getChar() {
        return this.f14318c;
    }

    public CharFont getCharFont() {
        return new CharFont(this.f14318c, this.fontCode);
    }

    public float getDepth() {
        return this.f14319m.getDepth();
    }

    public Font getFont() {
        return this.font;
    }

    public int getFontCode() {
        return this.fontCode;
    }

    public float getHeight() {
        return this.f14319m.getHeight();
    }

    public float getItalic() {
        return this.f14319m.getItalic();
    }

    public Metrics getMetrics() {
        return this.f14319m;
    }

    public float getWidth() {
        return this.f14319m.getWidth();
    }
}
