package ii;
public final class z2 implements Runnable {
    public final int f11791a;
    public final x3 f11792b;
    public final s4.m0 f11793c;

    public z2(x3 x3Var, s4.m0 m0Var, int i10) {
        this.f11791a = i10;
        this.f11792b = x3Var;
        this.f11793c = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f11791a) {
            case 0:
                this.f11792b.setItemAnimator(this.f11793c);
                return;
            default:
                this.f11792b.setItemAnimator(this.f11793c);
                return;
        }
    }
}
