package defpackage;

import android.widget.FrameLayout;
public final class d10 implements Runnable {
    public final byte a;
    public final j20 b;
    public final fu5 c;

    public d10(j20 j20Var, fu5 fu5Var, byte b) {
        this.a = b;
        this.b = j20Var;
        this.c = fu5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        fu5 fu5Var = this.c;
        j20 j20Var = this.b;
        switch (b) {
            case 0:
                fu5Var.u();
                j20Var.K0(1);
                return;
            case 1:
                fu5Var.u();
                j20Var.K0(2);
                return;
            case 2:
                fu5Var.u();
                j20Var.K0(4);
                return;
            case 3:
                fu5Var.u();
                j20Var.K0(7);
                return;
            default:
                j20Var.P0(true);
                bs2.v(null, 2131753905, new d31((FrameLayout) j20Var.b, j20Var.J0), 2131624185, 36);
                fu5Var.u();
                return;
        }
    }
}
