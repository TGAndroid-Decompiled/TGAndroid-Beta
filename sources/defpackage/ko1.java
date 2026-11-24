package defpackage;
public final class ko1 implements Runnable {
    public final byte a = 1;
    public final byte b;
    public final mu1 c;
    public final boolean d;

    public ko1(int i, mu1 mu1Var, boolean z) {
        this.b = i;
        this.c = mu1Var;
        this.d = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        mu1 mu1Var = this.c;
        byte b2 = this.b;
        switch (b) {
            case 0:
                mu1Var.Sc(b2, z);
                return;
            default:
                if (b2 != 2) {
                    mu1Var.X9();
                    mu1Var.pc();
                }
                no2.f(u21.b0(mu1Var), b2, z);
                return;
        }
    }

    public ko1(mu1 mu1Var, boolean z, int i) {
        this.c = mu1Var;
        this.d = z;
        this.b = i;
    }
}
