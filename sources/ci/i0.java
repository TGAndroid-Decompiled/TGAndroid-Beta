package ci;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.xd;
public final class i0 {
    public static volatile i0[] f5266m = new i0[4];
    public static final Object[] f5267n = new Object[4];
    public final int f5268a;
    public final HashMap f5269b = new HashMap();
    public final HashMap f5270c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap f5271e = new HashMap();
    public final HashMap f5272f = new HashMap();
    public final HashMap f5273g = new HashMap();
    public final HashMap h = new HashMap();
    public boolean f5274i;
    public ArrayList f5275j;
    public boolean f5276k;
    public ArrayList f5277l;

    static {
        for (int i3 = 0; i3 < 4; i3++) {
            f5267n[i3] = new Object();
        }
    }

    public i0(int i3) {
        this.f5268a = i3;
    }

    public static i0 g(int i3) {
        i0 i0Var;
        i0 i0Var2 = f5266m[i3];
        if (i0Var2 == null) {
            synchronized (f5267n[i3]) {
                try {
                    i0Var = f5266m[i3];
                    if (i0Var == null) {
                        i0[] i0VarArr = f5266m;
                        i0 i0Var3 = new i0(i3);
                        i0VarArr[i3] = i0Var3;
                        i0Var = i0Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return i0Var;
        }
        return i0Var2;
    }

    public final boolean a(long j10) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats h = h(j10, false);
        if (h == null || (tL_starsRevenueStatus = h.status) == null || (tL_starsRevenueStatus.available_balance.amount <= 0 && tL_starsRevenueStatus.overall_revenue.amount <= 0 && tL_starsRevenueStatus.current_balance.amount <= 0)) {
            return false;
        }
        return true;
    }

    public final boolean b(long j10) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats j11 = j(j10, false);
        if (j11 == null || (tL_starsRevenueStatus = j11.status) == null || (tL_starsRevenueStatus.current_balance.amount <= 0 && tL_starsRevenueStatus.available_balance.amount <= 0 && tL_starsRevenueStatus.overall_revenue.amount <= 0)) {
            return false;
        }
        return true;
    }

    public final TL_stars.StarsAmount c(long j10) {
        TLRPC.TL_payments_starsRevenueStats h = h(j10, false);
        if (h == null) {
            return TL_stars.StarsAmount.ofStars(0L);
        }
        return h.status.current_balance;
    }

    public final f0 d(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.f5273g;
        f0 f0Var = (f0) hashMap.get(valueOf);
        if (f0Var == null) {
            Long valueOf2 = Long.valueOf(j10);
            f0 f0Var2 = new f0(this.f5268a, j10);
            hashMap.put(valueOf2, f0Var2);
            return f0Var2;
        }
        return f0Var;
    }

    public final g0 e(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.h;
        g0 g0Var = (g0) hashMap.get(valueOf);
        if (g0Var == null) {
            Long valueOf2 = Long.valueOf(j10);
            g0 g0Var2 = new g0(this.f5268a, j10);
            hashMap.put(valueOf2, g0Var2);
            return g0Var2;
        }
        return g0Var;
    }

    public final void f(Context context, long j10, long j11, u10 u10Var) {
        f0 f0Var = (f0) this.f5273g.get(Long.valueOf(j10));
        if (f0Var != null) {
            ArrayList arrayList = f0Var.f5063e;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (!((TL_payments.connectedBotStarRef) arrayList.get(i3)).revoked && ((TL_payments.connectedBotStarRef) arrayList.get(i3)).bot_id == j11) {
                    u10Var.a((TL_payments.connectedBotStarRef) arrayList.get(i3));
                    return;
                }
            }
        }
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, context, null);
        TL_payments.getConnectedStarRefBot getconnectedstarrefbot = new TL_payments.getConnectedStarRefBot();
        int i10 = this.f5268a;
        getconnectedstarrefbot.peer = hp.s1(i10).j1(j10);
        getconnectedstarrefbot.bot = hp.s1(i10).o1(j11);
        int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbot, new a0(this, s1Var, j11, u10Var, 0));
        s1Var.f28546j0 = true;
        s1Var.setOnCancelListener(new b0(this, sendRequest, 0));
        s1Var.r(200L);
    }

    public final TLRPC.TL_payments_starsRevenueStats h(long j10, boolean z10) {
        Long l10 = (Long) this.f5269b.get(Long.valueOf(j10));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.f5270c.get(Long.valueOf(j10));
        if (l10 != null && System.currentTimeMillis() - l10.longValue() <= 300000 && !z10) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.k6.I.q();
        int i3 = this.f5268a;
        tL_payments_getStarsRevenueStats.peer = hp.s1(i3).j1(j10);
        ConnectionsManager.getInstance(i3).sendRequest(tL_payments_getStarsRevenueStats, new w(this, j10, 0));
        return tL_payments_starsRevenueStats;
    }

    public final long i(long j10) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TL_stars.StarsAmount starsAmount;
        TLRPC.TL_payments_starsRevenueStats j11 = j(j10, false);
        if (j11 != null && (tL_starsRevenueStatus = j11.status) != null && (starsAmount = tL_starsRevenueStatus.current_balance) != null) {
            return starsAmount.amount;
        }
        return 0L;
    }

    public final TLRPC.TL_payments_starsRevenueStats j(long j10, boolean z10) {
        int i3;
        Long l10 = (Long) this.d.get(Long.valueOf(j10));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.f5271e.get(Long.valueOf(j10));
        if (l10 != null && System.currentTimeMillis() - l10.longValue() <= 300000 && !z10) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.ton = true;
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.k6.I.q();
        int i10 = this.f5268a;
        tL_payments_getStarsRevenueStats.peer = hp.s1(i10).j1(j10);
        TLRPC.ChatFull N0 = hp.s1(i10).N0(-j10);
        if (N0 != null) {
            i3 = N0.stats_dc;
        } else {
            i3 = Integer.MAX_VALUE;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new w(this, j10, 1), null, null, 0, i3, 1, true);
        return tL_payments_starsRevenueStats;
    }

    public final h0 k(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.f5272f;
        h0 h0Var = (h0) hashMap.get(valueOf);
        if (h0Var == null) {
            Long valueOf2 = Long.valueOf(j10);
            h0 h0Var2 = new h0();
            hashMap.put(valueOf2, h0Var2);
            return h0Var2;
        }
        return h0Var;
    }

    public final void l(long j10) {
        h0 k10 = k(j10);
        boolean[] zArr = k10.d;
        for (int i3 = 0; i3 < 3; i3++) {
            if (!zArr[i3]) {
                k10.f5203a[i3].clear();
                k10.f5205c[i3] = null;
                zArr[i3] = false;
                k10.f5206e[i3] = false;
                p(i3, j10);
            }
        }
    }

    public final boolean m(long j10) {
        if (j(j10, false) == null) {
            return false;
        }
        return true;
    }

    public final void n() {
        if (!this.f5274i && this.f5275j == null) {
            this.f5274i = true;
            ConnectionsManager.getInstance(this.f5268a).sendRequest(new TL_bots.getAdminedBots(), new z(this, 1));
        }
    }

    public final void o() {
        if (!this.f5276k && this.f5277l == null) {
            this.f5276k = true;
            ConnectionsManager.getInstance(this.f5268a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new z(this, 0));
        }
    }

    public final void p(int i3, long j10) {
        boolean z10;
        h0 k10 = k(j10);
        boolean[] zArr = k10.d;
        if (!zArr[i3] && !k10.f5206e[i3]) {
            boolean z11 = true;
            zArr[i3] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            int i10 = this.f5268a;
            tL_payments_getStarsTransactions.peer = hp.s1(i10).j1(j10);
            if (i3 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            tL_payments_getStarsTransactions.inbound = z10;
            if (i3 != 2) {
                z11 = false;
            }
            tL_payments_getStarsTransactions.outbound = z11;
            String str = k10.f5205c[i3];
            tL_payments_getStarsTransactions.offset = str;
            if (str == null) {
                tL_payments_getStarsTransactions.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsTransactions, new x(i3, 0, j10, this, k10));
        }
    }

    public final void q(TL_update.TL_updateStarsRevenueStatus tL_updateStarsRevenueStatus) {
        long o10 = org.telegram.messenger.m5.o(tL_updateStarsRevenueStatus.peer);
        if (o10 < 0) {
            xd xdVar = xd.f51912u1;
            if (xdVar != null && xdVar.f51931q0 == org.telegram.messenger.m5.o(tL_updateStarsRevenueStatus.peer)) {
                xd xdVar2 = xd.f51912u1;
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = tL_updateStarsRevenueStatus.status;
                xdVar2.L(tL_starsRevenueStatus.current_balance instanceof TL_stars.TL_starsTonAmount, tL_starsRevenueStatus);
                xd.f51912u1.J();
                return;
            }
            return;
        }
        TLRPC.TL_payments_starsRevenueStats h = h(o10, true);
        if (h != null) {
            h.status = tL_updateStarsRevenueStatus.status;
            hs.f(this.f5268a).k(hs.C3, Long.valueOf(o10));
        }
        l(o10);
    }

    public final void r(long j10) {
        boolean z10;
        Long l10 = (Long) this.f5269b.get(Long.valueOf(j10));
        if (l10 != null && System.currentTimeMillis() - l10.longValue() <= 30000) {
            z10 = false;
        } else {
            z10 = true;
        }
        h(j10, z10);
    }
}
