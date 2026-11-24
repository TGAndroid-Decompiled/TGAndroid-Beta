package defpackage;
public final class r39 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public boolean f;

    public final void a(float f, float f2, float f3, float f4) {
        boolean z;
        this.a = f;
        this.d = f3;
        this.b = f - Math.max(0.0f, Math.min(f2, Math.max(0.0f, f3 - f4)));
        this.c = Math.max(f, f3);
        if (this.b <= f4 + 0.5f) {
            z = true;
        } else {
            z = false;
        }
        this.f = z;
        this.e = 0.0f;
    }

    public final float b() {
        if (this.f) {
            return this.c;
        }
        float f = this.b;
        return ((this.c - f) * this.e) + f;
    }
}
