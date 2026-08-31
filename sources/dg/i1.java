package dg;
public final class i1 implements Runnable {
    public final int f4562a;
    public final o1 f4563b;

    public i1(o1 o1Var, int i10) {
        this.f4562a = i10;
        this.f4563b = o1Var;
    }

    @Override
    public final void run() {
        switch (this.f4562a) {
            case 0:
                n1 n1Var = this.f4563b.f4624a;
                if (n1Var != null) {
                    n1Var.b();
                    return;
                }
                return;
            case 1:
                o1 o1Var = this.f4563b;
                o1Var.f4626c.a(o1Var.f4630r);
                m1 m1Var = o1Var.d;
                m1Var.getClass();
                m1Var.postRunnable(new l1(m1Var, 2));
                o1Var.d = null;
                return;
            default:
                o1 o1Var2 = this.f4563b;
                o1Var2.f4626c.q(o1Var2.f4633x);
                return;
        }
    }
}
