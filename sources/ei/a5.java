package ei;
public final class a5 implements Runnable {
    public final int f8236a;
    public final b5 f8237b;

    public a5(b5 b5Var, int i10) {
        this.f8236a = i10;
        this.f8237b = b5Var;
    }

    @Override
    public final void run() {
        switch (this.f8236a) {
            case 0:
                b5 b5Var = this.f8237b;
                if (b5Var.f8264w) {
                    b5Var.d();
                    return;
                }
                return;
            default:
                this.f8237b.invalidateSelf();
                return;
        }
    }
}
