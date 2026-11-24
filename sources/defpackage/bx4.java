package defpackage;
public final class bx4 {
    public final float a;
    public final int b;
    public final float c;
    public final int d;
    public final float e;
    public final int f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final int l;

    public bx4(float f, int i, float f2, int i2, float f3, int i3, float f4, float f5, float f6, float f7, float f8, int i4) {
        this.a = f;
        this.b = i;
        this.c = f2;
        this.d = i2;
        this.e = f3;
        this.f = i3;
        this.g = f4;
        this.h = f5;
        this.i = f6;
        this.j = f7;
        this.k = f8;
        this.l = i4;
    }

    public final boolean a() {
        if (this.e > 0.05f && (this.f >>> 24) != 0) {
            if (this.g > 0.0f || this.h > 0.0f || this.i > 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean b() {
        float f = this.g;
        float f2 = this.i;
        if (f == f2 && this.h == f2) {
            return true;
        }
        return false;
    }

    public bx4(float f, int i, float f2, int i2, float f3, int i3, float f4, float f5, float f6, float f7) {
        this(f, i, f2, i2, f3, i3, f4, f5, f6, f7, 0.0f, 0);
    }
}
