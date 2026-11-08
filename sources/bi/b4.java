package bi;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
public final class b4 implements Runnable {
    public final int f3507a;
    public final k7 f3508b;
    public final String f3509c;

    public b4(k7 k7Var, String str, int i7) {
        this.f3507a = i7;
        this.f3508b = k7Var;
        this.f3509c = str;
    }

    @Override
    public final void run() {
        int i7 = this.f3507a;
        String str = this.f3509c;
        k7 k7Var = this.f3508b;
        switch (i7) {
            case 0:
                long j3 = k7Var.P1;
                k7Var.f4168c2.setLoading(false);
                if (!TextUtils.isEmpty(str)) {
                    k7Var.dismiss();
                    org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        if (Q instanceof an) {
                            an anVar = (an) Q;
                            if (anVar.a() == j3) {
                                org.telegram.ui.Components.hc.a0(anVar).I(2131624033, org.telegram.messenger.id.M0(2131745099, null), org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131745097, org.telegram.messenger.m5.t(j3)))).k(true);
                                return;
                            }
                        }
                        qs f10 = qs.f(k7Var.f28616a);
                        Long valueOf = Long.valueOf(j3);
                        Boolean bool = Boolean.FALSE;
                        f10.k(6, valueOf, bool);
                        qs.f(k7Var.f28616a).k(5, Long.valueOf(j3), bool);
                        an ra2 = an.ra(j3);
                        ra2.whenFullyVisible(new a4(1, k7Var, ra2));
                        Q.presentFragment(ra2);
                        return;
                    }
                    return;
                }
                k7Var.s2(0, true, null);
                return;
            case 1:
                Context context = k7Var.getContext();
                vf.c.v(context, qp.s1(k7Var.f28616a).H6 + str, false);
                return;
            case 2:
                Context context2 = k7Var.getContext();
                vf.c.v(context2, qp.s1(k7Var.f28616a).H6 + str, false);
                return;
            case 3:
                Context context3 = k7Var.getContext();
                vf.c.v(context3, qp.s1(k7Var.f28616a).H6 + str, false);
                return;
            case 4:
                Context context4 = k7Var.getContext();
                vf.c.v(context4, qp.s1(k7Var.f28616a).H6 + str, false);
                return;
            case 5:
                Context context5 = k7Var.getContext();
                vf.c.v(context5, qp.s1(k7Var.f28616a).H6 + str, false);
                return;
            case 6:
                Context context6 = k7Var.getContext();
                vf.c.v(context6, qp.s1(k7Var.f28616a).H6 + str, false);
                return;
            case 7:
                org.telegram.messenger.g0.g(str);
                org.telegram.ui.Components.cc k10 = k7Var.k().k(false);
                k10.f32555t = true;
                k10.j();
                return;
            default:
                k7Var.dismiss();
                Context context7 = k7Var.getContext();
                vf.c.t(context7, "https://" + qp.s1(k7Var.f28616a).U2 + "/" + str);
                return;
        }
    }
}
