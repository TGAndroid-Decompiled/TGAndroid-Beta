package ii;
public final class z2 implements Runnable {
    public final int f12826a;
    public final x3 f12827b;
    public final s4.m0 f12828c;

    public z2(x3 x3Var, s4.m0 m0Var, int i10) {
        this.f12826a = i10;
        this.f12827b = x3Var;
        this.f12828c = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f12826a) {
            case 0:
                this.f12827b.setItemAnimator(this.f12828c);
                return;
            default:
                this.f12827b.setItemAnimator(this.f12828c);
                return;
        }
    }
}
