package cg;
public final class k1 implements Runnable {
    public final int f2423a;
    public final l1 f2424b;

    public k1(l1 l1Var, int i10) {
        this.f2423a = i10;
        this.f2424b = l1Var;
    }

    @Override
    public final void run() {
        switch (this.f2423a) {
            case 0:
                n1 n1Var = this.f2424b.f2429b.d;
                if (n1Var != null) {
                    n1Var.postRunnable(n1Var.f2466w);
                    return;
                }
                return;
            case 1:
                n1 n1Var2 = this.f2424b.f2429b.d;
                if (n1Var2 != null) {
                    n1Var2.postRunnable(n1Var2.f2466w);
                    return;
                }
                return;
            default:
                p1 p1Var = this.f2424b.f2429b;
                n1 n1Var3 = p1Var.d;
                n1Var3.getClass();
                n1Var3.postRunnable(new m1(n1Var3, 2));
                p1Var.d = null;
                return;
        }
    }
}
