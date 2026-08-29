package nb;
public final class g {
    public final float f17221a;
    public final float f17222b;
    public final float f17223c;
    public final float d;
    public final float f17224e;
    public final float f17225f;
    public final float f17226g;
    public final float h;
    public final float f17227i;

    public g(float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        this.f17221a = f9;
        this.f17222b = f12;
        this.f17223c = f15;
        this.d = f10;
        this.f17224e = f13;
        this.f17225f = f16;
        this.f17226g = f11;
        this.h = f14;
        this.f17227i = f17;
    }

    public static g a(float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17 = ((f9 - f11) + f13) - f15;
        float f18 = ((f10 - f12) + f14) - f16;
        if (f17 == 0.0f && f18 == 0.0f) {
            return new g(f11 - f9, f13 - f11, f9, f12 - f10, f14 - f12, f10, 0.0f, 0.0f, 1.0f);
        }
        float f19 = f11 - f13;
        float f20 = f15 - f13;
        float f21 = f12 - f14;
        float f22 = f16 - f14;
        float f23 = (f19 * f22) - (f20 * f21);
        float w10 = com.google.android.recaptcha.internal.a.w(f20, f18, f22 * f17, f23);
        float w11 = com.google.android.recaptcha.internal.a.w(f17, f21, f19 * f18, f23);
        return new g((w10 * f11) + (f11 - f9), (w11 * f15) + (f15 - f9), f9, (w10 * f12) + (f12 - f10), (w11 * f16) + (f16 - f10), f10, w10, w11, 1.0f);
    }
}
