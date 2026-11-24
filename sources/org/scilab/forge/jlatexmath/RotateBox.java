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
        double sin = Math.sin(d2);
        double cos = Math.cos(this.angle);
        double d3 = f;
        double d4 = 1.0d - cos;
        double d5 = f2;
        this.shiftX = (float) ((d5 * sin) + (d3 * d4));
        this.shiftY = (float) ((d5 * d4) - (d3 * sin));
        float f3 = this.height;
        float f4 = this.depth;
        float f5 = this.width;
        this.xmax = ((float) Math.max((-f3) * sin, Math.max(f4 * sin, Math.max((f4 * sin) + (f5 * cos), (f5 * cos) - (f3 * sin))))) + this.shiftX;
        float f6 = this.height;
        float f7 = this.depth;
        float f8 = this.width;
        this.xmin = ((float) Math.min((-f6) * sin, Math.min(f7 * sin, Math.min((f7 * sin) + (f8 * cos), (f8 * cos) - (f6 * sin))))) + this.shiftX;
        float f9 = this.height;
        float f10 = this.depth;
        float f11 = this.width;
        this.ymax = (float) Math.max(f9 * cos, Math.max((-f10) * cos, Math.max((f11 * sin) - (f10 * cos), (f9 * cos) + (f11 * sin))));
        float f12 = this.height;
        float f13 = this.depth;
        float f14 = this.width;
        float min = (float) Math.min(f12 * cos, Math.min((-f13) * cos, Math.min((f14 * sin) - (f13 * cos), (f12 * cos) + (f14 * sin))));
        this.ymin = min;
        this.width = this.xmax - this.xmin;
        float f15 = this.ymax;
        float f16 = this.shiftY;
        this.height = f15 + f16;
        this.depth = (-min) - f16;
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
    public void draw(Graphics2D graphics2D, float f, float f2) {
        drawDebug(graphics2D, f, f2);
        this.box.drawDebug(graphics2D, f, f2, true);
        float f3 = f2 - this.shiftY;
        float f4 = (this.shiftX - this.xmin) + f;
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

    public RotateBox(Box box, double d, Point2D.Float r10) {
        this(box, d, r10.x, r10.y);
    }

    public RotateBox(Box box, double d, int i) {
        this(box, d, calculateShift(box, i));
    }
}
