package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;
public class Char {
    private final char f21132c;
    private final Font font;
    private final int fontCode;
    private final Metrics f21133m;

    public Char(char c10, Font font, int i7, Metrics metrics) {
        this.font = font;
        this.fontCode = i7;
        this.f21132c = c10;
        this.f21133m = metrics;
    }

    public char getChar() {
        return this.f21132c;
    }

    public CharFont getCharFont() {
        return new CharFont(this.f21132c, this.fontCode);
    }

    public float getDepth() {
        return this.f21133m.getDepth();
    }

    public Font getFont() {
        return this.font;
    }

    public int getFontCode() {
        return this.fontCode;
    }

    public float getHeight() {
        return this.f21133m.getHeight();
    }

    public float getItalic() {
        return this.f21133m.getItalic();
    }

    public Metrics getMetrics() {
        return this.f21133m;
    }

    public float getWidth() {
        return this.f21133m.getWidth();
    }
}
