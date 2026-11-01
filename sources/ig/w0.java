package ig;
public final class w0 implements Runnable {
    public final int f8498a;
    public final c1 f8499b;

    public w0(c1 c1Var, int i10) {
        this.f8498a = i10;
        this.f8499b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f8498a) {
            case 0:
                b1 b1Var = this.f8499b.f8283a;
                if (b1Var != null) {
                    b1Var.g();
                    return;
                }
                return;
            case 1:
                c1 c1Var = this.f8499b;
                c1Var.f8285c.a(c1Var.f8288r);
                a1 a1Var = c1Var.d;
                a1Var.getClass();
                a1Var.postRunnable(new z0(a1Var, 2));
                c1Var.d = null;
                return;
            default:
                c1 c1Var2 = this.f8499b;
                c1Var2.f8285c.q(c1Var2.f8292y);
                return;
        }
    }
}
