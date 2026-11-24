package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class wh1 {
    public final oc7 a;
    public final ConnectionsManager b;

    public wh1(int i) {
        this.a = oc7.r1(i);
        this.b = ConnectionsManager.getInstance(i);
    }

    public final void a(long j, qac qacVar) {
        TL_stories.TL_premium_getBoostsStatus tL_premium_getBoostsStatus = new TL_stories.TL_premium_getBoostsStatus();
        tL_premium_getBoostsStatus.peer = this.a.i1(j);
        this.b.sendRequest(tL_premium_getBoostsStatus, new th1(qacVar, (byte) 0));
    }

    public final void b(long j, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, qac qacVar) {
        vh1 vh1Var = new vh1();
        oc7 oc7Var = this.a;
        oc7Var.x1(j);
        vh1Var.j = j;
        vh1Var.k = oc7Var.L0(Long.valueOf(-j));
        iu iuVar = new iu(vh1Var, tL_premium_boostsStatus, qacVar, (byte) 6);
        x0 x0Var = new x0(vh1Var, qacVar, (byte) 14);
        ConnectionsManager.getInstance(z8c.t0).sendRequest(new TL_stories.TL_premium_getMyBoosts(), new eo0((qac) x0Var, oc7.r1(z8c.t0), (qac) iuVar, (byte) 3));
    }
}
