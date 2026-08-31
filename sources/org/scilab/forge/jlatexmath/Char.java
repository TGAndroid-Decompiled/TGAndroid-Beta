package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;
public class Char {
    private final char f18014c;
    private final Font font;
    private final int fontCode;
    private final Metrics f18015m;

    public Char(char c3, Font font, int i10, Metrics metrics) {
        this.font = font;
        this.fontCode = i10;
        this.f18014c = c3;
        this.f18015m = metrics;
    }

    public char getChar() {
        return this.f18014c;
    }

    public CharFont getCharFont() {
        return new CharFont(this.f18014c, this.fontCode);
    }

    public float getDepth() {
        return this.f18015m.getDepth();
    }

    public Font getFont() {
        return this.font;
    }

    public int getFontCode() {
        return this.fontCode;
    }

    public float getHeight() {
        return this.f18015m.getHeight();
    }

    public float getItalic() {
        return this.f18015m.getItalic();
    }

    public Metrics getMetrics() {
        return this.f18015m;
    }

    public float getWidth() {
        return this.f18015m.getWidth();
    }
}
