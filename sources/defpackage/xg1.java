package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class xg1 {
    public final uc7 a;
    public final ConnectionsManager b;

    public xg1(int i) {
        this.a = uc7.s1(i);
        this.b = ConnectionsManager.getInstance(i);
    }

    public final void a(long j, pcc pccVar) {
        TL_stories.TL_premium_getBoostsStatus tL_premium_getBoostsStatus = new TL_stories.TL_premium_getBoostsStatus();
        tL_premium_getBoostsStatus.peer = this.a.j1(j);
        this.b.sendRequest(tL_premium_getBoostsStatus, new ug1(pccVar, (byte) 0));
    }

    public final void b(long j, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, pcc pccVar) {
        wg1 wg1Var = new wg1();
        uc7 uc7Var = this.a;
        uc7Var.y1(j);
        wg1Var.j = j;
        wg1Var.k = uc7Var.M0(Long.valueOf(-j));
        gt gtVar = new gt(wg1Var, tL_premium_boostsStatus, pccVar, (byte) 6);
        y0 y0Var = new y0(wg1Var, pccVar, (byte) 13);
        ConnectionsManager.getInstance(yac.t0).sendRequest(new TL_stories.TL_premium_getMyBoosts(), new fn0((pcc) y0Var, uc7.s1(yac.t0), (pcc) gtVar, (byte) 1));
    }
}
