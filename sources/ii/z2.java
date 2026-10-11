package ii;
public final class z2 implements Runnable {
    public final int f12871a;
    public final x3 f12872b;
    public final s4.n0 f12873c;

    public z2(x3 x3Var, s4.n0 n0Var, int i10) {
        this.f12871a = i10;
        this.f12872b = x3Var;
        this.f12873c = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f12871a) {
            case 0:
                this.f12872b.setItemAnimator(this.f12873c);
                return;
            default:
                this.f12872b.setItemAnimator(this.f12873c);
                return;
        }
    }
}
