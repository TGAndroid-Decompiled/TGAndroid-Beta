package cc;
public final class i {
    public final float f6070a;
    public final float f6071b;
    public final float f6072c;
    public final float d;
    public final float f6073e;
    public final float f6074f;
    public final float f6075g;
    public final float h;
    public final float f6076i;

    public i(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f6070a = f10;
        this.f6071b = f13;
        this.f6072c = f16;
        this.d = f11;
        this.f6073e = f14;
        this.f6074f = f17;
        this.f6075g = f12;
        this.h = f15;
        this.f6076i = f18;
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
        float w10 = com.google.android.recaptcha.internal.a.w(f21, f19, f23 * f18, f24);
        float w11 = com.google.android.recaptcha.internal.a.w(f18, f22, f20 * f19, f24);
        return new i((w10 * f12) + (f12 - f10), (w11 * f16) + (f16 - f10), f10, (w10 * f13) + (f13 - f11), (w11 * f17) + (f17 - f11), f11, w10, w11, 1.0f);
    }
}
