package bi;

import org.telegram.ui.LaunchActivity;
public final class r4 implements Runnable {
    public final int f4614a;
    public final org.telegram.ui.ActionBar.u1 f4615b;

    public r4(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.f4614a = i7;
        this.f4615b = u1Var;
    }

    @Override
    public final void run() {
        int i7 = this.f4614a;
        org.telegram.ui.ActionBar.u1 u1Var = this.f4615b;
        switch (i7) {
            case 0:
                u1Var.dismiss();
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    org.telegram.ui.Components.cc Q = org.telegram.ui.Components.hc.a0(T).Q(2131624011, 36, org.telegram.messenger.hd.M0(2131748551, null));
                    Q.f32533t = true;
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
