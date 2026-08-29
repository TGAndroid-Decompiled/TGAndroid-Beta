package l4;
public final class n0 implements Runnable {
    public final int f14383a;
    public final r0 f14384b;

    public n0(r0 r0Var, int i10) {
        this.f14383a = i10;
        this.f14384b = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f14383a) {
            case 0:
                this.f14384b.l();
                return;
            case 1:
                r0 r0Var = this.f14384b;
                if (!r0Var.X) {
                    y yVar = r0Var.C;
                    yVar.getClass();
                    yVar.a(r0Var);
                    return;
                }
                return;
            default:
                this.f14384b.R = true;
                return;
        }
    }
}
