package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;
import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.geom.AffineTransform;
public class CharBox extends Box {
    private final char[] arr = new char[1];
    private final CharFont f19582cf;
    private float italic;
    private final float size;

    public CharBox(Char r22) {
        this.f19582cf = r22.getCharFont();
        this.size = r22.getMetrics().getSize();
        this.width = r22.getWidth();
        this.height = r22.getHeight();
        this.depth = r22.getDepth();
        this.italic = r22.getItalic();
    }

    public void addItalicCorrectionToWidth() {
        this.width += this.italic;
        this.italic = 0.0f;
    }

    @Override
    public void draw(Graphics2D graphics2D, float f9, float f10) {
        drawDebug(graphics2D, f9, f10);
        AffineTransform transform = graphics2D.getTransform();
        graphics2D.translate(f9, f10);
        Font font = FontInfo.getFont(this.f19582cf.fontId);
        if (Math.abs(this.size - TeXFormula.FONT_SCALE_FACTOR) > 1.0E-7f) {
            float f11 = this.size;
            float f12 = TeXFormula.FONT_SCALE_FACTOR;
            graphics2D.scale(f11 / f12, f11 / f12);
        }
        if (graphics2D.getFont() != font) {
            graphics2D.setFont(font);
        }
        char[] cArr = this.arr;
        cArr[0] = this.f19582cf.f19583c;
        graphics2D.drawChars(cArr, 0, 1, 0, 0);
        graphics2D.setTransform(transform);
    }

    @Override
    public int getLastFontId() {
        return this.f19582cf.fontId;
    }

    public String toString() {
        return super.toString() + "=" + this.f19582cf.f19583c;
    }
}
