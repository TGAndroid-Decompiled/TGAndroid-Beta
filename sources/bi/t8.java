package bi;

import di.gb;
public final class t8 implements Runnable {
    public final int f4082a;
    public final f9 f4083b;

    public t8(f9 f9Var, int i7) {
        this.f4082a = i7;
        this.f4083b = f9Var;
    }

    @Override
    public final void run() {
        switch (this.f4082a) {
            case 0:
                this.f4083b.g1(false);
                return;
            case 1:
                this.f4083b.g1(true);
                return;
            case 2:
                f9 f9Var = this.f4083b;
                di.f6 f6Var = new di.f6(f9Var.getContext(), f9Var.U1, f9Var.V1, f9Var.J0, null);
                long j3 = f9Var.Y1.f28721id;
                String str = f9Var.f3579b2;
                f6Var.f8779m3 = true;
                di.y8.y(f6Var.f30223a, false).K(j3, new ai.s1(9, f6Var, str));
                return;
            case 3:
                f9 f9Var2 = this.f4083b;
                m0.h1(f9Var2.getContext(), f9Var2.Y1, f9Var2.J0);
                return;
            case 4:
                f9 f9Var3 = this.f4083b;
                new gb(f9Var3.getContext(), f9Var3.J0).show();
                return;
            default:
                this.f4083b.dismiss();
                return;
        }
    }
}
