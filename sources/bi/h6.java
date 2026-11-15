package bi;

import di.db;
import di.v8;
public final class h6 implements Runnable {
    public final int f3566a;
    public final u6 f3567b;

    public h6(u6 u6Var, int i7) {
        this.f3566a = i7;
        this.f3567b = u6Var;
    }

    @Override
    public final void run() {
        switch (this.f3566a) {
            case 0:
                this.f3567b.f1(false);
                return;
            case 1:
                this.f3567b.f1(true);
                return;
            case 2:
                u6 u6Var = this.f3567b;
                di.c6 c6Var = new di.c6(u6Var.getContext(), u6Var.U1, u6Var.V1, u6Var.J0, null);
                long j3 = u6Var.Y1.f28280id;
                String str = u6Var.f3905b2;
                c6Var.j3 = true;
                v8.y(c6Var.f29679a, false).K(j3, new ai.u1(8, c6Var, str));
                return;
            case 3:
                u6 u6Var2 = this.f3567b;
                m0.g1(u6Var2.getContext(), u6Var2.Y1, u6Var2.J0);
                return;
            case 4:
                u6 u6Var3 = this.f3567b;
                new db(u6Var3.getContext(), u6Var3.J0).show();
                return;
            default:
                this.f3567b.dismiss();
                return;
        }
    }
}
