package m4;
public final class u implements Runnable {
    public final int f14935a;
    public final a0 f14936b;

    public u(a0 a0Var, int i10) {
        this.f14935a = i10;
        this.f14936b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f14935a) {
            case 0:
                a0 a0Var = this.f14936b;
                y yVar = a0Var.f14709u;
                if (yVar != null) {
                    a0Var.f14708t.D(yVar);
                    return;
                }
                return;
            case 1:
                this.f14936b.getClass();
                return;
            case 2:
                a0.a(this.f14936b);
                return;
            default:
                this.f14936b.t();
                return;
        }
    }
}
