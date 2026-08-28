package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Graphics2D;
public class ScaleBox extends Box {
    private Box box;
    private double xscl;
    private double yscl;

    public ScaleBox(Box box, double d, double d9) {
        this.box = box;
        this.xscl = (Double.isNaN(d) || Double.isInfinite(d)) ? 0.0d : d;
        this.yscl = (Double.isNaN(d9) || Double.isInfinite(d9)) ? 0.0d : d9;
        this.width = box.width * ((float) Math.abs(this.xscl));
        double d10 = this.yscl;
        this.height = (d10 > 0.0d ? box.height : -box.depth) * ((float) d10);
        this.depth = (d10 > 0.0d ? box.depth : -box.height) * ((float) d10);
        this.shift = box.shift * ((float) d10);
    }

    @Override
    public void draw(Graphics2D graphics2D, float f10, float f11) {
        float f12;
        drawDebug(graphics2D, f10, f11);
        double d = this.xscl;
        if (d != 0.0d && this.yscl != 0.0d) {
            if (d < 0.0d) {
                f12 = this.width;
            } else {
                f12 = 0.0f;
            }
            graphics2D.translate(f10 + f12, f11);
            graphics2D.scale(this.xscl, this.yscl);
            this.box.draw(graphics2D, 0.0f, 0.0f);
            graphics2D.scale(1.0d / this.xscl, 1.0d / this.yscl);
            graphics2D.translate((-f10) - f12, -f11);
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
