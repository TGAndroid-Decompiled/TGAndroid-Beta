package hi;
public final class m4 implements Runnable {
    public final int f14799a;
    public final n4 f14800b;

    public m4(n4 n4Var, int i7) {
        this.f14799a = i7;
        this.f14800b = n4Var;
    }

    @Override
    public final void run() {
        switch (this.f14799a) {
            case 0:
                n4 n4Var = this.f14800b;
                if (n4Var.f14832x) {
                    n4Var.d();
                    return;
                }
                return;
            default:
                this.f14800b.invalidateSelf();
                return;
        }
    }
}
