package ki;
public final class y2 implements Runnable {
    public final int f15653a;
    public final w3 f15654b;
    public final s4.l0 f15655c;

    public y2(w3 w3Var, s4.l0 l0Var, int i10) {
        this.f15653a = i10;
        this.f15654b = w3Var;
        this.f15655c = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f15653a) {
            case 0:
                this.f15654b.setItemAnimator(this.f15655c);
                return;
            default:
                this.f15654b.setItemAnimator(this.f15655c);
                return;
        }
    }
}
