package org.scilab.forge.jlatexmath;

import java.util.LinkedList;
import ru.noties.jlatexmath.awt.BasicStroke;
import ru.noties.jlatexmath.awt.Color;
import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.Stroke;
import ru.noties.jlatexmath.awt.geom.Rectangle2D;
public abstract class Box {
    public static boolean DEBUG = false;
    private static final int MAX_BOX_BUDGET = 100000;
    private static int boxBudgetUsed;
    protected Color background;
    protected LinkedList<Box> children;
    protected float depth;
    protected Box elderParent;
    protected Color foreground;
    protected float height;
    protected Color markForDEBUG;
    protected Box parent;
    private Color prevColor;
    protected float shift;
    protected int type;
    protected float width;

    public Box() {
        this(null, null);
    }

    private static void countBoxAllocation() {
        int i10 = boxBudgetUsed + 1;
        boxBudgetUsed = i10;
        if (i10 <= 100000) {
            return;
        }
        throw new ParseException("Formula is too large to lay out!");
    }

    public static void resetBoxBudget() {
        boxBudgetUsed = 0;
    }

    public void add(Box box) {
        countBoxAllocation();
        this.children.add(box);
        box.parent = this;
        box.elderParent = this.elderParent;
    }

    public abstract void draw(Graphics2D graphics2D, float f7, float f10);

    public void drawDebug(Graphics2D graphics2D, float f7, float f10, boolean z10) {
        if (DEBUG) {
            Stroke stroke = graphics2D.getStroke();
            if (this.markForDEBUG != null) {
                Color color = graphics2D.getColor();
                graphics2D.setColor(this.markForDEBUG);
                float f11 = this.height;
                graphics2D.fill(new Rectangle2D.Float(f7, f10 - f11, this.width, f11 + this.depth));
                graphics2D.setColor(color);
            }
            graphics2D.setStroke(new BasicStroke((float) Math.abs(1.0d / graphics2D.getTransform().getScaleX()), 0, 0));
            float f12 = this.width;
            if (f12 < 0.0f) {
                f7 += f12;
                this.width = -f12;
            }
            float f13 = this.height;
            graphics2D.draw(new Rectangle2D.Float(f7, f10 - f13, this.width, f13 + this.depth));
            if (z10) {
                Color color2 = graphics2D.getColor();
                graphics2D.setColor(Color.RED);
                float f14 = this.depth;
                if (f14 > 0.0f) {
                    graphics2D.fill(new Rectangle2D.Float(f7, f10, this.width, f14));
                    graphics2D.setColor(color2);
                    graphics2D.draw(new Rectangle2D.Float(f7, f10, this.width, this.depth));
                } else if (f14 < 0.0f) {
                    graphics2D.fill(new Rectangle2D.Float(f7, f10 + f14, this.width, -f14));
                    graphics2D.setColor(color2);
                    float f15 = this.depth;
                    graphics2D.draw(new Rectangle2D.Float(f7, f10 + f15, this.width, -f15));
                } else {
                    graphics2D.setColor(color2);
                }
            }
            graphics2D.setStroke(stroke);
        }
    }

    public void endDraw(Graphics2D graphics2D) {
        graphics2D.setColor(this.prevColor);
    }

    public float getDepth() {
        return this.depth;
    }

    public Box getElderParent() {
        return this.elderParent;
    }

    public float getHeight() {
        return this.height;
    }

    public abstract int getLastFontId();

    public Box getParent() {
        return this.parent;
    }

    public float getShift() {
        return this.shift;
    }

    public float getWidth() {
        return this.width;
    }

    public void negWidth() {
        this.width = -this.width;
    }

    public void setDepth(float f7) {
        this.depth = f7;
    }

    public void setElderParent(Box box) {
        this.elderParent = box;
    }

    public void setHeight(float f7) {
        this.height = f7;
    }

    public void setParent(Box box) {
        this.parent = box;
    }

    public void setShift(float f7) {
        this.shift = f7;
    }

    public void setWidth(float f7) {
        this.width = f7;
    }

    public void startDraw(Graphics2D graphics2D, float f7, float f10) {
        this.prevColor = graphics2D.getColor();
        Color color = this.background;
        if (color != null) {
            graphics2D.setColor(color);
            float f11 = this.height;
            graphics2D.fill(new Rectangle2D.Float(f7, f10 - f11, this.width, f11 + this.depth));
        }
        Color color2 = this.foreground;
        if (color2 == null) {
            graphics2D.setColor(this.prevColor);
        } else {
            graphics2D.setColor(color2);
        }
        drawDebug(graphics2D, f7, f10);
    }

    public Box(Color color, Color color2) {
        this.width = 0.0f;
        this.height = 0.0f;
        this.depth = 0.0f;
        this.shift = 0.0f;
        this.type = -1;
        this.children = new LinkedList<>();
        countBoxAllocation();
        this.foreground = color;
        this.background = color2;
    }

    public void add(int i10, Box box) {
        countBoxAllocation();
        this.children.add(i10, box);
        box.parent = this;
        box.elderParent = this.elderParent;
    }

    public void drawDebug(Graphics2D graphics2D, float f7, float f10) {
        if (DEBUG) {
            drawDebug(graphics2D, f7, f10, true);
        }
    }
}
