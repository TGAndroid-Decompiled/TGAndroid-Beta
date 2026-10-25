package fc;

import c3.h0;
public final class g {
    public final float f10417a;
    public final float f10418b;
    public final float f10419c;
    public final float d;
    public final float e;
    public final float f10420f;
    public final float f10421g;
    public final float h;
    public final float f10422i;

    public g(float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        this.f10417a = f7;
        this.f10418b = f12;
        this.f10419c = f15;
        this.d = f10;
        this.e = f13;
        this.f10420f = f16;
        this.f10421g = f11;
        this.h = f14;
        this.f10422i = f17;
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
        float f24 = h0.f(f20, f18, f22 * f17, f23);
        float f25 = h0.f(f17, f21, f19 * f18, f23);
        return new g((f24 * f11) + (f11 - f7), (f25 * f15) + (f15 - f7), f7, (f24 * f12) + (f12 - f10), (f25 * f16) + (f16 - f10), f10, f24, f25, 1.0f);
    }
}
