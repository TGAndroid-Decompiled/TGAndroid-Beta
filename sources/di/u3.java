package di;

import org.telegram.messenger.hd;
import org.telegram.ui.LaunchActivity;
public final class u3 implements Runnable {
    public final int f9851a;
    public final org.telegram.ui.ActionBar.t1 f9852b;

    public u3(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.f9851a = i7;
        this.f9852b = t1Var;
    }

    @Override
    public final void run() {
        int i7 = this.f9851a;
        org.telegram.ui.ActionBar.t1 t1Var = this.f9852b;
        switch (i7) {
            case 0:
                t1Var.dismiss();
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    org.telegram.ui.Components.gc Q = org.telegram.ui.Components.lc.b0(T).Q(2131624012, 36, hd.N0(2131748359, null));
                    Q.f35499t = true;
                    Q.j();
                    return;
                }
                return;
            case 1:
                t1Var.dismiss();
                return;
            case 2:
                t1Var.dismiss();
                return;
            default:
                if (!t1Var.isShowing()) {
                    try {
                        t1Var.show();
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }
}
