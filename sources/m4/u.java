package m4;
public final class u implements Runnable {
    public final int f14703a;
    public final a0 f14704b;

    public u(a0 a0Var, int i10) {
        this.f14703a = i10;
        this.f14704b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f14703a) {
            case 0:
                a0 a0Var = this.f14704b;
                y yVar = a0Var.f14467u;
                if (yVar != null) {
                    a0Var.f14466t.D(yVar);
                    return;
                }
                return;
            case 1:
                this.f14704b.getClass();
                return;
            case 2:
                a0.a(this.f14704b);
                return;
            default:
                this.f14704b.t();
                return;
        }
    }
}
