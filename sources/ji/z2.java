package ji;
public final class z2 implements Runnable {
    public final int f13712a;
    public final x3 f13713b;
    public final s4.l0 f13714c;

    public z2(x3 x3Var, s4.l0 l0Var, int i10) {
        this.f13712a = i10;
        this.f13713b = x3Var;
        this.f13714c = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f13712a) {
            case 0:
                this.f13713b.setItemAnimator(this.f13714c);
                return;
            default:
                this.f13713b.setItemAnimator(this.f13714c);
                return;
        }
    }
}
