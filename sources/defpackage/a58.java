package defpackage;

import android.graphics.Bitmap;
import android.graphics.PointF;
public final class a58 {
    public final float a;
    public final float b;
    public final PointF c;
    public final PointF d;
    public final float e;
    public final PointF f;
    public final PointF g;

    public a58(n74 n74Var, Bitmap bitmap, via viaVar, boolean z) {
        float degrees;
        PointF pointF = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        for (ww5 ww5Var : n74Var.b) {
            PointF pointF5 = ww5Var.a;
            int i = ww5Var.b;
            if (i != 4) {
                if (i != 5) {
                    if (i != 10) {
                        if (i == 11) {
                            pointF4 = b(pointF5, bitmap, viaVar, z);
                        }
                    } else {
                        pointF2 = b(pointF5, bitmap, viaVar, z);
                    }
                } else {
                    pointF3 = b(pointF5, bitmap, viaVar, z);
                }
            } else {
                pointF = b(pointF5, bitmap, viaVar, z);
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
            this.b = (float) Math.toDegrees(Math.atan2(pointF2.y - pointF.y, pointF2.x - pointF.x) + 3.141592653589793d);
            this.a = 2.35f * hypot;
            float f = hypot * 0.8f;
            float f2 = pointF7.x;
            double radians = (float) Math.toRadians(degrees - 90.0f);
            this.c = new PointF((((float) Math.cos(radians)) * f) + f2, (f * ((float) Math.sin(radians))) + pointF7.y);
        }
        if (pointF3 != null && pointF4 != null) {
            if (pointF3.x < pointF4.x) {
                PointF pointF8 = pointF4;
                pointF4 = pointF3;
                pointF3 = pointF8;
            }
            PointF pointF9 = new PointF((pointF4.x * 0.5f) + (pointF3.x * 0.5f), (pointF4.y * 0.5f) + (pointF3.y * 0.5f));
            this.f = pointF9;
            float f3 = this.e * 0.7f;
            float f4 = pointF9.x;
            double radians2 = (float) Math.toRadians(this.b + 90.0f);
            this.g = new PointF((((float) Math.cos(radians2)) * f3) + f4, (f3 * ((float) Math.sin(radians2))) + pointF9.y);
        }
    }

    public static PointF b(PointF pointF, Bitmap bitmap, via viaVar, boolean z) {
        float width;
        int height;
        if (z) {
            width = bitmap.getHeight();
            height = bitmap.getWidth();
        } else {
            width = bitmap.getWidth();
            height = bitmap.getHeight();
        }
        return new PointF((viaVar.a * pointF.x) / width, (viaVar.b * pointF.y) / height);
    }

    public final PointF a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return this.g;
                }
                return this.f;
            }
            return this.d;
        }
        return this.c;
    }
}
