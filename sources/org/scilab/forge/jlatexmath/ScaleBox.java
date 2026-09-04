package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Graphics2D;
public class ScaleBox extends Box {
    private Box box;
    private double xscl;
    private double yscl;

    public ScaleBox(Box box, double d, double d10) {
        this.box = box;
        this.xscl = (Double.isNaN(d) || Double.isInfinite(d)) ? 0.0d : d;
        this.yscl = (Double.isNaN(d10) || Double.isInfinite(d10)) ? 0.0d : d10;
        this.width = box.width * ((float) Math.abs(this.xscl));
        double d11 = this.yscl;
        this.height = (d11 > 0.0d ? box.height : -box.depth) * ((float) d11);
        this.depth = (d11 > 0.0d ? box.depth : -box.height) * ((float) d11);
        this.shift = box.shift * ((float) d11);
    }

    @Override
    public void draw(Graphics2D graphics2D, float f7, float f10) {
        float f11;
        drawDebug(graphics2D, f7, f10);
        double d = this.xscl;
        if (d != 0.0d && this.yscl != 0.0d) {
            if (d < 0.0d) {
                f11 = this.width;
            } else {
                f11 = 0.0f;
            }
            graphics2D.translate(f7 + f11, f10);
            graphics2D.scale(this.xscl, this.yscl);
            this.box.draw(graphics2D, 0.0f, 0.0f);
            graphics2D.scale(1.0d / this.xscl, 1.0d / this.yscl);
            graphics2D.translate((-f7) - f11, -f10);
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
