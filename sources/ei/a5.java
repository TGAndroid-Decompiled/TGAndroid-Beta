package ei;
public final class a5 implements Runnable {
    public final int f8220a;
    public final b5 f8221b;

    public a5(b5 b5Var, int i10) {
        this.f8220a = i10;
        this.f8221b = b5Var;
    }

    @Override
    public final void run() {
        switch (this.f8220a) {
            case 0:
                b5 b5Var = this.f8221b;
                if (b5Var.f8248w) {
                    b5Var.d();
                    return;
                }
                return;
            default:
                this.f8221b.invalidateSelf();
                return;
        }
    }
}
