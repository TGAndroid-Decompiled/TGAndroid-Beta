package lb;
public final class g {
    public final float f16754a;
    public final float f16755b;
    public final float f16756c;
    public final float d;
    public final float f16757e;
    public final float f16758f;
    public final float f16759g;
    public final float h;
    public final float f16760i;

    public g(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f16754a = f10;
        this.f16755b = f13;
        this.f16756c = f16;
        this.d = f11;
        this.f16757e = f14;
        this.f16758f = f17;
        this.f16759g = f12;
        this.h = f15;
        this.f16760i = f18;
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
        float d = e2.c.d(f21, f19, f23 * f18, f24);
        float d9 = e2.c.d(f18, f22, f20 * f19, f24);
        return new g((d * f12) + (f12 - f10), (d9 * f16) + (f16 - f10), f10, (d * f13) + (f13 - f11), (d9 * f17) + (f17 - f11), f11, d, d9, 1.0f);
    }
}
