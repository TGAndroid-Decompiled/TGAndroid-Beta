package og;
public final class b1 implements Runnable {
    public final int f14334a;
    public final h1 f14335b;

    public b1(h1 h1Var, int i10) {
        this.f14334a = i10;
        this.f14335b = h1Var;
    }

    @Override
    public final void run() {
        switch (this.f14334a) {
            case 0:
                g1 g1Var = this.f14335b.f14388a;
                if (g1Var != null) {
                    g1Var.b();
                    return;
                }
                return;
            case 1:
                h1 h1Var = this.f14335b;
                h1Var.f14390c.a(h1Var.f14393r);
                f1 f1Var = h1Var.d;
                f1Var.getClass();
                f1Var.postRunnable(new e1(f1Var, 2));
                h1Var.d = null;
                return;
            default:
                h1 h1Var2 = this.f14335b;
                h1Var2.f14390c.q(h1Var2.f14396x);
                return;
        }
    }
}
