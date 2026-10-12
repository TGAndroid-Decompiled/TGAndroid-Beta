package m4;
public final class j0 implements Runnable {
    public final int f15471a;
    public final q0 f15472b;
    public final n1 f15473c;

    public j0(q0 q0Var, n1 n1Var, int i10) {
        this.f15471a = i10;
        this.f15472b = q0Var;
        this.f15473c = n1Var;
    }

    @Override
    public final void run() {
        b2.p1 p1Var;
        switch (this.f15471a) {
            case 0:
                q0 q0Var = this.f15472b;
                n4.s sVar = q0Var.f15578m;
                n1 n1Var = this.f15473c;
                sVar.A(q0Var.G(n1Var));
                o0 o0Var = q0Var.f15574i;
                if (n1Var.s().a(17)) {
                    p1Var = n1Var.y0();
                } else {
                    p1Var = b2.p1.f2281a;
                }
                o0Var.s(p1Var);
                return;
            default:
                q0 q0Var2 = this.f15472b;
                q0Var2.f15578m.A(q0Var2.G(this.f15473c));
                return;
        }
    }
}
