package ei;
public final class a5 implements Runnable {
    public final int f8232a;
    public final b5 f8233b;

    public a5(b5 b5Var, int i10) {
        this.f8232a = i10;
        this.f8233b = b5Var;
    }

    @Override
    public final void run() {
        switch (this.f8232a) {
            case 0:
                b5 b5Var = this.f8233b;
                if (b5Var.f8260w) {
                    b5Var.d();
                    return;
                }
                return;
            default:
                this.f8233b.invalidateSelf();
                return;
        }
    }
}
