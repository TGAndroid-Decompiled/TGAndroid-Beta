package di;

import org.telegram.messenger.hd;
import org.telegram.ui.LaunchActivity;
public final class s3 implements Runnable {
    public final int f9382a;
    public final org.telegram.ui.ActionBar.t1 f9383b;

    public s3(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.f9382a = i7;
        this.f9383b = t1Var;
    }

    @Override
    public final void run() {
        int i7 = this.f9382a;
        org.telegram.ui.ActionBar.t1 t1Var = this.f9383b;
        switch (i7) {
            case 0:
                t1Var.dismiss();
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    org.telegram.ui.Components.xb Q = org.telegram.ui.Components.cc.a0(T).Q(2131624012, 36, hd.M0(2131748552, null));
                    Q.f41653t = true;
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
