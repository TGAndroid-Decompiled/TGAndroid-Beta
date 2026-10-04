package ii;
public final class z2 implements Runnable {
    public final int f12825a;
    public final x3 f12826b;
    public final s4.m0 f12827c;

    public z2(x3 x3Var, s4.m0 m0Var, int i10) {
        this.f12825a = i10;
        this.f12826b = x3Var;
        this.f12827c = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f12825a) {
            case 0:
                this.f12826b.setItemAnimator(this.f12827c);
                return;
            default:
                this.f12826b.setItemAnimator(this.f12827c);
                return;
        }
    }
}
