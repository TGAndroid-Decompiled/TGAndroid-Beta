package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.BasicStroke;
import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.Stroke;
import ru.noties.jlatexmath.awt.geom.Rectangle2D;

public class ShadowBox extends FramedBox {
    private float shadowRule;

    public ShadowBox(FramedBox framedBox, float f) {
        super(framedBox.box, framedBox.thickness, framedBox.space);
        this.shadowRule = f;
        this.depth += f;
        this.width += f;
    }

    @Override
    public void draw(Graphics2D graphics2D, float f, float f2) {
        float f3 = this.thickness;
        float f4 = f3 / 2.0f;
        this.box.draw(graphics2D, this.space + f + f3, f2);
        Stroke stroke = graphics2D.getStroke();
        graphics2D.setStroke(new BasicStroke(this.thickness, 0, 0));
        float f5 = this.height;
        float f6 = this.width;
        float f7 = this.shadowRule;
        float f8 = this.thickness;
        graphics2D.draw(new Rectangle2D.Float(f + f4, (f2 - f5) + f4, (f6 - f7) - f8, ((f5 + this.depth) - f7) - f8));
        float fAbs = (float) Math.abs(1.0d / graphics2D.getTransform().getScaleX());
        graphics2D.setStroke(new BasicStroke(fAbs, 0, 0));
        float f9 = this.shadowRule;
        graphics2D.fill(new Rectangle2D.Float((f + f9) - fAbs, ((this.depth + f2) - f9) - fAbs, this.width - f9, f9));
        float f10 = f + this.width;
        float f11 = this.shadowRule;
        float f12 = (f10 - f11) - fAbs;
        float f13 = this.height;
        graphics2D.fill(new Rectangle2D.Float(f12, (f2 - f13) + f4 + f11, f11, ((this.depth + f13) - (2.0f * f11)) - f4));
        graphics2D.setStroke(stroke);
    }

    @Override
    public int getLastFontId() {
        return this.box.getLastFontId();
    }
}
