package bi;

import di.gb;
public final class r8 implements Runnable {
    public final int f4055a;
    public final d9 f4056b;

    public r8(d9 d9Var, int i7) {
        this.f4055a = i7;
        this.f4056b = d9Var;
    }

    @Override
    public final void run() {
        switch (this.f4055a) {
            case 0:
                this.f4056b.g1(false);
                return;
            case 1:
                this.f4056b.g1(true);
                return;
            case 2:
                d9 d9Var = this.f4056b;
                di.f6 f6Var = new di.f6(d9Var.getContext(), d9Var.U1, d9Var.V1, d9Var.J0, null);
                long j3 = d9Var.Y1.f28660id;
                String str = d9Var.f3532b2;
                f6Var.f8815m3 = true;
                di.y8.y(f6Var.f30170a, false).K(j3, new ai.x1(9, f6Var, str));
                return;
            case 3:
                d9 d9Var2 = this.f4056b;
                m0.h1(d9Var2.getContext(), d9Var2.Y1, d9Var2.J0);
                return;
            case 4:
                d9 d9Var3 = this.f4056b;
                new gb(d9Var3.getContext(), d9Var3.J0).show();
                return;
            default:
                this.f4056b.dismiss();
                return;
        }
    }
}
