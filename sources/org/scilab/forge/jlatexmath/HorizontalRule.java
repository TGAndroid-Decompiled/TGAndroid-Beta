package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Color;
import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.geom.Rectangle2D;

public class HorizontalRule extends Box {
    private Color color;
    private float speShift;

    @Override
    public int getLastFontId() {
        return -1;
    }

    public HorizontalRule(float f, float f2, float f3) {
        this.color = null;
        this.speShift = 0.0f;
        this.height = f;
        this.width = f2;
        this.shift = f3;
    }

    public HorizontalRule(float f, float f2, float f3, boolean z) {
        this.color = null;
        this.speShift = 0.0f;
        this.height = f;
        this.width = f2;
        if (z) {
            this.shift = f3;
        } else {
            this.shift = 0.0f;
            this.speShift = f3;
        }
    }

    @Override
    public void draw(Graphics2D graphics2D, float f, float f2) {
        Color color = graphics2D.getColor();
        Color color2 = this.color;
        if (color2 != null) {
            graphics2D.setColor(color2);
        }
        float f3 = this.speShift;
        if (f3 == 0.0f) {
            float f4 = this.height;
            graphics2D.fill(new Rectangle2D.Float(f, f2 - f4, this.width, f4));
        } else {
            float f5 = this.height;
            graphics2D.fill(new Rectangle2D.Float(f, (f2 - f5) + f3, this.width, f5));
        }
        graphics2D.setColor(color);
    }
}
