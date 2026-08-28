package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;
public class Char {
    private final char f19608c;
    private final Font font;
    private final int fontCode;
    private final Metrics f19609m;

    public Char(char c10, Font font, int i9, Metrics metrics) {
        this.font = font;
        this.fontCode = i9;
        this.f19608c = c10;
        this.f19609m = metrics;
    }

    public char getChar() {
        return this.f19608c;
    }

    public CharFont getCharFont() {
        return new CharFont(this.f19608c, this.fontCode);
    }

    public float getDepth() {
        return this.f19609m.getDepth();
    }

    public Font getFont() {
        return this.font;
    }

    public int getFontCode() {
        return this.fontCode;
    }

    public float getHeight() {
        return this.f19609m.getHeight();
    }

    public float getItalic() {
        return this.f19609m.getItalic();
    }

    public Metrics getMetrics() {
        return this.f19609m;
    }

    public float getWidth() {
        return this.f19609m.getWidth();
    }
}
