package gi;
public final class p4 implements Runnable {
    public final int f11384a;
    public final q4 f11385b;

    public p4(q4 q4Var, int i10) {
        this.f11384a = i10;
        this.f11385b = q4Var;
    }

    @Override
    public final void run() {
        switch (this.f11384a) {
            case 0:
                q4 q4Var = this.f11385b;
                if (q4Var.f11406w) {
                    q4Var.d();
                    return;
                }
                return;
            default:
                this.f11385b.invalidateSelf();
                return;
        }
    }
}
