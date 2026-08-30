package cg;
public final class k1 implements Runnable {
    public final int f2440a;
    public final l1 f2441b;

    public k1(l1 l1Var, int i10) {
        this.f2440a = i10;
        this.f2441b = l1Var;
    }

    @Override
    public final void run() {
        switch (this.f2440a) {
            case 0:
                n1 n1Var = this.f2441b.f2446b.d;
                if (n1Var != null) {
                    n1Var.postRunnable(n1Var.f2483w);
                    return;
                }
                return;
            case 1:
                n1 n1Var2 = this.f2441b.f2446b.d;
                if (n1Var2 != null) {
                    n1Var2.postRunnable(n1Var2.f2483w);
                    return;
                }
                return;
            default:
                p1 p1Var = this.f2441b.f2446b;
                n1 n1Var3 = p1Var.d;
                n1Var3.getClass();
                n1Var3.postRunnable(new m1(n1Var3, 2));
                p1Var.d = null;
                return;
        }
    }
}
