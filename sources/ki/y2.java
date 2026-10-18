package ki;
public final class y2 implements Runnable {
    public final int f15660a;
    public final w3 f15661b;
    public final s4.l0 f15662c;

    public y2(w3 w3Var, s4.l0 l0Var, int i10) {
        this.f15660a = i10;
        this.f15661b = w3Var;
        this.f15662c = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f15660a) {
            case 0:
                this.f15661b.setItemAnimator(this.f15662c);
                return;
            default:
                this.f15661b.setItemAnimator(this.f15662c);
                return;
        }
    }
}
