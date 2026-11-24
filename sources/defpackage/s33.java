package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
public final class s33 implements Interpolator {
    public static final s33 f = new s33(0.25d, 0.1d, 0.25d, 1.0d);
    public static final s33 g = new s33(0.0d, 0.0d, 0.58d, 1.0d);
    public static final s33 h = new s33(0.23d, 1.0d, 0.32d, 1.0d);
    public static final s33 i = new s33(0.42d, 0.0d, 1.0d, 1.0d);
    public static final s33 j = new s33(0.42d, 0.0d, 0.58d, 1.0d);
    public static final s33 k = new s33(0.34d, 1.56d, 0.64d, 1.0d);
    public static final PathInterpolator l;
    public final PointF a;
    public final PointF b;
    public final PointF c;
    public final PointF d;
    public final PointF e;

    static {
        new PathInterpolator(mqe.d("M 0,0 C 0.05, 0, 0.133333, 0.06, 0.166666, 0.4 C 0.208333, 0.82, 0.25, 1, 1, 1"));
        new PathInterpolator(0.05f, 0.7f, 0.1f, 1.0f);
        new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
        l = new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
    }

    public s33(float f2, float f3, float f4, float f5) {
        PointF pointF = new PointF(f2, f3);
        PointF pointF2 = new PointF(f4, f5);
        this.c = new PointF();
        this.d = new PointF();
        this.e = new PointF();
        float f6 = pointF.x;
        if (f6 >= 0.0f && f6 <= 1.0f) {
            float f7 = pointF2.x;
            if (f7 >= 0.0f && f7 <= 1.0f) {
                this.a = pointF;
                this.b = pointF2;
                return;
            }
            w26.j("endX value must be in the range [0, 1]");
            throw null;
        }
        w26.j("startX value must be in the range [0, 1]");
        throw null;
    }

    @Override
    public final float getInterpolation(float f2) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        PointF pointF4;
        PointF pointF5;
        int i2 = 1;
        float f3 = f2;
        while (true) {
            pointF = this.b;
            pointF2 = this.a;
            pointF3 = this.c;
            pointF4 = this.d;
            pointF5 = this.e;
            if (i2 >= 14) {
                break;
            }
            float f4 = pointF2.x * 3.0f;
            pointF5.x = f4;
            float f5 = ((pointF.x - pointF2.x) * 3.0f) - f4;
            pointF4.x = f5;
            float f6 = (1.0f - pointF5.x) - f5;
            pointF3.x = f6;
            float f7 = (((((f6 * f3) + pointF4.x) * f3) + pointF5.x) * f3) - f2;
            if (Math.abs(f7) < 0.001d) {
                break;
            }
            f3 -= f7 / (((((pointF3.x * 3.0f) * f3) + (pointF4.x * 2.0f)) * f3) + pointF5.x);
            i2++;
        }
        float f8 = pointF2.y * 3.0f;
        pointF5.y = f8;
        float f9 = ((pointF.y - pointF2.y) * 3.0f) - f8;
        pointF4.y = f9;
        float f10 = (1.0f - pointF5.y) - f9;
        pointF3.y = f10;
        return ((((f10 * f3) + pointF4.y) * f3) + pointF5.y) * f3;
    }

    public s33(double d, double d2, double d3, double d4) {
        this((float) d, (float) d2, (float) d3, (float) d4);
    }
}
