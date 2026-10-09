package ei;
public final class z4 implements Runnable {
    public final int f9524a;
    public final a5 f9525b;

    public z4(a5 a5Var, int i10) {
        this.f9524a = i10;
        this.f9525b = a5Var;
    }

    @Override
    public final void run() {
        switch (this.f9524a) {
            case 0:
                a5 a5Var = this.f9525b;
                if (a5Var.f8951w) {
                    a5Var.d();
                    return;
                }
                return;
            default:
                this.f9525b.invalidateSelf();
                return;
        }
    }
}
