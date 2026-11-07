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
import org.telegram.ui.Components.yn;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.v91;
import org.telegram.ui.ww;
public final class h4 implements Runnable {
    public final int f3991a;
    public final long f3992b;
    public final long f3993c;
    public final Object d;
    public final Object f3994e;

    public h4(di.u0 u0Var, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, long j10) {
        this.f3991a = 2;
        this.d = u0Var;
        this.f3992b = j3;
        this.f3994e = tL_textWithEntities;
        this.f3993c = j10;
    }

    @Override
    public final void run() {
        switch (this.f3991a) {
            case 0:
                k7 k7Var = (k7) this.d;
                tc tcVar = new tc(k7Var.getContext(), k7Var.I0, this.f3992b, 11, null, new w2(k7Var, new boolean[]{false}, this.f3993c, (c20) this.f3994e, 2), 0L);
                tcVar.setOnDismissListener(new j4(k7Var, 1));
                tcVar.show();
                return;
            case 1:
                String str = (String) this.f3994e;
                long j3 = this.f3992b;
                long j10 = this.f3993c;
                String str2 = h2.m0.f14112a;
                m2.e eVar = ((l2.c0) ((d3.h0) ((wf.b) this.d).f57563c)).f17771a.f17881s;
                m2.a U = eVar.U();
                eVar.V(U, 1016, new m2.c(U, str, j10, j3, 13));
                return;
            case 2:
                ((di.u0) this.d).n(this.f3992b, (TLRPC.TL_textWithEntities) this.f3994e, this.f3993c);
                return;
            case 3:
                String str3 = (String) this.f3994e;
                long j11 = this.f3992b;
                long j12 = this.f3993c;
                String str4 = h2.m0.f14112a;
                m2.e eVar2 = ((l2.c0) ((n2.s) ((j2.n) this.d).f16454c)).f17771a.f17881s;
                m2.a U2 = eVar2.U();
                eVar2.V(U2, 1008, new m2.c(U2, str3, j12, j11, 1));
                return;
            case 4:
                GroupCallMessagesController.d((GroupCallMessagesController) this.d, this.f3992b, this.f3993c, (byte[]) this.f3994e);
                return;
            case 5:
                ((yn) this.d).e(this.f3992b, this.f3993c, (HashSet) this.f3994e);
                return;
            case 6:
                ww wwVar = (ww) this.d;
                long j13 = this.f3992b;
                long j14 = this.f3993c;
                v91 v91Var = (v91) this.f3994e;
                if (wwVar.C2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(xr.a(j13, j14));
                    wwVar.C2.y(wwVar, arrayList, null, false, wwVar.J2, wwVar.K2, wwVar.L2, v91Var);
                    if (wwVar.f51572i2) {
                        wwVar.C2 = null;
                        return;
                    }
                    return;
                }
                wwVar.finishFragment();
                return;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                long j15 = this.f3992b;
                long j16 = this.f3993c;
                an anVar = (an) this.f3994e;
                String str5 = LaunchActivity.B1;
                TLRPC.TL_forumTopic f10 = qp.s1(launchActivity.O).f24870q7.f(j15, j16);
                StringBuilder t6 = a8.p0.t(j15, "LaunchActivity openForum after load ", " ");
                t6.append(j16);
                t6.append(" TL_forumTopic ");
                t6.append(f10);
                org.telegram.messenger.a8.b(t6.toString());
                if (launchActivity.f41275o0 != null) {
                    qg.d.a(anVar, xr.a(-j15, j16));
                    ((ActionBarLayout) launchActivity.M()).S(anVar);
                    return;
                }
                return;
            default:
                wi.u0 u0Var = (wi.u0) this.d;
                wi.q0 q0Var = (wi.q0) this.f3994e;
                long j17 = this.f3992b;
                long j18 = this.f3993c;
                synchronized (u0Var.f58109g) {
                    if (!q0Var.d && !q0Var.f58037e) {
                        ((hy0) u0Var.f58107e).a(q0Var.f58034a, q0Var.f58035b, j17, j18);
                        return;
                    }
                    return;
                }
        }
    }

    public h4(Object obj, long j3, long j10, Object obj2, int i7) {
        this.f3991a = i7;
        this.d = obj;
        this.f3992b = j3;
        this.f3993c = j10;
        this.f3994e = obj2;
    }

    public h4(Object obj, Object obj2, long j3, long j10, int i7) {
        this.f3991a = i7;
        this.d = obj;
        this.f3994e = obj2;
        this.f3992b = j3;
        this.f3993c = j10;
    }
}
