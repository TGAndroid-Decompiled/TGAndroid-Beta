package ki;
public final class a4 implements Runnable {
    public final int f18571a;
    public final b4 f18572b;

    public a4(b4 b4Var, int i7) {
        this.f18571a = i7;
        this.f18572b = b4Var;
    }

    @Override
    public final void run() {
        switch (this.f18571a) {
            case 0:
                b4 b4Var = this.f18572b;
                if (b4Var.f18592x) {
                    b4Var.d();
                    return;
                }
                return;
            default:
                this.f18572b.invalidateSelf();
                return;
        }
    }
}
