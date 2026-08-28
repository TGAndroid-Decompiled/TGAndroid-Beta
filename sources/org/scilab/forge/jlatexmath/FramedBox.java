package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.BasicStroke;
import ru.noties.jlatexmath.awt.Color;
import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.Stroke;
import ru.noties.jlatexmath.awt.geom.Rectangle2D;
public class FramedBox extends Box {
    private Color f19615bg;
    protected Box box;
    private Color line;
    protected float space;
    protected float thickness;

    public FramedBox(Box box, float f10, float f11) {
        this.box = box;
        float f12 = 2.0f * f11;
        this.width = f12 + (f10 * 2.0f) + box.width;
        this.height = box.height + f10 + f11;
        this.depth = box.depth + f10 + f11;
        this.shift = box.shift;
        this.thickness = f10;
        this.space = f11;
    }

    @Override
    public void draw(Graphics2D graphics2D, float f10, float f11) {
        Stroke stroke = graphics2D.getStroke();
        graphics2D.setStroke(new BasicStroke(this.thickness, 0, 0));
        float f12 = this.thickness / 2.0f;
        if (this.f19615bg != null) {
            Color color = graphics2D.getColor();
            graphics2D.setColor(this.f19615bg);
            float f13 = this.height;
            float f14 = this.width;
            float f15 = this.thickness;
            graphics2D.fill(new Rectangle2D.Float(f10 + f12, (f11 - f13) + f12, f14 - f15, (f13 + this.depth) - f15));
            graphics2D.setColor(color);
        }
        if (this.line != null) {
            Color color2 = graphics2D.getColor();
            graphics2D.setColor(this.line);
            float f16 = f10 + f12;
            float f17 = this.height;
            float f18 = (f11 - f17) + f12;
            float f19 = this.width;
            float f20 = this.thickness;
            graphics2D.draw(new Rectangle2D.Float(f16, f18, f19 - f20, (f17 + this.depth) - f20));
            graphics2D.setColor(color2);
        } else {
            float f21 = f10 + f12;
            float f22 = this.height;
            float f23 = (f11 - f22) + f12;
            float f24 = this.width;
            float f25 = this.thickness;
            graphics2D.draw(new Rectangle2D.Float(f21, f23, f24 - f25, (f22 + this.depth) - f25));
        }
        graphics2D.setStroke(stroke);
        this.box.draw(graphics2D, f10 + this.space + this.thickness, f11);
    }

    @Override
    public int getLastFontId() {
        return this.box.getLastFontId();
    }

    public FramedBox(Box box, float f10, float f11, Color color, Color color2) {
        this(box, f10, f11);
        this.line = color;
        this.f19615bg = color2;
    }
}
