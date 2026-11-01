package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class i3 {
    public final wp f16199a;
    public final ConnectionsManager f16200b;

    public i3(int i10) {
        this.f16199a = wp.r1(i10);
        this.f16200b = ConnectionsManager.getInstance(i10);
    }

    public final void a(long j10, r20 r20Var) {
        TL_stories.TL_premium_getBoostsStatus tL_premium_getBoostsStatus = new TL_stories.TL_premium_getBoostsStatus();
        tL_premium_getBoostsStatus.peer = this.f16199a.i1(j10);
        this.f16200b.sendRequest(tL_premium_getBoostsStatus, new f3(r20Var, 0));
    }

    public final void b(long j10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, r20 r20Var) {
        h3 h3Var = new h3();
        wp wpVar = this.f16199a;
        wpVar.y1(j10);
        h3Var.f16011j = j10;
        h3Var.f16012k = wpVar.L0(Long.valueOf(-j10));
        g3 g3Var = new g3(h3Var, tL_premium_boostsStatus, r20Var, 0);
        j1 j1Var = new j1(1, h3Var, r20Var);
        ConnectionsManager.getInstance(e20.f15506s0).sendRequest(new TL_stories.TL_premium_getMyBoosts(), new ag.p0(j1Var, wp.r1(e20.f15506s0), g3Var, 6));
    }
}
