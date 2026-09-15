package ii;
public final class y2 implements Runnable {
    public final int f11774a;
    public final w3 f11775b;
    public final s4.m0 f11776c;

    public y2(w3 w3Var, s4.m0 m0Var, int i10) {
        this.f11774a = i10;
        this.f11775b = w3Var;
        this.f11776c = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f11774a) {
            case 0:
                this.f11775b.setItemAnimator(this.f11776c);
                return;
            default:
                this.f11775b.setItemAnimator(this.f11776c);
                return;
        }
    }
}
