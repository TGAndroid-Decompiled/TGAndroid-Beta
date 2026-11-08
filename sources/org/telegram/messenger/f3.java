package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class f3 {
    public final qp f22358a;
    public final ConnectionsManager f22359b;

    public f3(int i7) {
        this.f22358a = qp.s1(i7);
        this.f22359b = ConnectionsManager.getInstance(i7);
    }

    public final void a(long j3, c20 c20Var) {
        TL_stories.TL_premium_getBoostsStatus tL_premium_getBoostsStatus = new TL_stories.TL_premium_getBoostsStatus();
        tL_premium_getBoostsStatus.peer = this.f22358a.j1(j3);
        this.f22359b.sendRequest(tL_premium_getBoostsStatus, new c3(c20Var, 0));
    }

    public final void b(long j3, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, c20 c20Var) {
        e3 e3Var = new e3();
        qp qpVar = this.f22358a;
        qpVar.z1(j3);
        e3Var.f22178j = j3;
        e3Var.f22179k = qpVar.M0(Long.valueOf(-j3));
        d3 d3Var = new d3(e3Var, tL_premium_boostsStatus, c20Var, 0);
        g1 g1Var = new g1(1, e3Var, c20Var);
        ConnectionsManager.getInstance(p10.f24470s0).sendRequest(new TL_stories.TL_premium_getMyBoosts(), new bi.f2(g1Var, qp.s1(p10.f24470s0), d3Var, 24));
    }
}
