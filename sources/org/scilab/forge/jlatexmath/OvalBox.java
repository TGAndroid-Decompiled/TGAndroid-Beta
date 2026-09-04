package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.BasicStroke;
import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.Stroke;
import ru.noties.jlatexmath.awt.geom.RoundRectangle2D;
public class OvalBox extends FramedBox {
    public OvalBox(FramedBox framedBox) {
        super(framedBox.box, framedBox.thickness, framedBox.space);
    }

    @Override
    public void draw(Graphics2D graphics2D, float f7, float f10) {
        this.box.draw(graphics2D, this.space + f7 + this.thickness, f10);
        Stroke stroke = graphics2D.getStroke();
        graphics2D.setStroke(new BasicStroke(this.thickness, 0, 0));
        float f11 = this.thickness;
        float f12 = f11 / 2.0f;
        float min = Math.min(this.width - f11, (this.height + this.depth) - f11) * 0.5f;
        float f13 = f7 + f12;
        float f14 = this.height;
        float f15 = (f10 - f14) + f12;
        float f16 = this.width;
        float f17 = this.thickness;
        graphics2D.draw(new RoundRectangle2D.Float(f13, f15, f16 - f17, (f14 + this.depth) - f17, min, min));
        graphics2D.setStroke(stroke);
    }

    @Override
    public int getLastFontId() {
        return this.box.getLastFontId();
    }
}
