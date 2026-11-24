package defpackage;
public final class kp1 implements Runnable {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final t09 e;
    public final float f;
    public final float h;
    public final h19 n;
    public final k27 r;
    public final mu1 s;

    public kp1(mu1 mu1Var, boolean z, boolean z2, int i, boolean z3, t09 t09Var, float f, float f2, h19 h19Var, k27 k27Var) {
        this.s = mu1Var;
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = z3;
        this.e = t09Var;
        this.f = f;
        this.h = f2;
        this.n = h19Var;
        this.r = k27Var;
    }

    @Override
    public final void run() {
        if (!this.a) {
            mu1 mu1Var = this.s;
            if (mu1Var.Kc != null) {
                mu1Var.Kc = null;
                if (this.b) {
                    mu1Var.s6(new jp1(this, this.c, this.d, this.e, this.f, this.h, this.n, (byte) 0));
                } else {
                    mu1Var.s6(new aj1(this, this.r, (byte) 20));
                }
                mu1Var.G5(true);
            }
        }
    }
}
