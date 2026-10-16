package m4;
public final class f0 implements Runnable {
    public final int f15178a;
    public final p0 f15179b;

    public f0(p0 p0Var, int i10) {
        this.f15178a = i10;
        this.f15179b = p0Var;
    }

    @Override
    public final void run() {
        switch (this.f15178a) {
            case 0:
                p0 p0Var = this.f15179b;
                e2.m0.W(p0Var.f15303g.f15162l, new f0(p0Var, 1));
                return;
            default:
                this.f15179b.N();
                return;
        }
    }
}
