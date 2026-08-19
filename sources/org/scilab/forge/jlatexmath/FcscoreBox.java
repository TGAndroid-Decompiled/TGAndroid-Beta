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

    @Override
    public int getLastFontId() {
        return -1;
    }

    public FcscoreBox(int i, float f, float f2, float f3, boolean z) {
        if (i < 0) {
            i = 0;
        } else if (i > 4096) {
            i = 4096;
        }
        this.N = i;
        this.width = (i * (f2 + f3)) + (2.0f * f3);
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
            AffineTransform affineTransformClone = transform.clone();
            affineTransformClone.scale(1.0d / scaleX, 1.0d / scaleY);
            graphics2D.setTransform(affineTransformClone);
        } else {
            scaleX = 1.0d;
        }
        int i = 0;
        graphics2D.setStroke(new BasicStroke((float) (((double) this.thickness) * scaleX), 0, 0));
        float f3 = this.thickness / 2.0f;
        Line2D.Float r10 = new Line2D.Float();
        float f4 = this.space;
        float f5 = (float) ((((double) (f + f4)) * scaleX) + (((double) (f4 / 2.0f)) * scaleX));
        int iRound = (int) Math.round(((double) (f4 + this.thickness)) * scaleX);
        while (i < this.N) {
            double d = ((double) f5) + (((double) f3) * scaleX);
            double d2 = scaleX;
            int i2 = iRound;
            r10.setLine(d, ((double) (f2 - this.height)) * scaleX, d, ((double) f2) * d2);
            graphics2D.draw(r10);
            f5 += i2;
            i++;
            iRound = i2;
            scaleX = d2;
        }
        double d3 = scaleX;
        float f6 = f5;
        if (this.strike) {
            float f7 = this.space;
            float f8 = this.height;
            r10.setLine(((double) (f + f7)) * d3, ((double) (f2 - (f8 / 2.0f))) * d3, ((double) f6) - ((((double) f7) * d3) / 2.0d), ((double) (f2 - (f8 / 2.0f))) * d3);
            graphics2D.draw(r10);
        }
        graphics2D.setTransform(transform);
        graphics2D.setStroke(stroke);
    }
}
