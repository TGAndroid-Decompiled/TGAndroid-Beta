package d3;

import a8.p0;
import di.bb;
import di.c6;
import di.f2;
import di.k3;
import fi.u0;
import h2.l0;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.np;
import org.telegram.messenger.ur;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.jy0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.u91;
import org.telegram.ui.yw;
import zi.r0;
import zi.v0;
public final class e0 implements Runnable {
    public final int f7391a;
    public final long f7392b;
    public final long f7393c;
    public final Object d;
    public final Object f7394e;

    public e0(u0 u0Var, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, long j10) {
        this.f7391a = 2;
        this.d = u0Var;
        this.f7392b = j3;
        this.f7394e = tL_textWithEntities;
        this.f7393c = j10;
    }

    @Override
    public final void run() {
        switch (this.f7391a) {
            case 0:
                String str = (String) this.f7394e;
                long j3 = this.f7392b;
                long j10 = this.f7393c;
                String str2 = l0.f13471a;
                m2.e eVar = ((l2.z) ((h0) ((wf.b) this.d).f59108c)).f19233a.f18980s;
                m2.a U = eVar.U();
                eVar.V(U, 1016, new li.p(U, str, j10, j3, 19));
                return;
            case 1:
                c6 c6Var = (c6) this.d;
                bb bbVar = new bb(c6Var.getContext(), c6Var.J0, this.f7392b, 11, null, new f2(c6Var, new boolean[]{false}, this.f7393c, (z10) this.f7394e, 2), 0L);
                bbVar.setOnDismissListener(new k3(c6Var, 1));
                bbVar.show();
                return;
            case 2:
                ((u0) this.d).n(this.f7392b, (TLRPC.TL_textWithEntities) this.f7394e, this.f7393c);
                return;
            case 3:
                String str3 = (String) this.f7394e;
                long j11 = this.f7392b;
                long j12 = this.f7393c;
                String str4 = l0.f13471a;
                m2.e eVar2 = ((l2.z) ((n2.s) ((k8.a) this.d).f17789c)).f19233a.f18980s;
                m2.a U2 = eVar2.U();
                eVar2.V(U2, 1008, new li.p(U2, str3, j12, j11, 7));
                return;
            case 4:
                GroupCallMessagesController.c((GroupCallMessagesController) this.d, this.f7392b, this.f7393c, (byte[]) this.f7394e);
                return;
            case 5:
                ((io) this.d).e(this.f7392b, this.f7393c, (HashSet) this.f7394e);
                return;
            case 6:
                yw ywVar = (yw) this.d;
                long j13 = this.f7392b;
                long j14 = this.f7393c;
                u91 u91Var = (u91) this.f7394e;
                if (ywVar.E2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ur.a(j13, j14));
                    ywVar.E2.y(ywVar, arrayList, null, false, ywVar.L2, ywVar.M2, ywVar.N2, u91Var);
                    if (ywVar.f53664k2) {
                        ywVar.E2 = null;
                        return;
                    }
                    return;
                }
                ywVar.finishFragment();
                return;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                long j15 = this.f7392b;
                long j16 = this.f7393c;
                an anVar = (an) this.f7394e;
                String str5 = LaunchActivity.C1;
                TLRPC.TL_forumTopic f10 = np.s1(launchActivity.P).f25386r7.f(j15, j16);
                StringBuilder t6 = p0.t(j15, "LaunchActivity openForum after load ", " ");
                t6.append(j16);
                t6.append(" TL_forumTopic ");
                t6.append(f10);
                a8.b(t6.toString());
                if (launchActivity.f42649p0 != null) {
                    qg.c.a(anVar, ur.a(-j15, j16));
                    ((ActionBarLayout) launchActivity.M()).S(anVar);
                    return;
                }
                return;
            default:
                v0 v0Var = (v0) this.d;
                r0 r0Var = (r0) this.f7394e;
                long j17 = this.f7392b;
                long j18 = this.f7393c;
                synchronized (v0Var.f61751g) {
                    if (!r0Var.d && !r0Var.f61682e) {
                        ((jy0) v0Var.f61749e).a(r0Var.f61679a, r0Var.f61680b, j17, j18);
                        return;
                    }
                    return;
                }
        }
    }

    public e0(Object obj, long j3, long j10, Object obj2, int i7) {
        this.f7391a = i7;
        this.d = obj;
        this.f7392b = j3;
        this.f7393c = j10;
        this.f7394e = obj2;
    }

    public e0(Object obj, Object obj2, long j3, long j10, int i7) {
        this.f7391a = i7;
        this.d = obj;
        this.f7394e = obj2;
        this.f7392b = j3;
        this.f7393c = j10;
    }
}
