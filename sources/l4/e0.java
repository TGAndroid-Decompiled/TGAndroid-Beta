package l4;
public final class e0 implements Runnable {
    public final int f14300a;
    public final g0 f14301b;
    public final Object f14302c;
    public final p d;
    public final x f14303e;

    public e0(g0 g0Var, h0 h0Var, p pVar, x xVar, int i10) {
        this.f14300a = i10;
        this.f14301b = g0Var;
        this.f14302c = h0Var;
        this.d = pVar;
        this.f14303e = xVar;
    }

    @Override
    public final void run() {
        switch (this.f14300a) {
            case 0:
                g0 g0Var = this.f14301b;
                this.f14302c.h(g0Var.f14319a, g0Var.f14320b, this.d, this.f14303e);
                return;
            case 1:
                g0 g0Var2 = this.f14301b;
                this.f14302c.a(g0Var2.f14319a, g0Var2.f14320b, this.d, this.f14303e);
                return;
            default:
                g0 g0Var3 = this.f14301b;
                this.f14302c.g(g0Var3.f14319a, g0Var3.f14320b, this.d, this.f14303e);
                return;
        }
    }
}
