package gi;
public final class p4 implements Runnable {
    public final int f11385a;
    public final q4 f11386b;

    public p4(q4 q4Var, int i10) {
        this.f11385a = i10;
        this.f11386b = q4Var;
    }

    @Override
    public final void run() {
        switch (this.f11385a) {
            case 0:
                q4 q4Var = this.f11386b;
                if (q4Var.f11407w) {
                    q4Var.d();
                    return;
                }
                return;
            default:
                this.f11386b.invalidateSelf();
                return;
        }
    }
}
