package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Color;
import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.geom.Rectangle2D;
public class HorizontalRule extends Box {
    private Color color;
    private float speShift;

    public HorizontalRule(float f10, float f11, float f12) {
        this.color = null;
        this.speShift = 0.0f;
        this.height = f10;
        this.width = f11;
        this.shift = f12;
    }

    @Override
    public void draw(Graphics2D graphics2D, float f10, float f11) {
        Color color = graphics2D.getColor();
        Color color2 = this.color;
        if (color2 != null) {
            graphics2D.setColor(color2);
        }
        float f12 = this.speShift;
        if (f12 == 0.0f) {
            float f13 = this.height;
            graphics2D.fill(new Rectangle2D.Float(f10, f11 - f13, this.width, f13));
        } else {
            float f14 = this.height;
            graphics2D.fill(new Rectangle2D.Float(f10, (f11 - f14) + f12, this.width, f14));
        }
        graphics2D.setColor(color);
    }

    @Override
    public int getLastFontId() {
        return -1;
    }

    public HorizontalRule(float f10, float f11, float f12, boolean z4) {
        this.color = null;
        this.speShift = 0.0f;
        this.height = f10;
        this.width = f11;
        if (z4) {
            this.shift = f12;
            return;
        }
        this.shift = 0.0f;
        this.speShift = f12;
    }

    public HorizontalRule(float f10, float f11, float f12, Color color) {
        this.speShift = 0.0f;
        this.height = f10;
        this.width = f11;
        this.color = color;
        this.shift = f12;
    }
}
