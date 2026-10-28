package bi;

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
public final class m0 {
    public static volatile m0[] f5060m = new m0[4];
    public static final Object[] f5061n = new Object[4];
    public final int f5062a;
    public final HashMap f5063b = new HashMap();
    public final HashMap f5064c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f5065f = new HashMap();
    public final HashMap f5066g = new HashMap();
    public final HashMap h = new HashMap();
    public boolean f5067i;
    public ArrayList f5068j;
    public boolean f5069k;
    public ArrayList f5070l;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            f5061n[i10] = new Object();
        }
    }

    public m0(int i10) {
        this.f5062a = i10;
    }

    public static m0 g(int i10) {
        m0 m0Var;
        m0 m0Var2 = f5060m[i10];
        if (m0Var2 == null) {
            synchronized (f5061n[i10]) {
                try {
                    m0Var = f5060m[i10];
                    if (m0Var == null) {
                        m0[] m0VarArr = f5060m;
                        m0 m0Var3 = new m0(i10);
                        m0VarArr[i10] = m0Var3;
                        m0Var = m0Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return m0Var;
        }
        return m0Var2;
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

    public final j0 d(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.f5066g;
        j0 j0Var = (j0) hashMap.get(valueOf);
        if (j0Var == null) {
            Long valueOf2 = Long.valueOf(j10);
            j0 j0Var2 = new j0(this.f5062a, j10);
            hashMap.put(valueOf2, j0Var2);
            return j0Var2;
        }
        return j0Var;
    }

    public final k0 e(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.h;
        k0 k0Var = (k0) hashMap.get(valueOf);
        if (k0Var == null) {
            Long valueOf2 = Long.valueOf(j10);
            k0 k0Var2 = new k0(this.f5062a, j10);
            hashMap.put(valueOf2, k0Var2);
            return k0Var2;
        }
        return k0Var;
    }

    public final void f(Context context, long j10, long j11, Utilities.Callback callback) {
        j0 j0Var = (j0) this.f5066g.get(Long.valueOf(j10));
        if (j0Var != null) {
            ArrayList arrayList = j0Var.e;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (!((TL_payments.connectedBotStarRef) arrayList.get(i10)).revoked && ((TL_payments.connectedBotStarRef) arrayList.get(i10)).bot_id == j11) {
                    callback.run((TL_payments.connectedBotStarRef) arrayList.get(i10));
                    return;
                }
            }
        }
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(context, 3, null);
        TL_payments.getConnectedStarRefBot getconnectedstarrefbot = new TL_payments.getConnectedStarRefBot();
        int i11 = this.f5062a;
        getconnectedstarrefbot.peer = MessagesController.getInstance(i11).getInputPeer(j10);
        getconnectedstarrefbot.bot = MessagesController.getInstance(i11).getInputUser(j11);
        int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(getconnectedstarrefbot, new e0(this, e2Var, j11, callback, 0));
        e2Var.f22576i0 = true;
        e2Var.setOnCancelListener(new f0(this, sendRequest, 0));
        e2Var.r(200L);
    }

    public final TLRPC.TL_payments_starsRevenueStats h(long j10, boolean z10) {
        Long l4 = (Long) this.f5063b.get(Long.valueOf(j10));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.f5064c.get(Long.valueOf(j10));
        if (l4 != null && System.currentTimeMillis() - l4.longValue() <= 300000 && !z10) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.y6.I.q();
        int i10 = this.f5062a;
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new z(this, j10, 0));
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
        int i10;
        Long l4 = (Long) this.d.get(Long.valueOf(j10));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.e.get(Long.valueOf(j10));
        if (l4 != null && System.currentTimeMillis() - l4.longValue() <= 300000 && !z10) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.ton = true;
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.y6.I.q();
        int i11 = this.f5062a;
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i11).getInputPeer(j10);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i11).getChatFull(-j10);
        if (chatFull != null) {
            i10 = chatFull.stats_dc;
        } else {
            i10 = Integer.MAX_VALUE;
        }
        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsRevenueStats, new z(this, j10, 1), null, null, 0, i10, 1, true);
        return tL_payments_starsRevenueStats;
    }

    public final l0 k(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.f5065f;
        l0 l0Var = (l0) hashMap.get(valueOf);
        if (l0Var == null) {
            Long valueOf2 = Long.valueOf(j10);
            l0 l0Var2 = new l0();
            hashMap.put(valueOf2, l0Var2);
            return l0Var2;
        }
        return l0Var;
    }

    public final void l(long j10) {
        l0 k10 = k(j10);
        boolean[] zArr = k10.d;
        for (int i10 = 0; i10 < 3; i10++) {
            if (!zArr[i10]) {
                k10.f5002a[i10].clear();
                k10.f5004c[i10] = null;
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
        if (!this.f5067i && this.f5068j == null) {
            this.f5067i = true;
            ConnectionsManager.getInstance(this.f5062a).sendRequest(new TL_bots.getAdminedBots(), new b0(this, 0));
        }
    }

    public final void o() {
        if (!this.f5069k && this.f5070l == null) {
            this.f5069k = true;
            ConnectionsManager.getInstance(this.f5062a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new b0(this, 1));
        }
    }

    public final void p(int i10, long j10) {
        boolean z10;
        l0 k10 = k(j10);
        boolean[] zArr = k10.d;
        if (!zArr[i10] && !k10.e[i10]) {
            boolean z11 = true;
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            int i11 = this.f5062a;
            tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i11).getInputPeer(j10);
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            tL_payments_getStarsTransactions.inbound = z10;
            if (i10 != 2) {
                z11 = false;
            }
            tL_payments_getStarsTransactions.outbound = z11;
            String str = k10.f5004c[i10];
            tL_payments_getStarsTransactions.offset = str;
            if (str == null) {
                tL_payments_getStarsTransactions.offset = "";
            }
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new d0(this, k10, i10, j10, 0));
        }
    }

    public final void q(TL_update.TL_updateStarsRevenueStatus tL_updateStarsRevenueStatus) {
        long peerDialogId = DialogObject.getPeerDialogId(tL_updateStarsRevenueStatus.peer);
        if (peerDialogId < 0) {
            ke keVar = ke.f40753t1;
            if (keVar != null && keVar.f40771p0 == DialogObject.getPeerDialogId(tL_updateStarsRevenueStatus.peer)) {
                ke keVar2 = ke.f40753t1;
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = tL_updateStarsRevenueStatus.status;
                keVar2.L(tL_starsRevenueStatus.current_balance instanceof TL_stars.TL_starsTonAmount, tL_starsRevenueStatus);
                ke.f40753t1.J();
                return;
            }
            return;
        }
        TLRPC.TL_payments_starsRevenueStats h = h(peerDialogId, true);
        if (h != null) {
            h.status = tL_updateStarsRevenueStatus.status;
            NotificationCenter.getInstance(this.f5062a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(peerDialogId));
        }
        l(peerDialogId);
    }

    public final void r(long j10) {
        boolean z10;
        Long l4 = (Long) this.f5063b.get(Long.valueOf(j10));
        if (l4 != null && System.currentTimeMillis() - l4.longValue() <= 30000) {
            z10 = false;
        } else {
            z10 = true;
        }
        h(j10, z10);
    }
}
