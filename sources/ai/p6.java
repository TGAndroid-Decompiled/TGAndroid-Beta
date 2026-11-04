package ai;

import ci.e9;
import ci.nb;
public final class p6 implements Runnable {
    public final int f882a;
    public final d7 f883b;

    public p6(d7 d7Var, int i3) {
        this.f882a = i3;
        this.f883b = d7Var;
    }

    @Override
    public final void run() {
        switch (this.f882a) {
            case 0:
                this.f883b.f1(false);
                return;
            case 1:
                this.f883b.f1(true);
                return;
            case 2:
                d7 d7Var = this.f883b;
                ci.l6 l6Var = new ci.l6(d7Var.getContext(), d7Var.R1, d7Var.S1, d7Var.J0, null);
                long j10 = d7Var.V1.f27230id;
                String str = d7Var.Y1;
                l6Var.f5458g3 = true;
                e9.y(l6Var.f28583a, false).K(j10, new o1(7, l6Var, str));
                return;
            case 3:
                d7 d7Var2 = this.f883b;
                s0.g1(d7Var2.getContext(), d7Var2.V1, d7Var2.J0);
                return;
            case 4:
                d7 d7Var3 = this.f883b;
                new nb(d7Var3.getContext(), d7Var3.J0).show();
                return;
            default:
                this.f883b.dismiss();
                return;
        }
    }
}
