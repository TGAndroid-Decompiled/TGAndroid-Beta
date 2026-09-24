package ei;
public final class a5 implements Runnable {
    public final int f8219a;
    public final b5 f8220b;

    public a5(b5 b5Var, int i10) {
        this.f8219a = i10;
        this.f8220b = b5Var;
    }

    @Override
    public final void run() {
        switch (this.f8219a) {
            case 0:
                b5 b5Var = this.f8220b;
                if (b5Var.f8247w) {
                    b5Var.d();
                    return;
                }
                return;
            default:
                this.f8220b.invalidateSelf();
                return;
        }
    }
}
