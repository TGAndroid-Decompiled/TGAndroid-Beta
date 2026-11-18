package bi;

import di.gb;
public final class o8 implements Runnable {
    public final int f3954a;
    public final a9 f3955b;

    public o8(a9 a9Var, int i7) {
        this.f3954a = i7;
        this.f3955b = a9Var;
    }

    @Override
    public final void run() {
        switch (this.f3954a) {
            case 0:
                this.f3955b.g1(false);
                return;
            case 1:
                this.f3955b.g1(true);
                return;
            case 2:
                a9 a9Var = this.f3955b;
                di.f6 f6Var = new di.f6(a9Var.getContext(), a9Var.U1, a9Var.V1, a9Var.J0, null);
                long j3 = a9Var.Y1.f28634id;
                String str = a9Var.f3424b2;
                f6Var.f8794m3 = true;
                di.x8.y(f6Var.f30189a, false).K(j3, new ai.v1(9, f6Var, str));
                return;
            case 3:
                a9 a9Var2 = this.f3955b;
                m0.h1(a9Var2.getContext(), a9Var2.Y1, a9Var2.J0);
                return;
            case 4:
                a9 a9Var3 = this.f3955b;
                new gb(a9Var3.getContext(), a9Var3.J0).show();
                return;
            default:
                this.f3955b.dismiss();
                return;
        }
    }
}
