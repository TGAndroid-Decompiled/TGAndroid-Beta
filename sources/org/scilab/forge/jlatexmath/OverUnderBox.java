package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.geom.AffineTransform;
public class OverUnderBox extends Box {
    private final Box base;
    private final Box del;
    private final float kern;
    private final boolean over;
    private final Box script;

    public OverUnderBox(Box box, Box box2, Box box3, float f, boolean z) {
        float f2;
        float f3;
        float width;
        this.base = box;
        this.del = box2;
        this.script = box3;
        this.kern = f;
        this.over = z;
        this.width = box.getWidth();
        float f4 = box.height;
        float f5 = 0.0f;
        if (z) {
            f2 = box2.getWidth();
        } else {
            f2 = 0.0f;
        }
        float f6 = f4 + f2;
        if (z && box3 != null) {
            f3 = box3.height + box3.depth + f;
        } else {
            f3 = 0.0f;
        }
        this.height = f6 + f3;
        float f7 = box.depth;
        if (z) {
            width = 0.0f;
        } else {
            width = box2.getWidth();
        }
        float f8 = f7 + width;
        if (!z && box3 != null) {
            f5 = box3.height + box3.depth + f;
        }
        this.depth = f8 + f5;
    }

    @Override
    public void draw(Graphics2D graphics2D, float f, float f2) {
        drawDebug(graphics2D, f, f2);
        this.base.draw(graphics2D, f, f2);
        float width = (f2 - this.base.height) - this.del.getWidth();
        Box box = this.del;
        box.setDepth(this.del.getDepth() + box.getHeight());
        this.del.setHeight(0.0f);
        if (this.over) {
            Box box2 = this.del;
            double d = (box2.height + box2.depth) * 0.75d;
            AffineTransform transform = graphics2D.getTransform();
            graphics2D.translate(d + f, width);
            graphics2D.rotate(1.5707963267948966d);
            this.del.draw(graphics2D, 0.0f, 0.0f);
            graphics2D.setTransform(transform);
            Box box3 = this.script;
            if (box3 != null) {
                box3.draw(graphics2D, f, (width - this.kern) - box3.depth);
            }
        }
        float f3 = f2 + this.base.depth;
        if (!this.over) {
            double height = (this.del.getHeight() + this.del.depth) * 0.75d;
            AffineTransform transform2 = graphics2D.getTransform();
            graphics2D.translate(height + f, f3);
            graphics2D.rotate(1.5707963267948966d);
            this.del.draw(graphics2D, 0.0f, 0.0f);
            graphics2D.setTransform(transform2);
            float width2 = this.del.getWidth() + f3;
            Box box4 = this.script;
            if (box4 != null) {
                box4.draw(graphics2D, f, width2 + this.kern + box4.height);
            }
        }
    }

    @Override
    public int getLastFontId() {
        return this.base.getLastFontId();
    }
}
