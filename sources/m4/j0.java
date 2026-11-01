package m4;
public final class j0 implements Runnable {
    public final int f12786a;
    public final p0 f12787b;
    public final n1 f12788c;

    public j0(p0 p0Var, n1 n1Var, int i10) {
        this.f12786a = i10;
        this.f12787b = p0Var;
        this.f12788c = n1Var;
    }

    @Override
    public final void run() {
        b2.o1 o1Var;
        switch (this.f12786a) {
            case 0:
                p0 p0Var = this.f12787b;
                n4.q qVar = p0Var.f12884n;
                n1 n1Var = this.f12788c;
                qVar.H(p0Var.h0(n1Var));
                n0 n0Var = p0Var.f12880j;
                if (n1Var.s().a(17)) {
                    o1Var = n1Var.y0();
                } else {
                    o1Var = b2.o1.f2172a;
                }
                n0Var.v(o1Var);
                return;
            default:
                p0 p0Var2 = this.f12787b;
                p0Var2.f12884n.H(p0Var2.h0(this.f12788c));
                return;
        }
    }
}
