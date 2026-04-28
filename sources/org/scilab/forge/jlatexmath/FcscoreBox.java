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
        Graphics2D graphics2D2;
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
        graphics2D.setStroke(new BasicStroke((float) (this.thickness * scaleX), 0, 0));
        float f3 = this.thickness / 2.0f;
        Line2D.Float r15 = new Line2D.Float();
        float f4 = this.space;
        int iRound = (int) Math.round((f4 + this.thickness) * scaleX);
        float f5 = (float) (((f + f4) * scaleX) + ((f4 / 2.0f) * scaleX));
        while (i < this.N) {
            double d = (f3 * scaleX) + f5;
            float f6 = f3;
            int i2 = iRound;
            AffineTransform affineTransform = transform;
            Line2D.Float r3 = r15;
            r15.setLine(d, (f2 - this.height) * scaleX, d, f2 * scaleX);
            graphics2D.draw(r3);
            f5 += i2;
            i++;
            r15 = r3;
            iRound = i2;
            f3 = f6;
            stroke = stroke;
            transform = affineTransform;
        }
        AffineTransform affineTransform2 = transform;
        Stroke stroke2 = stroke;
        float f7 = f5;
        Line2D.Float r32 = r15;
        if (this.strike) {
            float f8 = this.space;
            float f9 = this.height;
            r32.setLine((f + f8) * scaleX, (f2 - (f9 / 2.0f)) * scaleX, f7 - ((f8 * scaleX) / 2.0d), (f2 - (f9 / 2.0f)) * scaleX);
            graphics2D2 = graphics2D;
            graphics2D2.draw(r32);
        } else {
            graphics2D2 = graphics2D;
        }
        graphics2D2.setTransform(affineTransform2);
        graphics2D2.setStroke(stroke2);
    }
}
