package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.BasicStroke;
import ru.noties.jlatexmath.awt.Color;
import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.Stroke;
import ru.noties.jlatexmath.awt.geom.Rectangle2D;
public class FramedBox extends Box {
    private Color f14611bg;
    protected Box box;
    private Color line;
    protected float space;
    protected float thickness;

    public FramedBox(Box box, float f7, float f10) {
        this.box = box;
        float f11 = 2.0f * f10;
        this.width = f11 + (f7 * 2.0f) + box.width;
        this.height = box.height + f7 + f10;
        this.depth = box.depth + f7 + f10;
        this.shift = box.shift;
        this.thickness = f7;
        this.space = f10;
    }

    @Override
    public void draw(Graphics2D graphics2D, float f7, float f10) {
        Stroke stroke = graphics2D.getStroke();
        graphics2D.setStroke(new BasicStroke(this.thickness, 0, 0));
        float f11 = this.thickness / 2.0f;
        if (this.f14611bg != null) {
            Color color = graphics2D.getColor();
            graphics2D.setColor(this.f14611bg);
            float f12 = this.height;
            float f13 = this.width;
            float f14 = this.thickness;
            graphics2D.fill(new Rectangle2D.Float(f7 + f11, (f10 - f12) + f11, f13 - f14, (f12 + this.depth) - f14));
            graphics2D.setColor(color);
        }
        if (this.line != null) {
            Color color2 = graphics2D.getColor();
            graphics2D.setColor(this.line);
            float f15 = f7 + f11;
            float f16 = this.height;
            float f17 = (f10 - f16) + f11;
            float f18 = this.width;
            float f19 = this.thickness;
            graphics2D.draw(new Rectangle2D.Float(f15, f17, f18 - f19, (f16 + this.depth) - f19));
            graphics2D.setColor(color2);
        } else {
            float f20 = f7 + f11;
            float f21 = this.height;
            float f22 = (f10 - f21) + f11;
            float f23 = this.width;
            float f24 = this.thickness;
            graphics2D.draw(new Rectangle2D.Float(f20, f22, f23 - f24, (f21 + this.depth) - f24));
        }
        graphics2D.setStroke(stroke);
        this.box.draw(graphics2D, f7 + this.space + this.thickness, f10);
    }

    @Override
    public int getLastFontId() {
        return this.box.getLastFontId();
    }

    public FramedBox(Box box, float f7, float f10, Color color, Color color2) {
        this(box, f7, f10);
        this.line = color;
        this.f14611bg = color2;
    }
}
