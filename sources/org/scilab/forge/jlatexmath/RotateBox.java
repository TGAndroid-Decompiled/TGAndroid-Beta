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
        double d9 = (3.141592653589793d * d) / 180.0d;
        this.angle = d9;
        this.height = box.height;
        this.depth = box.depth;
        this.width = box.width;
        double sin = Math.sin(d9);
        double cos = Math.cos(this.angle);
        double d10 = f10;
        double d11 = 1.0d - cos;
        double d12 = f11;
        this.shiftX = (float) ((d12 * sin) + (d10 * d11));
        this.shiftY = (float) ((d12 * d11) - (d10 * sin));
        float f12 = this.height;
        float f13 = this.depth;
        float f14 = this.width;
        this.xmax = ((float) Math.max((-f12) * sin, Math.max(f13 * sin, Math.max((f13 * sin) + (f14 * cos), (f14 * cos) - (f12 * sin))))) + this.shiftX;
        float f15 = this.height;
        float f16 = this.depth;
        float f17 = this.width;
        this.xmin = ((float) Math.min((-f15) * sin, Math.min(f16 * sin, Math.min((f16 * sin) + (f17 * cos), (f17 * cos) - (f15 * sin))))) + this.shiftX;
        float f18 = this.height;
        float f19 = this.depth;
        float f20 = this.width;
        this.ymax = (float) Math.max(f18 * cos, Math.max((-f19) * cos, Math.max((f20 * sin) - (f19 * cos), (f18 * cos) + (f20 * sin))));
        float f21 = this.height;
        float f22 = this.depth;
        float f23 = this.width;
        float min = (float) Math.min(f21 * cos, Math.min((-f22) * cos, Math.min((f23 * sin) - (f22 * cos), (f21 * cos) + (f23 * sin))));
        this.ymin = min;
        this.width = this.xmax - this.xmin;
        float f24 = this.ymax;
        float f25 = this.shiftY;
        this.height = f24 + f25;
        this.depth = (-min) - f25;
    }

    private static Point2D.Float calculateShift(Box box, int i9) {
        Point2D.Float r02 = new Point2D.Float(0.0f, -box.depth);
        switch (i9) {
            case 0:
                r02.f47274x = 0.0f;
                r02.f47275y = -box.depth;
                return r02;
            case 1:
                r02.f47274x = box.width / 2.0f;
                r02.f47275y = -box.depth;
                return r02;
            case 2:
                r02.f47274x = box.width;
                r02.f47275y = -box.depth;
                return r02;
            case 3:
                r02.f47274x = 0.0f;
                r02.f47275y = box.height;
                return r02;
            case 4:
                r02.f47274x = box.width / 2.0f;
                r02.f47275y = box.height;
                return r02;
            case 5:
                r02.f47274x = box.width;
                r02.f47275y = box.height;
                return r02;
            case 6:
                r02.f47274x = 0.0f;
                r02.f47275y = 0.0f;
                return r02;
            case 7:
                r02.f47274x = box.width;
                r02.f47275y = 0.0f;
                return r02;
            case 8:
                r02.f47274x = box.width / 2.0f;
                r02.f47275y = 0.0f;
                return r02;
            case 9:
                r02.f47274x = 0.0f;
                r02.f47275y = (box.height - box.depth) / 2.0f;
                return r02;
            case 10:
                r02.f47274x = box.width / 2.0f;
                r02.f47275y = (box.height - box.depth) / 2.0f;
                return r02;
            case 11:
                r02.f47274x = box.width;
                r02.f47275y = (box.height - box.depth) / 2.0f;
                return r02;
            default:
                return r02;
        }
    }

    public static int getOrigin(String str) {
        if (str == null || str.length() == 0) {
            return 6;
        }
        if (str.length() == 1) {
            str = str.concat("c");
        }
        if (!str.equals("bl") && !str.equals("lb")) {
            if (str.equals("bc") || str.equals("cb")) {
                return 1;
            }
            if (!str.equals("br") && !str.equals("rb")) {
                if (!str.equals("cl") && !str.equals("lc")) {
                    if (str.equals("cc")) {
                        return 10;
                    }
                    if (!str.equals("cr") && !str.equals("cr")) {
                        if (!str.equals("tl") && !str.equals("lt")) {
                            if (!str.equals("tc") && !str.equals("ct")) {
                                if (!str.equals("tr") && !str.equals("rt")) {
                                    if (str.equals("Bl") || str.equals("lB")) {
                                        return 6;
                                    }
                                    if (!str.equals("Bc") && !str.equals("cB")) {
                                        if (!str.equals("Br") && !str.equals("rB")) {
                                            return 6;
                                        }
                                        return 7;
                                    }
                                    return 8;
                                }
                                return 5;
                            }
                            return 4;
                        }
                        return 3;
                    }
                    return 11;
                }
                return 9;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public void draw(Graphics2D graphics2D, float f10, float f11) {
        drawDebug(graphics2D, f10, f11);
        this.box.drawDebug(graphics2D, f10, f11, true);
        float f12 = f11 - this.shiftY;
        float f13 = (this.shiftX - this.xmin) + f10;
        double d = f13;
        double d9 = f12;
        graphics2D.rotate(-this.angle, d, d9);
        this.box.draw(graphics2D, f13, f12);
        this.box.drawDebug(graphics2D, f13, f12, true);
        graphics2D.rotate(this.angle, d, d9);
    }

    @Override
    public int getLastFontId() {
        return this.box.getLastFontId();
    }

    public RotateBox(Box box, double d, Point2D.Float r10) {
        this(box, d, r10.f47274x, r10.f47275y);
    }

    public RotateBox(Box box, double d, int i9) {
        this(box, d, calculateShift(box, i9));
    }
}
