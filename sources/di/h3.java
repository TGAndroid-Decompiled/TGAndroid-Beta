package di;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
public final class h3 implements Runnable {
    public final int f8921a;
    public final f6 f8922b;
    public final String f8923c;

    public h3(f6 f6Var, String str, int i7) {
        this.f8921a = i7;
        this.f8922b = f6Var;
        this.f8923c = str;
    }

    @Override
    public final void run() {
        int i7 = this.f8921a;
        String str = this.f8923c;
        f6 f6Var = this.f8922b;
        switch (i7) {
            case 0:
                Context context = f6Var.getContext();
                vf.c.v(context, mp.u1(f6Var.f30189a).K6 + str, false);
                return;
            case 1:
                long j3 = f6Var.T1;
                f6Var.f8782g2.setLoading(false);
                if (!TextUtils.isEmpty(str)) {
                    f6Var.dismiss();
                    org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        if (Q instanceof bn) {
                            bn bnVar = (bn) Q;
                            if (bnVar.a() == j3) {
                                org.telegram.ui.Components.lc.b0(bnVar).I(2131624034, gd.M0(2131744861, null), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131744859, org.telegram.messenger.n5.t(j3)))).k(true);
                                return;
                            }
                        }
                        ks f10 = ks.f(f6Var.f30189a);
                        Long valueOf = Long.valueOf(j3);
                        Boolean bool = Boolean.FALSE;
                        f10.k(6, valueOf, bool);
                        ks.f(f6Var.f30189a).k(5, Long.valueOf(j3), bool);
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
                vf.c.v(context2, mp.u1(f6Var.f30189a).K6 + str, false);
                return;
            case 3:
                Context context3 = f6Var.getContext();
                vf.c.v(context3, mp.u1(f6Var.f30189a).K6 + str, false);
                return;
            case 4:
                Context context4 = f6Var.getContext();
                vf.c.v(context4, mp.u1(f6Var.f30189a).K6 + str, false);
                return;
            case 5:
                Context context5 = f6Var.getContext();
                vf.c.v(context5, mp.u1(f6Var.f30189a).K6 + str, false);
                return;
            case 6:
                Context context6 = f6Var.getContext();
                vf.c.v(context6, mp.u1(f6Var.f30189a).K6 + str, false);
                return;
            case 7:
                org.telegram.messenger.g0.g(str);
                org.telegram.ui.Components.gc k10 = f6Var.k().k(false);
                k10.f35471t = true;
                k10.j();
                return;
            default:
                f6Var.dismiss();
                Context context7 = f6Var.getContext();
                vf.c.t(context7, "https://" + mp.u1(f6Var.f30189a).X2 + "/" + str);
                return;
        }
    }
}
