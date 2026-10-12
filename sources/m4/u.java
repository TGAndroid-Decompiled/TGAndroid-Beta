package m4;
public final class u implements Runnable {
    public final int f15980a;
    public final c0 f15981b;

    public u(c0 c0Var, int i10) {
        this.f15980a = i10;
        this.f15981b = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f15980a) {
            case 0:
                c0 c0Var = this.f15981b;
                a0 a0Var = c0Var.f15750u;
                if (a0Var != null) {
                    c0Var.f15749t.D(a0Var);
                    return;
                }
                return;
            case 1:
                this.f15981b.getClass();
                return;
            case 2:
                c0.a(this.f15981b);
                return;
            default:
                this.f15981b.t();
                return;
        }
    }
}
