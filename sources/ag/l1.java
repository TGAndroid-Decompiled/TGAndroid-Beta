package ag;
public final class l1 implements Runnable {
    public final int f580a;
    public final t1 f581b;

    public l1(t1 t1Var, int i10) {
        this.f580a = i10;
        this.f581b = t1Var;
    }

    @Override
    public final void run() {
        switch (this.f580a) {
            case 0:
                s1 s1Var = this.f581b.f658a;
                if (s1Var != null) {
                    s1Var.b();
                    return;
                }
                return;
            case 1:
                t1 t1Var = this.f581b;
                t1Var.f660c.a(t1Var.f664r);
                r1 r1Var = t1Var.d;
                r1Var.getClass();
                r1Var.postRunnable(new p1(r1Var, 2));
                t1Var.d = null;
                return;
            default:
                t1 t1Var2 = this.f581b;
                t1Var2.f660c.q(t1Var2.f667x);
                return;
        }
    }
}
