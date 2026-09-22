package ii;
public final class y2 implements Runnable {
    public final int f11776a;
    public final w3 f11777b;
    public final s4.m0 f11778c;

    public y2(w3 w3Var, s4.m0 m0Var, int i10) {
        this.f11776a = i10;
        this.f11777b = w3Var;
        this.f11778c = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f11776a) {
            case 0:
                this.f11777b.setItemAnimator(this.f11778c);
                return;
            default:
                this.f11777b.setItemAnimator(this.f11778c);
                return;
        }
    }
}
