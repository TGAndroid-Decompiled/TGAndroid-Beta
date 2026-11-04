package ci;

import org.telegram.messenger.bd;
import org.telegram.ui.LaunchActivity;
public final class b4 implements Runnable {
    public final int f4863a;
    public final org.telegram.ui.ActionBar.s1 f4864b;

    public b4(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        this.f4863a = i3;
        this.f4864b = s1Var;
    }

    @Override
    public final void run() {
        int i3 = this.f4863a;
        org.telegram.ui.ActionBar.s1 s1Var = this.f4864b;
        switch (i3) {
            case 0:
                s1Var.dismiss();
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    org.telegram.ui.Components.ac Q = org.telegram.ui.Components.fc.a0(T).Q(2131624011, 36, bd.M0(2131748560, null));
                    Q.f31802t = true;
                    Q.j();
                    return;
                }
                return;
            case 1:
                s1Var.dismiss();
                return;
            case 2:
                s1Var.dismiss();
                return;
            default:
                if (!s1Var.isShowing()) {
                    try {
                        s1Var.show();
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }
}
