package defpackage;
public final class rz0 {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final yw7 f;
    public final yw7 g;
    public int h;
    public int i;

    public rz0(yw7 yw7Var, yw7 yw7Var2, boolean z) {
        this.g = yw7Var;
        this.f = yw7Var2;
        this.e = z;
        yw7Var2.N(12);
        this.a = yw7Var2.E();
        yw7Var.N(12);
        this.i = yw7Var.E();
        zhe.a("first_chunk must be 1", yw7Var.m() == 1);
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
        yw7 yw7Var = this.f;
        if (z) {
            C = yw7Var.G();
        } else {
            C = yw7Var.C();
        }
        this.d = C;
        if (this.b == this.h) {
            yw7 yw7Var2 = this.g;
            this.c = yw7Var2.E();
            yw7Var2.O(4);
            int i3 = this.i - 1;
            this.i = i3;
            if (i3 > 0) {
                i = yw7Var2.E() - 1;
            } else {
                i = -1;
            }
            this.h = i;
        }
        return true;
    }
}
