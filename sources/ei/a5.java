package ei;
public final class a5 implements Runnable {
    public final int f8221a;
    public final b5 f8222b;

    public a5(b5 b5Var, int i10) {
        this.f8221a = i10;
        this.f8222b = b5Var;
    }

    @Override
    public final void run() {
        switch (this.f8221a) {
            case 0:
                b5 b5Var = this.f8222b;
                if (b5Var.f8249w) {
                    b5Var.d();
                    return;
                }
                return;
            default:
                this.f8222b.invalidateSelf();
                return;
        }
    }
}
