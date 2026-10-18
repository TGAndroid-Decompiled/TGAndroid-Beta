package gi;
public final class p4 implements Runnable {
    public final int f11387a;
    public final q4 f11388b;

    public p4(q4 q4Var, int i10) {
        this.f11387a = i10;
        this.f11388b = q4Var;
    }

    @Override
    public final void run() {
        switch (this.f11387a) {
            case 0:
                q4 q4Var = this.f11388b;
                if (q4Var.f11409w) {
                    q4Var.d();
                    return;
                }
                return;
            default:
                this.f11388b.invalidateSelf();
                return;
        }
    }
}
