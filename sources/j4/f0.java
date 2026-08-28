package j4;
public final class f0 implements Runnable {
    public final int f13447a;
    public final h0 f13448b;
    public final Object f13449c;
    public final q d;
    public final y f13450e;

    public f0(h0 h0Var, i0 i0Var, q qVar, y yVar, int i9) {
        this.f13447a = i9;
        this.f13448b = h0Var;
        this.f13449c = i0Var;
        this.d = qVar;
        this.f13450e = yVar;
    }

    @Override
    public final void run() {
        switch (this.f13447a) {
            case 0:
                h0 h0Var = this.f13448b;
                this.f13449c.g(h0Var.f13464a, h0Var.f13465b, this.d, this.f13450e);
                return;
            case 1:
                h0 h0Var2 = this.f13448b;
                this.f13449c.e(h0Var2.f13464a, h0Var2.f13465b, this.d, this.f13450e);
                return;
            default:
                h0 h0Var3 = this.f13448b;
                this.f13449c.f(h0Var3.f13464a, h0Var3.f13465b, this.d, this.f13450e);
                return;
        }
    }
}
