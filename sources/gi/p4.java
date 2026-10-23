package gi;
public final class p4 implements Runnable {
    public final int f11410a;
    public final q4 f11411b;

    public p4(q4 q4Var, int i10) {
        this.f11410a = i10;
        this.f11411b = q4Var;
    }

    @Override
    public final void run() {
        switch (this.f11410a) {
            case 0:
                q4 q4Var = this.f11411b;
                if (q4Var.f11432w) {
                    q4Var.d();
                    return;
                }
                return;
            default:
                this.f11411b.invalidateSelf();
                return;
        }
    }
}
