package c3;

import ci.l2;
import ci.l6;
import ci.mb;
import ci.t3;
import ei.w0;
import g2.n0;
import ii.y3;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.hp;
import org.telegram.messenger.pr;
import org.telegram.messenger.u10;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.xn;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m91;
import org.telegram.ui.uw;
import org.telegram.ui.wm;
import wi.p0;
import wi.t0;
public final class f0 implements Runnable {
    public final int f4031a;
    public final long f4032b;
    public final long f4033c;
    public final Object d;
    public final Object f4034e;

    public f0(w0 w0Var, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, long j11) {
        this.f4031a = 2;
        this.d = w0Var;
        this.f4032b = j10;
        this.f4034e = tL_textWithEntities;
        this.f4033c = j11;
    }

    @Override
    public final void run() {
        switch (this.f4031a) {
            case 0:
                String str = (String) this.f4034e;
                long j10 = this.f4032b;
                long j11 = this.f4033c;
                String str2 = n0.f11873a;
                l2.f fVar = ((k2.c0) ((i0) ((tf.b) this.d).f55095b)).f16459a.f16572s;
                l2.a U = fVar.U();
                fVar.V(U, 1016, new l2.c(U, str, j11, j10));
                return;
            case 1:
                l6 l6Var = (l6) this.d;
                mb mbVar = new mb(l6Var.getContext(), l6Var.J0, this.f4032b, 11, null, new l2(l6Var, new boolean[]{false}, this.f4033c, (u10) this.f4034e, 2), 0L);
                mbVar.setOnDismissListener(new t3(l6Var, 1));
                mbVar.show();
                return;
            case 2:
                ((w0) this.d).n(this.f4032b, (TLRPC.TL_textWithEntities) this.f4034e, this.f4033c);
                return;
            case 3:
                String str3 = (String) this.f4034e;
                long j12 = this.f4032b;
                long j13 = this.f4033c;
                String str4 = n0.f11873a;
                l2.f fVar2 = ((k2.c0) ((m2.u) ((m2.t) this.d).f19007c)).f16459a.f16572s;
                l2.a U2 = fVar2.U();
                fVar2.V(U2, 1008, new y3(U2, str3, j13, j12));
                return;
            case 4:
                ((GroupCallMessagesController) this.d).lambda$processUpdate$3(this.f4032b, this.f4033c, (byte[]) this.f4034e);
                return;
            case 5:
                ((xn) this.d).e(this.f4032b, this.f4033c, (HashSet) this.f4034e);
                return;
            case 6:
                uw uwVar = (uw) this.d;
                long j14 = this.f4032b;
                long j15 = this.f4033c;
                m91 m91Var = (m91) this.f4034e;
                if (uwVar.D2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(pr.a(j14, j15));
                    uwVar.D2.y(uwVar, arrayList, null, false, uwVar.K2, uwVar.L2, uwVar.M2, m91Var);
                    if (uwVar.f50251j2) {
                        uwVar.D2 = null;
                        return;
                    }
                    return;
                }
                uwVar.finishFragment();
                return;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                long j16 = this.f4032b;
                long j17 = this.f4033c;
                wm wmVar = (wm) this.f4034e;
                String str5 = LaunchActivity.E1;
                TLRPC.TL_forumTopic f10 = hp.s1(launchActivity.P).f23102q7.f(j16, j17);
                StringBuilder t10 = a1.g.t(j16, "LaunchActivity openForum after load ", " ");
                t10.append(j17);
                t10.append(" TL_forumTopic ");
                t10.append(f10);
                a8.b(t10.toString());
                if (launchActivity.f41314r0 != null) {
                    rg.c.a(wmVar, pr.a(-j16, j17));
                    ((ActionBarLayout) launchActivity.M()).S(wmVar);
                    return;
                }
                return;
            default:
                t0 t0Var = (t0) this.d;
                p0 p0Var = (p0) this.f4034e;
                long j18 = this.f4032b;
                long j19 = this.f4033c;
                synchronized (t0Var.f58059g) {
                    if (!p0Var.d && !p0Var.f57995e) {
                        ((gy0) t0Var.f58057e).a(p0Var.f57992a, p0Var.f57993b, j18, j19);
                        return;
                    }
                    return;
                }
        }
    }

    public f0(Object obj, long j10, long j11, Object obj2, int i3) {
        this.f4031a = i3;
        this.d = obj;
        this.f4032b = j10;
        this.f4033c = j11;
        this.f4034e = obj2;
    }

    public f0(Object obj, Object obj2, long j10, long j11, int i3) {
        this.f4031a = i3;
        this.d = obj;
        this.f4034e = obj2;
        this.f4032b = j10;
        this.f4033c = j11;
    }
}
