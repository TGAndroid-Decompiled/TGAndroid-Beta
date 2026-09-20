package ei;
public final class a5 implements Runnable {
    public final int f8237a;
    public final b5 f8238b;

    public a5(b5 b5Var, int i10) {
        this.f8237a = i10;
        this.f8238b = b5Var;
    }

    @Override
    public final void run() {
        switch (this.f8237a) {
            case 0:
                b5 b5Var = this.f8238b;
                if (b5Var.f8265w) {
                    b5Var.d();
                    return;
                }
                return;
            default:
                this.f8238b.invalidateSelf();
                return;
        }
    }
}
