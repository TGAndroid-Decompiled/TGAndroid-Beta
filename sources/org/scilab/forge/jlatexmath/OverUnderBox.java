package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.geom.AffineTransform;

public class OverUnderBox extends Box {
    private final Box base;
    private final Box del;
    private final float kern;
    private final boolean over;
    private final Box script;

    public OverUnderBox(Box box, Box box2, Box box3, float f10, boolean z10) {
        this.base = box;
        this.del = box2;
        this.script = box3;
        this.kern = f10;
        this.over = z10;
        this.width = box.getWidth();
        float f11 = 0.0f;
        this.height = box.height + (z10 ? box2.getWidth() : 0.0f) + ((!z10 || box3 == null) ? 0.0f : box3.height + box3.depth + f10);
        float width = box.depth + (z10 ? 0.0f : box2.getWidth());
        if (!z10 && box3 != null) {
            f11 = box3.height + box3.depth + f10;
        }
        this.depth = width + f11;
    }

    @Override
    public void draw(Graphics2D graphics2D, float f10, float f11) {
        drawDebug(graphics2D, f10, f11);
        this.base.draw(graphics2D, f10, f11);
        float width = (f11 - this.base.height) - this.del.getWidth();
        Box box = this.del;
        box.setDepth(this.del.getDepth() + box.getHeight());
        this.del.setHeight(0.0f);
        if (this.over) {
            Box box2 = this.del;
            double d = ((double) (box2.height + box2.depth)) * 0.75d;
            AffineTransform transform = graphics2D.getTransform();
            graphics2D.translate(d + ((double) f10), width);
            graphics2D.rotate(1.5707963267948966d);
            this.del.draw(graphics2D, 0.0f, 0.0f);
            graphics2D.setTransform(transform);
            Box box3 = this.script;
            if (box3 != null) {
                box3.draw(graphics2D, f10, (width - this.kern) - box3.depth);
            }
        }
        float f12 = f11 + this.base.depth;
        if (this.over) {
            return;
        }
        double height = ((double) (this.del.getHeight() + this.del.depth)) * 0.75d;
        AffineTransform transform2 = graphics2D.getTransform();
        graphics2D.translate(height + ((double) f10), f12);
        graphics2D.rotate(1.5707963267948966d);
        this.del.draw(graphics2D, 0.0f, 0.0f);
        graphics2D.setTransform(transform2);
        float width2 = this.del.getWidth() + f12;
        Box box4 = this.script;
        if (box4 != null) {
            box4.draw(graphics2D, f10, width2 + this.kern + box4.height);
        }
    }

    @Override
    public int getLastFontId() {
        return this.base.getLastFontId();
    }
}
