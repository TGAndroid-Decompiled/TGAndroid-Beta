package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;
public class Char {
    private final char f16964c;
    private final Font font;
    private final int fontCode;
    private final Metrics f16965m;

    public Char(char c10, Font font, int i10, Metrics metrics) {
        this.font = font;
        this.fontCode = i10;
        this.f16964c = c10;
        this.f16965m = metrics;
    }

    public char getChar() {
        return this.f16964c;
    }

    public CharFont getCharFont() {
        return new CharFont(this.f16964c, this.fontCode);
    }

    public float getDepth() {
        return this.f16965m.getDepth();
    }

    public Font getFont() {
        return this.font;
    }

    public int getFontCode() {
        return this.fontCode;
    }

    public float getHeight() {
        return this.f16965m.getHeight();
    }

    public float getItalic() {
        return this.f16965m.getItalic();
    }

    public Metrics getMetrics() {
        return this.f16965m;
    }

    public float getWidth() {
        return this.f16965m.getWidth();
    }
}
