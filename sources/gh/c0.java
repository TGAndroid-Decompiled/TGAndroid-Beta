package gh;

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
    public static volatile c0[] f7892m = new c0[4];
    public static final Object[] f7893n = new Object[4];
    public final int f7894a;
    public final HashMap f7895b = new HashMap();
    public final HashMap f7896c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap f7897e = new HashMap();
    public final HashMap f7898f = new HashMap();
    public final HashMap f7899g = new HashMap();
    public final HashMap h = new HashMap();
    public boolean f7900i;
    public ArrayList f7901j;
    public boolean f7902k;
    public ArrayList f7903l;

    static {
        for (int i9 = 0; i9 < 4; i9++) {
            f7893n[i9] = new Object();
        }
    }

    public c0(int i9) {
        this.f7894a = i9;
    }

    public static c0 g(int i9) {
        c0 c0Var;
        c0 c0Var2 = f7892m[i9];
        if (c0Var2 == null) {
            synchronized (f7893n[i9]) {
                try {
                    c0Var = f7892m[i9];
                    if (c0Var == null) {
                        c0[] c0VarArr = f7892m;
                        c0 c0Var3 = new c0(i9);
                        c0VarArr[i9] = c0Var3;
                        c0Var = c0Var3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c0Var;
        }
        return c0Var2;
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

    public final z d(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.f7899g;
        z zVar = (z) hashMap.get(valueOf);
        if (zVar == null) {
            Long valueOf2 = Long.valueOf(j10);
            z zVar2 = new z(this.f7894a, j10);
            hashMap.put(valueOf2, zVar2);
            return zVar2;
        }
        return zVar;
    }

    public final a0 e(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.h;
        a0 a0Var = (a0) hashMap.get(valueOf);
        if (a0Var == null) {
            Long valueOf2 = Long.valueOf(j10);
            a0 a0Var2 = new a0(this.f7894a, j10);
            hashMap.put(valueOf2, a0Var2);
            return a0Var2;
        }
        return a0Var;
    }

    public final void f(Context context, long j10, long j11, Utilities.Callback callback) {
        z zVar = (z) this.f7899g.get(Long.valueOf(j10));
        if (zVar != null) {
            ArrayList arrayList = zVar.f9238e;
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                if (!((TL_payments.connectedBotStarRef) arrayList.get(i9)).revoked && ((TL_payments.connectedBotStarRef) arrayList.get(i9)).bot_id == j11) {
                    callback.run((TL_payments.connectedBotStarRef) arrayList.get(i9));
                    return;
                }
            }
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, null);
        TL_payments.getConnectedStarRefBot getconnectedstarrefbot = new TL_payments.getConnectedStarRefBot();
        int i10 = this.f7894a;
        getconnectedstarrefbot.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        getconnectedstarrefbot.bot = MessagesController.getInstance(i10).getInputUser(j11);
        int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbot, new w(this, c2Var, j11, callback, 0));
        c2Var.f22766c0 = true;
        c2Var.setOnCancelListener(new x(this, sendRequest, 0));
        c2Var.q(200L);
    }

    public final TLRPC.TL_payments_starsRevenueStats h(long j10, boolean z10) {
        Long l10 = (Long) this.f7895b.get(Long.valueOf(j10));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.f7896c.get(Long.valueOf(j10));
        if (l10 != null && System.currentTimeMillis() - l10.longValue() <= 300000 && !z10) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.f6.I.q();
        int i9 = this.f7894a;
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i9).getInputPeer(j10);
        ConnectionsManager.getInstance(i9).sendRequest(tL_payments_getStarsRevenueStats, new s(this, j10, 0));
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
        int i9;
        Long l10 = (Long) this.d.get(Long.valueOf(j10));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.f7897e.get(Long.valueOf(j10));
        if (l10 != null && System.currentTimeMillis() - l10.longValue() <= 300000 && !z10) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.ton = true;
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.f6.I.q();
        int i10 = this.f7894a;
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(-j10);
        if (chatFull != null) {
            i9 = chatFull.stats_dc;
        } else {
            i9 = Integer.MAX_VALUE;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new s(this, j10, 1), null, null, 0, i9, 1, true);
        return tL_payments_starsRevenueStats;
    }

    public final b0 k(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.f7898f;
        b0 b0Var = (b0) hashMap.get(valueOf);
        if (b0Var == null) {
            Long valueOf2 = Long.valueOf(j10);
            b0 b0Var2 = new b0();
            hashMap.put(valueOf2, b0Var2);
            return b0Var2;
        }
        return b0Var;
    }

    public final void l(long j10) {
        b0 k10 = k(j10);
        boolean[] zArr = k10.d;
        for (int i9 = 0; i9 < 3; i9++) {
            if (!zArr[i9]) {
                k10.f7825a[i9].clear();
                k10.f7827c[i9] = null;
                zArr[i9] = false;
                k10.f7828e[i9] = false;
                p(i9, j10);
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
        if (!this.f7900i && this.f7901j == null) {
            this.f7900i = true;
            ConnectionsManager.getInstance(this.f7894a).sendRequest(new TL_bots.getAdminedBots(), new t(this, 0));
        }
    }

    public final void o() {
        if (!this.f7902k && this.f7903l == null) {
            this.f7902k = true;
            ConnectionsManager.getInstance(this.f7894a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new t(this, 1));
        }
    }

    public final void p(int i9, long j10) {
        boolean z10;
        b0 k10 = k(j10);
        boolean[] zArr = k10.d;
        if (!zArr[i9] && !k10.f7828e[i9]) {
            boolean z11 = true;
            zArr[i9] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            int i10 = this.f7894a;
            tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            if (i9 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            tL_payments_getStarsTransactions.inbound = z10;
            if (i9 != 2) {
                z11 = false;
            }
            tL_payments_getStarsTransactions.outbound = z11;
            String str = k10.f7827c[i9];
            tL_payments_getStarsTransactions.offset = str;
            if (str == null) {
                tL_payments_getStarsTransactions.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsTransactions, new v(this, k10, i9, j10, 0));
        }
    }

    public final void q(TL_update.TL_updateStarsRevenueStatus tL_updateStarsRevenueStatus) {
        long peerDialogId = DialogObject.getPeerDialogId(tL_updateStarsRevenueStatus.peer);
        if (peerDialogId < 0) {
            fe feVar = fe.f38216t1;
            if (feVar != null && feVar.f38239v0 == DialogObject.getPeerDialogId(tL_updateStarsRevenueStatus.peer)) {
                fe feVar2 = fe.f38216t1;
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = tL_updateStarsRevenueStatus.status;
                feVar2.g0(tL_starsRevenueStatus.current_balance instanceof TL_stars.TL_starsTonAmount, tL_starsRevenueStatus);
                fe.f38216t1.e0();
                return;
            }
            return;
        }
        TLRPC.TL_payments_starsRevenueStats h = h(peerDialogId, true);
        if (h != null) {
            h.status = tL_updateStarsRevenueStatus.status;
            NotificationCenter.getInstance(this.f7894a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(peerDialogId));
        }
        l(peerDialogId);
    }

    public final void r(long j10) {
        boolean z10;
        Long l10 = (Long) this.f7895b.get(Long.valueOf(j10));
        if (l10 != null && System.currentTimeMillis() - l10.longValue() <= 30000) {
            z10 = false;
        } else {
            z10 = true;
        }
        h(j10, z10);
    }
}
