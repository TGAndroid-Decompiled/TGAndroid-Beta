package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.BasicStroke;
import ru.noties.jlatexmath.awt.Color;
import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.Stroke;
import ru.noties.jlatexmath.awt.geom.Rectangle2D;

public class FramedBox extends Box {
    private Color bg;
    protected Box box;
    private Color line;
    protected float space;
    protected float thickness;

    public FramedBox(Box box, float f, float f2) {
        this.box = box;
        float f3 = 2.0f * f2;
        this.width = f3 + (f * 2.0f) + box.width;
        this.height = box.height + f + f2;
        this.depth = box.depth + f + f2;
        this.shift = box.shift;
        this.thickness = f;
        this.space = f2;
    }

    @Override
    public void draw(Graphics2D graphics2D, float f, float f2) {
        Stroke stroke = graphics2D.getStroke();
        graphics2D.setStroke(new BasicStroke(this.thickness, 0, 0));
        float f3 = this.thickness / 2.0f;
        if (this.bg != null) {
            Color color = graphics2D.getColor();
            graphics2D.setColor(this.bg);
            float f4 = this.height;
            float f5 = this.width;
            float f6 = this.thickness;
            graphics2D.fill(new Rectangle2D.Float(f + f3, (f2 - f4) + f3, f5 - f6, (f4 + this.depth) - f6));
            graphics2D.setColor(color);
        }
        if (this.line != null) {
            Color color2 = graphics2D.getColor();
            graphics2D.setColor(this.line);
            float f7 = f + f3;
            float f8 = this.height;
            float f9 = (f2 - f8) + f3;
            float f10 = this.width;
            float f11 = this.thickness;
            graphics2D.draw(new Rectangle2D.Float(f7, f9, f10 - f11, (f8 + this.depth) - f11));
            graphics2D.setColor(color2);
        } else {
            float f12 = f + f3;
            float f13 = this.height;
            float f14 = (f2 - f13) + f3;
            float f15 = this.width;
            float f16 = this.thickness;
            graphics2D.draw(new Rectangle2D.Float(f12, f14, f15 - f16, (f13 + this.depth) - f16));
        }
        graphics2D.setStroke(stroke);
        this.box.draw(graphics2D, f + this.space + this.thickness, f2);
    }

    @Override
    public int getLastFontId() {
        return this.box.getLastFontId();
    }

    public FramedBox(Box box, float f, float f2, Color color, Color color2) {
        this(box, f, f2);
        this.line = color;
        this.bg = color2;
    }
}
