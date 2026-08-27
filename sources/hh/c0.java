package hh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.fe;

public final class c0 {

    public static volatile c0[] f9047m = new c0[4];

    public static final Object[] f9048n = new Object[4];

    public final int f9049a;

    public final HashMap f9050b = new HashMap();

    public final HashMap f9051c = new HashMap();
    public final HashMap d = new HashMap();

    public final HashMap f9052e = new HashMap();

    public final HashMap f9053f = new HashMap();

    public final HashMap f9054g = new HashMap();
    public final HashMap h = new HashMap();

    public boolean f9055i;

    public ArrayList f9056j;

    public boolean f9057k;

    public ArrayList f9058l;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            f9048n[i10] = new Object();
        }
    }

    public c0(int i10) {
        this.f9049a = i10;
    }

    public static c0 g(int i10) {
        c0 c0Var;
        c0 c0Var2 = f9047m[i10];
        if (c0Var2 != null) {
            return c0Var2;
        }
        synchronized (f9048n[i10]) {
            try {
                c0Var = f9047m[i10];
                if (c0Var == null) {
                    c0[] c0VarArr = f9047m;
                    c0 c0Var3 = new c0(i10);
                    c0VarArr[i10] = c0Var3;
                    c0Var = c0Var3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0Var;
    }

    public final boolean a(long j10) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStatsH = h(j10, false);
        return (tL_payments_starsRevenueStatsH == null || (tL_starsRevenueStatus = tL_payments_starsRevenueStatsH.status) == null || (tL_starsRevenueStatus.available_balance.amount <= 0 && tL_starsRevenueStatus.overall_revenue.amount <= 0 && tL_starsRevenueStatus.current_balance.amount <= 0)) ? false : true;
    }

    public final boolean b(long j10) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStatsJ = j(j10, false);
        return (tL_payments_starsRevenueStatsJ == null || (tL_starsRevenueStatus = tL_payments_starsRevenueStatsJ.status) == null || (tL_starsRevenueStatus.current_balance.amount <= 0 && tL_starsRevenueStatus.available_balance.amount <= 0 && tL_starsRevenueStatus.overall_revenue.amount <= 0)) ? false : true;
    }

    public final TL_stars.StarsAmount c(long j10) {
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStatsH = h(j10, false);
        return tL_payments_starsRevenueStatsH == null ? TL_stars.StarsAmount.ofStars(0L) : tL_payments_starsRevenueStatsH.status.current_balance;
    }

    public final z d(long j10) {
        Long lValueOf = Long.valueOf(j10);
        HashMap map = this.f9054g;
        z zVar = (z) map.get(lValueOf);
        if (zVar != null) {
            return zVar;
        }
        Long lValueOf2 = Long.valueOf(j10);
        z zVar2 = new z(this.f9049a, j10);
        map.put(lValueOf2, zVar2);
        return zVar2;
    }

    public final a0 e(long j10) {
        Long lValueOf = Long.valueOf(j10);
        HashMap map = this.h;
        a0 a0Var = (a0) map.get(lValueOf);
        if (a0Var != null) {
            return a0Var;
        }
        Long lValueOf2 = Long.valueOf(j10);
        a0 a0Var2 = new a0(this.f9049a, j10);
        map.put(lValueOf2, a0Var2);
        return a0Var2;
    }

    public final void f(Context context, long j10, long j11, Utilities.Callback callback) {
        z zVar = (z) this.f9054g.get(Long.valueOf(j10));
        if (zVar != null) {
            ArrayList arrayList = zVar.f10398e;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (!((TL_payments.connectedBotStarRef) arrayList.get(i10)).revoked && ((TL_payments.connectedBotStarRef) arrayList.get(i10)).bot_id == j11) {
                    callback.run((TL_payments.connectedBotStarRef) arrayList.get(i10));
                    return;
                }
            }
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
        TL_payments.getConnectedStarRefBot getconnectedstarrefbot = new TL_payments.getConnectedStarRefBot();
        int i11 = this.f9049a;
        getconnectedstarrefbot.peer = MessagesController.getInstance(i11).getInputPeer(j10);
        getconnectedstarrefbot.bot = MessagesController.getInstance(i11).getInputUser(j11);
        int iSendRequest = ConnectionsManager.getInstance(i11).sendRequest(getconnectedstarrefbot, new w(this, b2Var, j11, callback, 0));
        b2Var.f22747c0 = true;
        b2Var.setOnCancelListener(new x(this, iSendRequest, 0));
        b2Var.q(200L);
    }

    public final TLRPC.TL_payments_starsRevenueStats h(long j10, boolean z10) {
        Long l10 = (Long) this.f9050b.get(Long.valueOf(j10));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.f9051c.get(Long.valueOf(j10));
        if (l10 != null && System.currentTimeMillis() - l10.longValue() <= 300000 && !z10) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.g6.I.q();
        int i10 = this.f9049a;
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new s(this, j10, 0));
        return tL_payments_starsRevenueStats;
    }

    public final long i(long j10) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TL_stars.StarsAmount starsAmount;
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStatsJ = j(j10, false);
        if (tL_payments_starsRevenueStatsJ == null || (tL_starsRevenueStatus = tL_payments_starsRevenueStatsJ.status) == null || (starsAmount = tL_starsRevenueStatus.current_balance) == null) {
            return 0L;
        }
        return starsAmount.amount;
    }

    public final TLRPC.TL_payments_starsRevenueStats j(long j10, boolean z10) {
        Long l10 = (Long) this.d.get(Long.valueOf(j10));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.f9052e.get(Long.valueOf(j10));
        if (l10 != null && System.currentTimeMillis() - l10.longValue() <= 300000 && !z10) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.ton = true;
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.g6.I.q();
        int i10 = this.f9049a;
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(-j10);
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new s(this, j10, 1), null, null, 0, chatFull != null ? chatFull.stats_dc : Integer.MAX_VALUE, 1, true);
        return tL_payments_starsRevenueStats;
    }

    public final b0 k(long j10) {
        Long lValueOf = Long.valueOf(j10);
        HashMap map = this.f9053f;
        b0 b0Var = (b0) map.get(lValueOf);
        if (b0Var != null) {
            return b0Var;
        }
        Long lValueOf2 = Long.valueOf(j10);
        b0 b0Var2 = new b0();
        map.put(lValueOf2, b0Var2);
        return b0Var2;
    }

    public final void l(long j10) {
        b0 b0VarK = k(j10);
        boolean[] zArr = b0VarK.d;
        for (int i10 = 0; i10 < 3; i10++) {
            if (!zArr[i10]) {
                b0VarK.f8983a[i10].clear();
                b0VarK.f8985c[i10] = null;
                zArr[i10] = false;
                b0VarK.f8986e[i10] = false;
                p(i10, j10);
            }
        }
    }

    public final boolean m(long j10) {
        return j(j10, false) != null;
    }

    public final void n() {
        if (this.f9055i || this.f9056j != null) {
            return;
        }
        this.f9055i = true;
        ConnectionsManager.getInstance(this.f9049a).sendRequest(new TL_bots.getAdminedBots(), new t(this, 0));
    }

    public final void o() {
        if (this.f9057k || this.f9058l != null) {
            return;
        }
        this.f9057k = true;
        ConnectionsManager.getInstance(this.f9049a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new t(this, 1));
    }

    public final void p(int i10, long j10) {
        b0 b0VarK = k(j10);
        boolean[] zArr = b0VarK.d;
        if (zArr[i10] || b0VarK.f8986e[i10]) {
            return;
        }
        zArr[i10] = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        int i11 = this.f9049a;
        tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i11).getInputPeer(j10);
        tL_payments_getStarsTransactions.inbound = i10 == 1;
        tL_payments_getStarsTransactions.outbound = i10 == 2;
        String str = b0VarK.f8985c[i10];
        tL_payments_getStarsTransactions.offset = str;
        if (str == null) {
            tL_payments_getStarsTransactions.offset = "";
        }
        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new v(this, b0VarK, i10, j10, 0));
    }

    public final void q(TL_update.TL_updateStarsRevenueStatus tL_updateStarsRevenueStatus) {
        long peerDialogId = DialogObject.getPeerDialogId(tL_updateStarsRevenueStatus.peer);
        if (peerDialogId >= 0) {
            TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStatsH = h(peerDialogId, true);
            if (tL_payments_starsRevenueStatsH != null) {
                tL_payments_starsRevenueStatsH.status = tL_updateStarsRevenueStatus.status;
                NotificationCenter.getInstance(this.f9049a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(peerDialogId));
            }
            l(peerDialogId);
            return;
        }
        fe feVar = fe.f38078t1;
        if (feVar == null || feVar.f38101v0 != DialogObject.getPeerDialogId(tL_updateStarsRevenueStatus.peer)) {
            return;
        }
        fe feVar2 = fe.f38078t1;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = tL_updateStarsRevenueStatus.status;
        feVar2.g0(tL_starsRevenueStatus.current_balance instanceof TL_stars.TL_starsTonAmount, tL_starsRevenueStatus);
        fe.f38078t1.e0();
    }

    public final void r(long j10) {
        Long l10 = (Long) this.f9050b.get(Long.valueOf(j10));
        h(j10, l10 == null || System.currentTimeMillis() - l10.longValue() > 30000);
    }
}
