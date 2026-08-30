package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.BasicStroke;
import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.Stroke;
import ru.noties.jlatexmath.awt.geom.Rectangle2D;
public class ShadowBox extends FramedBox {
    private float shadowRule;

    public ShadowBox(FramedBox framedBox, float f10) {
        super(framedBox.box, framedBox.thickness, framedBox.space);
        this.shadowRule = f10;
        this.depth += f10;
        this.width += f10;
    }

    @Override
    public void draw(Graphics2D graphics2D, float f10, float f11) {
        float f12 = this.thickness;
        float f13 = f12 / 2.0f;
        this.box.draw(graphics2D, this.space + f10 + f12, f11);
        Stroke stroke = graphics2D.getStroke();
        graphics2D.setStroke(new BasicStroke(this.thickness, 0, 0));
        float f14 = this.height;
        float f15 = this.width;
        float f16 = this.shadowRule;
        float f17 = this.thickness;
        graphics2D.draw(new Rectangle2D.Float(f10 + f13, (f11 - f14) + f13, (f15 - f16) - f17, ((f14 + this.depth) - f16) - f17));
        float abs = (float) Math.abs(1.0d / graphics2D.getTransform().getScaleX());
        graphics2D.setStroke(new BasicStroke(abs, 0, 0));
        float f18 = this.shadowRule;
        graphics2D.fill(new Rectangle2D.Float((f10 + f18) - abs, ((this.depth + f11) - f18) - abs, this.width - f18, f18));
        float f19 = f10 + this.width;
        float f20 = this.shadowRule;
        float f21 = (f19 - f20) - abs;
        float f22 = this.height;
        graphics2D.fill(new Rectangle2D.Float(f21, (f11 - f22) + f13 + f20, f20, ((this.depth + f22) - (2.0f * f20)) - f13));
        graphics2D.setStroke(stroke);
    }

    @Override
    public int getLastFontId() {
        return this.box.getLastFontId();
    }
}
