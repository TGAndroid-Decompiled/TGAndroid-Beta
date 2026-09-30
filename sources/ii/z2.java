package ii;
public final class z2 implements Runnable {
    public final int f11803a;
    public final x3 f11804b;
    public final s4.m0 f11805c;

    public z2(x3 x3Var, s4.m0 m0Var, int i10) {
        this.f11803a = i10;
        this.f11804b = x3Var;
        this.f11805c = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f11803a) {
            case 0:
                this.f11804b.setItemAnimator(this.f11805c);
                return;
            default:
                this.f11804b.setItemAnimator(this.f11805c);
                return;
        }
    }
}
