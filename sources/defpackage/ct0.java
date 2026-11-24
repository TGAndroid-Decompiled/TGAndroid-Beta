package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
public final class ct0 {
    public static volatile ct0[] m = new ct0[4];
    public static final Object[] n = new Object[4];
    public final int a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final HashMap g = new HashMap();
    public final HashMap h = new HashMap();
    public boolean i;
    public ArrayList j;
    public boolean k;
    public ArrayList l;

    static {
        for (int i = 0; i < 4; i++) {
            n[i] = new Object();
        }
    }

    public ct0(int i) {
        this.a = i;
    }

    public static ct0 g(int i) {
        ct0 ct0Var;
        ct0 ct0Var2 = m[i];
        if (ct0Var2 == null) {
            synchronized (n[i]) {
                ct0Var = m[i];
                if (ct0Var == null) {
                    ct0[] ct0VarArr = m;
                    ct0 ct0Var3 = new ct0(i);
                    ct0VarArr[i] = ct0Var3;
                    ct0Var = ct0Var3;
                }
            }
            return ct0Var;
        }
        return ct0Var2;
    }

    public final boolean a(long j) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats h = h(j, false);
        if (h == null || (tL_starsRevenueStatus = h.status) == null || (tL_starsRevenueStatus.available_balance.amount <= 0 && tL_starsRevenueStatus.overall_revenue.amount <= 0 && tL_starsRevenueStatus.current_balance.amount <= 0)) {
            return false;
        }
        return true;
    }

    public final boolean b(long j) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats j2 = j(j, false);
        if (j2 == null || (tL_starsRevenueStatus = j2.status) == null || (tL_starsRevenueStatus.current_balance.amount <= 0 && tL_starsRevenueStatus.available_balance.amount <= 0 && tL_starsRevenueStatus.overall_revenue.amount <= 0)) {
            return false;
        }
        return true;
    }

    public final TL_stars.StarsAmount c(long j) {
        TLRPC.TL_payments_starsRevenueStats h = h(j, false);
        if (h == null) {
            return TL_stars.StarsAmount.ofStars(0L);
        }
        return h.status.current_balance;
    }

    public final zs0 d(long j) {
        Long valueOf = Long.valueOf(j);
        HashMap hashMap = this.g;
        zs0 zs0Var = (zs0) hashMap.get(valueOf);
        if (zs0Var == null) {
            Long valueOf2 = Long.valueOf(j);
            zs0 zs0Var2 = new zs0(this.a, j);
            hashMap.put(valueOf2, zs0Var2);
            return zs0Var2;
        }
        return zs0Var;
    }

    public final at0 e(long j) {
        Long valueOf = Long.valueOf(j);
        HashMap hashMap = this.h;
        at0 at0Var = (at0) hashMap.get(valueOf);
        if (at0Var == null) {
            Long valueOf2 = Long.valueOf(j);
            at0 at0Var2 = new at0(this.a, j);
            hashMap.put(valueOf2, at0Var2);
            return at0Var2;
        }
        return at0Var;
    }

    public final void f(Context context, long j, long j2, p8c p8cVar) {
        zs0 zs0Var = (zs0) this.g.get(Long.valueOf(j));
        if (zs0Var != null) {
            ArrayList arrayList = zs0Var.e;
            for (int i = 0; i < arrayList.size(); i++) {
                if (!((TL_payments.connectedBotStarRef) arrayList.get(i)).revoked && ((TL_payments.connectedBotStarRef) arrayList.get(i)).bot_id == j2) {
                    p8cVar.a((TL_payments.connectedBotStarRef) arrayList.get(i));
                    return;
                }
            }
        }
        hd hdVar = new hd(3, null, context);
        TL_payments.getConnectedStarRefBot getconnectedstarrefbot = new TL_payments.getConnectedStarRefBot();
        int i2 = this.a;
        getconnectedstarrefbot.peer = na7.q1(i2).h1(j);
        getconnectedstarrefbot.bot = na7.q1(i2).m1(j2);
        int sendRequest = ConnectionsManager.getInstance(i2).sendRequest(getconnectedstarrefbot, new ws0(this, hdVar, j2, p8cVar, (byte) 0));
        hdVar.j0 = true;
        hdVar.setOnCancelListener(new xs0(this, sendRequest, (byte) 0));
        hdVar.q(200L);
    }

    public final TLRPC.TL_payments_starsRevenueStats h(long j, boolean z) {
        Long l = (Long) this.b.get(Long.valueOf(j));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.c.get(Long.valueOf(j));
        if (l != null && System.currentTimeMillis() - l.longValue() <= 300000 && !z) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.dark = bkb.I.o();
        int i = this.a;
        tL_payments_getStarsRevenueStats.peer = na7.q1(i).h1(j);
        ConnectionsManager.getInstance(i).sendRequest(tL_payments_getStarsRevenueStats, new ts0(this, j, (byte) 0));
        return tL_payments_starsRevenueStats;
    }

    public final long i(long j) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TL_stars.StarsAmount starsAmount;
        TLRPC.TL_payments_starsRevenueStats j2 = j(j, false);
        if (j2 != null && (tL_starsRevenueStatus = j2.status) != null && (starsAmount = tL_starsRevenueStatus.current_balance) != null) {
            return starsAmount.amount;
        }
        return 0L;
    }

    public final TLRPC.TL_payments_starsRevenueStats j(long j, boolean z) {
        int i;
        Long l = (Long) this.d.get(Long.valueOf(j));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.e.get(Long.valueOf(j));
        if (l != null && System.currentTimeMillis() - l.longValue() <= 300000 && !z) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.ton = true;
        tL_payments_getStarsRevenueStats.dark = bkb.I.o();
        int i2 = this.a;
        tL_payments_getStarsRevenueStats.peer = na7.q1(i2).h1(j);
        TLRPC.ChatFull L0 = na7.q1(i2).L0(-j);
        if (L0 != null) {
            i = L0.stats_dc;
        } else {
            i = Integer.MAX_VALUE;
        }
        ConnectionsManager.getInstance(i2).sendRequest(tL_payments_getStarsRevenueStats, new ts0(this, j, (byte) 1), null, null, 0, i, 1, true);
        return tL_payments_starsRevenueStats;
    }

    public final bt0 k(long j) {
        Long valueOf = Long.valueOf(j);
        HashMap hashMap = this.f;
        bt0 bt0Var = (bt0) hashMap.get(valueOf);
        if (bt0Var == null) {
            Long valueOf2 = Long.valueOf(j);
            bt0 bt0Var2 = new bt0();
            hashMap.put(valueOf2, bt0Var2);
            return bt0Var2;
        }
        return bt0Var;
    }

    public final void l(long j) {
        bt0 k = k(j);
        boolean[] zArr = k.d;
        for (int i = 0; i < 3; i++) {
            if (!zArr[i]) {
                k.a[i].clear();
                k.c[i] = null;
                zArr[i] = false;
                k.e[i] = false;
                p(i, j);
            }
        }
    }

    public final boolean m(long j) {
        if (j(j, false) == null) {
            return false;
        }
        return true;
    }

    public final void n() {
        if (!this.i && this.j == null) {
            this.i = true;
            ConnectionsManager.getInstance(this.a).sendRequest(new TL_bots.getAdminedBots(), new vs0(this, (byte) 1));
        }
    }

    public final void o() {
        if (!this.k && this.l == null) {
            this.k = true;
            ConnectionsManager.getInstance(this.a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new vs0(this, (byte) 0));
        }
    }

    public final void p(int i, long j) {
        boolean z;
        bt0 k = k(j);
        boolean[] zArr = k.d;
        if (!zArr[i] && !k.e[i]) {
            boolean z2 = true;
            zArr[i] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            int i2 = this.a;
            tL_payments_getStarsTransactions.peer = na7.q1(i2).h1(j);
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            tL_payments_getStarsTransactions.inbound = z;
            if (i != 2) {
                z2 = false;
            }
            tL_payments_getStarsTransactions.outbound = z2;
            String str = k.c[i];
            tL_payments_getStarsTransactions.offset = str;
            if (str == null) {
                tL_payments_getStarsTransactions.offset = "";
            }
            ConnectionsManager.getInstance(i2).sendRequest(tL_payments_getStarsTransactions, new tg(this, k, i, j, (byte) 1));
        }
    }

    public final void q(TL_update.TL_updateStarsRevenueStatus tL_updateStarsRevenueStatus) {
        long n2 = cf3.n(tL_updateStarsRevenueStatus.peer);
        if (n2 < 0) {
            zi1 zi1Var = zi1.t1;
            if (zi1Var != null && zi1Var.p0 == cf3.n(tL_updateStarsRevenueStatus.peer)) {
                zi1 zi1Var2 = zi1.t1;
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = tL_updateStarsRevenueStatus.status;
                zi1Var2.M(tL_starsRevenueStatus.current_balance instanceof TL_stars.TL_starsTonAmount, tL_starsRevenueStatus);
                zi1.t1.K();
                return;
            }
            return;
        }
        TLRPC.TL_payments_starsRevenueStats h = h(n2, true);
        if (h != null) {
            h.status = tL_updateStarsRevenueStatus.status;
            kk7.f(this.a).k(kk7.D3, Long.valueOf(n2));
        }
        l(n2);
    }

    public final void r(long j) {
        boolean z;
        Long l = (Long) this.b.get(Long.valueOf(j));
        if (l != null && System.currentTimeMillis() - l.longValue() <= 30000) {
            z = false;
        } else {
            z = true;
        }
        h(j, z);
    }
}
