package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Color;
import ru.noties.jlatexmath.awt.Component;
import ru.noties.jlatexmath.awt.Graphics;
import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.Insets;
import ru.noties.jlatexmath.awt.RenderingHints;
import ru.noties.jlatexmath.awt.geom.AffineTransform;
import ru.noties.jlatexmath.swing.Icon;
public class TeXIcon implements Icon {
    private static final int MAX_PIXELS = 4096;
    private static final Color defaultColor = new Color(0, 0, 0);
    public static float defaultSize = -1.0f;
    public static float magFactor = 0.0f;
    private Box box;
    private Color f19631fg;
    private Insets insets;
    public boolean isColored;
    private final float size;

    public TeXIcon(Box box, float f10) {
        this(box, f10, false);
    }

    private static int sanitizePx(int i9) {
        if (i9 < 0 || i9 > 4096) {
            return 4096;
        }
        return i9;
    }

    public float getBaseLine() {
        double height = (this.box.getHeight() * this.size) + 0.99d + this.insets.top;
        float height2 = this.box.getHeight();
        Insets insets = this.insets;
        return (float) (height / (((((this.box.getDepth() + height2) * this.size) + 0.99d) + insets.top) + insets.bottom));
    }

    public Box getBox() {
        return this.box;
    }

    public int getIconDepth() {
        return sanitizePx((int) ((this.box.getDepth() * this.size) + 0.99d + this.insets.bottom));
    }

    @Override
    public int getIconHeight() {
        return sanitizePx(((int) ((this.box.getHeight() * this.size) + 0.99d + this.insets.top)) + ((int) ((this.box.getDepth() * this.size) + 0.99d + this.insets.bottom)));
    }

    @Override
    public int getIconWidth() {
        Insets insets = this.insets;
        return sanitizePx((int) ((this.box.getWidth() * this.size) + 0.99d + insets.left + insets.right));
    }

    public Insets getInsets() {
        return this.insets;
    }

    public float getTrueIconDepth() {
        return this.box.getDepth() * this.size;
    }

    public float getTrueIconHeight() {
        return (this.box.getDepth() + this.box.getHeight()) * this.size;
    }

    public float getTrueIconWidth() {
        return this.box.getWidth() * this.size;
    }

    @Override
    public void paintIcon(Component component, Graphics graphics, int i9, int i10) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        RenderingHints renderingHints = graphics2D.getRenderingHints();
        AffineTransform transform = graphics2D.getTransform();
        Color color = graphics2D.getColor();
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        float f10 = this.size;
        graphics2D.scale(f10, f10);
        Color color2 = this.f19631fg;
        if (color2 != null) {
            graphics2D.setColor(color2);
        } else if (component != null) {
            graphics2D.setColor(component.getForeground());
        } else {
            graphics2D.setColor(defaultColor);
        }
        Box box = this.box;
        Insets insets = this.insets;
        float f11 = this.size;
        box.draw(graphics2D, (i9 + insets.left) / f11, box.getHeight() + ((i10 + insets.top) / f11));
        graphics2D.setRenderingHints(renderingHints);
        graphics2D.setTransform(transform);
        graphics2D.setColor(color);
    }

    public void setForeground(Color color) {
        this.f19631fg = color;
    }

    public void setIconHeight(int i9, int i10) {
        float iconHeight = i9 - getIconHeight();
        if (iconHeight > 0.0f) {
            this.box = new VerticalBox(this.box, iconHeight, i10);
        }
    }

    public void setIconWidth(int i9, int i10) {
        float iconWidth = i9 - getIconWidth();
        if (iconWidth > 0.0f) {
            Box box = this.box;
            this.box = new HorizontalBox(box, box.getWidth() + iconWidth, i10);
        }
    }

    public void setInsets(Insets insets, boolean z10) {
        this.insets = insets;
        if (z10) {
            return;
        }
        int i9 = insets.top;
        float f10 = this.size;
        insets.top = i9 + ((int) (f10 * 0.18f));
        insets.bottom += (int) (f10 * 0.18f);
        insets.left += (int) (f10 * 0.18f);
        insets.right += (int) (f10 * 0.18f);
    }

    public TeXIcon(Box box, float f10, boolean z10) {
        this.insets = new Insets(0, 0, 0, 0);
        this.f19631fg = null;
        this.isColored = false;
        this.box = box;
        float f11 = defaultSize;
        f10 = f11 != -1.0f ? f11 : f10;
        float f12 = magFactor;
        if (f12 != 0.0f) {
            this.size = Math.abs(f12) * f10;
        } else {
            this.size = f10;
        }
        if (z10) {
            return;
        }
        Insets insets = this.insets;
        int i9 = (int) (f10 * 0.18f);
        insets.top += i9;
        insets.bottom += i9;
        insets.left += i9;
        insets.right += i9;
    }

    public void setInsets(Insets insets) {
        setInsets(insets, false);
    }
}
