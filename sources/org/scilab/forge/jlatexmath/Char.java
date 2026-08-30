package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;
public class Char {
    private final char f16628c;
    private final Font font;
    private final int fontCode;
    private final Metrics f16629m;

    public Char(char c3, Font font, int i10, Metrics metrics) {
        this.font = font;
        this.fontCode = i10;
        this.f16628c = c3;
        this.f16629m = metrics;
    }

    public char getChar() {
        return this.f16628c;
    }

    public CharFont getCharFont() {
        return new CharFont(this.f16628c, this.fontCode);
    }

    public float getDepth() {
        return this.f16629m.getDepth();
    }

    public Font getFont() {
        return this.font;
    }

    public int getFontCode() {
        return this.fontCode;
    }

    public float getHeight() {
        return this.f16629m.getHeight();
    }

    public float getItalic() {
        return this.f16629m.getItalic();
    }

    public Metrics getMetrics() {
        return this.f16629m;
    }

    public float getWidth() {
        return this.f16629m.getWidth();
    }
}
