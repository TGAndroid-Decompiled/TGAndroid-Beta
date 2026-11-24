package defpackage;
public final class xq1 implements Runnable {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final v29 e;
    public final float f;
    public final float h;
    public final k39 n;
    public final k47 r;
    public final yv1 s;

    public xq1(yv1 yv1Var, boolean z, boolean z2, int i, boolean z3, v29 v29Var, float f, float f2, k39 k39Var, k47 k47Var) {
        this.s = yv1Var;
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = z3;
        this.e = v29Var;
        this.f = f;
        this.h = f2;
        this.n = k39Var;
        this.r = k47Var;
    }

    @Override
    public final void run() {
        if (!this.a) {
            yv1 yv1Var = this.s;
            if (yv1Var.Uc != null) {
                yv1Var.Uc = null;
                if (this.b) {
                    yv1Var.z6(new wq1(this, this.c, this.d, this.e, this.f, this.h, this.n, (byte) 0));
                } else {
                    yv1Var.z6(new uj1(this, this.r, (byte) 21));
                }
                yv1Var.N5(true);
            }
        }
    }
}
