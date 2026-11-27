package defpackage;
public final class usc {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;

    public usc(float f, float f2, float f3) {
        this.b = f;
        this.a = f;
        this.d = f2;
        this.e = f3;
    }

    public final void a(float f) {
        this.b = f;
        this.a = f;
        this.c = 0.0f;
    }

    public final boolean b(float f) {
        boolean z;
        float sqrt = this.e * 2.0f * ((float) Math.sqrt(this.d));
        while (f > 0.0f) {
            float min = Math.min(f, 0.0020833334f);
            float f2 = this.c;
            float f3 = this.a;
            float f4 = ((((f3 - this.b) * (-this.d)) - (sqrt * f2)) * min) + f2;
            this.c = f4;
            this.a = (f4 * min) + f3;
            f -= min;
        }
        if (Math.abs(this.a - this.b) <= 0.002f && Math.abs(this.c) <= 0.02f) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            a(this.b);
        }
        return z;
    }
}
