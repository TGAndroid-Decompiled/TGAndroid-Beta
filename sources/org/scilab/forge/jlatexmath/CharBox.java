package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;
import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.geom.AffineTransform;

public class CharBox extends Box {
    private final char[] arr = new char[1];
    private final CharFont cf;
    private float italic;
    private final float size;

    public CharBox(Char r2) {
        this.cf = r2.getCharFont();
        this.size = r2.getMetrics().getSize();
        this.width = r2.getWidth();
        this.height = r2.getHeight();
        this.depth = r2.getDepth();
        this.italic = r2.getItalic();
    }

    public void addItalicCorrectionToWidth() {
        this.width += this.italic;
        this.italic = 0.0f;
    }

    @Override
    public void draw(Graphics2D graphics2D, float f, float f2) {
        drawDebug(graphics2D, f, f2);
        AffineTransform transform = graphics2D.getTransform();
        graphics2D.translate(f, f2);
        Font font = FontInfo.getFont(this.cf.fontId);
        if (Math.abs(this.size - TeXFormula.FONT_SCALE_FACTOR) > 1.0E-7f) {
            float f3 = this.size;
            float f4 = TeXFormula.FONT_SCALE_FACTOR;
            graphics2D.scale(f3 / f4, f3 / f4);
        }
        if (graphics2D.getFont() != font) {
            graphics2D.setFont(font);
        }
        char[] cArr = this.arr;
        cArr[0] = this.cf.c;
        graphics2D.drawChars(cArr, 0, 1, 0, 0);
        graphics2D.setTransform(transform);
    }

    @Override
    public int getLastFontId() {
        return this.cf.fontId;
    }

    public String toString() {
        return super.toString() + "=" + this.cf.c;
    }
}
