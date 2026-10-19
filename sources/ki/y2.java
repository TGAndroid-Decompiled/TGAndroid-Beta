package ki;
public final class y2 implements Runnable {
    public final int f15659a;
    public final w3 f15660b;
    public final s4.l0 f15661c;

    public y2(w3 w3Var, s4.l0 l0Var, int i10) {
        this.f15659a = i10;
        this.f15660b = w3Var;
        this.f15661c = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f15659a) {
            case 0:
                this.f15660b.setItemAnimator(this.f15661c);
                return;
            default:
                this.f15660b.setItemAnimator(this.f15661c);
                return;
        }
    }
}
