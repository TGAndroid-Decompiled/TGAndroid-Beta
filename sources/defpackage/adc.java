package defpackage;
public final class adc {
    public float a;
    public float b;
    public float c;

    public adc(float f) {
        d(f);
    }

    public final boolean a(float f) {
        float f2 = this.b;
        float A = qd4.A(this.c, f2, f, f2);
        if (this.a != A) {
            this.a = A;
            return true;
        }
        return false;
    }

    public final boolean b(float f) {
        if (this.c != f) {
            return true;
        }
        return false;
    }

    public final void c(boolean z) {
        if (z) {
            float f = this.c;
            this.a = f;
            this.b = f;
            return;
        }
        this.b = this.a;
    }

    public final void d(float f) {
        this.b = f;
        this.c = f;
        this.a = f;
    }
}
