package m4;
public final class g0 implements Runnable {
    public final int f15448a;
    public final q0 f15449b;

    public g0(q0 q0Var, int i10) {
        this.f15448a = i10;
        this.f15449b = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f15448a) {
            case 0:
                q0 q0Var = this.f15449b;
                e2.m0.W(q0Var.f15573g.f15432l, new g0(q0Var, 1));
                return;
            default:
                this.f15449b.N();
                return;
        }
    }
}
