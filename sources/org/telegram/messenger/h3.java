package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class h3 {
    public final mp f24406a;
    public final ConnectionsManager f24407b;

    public h3(int i7) {
        this.f24406a = mp.u1(i7);
        this.f24407b = ConnectionsManager.getInstance(i7);
    }

    public final void a(long j3, x10 x10Var) {
        TL_stories.TL_premium_getBoostsStatus tL_premium_getBoostsStatus = new TL_stories.TL_premium_getBoostsStatus();
        tL_premium_getBoostsStatus.peer = this.f24406a.l1(j3);
        this.f24407b.sendRequest(tL_premium_getBoostsStatus, new d3(x10Var, 0));
    }

    public final void b(long j3, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, x10 x10Var) {
        g3 g3Var = new g3();
        mp mpVar = this.f24406a;
        mpVar.B1(j3);
        g3Var.f24187j = j3;
        g3Var.f24188k = mpVar.O0(Long.valueOf(-j3));
        e3 e3Var = new e3(g3Var, tL_premium_boostsStatus, x10Var, 0);
        g1 g1Var = new g1(1, g3Var, x10Var);
        ConnectionsManager.getInstance(j10.f24798t0).sendRequest(new TL_stories.TL_premium_getMyBoosts(), new bi.q1(g1Var, mp.u1(j10.f24798t0), e3Var, 27));
    }
}
