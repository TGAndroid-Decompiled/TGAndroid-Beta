package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class h3 {
    public final mp f24381a;
    public final ConnectionsManager f24382b;

    public h3(int i7) {
        this.f24381a = mp.u1(i7);
        this.f24382b = ConnectionsManager.getInstance(i7);
    }

    public final void a(long j3, x10 x10Var) {
        TL_stories.TL_premium_getBoostsStatus tL_premium_getBoostsStatus = new TL_stories.TL_premium_getBoostsStatus();
        tL_premium_getBoostsStatus.peer = this.f24381a.l1(j3);
        this.f24382b.sendRequest(tL_premium_getBoostsStatus, new d3(x10Var, 0));
    }

    public final void b(long j3, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, x10 x10Var) {
        g3 g3Var = new g3();
        mp mpVar = this.f24381a;
        mpVar.B1(j3);
        g3Var.f24162j = j3;
        g3Var.f24163k = mpVar.O0(Long.valueOf(-j3));
        e3 e3Var = new e3(g3Var, tL_premium_boostsStatus, x10Var, 0);
        g1 g1Var = new g1(1, g3Var, x10Var);
        ConnectionsManager.getInstance(j10.f24773t0).sendRequest(new TL_stories.TL_premium_getMyBoosts(), new bi.m1(g1Var, mp.u1(j10.f24773t0), e3Var, 27));
    }
}
