package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class h3 {
    public final mp f24476a;
    public final ConnectionsManager f24477b;

    public h3(int i7) {
        this.f24476a = mp.u1(i7);
        this.f24477b = ConnectionsManager.getInstance(i7);
    }

    public final void a(long j3, w10 w10Var) {
        TL_stories.TL_premium_getBoostsStatus tL_premium_getBoostsStatus = new TL_stories.TL_premium_getBoostsStatus();
        tL_premium_getBoostsStatus.peer = this.f24476a.l1(j3);
        this.f24477b.sendRequest(tL_premium_getBoostsStatus, new d3(w10Var, 0));
    }

    public final void b(long j3, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, w10 w10Var) {
        g3 g3Var = new g3();
        mp mpVar = this.f24476a;
        mpVar.B1(j3);
        g3Var.f24261j = j3;
        g3Var.f24262k = mpVar.O0(Long.valueOf(-j3));
        e3 e3Var = new e3(g3Var, tL_premium_boostsStatus, w10Var, 0);
        g1 g1Var = new g1(1, g3Var, w10Var);
        ConnectionsManager.getInstance(i10.f24637t0).sendRequest(new TL_stories.TL_premium_getMyBoosts(), new bi.q1(g1Var, mp.u1(i10.f24637t0), e3Var, 27));
    }
}
