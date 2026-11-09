package bi;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
public final class n0 {
    public static volatile n0[] f4382m = new n0[4];
    public static final Object[] f4383n = new Object[4];
    public final int f4384a;
    public final HashMap f4385b = new HashMap();
    public final HashMap f4386c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap f4387e = new HashMap();
    public final HashMap f4388f = new HashMap();
    public final HashMap f4389g = new HashMap();
    public final HashMap h = new HashMap();
    public boolean f4390i;
    public ArrayList f4391j;
    public boolean f4392k;
    public ArrayList f4393l;

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            f4383n[i7] = new Object();
        }
    }

    public n0(int i7) {
        this.f4384a = i7;
    }

    public static n0 g(int i7) {
        n0 n0Var;
        n0 n0Var2 = f4382m[i7];
        if (n0Var2 == null) {
            synchronized (f4383n[i7]) {
                try {
                    n0Var = f4382m[i7];
                    if (n0Var == null) {
                        n0[] n0VarArr = f4382m;
                        n0 n0Var3 = new n0(i7);
                        n0VarArr[i7] = n0Var3;
                        n0Var = n0Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return n0Var;
        }
        return n0Var2;
    }

    public final boolean a(long j3) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats h = h(j3, false);
        if (h == null || (tL_starsRevenueStatus = h.status) == null || (tL_starsRevenueStatus.available_balance.amount <= 0 && tL_starsRevenueStatus.overall_revenue.amount <= 0 && tL_starsRevenueStatus.current_balance.amount <= 0)) {
            return false;
        }
        return true;
    }

    public final boolean b(long j3) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats j10 = j(j3, false);
        if (j10 == null || (tL_starsRevenueStatus = j10.status) == null || (tL_starsRevenueStatus.current_balance.amount <= 0 && tL_starsRevenueStatus.available_balance.amount <= 0 && tL_starsRevenueStatus.overall_revenue.amount <= 0)) {
            return false;
        }
        return true;
    }

    public final TL_stars.StarsAmount c(long j3) {
        TLRPC.TL_payments_starsRevenueStats h = h(j3, false);
        if (h == null) {
            return TL_stars.StarsAmount.ofStars(0L);
        }
        return h.status.current_balance;
    }

    public final k0 d(long j3) {
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f4389g;
        k0 k0Var = (k0) hashMap.get(valueOf);
        if (k0Var == null) {
            Long valueOf2 = Long.valueOf(j3);
            k0 k0Var2 = new k0(this.f4384a, j3);
            hashMap.put(valueOf2, k0Var2);
            return k0Var2;
        }
        return k0Var;
    }

    public final l0 e(long j3) {
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.h;
        l0 l0Var = (l0) hashMap.get(valueOf);
        if (l0Var == null) {
            Long valueOf2 = Long.valueOf(j3);
            l0 l0Var2 = new l0(this.f4384a, j3);
            hashMap.put(valueOf2, l0Var2);
            return l0Var2;
        }
        return l0Var;
    }

    public final void f(Context context, long j3, long j10, c20 c20Var) {
        k0 k0Var = (k0) this.f4389g.get(Long.valueOf(j3));
        if (k0Var != null) {
            ArrayList arrayList = k0Var.f4131e;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (!((TL_payments.connectedBotStarRef) arrayList.get(i7)).revoked && ((TL_payments.connectedBotStarRef) arrayList.get(i7)).bot_id == j10) {
                    c20Var.a((TL_payments.connectedBotStarRef) arrayList.get(i7));
                    return;
                }
            }
        }
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, context, null);
        TL_payments.getConnectedStarRefBot getconnectedstarrefbot = new TL_payments.getConnectedStarRefBot();
        int i10 = this.f4384a;
        getconnectedstarrefbot.peer = qp.s1(i10).j1(j3);
        getconnectedstarrefbot.bot = qp.s1(i10).o1(j10);
        int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbot, new f0(this, u1Var, j10, c20Var, 0));
        u1Var.f28563i0 = true;
        u1Var.setOnCancelListener(new g0(this, sendRequest, 0));
        u1Var.r(200L);
    }

    public final TLRPC.TL_payments_starsRevenueStats h(long j3, boolean z9) {
        Long l10 = (Long) this.f4385b.get(Long.valueOf(j3));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.f4386c.get(Long.valueOf(j3));
        if (l10 != null && System.currentTimeMillis() - l10.longValue() <= 300000 && !z9) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.l6.I.q();
        int i7 = this.f4384a;
        tL_payments_getStarsRevenueStats.peer = qp.s1(i7).j1(j3);
        ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsRevenueStats, new a0(this, j3, 0));
        return tL_payments_starsRevenueStats;
    }

    public final long i(long j3) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TL_stars.StarsAmount starsAmount;
        TLRPC.TL_payments_starsRevenueStats j10 = j(j3, false);
        if (j10 != null && (tL_starsRevenueStatus = j10.status) != null && (starsAmount = tL_starsRevenueStatus.current_balance) != null) {
            return starsAmount.amount;
        }
        return 0L;
    }

    public final TLRPC.TL_payments_starsRevenueStats j(long j3, boolean z9) {
        int i7;
        Long l10 = (Long) this.d.get(Long.valueOf(j3));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.f4387e.get(Long.valueOf(j3));
        if (l10 != null && System.currentTimeMillis() - l10.longValue() <= 300000 && !z9) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.ton = true;
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.l6.I.q();
        int i10 = this.f4384a;
        tL_payments_getStarsRevenueStats.peer = qp.s1(i10).j1(j3);
        TLRPC.ChatFull N0 = qp.s1(i10).N0(-j3);
        if (N0 != null) {
            i7 = N0.stats_dc;
        } else {
            i7 = Integer.MAX_VALUE;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new a0(this, j3, 1), null, null, 0, i7, 1, true);
        return tL_payments_starsRevenueStats;
    }

    public final m0 k(long j3) {
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f4388f;
        m0 m0Var = (m0) hashMap.get(valueOf);
        if (m0Var == null) {
            Long valueOf2 = Long.valueOf(j3);
            m0 m0Var2 = new m0();
            hashMap.put(valueOf2, m0Var2);
            return m0Var2;
        }
        return m0Var;
    }

    public final void l(long j3) {
        m0 k10 = k(j3);
        boolean[] zArr = k10.d;
        for (int i7 = 0; i7 < 3; i7++) {
            if (!zArr[i7]) {
                k10.f4301a[i7].clear();
                k10.f4303c[i7] = null;
                zArr[i7] = false;
                k10.f4304e[i7] = false;
                p(i7, j3);
            }
        }
    }

    public final boolean m(long j3) {
        if (j(j3, false) == null) {
            return false;
        }
        return true;
    }

    public final void n() {
        if (!this.f4390i && this.f4391j == null) {
            this.f4390i = true;
            ConnectionsManager.getInstance(this.f4384a).sendRequest(new TL_bots.getAdminedBots(), new e0(this, 1));
        }
    }

    public final void o() {
        if (!this.f4392k && this.f4393l == null) {
            this.f4392k = true;
            ConnectionsManager.getInstance(this.f4384a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new e0(this, 0));
        }
    }

    public final void p(int i7, long j3) {
        boolean z9;
        m0 k10 = k(j3);
        boolean[] zArr = k10.d;
        if (!zArr[i7] && !k10.f4304e[i7]) {
            boolean z10 = true;
            zArr[i7] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            int i10 = this.f4384a;
            tL_payments_getStarsTransactions.peer = qp.s1(i10).j1(j3);
            if (i7 == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            tL_payments_getStarsTransactions.inbound = z9;
            if (i7 != 2) {
                z10 = false;
            }
            tL_payments_getStarsTransactions.outbound = z10;
            String str = k10.f4303c[i7];
            tL_payments_getStarsTransactions.offset = str;
            if (str == null) {
                tL_payments_getStarsTransactions.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsTransactions, new b0(i7, 0, j3, this, k10));
        }
    }

    public final void q(TL_update.TL_updateStarsRevenueStatus tL_updateStarsRevenueStatus) {
        long o4 = org.telegram.messenger.m5.o(tL_updateStarsRevenueStatus.peer);
        if (o4 < 0) {
            org.telegram.ui.zd zdVar = org.telegram.ui.zd.f52502t1;
            if (zdVar != null && zdVar.f52519p0 == org.telegram.messenger.m5.o(tL_updateStarsRevenueStatus.peer)) {
                org.telegram.ui.zd zdVar2 = org.telegram.ui.zd.f52502t1;
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = tL_updateStarsRevenueStatus.status;
                zdVar2.L(tL_starsRevenueStatus.current_balance instanceof TL_stars.TL_starsTonAmount, tL_starsRevenueStatus);
                org.telegram.ui.zd.f52502t1.J();
                return;
            }
            return;
        }
        TLRPC.TL_payments_starsRevenueStats h = h(o4, true);
        if (h != null) {
            h.status = tL_updateStarsRevenueStatus.status;
            qs.f(this.f4384a).k(qs.C3, Long.valueOf(o4));
        }
        l(o4);
    }

    public final void r(long j3) {
        boolean z9;
        Long l10 = (Long) this.f4385b.get(Long.valueOf(j3));
        if (l10 != null && System.currentTimeMillis() - l10.longValue() <= 30000) {
            z9 = false;
        } else {
            z9 = true;
        }
        h(j3, z9);
    }
}
