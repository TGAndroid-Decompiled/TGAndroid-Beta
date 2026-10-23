package ec;

import com.google.android.gms.internal.play_billing.k3;
public final class g {
    public final float f8601a;
    public final float f8602b;
    public final float f8603c;
    public final float d;
    public final float e;
    public final float f8604f;
    public final float f8605g;
    public final float h;
    public final float f8606i;

    public g(float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        this.f8601a = f7;
        this.f8602b = f12;
        this.f8603c = f15;
        this.d = f10;
        this.e = f13;
        this.f8604f = f16;
        this.f8605g = f11;
        this.h = f14;
        this.f8606i = f17;
    }

    public static g a(float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17 = ((f7 - f11) + f13) - f15;
        float f18 = ((f10 - f12) + f14) - f16;
        if (f17 == 0.0f && f18 == 0.0f) {
            return new g(f11 - f7, f13 - f11, f7, f12 - f10, f14 - f12, f10, 0.0f, 0.0f, 1.0f);
        }
        float f19 = f11 - f13;
        float f20 = f15 - f13;
        float f21 = f12 - f14;
        float f22 = f16 - f14;
        float f23 = (f19 * f22) - (f20 * f21);
        float c10 = k3.c(f20, f18, f22 * f17, f23);
        float c11 = k3.c(f17, f21, f19 * f18, f23);
        return new g((c10 * f11) + (f11 - f7), (c11 * f15) + (f15 - f7), f7, (c10 * f12) + (f12 - f10), (c11 * f16) + (f16 - f10), f10, c10, c11, 1.0f);
    }
}
