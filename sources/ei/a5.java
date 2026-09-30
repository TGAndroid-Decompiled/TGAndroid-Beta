package ei;
public final class a5 implements Runnable {
    public final int f8231a;
    public final b5 f8232b;

    public a5(b5 b5Var, int i10) {
        this.f8231a = i10;
        this.f8232b = b5Var;
    }

    @Override
    public final void run() {
        switch (this.f8231a) {
            case 0:
                b5 b5Var = this.f8232b;
                if (b5Var.f8259w) {
                    b5Var.d();
                    return;
                }
                return;
            default:
                this.f8232b.invalidateSelf();
                return;
        }
    }
}
