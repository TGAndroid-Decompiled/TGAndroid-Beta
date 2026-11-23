package di;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
public final class h3 implements Runnable {
    public final int f8952a;
    public final f6 f8953b;
    public final String f8954c;

    public h3(f6 f6Var, String str, int i7) {
        this.f8952a = i7;
        this.f8953b = f6Var;
        this.f8954c = str;
    }

    @Override
    public final void run() {
        int i7 = this.f8952a;
        String str = this.f8954c;
        f6 f6Var = this.f8953b;
        switch (i7) {
            case 0:
                Context context = f6Var.getContext();
                vf.c.v(context, np.u1(f6Var.f30173a).K6 + str, false);
                return;
            case 1:
                long j3 = f6Var.T1;
                f6Var.f8806g2.setLoading(false);
                if (!TextUtils.isEmpty(str)) {
                    f6Var.dismiss();
                    org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        if (Q instanceof bn) {
                            bn bnVar = (bn) Q;
                            if (bnVar.a() == j3) {
                                org.telegram.ui.Components.lc.b0(bnVar).I(2131624034, hd.N0(2131744853, null), org.telegram.messenger.g0.W2(hd.a0(null, null, 2131744851, org.telegram.messenger.n5.t(j3)))).k(true);
                                return;
                            }
                        }
                        ls f10 = ls.f(f6Var.f30173a);
                        Long valueOf = Long.valueOf(j3);
                        Boolean bool = Boolean.FALSE;
                        f10.k(6, valueOf, bool);
                        ls.f(f6Var.f30173a).k(5, Long.valueOf(j3), bool);
                        bn ua2 = bn.ua(j3);
                        ua2.whenFullyVisible(new f2(5, f6Var, ua2));
                        Q.presentFragment(ua2);
                        return;
                    }
                    return;
                }
                f6Var.H2(0, true, null);
                return;
            case 2:
                Context context2 = f6Var.getContext();
                vf.c.v(context2, np.u1(f6Var.f30173a).K6 + str, false);
                return;
            case 3:
                Context context3 = f6Var.getContext();
                vf.c.v(context3, np.u1(f6Var.f30173a).K6 + str, false);
                return;
            case 4:
                Context context4 = f6Var.getContext();
                vf.c.v(context4, np.u1(f6Var.f30173a).K6 + str, false);
                return;
            case 5:
                Context context5 = f6Var.getContext();
                vf.c.v(context5, np.u1(f6Var.f30173a).K6 + str, false);
                return;
            case 6:
                Context context6 = f6Var.getContext();
                vf.c.v(context6, np.u1(f6Var.f30173a).K6 + str, false);
                return;
            case 7:
                org.telegram.messenger.g0.g(str);
                org.telegram.ui.Components.gc k10 = f6Var.k().k(false);
                k10.f35537t = true;
                k10.j();
                return;
            default:
                f6Var.dismiss();
                Context context7 = f6Var.getContext();
                vf.c.t(context7, "https://" + np.u1(f6Var.f30173a).X2 + "/" + str);
                return;
        }
    }
}
