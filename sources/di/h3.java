package di;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
public final class h3 implements Runnable {
    public final int f8913a;
    public final f6 f8914b;
    public final String f8915c;

    public h3(f6 f6Var, String str, int i7) {
        this.f8913a = i7;
        this.f8914b = f6Var;
        this.f8915c = str;
    }

    @Override
    public final void run() {
        int i7 = this.f8913a;
        String str = this.f8915c;
        f6 f6Var = this.f8914b;
        switch (i7) {
            case 0:
                Context context = f6Var.getContext();
                vf.c.v(context, mp.u1(f6Var.f30223a).K6 + str, false);
                return;
            case 1:
                long j3 = f6Var.T1;
                f6Var.f8767g2.setLoading(false);
                if (!TextUtils.isEmpty(str)) {
                    f6Var.dismiss();
                    org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        if (Q instanceof bn) {
                            bn bnVar = (bn) Q;
                            if (bnVar.a() == j3) {
                                org.telegram.ui.Components.kc.b0(bnVar).I(2131624034, gd.N0(2131744855, null), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131744853, org.telegram.messenger.n5.t(j3)))).k(true);
                                return;
                            }
                        }
                        ks f10 = ks.f(f6Var.f30223a);
                        Long valueOf = Long.valueOf(j3);
                        Boolean bool = Boolean.FALSE;
                        f10.k(6, valueOf, bool);
                        ks.f(f6Var.f30223a).k(5, Long.valueOf(j3), bool);
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
                vf.c.v(context2, mp.u1(f6Var.f30223a).K6 + str, false);
                return;
            case 3:
                Context context3 = f6Var.getContext();
                vf.c.v(context3, mp.u1(f6Var.f30223a).K6 + str, false);
                return;
            case 4:
                Context context4 = f6Var.getContext();
                vf.c.v(context4, mp.u1(f6Var.f30223a).K6 + str, false);
                return;
            case 5:
                Context context5 = f6Var.getContext();
                vf.c.v(context5, mp.u1(f6Var.f30223a).K6 + str, false);
                return;
            case 6:
                Context context6 = f6Var.getContext();
                vf.c.v(context6, mp.u1(f6Var.f30223a).K6 + str, false);
                return;
            case 7:
                org.telegram.messenger.g0.g(str);
                org.telegram.ui.Components.fc k10 = f6Var.k().k(false);
                k10.f35101t = true;
                k10.j();
                return;
            default:
                f6Var.dismiss();
                Context context7 = f6Var.getContext();
                vf.c.t(context7, "https://" + mp.u1(f6Var.f30223a).X2 + "/" + str);
                return;
        }
    }
}
