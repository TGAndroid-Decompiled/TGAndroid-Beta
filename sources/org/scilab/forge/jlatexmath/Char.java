package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;
public class Char {
    private final char f21177c;
    private final Font font;
    private final int fontCode;
    private final Metrics f21178m;

    public Char(char c2, Font font, int i3, Metrics metrics) {
        this.font = font;
        this.fontCode = i3;
        this.f21177c = c2;
        this.f21178m = metrics;
    }

    public char getChar() {
        return this.f21177c;
    }

    public CharFont getCharFont() {
        return new CharFont(this.f21177c, this.fontCode);
    }

    public float getDepth() {
        return this.f21178m.getDepth();
    }

    public Font getFont() {
        return this.font;
    }

    public int getFontCode() {
        return this.fontCode;
    }

    public float getHeight() {
        return this.f21178m.getHeight();
    }

    public float getItalic() {
        return this.f21178m.getItalic();
    }

    public Metrics getMetrics() {
        return this.f21178m;
    }

    public float getWidth() {
        return this.f21178m.getWidth();
    }
}
