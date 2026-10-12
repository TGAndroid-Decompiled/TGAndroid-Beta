package ii;
public final class z2 implements Runnable {
    public final int f12872a;
    public final x3 f12873b;
    public final s4.n0 f12874c;

    public z2(x3 x3Var, s4.n0 n0Var, int i10) {
        this.f12872a = i10;
        this.f12873b = x3Var;
        this.f12874c = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f12872a) {
            case 0:
                this.f12873b.setItemAnimator(this.f12874c);
                return;
            default:
                this.f12873b.setItemAnimator(this.f12874c);
                return;
        }
    }
}
