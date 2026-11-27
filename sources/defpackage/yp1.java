package defpackage;
public final class yp1 implements Runnable {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final i49 e;
    public final float f;
    public final float h;
    public final w49 n;
    public final r47 r;
    public final zu1 s;

    public yp1(zu1 zu1Var, boolean z, boolean z2, int i, boolean z3, i49 i49Var, float f, float f2, w49 w49Var, r47 r47Var) {
        this.s = zu1Var;
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = z3;
        this.e = i49Var;
        this.f = f;
        this.h = f2;
        this.n = w49Var;
        this.r = r47Var;
    }

    @Override
    public final void run() {
        if (!this.a) {
            zu1 zu1Var = this.s;
            if (zu1Var.Xc != null) {
                zu1Var.Xc = null;
                if (this.b) {
                    zu1Var.z6(new xp1(this, this.c, this.d, this.e, this.f, this.h, this.n, (byte) 0));
                } else {
                    zu1Var.z6(new jj1(this, this.r, (byte) 20));
                }
                zu1Var.M5(true);
            }
        }
    }
}
