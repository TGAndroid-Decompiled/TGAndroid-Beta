package m4;
public final class z implements Runnable {
    public final int f15687a;
    public final f0 f15688b;

    public z(f0 f0Var, int i10) {
        this.f15687a = i10;
        this.f15688b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f15687a) {
            case 0:
                f0 f0Var = this.f15688b;
                d0 d0Var = f0Var.f15441u;
                if (d0Var != null) {
                    f0Var.f15440t.C(d0Var);
                    return;
                }
                return;
            case 1:
                this.f15688b.getClass();
                return;
            case 2:
                f0.a(this.f15688b);
                return;
            default:
                this.f15688b.t();
                return;
        }
    }
}
