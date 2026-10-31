package ig;
public final class w0 implements Runnable {
    public final int f8497a;
    public final c1 f8498b;

    public w0(c1 c1Var, int i10) {
        this.f8497a = i10;
        this.f8498b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f8497a) {
            case 0:
                b1 b1Var = this.f8498b.f8282a;
                if (b1Var != null) {
                    b1Var.g();
                    return;
                }
                return;
            case 1:
                c1 c1Var = this.f8498b;
                c1Var.f8284c.a(c1Var.f8287r);
                a1 a1Var = c1Var.d;
                a1Var.getClass();
                a1Var.postRunnable(new z0(a1Var, 2));
                c1Var.d = null;
                return;
            default:
                c1 c1Var2 = this.f8498b;
                c1Var2.f8284c.q(c1Var2.f8291y);
                return;
        }
    }
}
