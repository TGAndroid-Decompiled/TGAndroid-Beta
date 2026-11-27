package defpackage;
public final class a1d {
    public final d0d a;
    public final b1d[] b;
    public final double c;
    public final int d;
    public final int e;
    public final int f;
    public final h1d g;
    public final boolean h;
    public final boolean i;

    public a1d(d0d d0dVar, b1d[] b1dVarArr, double d, int i, int i2, float f, float f2, int i3, int i4, int i5, h1d h1dVar, boolean z, boolean z2) {
        this.g = h1dVar;
        this.h = z;
        this.i = z2;
        this.a = d0dVar;
        this.b = b1dVarArr;
        this.c = d;
        this.d = i;
        this.e = i2;
        this.f = i5;
    }

    public final boolean a() {
        if (this.a.e()) {
            for (b1d b1dVar : this.b) {
                if (b1dVar.a.e()) {
                }
            }
            return true;
        }
        return false;
    }
}
