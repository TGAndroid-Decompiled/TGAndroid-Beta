package ig;
public final class x0 implements Runnable {
    public final int f8502a;
    public final y0 f8503b;

    public x0(y0 y0Var, int i10) {
        this.f8502a = i10;
        this.f8503b = y0Var;
    }

    @Override
    public final void run() {
        switch (this.f8502a) {
            case 0:
                a1 a1Var = this.f8503b.f8508b.d;
                if (a1Var != null) {
                    a1Var.postRunnable(a1Var.f8276x);
                    return;
                }
                return;
            case 1:
                a1 a1Var2 = this.f8503b.f8508b.d;
                if (a1Var2 != null) {
                    a1Var2.postRunnable(a1Var2.f8276x);
                    return;
                }
                return;
            default:
                c1 c1Var = this.f8503b.f8508b;
                a1 a1Var3 = c1Var.d;
                a1Var3.getClass();
                a1Var3.postRunnable(new z0(a1Var3, 2));
                c1Var.d = null;
                return;
        }
    }
}
