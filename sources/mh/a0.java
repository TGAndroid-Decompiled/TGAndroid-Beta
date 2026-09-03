package mh;

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
import org.telegram.ui.ke;
public final class a0 {
    public static volatile a0[] f13667m = new a0[4];
    public static final Object[] f13668n = new Object[4];
    public final int f13669a;
    public final HashMap f13670b = new HashMap();
    public final HashMap f13671c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap f13672e = new HashMap();
    public final HashMap f13673f = new HashMap();
    public final HashMap f13674g = new HashMap();
    public final HashMap h = new HashMap();
    public boolean f13675i;
    public ArrayList f13676j;
    public boolean f13677k;
    public ArrayList f13678l;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            f13668n[i10] = new Object();
        }
    }

    public a0(int i10) {
        this.f13669a = i10;
    }

    public static a0 g(int i10) {
        a0 a0Var;
        a0 a0Var2 = f13667m[i10];
        if (a0Var2 == null) {
            synchronized (f13668n[i10]) {
                try {
                    a0Var = f13667m[i10];
                    if (a0Var == null) {
                        a0[] a0VarArr = f13667m;
                        a0 a0Var3 = new a0(i10);
                        a0VarArr[i10] = a0Var3;
                        a0Var = a0Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return a0Var;
        }
        return a0Var2;
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

    public final x d(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.f13674g;
        x xVar = (x) hashMap.get(valueOf);
        if (xVar == null) {
            Long valueOf2 = Long.valueOf(j10);
            x xVar2 = new x(this.f13669a, j10);
            hashMap.put(valueOf2, xVar2);
            return xVar2;
        }
        return xVar;
    }

    public final y e(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.h;
        y yVar = (y) hashMap.get(valueOf);
        if (yVar == null) {
            Long valueOf2 = Long.valueOf(j10);
            y yVar2 = new y(this.f13669a, j10);
            hashMap.put(valueOf2, yVar2);
            return yVar2;
        }
        return yVar;
    }

    public final void f(Context context, long j10, long j11, Utilities.Callback callback) {
        x xVar = (x) this.f13674g.get(Long.valueOf(j10));
        if (xVar != null) {
            ArrayList arrayList = xVar.f15023e;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (!((TL_payments.connectedBotStarRef) arrayList.get(i10)).revoked && ((TL_payments.connectedBotStarRef) arrayList.get(i10)).bot_id == j11) {
                    callback.run((TL_payments.connectedBotStarRef) arrayList.get(i10));
                    return;
                }
            }
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 3, null);
        TL_payments.getConnectedStarRefBot getconnectedstarrefbot = new TL_payments.getConnectedStarRefBot();
        int i11 = this.f13669a;
        getconnectedstarrefbot.peer = MessagesController.getInstance(i11).getInputPeer(j10);
        getconnectedstarrefbot.bot = MessagesController.getInstance(i11).getInputUser(j11);
        int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(getconnectedstarrefbot, new u(this, d2Var, j11, callback, 0));
        d2Var.f21243d0 = true;
        d2Var.setOnCancelListener(new v(this, sendRequest, 0));
        d2Var.q(200L);
    }

    public final TLRPC.TL_payments_starsRevenueStats h(long j10, boolean z4) {
        Long l10 = (Long) this.f13670b.get(Long.valueOf(j10));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.f13671c.get(Long.valueOf(j10));
        if (l10 != null && System.currentTimeMillis() - l10.longValue() <= 300000 && !z4) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.k6.I.q();
        int i10 = this.f13669a;
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new q(this, j10, 0));
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

    public final TLRPC.TL_payments_starsRevenueStats j(long j10, boolean z4) {
        int i10;
        Long l10 = (Long) this.d.get(Long.valueOf(j10));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.f13672e.get(Long.valueOf(j10));
        if (l10 != null && System.currentTimeMillis() - l10.longValue() <= 300000 && !z4) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.ton = true;
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.k6.I.q();
        int i11 = this.f13669a;
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i11).getInputPeer(j10);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i11).getChatFull(-j10);
        if (chatFull != null) {
            i10 = chatFull.stats_dc;
        } else {
            i10 = Integer.MAX_VALUE;
        }
        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsRevenueStats, new q(this, j10, 1), null, null, 0, i10, 1, true);
        return tL_payments_starsRevenueStats;
    }

    public final z k(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.f13673f;
        z zVar = (z) hashMap.get(valueOf);
        if (zVar == null) {
            Long valueOf2 = Long.valueOf(j10);
            z zVar2 = new z();
            hashMap.put(valueOf2, zVar2);
            return zVar2;
        }
        return zVar;
    }

    public final void l(long j10) {
        z k10 = k(j10);
        boolean[] zArr = k10.d;
        for (int i10 = 0; i10 < 3; i10++) {
            if (!zArr[i10]) {
                k10.f15124a[i10].clear();
                k10.f15126c[i10] = null;
                zArr[i10] = false;
                k10.f15127e[i10] = false;
                p(i10, j10);
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
        if (!this.f13675i && this.f13676j == null) {
            this.f13675i = true;
            ConnectionsManager.getInstance(this.f13669a).sendRequest(new TL_bots.getAdminedBots(), new r(this, 0));
        }
    }

    public final void o() {
        if (!this.f13677k && this.f13678l == null) {
            this.f13677k = true;
            ConnectionsManager.getInstance(this.f13669a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new r(this, 1));
        }
    }

    public final void p(int i10, long j10) {
        boolean z4;
        z k10 = k(j10);
        boolean[] zArr = k10.d;
        if (!zArr[i10] && !k10.f15127e[i10]) {
            boolean z10 = true;
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            int i11 = this.f13669a;
            tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i11).getInputPeer(j10);
            if (i10 == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            tL_payments_getStarsTransactions.inbound = z4;
            if (i10 != 2) {
                z10 = false;
            }
            tL_payments_getStarsTransactions.outbound = z10;
            String str = k10.f15126c[i10];
            tL_payments_getStarsTransactions.offset = str;
            if (str == null) {
                tL_payments_getStarsTransactions.offset = "";
            }
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new t(this, k10, i10, j10, 0));
        }
    }

    public final void q(TL_update.TL_updateStarsRevenueStatus tL_updateStarsRevenueStatus) {
        long peerDialogId = DialogObject.getPeerDialogId(tL_updateStarsRevenueStatus.peer);
        if (peerDialogId < 0) {
            ke keVar = ke.f38259u1;
            if (keVar != null && keVar.f38283w0 == DialogObject.getPeerDialogId(tL_updateStarsRevenueStatus.peer)) {
                ke keVar2 = ke.f38259u1;
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = tL_updateStarsRevenueStatus.status;
                keVar2.g0(tL_starsRevenueStatus.current_balance instanceof TL_stars.TL_starsTonAmount, tL_starsRevenueStatus);
                ke.f38259u1.e0();
                return;
            }
            return;
        }
        TLRPC.TL_payments_starsRevenueStats h = h(peerDialogId, true);
        if (h != null) {
            h.status = tL_updateStarsRevenueStatus.status;
            NotificationCenter.getInstance(this.f13669a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(peerDialogId));
        }
        l(peerDialogId);
    }

    public final void r(long j10) {
        boolean z4;
        Long l10 = (Long) this.f13670b.get(Long.valueOf(j10));
        if (l10 != null && System.currentTimeMillis() - l10.longValue() <= 30000) {
            z4 = false;
        } else {
            z4 = true;
        }
        h(j10, z4);
    }
}
