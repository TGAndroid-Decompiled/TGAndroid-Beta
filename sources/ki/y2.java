package ki;
public final class y2 implements Runnable {
    public final int f15658a;
    public final w3 f15659b;
    public final s4.l0 f15660c;

    public y2(w3 w3Var, s4.l0 l0Var, int i10) {
        this.f15658a = i10;
        this.f15659b = w3Var;
        this.f15660c = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f15658a) {
            case 0:
                this.f15659b.setItemAnimator(this.f15660c);
                return;
            default:
                this.f15659b.setItemAnimator(this.f15660c);
                return;
        }
    }
}
