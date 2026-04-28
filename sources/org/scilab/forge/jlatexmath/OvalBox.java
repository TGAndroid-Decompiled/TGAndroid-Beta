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
    public void draw(Graphics2D graphics2D, float f, float f2) {
        this.box.draw(graphics2D, this.space + f + this.thickness, f2);
        Stroke stroke = graphics2D.getStroke();
        graphics2D.setStroke(new BasicStroke(this.thickness, 0, 0));
        float f3 = this.thickness;
        float f4 = f3 / 2.0f;
        float fMin = Math.min(this.width - f3, (this.height + this.depth) - f3) * 0.5f;
        float f5 = f + f4;
        float f6 = this.height;
        float f7 = (f2 - f6) + f4;
        float f8 = this.width;
        float f9 = this.thickness;
        graphics2D.draw(new RoundRectangle2D.Float(f5, f7, f8 - f9, (f6 + this.depth) - f9, fMin, fMin));
        graphics2D.setStroke(stroke);
    }

    @Override
    public int getLastFontId() {
        return this.box.getLastFontId();
    }
}
