package defpackage;

import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class zx0 implements Runnable {
    public final byte a;
    public final my0 b;

    public zx0(my0 my0Var, byte b) {
        this.a = b;
        this.b = my0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        my0 my0Var = this.b;
        switch (b) {
            case 0:
                dy0 dy0Var = my0Var.c;
                gm.B2(dy0Var);
                my0Var.i1.getLayoutContainer().addView(dy0Var);
                return;
            case 1:
                my0Var.dismiss();
                return;
            case 2:
                try {
                    my0Var.H();
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 3:
                my0Var.dismiss();
                d S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    return;
                }
                return;
            case 4:
                my0Var.dismiss();
                nm7.f(z8c.t0).k(192, new Object[0]);
                gm.d3(new bo6((byte) 15), 220L);
                return;
            default:
                my0Var.c0 = true;
                my0Var.d0 = true;
                return;
        }
    }
}
