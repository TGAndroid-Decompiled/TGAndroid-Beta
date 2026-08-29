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

    public FcscoreBox(int i10, float f9, float f10, float f11, boolean z10) {
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 > 4096) {
            i10 = 4096;
        }
        this.N = i10;
        this.width = (2.0f * f11) + ((f10 + f11) * i10);
        this.height = f9;
        this.depth = 0.0f;
        this.strike = z10;
        this.space = f11;
        this.thickness = f10;
    }

    @Override
    public void draw(Graphics2D graphics2D, float f9, float f10) {
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
        float f11 = this.thickness / 2.0f;
        Line2D.Float r10 = new Line2D.Float();
        float f12 = this.space;
        float f13 = (float) (((f12 / 2.0f) * scaleX) + ((f9 + f12) * scaleX));
        int round = (int) Math.round((f12 + this.thickness) * scaleX);
        while (i10 < this.N) {
            double d = (f11 * scaleX) + f13;
            double d10 = scaleX;
            int i11 = round;
            r10.setLine(d, (f10 - this.height) * scaleX, d, f10 * d10);
            graphics2D.draw(r10);
            f13 += i11;
            i10++;
            round = i11;
            scaleX = d10;
        }
        double d11 = scaleX;
        float f14 = f13;
        if (this.strike) {
            float f15 = this.space;
            float f16 = this.height;
            r10.setLine((f9 + f15) * d11, (f10 - (f16 / 2.0f)) * d11, f14 - ((f15 * d11) / 2.0d), (f10 - (f16 / 2.0f)) * d11);
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
