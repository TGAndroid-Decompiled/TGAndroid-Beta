package di;

import android.text.TextUtils;
import org.telegram.messenger.z10;
import org.telegram.ui.LaunchActivity;
public final class g3 implements z10 {
    public final int f8592a;
    public final c6 f8593b;
    public final vf.b f8594c;
    public final wg.c1 d;

    public g3(c6 c6Var, vf.b bVar, wg.c1 c1Var, int i7) {
        this.f8592a = i7;
        this.f8593b = c6Var;
        this.f8594c = bVar;
        this.d = c1Var;
    }

    @Override
    public final void a(Object obj) {
        org.telegram.ui.Components.cc k10;
        org.telegram.ui.Components.cc k11;
        String str = (String) obj;
        switch (this.f8592a) {
            case 0:
                this.f8594c.b();
                c6 c6Var = this.f8593b;
                wg.c1 c1Var = this.d;
                if (str != null) {
                    if (c1Var != null) {
                        k10 = new org.telegram.ui.Components.cc(c1Var.f29685c, c6Var.J0);
                    } else {
                        k10 = c6Var.k();
                    }
                    k10.e0(str, false);
                    return;
                }
                if (c1Var != null) {
                    c1Var.dismiss();
                }
                c6Var.dismiss();
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T instanceof org.telegram.ui.Wallet.y5) {
                    ((org.telegram.ui.Wallet.y5) T).P0();
                    return;
                }
                return;
            default:
                this.f8594c.c(false);
                if (!TextUtils.isEmpty(str)) {
                    c6 c6Var2 = this.f8593b;
                    wg.c1 c1Var2 = this.d;
                    if (c1Var2 != null) {
                        k11 = new org.telegram.ui.Components.cc(c1Var2.f29685c, c6Var2.J0);
                    } else {
                        k11 = c6Var2.k();
                    }
                    k11.e0(str, false);
                    return;
                }
                return;
        }
    }
}
