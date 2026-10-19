package gi;
public final class p4 implements Runnable {
    public final int f11386a;
    public final q4 f11387b;

    public p4(q4 q4Var, int i10) {
        this.f11386a = i10;
        this.f11387b = q4Var;
    }

    @Override
    public final void run() {
        switch (this.f11386a) {
            case 0:
                q4 q4Var = this.f11387b;
                if (q4Var.f11408w) {
                    q4Var.d();
                    return;
                }
                return;
            default:
                this.f11387b.invalidateSelf();
                return;
        }
    }
}
