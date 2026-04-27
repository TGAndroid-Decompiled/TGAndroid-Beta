package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;

public class Char {
    private final char c;
    private final Font font;
    private final int fontCode;
    private final Metrics m;

    public Char(char c, Font font, int i, Metrics metrics) {
        this.font = font;
        this.fontCode = i;
        this.c = c;
        this.m = metrics;
    }

    public CharFont getCharFont() {
        return new CharFont(this.c, this.fontCode);
    }

    public char getChar() {
        return this.c;
    }

    public Font getFont() {
        return this.font;
    }

    public int getFontCode() {
        return this.fontCode;
    }

    public float getWidth() {
        return this.m.getWidth();
    }

    public float getItalic() {
        return this.m.getItalic();
    }

    public float getHeight() {
        return this.m.getHeight();
    }

    public float getDepth() {
        return this.m.getDepth();
    }

    public Metrics getMetrics() {
        return this.m;
    }
}
