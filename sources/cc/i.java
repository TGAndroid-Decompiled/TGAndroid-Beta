package cc;

import com.google.android.gms.internal.vision.e2;
public final class i {
    public final float f4892a;
    public final float f4893b;
    public final float f4894c;
    public final float d;
    public final float f4895e;
    public final float f4896f;
    public final float f4897g;
    public final float h;
    public final float f4898i;

    public i(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f4892a = f10;
        this.f4893b = f13;
        this.f4894c = f16;
        this.d = f11;
        this.f4895e = f14;
        this.f4896f = f17;
        this.f4897g = f12;
        this.h = f15;
        this.f4898i = f18;
    }

    public static i a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float f18 = ((f10 - f12) + f14) - f16;
        float f19 = ((f11 - f13) + f15) - f17;
        if (f18 == 0.0f && f19 == 0.0f) {
            return new i(f12 - f10, f14 - f12, f10, f13 - f11, f15 - f13, f11, 0.0f, 0.0f, 1.0f);
        }
        float f20 = f12 - f14;
        float f21 = f16 - f14;
        float f22 = f13 - f15;
        float f23 = f17 - f15;
        float f24 = (f20 * f23) - (f21 * f22);
        float w10 = e2.w(f21, f19, f23 * f18, f24);
        float w11 = e2.w(f18, f22, f20 * f19, f24);
        return new i((w10 * f12) + (f12 - f10), (w11 * f16) + (f16 - f10), f10, (w10 * f13) + (f13 - f11), (w11 * f17) + (f17 - f11), f11, w10, w11, 1.0f);
    }
}
