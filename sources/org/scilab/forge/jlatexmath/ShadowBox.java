package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.BasicStroke;
import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.Stroke;
import ru.noties.jlatexmath.awt.geom.Rectangle2D;
public class ShadowBox extends FramedBox {
    private float shadowRule;

    public ShadowBox(FramedBox framedBox, float f9) {
        super(framedBox.box, framedBox.thickness, framedBox.space);
        this.shadowRule = f9;
        this.depth += f9;
        this.width += f9;
    }

    @Override
    public void draw(Graphics2D graphics2D, float f9, float f10) {
        float f11 = this.thickness;
        float f12 = f11 / 2.0f;
        this.box.draw(graphics2D, this.space + f9 + f11, f10);
        Stroke stroke = graphics2D.getStroke();
        graphics2D.setStroke(new BasicStroke(this.thickness, 0, 0));
        float f13 = this.height;
        float f14 = this.width;
        float f15 = this.shadowRule;
        float f16 = this.thickness;
        graphics2D.draw(new Rectangle2D.Float(f9 + f12, (f10 - f13) + f12, (f14 - f15) - f16, ((f13 + this.depth) - f15) - f16));
        float abs = (float) Math.abs(1.0d / graphics2D.getTransform().getScaleX());
        graphics2D.setStroke(new BasicStroke(abs, 0, 0));
        float f17 = this.shadowRule;
        graphics2D.fill(new Rectangle2D.Float((f9 + f17) - abs, ((this.depth + f10) - f17) - abs, this.width - f17, f17));
        float f18 = f9 + this.width;
        float f19 = this.shadowRule;
        float f20 = (f18 - f19) - abs;
        float f21 = this.height;
        graphics2D.fill(new Rectangle2D.Float(f20, (f10 - f21) + f12 + f19, f19, ((this.depth + f21) - (2.0f * f19)) - f12));
        graphics2D.setStroke(stroke);
    }

    @Override
    public int getLastFontId() {
        return this.box.getLastFontId();
    }
}
