package d3;

import a8.p0;
import di.f6;
import di.fb;
import di.i2;
import di.n3;
import fi.t0;
import h2.l0;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.mp;
import org.telegram.messenger.sr;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.po;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.y91;
import zi.q0;
import zi.u0;
public final class e0 implements Runnable {
    public final int f7674a;
    public final long f7675b;
    public final long f7676c;
    public final Object d;
    public final Object f7677e;

    public e0(t0 t0Var, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, long j10) {
        this.f7674a = 2;
        this.d = t0Var;
        this.f7675b = j3;
        this.f7677e = tL_textWithEntities;
        this.f7676c = j10;
    }

    @Override
    public final void run() {
        switch (this.f7674a) {
            case 0:
                String str = (String) this.f7677e;
                long j3 = this.f7675b;
                long j10 = this.f7676c;
                String str2 = l0.f13786a;
                m2.d dVar = ((l2.z) ((h0) ((wf.b) this.d).f59673c)).f19600a.f19347s;
                m2.a U = dVar.U();
                dVar.V(U, 1016, new li.c(U, str, j10, j3, 20));
                return;
            case 1:
                f6 f6Var = (f6) this.d;
                fb fbVar = new fb(f6Var.getContext(), f6Var.J0, this.f7675b, 11, null, new i2(f6Var, new boolean[]{false}, this.f7676c, (x10) this.f7677e, 2), 0L);
                fbVar.setOnDismissListener(new n3(f6Var, 1));
                fbVar.show();
                return;
            case 2:
                ((t0) this.d).n(this.f7675b, (TLRPC.TL_textWithEntities) this.f7677e, this.f7676c);
                return;
            case 3:
                String str3 = (String) this.f7677e;
                long j11 = this.f7675b;
                long j12 = this.f7676c;
                String str4 = l0.f13786a;
                m2.d dVar2 = ((l2.z) ((n2.s) ((k8.a) this.d).f18184c)).f19600a.f19347s;
                m2.a U2 = dVar2.U();
                dVar2.V(U2, 1008, new li.c(U2, str3, j12, j11, 8));
                return;
            case 4:
                GroupCallMessagesController.c((GroupCallMessagesController) this.d, this.f7675b, this.f7676c, (byte[]) this.f7677e);
                return;
            case 5:
                ((po) this.d).e(this.f7675b, this.f7676c, (HashSet) this.f7677e);
                return;
            case 6:
                cx cxVar = (cx) this.d;
                long j13 = this.f7675b;
                long j14 = this.f7676c;
                y91 y91Var = (y91) this.f7677e;
                if (cxVar.E2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(sr.a(j13, j14));
                    cxVar.E2.y(cxVar, arrayList, null, false, cxVar.L2, cxVar.M2, cxVar.N2, y91Var);
                    if (cxVar.f46709k2) {
                        cxVar.E2 = null;
                        return;
                    }
                    return;
                }
                cxVar.finishFragment();
                return;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                long j15 = this.f7675b;
                long j16 = this.f7676c;
                bn bnVar = (bn) this.f7677e;
                String str5 = LaunchActivity.C1;
                TLRPC.TL_forumTopic f10 = mp.u1(launchActivity.P).f25771t7.f(j15, j16);
                StringBuilder t6 = p0.t(j15, "LaunchActivity openForum after load ", " ");
                t6.append(j16);
                t6.append(" TL_forumTopic ");
                t6.append(f10);
                a8.b(t6.toString());
                if (launchActivity.f43094p0 != null) {
                    qg.c.a(bnVar, sr.a(-j15, j16));
                    ((ActionBarLayout) launchActivity.M()).S(bnVar);
                    return;
                }
                return;
            default:
                u0 u0Var = (u0) this.d;
                q0 q0Var = (q0) this.f7677e;
                long j17 = this.f7675b;
                long j18 = this.f7676c;
                synchronized (u0Var.f62315g) {
                    if (!q0Var.d && !q0Var.f62246e) {
                        ((qy0) u0Var.f62313e).a(q0Var.f62243a, q0Var.f62244b, j17, j18);
                        return;
                    }
                    return;
                }
        }
    }

    public e0(Object obj, long j3, long j10, Object obj2, int i7) {
        this.f7674a = i7;
        this.d = obj;
        this.f7675b = j3;
        this.f7676c = j10;
        this.f7677e = obj2;
    }

    public e0(Object obj, Object obj2, long j3, long j10, int i7) {
        this.f7674a = i7;
        this.d = obj;
        this.f7677e = obj2;
        this.f7675b = j3;
        this.f7676c = j10;
    }
}
