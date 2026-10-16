package m4;
public final class y implements Runnable {
    public final int f15417a;
    public final e0 f15418b;

    public y(e0 e0Var, int i10) {
        this.f15417a = i10;
        this.f15418b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f15417a) {
            case 0:
                e0 e0Var = this.f15418b;
                c0 c0Var = e0Var.f15171u;
                if (c0Var != null) {
                    e0Var.f15170t.C(c0Var);
                    return;
                }
                return;
            case 1:
                this.f15418b.getClass();
                return;
            case 2:
                e0.a(this.f15418b);
                return;
            default:
                this.f15418b.t();
                return;
        }
    }
}
