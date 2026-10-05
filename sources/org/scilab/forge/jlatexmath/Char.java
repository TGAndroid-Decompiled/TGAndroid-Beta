package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;
public class Char {
    private final char f17226c;
    private final Font font;
    private final int fontCode;
    private final Metrics f17227m;

    public Char(char c10, Font font, int i10, Metrics metrics) {
        this.font = font;
        this.fontCode = i10;
        this.f17226c = c10;
        this.f17227m = metrics;
    }

    public char getChar() {
        return this.f17226c;
    }

    public CharFont getCharFont() {
        return new CharFont(this.f17226c, this.fontCode);
    }

    public float getDepth() {
        return this.f17227m.getDepth();
    }

    public Font getFont() {
        return this.font;
    }

    public int getFontCode() {
        return this.fontCode;
    }

    public float getHeight() {
        return this.f17227m.getHeight();
    }

    public float getItalic() {
        return this.f17227m.getItalic();
    }

    public Metrics getMetrics() {
        return this.f17227m;
    }

    public float getWidth() {
        return this.f17227m.getWidth();
    }
}
