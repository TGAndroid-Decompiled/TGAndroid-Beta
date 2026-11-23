package di;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
public final class h3 implements Runnable {
    public final int f8915a;
    public final f6 f8916b;
    public final String f8917c;

    public h3(f6 f6Var, String str, int i7) {
        this.f8915a = i7;
        this.f8916b = f6Var;
        this.f8917c = str;
    }

    @Override
    public final void run() {
        int i7 = this.f8915a;
        String str = this.f8917c;
        f6 f6Var = this.f8916b;
        switch (i7) {
            case 0:
                Context context = f6Var.getContext();
                vf.c.v(context, np.u1(f6Var.f30139a).K6 + str, false);
                return;
            case 1:
                long j3 = f6Var.T1;
                f6Var.f8768g2.setLoading(false);
                if (!TextUtils.isEmpty(str)) {
                    f6Var.dismiss();
                    org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        if (Q instanceof bn) {
                            bn bnVar = (bn) Q;
                            if (bnVar.a() == j3) {
                                org.telegram.ui.Components.lc.b0(bnVar).I(2131624034, hd.N0(2131744855, null), org.telegram.messenger.g0.W2(hd.a0(null, null, 2131744853, org.telegram.messenger.n5.t(j3)))).k(true);
                                return;
                            }
                        }
                        ls f10 = ls.f(f6Var.f30139a);
                        Long valueOf = Long.valueOf(j3);
                        Boolean bool = Boolean.FALSE;
                        f10.k(6, valueOf, bool);
                        ls.f(f6Var.f30139a).k(5, Long.valueOf(j3), bool);
                        bn ua2 = bn.ua(j3);
                        ua2.whenFullyVisible(new w2(3, f6Var, ua2));
                        Q.presentFragment(ua2);
                        return;
                    }
                    return;
                }
                f6Var.H2(0, true, null);
                return;
            case 2:
                Context context2 = f6Var.getContext();
                vf.c.v(context2, np.u1(f6Var.f30139a).K6 + str, false);
                return;
            case 3:
                Context context3 = f6Var.getContext();
                vf.c.v(context3, np.u1(f6Var.f30139a).K6 + str, false);
                return;
            case 4:
                Context context4 = f6Var.getContext();
                vf.c.v(context4, np.u1(f6Var.f30139a).K6 + str, false);
                return;
            case 5:
                Context context5 = f6Var.getContext();
                vf.c.v(context5, np.u1(f6Var.f30139a).K6 + str, false);
                return;
            case 6:
                Context context6 = f6Var.getContext();
                vf.c.v(context6, np.u1(f6Var.f30139a).K6 + str, false);
                return;
            case 7:
                org.telegram.messenger.g0.g(str);
                org.telegram.ui.Components.gc k10 = f6Var.k().k(false);
                k10.f35499t = true;
                k10.j();
                return;
            default:
                f6Var.dismiss();
                Context context7 = f6Var.getContext();
                vf.c.t(context7, "https://" + np.u1(f6Var.f30139a).X2 + "/" + str);
                return;
        }
    }
}
