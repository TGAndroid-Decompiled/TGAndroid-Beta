package defpackage;
public final class zo1 implements Runnable {
    public final byte a;
    public final pz b;

    public zo1(pz pzVar, byte b) {
        this.a = b;
        this.b = pzVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        pz pzVar = this.b;
        switch (b) {
            case 0:
                gm.E3(pzVar);
                return;
            default:
                lf8 lf8Var = (lf8) pzVar.f2;
                rc2 rc2Var = lf8Var.n;
                if (rc2Var != null && rc2Var.getDelegate() != null) {
                    lf8Var.n.getDelegate().o1(lf8Var.n, false);
                    return;
                }
                return;
        }
    }
}
