package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class h3 {
    public final np f24389a;
    public final ConnectionsManager f24390b;

    public h3(int i7) {
        this.f24389a = np.u1(i7);
        this.f24390b = ConnectionsManager.getInstance(i7);
    }

    public final void a(long j3, y10 y10Var) {
        TL_stories.TL_premium_getBoostsStatus tL_premium_getBoostsStatus = new TL_stories.TL_premium_getBoostsStatus();
        tL_premium_getBoostsStatus.peer = this.f24389a.l1(j3);
        this.f24390b.sendRequest(tL_premium_getBoostsStatus, new d3(y10Var, 0));
    }

    public final void b(long j3, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, y10 y10Var) {
        g3 g3Var = new g3();
        np npVar = this.f24389a;
        npVar.B1(j3);
        g3Var.f24081j = j3;
        g3Var.f24082k = npVar.O0(Long.valueOf(-j3));
        e3 e3Var = new e3(g3Var, tL_premium_boostsStatus, y10Var, 0);
        g1 g1Var = new g1(1, g3Var, y10Var);
        ConnectionsManager.getInstance(k10.f24968t0).sendRequest(new TL_stories.TL_premium_getMyBoosts(), new bi.q1(g1Var, np.u1(k10.f24968t0), e3Var, 27));
    }
}
