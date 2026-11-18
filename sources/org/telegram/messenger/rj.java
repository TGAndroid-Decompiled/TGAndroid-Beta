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
public final class rj implements Runnable {
    public final int f26658a;
    public final mp f26659b;

    public rj(mp mpVar, int i7) {
        this.f26658a = i7;
        this.f26659b = mpVar;
    }

    @Override
    public final void run() {
        switch (this.f26658a) {
            case 0:
                mp mpVar = this.f26659b;
                mpVar.getNotificationCenter().k(46, new Object[0]);
                mpVar.getNotificationCenter().k(2, 2);
                mpVar.getUserConfig().v(true);
                return;
            case 1:
                this.f26659b.o3();
                return;
            case 2:
                mp mpVar2 = this.f26659b;
                mp messagesController = mpVar2.getMessagesController();
                mpVar2.getNotificationCenter().b(messagesController, 138);
                mpVar2.getNotificationCenter().b(messagesController, 139);
                mpVar2.getNotificationCenter().b(messagesController, 140);
                mpVar2.getNotificationCenter().b(messagesController, 142);
                mpVar2.getNotificationCenter().b(messagesController, 143);
                mpVar2.getNotificationCenter().b(messagesController, 21);
                mpVar2.getNotificationCenter().b(messagesController, 48);
                return;
            case 3:
                mp mpVar3 = this.f26659b;
                rj rjVar = mpVar3.P7;
                g0.r(rjVar);
                long currentTime = mpVar3.f25806x4 - mpVar3.getConnectionsManager().getCurrentTime();
                if (currentTime > 0) {
                    g0.h3(rjVar, currentTime);
                    return;
                }
                return;
            case 4:
                mp mpVar4 = this.f26659b;
                mpVar4.getNotificationCenter().k(2, 524288);
                mpVar4.u5();
                return;
            case 5:
                this.f26659b.X2(true);
                return;
            case 6:
                this.f26659b.M(false);
                return;
            case 7:
                j10 userConfig = this.f26659b.getUserConfig();
                if ((userConfig.f24791l0 != null || userConfig.f24790k0 != null) && Math.abs(SystemClock.elapsedRealtime() - userConfig.m0) >= 1800000) {
                    userConfig.u();
                    return;
                }
                return;
            case 8:
                mp mpVar5 = this.f26659b;
                SharedPreferences sharedPreferences = mpVar5.f25660g7;
                sharedPreferences.getBoolean("EnableContactJoined", true);
                mpVar5.I2 = sharedPreferences.getInt("nextTosCheckTime", 0);
                return;
            case 9:
                this.f26659b.getNotificationsController().m(0);
                return;
            case 10:
                this.f26659b.getNotificationsController().m(1);
                return;
            case 11:
                this.f26659b.getNotificationsController().m(2);
                return;
            case 12:
                this.f26659b.getNotificationCenter().k(119, new Object[0]);
                return;
            case 13:
                mp mpVar6 = this.f26659b;
                HashSet hashSet = mpVar6.f25694k8;
                if (!hashSet.isEmpty()) {
                    TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        Long l10 = (Long) it.next();
                        l10.getClass();
                        getrequirementstocontact.f28614id.add(mpVar6.s1(mpVar6.c2(l10)));
                        arrayList.add(l10);
                    }
                    hashSet.clear();
                    if (!getrequirementstocontact.f28614id.isEmpty()) {
                        mpVar6.getConnectionsManager().sendRequest(getrequirementstocontact, new t4(6, mpVar6, arrayList));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                mp mpVar7 = this.f26659b;
                mpVar7.getClass();
                a0.h hVar = new a0.h();
                HashSet hashSet2 = mpVar7.f25790v8;
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    Pair pair2 = (Pair) hVar.f(((di.q8) pair.first).f9599a);
                    if (pair2 == null) {
                        long j3 = ((di.q8) pair.first).f9599a;
                        Pair pair3 = new Pair(new HashSet(), (AtomicBoolean) pair.second);
                        hVar.k(pair3, j3);
                        pair2 = pair3;
                    }
                    if (!((AtomicBoolean) pair.second).get()) {
                        ((AtomicBoolean) pair2.second).set(false);
                    }
                    ((HashSet) pair2.first).add(Integer.valueOf(((di.q8) pair.first).f9600b));
                }
                hashSet2.clear();
                for (int i7 = 0; i7 < hVar.m(); i7++) {
                    Pair pair4 = (Pair) hVar.n(i7);
                    long j10 = hVar.j(i7);
                    boolean z10 = ((AtomicBoolean) pair4.second).get();
                    TLRPC.TL_reportMessagesDelivery tL_reportMessagesDelivery = new TLRPC.TL_reportMessagesDelivery();
                    tL_reportMessagesDelivery.peer = mpVar7.l1(j10);
                    tL_reportMessagesDelivery.f28541id.addAll((HashSet) pair4.first);
                    tL_reportMessagesDelivery.push = z10;
                    mpVar7.getConnectionsManager().sendRequest(tL_reportMessagesDelivery, null);
                }
                return;
            case 15:
                this.f26659b.getNotificationCenter().k(242, new Object[0]);
                return;
            case 16:
                this.f26659b.getNotificationCenter().k(197, new Object[0]);
                return;
            case 17:
                this.f26659b.getNotificationCenter().k(2, 4);
                return;
            case 18:
                this.f26659b.getNotificationCenter().k(2, 64);
                return;
            case 19:
                mp mpVar8 = this.f26659b;
                mpVar8.C2 = 0L;
                mpVar8.G2 = null;
                mpVar8.f25794w2 = mpVar8.getConnectionsManager().getCurrentTime() + 3600;
                mp.g1().edit().putLong("proxy_dialog", mpVar8.C2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", mpVar8.f25794w2).commit();
                return;
            case 20:
                mp mpVar9 = this.f26659b;
                mpVar9.getMessagesStorage().t1(false);
                g0.g3(new rj(mpVar9, 29));
                return;
            case 21:
                this.f26659b.o3();
                return;
            case 22:
                mp mpVar10 = this.f26659b;
                TLRPC.Dialog dialog = mpVar10.A2;
                if (dialog != null) {
                    long j11 = dialog.f28409id;
                    if (j11 < 0) {
                        TLRPC.Chat O0 = mpVar10.O0(Long.valueOf(-j11));
                        if (v3.r0(O0) || O0.restricted) {
                            mpVar10.n4(mpVar10.A2);
                        }
                    } else {
                        mpVar10.n4(dialog);
                    }
                    mpVar10.A2 = null;
                    mpVar10.f5(null);
                    mpVar10.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            case 23:
                this.f26659b.o3();
                return;
            case 24:
                this.f26659b.getNotificationCenter().k(2, 8192);
                return;
            case 25:
                this.f26659b.f25664h2 = false;
                return;
            case 26:
                this.f26659b.I(true);
                return;
            case 27:
                this.f26659b.getNotificationCenter().k(2, 8192);
                return;
            case 28:
                this.f26659b.N(true);
                return;
            default:
                mp mpVar11 = this.f26659b;
                mpVar11.getMessagesController().f5(null);
                mpVar11.getNotificationCenter().k(3, Boolean.TRUE);
                return;
        }
    }
}
