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

    public RotateBox(Box box, double d, float f10, float f11) {
        this.box = box;
        double d10 = (3.141592653589793d * d) / 180.0d;
        this.angle = d10;
        this.height = box.height;
        this.depth = box.depth;
        this.width = box.width;
        double dSin = Math.sin(d10);
        double dCos = Math.cos(this.angle);
        double d11 = f10;
        double d12 = 1.0d - dCos;
        double d13 = f11;
        this.shiftX = (float) ((d13 * dSin) + (d11 * d12));
        this.shiftY = (float) ((d13 * d12) - (d11 * dSin));
        float f12 = this.height;
        float f13 = this.depth;
        float f14 = this.width;
        this.xmax = ((float) Math.max(((double) (-f12)) * dSin, Math.max(((double) f13) * dSin, Math.max((((double) f13) * dSin) + (((double) f14) * dCos), (((double) f14) * dCos) - (((double) f12) * dSin))))) + this.shiftX;
        float f15 = this.height;
        float f16 = this.depth;
        float f17 = this.width;
        this.xmin = ((float) Math.min(((double) (-f15)) * dSin, Math.min(((double) f16) * dSin, Math.min((((double) f16) * dSin) + (((double) f17) * dCos), (((double) f17) * dCos) - (((double) f15) * dSin))))) + this.shiftX;
        float f18 = this.height;
        float f19 = this.depth;
        float f20 = this.width;
        this.ymax = (float) Math.max(((double) f18) * dCos, Math.max(((double) (-f19)) * dCos, Math.max((((double) f20) * dSin) - (((double) f19) * dCos), (((double) f18) * dCos) + (((double) f20) * dSin))));
        float f21 = this.height;
        float f22 = this.depth;
        float f23 = this.width;
        float fMin = (float) Math.min(((double) f21) * dCos, Math.min(((double) (-f22)) * dCos, Math.min((((double) f23) * dSin) - (((double) f22) * dCos), (((double) f21) * dCos) + (((double) f23) * dSin))));
        this.ymin = fMin;
        this.width = this.xmax - this.xmin;
        float f24 = this.ymax;
        float f25 = this.shiftY;
        this.height = f24 + f25;
        this.depth = (-fMin) - f25;
    }

    private static Point2D.Float calculateShift(Box box, int i10) {
        Point2D.Float r10 = new Point2D.Float(0.0f, -box.depth);
        switch (i10) {
            case 0:
                r10.f47639x = 0.0f;
                r10.f47640y = -box.depth;
                break;
            case 1:
                r10.f47639x = box.width / 2.0f;
                r10.f47640y = -box.depth;
                break;
            case 2:
                r10.f47639x = box.width;
                r10.f47640y = -box.depth;
                break;
            case 3:
                r10.f47639x = 0.0f;
                r10.f47640y = box.height;
                break;
            case 4:
                r10.f47639x = box.width / 2.0f;
                r10.f47640y = box.height;
                break;
            case 5:
                r10.f47639x = box.width;
                r10.f47640y = box.height;
                break;
            case 6:
                r10.f47639x = 0.0f;
                r10.f47640y = 0.0f;
                break;
            case 7:
                r10.f47639x = box.width;
                r10.f47640y = 0.0f;
                break;
            case 8:
                r10.f47639x = box.width / 2.0f;
                r10.f47640y = 0.0f;
                break;
            case 9:
                r10.f47639x = 0.0f;
                r10.f47640y = (box.height - box.depth) / 2.0f;
                break;
            case 10:
                r10.f47639x = box.width / 2.0f;
                r10.f47640y = (box.height - box.depth) / 2.0f;
                break;
            case 11:
                r10.f47639x = box.width;
                r10.f47640y = (box.height - box.depth) / 2.0f;
                break;
        }
        return r10;
    }

    public static int getOrigin(String str) {
        if (str == null || str.length() == 0) {
            return 6;
        }
        if (str.length() == 1) {
            str = str.concat("c");
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

    @Override
    public void draw(Graphics2D graphics2D, float f10, float f11) {
        drawDebug(graphics2D, f10, f11);
        this.box.drawDebug(graphics2D, f10, f11, true);
        float f12 = f11 - this.shiftY;
        float f13 = (this.shiftX - this.xmin) + f10;
        double d = f13;
        double d10 = f12;
        graphics2D.rotate(-this.angle, d, d10);
        this.box.draw(graphics2D, f13, f12);
        this.box.drawDebug(graphics2D, f13, f12, true);
        graphics2D.rotate(this.angle, d, d10);
    }

    @Override
    public int getLastFontId() {
        return this.box.getLastFontId();
    }

    public RotateBox(Box box, double d, Point2D.Float r10) {
        this(box, d, r10.f47639x, r10.f47640y);
    }

    public RotateBox(Box box, double d, int i10) {
        this(box, d, calculateShift(box, i10));
    }
}
