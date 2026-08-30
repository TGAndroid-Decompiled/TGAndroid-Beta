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

    public FcscoreBox(int i10, float f10, float f11, float f12, boolean z4) {
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 > 4096) {
            i10 = 4096;
        }
        this.N = i10;
        this.width = (2.0f * f12) + ((f11 + f12) * i10);
        this.height = f10;
        this.depth = 0.0f;
        this.strike = z4;
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
        int i10 = 0;
        graphics2D.setStroke(new BasicStroke((float) (this.thickness * scaleX), 0, 0));
        float f12 = this.thickness / 2.0f;
        Line2D.Float r10 = new Line2D.Float();
        float f13 = this.space;
        float f14 = (float) (((f13 / 2.0f) * scaleX) + ((f10 + f13) * scaleX));
        int round = (int) Math.round((f13 + this.thickness) * scaleX);
        while (i10 < this.N) {
            double d = (f12 * scaleX) + f14;
            double d10 = scaleX;
            int i11 = round;
            r10.setLine(d, (f11 - this.height) * scaleX, d, f11 * d10);
            graphics2D.draw(r10);
            f14 += i11;
            i10++;
            round = i11;
            scaleX = d10;
        }
        double d11 = scaleX;
        float f15 = f14;
        if (this.strike) {
            float f16 = this.space;
            float f17 = this.height;
            r10.setLine((f10 + f16) * d11, (f11 - (f17 / 2.0f)) * d11, f15 - ((f16 * d11) / 2.0d), (f11 - (f17 / 2.0f)) * d11);
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
