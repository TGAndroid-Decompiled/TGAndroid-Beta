package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;
public class Char {
    private final char f17247c;
    private final Font font;
    private final int fontCode;
    private final Metrics f17248m;

    public Char(char c10, Font font, int i10, Metrics metrics) {
        this.font = font;
        this.fontCode = i10;
        this.f17247c = c10;
        this.f17248m = metrics;
    }

    public char getChar() {
        return this.f17247c;
    }

    public CharFont getCharFont() {
        return new CharFont(this.f17247c, this.fontCode);
    }

    public float getDepth() {
        return this.f17248m.getDepth();
    }

    public Font getFont() {
        return this.font;
    }

    public int getFontCode() {
        return this.fontCode;
    }

    public float getHeight() {
        return this.f17248m.getHeight();
    }

    public float getItalic() {
        return this.f17248m.getItalic();
    }

    public Metrics getMetrics() {
        return this.f17248m;
    }

    public float getWidth() {
        return this.f17248m.getWidth();
    }
}
