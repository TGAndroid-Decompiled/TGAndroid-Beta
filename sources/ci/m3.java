package ci;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wm;
public final class m3 implements Runnable {
    public final int f5535a;
    public final l6 f5536b;
    public final String f5537c;

    public m3(l6 l6Var, String str, int i3) {
        this.f5535a = i3;
        this.f5536b = l6Var;
        this.f5537c = str;
    }

    @Override
    public final void run() {
        int i3 = this.f5535a;
        String str = this.f5537c;
        l6 l6Var = this.f5536b;
        switch (i3) {
            case 0:
                long j10 = l6Var.Q1;
                l6Var.f5451d2.setLoading(false);
                if (!TextUtils.isEmpty(str)) {
                    l6Var.dismiss();
                    org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        if (Q instanceof wm) {
                            wm wmVar = (wm) Q;
                            if (wmVar.a() == j10) {
                                org.telegram.ui.Components.fc.a0(wmVar).I(2131624033, bd.M0(2131745106, null), org.telegram.messenger.g0.X2(bd.a0(null, null, 2131745104, org.telegram.messenger.m5.t(j10)))).k(true);
                                return;
                            }
                        }
                        hs f10 = hs.f(l6Var.f28583a);
                        Long valueOf = Long.valueOf(j10);
                        Boolean bool = Boolean.FALSE;
                        f10.k(6, valueOf, bool);
                        hs.f(l6Var.f28583a).k(5, Long.valueOf(j10), bool);
                        wm ra2 = wm.ra(j10);
                        ra2.whenFullyVisible(new e0(8, l6Var, ra2));
                        Q.presentFragment(ra2);
                        return;
                    }
                    return;
                }
                l6Var.s2(0, true, null);
                return;
            case 1:
                Context context = l6Var.getContext();
                sf.c.v(context, hp.s1(l6Var.f28583a).H6 + str, false);
                return;
            case 2:
                Context context2 = l6Var.getContext();
                sf.c.v(context2, hp.s1(l6Var.f28583a).H6 + str, false);
                return;
            case 3:
                Context context3 = l6Var.getContext();
                sf.c.v(context3, hp.s1(l6Var.f28583a).H6 + str, false);
                return;
            case 4:
                Context context4 = l6Var.getContext();
                sf.c.v(context4, hp.s1(l6Var.f28583a).H6 + str, false);
                return;
            case 5:
                Context context5 = l6Var.getContext();
                sf.c.v(context5, hp.s1(l6Var.f28583a).H6 + str, false);
                return;
            case 6:
                Context context6 = l6Var.getContext();
                sf.c.v(context6, hp.s1(l6Var.f28583a).H6 + str, false);
                return;
            case 7:
                org.telegram.messenger.g0.g(str);
                org.telegram.ui.Components.ac k10 = l6Var.k().k(false);
                k10.f31802t = true;
                k10.j();
                return;
            default:
                l6Var.dismiss();
                Context context7 = l6Var.getContext();
                sf.c.t(context7, "https://" + hp.s1(l6Var.f28583a).V2 + "/" + str);
                return;
        }
    }
}
