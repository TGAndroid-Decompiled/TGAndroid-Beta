package di;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
public final class d3 implements Runnable {
    public final int f8398a;
    public final c6 f8399b;
    public final String f8400c;

    public d3(c6 c6Var, String str, int i7) {
        this.f8398a = i7;
        this.f8399b = c6Var;
        this.f8400c = str;
    }

    @Override
    public final void run() {
        int i7 = this.f8398a;
        String str = this.f8400c;
        c6 c6Var = this.f8399b;
        switch (i7) {
            case 0:
                long j3 = c6Var.T1;
                c6Var.f8318g2.setLoading(false);
                if (!TextUtils.isEmpty(str)) {
                    c6Var.dismiss();
                    org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        if (Q instanceof an) {
                            an anVar = (an) Q;
                            if (anVar.a() == j3) {
                                org.telegram.ui.Components.cc.a0(anVar).I(2131624034, hd.M0(2131745096, null), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131745094, org.telegram.messenger.m5.t(j3)))).k(true);
                                return;
                            }
                        }
                        ns f10 = ns.f(c6Var.f29679a);
                        Long valueOf = Long.valueOf(j3);
                        Boolean bool = Boolean.FALSE;
                        f10.k(6, valueOf, bool);
                        ns.f(c6Var.f29679a).k(5, Long.valueOf(j3), bool);
                        an ua2 = an.ua(j3);
                        ua2.whenFullyVisible(new s2(3, c6Var, ua2));
                        Q.presentFragment(ua2);
                        return;
                    }
                    return;
                }
                c6Var.t2(0, true, null);
                return;
            case 1:
                Context context = c6Var.getContext();
                vf.c.v(context, np.s1(c6Var.f29679a).I6 + str, false);
                return;
            case 2:
                Context context2 = c6Var.getContext();
                vf.c.v(context2, np.s1(c6Var.f29679a).I6 + str, false);
                return;
            case 3:
                Context context3 = c6Var.getContext();
                vf.c.v(context3, np.s1(c6Var.f29679a).I6 + str, false);
                return;
            case 4:
                Context context4 = c6Var.getContext();
                vf.c.v(context4, np.s1(c6Var.f29679a).I6 + str, false);
                return;
            case 5:
                Context context5 = c6Var.getContext();
                vf.c.v(context5, np.s1(c6Var.f29679a).I6 + str, false);
                return;
            case 6:
                Context context6 = c6Var.getContext();
                vf.c.v(context6, np.s1(c6Var.f29679a).I6 + str, false);
                return;
            case 7:
                org.telegram.messenger.g0.g(str);
                org.telegram.ui.Components.xb k10 = c6Var.k().k(false);
                k10.f41653t = true;
                k10.j();
                return;
            default:
                c6Var.dismiss();
                Context context7 = c6Var.getContext();
                vf.c.t(context7, "https://" + np.s1(c6Var.f29679a).V2 + "/" + str);
                return;
        }
    }
}
