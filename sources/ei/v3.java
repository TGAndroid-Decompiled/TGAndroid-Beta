package ei;
public final class v3 implements Runnable {
    public final int f11122a;
    public final b4 f11123b;

    public v3(b4 b4Var, int i3) {
        this.f11122a = i3;
        this.f11123b = b4Var;
    }

    @Override
    public final void run() {
        switch (this.f11122a) {
            case 0:
                ((i9) this.f11123b.f10126x.A1).g(false);
                return;
            case 1:
                j4 j4Var = this.f11123b.f10126x;
                c4 c4Var = j4Var.A1;
                if (c4Var != null) {
                    r9 r9Var = ((i9) c4Var).d;
                    r9Var.f10910a1 = false;
                    r9Var.d0();
                }
                j4Var.d1(false);
                j4Var.R2 = true;
                j4Var.f10510u0.E(true);
                return;
            case 2:
                j4 j4Var2 = this.f11123b.f10126x;
                j4Var2.E3 = true;
                j4Var2.setActive(false);
                return;
            default:
                j4 j4Var3 = this.f11123b.f10126x;
                j4Var3.E3 = true;
                j4Var3.setActive(false);
                return;
        }
    }
}
