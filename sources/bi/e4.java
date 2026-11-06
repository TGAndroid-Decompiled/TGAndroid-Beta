package bi;

import android.text.TextUtils;
import org.telegram.messenger.c20;
import org.telegram.ui.LaunchActivity;
public final class e4 implements c20 {
    public final int f3757a;
    public final k7 f3758b;
    public final vf.b f3759c;
    public final wg.f1 d;

    public e4(k7 k7Var, vf.b bVar, wg.f1 f1Var, int i7) {
        this.f3757a = i7;
        this.f3758b = k7Var;
        this.f3759c = bVar;
        this.d = f1Var;
    }

    @Override
    public final void a(Object obj) {
        org.telegram.ui.Components.hc k10;
        org.telegram.ui.Components.hc k11;
        String str = (String) obj;
        switch (this.f3757a) {
            case 0:
                this.f3759c.b();
                k7 k7Var = this.f3758b;
                wg.f1 f1Var = this.d;
                if (str != null) {
                    if (f1Var != null) {
                        k10 = new org.telegram.ui.Components.hc(f1Var.f28618c, k7Var.I0);
                    } else {
                        k10 = k7Var.k();
                    }
                    k10.e0(str, false);
                    return;
                }
                if (f1Var != null) {
                    f1Var.dismiss();
                }
                k7Var.dismiss();
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T instanceof org.telegram.ui.Wallet.y5) {
                    ((org.telegram.ui.Wallet.y5) T).O0();
                    return;
                }
                return;
            default:
                this.f3759c.c(false);
                if (!TextUtils.isEmpty(str)) {
                    k7 k7Var2 = this.f3758b;
                    wg.f1 f1Var2 = this.d;
                    if (f1Var2 != null) {
                        k11 = new org.telegram.ui.Components.hc(f1Var2.f28618c, k7Var2.I0);
                    } else {
                        k11 = k7Var2.k();
                    }
                    k11.e0(str, false);
                    return;
                }
                return;
        }
    }
}
