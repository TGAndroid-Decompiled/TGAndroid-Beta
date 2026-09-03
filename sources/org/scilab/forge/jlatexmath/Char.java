package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;
public class Char {
    private final char f16608c;
    private final Font font;
    private final int fontCode;
    private final Metrics f16609m;

    public Char(char c3, Font font, int i10, Metrics metrics) {
        this.font = font;
        this.fontCode = i10;
        this.f16608c = c3;
        this.f16609m = metrics;
    }

    public char getChar() {
        return this.f16608c;
    }

    public CharFont getCharFont() {
        return new CharFont(this.f16608c, this.fontCode);
    }

    public float getDepth() {
        return this.f16609m.getDepth();
    }

    public Font getFont() {
        return this.font;
    }

    public int getFontCode() {
        return this.fontCode;
    }

    public float getHeight() {
        return this.f16609m.getHeight();
    }

    public float getItalic() {
        return this.f16609m.getItalic();
    }

    public Metrics getMetrics() {
        return this.f16609m;
    }

    public float getWidth() {
        return this.f16609m.getWidth();
    }
}
