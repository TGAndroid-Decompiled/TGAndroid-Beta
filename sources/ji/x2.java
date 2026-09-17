package ji;
public final class x2 implements Runnable {
    public final int f14326a;
    public final v3 f14327b;
    public final s4.m0 f14328c;

    public x2(v3 v3Var, s4.m0 m0Var, int i10) {
        this.f14326a = i10;
        this.f14327b = v3Var;
        this.f14328c = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f14326a) {
            case 0:
                this.f14327b.setItemAnimator(this.f14328c);
                return;
            default:
                this.f14327b.setItemAnimator(this.f14328c);
                return;
        }
    }
}
