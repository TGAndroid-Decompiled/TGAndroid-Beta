package defpackage;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class nqa implements Runnable {
    public final byte a;
    public final wsa b;
    public final String c;

    public nqa(wsa wsaVar, String str, byte b) {
        this.a = b;
        this.b = wsaVar;
        this.c = str;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                wsa wsaVar = this.b;
                String str = this.c;
                Context context = wsaVar.getContext();
                l11.w(context, oc7.r1(wsaVar.a).l4.G1.f + str, false);
                return;
            case 1:
                wsa wsaVar2 = this.b;
                String str2 = this.c;
                long j = wsaVar2.S1;
                wsaVar2.f2.setLoading(false);
                if (!TextUtils.isEmpty(str2)) {
                    wsaVar2.dismiss();
                    d Q = LaunchActivity.Q();
                    if (Q != null) {
                        if (Q instanceof yv1) {
                            yv1 yv1Var = (yv1) Q;
                            if (yv1Var.a() == j) {
                                c41.b0(yv1Var).I(2131624034, jb6.M0(2131744785, null), gm.S2(jb6.a0(null, null, 2131744783, pg3.s(j)))).k(true);
                                return;
                            }
                        }
                        nm7 f = nm7.f(wsaVar2.a);
                        Long valueOf = Long.valueOf(j);
                        Boolean bool = Boolean.FALSE;
                        f.k(6, valueOf, bool);
                        nm7.f(wsaVar2.a).k(5, Long.valueOf(j), bool);
                        yv1 ga = yv1.ga(j);
                        ga.whenFullyVisible(new e6a(wsaVar2, ga, (byte) 20));
                        Q.presentFragment(ga);
                        return;
                    }
                    return;
                }
                wsaVar2.z2(0, true, null);
                return;
            case 2:
                wsa wsaVar3 = this.b;
                String str3 = this.c;
                Context context2 = wsaVar3.getContext();
                l11.w(context2, oc7.r1(wsaVar3.a).l4.G1.f + str3, false);
                return;
            case 3:
                wsa wsaVar4 = this.b;
                String str4 = this.c;
                Context context3 = wsaVar4.getContext();
                l11.w(context3, oc7.r1(wsaVar4.a).l4.G1.f + str4, false);
                return;
            case 4:
                wsa wsaVar5 = this.b;
                String str5 = this.c;
                Context context4 = wsaVar5.getContext();
                l11.w(context4, oc7.r1(wsaVar5.a).l4.G1.f + str5, false);
                return;
            case 5:
                wsa wsaVar6 = this.b;
                String str6 = this.c;
                Context context5 = wsaVar6.getContext();
                l11.w(context5, oc7.r1(wsaVar6.a).l4.G1.f + str6, false);
                return;
            case 6:
                wsa wsaVar7 = this.b;
                String str7 = this.c;
                Context context6 = wsaVar7.getContext();
                l11.w(context6, oc7.r1(wsaVar7.a).l4.G1.f + str7, false);
                return;
            case 7:
                wsa wsaVar8 = this.b;
                gm.g(this.c);
                u31 k = wsaVar8.j().k(false);
                k.u = true;
                k.j();
                return;
            default:
                wsa wsaVar9 = this.b;
                String str8 = this.c;
                wsaVar9.dismiss();
                Context context7 = wsaVar9.getContext();
                l11.u(context7, "https://" + oc7.r1(wsaVar9.a).N2 + "/" + str8);
                return;
        }
    }
}
