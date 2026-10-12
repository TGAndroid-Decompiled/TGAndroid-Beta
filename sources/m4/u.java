package m4;
public final class u implements Runnable {
    public final int f15979a;
    public final c0 f15980b;

    public u(c0 c0Var, int i10) {
        this.f15979a = i10;
        this.f15980b = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f15979a) {
            case 0:
                c0 c0Var = this.f15980b;
                a0 a0Var = c0Var.f15749u;
                if (a0Var != null) {
                    c0Var.f15748t.D(a0Var);
                    return;
                }
                return;
            case 1:
                this.f15980b.getClass();
                return;
            case 2:
                c0.a(this.f15980b);
                return;
            default:
                this.f15980b.t();
                return;
        }
    }
}
