package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;
public class Char {
    private final char f16669c;
    private final Font font;
    private final int fontCode;
    private final Metrics f16670m;

    public Char(char c10, Font font, int i10, Metrics metrics) {
        this.font = font;
        this.fontCode = i10;
        this.f16669c = c10;
        this.f16670m = metrics;
    }

    public char getChar() {
        return this.f16669c;
    }

    public CharFont getCharFont() {
        return new CharFont(this.f16669c, this.fontCode);
    }

    public float getDepth() {
        return this.f16670m.getDepth();
    }

    public Font getFont() {
        return this.font;
    }

    public int getFontCode() {
        return this.fontCode;
    }

    public float getHeight() {
        return this.f16670m.getHeight();
    }

    public float getItalic() {
        return this.f16670m.getItalic();
    }

    public Metrics getMetrics() {
        return this.f16670m;
    }

    public float getWidth() {
        return this.f16670m.getWidth();
    }
}
