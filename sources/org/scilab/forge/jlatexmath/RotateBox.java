package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.geom.Point2D;

public class RotateBox extends Box {
    public static final int BBC = 8;
    public static final int BBL = 6;
    public static final int BBR = 7;
    public static final int BC = 1;
    public static final int BL = 0;
    public static final int BR = 2;
    public static final int CC = 10;
    public static final int CL = 9;
    public static final int CR = 11;
    public static final int TC = 4;
    public static final int TL = 3;
    public static final int TR = 5;
    protected double angle;
    private Box box;
    private float shiftX;
    private float shiftY;
    private float xmax;
    private float xmin;
    private float ymax;
    private float ymin;

    public RotateBox(Box box, double d, float f, float f2) {
        this.box = box;
        double d2 = (3.141592653589793d * d) / 180.0d;
        this.angle = d2;
        this.height = box.height;
        this.depth = box.depth;
        this.width = box.width;
        double dSin = Math.sin(d2);
        double dCos = Math.cos(this.angle);
        double d3 = f;
        double d4 = 1.0d - dCos;
        double d5 = f2;
        this.shiftX = (float) ((d3 * d4) + (d5 * dSin));
        this.shiftY = (float) ((d5 * d4) - (d3 * dSin));
        float f3 = this.height;
        float f4 = this.depth;
        float f5 = this.width;
        this.xmax = ((float) Math.max((-f3) * dSin, Math.max(f4 * dSin, Math.max((f5 * dCos) + (f4 * dSin), (f5 * dCos) - (f3 * dSin))))) + this.shiftX;
        float f6 = this.height;
        float f7 = this.depth;
        float f8 = this.width;
        this.xmin = ((float) Math.min((-f6) * dSin, Math.min(f7 * dSin, Math.min((f8 * dCos) + (f7 * dSin), (f8 * dCos) - (f6 * dSin))))) + this.shiftX;
        float f9 = this.height;
        float f10 = this.depth;
        float f11 = this.width;
        this.ymax = (float) Math.max(f9 * dCos, Math.max((-f10) * dCos, Math.max((f11 * dSin) - (f10 * dCos), (f11 * dSin) + (f9 * dCos))));
        float f12 = this.height;
        float f13 = this.depth;
        float f14 = this.width;
        float fMin = (float) Math.min(f12 * dCos, Math.min((-f13) * dCos, Math.min((f14 * dSin) - (f13 * dCos), (f14 * dSin) + (f12 * dCos))));
        this.ymin = fMin;
        this.width = this.xmax - this.xmin;
        float f15 = this.ymax;
        float f16 = this.shiftY;
        this.height = f15 + f16;
        this.depth = (-fMin) - f16;
    }

    public RotateBox(Box box, double d, Point2D.Float r10) {
        this(box, d, r10.x, r10.y);
    }

    public RotateBox(Box box, double d, int i) {
        this(box, d, calculateShift(box, i));
    }

    public static int getOrigin(String str) {
        if (str == null || str.length() == 0) {
            return 6;
        }
        if (str.length() == 1) {
            str = str + "c";
        }
        if (str.equals("bl") || str.equals("lb")) {
            return 0;
        }
        if (str.equals("bc") || str.equals("cb")) {
            return 1;
        }
        if (str.equals("br") || str.equals("rb")) {
            return 2;
        }
        if (str.equals("cl") || str.equals("lc")) {
            return 9;
        }
        if (str.equals("cc")) {
            return 10;
        }
        if (str.equals("cr") || str.equals("cr")) {
            return 11;
        }
        if (str.equals("tl") || str.equals("lt")) {
            return 3;
        }
        if (str.equals("tc") || str.equals("ct")) {
            return 4;
        }
        if (str.equals("tr") || str.equals("rt")) {
            return 5;
        }
        if (str.equals("Bl") || str.equals("lB")) {
            return 6;
        }
        if (str.equals("Bc") || str.equals("cB")) {
            return 8;
        }
        return (str.equals("Br") || str.equals("rB")) ? 7 : 6;
    }

    private static Point2D.Float calculateShift(Box box, int i) {
        Point2D.Float r0 = new Point2D.Float(0.0f, -box.depth);
        switch (i) {
            case 0:
                r0.x = 0.0f;
                r0.y = -box.depth;
                return r0;
            case 1:
                r0.x = box.width / 2.0f;
                r0.y = -box.depth;
                return r0;
            case 2:
                r0.x = box.width;
                r0.y = -box.depth;
                return r0;
            case 3:
                r0.x = 0.0f;
                r0.y = box.height;
                return r0;
            case 4:
                r0.x = box.width / 2.0f;
                r0.y = box.height;
                return r0;
            case 5:
                r0.x = box.width;
                r0.y = box.height;
                return r0;
            case 6:
                r0.x = 0.0f;
                r0.y = 0.0f;
                return r0;
            case 7:
                r0.x = box.width;
                r0.y = 0.0f;
                return r0;
            case 8:
                r0.x = box.width / 2.0f;
                r0.y = 0.0f;
                return r0;
            case 9:
                r0.x = 0.0f;
                r0.y = (box.height - box.depth) / 2.0f;
                return r0;
            case 10:
                r0.x = box.width / 2.0f;
                r0.y = (box.height - box.depth) / 2.0f;
                return r0;
            case 11:
                r0.x = box.width;
                r0.y = (box.height - box.depth) / 2.0f;
                return r0;
            default:
                return r0;
        }
    }

    @Override
    public void draw(Graphics2D graphics2D, float f, float f2) {
        drawDebug(graphics2D, f, f2);
        this.box.drawDebug(graphics2D, f, f2, true);
        float f3 = f2 - this.shiftY;
        float f4 = f + (this.shiftX - this.xmin);
        double d = f4;
        double d2 = f3;
        graphics2D.rotate(-this.angle, d, d2);
        this.box.draw(graphics2D, f4, f3);
        this.box.drawDebug(graphics2D, f4, f3, true);
        graphics2D.rotate(this.angle, d, d2);
    }

    @Override
    public int getLastFontId() {
        return this.box.getLastFontId();
    }
}
