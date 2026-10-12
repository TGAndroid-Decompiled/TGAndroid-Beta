package ji;
public final class z2 implements Runnable {
    public final int f13709a;
    public final x3 f13710b;
    public final s4.l0 f13711c;

    public z2(x3 x3Var, s4.l0 l0Var, int i10) {
        this.f13709a = i10;
        this.f13710b = x3Var;
        this.f13711c = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f13709a) {
            case 0:
                this.f13710b.setItemAnimator(this.f13711c);
                return;
            default:
                this.f13710b.setItemAnimator(this.f13711c);
                return;
        }
    }
}
