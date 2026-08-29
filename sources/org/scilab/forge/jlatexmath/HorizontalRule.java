package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Color;
import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.geom.Rectangle2D;
public class HorizontalRule extends Box {
    private Color color;
    private float speShift;

    public HorizontalRule(float f9, float f10, float f11) {
        this.color = null;
        this.speShift = 0.0f;
        this.height = f9;
        this.width = f10;
        this.shift = f11;
    }

    @Override
    public void draw(Graphics2D graphics2D, float f9, float f10) {
        Color color = graphics2D.getColor();
        Color color2 = this.color;
        if (color2 != null) {
            graphics2D.setColor(color2);
        }
        float f11 = this.speShift;
        if (f11 == 0.0f) {
            float f12 = this.height;
            graphics2D.fill(new Rectangle2D.Float(f9, f10 - f12, this.width, f12));
        } else {
            float f13 = this.height;
            graphics2D.fill(new Rectangle2D.Float(f9, (f10 - f13) + f11, this.width, f13));
        }
        graphics2D.setColor(color);
    }

    @Override
    public int getLastFontId() {
        return -1;
    }

    public HorizontalRule(float f9, float f10, float f11, boolean z10) {
        this.color = null;
        this.speShift = 0.0f;
        this.height = f9;
        this.width = f10;
        if (z10) {
            this.shift = f11;
            return;
        }
        this.shift = 0.0f;
        this.speShift = f11;
    }

    public HorizontalRule(float f9, float f10, float f11, Color color) {
        this.speShift = 0.0f;
        this.height = f9;
        this.width = f10;
        this.color = color;
        this.shift = f11;
    }
}
