package bi;

import android.text.TextUtils;
import org.telegram.messenger.c20;
import org.telegram.ui.LaunchActivity;
public final class e4 implements c20 {
    public final int f3754a;
    public final k7 f3755b;
    public final vf.b f3756c;
    public final wg.f1 d;

    public e4(k7 k7Var, vf.b bVar, wg.f1 f1Var, int i7) {
        this.f3754a = i7;
        this.f3755b = k7Var;
        this.f3756c = bVar;
        this.d = f1Var;
    }

    @Override
    public final void a(Object obj) {
        org.telegram.ui.Components.gc k10;
        org.telegram.ui.Components.gc k11;
        String str = (String) obj;
        switch (this.f3754a) {
            case 0:
                this.f3756c.b();
                k7 k7Var = this.f3755b;
                wg.f1 f1Var = this.d;
                if (str != null) {
                    if (f1Var != null) {
                        k10 = new org.telegram.ui.Components.gc(f1Var.f28675c, k7Var.I0);
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
                if (T instanceof org.telegram.ui.Wallet.z5) {
                    ((org.telegram.ui.Wallet.z5) T).P0();
                    return;
                }
                return;
            default:
                this.f3756c.c(false);
                if (!TextUtils.isEmpty(str)) {
                    k7 k7Var2 = this.f3755b;
                    wg.f1 f1Var2 = this.d;
                    if (f1Var2 != null) {
                        k11 = new org.telegram.ui.Components.gc(f1Var2.f28675c, k7Var2.I0);
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
