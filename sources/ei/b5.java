package ei;
public final class b5 implements Runnable {
    public final int f8945a;
    public final c5 f8946b;

    public b5(c5 c5Var, int i10) {
        this.f8945a = i10;
        this.f8946b = c5Var;
    }

    @Override
    public final void run() {
        switch (this.f8945a) {
            case 0:
                c5 c5Var = this.f8946b;
                if (c5Var.f8975w) {
                    c5Var.d();
                    return;
                }
                return;
            default:
                this.f8946b.invalidateSelf();
                return;
        }
    }
}
