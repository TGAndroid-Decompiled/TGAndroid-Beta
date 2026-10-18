package m4;
public final class y implements Runnable {
    public final int f16774a;
    public final f0 f16775b;

    public y(f0 f0Var, int i10) {
        this.f16774a = i10;
        this.f16775b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f16774a) {
            case 0:
                f0 f0Var = this.f16775b;
                d0 d0Var = f0Var.f16536u;
                if (d0Var != null) {
                    f0Var.f16535t.C(d0Var);
                    return;
                }
                return;
            case 1:
                this.f16775b.getClass();
                return;
            case 2:
                f0.a(this.f16775b);
                return;
            default:
                this.f16775b.t();
                return;
        }
    }
}
