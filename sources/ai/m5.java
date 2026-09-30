package ai;
public final class m5 implements Runnable {
    public final int f1249a;
    public final v5 f1250b;

    public m5(v5 v5Var, int i10) {
        this.f1249a = i10;
        this.f1250b = v5Var;
    }

    @Override
    public final void run() {
        switch (this.f1249a) {
            case 0:
                ((ac) this.f1250b.f1617l.Q1).g(false);
                return;
            case 1:
                e6 e6Var = this.f1250b.f1617l;
                x5 x5Var = e6Var.Q1;
                if (x5Var != null) {
                    jc jcVar = ((ac) x5Var).d;
                    jcVar.Z0 = false;
                    jcVar.P();
                }
                e6Var.f1(false);
                e6Var.f795h3 = true;
                e6Var.K0.D(true);
                return;
            case 2:
                e6 e6Var2 = this.f1250b.f1617l;
                e6Var2.U3 = true;
                e6Var2.setActive(false);
                return;
            default:
                e6 e6Var3 = this.f1250b.f1617l;
                e6Var3.U3 = true;
                e6Var3.setActive(false);
                return;
        }
    }
}
