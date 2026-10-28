package li;
public final class x2 implements Runnable {
    public final int f17617a;
    public final v3 f17618b;
    public final s4.m0 f17619c;

    public x2(v3 v3Var, s4.m0 m0Var, int i10) {
        this.f17617a = i10;
        this.f17618b = v3Var;
        this.f17619c = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f17617a) {
            case 0:
                this.f17618b.setItemAnimator(this.f17619c);
                return;
            default:
                this.f17618b.setItemAnimator(this.f17619c);
                return;
        }
    }
}
