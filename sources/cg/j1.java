package cg;
public final class j1 implements Runnable {
    public final int f2417a;
    public final p1 f2418b;

    public j1(p1 p1Var, int i10) {
        this.f2417a = i10;
        this.f2418b = p1Var;
    }

    @Override
    public final void run() {
        switch (this.f2417a) {
            case 0:
                o1 o1Var = this.f2418b.f2475a;
                if (o1Var != null) {
                    o1Var.b();
                    return;
                }
                return;
            case 1:
                p1 p1Var = this.f2418b;
                p1Var.f2477c.a(p1Var.f2480r);
                n1 n1Var = p1Var.d;
                n1Var.getClass();
                n1Var.postRunnable(new m1(n1Var, 2));
                p1Var.d = null;
                return;
            default:
                p1 p1Var2 = this.f2418b;
                p1Var2.f2477c.q(p1Var2.f2483x);
                return;
        }
    }
}
