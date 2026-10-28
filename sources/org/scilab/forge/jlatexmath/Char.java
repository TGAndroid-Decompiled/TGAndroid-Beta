package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;
public class Char {
    private final char f19508c;
    private final Font font;
    private final int fontCode;
    private final Metrics f19509m;

    public Char(char c10, Font font, int i10, Metrics metrics) {
        this.font = font;
        this.fontCode = i10;
        this.f19508c = c10;
        this.f19509m = metrics;
    }

    public char getChar() {
        return this.f19508c;
    }

    public CharFont getCharFont() {
        return new CharFont(this.f19508c, this.fontCode);
    }

    public float getDepth() {
        return this.f19509m.getDepth();
    }

    public Font getFont() {
        return this.font;
    }

    public int getFontCode() {
        return this.fontCode;
    }

    public float getHeight() {
        return this.f19509m.getHeight();
    }

    public float getItalic() {
        return this.f19509m.getItalic();
    }

    public Metrics getMetrics() {
        return this.f19509m;
    }

    public float getWidth() {
        return this.f19509m.getWidth();
    }
}
