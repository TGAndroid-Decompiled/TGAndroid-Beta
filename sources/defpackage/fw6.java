package defpackage;
public final class fw6 implements Runnable {
    public final byte a;
    public final lw6 b;
    public final ad8 c;

    public fw6(lw6 lw6Var, ad8 ad8Var, byte b) {
        this.a = b;
        this.b = lw6Var;
        this.c = ad8Var;
    }

    @Override
    public final void run() {
        aob aobVar;
        byte b = this.a;
        ad8 ad8Var = this.c;
        lw6 lw6Var = this.b;
        switch (b) {
            case 0:
                lw6Var.p.K(lw6Var.f0(ad8Var));
                spc spcVar = lw6Var.l;
                if (ad8Var.q().a(17)) {
                    aobVar = ad8Var.y0();
                } else {
                    aobVar = aob.a;
                }
                spcVar.D(aobVar);
                return;
            default:
                lw6Var.p.K(lw6Var.f0(ad8Var));
                return;
        }
    }
}
