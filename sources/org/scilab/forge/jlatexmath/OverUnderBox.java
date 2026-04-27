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
        this.base = box;
        this.del = box2;
        this.script = box3;
        this.kern = f;
        this.over = z;
        this.width = box.getWidth();
        float f2 = 0.0f;
        this.height = box.height + (z ? box2.getWidth() : 0.0f) + ((!z || box3 == null) ? 0.0f : box3.height + box3.depth + f);
        float width = box.depth + (z ? 0.0f : box2.getWidth());
        if (!z && box3 != null) {
            f2 = box3.height + box3.depth + f;
        }
        this.depth = width + f2;
    }

    @Override
    public void draw(Graphics2D graphics2D, float f, float f2) {
        drawDebug(graphics2D, f, f2);
        this.base.draw(graphics2D, f, f2);
        float width = (f2 - this.base.height) - this.del.getWidth();
        Box box = this.del;
        box.setDepth(box.getHeight() + this.del.getDepth());
        this.del.setHeight(0.0f);
        if (this.over) {
            Box box2 = this.del;
            AffineTransform transform = graphics2D.getTransform();
            graphics2D.translate(f + ((box2.height + box2.depth) * 0.75d), width);
            graphics2D.rotate(1.5707963267948966d);
            this.del.draw(graphics2D, 0.0f, 0.0f);
            graphics2D.setTransform(transform);
            Box box3 = this.script;
            if (box3 != null) {
                box3.draw(graphics2D, f, (width - this.kern) - box3.depth);
            }
        }
        float f3 = f2 + this.base.depth;
        if (this.over) {
            return;
        }
        AffineTransform transform2 = graphics2D.getTransform();
        graphics2D.translate(f + ((this.del.getHeight() + this.del.depth) * 0.75d), f3);
        graphics2D.rotate(1.5707963267948966d);
        this.del.draw(graphics2D, 0.0f, 0.0f);
        graphics2D.setTransform(transform2);
        float width2 = f3 + this.del.getWidth();
        Box box4 = this.script;
        if (box4 != null) {
            box4.draw(graphics2D, f, width2 + this.kern + box4.height);
        }
    }

    @Override
    public int getLastFontId() {
        return this.base.getLastFontId();
    }
}
