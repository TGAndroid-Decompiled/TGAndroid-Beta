package dg;

import android.graphics.Bitmap;
import android.graphics.PointF;
import org.telegram.ui.Components.kv0;
public final class f1 {
    public final float f4533a;
    public final float f4534b;
    public final PointF f4535c;
    public final PointF d;
    public final float f4536e;
    public final PointF f4537f;
    public final PointF f4538g;

    public f1(h8.a aVar, Bitmap bitmap, kv0 kv0Var, boolean z4) {
        float degrees;
        PointF pointF = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        for (h8.d dVar : aVar.f7352b) {
            PointF pointF5 = dVar.f7360a;
            int i10 = dVar.f7361b;
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 != 10) {
                        if (i10 == 11) {
                            pointF4 = b(pointF5, bitmap, kv0Var, z4);
                        }
                    } else {
                        pointF2 = b(pointF5, bitmap, kv0Var, z4);
                    }
                } else {
                    pointF3 = b(pointF5, bitmap, kv0Var, z4);
                }
            } else {
                pointF = b(pointF5, bitmap, kv0Var, z4);
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
            this.f4536e = hypot;
            this.f4534b = (float) Math.toDegrees(Math.atan2(pointF2.y - pointF.y, pointF2.x - pointF.x) + 3.141592653589793d);
            this.f4533a = 2.35f * hypot;
            float f10 = hypot * 0.8f;
            float f11 = pointF7.x;
            double radians = (float) Math.toRadians(degrees - 90.0f);
            this.f4535c = new PointF((((float) Math.cos(radians)) * f10) + f11, (f10 * ((float) Math.sin(radians))) + pointF7.y);
        }
        if (pointF3 != null && pointF4 != null) {
            if (pointF3.x < pointF4.x) {
                PointF pointF8 = pointF4;
                pointF4 = pointF3;
                pointF3 = pointF8;
            }
            PointF pointF9 = new PointF((pointF4.x * 0.5f) + (pointF3.x * 0.5f), (pointF4.y * 0.5f) + (pointF3.y * 0.5f));
            this.f4537f = pointF9;
            float f12 = this.f4536e * 0.7f;
            float f13 = pointF9.x;
            double radians2 = (float) Math.toRadians(this.f4534b + 90.0f);
            this.f4538g = new PointF((((float) Math.cos(radians2)) * f12) + f13, (f12 * ((float) Math.sin(radians2))) + pointF9.y);
        }
    }

    public static PointF b(PointF pointF, Bitmap bitmap, kv0 kv0Var, boolean z4) {
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
        return new PointF((kv0Var.f28463a * pointF.x) / f10, (kv0Var.f28464b * pointF.y) / height);
    }

    public final PointF a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return this.f4538g;
                }
                return this.f4537f;
            }
            return this.d;
        }
        return this.f4535c;
    }
}
