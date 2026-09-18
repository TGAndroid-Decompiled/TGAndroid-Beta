package ii;
public final class y2 implements Runnable {
    public final int f11777a;
    public final w3 f11778b;
    public final s4.m0 f11779c;

    public y2(w3 w3Var, s4.m0 m0Var, int i10) {
        this.f11777a = i10;
        this.f11778b = w3Var;
        this.f11779c = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f11777a) {
            case 0:
                this.f11778b.setItemAnimator(this.f11779c);
                return;
            default:
                this.f11778b.setItemAnimator(this.f11779c);
                return;
        }
    }
}
