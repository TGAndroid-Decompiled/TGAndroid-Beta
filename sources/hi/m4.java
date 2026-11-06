package hi;
public final class m4 implements Runnable {
    public final int f14796a;
    public final n4 f14797b;

    public m4(n4 n4Var, int i7) {
        this.f14796a = i7;
        this.f14797b = n4Var;
    }

    @Override
    public final void run() {
        switch (this.f14796a) {
            case 0:
                n4 n4Var = this.f14797b;
                if (n4Var.f14829x) {
                    n4Var.d();
                    return;
                }
                return;
            default:
                this.f14797b.invalidateSelf();
                return;
        }
    }
}
