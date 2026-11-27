package defpackage;
public final class sy0 {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final ey7 f;
    public final ey7 g;
    public int h;
    public int i;

    public sy0(ey7 ey7Var, ey7 ey7Var2, boolean z) {
        this.g = ey7Var;
        this.f = ey7Var2;
        this.e = z;
        ey7Var2.N(12);
        this.a = ey7Var2.E();
        ey7Var.N(12);
        this.i = ey7Var.E();
        pke.a("first_chunk must be 1", ey7Var.m() == 1);
        this.b = -1;
    }

    public final boolean a() {
        long C;
        int i;
        int i2 = this.b + 1;
        this.b = i2;
        if (i2 == this.a) {
            return false;
        }
        boolean z = this.e;
        ey7 ey7Var = this.f;
        if (z) {
            C = ey7Var.G();
        } else {
            C = ey7Var.C();
        }
        this.d = C;
        if (this.b == this.h) {
            ey7 ey7Var2 = this.g;
            this.c = ey7Var2.E();
            ey7Var2.O(4);
            int i3 = this.i - 1;
            this.i = i3;
            if (i3 > 0) {
                i = ey7Var2.E() - 1;
            } else {
                i = -1;
            }
            this.h = i;
        }
        return true;
    }
}
