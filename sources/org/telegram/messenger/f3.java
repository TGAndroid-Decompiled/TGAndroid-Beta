package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class f3 {
    public final hp f22441a;
    public final ConnectionsManager f22442b;

    public f3(int i3) {
        this.f22441a = hp.s1(i3);
        this.f22442b = ConnectionsManager.getInstance(i3);
    }

    public final void a(long j10, u10 u10Var) {
        TL_stories.TL_premium_getBoostsStatus tL_premium_getBoostsStatus = new TL_stories.TL_premium_getBoostsStatus();
        tL_premium_getBoostsStatus.peer = this.f22441a.j1(j10);
        this.f22442b.sendRequest(tL_premium_getBoostsStatus, new c3(u10Var, 0));
    }

    public final void b(long j10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, u10 u10Var) {
        e3 e3Var = new e3();
        hp hpVar = this.f22441a;
        hpVar.z1(j10);
        e3Var.f22306j = j10;
        e3Var.f22307k = hpVar.M0(Long.valueOf(-j10));
        d3 d3Var = new d3(e3Var, tL_premium_boostsStatus, u10Var, 0);
        g1 g1Var = new g1(1, e3Var, u10Var);
        ConnectionsManager.getInstance(h10.f22829t0).sendRequest(new TL_stories.TL_premium_getMyBoosts(), new ai.r6(g1Var, hp.s1(h10.f22829t0), d3Var, 25));
    }
}
