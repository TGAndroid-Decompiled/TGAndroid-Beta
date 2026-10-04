package ei;
public final class b5 implements Runnable {
    public final int f8944a;
    public final c5 f8945b;

    public b5(c5 c5Var, int i10) {
        this.f8944a = i10;
        this.f8945b = c5Var;
    }

    @Override
    public final void run() {
        switch (this.f8944a) {
            case 0:
                c5 c5Var = this.f8945b;
                if (c5Var.f8974w) {
                    c5Var.d();
                    return;
                }
                return;
            default:
                this.f8945b.invalidateSelf();
                return;
        }
    }
}
