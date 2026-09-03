package cg;

import android.graphics.Bitmap;
import android.graphics.PointF;
import org.telegram.ui.Components.jv0;
public final class g1 {
    public final float f2389a;
    public final float f2390b;
    public final PointF f2391c;
    public final PointF d;
    public final float e;
    public final PointF f2392f;
    public final PointF f2393g;

    public g1(h8.a aVar, Bitmap bitmap, jv0 jv0Var, boolean z4) {
        float degrees;
        PointF pointF = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        for (h8.d dVar : aVar.f7026b) {
            PointF pointF5 = dVar.f7033a;
            int i10 = dVar.f7034b;
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 != 10) {
                        if (i10 == 11) {
                            pointF4 = b(pointF5, bitmap, jv0Var, z4);
                        }
                    } else {
                        pointF2 = b(pointF5, bitmap, jv0Var, z4);
                    }
                } else {
                    pointF3 = b(pointF5, bitmap, jv0Var, z4);
                }
            } else {
                pointF = b(pointF5, bitmap, jv0Var, z4);
            }
        }
        if (pointF != null && pointF2 != null) {
            if (pointF.x < pointF2.x) {
                PointF pointF6 = pointF2;
                pointF2 = pointF;
                pointF = pointF6;
            }
            PointF pointF7 = new PointF((pointF2.x * 0.5f) + (pointF.x * 0.5f), (pointF2.y * 0.5f) + (pointF.y * 0.5f));
            this.d = pointF7;
            float hypot = (float) Math.hypot(pointF2.x - pointF.x, pointF2.y - pointF.y);
            this.e = hypot;
            this.f2390b = (float) Math.toDegrees(Math.atan2(pointF2.y - pointF.y, pointF2.x - pointF.x) + 3.141592653589793d);
            this.f2389a = 2.35f * hypot;
            float f10 = hypot * 0.8f;
            float f11 = pointF7.x;
            double radians = (float) Math.toRadians(degrees - 90.0f);
            this.f2391c = new PointF((((float) Math.cos(radians)) * f10) + f11, (f10 * ((float) Math.sin(radians))) + pointF7.y);
        }
        if (pointF3 != null && pointF4 != null) {
            if (pointF3.x < pointF4.x) {
                PointF pointF8 = pointF4;
                pointF4 = pointF3;
                pointF3 = pointF8;
            }
            PointF pointF9 = new PointF((pointF4.x * 0.5f) + (pointF3.x * 0.5f), (pointF4.y * 0.5f) + (pointF3.y * 0.5f));
            this.f2392f = pointF9;
            float f12 = this.e * 0.7f;
            float f13 = pointF9.x;
            double radians2 = (float) Math.toRadians(this.f2390b + 90.0f);
            this.f2393g = new PointF((((float) Math.cos(radians2)) * f12) + f13, (f12 * ((float) Math.sin(radians2))) + pointF9.y);
        }
    }

    public static PointF b(PointF pointF, Bitmap bitmap, jv0 jv0Var, boolean z4) {
        int width;
        int height;
        if (z4) {
            width = bitmap.getHeight();
        } else {
            width = bitmap.getWidth();
        }
        float f10 = width;
        if (z4) {
            height = bitmap.getWidth();
        } else {
            height = bitmap.getHeight();
        }
        return new PointF((jv0Var.f26062a * pointF.x) / f10, (jv0Var.f26063b * pointF.y) / height);
    }

    public final PointF a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return this.f2393g;
                }
                return this.f2392f;
            }
            return this.d;
        }
        return this.f2391c;
    }
}
