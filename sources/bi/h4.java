package bi;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.xr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.xn;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
import org.telegram.ui.z91;
import org.telegram.ui.zw;
public final class h4 implements Runnable {
    public final int f3988a;
    public final long f3989b;
    public final long f3990c;
    public final Object d;
    public final Object f3991e;

    public h4(di.u0 u0Var, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, long j10) {
        this.f3988a = 2;
        this.d = u0Var;
        this.f3989b = j3;
        this.f3991e = tL_textWithEntities;
        this.f3990c = j10;
    }

    @Override
    public final void run() {
        switch (this.f3988a) {
            case 0:
                k7 k7Var = (k7) this.d;
                tc tcVar = new tc(k7Var.getContext(), k7Var.I0, this.f3989b, 11, null, new w2(k7Var, new boolean[]{false}, this.f3990c, (c20) this.f3991e, 2), 0L);
                tcVar.setOnDismissListener(new j4(k7Var, 1));
                tcVar.show();
                return;
            case 1:
                String str = (String) this.f3991e;
                long j3 = this.f3989b;
                long j10 = this.f3990c;
                String str2 = h2.m0.f14114a;
                m2.e eVar = ((l2.c0) ((d3.h0) ((wf.b) this.d).f57667c)).f17775a.f17885s;
                m2.a U = eVar.U();
                eVar.V(U, 1016, new m2.c(U, str, j10, j3, 13));
                return;
            case 2:
                ((di.u0) this.d).n(this.f3989b, (TLRPC.TL_textWithEntities) this.f3991e, this.f3990c);
                return;
            case 3:
                String str3 = (String) this.f3991e;
                long j11 = this.f3989b;
                long j12 = this.f3990c;
                String str4 = h2.m0.f14114a;
                m2.e eVar2 = ((l2.c0) ((n2.s) ((j2.n) this.d).f16457c)).f17775a.f17885s;
                m2.a U2 = eVar2.U();
                eVar2.V(U2, 1008, new m2.c(U2, str3, j12, j11, 1));
                return;
            case 4:
                GroupCallMessagesController.c((GroupCallMessagesController) this.d, this.f3989b, this.f3990c, (byte[]) this.f3991e);
                return;
            case 5:
                ((xn) this.d).e(this.f3989b, this.f3990c, (HashSet) this.f3991e);
                return;
            case 6:
                zw zwVar = (zw) this.d;
                long j13 = this.f3989b;
                long j14 = this.f3990c;
                z91 z91Var = (z91) this.f3991e;
                if (zwVar.D2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(xr.a(j13, j14));
                    zwVar.D2.y(zwVar, arrayList, null, false, zwVar.K2, zwVar.L2, zwVar.M2, z91Var);
                    if (zwVar.f52605j2) {
                        zwVar.D2 = null;
                        return;
                    }
                    return;
                }
                zwVar.finishFragment();
                return;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                long j15 = this.f3989b;
                long j16 = this.f3990c;
                cn cnVar = (cn) this.f3991e;
                String str5 = LaunchActivity.B1;
                TLRPC.TL_forumTopic f10 = qp.s1(launchActivity.O).f24881q7.f(j15, j16);
                StringBuilder t6 = a8.p0.t(j15, "LaunchActivity openForum after load ", " ");
                t6.append(j16);
                t6.append(" TL_forumTopic ");
                t6.append(f10);
                org.telegram.messenger.a8.b(t6.toString());
                if (launchActivity.f41277o0 != null) {
                    qg.d.a(cnVar, xr.a(-j15, j16));
                    ((ActionBarLayout) launchActivity.M()).S(cnVar);
                    return;
                }
                return;
            default:
                wi.t0 t0Var = (wi.t0) this.d;
                wi.p0 p0Var = (wi.p0) this.f3991e;
                long j17 = this.f3989b;
                long j18 = this.f3990c;
                synchronized (t0Var.f58212g) {
                    if (!p0Var.d && !p0Var.f58141e) {
                        ((hy0) t0Var.f58210e).a(p0Var.f58138a, p0Var.f58139b, j17, j18);
                        return;
                    }
                    return;
                }
        }
    }

    public h4(Object obj, long j3, long j10, Object obj2, int i7) {
        this.f3988a = i7;
        this.d = obj;
        this.f3989b = j3;
        this.f3990c = j10;
        this.f3991e = obj2;
    }

    public h4(Object obj, Object obj2, long j3, long j10, int i7) {
        this.f3988a = i7;
        this.d = obj;
        this.f3991e = obj2;
        this.f3989b = j3;
        this.f3990c = j10;
    }
}
