package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;
public class Char {
    private final char f19579c;
    private final Font font;
    private final int fontCode;
    private final Metrics f19580m;

    public Char(char c3, Font font, int i10, Metrics metrics) {
        this.font = font;
        this.fontCode = i10;
        this.f19579c = c3;
        this.f19580m = metrics;
    }

    public char getChar() {
        return this.f19579c;
    }

    public CharFont getCharFont() {
        return new CharFont(this.f19579c, this.fontCode);
    }

    public float getDepth() {
        return this.f19580m.getDepth();
    }

    public Font getFont() {
        return this.font;
    }

    public int getFontCode() {
        return this.fontCode;
    }

    public float getHeight() {
        return this.f19580m.getHeight();
    }

    public float getItalic() {
        return this.f19580m.getItalic();
    }

    public Metrics getMetrics() {
        return this.f19580m;
    }

    public float getWidth() {
        return this.f19580m.getWidth();
    }
}
