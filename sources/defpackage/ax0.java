package defpackage;

import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class ax0 implements Runnable {
    public final byte a;
    public final nx0 b;

    public ax0(nx0 nx0Var, byte b) {
        this.a = b;
        this.b = nx0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        nx0 nx0Var = this.b;
        switch (b) {
            case 0:
                ex0 ex0Var = nx0Var.c;
                hl.B2(ex0Var);
                nx0Var.i1.getLayoutContainer().addView(ex0Var);
                return;
            case 1:
                nx0Var.dismiss();
                return;
            case 2:
                try {
                    nx0Var.H();
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 3:
                nx0Var.dismiss();
                e S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    return;
                }
                return;
            case 4:
                nx0Var.dismiss();
                jn7.f(yac.t0).k(192, new Object[0]);
                hl.d3(new pg6((byte) 18), 220L);
                return;
            default:
                nx0Var.c0 = true;
                nx0Var.d0 = true;
                return;
        }
    }
}
