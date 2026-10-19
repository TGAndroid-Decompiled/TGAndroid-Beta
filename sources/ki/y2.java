package ki;
public final class y2 implements Runnable {
    public final int f15661a;
    public final w3 f15662b;
    public final s4.l0 f15663c;

    public y2(w3 w3Var, s4.l0 l0Var, int i10) {
        this.f15661a = i10;
        this.f15662b = w3Var;
        this.f15663c = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f15661a) {
            case 0:
                this.f15662b.setItemAnimator(this.f15663c);
                return;
            default:
                this.f15662b.setItemAnimator(this.f15663c);
                return;
        }
    }
}
