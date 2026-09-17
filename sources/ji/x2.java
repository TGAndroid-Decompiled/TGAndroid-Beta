package ji;
public final class x2 implements Runnable {
    public final int f14352a;
    public final v3 f14353b;
    public final s4.m0 f14354c;

    public x2(v3 v3Var, s4.m0 m0Var, int i10) {
        this.f14352a = i10;
        this.f14353b = v3Var;
        this.f14354c = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f14352a) {
            case 0:
                this.f14353b.setItemAnimator(this.f14354c);
                return;
            default:
                this.f14353b.setItemAnimator(this.f14354c);
                return;
        }
    }
}
