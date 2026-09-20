package ii;
public final class y2 implements Runnable {
    public final int f11778a;
    public final w3 f11779b;
    public final s4.m0 f11780c;

    public y2(w3 w3Var, s4.m0 m0Var, int i10) {
        this.f11778a = i10;
        this.f11779b = w3Var;
        this.f11780c = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f11778a) {
            case 0:
                this.f11779b.setItemAnimator(this.f11780c);
                return;
            default:
                this.f11779b.setItemAnimator(this.f11780c);
                return;
        }
    }
}
