package og;

import android.graphics.Bitmap;
import android.graphics.PointF;
import org.telegram.ui.Components.tv0;
public final class y0 {
    public final float f14565a;
    public final float f14566b;
    public final PointF f14567c;
    public final PointF d;
    public final float e;
    public final PointF f14568f;
    public final PointF f14569g;

    public y0(t8.a aVar, Bitmap bitmap, tv0 tv0Var, boolean z10) {
        float degrees;
        PointF pointF = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        for (t8.d dVar : aVar.f42108b) {
            PointF pointF5 = dVar.f42115a;
            int i10 = dVar.f42116b;
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 != 10) {
                        if (i10 == 11) {
                            pointF4 = b(pointF5, bitmap, tv0Var, z10);
                        }
                    } else {
                        pointF2 = b(pointF5, bitmap, tv0Var, z10);
                    }
                } else {
                    pointF3 = b(pointF5, bitmap, tv0Var, z10);
                }
            } else {
                pointF = b(pointF5, bitmap, tv0Var, z10);
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
            this.f14566b = (float) Math.toDegrees(Math.atan2(pointF2.y - pointF.y, pointF2.x - pointF.x) + 3.141592653589793d);
            this.f14565a = 2.35f * hypot;
            float f7 = hypot * 0.8f;
            float f10 = pointF7.x;
            double radians = (float) Math.toRadians(degrees - 90.0f);
            this.f14567c = new PointF((((float) Math.cos(radians)) * f7) + f10, (f7 * ((float) Math.sin(radians))) + pointF7.y);
        }
        if (pointF3 != null && pointF4 != null) {
            if (pointF3.x < pointF4.x) {
                PointF pointF8 = pointF4;
                pointF4 = pointF3;
                pointF3 = pointF8;
            }
            PointF pointF9 = new PointF((pointF4.x * 0.5f) + (pointF3.x * 0.5f), (pointF4.y * 0.5f) + (pointF3.y * 0.5f));
            this.f14568f = pointF9;
            float f11 = this.e * 0.7f;
            float f12 = pointF9.x;
            double radians2 = (float) Math.toRadians(this.f14566b + 90.0f);
            this.f14569g = new PointF((((float) Math.cos(radians2)) * f11) + f12, (f11 * ((float) Math.sin(radians2))) + pointF9.y);
        }
    }

    public static PointF b(PointF pointF, Bitmap bitmap, tv0 tv0Var, boolean z10) {
        int width;
        int height;
        if (z10) {
            width = bitmap.getHeight();
        } else {
            width = bitmap.getWidth();
        }
        float f7 = width;
        if (z10) {
            height = bitmap.getWidth();
        } else {
            height = bitmap.getHeight();
        }
        return new PointF((tv0Var.f27499a * pointF.x) / f7, (tv0Var.f27500b * pointF.y) / height);
    }

    public final PointF a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return this.f14569g;
                }
                return this.f14568f;
            }
            return this.d;
        }
        return this.f14567c;
    }
}
