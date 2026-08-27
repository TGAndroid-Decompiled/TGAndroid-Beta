package mb;

public final class g {

    public final float f17938a;

    public final float f17939b;

    public final float f17940c;
    public final float d;

    public final float f17941e;

    public final float f17942f;

    public final float f17943g;
    public final float h;

    public final float f17944i;

    public g(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f17938a = f10;
        this.f17939b = f13;
        this.f17940c = f16;
        this.d = f11;
        this.f17941e = f14;
        this.f17942f = f17;
        this.f17943g = f12;
        this.h = f15;
        this.f17944i = f18;
    }

    public static g a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float f18 = ((f10 - f12) + f14) - f16;
        float f19 = ((f11 - f13) + f15) - f17;
        if (f18 == 0.0f && f19 == 0.0f) {
            return new g(f12 - f10, f14 - f12, f10, f13 - f11, f15 - f13, f11, 0.0f, 0.0f, 1.0f);
        }
        float f20 = f12 - f14;
        float f21 = f16 - f14;
        float f22 = f13 - f15;
        float f23 = f17 - f15;
        float f24 = (f20 * f23) - (f21 * f22);
        float fW = com.google.android.recaptcha.internal.a.w(f21, f19, f23 * f18, f24);
        float fW2 = com.google.android.recaptcha.internal.a.w(f18, f22, f20 * f19, f24);
        return new g((fW * f12) + (f12 - f10), (fW2 * f16) + (f16 - f10), f10, (fW * f13) + (f13 - f11), (fW2 * f17) + (f17 - f11), f11, fW, fW2, 1.0f);
    }
}
