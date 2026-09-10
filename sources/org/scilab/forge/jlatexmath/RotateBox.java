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

    public RotateBox(Box box, double d, float f7, float f10) {
        this.box = box;
        double d10 = (3.141592653589793d * d) / 180.0d;
        this.angle = d10;
        this.height = box.height;
        this.depth = box.depth;
        this.width = box.width;
        double sin = Math.sin(d10);
        double cos = Math.cos(this.angle);
        double d11 = f7;
        double d12 = 1.0d - cos;
        double d13 = f10;
        this.shiftX = (float) ((d13 * sin) + (d11 * d12));
        this.shiftY = (float) ((d13 * d12) - (d11 * sin));
        float f11 = this.height;
        float f12 = this.depth;
        float f13 = this.width;
        this.xmax = ((float) Math.max((-f11) * sin, Math.max(f12 * sin, Math.max((f12 * sin) + (f13 * cos), (f13 * cos) - (f11 * sin))))) + this.shiftX;
        float f14 = this.height;
        float f15 = this.depth;
        float f16 = this.width;
        this.xmin = ((float) Math.min((-f14) * sin, Math.min(f15 * sin, Math.min((f15 * sin) + (f16 * cos), (f16 * cos) - (f14 * sin))))) + this.shiftX;
        float f17 = this.height;
        float f18 = this.depth;
        float f19 = this.width;
        this.ymax = (float) Math.max(f17 * cos, Math.max((-f18) * cos, Math.max((f19 * sin) - (f18 * cos), (f17 * cos) + (f19 * sin))));
        float f20 = this.height;
        float f21 = this.depth;
        float f22 = this.width;
        float min = (float) Math.min(f20 * cos, Math.min((-f21) * cos, Math.min((f22 * sin) - (f21 * cos), (f20 * cos) + (f22 * sin))));
        this.ymin = min;
        this.width = this.xmax - this.xmin;
        float f23 = this.ymax;
        float f24 = this.shiftY;
        this.height = f23 + f24;
        this.depth = (-min) - f24;
    }

    private static Point2D.Float calculateShift(Box box, int i10) {
        Point2D.Float r02 = new Point2D.Float(0.0f, -box.depth);
        switch (i10) {
            case 0:
                r02.f41542x = 0.0f;
                r02.f41543y = -box.depth;
                return r02;
            case 1:
                r02.f41542x = box.width / 2.0f;
                r02.f41543y = -box.depth;
                return r02;
            case 2:
                r02.f41542x = box.width;
                r02.f41543y = -box.depth;
                return r02;
            case 3:
                r02.f41542x = 0.0f;
                r02.f41543y = box.height;
                return r02;
            case 4:
                r02.f41542x = box.width / 2.0f;
                r02.f41543y = box.height;
                return r02;
            case 5:
                r02.f41542x = box.width;
                r02.f41543y = box.height;
                return r02;
            case 6:
                r02.f41542x = 0.0f;
                r02.f41543y = 0.0f;
                return r02;
            case 7:
                r02.f41542x = box.width;
                r02.f41543y = 0.0f;
                return r02;
            case 8:
                r02.f41542x = box.width / 2.0f;
                r02.f41543y = 0.0f;
                return r02;
            case 9:
                r02.f41542x = 0.0f;
                r02.f41543y = (box.height - box.depth) / 2.0f;
                return r02;
            case 10:
                r02.f41542x = box.width / 2.0f;
                r02.f41543y = (box.height - box.depth) / 2.0f;
                return r02;
            case 11:
                r02.f41542x = box.width;
                r02.f41543y = (box.height - box.depth) / 2.0f;
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
    public void draw(Graphics2D graphics2D, float f7, float f10) {
        drawDebug(graphics2D, f7, f10);
        this.box.drawDebug(graphics2D, f7, f10, true);
        float f11 = f10 - this.shiftY;
        float f12 = (this.shiftX - this.xmin) + f7;
        double d = f12;
        double d10 = f11;
        graphics2D.rotate(-this.angle, d, d10);
        this.box.draw(graphics2D, f12, f11);
        this.box.drawDebug(graphics2D, f12, f11, true);
        graphics2D.rotate(this.angle, d, d10);
    }

    @Override
    public int getLastFontId() {
        return this.box.getLastFontId();
    }

    public RotateBox(Box box, double d, Point2D.Float r10) {
        this(box, d, r10.f41542x, r10.f41543y);
    }

    public RotateBox(Box box, double d, int i10) {
        this(box, d, calculateShift(box, i10));
    }
}
