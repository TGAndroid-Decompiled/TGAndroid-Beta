package ag;
public final class m1 implements Runnable {
    public final int f587a;
    public final n1 f588b;

    public m1(n1 n1Var, int i10) {
        this.f587a = i10;
        this.f588b = n1Var;
    }

    @Override
    public final void run() {
        switch (this.f587a) {
            case 0:
                r1 r1Var = this.f588b.f616b.d;
                if (r1Var != null) {
                    r1Var.postRunnable(r1Var.f648w);
                    return;
                }
                return;
            case 1:
                r1 r1Var2 = this.f588b.f616b.d;
                if (r1Var2 != null) {
                    r1Var2.postRunnable(r1Var2.f648w);
                    return;
                }
                return;
            default:
                t1 t1Var = this.f588b.f616b;
                r1 r1Var3 = t1Var.d;
                r1Var3.getClass();
                r1Var3.postRunnable(new p1(r1Var3, 2));
                t1Var.d = null;
                return;
        }
    }
}
