package fi;
public final class l3 implements Runnable {
    public final int f12260a;
    public final r3 f12261b;

    public l3(r3 r3Var, int i7) {
        this.f12260a = i7;
        this.f12261b = r3Var;
    }

    @Override
    public final void run() {
        switch (this.f12260a) {
            case 0:
                ((w8) this.f12261b.f12532x.A1).g(false);
                return;
            case 1:
                z3 z3Var = this.f12261b.f12532x;
                s3 s3Var = z3Var.A1;
                if (s3Var != null) {
                    f9 f9Var = ((w8) s3Var).d;
                    f9Var.Z0 = false;
                    f9Var.V();
                }
                z3Var.d1(false);
                z3Var.R2 = true;
                z3Var.f12920u0.E(true);
                return;
            case 2:
                z3 z3Var2 = this.f12261b.f12532x;
                z3Var2.E3 = true;
                z3Var2.setActive(false);
                return;
            default:
                z3 z3Var3 = this.f12261b.f12532x;
                z3Var3.E3 = true;
                z3Var3.setActive(false);
                return;
        }
    }
}
