package defpackage;
public final class gh0 implements fh0 {
    public final gja a;

    public gh0(gja gjaVar) {
        this.a = gjaVar;
    }

    @Override
    public final void a(ot2 ot2Var) {
        boolean c = ot2Var.c();
        gja gjaVar = this.a;
        if (c) {
            gjaVar.j(null, gjaVar.E);
            return;
        }
        oo8 oo8Var = gjaVar.u;
        if (oo8Var != null) {
            ((g05) oo8Var.b).onConnectionFailed(ot2Var);
        }
    }
}
