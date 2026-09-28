package ii;
public final class z2 implements Runnable {
    public final int f11788a;
    public final x3 f11789b;
    public final s4.m0 f11790c;

    public z2(x3 x3Var, s4.m0 m0Var, int i10) {
        this.f11788a = i10;
        this.f11789b = x3Var;
        this.f11790c = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f11788a) {
            case 0:
                this.f11789b.setItemAnimator(this.f11790c);
                return;
            default:
                this.f11789b.setItemAnimator(this.f11790c);
                return;
        }
    }
}
