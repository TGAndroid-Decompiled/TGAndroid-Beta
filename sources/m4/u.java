package m4;
public final class u implements Runnable {
    public final int f14682a;
    public final a0 f14683b;

    public u(a0 a0Var, int i10) {
        this.f14682a = i10;
        this.f14683b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f14682a) {
            case 0:
                a0 a0Var = this.f14683b;
                y yVar = a0Var.f14455u;
                if (yVar != null) {
                    a0Var.f14454t.D(yVar);
                    return;
                }
                return;
            case 1:
                this.f14683b.getClass();
                return;
            case 2:
                a0.a(this.f14683b);
                return;
            default:
                this.f14683b.t();
                return;
        }
    }
}
