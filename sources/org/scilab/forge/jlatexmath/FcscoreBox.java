package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.BasicStroke;
import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.Stroke;
import ru.noties.jlatexmath.awt.geom.AffineTransform;
import ru.noties.jlatexmath.awt.geom.Line2D;
public class FcscoreBox extends Box {
    private int N;
    private float space;
    private boolean strike;
    private float thickness;

    public FcscoreBox(int i3, float f10, float f11, float f12, boolean z10) {
        if (i3 < 0) {
            i3 = 0;
        } else if (i3 > 4096) {
            i3 = 4096;
        }
        this.N = i3;
        this.width = (2.0f * f12) + ((f11 + f12) * i3);
        this.height = f10;
        this.depth = 0.0f;
        this.strike = z10;
        this.space = f12;
        this.thickness = f11;
    }

    @Override
    public void draw(Graphics2D graphics2D, float f10, float f11) {
        AffineTransform transform = graphics2D.getTransform();
        Stroke stroke = graphics2D.getStroke();
        double scaleX = transform.getScaleX();
        double scaleY = transform.getScaleY();
        if (scaleX == scaleY) {
            AffineTransform clone = transform.clone();
            clone.scale(1.0d / scaleX, 1.0d / scaleY);
            graphics2D.setTransform(clone);
        } else {
            scaleX = 1.0d;
        }
        int i3 = 0;
        graphics2D.setStroke(new BasicStroke((float) (this.thickness * scaleX), 0, 0));
        float f12 = 2.0f;
        float f13 = this.thickness / 2.0f;
        Line2D.Float r10 = new Line2D.Float();
        float f14 = this.space;
        float f15 = (float) (((f14 / 2.0f) * scaleX) + ((f10 + f14) * scaleX));
        int round = (int) Math.round((f14 + this.thickness) * scaleX);
        while (i3 < this.N) {
            float f16 = f12;
            double d = (f13 * scaleX) + f15;
            double d10 = scaleX;
            int i10 = round;
            r10.setLine(d, (f11 - this.height) * scaleX, d, f11 * d10);
            graphics2D.draw(r10);
            f15 += i10;
            i3++;
            round = i10;
            f12 = f16;
            scaleX = d10;
        }
        double d11 = scaleX;
        float f17 = f12;
        float f18 = f15;
        if (this.strike) {
            float f19 = this.space;
            float f20 = this.height;
            r10.setLine((f10 + f19) * d11, (f11 - (f20 / f17)) * d11, f18 - ((f19 * d11) / 2.0d), (f11 - (f20 / f17)) * d11);
            graphics2D.draw(r10);
        }
        graphics2D.setTransform(transform);
        graphics2D.setStroke(stroke);
    }

    @Override
    public int getLastFontId() {
        return -1;
    }
}
