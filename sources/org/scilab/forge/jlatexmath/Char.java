package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;
public class Char {
    private final char f16361c;
    private final Font font;
    private final int fontCode;
    private final Metrics f16362m;

    public Char(char c10, Font font, int i10, Metrics metrics) {
        this.font = font;
        this.fontCode = i10;
        this.f16361c = c10;
        this.f16362m = metrics;
    }

    public char getChar() {
        return this.f16361c;
    }

    public CharFont getCharFont() {
        return new CharFont(this.f16361c, this.fontCode);
    }

    public float getDepth() {
        return this.f16362m.getDepth();
    }

    public Font getFont() {
        return this.font;
    }

    public int getFontCode() {
        return this.fontCode;
    }

    public float getHeight() {
        return this.f16362m.getHeight();
    }

    public float getItalic() {
        return this.f16362m.getItalic();
    }

    public Metrics getMetrics() {
        return this.f16362m;
    }

    public float getWidth() {
        return this.f16362m.getWidth();
    }
}
