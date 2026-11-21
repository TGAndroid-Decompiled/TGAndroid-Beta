package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;
public class Char {
    private final char f22597c;
    private final Font font;
    private final int fontCode;
    private final Metrics f22598m;

    public Char(char c10, Font font, int i7, Metrics metrics) {
        this.font = font;
        this.fontCode = i7;
        this.f22597c = c10;
        this.f22598m = metrics;
    }

    public char getChar() {
        return this.f22597c;
    }

    public CharFont getCharFont() {
        return new CharFont(this.f22597c, this.fontCode);
    }

    public float getDepth() {
        return this.f22598m.getDepth();
    }

    public Font getFont() {
        return this.font;
    }

    public int getFontCode() {
        return this.fontCode;
    }

    public float getHeight() {
        return this.f22598m.getHeight();
    }

    public float getItalic() {
        return this.f22598m.getItalic();
    }

    public Metrics getMetrics() {
        return this.f22598m;
    }

    public float getWidth() {
        return this.f22598m.getWidth();
    }
}
