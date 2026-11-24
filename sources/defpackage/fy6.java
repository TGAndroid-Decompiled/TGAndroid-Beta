package defpackage;
public final class fy6 implements Runnable {
    public final byte a;
    public final ly6 b;
    public final cf8 c;

    public fy6(ly6 ly6Var, cf8 cf8Var, byte b) {
        this.a = b;
        this.b = ly6Var;
        this.c = cf8Var;
    }

    @Override
    public final void run() {
        bqb bqbVar;
        byte b = this.a;
        cf8 cf8Var = this.c;
        ly6 ly6Var = this.b;
        switch (b) {
            case 0:
                ly6Var.p.P(ly6Var.f0(cf8Var));
                trc trcVar = ly6Var.l;
                if (cf8Var.q().a(17)) {
                    bqbVar = cf8Var.y0();
                } else {
                    bqbVar = bqb.a;
                }
                trcVar.D(bqbVar);
                return;
            default:
                ly6Var.p.P(ly6Var.f0(cf8Var));
                return;
        }
    }
}
