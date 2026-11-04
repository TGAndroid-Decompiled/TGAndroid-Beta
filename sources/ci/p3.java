package ci;

import android.text.TextUtils;
import org.telegram.messenger.u10;
import org.telegram.ui.LaunchActivity;
public final class p3 implements u10 {
    public final int f5743a;
    public final l6 f5744b;
    public final sf.b f5745c;
    public final xg.e1 d;

    public p3(l6 l6Var, sf.b bVar, xg.e1 e1Var, int i3) {
        this.f5743a = i3;
        this.f5744b = l6Var;
        this.f5745c = bVar;
        this.d = e1Var;
    }

    @Override
    public final void a(Object obj) {
        org.telegram.ui.Components.fc k10;
        org.telegram.ui.Components.fc k11;
        String str = (String) obj;
        switch (this.f5743a) {
            case 0:
                this.f5745c.b();
                l6 l6Var = this.f5744b;
                xg.e1 e1Var = this.d;
                if (str != null) {
                    if (e1Var != null) {
                        k10 = new org.telegram.ui.Components.fc(e1Var.f28589c, l6Var.J0);
                    } else {
                        k10 = l6Var.k();
                    }
                    k10.e0(str, false);
                    return;
                }
                if (e1Var != null) {
                    e1Var.dismiss();
                }
                l6Var.dismiss();
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T instanceof org.telegram.ui.Wallet.w5) {
                    ((org.telegram.ui.Wallet.w5) T).O0();
                    return;
                }
                return;
            default:
                this.f5745c.c(false);
                if (!TextUtils.isEmpty(str)) {
                    l6 l6Var2 = this.f5744b;
                    xg.e1 e1Var2 = this.d;
                    if (e1Var2 != null) {
                        k11 = new org.telegram.ui.Components.fc(e1Var2.f28589c, l6Var2.J0);
                    } else {
                        k11 = l6Var2.k();
                    }
                    k11.e0(str, false);
                    return;
                }
                return;
        }
    }
}
