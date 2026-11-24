package defpackage;

import android.graphics.Matrix;
public final class h33 {
    public float a;
    public float b;
    public float f;
    public float h;
    public boolean j;
    public final j33 l;
    public float c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public final float g = 0.0f;
    public float i = 0.0f;
    public final Matrix k = new Matrix();

    public h33(j33 j33Var, int i, int i2) {
        this.l = j33Var;
        this.a = i;
        this.b = i2;
    }

    public final float a() {
        if ((this.h + this.g) % 180.0f != 0.0f) {
            return this.a;
        }
        return this.b;
    }

    public final float b() {
        if ((this.h + this.g) % 180.0f != 0.0f) {
            return this.b;
        }
        return this.a;
    }

    public final boolean c() {
        if (Math.abs(this.c) <= 1.0E-5f && Math.abs(this.d) <= 1.0E-5f && Math.abs(this.e - this.f) <= 1.0E-5f && Math.abs(this.i) <= 1.0E-5f && Math.abs(this.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public final void d(float f) {
        Matrix matrix = this.k;
        matrix.reset();
        this.c = 0.0f;
        this.d = 0.0f;
        this.i = 0.0f;
        this.h = f;
        h();
        float f2 = this.f;
        this.e = f2;
        matrix.postScale(f2, f2);
    }

    public final void e(float f) {
        this.i += f;
        this.k.postRotate(f, 0.0f, 0.0f);
    }

    public final void f(float f, float f2, float f3) {
        this.e *= f;
        this.k.postScale(f, f, f2, f3);
    }

    public final void g(float f, float f2) {
        this.c += f;
        this.d += f2;
        this.k.postTranslate(f, f2);
    }

    public final void h() {
        float f;
        float f2;
        float f3 = this.h;
        float f4 = this.g;
        if ((f3 + f4) % 180.0f != 0.0f) {
            f = this.b;
        } else {
            f = this.a;
        }
        if ((f3 + f4) % 180.0f != 0.0f) {
            f2 = this.a;
        } else {
            f2 = this.b;
        }
        j33 j33Var = this.l;
        if (j33Var.y) {
            this.f = j33Var.a.getCropWidth() / f;
        } else {
            this.f = Math.max(j33Var.a.getCropWidth() / f, j33Var.a.getCropHeight() / f2);
        }
    }
}
