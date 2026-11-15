package org.telegram.messenger;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class tj implements Runnable {
    public final int f26693a;
    public final np f26694b;

    public tj(np npVar, int i7) {
        this.f26693a = i7;
        this.f26694b = npVar;
    }

    @Override
    public final void run() {
        switch (this.f26693a) {
            case 0:
                np npVar = this.f26694b;
                npVar.getNotificationCenter().k(46, new Object[0]);
                npVar.getNotificationCenter().k(2, 2);
                npVar.getUserConfig().v(true);
                return;
            case 1:
                this.f26694b.h3();
                return;
            case 2:
                np npVar2 = this.f26694b;
                np messagesController = npVar2.getMessagesController();
                npVar2.getNotificationCenter().b(messagesController, 138);
                npVar2.getNotificationCenter().b(messagesController, 139);
                npVar2.getNotificationCenter().b(messagesController, 140);
                npVar2.getNotificationCenter().b(messagesController, 142);
                npVar2.getNotificationCenter().b(messagesController, 143);
                npVar2.getNotificationCenter().b(messagesController, 21);
                npVar2.getNotificationCenter().b(messagesController, 48);
                return;
            case 3:
                np npVar3 = this.f26694b;
                tj tjVar = npVar3.K7;
                g0.r(tjVar);
                long currentTime = npVar3.f25418v4 - npVar3.getConnectionsManager().getCurrentTime();
                if (currentTime > 0) {
                    g0.i3(tjVar, currentTime);
                    return;
                }
                return;
            case 4:
                this.f26694b.f25320k2 = false;
                return;
            case 5:
                np npVar4 = this.f26694b;
                npVar4.getNotificationCenter().k(2, 524288);
                npVar4.j5();
                return;
            case 6:
                this.f26694b.R2(true);
                return;
            case 7:
                this.f26694b.M(false);
                return;
            case 8:
                m10 userConfig = this.f26694b.getUserConfig();
                if ((userConfig.f24958l0 != null || userConfig.f24957k0 != null) && Math.abs(SystemClock.elapsedRealtime() - userConfig.m0) >= 1800000) {
                    userConfig.u();
                    return;
                }
                return;
            case 9:
                np npVar5 = this.f26694b;
                SharedPreferences sharedPreferences = npVar5.f25273e7;
                sharedPreferences.getBoolean("EnableContactJoined", true);
                npVar5.G2 = sharedPreferences.getInt("nextTosCheckTime", 0);
                return;
            case 10:
                this.f26694b.getNotificationsController().m(0);
                return;
            case 11:
                this.f26694b.getNotificationsController().m(1);
                return;
            case 12:
                this.f26694b.getNotificationsController().m(2);
                return;
            case 13:
                this.f26694b.getNotificationCenter().k(119, new Object[0]);
                return;
            case 14:
                np npVar6 = this.f26694b;
                HashSet hashSet = npVar6.f25284f8;
                if (!hashSet.isEmpty()) {
                    TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        Long l10 = (Long) it.next();
                        l10.getClass();
                        getrequirementstocontact.f28260id.add(npVar6.q1(npVar6.a2(l10)));
                        arrayList.add(l10);
                    }
                    hashSet.clear();
                    if (!getrequirementstocontact.f28260id.isEmpty()) {
                        npVar6.getConnectionsManager().sendRequest(getrequirementstocontact, new r4(6, npVar6, arrayList));
                        return;
                    }
                    return;
                }
                return;
            case 15:
                np npVar7 = this.f26694b;
                npVar7.getClass();
                a0.h hVar = new a0.h();
                HashSet hashSet2 = npVar7.f25377q8;
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    Pair pair2 = (Pair) hVar.f(((di.n8) pair.first).f9113a);
                    if (pair2 == null) {
                        long j3 = ((di.n8) pair.first).f9113a;
                        pair2 = new Pair(new HashSet(), (AtomicBoolean) pair.second);
                        hVar.k(pair2, j3);
                    }
                    if (!((AtomicBoolean) pair.second).get()) {
                        ((AtomicBoolean) pair2.second).set(false);
                    }
                    ((HashSet) pair2.first).add(Integer.valueOf(((di.n8) pair.first).f9114b));
                }
                hashSet2.clear();
                for (int i7 = 0; i7 < hVar.m(); i7++) {
                    Pair pair3 = (Pair) hVar.n(i7);
                    long j10 = hVar.j(i7);
                    boolean z10 = ((AtomicBoolean) pair3.second).get();
                    TLRPC.TL_reportMessagesDelivery tL_reportMessagesDelivery = new TLRPC.TL_reportMessagesDelivery();
                    tL_reportMessagesDelivery.peer = npVar7.j1(j10);
                    tL_reportMessagesDelivery.f28187id.addAll((HashSet) pair3.first);
                    tL_reportMessagesDelivery.push = z10;
                    npVar7.getConnectionsManager().sendRequest(tL_reportMessagesDelivery, null);
                }
                return;
            case 16:
                this.f26694b.getNotificationCenter().k(240, new Object[0]);
                return;
            case 17:
                this.f26694b.getNotificationCenter().k(195, new Object[0]);
                return;
            case 18:
                this.f26694b.getNotificationCenter().k(2, 4);
                return;
            case 19:
                this.f26694b.getNotificationCenter().k(2, 64);
                return;
            case 20:
                np npVar8 = this.f26694b;
                npVar8.A2 = 0L;
                npVar8.E2 = null;
                npVar8.f25407u2 = npVar8.getConnectionsManager().getCurrentTime() + 3600;
                np.e1().edit().putLong("proxy_dialog", npVar8.A2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", npVar8.f25407u2).commit();
                return;
            case 21:
                np npVar9 = this.f26694b;
                npVar9.getMessagesStorage().t1(false);
                g0.h3(new pn(npVar9, 1));
                return;
            case 22:
                this.f26694b.h3();
                return;
            case 23:
                this.f26694b.h3();
                return;
            case 24:
                np npVar10 = this.f26694b;
                TLRPC.Dialog dialog = npVar10.f25446y2;
                if (dialog != null) {
                    long j11 = dialog.f28055id;
                    if (j11 < 0) {
                        TLRPC.Chat M0 = npVar10.M0(Long.valueOf(-j11));
                        if (t3.r0(M0) || M0.restricted) {
                            npVar10.f4(npVar10.f25446y2);
                        }
                    } else {
                        npVar10.f4(dialog);
                    }
                    npVar10.f25446y2 = null;
                    npVar10.U4(null);
                    npVar10.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            case 25:
                this.f26694b.getNotificationCenter().k(2, 8192);
                return;
            case 26:
                this.f26694b.f25278f2 = false;
                return;
            case 27:
                this.f26694b.N(true);
                return;
            case 28:
                this.f26694b.getNotificationCenter().k(2, 8192);
                return;
            default:
                this.f26694b.getNotificationCenter().k(2, 8192);
                return;
        }
    }
}
