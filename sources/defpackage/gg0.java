package defpackage;
public final class gg0 implements fg0 {
    public final xka a;

    public gg0(xka xkaVar) {
        this.a = xkaVar;
    }

    @Override
    public final void a(ws2 ws2Var) {
        boolean c = ws2Var.c();
        xka xkaVar = this.a;
        if (c) {
            xkaVar.j(null, xkaVar.E);
            return;
        }
        k09 k09Var = xkaVar.u;
        if (k09Var != null) {
            ((l05) k09Var.b).onConnectionFailed(ws2Var);
        }
    }
}
