package ei;
public final class z4 implements Runnable {
    public final int f9523a;
    public final a5 f9524b;

    public z4(a5 a5Var, int i10) {
        this.f9523a = i10;
        this.f9524b = a5Var;
    }

    @Override
    public final void run() {
        switch (this.f9523a) {
            case 0:
                a5 a5Var = this.f9524b;
                if (a5Var.f8950w) {
                    a5Var.d();
                    return;
                }
                return;
            default:
                this.f9524b.invalidateSelf();
                return;
        }
    }
}
