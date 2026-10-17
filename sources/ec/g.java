package ec;

import com.google.android.gms.internal.cast.a6;
public final class g {
    public float f8596a;
    public float f8597b;
    public float f8598c;
    public float d;
    public float e;
    public float f8599f;
    public float f8600g;
    public float h;
    public float f8601i;

    public g(float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        this.f8596a = f7;
        this.f8597b = f12;
        this.f8598c = f15;
        this.d = f10;
        this.e = f13;
        this.f8599f = f16;
        this.f8600g = f11;
        this.h = f14;
        this.f8601i = f17;
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
        float c10 = a6.c(f20, f18, f22 * f17, f23);
        float c11 = a6.c(f17, f21, f19 * f18, f23);
        return new g((c10 * f11) + (f11 - f7), (c11 * f15) + (f15 - f7), f7, (c10 * f12) + (f12 - f10), (c11 * f16) + (f16 - f10), f10, c10, c11, 1.0f);
    }
}
