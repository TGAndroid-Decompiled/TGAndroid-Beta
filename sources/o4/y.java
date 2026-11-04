package o4;
public final class y implements Runnable {
    public final int f20898a;
    public final e0 f20899b;

    public y(e0 e0Var, int i3) {
        this.f20898a = i3;
        this.f20899b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f20898a) {
            case 0:
                e0 e0Var = this.f20899b;
                c0 c0Var = e0Var.f20637u;
                if (c0Var != null) {
                    e0Var.f20636t.s(c0Var);
                    return;
                }
                return;
            case 1:
                this.f20899b.getClass();
                return;
            case 2:
                e0.a(this.f20899b);
                return;
            default:
                this.f20899b.t();
                return;
        }
    }
}
