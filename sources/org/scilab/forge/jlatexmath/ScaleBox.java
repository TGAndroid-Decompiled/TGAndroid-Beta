package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Graphics2D;
public class ScaleBox extends Box {
    private Box box;
    private double xscl;
    private double yscl;

    public ScaleBox(Box box, double d, double d2) {
        float f;
        float f2;
        this.box = box;
        this.xscl = (Double.isNaN(d) || Double.isInfinite(d)) ? 0.0d : d;
        this.yscl = (Double.isNaN(d2) || Double.isInfinite(d2)) ? 0.0d : d2;
        this.width = box.width * ((float) Math.abs(this.xscl));
        double d3 = this.yscl;
        if (d3 > 0.0d) {
            f = box.height;
        } else {
            f = -box.depth;
        }
        this.height = f * ((float) d3);
        if (d3 > 0.0d) {
            f2 = box.depth;
        } else {
            f2 = -box.height;
        }
        this.depth = f2 * ((float) d3);
        this.shift = box.shift * ((float) d3);
    }

    @Override
    public void draw(Graphics2D graphics2D, float f, float f2) {
        float f3;
        drawDebug(graphics2D, f, f2);
        double d = this.xscl;
        if (d != 0.0d && this.yscl != 0.0d) {
            if (d < 0.0d) {
                f3 = this.width;
            } else {
                f3 = 0.0f;
            }
            graphics2D.translate(f + f3, f2);
            graphics2D.scale(this.xscl, this.yscl);
            this.box.draw(graphics2D, 0.0f, 0.0f);
            graphics2D.scale(1.0d / this.xscl, 1.0d / this.yscl);
            graphics2D.translate((-f) - f3, -f2);
        }
    }

    @Override
    public int getLastFontId() {
        return this.box.getLastFontId();
    }

    public ScaleBox(org.scilab.forge.jlatexmath.Box r7, float r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.scilab.forge.jlatexmath.ScaleBox.<init>(org.scilab.forge.jlatexmath.Box, float):void");
    }
}
