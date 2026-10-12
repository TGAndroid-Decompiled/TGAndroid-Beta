package ei;
public final class z4 implements Runnable {
    public final int f9521a;
    public final a5 f9522b;

    public z4(a5 a5Var, int i10) {
        this.f9521a = i10;
        this.f9522b = a5Var;
    }

    @Override
    public final void run() {
        switch (this.f9521a) {
            case 0:
                a5 a5Var = this.f9522b;
                if (a5Var.f8948w) {
                    a5Var.d();
                    return;
                }
                return;
            default:
                this.f9522b.invalidateSelf();
                return;
        }
    }
}
