package m4;
public final class u implements Runnable {
    public final int f16296a;
    public final a0 f16297b;

    public u(a0 a0Var, int i10) {
        this.f16296a = i10;
        this.f16297b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f16296a) {
            case 0:
                a0 a0Var = this.f16297b;
                y yVar = a0Var.f16053u;
                if (yVar != null) {
                    a0Var.f16052t.D(yVar);
                    return;
                }
                return;
            case 1:
                this.f16297b.getClass();
                return;
            case 2:
                a0.a(this.f16297b);
                return;
            default:
                this.f16297b.t();
                return;
        }
    }
}
