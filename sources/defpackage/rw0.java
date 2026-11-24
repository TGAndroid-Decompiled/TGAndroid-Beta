package defpackage;

import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class rw0 implements Runnable {
    public final byte a;
    public final fx0 b;

    public rw0(fx0 fx0Var, byte b) {
        this.a = b;
        this.b = fx0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        fx0 fx0Var = this.b;
        switch (b) {
            case 0:
                ww0 ww0Var = fx0Var.c;
                gl.B2(ww0Var);
                fx0Var.i1.getLayoutContainer().addView(ww0Var);
                return;
            case 1:
                fx0Var.dismiss();
                return;
            case 2:
                try {
                    fx0Var.I();
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 3:
                fx0Var.dismiss();
                d S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    return;
                }
                return;
            case 4:
                fx0Var.dismiss();
                kk7.f(y6c.t0).k(191, new Object[0]);
                gl.e3(new am6((byte) 15), 220L);
                return;
            default:
                fx0Var.c0 = true;
                fx0Var.d0 = true;
                return;
        }
    }
}
