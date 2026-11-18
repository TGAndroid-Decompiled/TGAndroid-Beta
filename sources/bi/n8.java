package bi;

import di.gb;
public final class n8 implements Runnable {
    public final int f3883a;
    public final z8 f3884b;

    public n8(z8 z8Var, int i7) {
        this.f3883a = i7;
        this.f3884b = z8Var;
    }

    @Override
    public final void run() {
        switch (this.f3883a) {
            case 0:
                this.f3884b.g1(false);
                return;
            case 1:
                this.f3884b.g1(true);
                return;
            case 2:
                z8 z8Var = this.f3884b;
                di.f6 f6Var = new di.f6(z8Var.getContext(), z8Var.U1, z8Var.V1, z8Var.J0, null);
                long j3 = z8Var.Y1.f28632id;
                String str = z8Var.f4297b2;
                f6Var.f8791m3 = true;
                di.x8.y(f6Var.f30187a, false).K(j3, new ai.v1(9, f6Var, str));
                return;
            case 3:
                z8 z8Var2 = this.f3884b;
                m0.h1(z8Var2.getContext(), z8Var2.Y1, z8Var2.J0);
                return;
            case 4:
                z8 z8Var3 = this.f3884b;
                new gb(z8Var3.getContext(), z8Var3.J0).show();
                return;
            default:
                this.f3884b.dismiss();
                return;
        }
    }
}
