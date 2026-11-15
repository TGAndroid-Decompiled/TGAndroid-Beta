package fi;
public final class n3 implements Runnable {
    public final int f12073a;
    public final t3 f12074b;

    public n3(t3 t3Var, int i7) {
        this.f12073a = i7;
        this.f12074b = t3Var;
    }

    @Override
    public final void run() {
        switch (this.f12073a) {
            case 0:
                ((z8) this.f12074b.f12360x.A1).g(false);
                return;
            case 1:
                b4 b4Var = this.f12074b.f12360x;
                u3 u3Var = b4Var.A1;
                if (u3Var != null) {
                    i9 i9Var = ((z8) u3Var).d;
                    i9Var.Z0 = false;
                    i9Var.V();
                }
                b4Var.d1(false);
                b4Var.R2 = true;
                b4Var.f11526u0.E(true);
                return;
            case 2:
                b4 b4Var2 = this.f12074b.f12360x;
                b4Var2.E3 = true;
                b4Var2.setActive(false);
                return;
            default:
                b4 b4Var3 = this.f12074b.f12360x;
                b4Var3.E3 = true;
                b4Var3.setActive(false);
                return;
        }
    }
}
