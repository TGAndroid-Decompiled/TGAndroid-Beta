package ei;
public final class a5 implements Runnable {
    public final int f8234a;
    public final b5 f8235b;

    public a5(b5 b5Var, int i10) {
        this.f8234a = i10;
        this.f8235b = b5Var;
    }

    @Override
    public final void run() {
        switch (this.f8234a) {
            case 0:
                b5 b5Var = this.f8235b;
                if (b5Var.f8262w) {
                    b5Var.d();
                    return;
                }
                return;
            default:
                this.f8235b.invalidateSelf();
                return;
        }
    }
}
