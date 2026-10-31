package m4;
public final class j0 implements Runnable {
    public final int f12785a;
    public final p0 f12786b;
    public final n1 f12787c;

    public j0(p0 p0Var, n1 n1Var, int i10) {
        this.f12785a = i10;
        this.f12786b = p0Var;
        this.f12787c = n1Var;
    }

    @Override
    public final void run() {
        b2.o1 o1Var;
        switch (this.f12785a) {
            case 0:
                p0 p0Var = this.f12786b;
                n4.q qVar = p0Var.f12883n;
                n1 n1Var = this.f12787c;
                qVar.H(p0Var.h0(n1Var));
                n0 n0Var = p0Var.f12879j;
                if (n1Var.s().a(17)) {
                    o1Var = n1Var.y0();
                } else {
                    o1Var = b2.o1.f2172a;
                }
                n0Var.v(o1Var);
                return;
            default:
                p0 p0Var2 = this.f12786b;
                p0Var2.f12883n.H(p0Var2.h0(this.f12787c));
                return;
        }
    }
}
