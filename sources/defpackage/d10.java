package defpackage;

import android.widget.FrameLayout;
public final class d10 implements Runnable {
    public final byte a;
    public final i20 b;
    public final cs5 c;

    public d10(i20 i20Var, cs5 cs5Var, byte b) {
        this.a = b;
        this.b = i20Var;
        this.c = cs5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        cs5 cs5Var = this.c;
        i20 i20Var = this.b;
        switch (b) {
            case 0:
                cs5Var.u();
                i20Var.J0(1);
                return;
            case 1:
                cs5Var.u();
                i20Var.J0(2);
                return;
            case 2:
                cs5Var.u();
                i20Var.J0(4);
                return;
            case 3:
                cs5Var.u();
                i20Var.J0(7);
                return;
            default:
                i20Var.O0(true);
                ir2.v(null, 2131753909, new u21((FrameLayout) i20Var.b, i20Var.J0), 2131624186, 36);
                cs5Var.u();
                return;
        }
    }
}
