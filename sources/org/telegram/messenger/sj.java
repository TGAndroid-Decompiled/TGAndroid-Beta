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
public final class sj implements Runnable {
    public final int f26834a;
    public final np f26835b;

    public sj(np npVar, int i7) {
        this.f26834a = i7;
        this.f26835b = npVar;
    }

    @Override
    public final void run() {
        switch (this.f26834a) {
            case 0:
                np npVar = this.f26835b;
                npVar.getNotificationCenter().k(46, new Object[0]);
                npVar.getNotificationCenter().k(2, 2);
                npVar.getUserConfig().v(true);
                return;
            case 1:
                this.f26835b.o3();
                return;
            case 2:
                np npVar2 = this.f26835b;
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
                np npVar3 = this.f26835b;
                sj sjVar = npVar3.P7;
                g0.r(sjVar);
                long currentTime = npVar3.f25967x4 - npVar3.getConnectionsManager().getCurrentTime();
                if (currentTime > 0) {
                    g0.h3(sjVar, currentTime);
                    return;
                }
                return;
            case 4:
                np npVar4 = this.f26835b;
                npVar4.getNotificationCenter().k(2, 524288);
                npVar4.u5();
                return;
            case 5:
                this.f26835b.X2(true);
                return;
            case 6:
                this.f26835b.M(false);
                return;
            case 7:
                k10 userConfig = this.f26835b.getUserConfig();
                if ((userConfig.f24950l0 != null || userConfig.f24949k0 != null) && Math.abs(SystemClock.elapsedRealtime() - userConfig.m0) >= 1800000) {
                    userConfig.u();
                    return;
                }
                return;
            case 8:
                np npVar5 = this.f26835b;
                SharedPreferences sharedPreferences = npVar5.f25821g7;
                sharedPreferences.getBoolean("EnableContactJoined", true);
                npVar5.I2 = sharedPreferences.getInt("nextTosCheckTime", 0);
                return;
            case 9:
                this.f26835b.getNotificationsController().m(0);
                return;
            case 10:
                this.f26835b.getNotificationsController().m(1);
                return;
            case 11:
                this.f26835b.getNotificationsController().m(2);
                return;
            case 12:
                this.f26835b.getNotificationCenter().k(119, new Object[0]);
                return;
            case 13:
                np npVar6 = this.f26835b;
                HashSet hashSet = npVar6.f25855k8;
                if (!hashSet.isEmpty()) {
                    TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        Long l10 = (Long) it.next();
                        l10.getClass();
                        getrequirementstocontact.f28607id.add(npVar6.s1(npVar6.c2(l10)));
                        arrayList.add(l10);
                    }
                    hashSet.clear();
                    if (!getrequirementstocontact.f28607id.isEmpty()) {
                        npVar6.getConnectionsManager().sendRequest(getrequirementstocontact, new t4(6, npVar6, arrayList));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                np npVar7 = this.f26835b;
                npVar7.getClass();
                a0.h hVar = new a0.h();
                HashSet hashSet2 = npVar7.f25951v8;
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    Pair pair2 = (Pair) hVar.f(((di.r8) pair.first).f9663a);
                    if (pair2 == null) {
                        long j3 = ((di.r8) pair.first).f9663a;
                        Pair pair3 = new Pair(new HashSet(), (AtomicBoolean) pair.second);
                        hVar.k(pair3, j3);
                        pair2 = pair3;
                    }
                    if (!((AtomicBoolean) pair.second).get()) {
                        ((AtomicBoolean) pair2.second).set(false);
                    }
                    ((HashSet) pair2.first).add(Integer.valueOf(((di.r8) pair.first).f9664b));
                }
                hashSet2.clear();
                for (int i7 = 0; i7 < hVar.m(); i7++) {
                    Pair pair4 = (Pair) hVar.n(i7);
                    long j10 = hVar.j(i7);
                    boolean z10 = ((AtomicBoolean) pair4.second).get();
                    TLRPC.TL_reportMessagesDelivery tL_reportMessagesDelivery = new TLRPC.TL_reportMessagesDelivery();
                    tL_reportMessagesDelivery.peer = npVar7.l1(j10);
                    tL_reportMessagesDelivery.f28534id.addAll((HashSet) pair4.first);
                    tL_reportMessagesDelivery.push = z10;
                    npVar7.getConnectionsManager().sendRequest(tL_reportMessagesDelivery, null);
                }
                return;
            case 15:
                this.f26835b.getNotificationCenter().k(243, new Object[0]);
                return;
            case 16:
                this.f26835b.getNotificationCenter().k(197, new Object[0]);
                return;
            case 17:
                this.f26835b.getNotificationCenter().k(2, 4);
                return;
            case 18:
                this.f26835b.getNotificationCenter().k(2, 64);
                return;
            case 19:
                np npVar8 = this.f26835b;
                npVar8.C2 = 0L;
                npVar8.G2 = null;
                npVar8.f25955w2 = npVar8.getConnectionsManager().getCurrentTime() + 3600;
                np.g1().edit().putLong("proxy_dialog", npVar8.C2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", npVar8.f25955w2).commit();
                return;
            case 20:
                np npVar9 = this.f26835b;
                npVar9.getMessagesStorage().t1(false);
                g0.g3(new sj(npVar9, 29));
                return;
            case 21:
                this.f26835b.o3();
                return;
            case 22:
                np npVar10 = this.f26835b;
                TLRPC.Dialog dialog = npVar10.A2;
                if (dialog != null) {
                    long j11 = dialog.f28402id;
                    if (j11 < 0) {
                        TLRPC.Chat O0 = npVar10.O0(Long.valueOf(-j11));
                        if (v3.r0(O0) || O0.restricted) {
                            npVar10.n4(npVar10.A2);
                        }
                    } else {
                        npVar10.n4(dialog);
                    }
                    npVar10.A2 = null;
                    npVar10.f5(null);
                    npVar10.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            case 23:
                this.f26835b.o3();
                return;
            case 24:
                this.f26835b.getNotificationCenter().k(2, 8192);
                return;
            case 25:
                this.f26835b.f25825h2 = false;
                return;
            case 26:
                this.f26835b.I(true);
                return;
            case 27:
                this.f26835b.getNotificationCenter().k(2, 8192);
                return;
            case 28:
                this.f26835b.N(true);
                return;
            default:
                np npVar11 = this.f26835b;
                npVar11.getMessagesController().f5(null);
                npVar11.getNotificationCenter().k(3, Boolean.TRUE);
                return;
        }
    }
}
