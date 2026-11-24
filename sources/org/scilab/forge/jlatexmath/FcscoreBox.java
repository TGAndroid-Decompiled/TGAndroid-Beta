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

    public FcscoreBox(int i, float f, float f2, float f3, boolean z) {
        if (i < 0) {
            i = 0;
        } else if (i > 4096) {
            i = 4096;
        }
        this.N = i;
        this.width = (2.0f * f3) + ((f2 + f3) * i);
        this.height = f;
        this.depth = 0.0f;
        this.strike = z;
        this.space = f3;
        this.thickness = f2;
    }

    @Override
    public void draw(Graphics2D graphics2D, float f, float f2) {
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
        int i = 0;
        graphics2D.setStroke(new BasicStroke((float) (this.thickness * scaleX), 0, 0));
        float f3 = 2.0f;
        float f4 = this.thickness / 2.0f;
        Line2D.Float r10 = new Line2D.Float();
        float f5 = this.space;
        float f6 = (float) (((f5 / 2.0f) * scaleX) + ((f + f5) * scaleX));
        int round = (int) Math.round((f5 + this.thickness) * scaleX);
        while (i < this.N) {
            float f7 = f3;
            double d = (f4 * scaleX) + f6;
            double d2 = scaleX;
            int i2 = round;
            r10.setLine(d, (f2 - this.height) * scaleX, d, f2 * d2);
            graphics2D.draw(r10);
            f6 += i2;
            i++;
            round = i2;
            f3 = f7;
            scaleX = d2;
        }
        double d3 = scaleX;
        float f8 = f3;
        float f9 = f6;
        if (this.strike) {
            float f10 = this.space;
            float f11 = this.height;
            r10.setLine((f + f10) * d3, (f2 - (f11 / f8)) * d3, f9 - ((f10 * d3) / 2.0d), (f2 - (f11 / f8)) * d3);
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
