package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class og1 {
    public final na7 a;
    public final ConnectionsManager b;

    public og1(int i) {
        this.a = na7.q1(i);
        this.b = ConnectionsManager.getInstance(i);
    }

    public final void a(long j, p8c p8cVar) {
        TL_stories.TL_premium_getBoostsStatus tL_premium_getBoostsStatus = new TL_stories.TL_premium_getBoostsStatus();
        tL_premium_getBoostsStatus.peer = this.a.h1(j);
        this.b.sendRequest(tL_premium_getBoostsStatus, new lg1(p8cVar, (byte) 0));
    }

    public final void b(long j, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, p8c p8cVar) {
        ng1 ng1Var = new ng1();
        na7 na7Var = this.a;
        na7Var.w1(j);
        ng1Var.j = j;
        ng1Var.k = na7Var.K0(Long.valueOf(-j));
        ht htVar = new ht(ng1Var, tL_premium_boostsStatus, p8cVar, (byte) 6);
        x0 x0Var = new x0(ng1Var, p8cVar, (byte) 13);
        ConnectionsManager.getInstance(y6c.t0).sendRequest(new TL_stories.TL_premium_getMyBoosts(), new en0((p8c) x0Var, na7.q1(y6c.t0), (p8c) htVar, (byte) 3));
    }
}
