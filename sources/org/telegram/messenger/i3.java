package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class i3 {
    public final vp f16046a;
    public final ConnectionsManager f16047b;

    public i3(int i10) {
        this.f16046a = vp.r1(i10);
        this.f16047b = ConnectionsManager.getInstance(i10);
    }

    public final void a(long j10, q20 q20Var) {
        TL_stories.TL_premium_getBoostsStatus tL_premium_getBoostsStatus = new TL_stories.TL_premium_getBoostsStatus();
        tL_premium_getBoostsStatus.peer = this.f16046a.i1(j10);
        this.f16047b.sendRequest(tL_premium_getBoostsStatus, new f3(q20Var, 0));
    }

    public final void b(long j10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, q20 q20Var) {
        h3 h3Var = new h3();
        vp vpVar = this.f16046a;
        vpVar.y1(j10);
        h3Var.f15825j = j10;
        h3Var.f15826k = vpVar.L0(Long.valueOf(-j10));
        g3 g3Var = new g3(h3Var, tL_premium_boostsStatus, q20Var, 0);
        j1 j1Var = new j1(1, h3Var, q20Var);
        ConnectionsManager.getInstance(d20.f15147s0).sendRequest(new TL_stories.TL_premium_getMyBoosts(), new ag.p0(j1Var, vp.r1(d20.f15147s0), g3Var, 6));
    }
}
