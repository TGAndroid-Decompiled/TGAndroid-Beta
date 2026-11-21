package oi;
public final class x2 implements Runnable {
    public final int f22523a;
    public final t3 f22524b;
    public final v4.n0 f22525c;

    public x2(t3 t3Var, v4.n0 n0Var, int i7) {
        this.f22523a = i7;
        this.f22524b = t3Var;
        this.f22525c = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f22523a) {
            case 0:
                this.f22524b.setItemAnimator(this.f22525c);
                return;
            case 1:
                this.f22524b.setItemAnimator(this.f22525c);
                return;
            default:
                this.f22524b.setItemAnimator(this.f22525c);
                return;
        }
    }
}
