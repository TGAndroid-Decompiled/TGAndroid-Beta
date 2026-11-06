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
public final class wj implements Runnable {
    public final int f26321a;
    public final qp f26322b;

    public wj(qp qpVar, int i7) {
        this.f26321a = i7;
        this.f26322b = qpVar;
    }

    @Override
    public final void run() {
        switch (this.f26321a) {
            case 0:
                qp qpVar = this.f26322b;
                qpVar.getNotificationCenter().k(46, new Object[0]);
                qpVar.getNotificationCenter().k(2, 2);
                qpVar.getUserConfig().v(true);
                return;
            case 1:
                this.f26322b.h3();
                return;
            case 2:
                qp qpVar2 = this.f26322b;
                qp messagesController = qpVar2.getMessagesController();
                qpVar2.getNotificationCenter().b(messagesController, 138);
                qpVar2.getNotificationCenter().b(messagesController, 139);
                qpVar2.getNotificationCenter().b(messagesController, 140);
                qpVar2.getNotificationCenter().b(messagesController, 142);
                qpVar2.getNotificationCenter().b(messagesController, 143);
                qpVar2.getNotificationCenter().b(messagesController, 21);
                qpVar2.getNotificationCenter().b(messagesController, 48);
                return;
            case 3:
                qp qpVar3 = this.f26322b;
                wj wjVar = qpVar3.J7;
                g0.r(wjVar);
                long currentTime = qpVar3.f24903u4 - qpVar3.getConnectionsManager().getCurrentTime();
                if (currentTime > 0) {
                    g0.i3(wjVar, currentTime);
                    return;
                }
                return;
            case 4:
                this.f26322b.f24806j2 = false;
                return;
            case 5:
                this.f26322b.R2(true);
                return;
            case 6:
                this.f26322b.M(false);
                return;
            case 7:
                p10 userConfig = this.f26322b.getUserConfig();
                if ((userConfig.f24484k0 != null || userConfig.f24483j0 != null) && Math.abs(SystemClock.elapsedRealtime() - userConfig.f24485l0) >= 1800000) {
                    userConfig.u();
                    return;
                }
                return;
            case 8:
                qp qpVar4 = this.f26322b;
                SharedPreferences sharedPreferences = qpVar4.f24757d7;
                sharedPreferences.getBoolean("EnableContactJoined", true);
                qpVar4.F2 = sharedPreferences.getInt("nextTosCheckTime", 0);
                return;
            case 9:
                this.f26322b.getNotificationsController().m(0);
                return;
            case 10:
                this.f26322b.getNotificationsController().m(1);
                return;
            case 11:
                this.f26322b.getNotificationsController().m(2);
                return;
            case 12:
                this.f26322b.getNotificationCenter().k(119, new Object[0]);
                return;
            case 13:
                qp qpVar5 = this.f26322b;
                HashSet hashSet = qpVar5.f24768e8;
                if (!hashSet.isEmpty()) {
                    TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        Long l10 = (Long) it.next();
                        l10.getClass();
                        getrequirementstocontact.f27162id.add(qpVar5.q1(qpVar5.a2(l10)));
                        arrayList.add(l10);
                    }
                    hashSet.clear();
                    if (!getrequirementstocontact.f27162id.isEmpty()) {
                        qpVar5.getConnectionsManager().sendRequest(getrequirementstocontact, new s4(6, qpVar5, arrayList));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                qp qpVar6 = this.f26322b;
                qpVar6.getClass();
                a0.h hVar = new a0.h();
                HashSet hashSet2 = qpVar6.f24862p8;
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    Pair pair2 = (Pair) hVar.f(((bi.x9) pair.first).f5042a);
                    if (pair2 == null) {
                        long j3 = ((bi.x9) pair.first).f5042a;
                        pair2 = new Pair(new HashSet(), (AtomicBoolean) pair.second);
                        hVar.k(pair2, j3);
                    }
                    if (!((AtomicBoolean) pair.second).get()) {
                        ((AtomicBoolean) pair2.second).set(false);
                    }
                    ((HashSet) pair2.first).add(Integer.valueOf(((bi.x9) pair.first).f5043b));
                }
                hashSet2.clear();
                for (int i7 = 0; i7 < hVar.m(); i7++) {
                    Pair pair3 = (Pair) hVar.n(i7);
                    long j10 = hVar.j(i7);
                    boolean z9 = ((AtomicBoolean) pair3.second).get();
                    TLRPC.TL_reportMessagesDelivery tL_reportMessagesDelivery = new TLRPC.TL_reportMessagesDelivery();
                    tL_reportMessagesDelivery.peer = qpVar6.j1(j10);
                    tL_reportMessagesDelivery.f27089id.addAll((HashSet) pair3.first);
                    tL_reportMessagesDelivery.push = z9;
                    qpVar6.getConnectionsManager().sendRequest(tL_reportMessagesDelivery, null);
                }
                return;
            case 15:
                this.f26322b.getNotificationCenter().k(240, new Object[0]);
                return;
            case 16:
                this.f26322b.getNotificationCenter().k(195, new Object[0]);
                return;
            case 17:
                this.f26322b.getNotificationCenter().k(2, 4);
                return;
            case 18:
                this.f26322b.getNotificationCenter().k(2, 64);
                return;
            case 19:
                qp qpVar7 = this.f26322b;
                qpVar7.f24949z2 = 0L;
                qpVar7.D2 = null;
                qpVar7.f24893t2 = qpVar7.getConnectionsManager().getCurrentTime() + 3600;
                qp.e1().edit().putLong("proxy_dialog", qpVar7.f24949z2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", qpVar7.f24893t2).commit();
                return;
            case 20:
                qp qpVar8 = this.f26322b;
                qpVar8.getMessagesStorage().t1(false);
                g0.h3(new sn(qpVar8, 0));
                return;
            case 21:
                this.f26322b.h3();
                return;
            case 22:
                this.f26322b.h3();
                return;
            case 23:
                qp qpVar9 = this.f26322b;
                TLRPC.Dialog dialog = qpVar9.f24930x2;
                if (dialog != null) {
                    long j11 = dialog.f26957id;
                    if (j11 < 0) {
                        TLRPC.Chat M0 = qpVar9.M0(Long.valueOf(-j11));
                        if (t3.r0(M0) || M0.restricted) {
                            qpVar9.f4(qpVar9.f24930x2);
                        }
                    } else {
                        qpVar9.f4(dialog);
                    }
                    qpVar9.f24930x2 = null;
                    qpVar9.T4(null);
                    qpVar9.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            case 24:
                this.f26322b.getNotificationCenter().k(2, 8192);
                return;
            case 25:
                this.f26322b.f24762e2 = false;
                return;
            case 26:
                this.f26322b.N(true);
                return;
            case 27:
                this.f26322b.getNotificationCenter().k(2, 8192);
                return;
            case 28:
                this.f26322b.getNotificationCenter().k(2, 8192);
                return;
            default:
                this.f26322b.I(true);
                return;
        }
    }
}
