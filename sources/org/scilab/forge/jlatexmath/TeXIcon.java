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
    private Color fg;
    private Insets insets;
    public boolean isColored;
    private final float size;

    private static int sanitizePx(int i) {
        if (i < 0 || i > 4096) {
            return 4096;
        }
        return i;
    }

    protected TeXIcon(Box box, float f) {
        this(box, f, false);
    }

    protected TeXIcon(Box box, float f, boolean z) {
        this.insets = new Insets(0, 0, 0, 0);
        this.fg = null;
        this.isColored = false;
        this.box = box;
        float f2 = defaultSize;
        f = f2 != -1.0f ? f2 : f;
        float f3 = magFactor;
        if (f3 != 0.0f) {
            this.size = Math.abs(f3) * f;
        } else {
            this.size = f;
        }
        if (z) {
            return;
        }
        Insets insets = this.insets;
        int i = (int) (f * 0.18f);
        insets.top += i;
        insets.bottom += i;
        insets.left += i;
        insets.right += i;
    }

    public void setForeground(Color color) {
        this.fg = color;
    }

    public Insets getInsets() {
        return this.insets;
    }

    public void setInsets(Insets insets, boolean z) {
        this.insets = insets;
        if (z) {
            return;
        }
        int i = insets.top;
        float f = this.size;
        insets.top = i + ((int) (f * 0.18f));
        insets.bottom += (int) (f * 0.18f);
        insets.left += (int) (f * 0.18f);
        insets.right += (int) (f * 0.18f);
    }

    public void setInsets(Insets insets) {
        setInsets(insets, false);
    }

    public void setIconWidth(int i, int i2) {
        float iconWidth = i - getIconWidth();
        if (iconWidth > 0.0f) {
            Box box = this.box;
            this.box = new HorizontalBox(box, box.getWidth() + iconWidth, i2);
        }
    }

    public void setIconHeight(int i, int i2) {
        float iconHeight = i - getIconHeight();
        if (iconHeight > 0.0f) {
            this.box = new VerticalBox(this.box, iconHeight, i2);
        }
    }

    @Override
    public int getIconHeight() {
        return sanitizePx(((int) (((double) (this.box.getHeight() * this.size)) + 0.99d + ((double) this.insets.top))) + ((int) (((double) (this.box.getDepth() * this.size)) + 0.99d + ((double) this.insets.bottom))));
    }

    public int getIconDepth() {
        return sanitizePx((int) (((double) (this.box.getDepth() * this.size)) + 0.99d + ((double) this.insets.bottom)));
    }

    @Override
    public int getIconWidth() {
        double width = ((double) (this.box.getWidth() * this.size)) + 0.99d;
        Insets insets = this.insets;
        return sanitizePx((int) (width + ((double) insets.left) + ((double) insets.right)));
    }

    public float getTrueIconHeight() {
        return (this.box.getHeight() + this.box.getDepth()) * this.size;
    }

    public float getTrueIconDepth() {
        return this.box.getDepth() * this.size;
    }

    public float getTrueIconWidth() {
        return this.box.getWidth() * this.size;
    }

    public float getBaseLine() {
        double height = ((double) (this.box.getHeight() * this.size)) + 0.99d + ((double) this.insets.top);
        double height2 = ((double) ((this.box.getHeight() + this.box.getDepth()) * this.size)) + 0.99d;
        Insets insets = this.insets;
        return (float) (height / ((height2 + ((double) insets.top)) + ((double) insets.bottom)));
    }

    public Box getBox() {
        return this.box;
    }

    @Override
    public void paintIcon(Component component, Graphics graphics, int i, int i2) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        RenderingHints renderingHints = graphics2D.getRenderingHints();
        AffineTransform transform = graphics2D.getTransform();
        Color color = graphics2D.getColor();
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        float f = this.size;
        graphics2D.scale(f, f);
        Color color2 = this.fg;
        if (color2 != null) {
            graphics2D.setColor(color2);
        } else if (component != null) {
            graphics2D.setColor(component.getForeground());
        } else {
            graphics2D.setColor(defaultColor);
        }
        Box box = this.box;
        Insets insets = this.insets;
        float f2 = i + insets.left;
        float f3 = this.size;
        box.draw(graphics2D, f2 / f3, ((i2 + insets.top) / f3) + box.getHeight());
        graphics2D.setRenderingHints(renderingHints);
        graphics2D.setTransform(transform);
        graphics2D.setColor(color);
    }
}
