package di;
public final class f5 implements Runnable {
    public final int f6631a;
    public final g5 f6632b;

    public f5(g5 g5Var, int i10) {
        this.f6631a = i10;
        this.f6632b = g5Var;
    }

    @Override
    public final void run() {
        switch (this.f6631a) {
            case 0:
                g5 g5Var = this.f6632b;
                if (g5Var.f6652w) {
                    g5Var.d();
                    return;
                }
                return;
            default:
                this.f6632b.invalidateSelf();
                return;
        }
    }
}
