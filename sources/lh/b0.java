package lh;

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
public final class b0 {
    public static volatile b0[] f12129m = new b0[4];
    public static final Object[] f12130n = new Object[4];
    public final int f12131a;
    public final HashMap f12132b = new HashMap();
    public final HashMap f12133c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f12134f = new HashMap();
    public final HashMap f12135g = new HashMap();
    public final HashMap h = new HashMap();
    public boolean f12136i;
    public ArrayList f12137j;
    public boolean f12138k;
    public ArrayList f12139l;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            f12130n[i10] = new Object();
        }
    }

    public b0(int i10) {
        this.f12131a = i10;
    }

    public static b0 g(int i10) {
        b0 b0Var;
        b0 b0Var2 = f12129m[i10];
        if (b0Var2 == null) {
            synchronized (f12130n[i10]) {
                try {
                    b0Var = f12129m[i10];
                    if (b0Var == null) {
                        b0[] b0VarArr = f12129m;
                        b0 b0Var3 = new b0(i10);
                        b0VarArr[i10] = b0Var3;
                        b0Var = b0Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return b0Var;
        }
        return b0Var2;
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

    public final y d(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.f12135g;
        y yVar = (y) hashMap.get(valueOf);
        if (yVar == null) {
            Long valueOf2 = Long.valueOf(j10);
            y yVar2 = new y(this.f12131a, j10);
            hashMap.put(valueOf2, yVar2);
            return yVar2;
        }
        return yVar;
    }

    public final z e(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.h;
        z zVar = (z) hashMap.get(valueOf);
        if (zVar == null) {
            Long valueOf2 = Long.valueOf(j10);
            z zVar2 = new z(this.f12131a, j10);
            hashMap.put(valueOf2, zVar2);
            return zVar2;
        }
        return zVar;
    }

    public final void f(Context context, long j10, long j11, Utilities.Callback callback) {
        y yVar = (y) this.f12135g.get(Long.valueOf(j10));
        if (yVar != null) {
            ArrayList arrayList = yVar.e;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (!((TL_payments.connectedBotStarRef) arrayList.get(i10)).revoked && ((TL_payments.connectedBotStarRef) arrayList.get(i10)).bot_id == j11) {
                    callback.run((TL_payments.connectedBotStarRef) arrayList.get(i10));
                    return;
                }
            }
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 3, null);
        TL_payments.getConnectedStarRefBot getconnectedstarrefbot = new TL_payments.getConnectedStarRefBot();
        int i11 = this.f12131a;
        getconnectedstarrefbot.peer = MessagesController.getInstance(i11).getInputPeer(j10);
        getconnectedstarrefbot.bot = MessagesController.getInstance(i11).getInputUser(j11);
        int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(getconnectedstarrefbot, new v(this, d2Var, j11, callback, 0));
        d2Var.f19590d0 = true;
        d2Var.setOnCancelListener(new w(this, sendRequest, 0));
        d2Var.q(200L);
    }

    public final TLRPC.TL_payments_starsRevenueStats h(long j10, boolean z4) {
        Long l10 = (Long) this.f12132b.get(Long.valueOf(j10));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.f12133c.get(Long.valueOf(j10));
        if (l10 != null && System.currentTimeMillis() - l10.longValue() <= 300000 && !z4) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.j6.I.q();
        int i10 = this.f12131a;
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new r(this, j10, 0));
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
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.e.get(Long.valueOf(j10));
        if (l10 != null && System.currentTimeMillis() - l10.longValue() <= 300000 && !z4) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.ton = true;
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.j6.I.q();
        int i11 = this.f12131a;
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i11).getInputPeer(j10);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i11).getChatFull(-j10);
        if (chatFull != null) {
            i10 = chatFull.stats_dc;
        } else {
            i10 = Integer.MAX_VALUE;
        }
        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsRevenueStats, new r(this, j10, 1), null, null, 0, i10, 1, true);
        return tL_payments_starsRevenueStats;
    }

    public final a0 k(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.f12134f;
        a0 a0Var = (a0) hashMap.get(valueOf);
        if (a0Var == null) {
            Long valueOf2 = Long.valueOf(j10);
            a0 a0Var2 = new a0();
            hashMap.put(valueOf2, a0Var2);
            return a0Var2;
        }
        return a0Var;
    }

    public final void l(long j10) {
        a0 k10 = k(j10);
        boolean[] zArr = k10.d;
        for (int i10 = 0; i10 < 3; i10++) {
            if (!zArr[i10]) {
                k10.f12085a[i10].clear();
                k10.f12087c[i10] = null;
                zArr[i10] = false;
                k10.e[i10] = false;
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
        if (!this.f12136i && this.f12137j == null) {
            this.f12136i = true;
            ConnectionsManager.getInstance(this.f12131a).sendRequest(new TL_bots.getAdminedBots(), new s(this, 0));
        }
    }

    public final void o() {
        if (!this.f12138k && this.f12139l == null) {
            this.f12138k = true;
            ConnectionsManager.getInstance(this.f12131a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new s(this, 1));
        }
    }

    public final void p(int i10, long j10) {
        boolean z4;
        a0 k10 = k(j10);
        boolean[] zArr = k10.d;
        if (!zArr[i10] && !k10.e[i10]) {
            boolean z10 = true;
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            int i11 = this.f12131a;
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
            String str = k10.f12087c[i10];
            tL_payments_getStarsTransactions.offset = str;
            if (str == null) {
                tL_payments_getStarsTransactions.offset = "";
            }
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new u(this, k10, i10, j10, 0));
        }
    }

    public final void q(TL_update.TL_updateStarsRevenueStatus tL_updateStarsRevenueStatus) {
        long peerDialogId = DialogObject.getPeerDialogId(tL_updateStarsRevenueStatus.peer);
        if (peerDialogId < 0) {
            ke keVar = ke.f35628u1;
            if (keVar != null && keVar.f35652w0 == DialogObject.getPeerDialogId(tL_updateStarsRevenueStatus.peer)) {
                ke keVar2 = ke.f35628u1;
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = tL_updateStarsRevenueStatus.status;
                keVar2.g0(tL_starsRevenueStatus.current_balance instanceof TL_stars.TL_starsTonAmount, tL_starsRevenueStatus);
                ke.f35628u1.e0();
                return;
            }
            return;
        }
        TLRPC.TL_payments_starsRevenueStats h = h(peerDialogId, true);
        if (h != null) {
            h.status = tL_updateStarsRevenueStatus.status;
            NotificationCenter.getInstance(this.f12131a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(peerDialogId));
        }
        l(peerDialogId);
    }

    public final void r(long j10) {
        boolean z4;
        Long l10 = (Long) this.f12132b.get(Long.valueOf(j10));
        if (l10 != null && System.currentTimeMillis() - l10.longValue() <= 30000) {
            z4 = false;
        } else {
            z4 = true;
        }
        h(j10, z4);
    }
}
