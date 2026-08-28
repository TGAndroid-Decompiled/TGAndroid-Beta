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

    public FcscoreBox(int i9, float f10, float f11, float f12, boolean z10) {
        if (i9 < 0) {
            i9 = 0;
        } else if (i9 > 4096) {
            i9 = 4096;
        }
        this.N = i9;
        this.width = (2.0f * f12) + ((f11 + f12) * i9);
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
        int i9 = 0;
        graphics2D.setStroke(new BasicStroke((float) (this.thickness * scaleX), 0, 0));
        float f12 = this.thickness / 2.0f;
        Line2D.Float r10 = new Line2D.Float();
        float f13 = this.space;
        float f14 = (float) (((f13 / 2.0f) * scaleX) + ((f10 + f13) * scaleX));
        int round = (int) Math.round((f13 + this.thickness) * scaleX);
        while (i9 < this.N) {
            double d = (f12 * scaleX) + f14;
            double d9 = scaleX;
            int i10 = round;
            r10.setLine(d, (f11 - this.height) * scaleX, d, f11 * d9);
            graphics2D.draw(r10);
            f14 += i10;
            i9++;
            round = i10;
            scaleX = d9;
        }
        double d10 = scaleX;
        float f15 = f14;
        if (this.strike) {
            float f16 = this.space;
            float f17 = this.height;
            r10.setLine((f10 + f16) * d10, (f11 - (f17 / 2.0f)) * d10, f15 - ((f16 * d10) / 2.0d), (f11 - (f17 / 2.0f)) * d10);
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
