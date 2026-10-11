package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;
public class Char {
    private final char f17211c;
    private final Font font;
    private final int fontCode;
    private final Metrics f17212m;

    public Char(char c10, Font font, int i10, Metrics metrics) {
        this.font = font;
        this.fontCode = i10;
        this.f17211c = c10;
        this.f17212m = metrics;
    }

    public char getChar() {
        return this.f17211c;
    }

    public CharFont getCharFont() {
        return new CharFont(this.f17211c, this.fontCode);
    }

    public float getDepth() {
        return this.f17212m.getDepth();
    }

    public Font getFont() {
        return this.font;
    }

    public int getFontCode() {
        return this.fontCode;
    }

    public float getHeight() {
        return this.f17212m.getHeight();
    }

    public float getItalic() {
        return this.f17212m.getItalic();
    }

    public Metrics getMetrics() {
        return this.f17212m;
    }

    public float getWidth() {
        return this.f17212m.getWidth();
    }
}
