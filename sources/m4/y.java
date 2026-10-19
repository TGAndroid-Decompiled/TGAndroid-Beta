package m4;
public final class y implements Runnable {
    public final int f16775a;
    public final f0 f16776b;

    public y(f0 f0Var, int i10) {
        this.f16775a = i10;
        this.f16776b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f16775a) {
            case 0:
                f0 f0Var = this.f16776b;
                d0 d0Var = f0Var.f16537u;
                if (d0Var != null) {
                    f0Var.f16536t.C(d0Var);
                    return;
                }
                return;
            case 1:
                this.f16776b.getClass();
                return;
            case 2:
                f0.a(this.f16776b);
                return;
            default:
                this.f16776b.t();
                return;
        }
    }
}
