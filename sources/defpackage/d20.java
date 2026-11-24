package defpackage;

import android.widget.FrameLayout;
public final class d20 implements Runnable {
    public final byte a;
    public final i30 b;
    public final bu5 c;

    public d20(i30 i30Var, bu5 bu5Var, byte b) {
        this.a = b;
        this.b = i30Var;
        this.c = bu5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        bu5 bu5Var = this.c;
        i30 i30Var = this.b;
        switch (b) {
            case 0:
                bu5Var.u();
                i30Var.J0(1);
                return;
            case 1:
                bu5Var.u();
                i30Var.J0(2);
                return;
            case 2:
                bu5Var.u();
                i30Var.J0(4);
                return;
            case 3:
                bu5Var.u();
                i30Var.J0(7);
                return;
            default:
                i30Var.O0(true);
                ts2.u(null, 2131753877, new c41((FrameLayout) i30Var.b, i30Var.J0), 2131624185, 36);
                bu5Var.u();
                return;
        }
    }
}
