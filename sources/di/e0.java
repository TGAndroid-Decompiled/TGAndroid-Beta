package di;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.xd;
public final class e0 {
    public static volatile e0[] f8428m = new e0[4];
    public static final Object[] f8429n = new Object[4];
    public final int f8430a;
    public final HashMap f8431b = new HashMap();
    public final HashMap f8432c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap f8433e = new HashMap();
    public final HashMap f8434f = new HashMap();
    public final HashMap f8435g = new HashMap();
    public final HashMap h = new HashMap();
    public boolean f8436i;
    public ArrayList f8437j;
    public boolean f8438k;
    public ArrayList f8439l;

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            f8429n[i7] = new Object();
        }
    }

    public e0(int i7) {
        this.f8430a = i7;
    }

    public static e0 g(int i7) {
        e0 e0Var;
        e0 e0Var2 = f8428m[i7];
        if (e0Var2 == null) {
            synchronized (f8429n[i7]) {
                try {
                    e0Var = f8428m[i7];
                    if (e0Var == null) {
                        e0[] e0VarArr = f8428m;
                        e0 e0Var3 = new e0(i7);
                        e0VarArr[i7] = e0Var3;
                        e0Var = e0Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return e0Var;
        }
        return e0Var2;
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

    public final b0 d(long j3) {
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f8435g;
        b0 b0Var = (b0) hashMap.get(valueOf);
        if (b0Var == null) {
            Long valueOf2 = Long.valueOf(j3);
            b0 b0Var2 = new b0(this.f8430a, j3);
            hashMap.put(valueOf2, b0Var2);
            return b0Var2;
        }
        return b0Var;
    }

    public final c0 e(long j3) {
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.h;
        c0 c0Var = (c0) hashMap.get(valueOf);
        if (c0Var == null) {
            Long valueOf2 = Long.valueOf(j3);
            c0 c0Var2 = new c0(this.f8430a, j3);
            hashMap.put(valueOf2, c0Var2);
            return c0Var2;
        }
        return c0Var;
    }

    public final void f(Context context, long j3, long j10, z10 z10Var) {
        b0 b0Var = (b0) this.f8435g.get(Long.valueOf(j3));
        if (b0Var != null) {
            ArrayList arrayList = b0Var.f8238e;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (!((TL_payments.connectedBotStarRef) arrayList.get(i7)).revoked && ((TL_payments.connectedBotStarRef) arrayList.get(i7)).bot_id == j10) {
                    z10Var.a((TL_payments.connectedBotStarRef) arrayList.get(i7));
                    return;
                }
            }
        }
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, context, null);
        TL_payments.getConnectedStarRefBot getconnectedstarrefbot = new TL_payments.getConnectedStarRefBot();
        int i10 = this.f8430a;
        getconnectedstarrefbot.peer = np.s1(i10).j1(j3);
        getconnectedstarrefbot.bot = np.s1(i10).o1(j10);
        int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbot, new y(this, t1Var, j10, z10Var, 0));
        t1Var.f29637j0 = true;
        t1Var.setOnCancelListener(new z(this, sendRequest, 0));
        t1Var.r(200L);
    }

    public final TLRPC.TL_payments_starsRevenueStats h(long j3, boolean z10) {
        Long l10 = (Long) this.f8431b.get(Long.valueOf(j3));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.f8432c.get(Long.valueOf(j3));
        if (l10 != null && System.currentTimeMillis() - l10.longValue() <= 300000 && !z10) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.j6.I.q();
        int i7 = this.f8430a;
        tL_payments_getStarsRevenueStats.peer = np.s1(i7).j1(j3);
        ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsRevenueStats, new u(this, j3, 0));
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

    public final TLRPC.TL_payments_starsRevenueStats j(long j3, boolean z10) {
        int i7;
        Long l10 = (Long) this.d.get(Long.valueOf(j3));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.f8433e.get(Long.valueOf(j3));
        if (l10 != null && System.currentTimeMillis() - l10.longValue() <= 300000 && !z10) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.ton = true;
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.j6.I.q();
        int i10 = this.f8430a;
        tL_payments_getStarsRevenueStats.peer = np.s1(i10).j1(j3);
        TLRPC.ChatFull N0 = np.s1(i10).N0(-j3);
        if (N0 != null) {
            i7 = N0.stats_dc;
        } else {
            i7 = Integer.MAX_VALUE;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new u(this, j3, 1), null, null, 0, i7, 1, true);
        return tL_payments_starsRevenueStats;
    }

    public final d0 k(long j3) {
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f8434f;
        d0 d0Var = (d0) hashMap.get(valueOf);
        if (d0Var == null) {
            Long valueOf2 = Long.valueOf(j3);
            d0 d0Var2 = new d0();
            hashMap.put(valueOf2, d0Var2);
            return d0Var2;
        }
        return d0Var;
    }

    public final void l(long j3) {
        d0 k10 = k(j3);
        boolean[] zArr = k10.d;
        for (int i7 = 0; i7 < 3; i7++) {
            if (!zArr[i7]) {
                k10.f8380a[i7].clear();
                k10.f8382c[i7] = null;
                zArr[i7] = false;
                k10.f8383e[i7] = false;
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
        if (!this.f8436i && this.f8437j == null) {
            this.f8436i = true;
            ConnectionsManager.getInstance(this.f8430a).sendRequest(new TL_bots.getAdminedBots(), new x(this, 1));
        }
    }

    public final void o() {
        if (!this.f8438k && this.f8439l == null) {
            this.f8438k = true;
            ConnectionsManager.getInstance(this.f8430a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new x(this, 0));
        }
    }

    public final void p(int i7, long j3) {
        boolean z10;
        d0 k10 = k(j3);
        boolean[] zArr = k10.d;
        if (!zArr[i7] && !k10.f8383e[i7]) {
            boolean z11 = true;
            zArr[i7] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            int i10 = this.f8430a;
            tL_payments_getStarsTransactions.peer = np.s1(i10).j1(j3);
            if (i7 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            tL_payments_getStarsTransactions.inbound = z10;
            if (i7 != 2) {
                z11 = false;
            }
            tL_payments_getStarsTransactions.outbound = z11;
            String str = k10.f8382c[i7];
            tL_payments_getStarsTransactions.offset = str;
            if (str == null) {
                tL_payments_getStarsTransactions.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsTransactions, new v(i7, 0, j3, this, k10));
        }
    }

    public final void q(TL_update.TL_updateStarsRevenueStatus tL_updateStarsRevenueStatus) {
        long o4 = org.telegram.messenger.m5.o(tL_updateStarsRevenueStatus.peer);
        if (o4 < 0) {
            xd xdVar = xd.f53175u1;
            if (xdVar != null && xdVar.f53194q0 == org.telegram.messenger.m5.o(tL_updateStarsRevenueStatus.peer)) {
                xd xdVar2 = xd.f53175u1;
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = tL_updateStarsRevenueStatus.status;
                xdVar2.L(tL_starsRevenueStatus.current_balance instanceof TL_stars.TL_starsTonAmount, tL_starsRevenueStatus);
                xd.f53175u1.J();
                return;
            }
            return;
        }
        TLRPC.TL_payments_starsRevenueStats h = h(o4, true);
        if (h != null) {
            h.status = tL_updateStarsRevenueStatus.status;
            ns.f(this.f8430a).k(ns.C3, Long.valueOf(o4));
        }
        l(o4);
    }

    public final void r(long j3) {
        boolean z10;
        Long l10 = (Long) this.f8431b.get(Long.valueOf(j3));
        if (l10 != null && System.currentTimeMillis() - l10.longValue() <= 30000) {
            z10 = false;
        } else {
            z10 = true;
        }
        h(j3, z10);
    }
}
