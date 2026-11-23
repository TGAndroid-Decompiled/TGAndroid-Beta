package bi;

import di.gb;
public final class q8 implements Runnable {
    public final int f4040a;
    public final c9 f4041b;

    public q8(c9 c9Var, int i7) {
        this.f4040a = i7;
        this.f4041b = c9Var;
    }

    @Override
    public final void run() {
        switch (this.f4040a) {
            case 0:
                this.f4041b.g1(false);
                return;
            case 1:
                this.f4041b.g1(true);
                return;
            case 2:
                c9 c9Var = this.f4041b;
                di.f6 f6Var = new di.f6(c9Var.getContext(), c9Var.U1, c9Var.V1, c9Var.J0, null);
                long j3 = c9Var.Y1.f28663id;
                String str = c9Var.f3508b2;
                f6Var.f8818m3 = true;
                di.y8.y(f6Var.f30173a, false).K(j3, new ai.y1(9, f6Var, str));
                return;
            case 3:
                c9 c9Var2 = this.f4041b;
                m0.h1(c9Var2.getContext(), c9Var2.Y1, c9Var2.J0);
                return;
            case 4:
                c9 c9Var3 = this.f4041b;
                new gb(c9Var3.getContext(), c9Var3.J0).show();
                return;
            default:
                this.f4041b.dismiss();
                return;
        }
    }
}
