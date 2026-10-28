package m4;
public final class j0 implements Runnable {
    public final int f18087a;
    public final p0 f18088b;
    public final n1 f18089c;

    public j0(p0 p0Var, n1 n1Var, int i10) {
        this.f18087a = i10;
        this.f18088b = p0Var;
        this.f18089c = n1Var;
    }

    @Override
    public final void run() {
        b2.p1 p1Var;
        switch (this.f18087a) {
            case 0:
                p0 p0Var = this.f18088b;
                n4.s sVar = p0Var.f18185m;
                n1 n1Var = this.f18089c;
                sVar.G(p0Var.G(n1Var));
                n0 n0Var = p0Var.f18181i;
                if (n1Var.s().a(17)) {
                    p1Var = n1Var.y0();
                } else {
                    p1Var = b2.p1.f3348a;
                }
                n0Var.s(p1Var);
                return;
            default:
                p0 p0Var2 = this.f18088b;
                p0Var2.f18185m.G(p0Var2.G(this.f18089c));
                return;
        }
    }
}
