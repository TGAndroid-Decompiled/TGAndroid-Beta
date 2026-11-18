package di;

import org.telegram.messenger.gd;
import org.telegram.ui.LaunchActivity;
public final class u3 implements Runnable {
    public final int f9851a;
    public final org.telegram.ui.ActionBar.u1 f9852b;

    public u3(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.f9851a = i7;
        this.f9852b = u1Var;
    }

    @Override
    public final void run() {
        int i7 = this.f9851a;
        org.telegram.ui.ActionBar.u1 u1Var = this.f9852b;
        switch (i7) {
            case 0:
                u1Var.dismiss();
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null) {
                    org.telegram.ui.Components.gc Q = org.telegram.ui.Components.lc.b0(T).Q(2131624012, 36, gd.M0(2131748360, null));
                    Q.f35471t = true;
                    Q.j();
                    return;
                }
                return;
            case 1:
                u1Var.dismiss();
                return;
            case 2:
                u1Var.dismiss();
                return;
            default:
                if (!u1Var.isShowing()) {
                    try {
                        u1Var.show();
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }
}
