package bi;
public final class g3 implements Runnable {
    public final int f3036a;
    public final d4 f3037b;
    public final s4.l0 f3038c;

    public g3(d4 d4Var, s4.l0 l0Var, int i10) {
        this.f3036a = i10;
        this.f3037b = d4Var;
        this.f3038c = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f3036a) {
            case 0:
                this.f3037b.setItemAnimator(this.f3038c);
                return;
            default:
                this.f3037b.setItemAnimator(this.f3038c);
                return;
        }
    }
}
