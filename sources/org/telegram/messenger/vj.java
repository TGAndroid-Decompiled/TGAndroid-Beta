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
public final class vj implements Runnable {
    public final int f26049a;
    public final qp f26050b;

    public vj(qp qpVar, int i7) {
        this.f26049a = i7;
        this.f26050b = qpVar;
    }

    @Override
    public final void run() {
        switch (this.f26049a) {
            case 0:
                qp qpVar = this.f26050b;
                qpVar.getNotificationCenter().k(46, new Object[0]);
                qpVar.getNotificationCenter().k(2, 2);
                qpVar.getUserConfig().v(true);
                return;
            case 1:
                this.f26050b.h3();
                return;
            case 2:
                qp qpVar2 = this.f26050b;
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
                qp qpVar3 = this.f26050b;
                vj vjVar = qpVar3.J7;
                g0.r(vjVar);
                long currentTime = qpVar3.f24914u4 - qpVar3.getConnectionsManager().getCurrentTime();
                if (currentTime > 0) {
                    g0.i3(vjVar, currentTime);
                    return;
                }
                return;
            case 4:
                this.f26050b.f24817j2 = false;
                return;
            case 5:
                qp qpVar4 = this.f26050b;
                qpVar4.getNotificationCenter().k(2, 524288);
                qpVar4.i5();
                return;
            case 6:
                this.f26050b.R2(true);
                return;
            case 7:
                this.f26050b.M(false);
                return;
            case 8:
                p10 userConfig = this.f26050b.getUserConfig();
                if ((userConfig.f24491k0 != null || userConfig.f24490j0 != null) && Math.abs(SystemClock.elapsedRealtime() - userConfig.f24492l0) >= 1800000) {
                    userConfig.u();
                    return;
                }
                return;
            case 9:
                qp qpVar5 = this.f26050b;
                SharedPreferences sharedPreferences = qpVar5.f24768d7;
                sharedPreferences.getBoolean("EnableContactJoined", true);
                qpVar5.F2 = sharedPreferences.getInt("nextTosCheckTime", 0);
                return;
            case 10:
                this.f26050b.getNotificationsController().m(0);
                return;
            case 11:
                this.f26050b.getNotificationsController().m(1);
                return;
            case 12:
                this.f26050b.getNotificationsController().m(2);
                return;
            case 13:
                this.f26050b.getNotificationCenter().k(119, new Object[0]);
                return;
            case 14:
                qp qpVar6 = this.f26050b;
                HashSet hashSet = qpVar6.f24779e8;
                if (!hashSet.isEmpty()) {
                    TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        Long l10 = (Long) it.next();
                        l10.getClass();
                        getrequirementstocontact.f27169id.add(qpVar6.q1(qpVar6.a2(l10)));
                        arrayList.add(l10);
                    }
                    hashSet.clear();
                    if (!getrequirementstocontact.f27169id.isEmpty()) {
                        qpVar6.getConnectionsManager().sendRequest(getrequirementstocontact, new r4(6, qpVar6, arrayList));
                        return;
                    }
                    return;
                }
                return;
            case 15:
                qp qpVar7 = this.f26050b;
                qpVar7.getClass();
                a0.h hVar = new a0.h();
                HashSet hashSet2 = qpVar7.f24873p8;
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    Pair pair2 = (Pair) hVar.f(((bi.x9) pair.first).f5045a);
                    if (pair2 == null) {
                        long j3 = ((bi.x9) pair.first).f5045a;
                        pair2 = new Pair(new HashSet(), (AtomicBoolean) pair.second);
                        hVar.k(pair2, j3);
                    }
                    if (!((AtomicBoolean) pair.second).get()) {
                        ((AtomicBoolean) pair2.second).set(false);
                    }
                    ((HashSet) pair2.first).add(Integer.valueOf(((bi.x9) pair.first).f5046b));
                }
                hashSet2.clear();
                for (int i7 = 0; i7 < hVar.m(); i7++) {
                    Pair pair3 = (Pair) hVar.n(i7);
                    long j10 = hVar.j(i7);
                    boolean z9 = ((AtomicBoolean) pair3.second).get();
                    TLRPC.TL_reportMessagesDelivery tL_reportMessagesDelivery = new TLRPC.TL_reportMessagesDelivery();
                    tL_reportMessagesDelivery.peer = qpVar7.j1(j10);
                    tL_reportMessagesDelivery.f27096id.addAll((HashSet) pair3.first);
                    tL_reportMessagesDelivery.push = z9;
                    qpVar7.getConnectionsManager().sendRequest(tL_reportMessagesDelivery, null);
                }
                return;
            case 16:
                this.f26050b.getNotificationCenter().k(240, new Object[0]);
                return;
            case 17:
                this.f26050b.getNotificationCenter().k(195, new Object[0]);
                return;
            case 18:
                this.f26050b.getNotificationCenter().k(2, 4);
                return;
            case 19:
                this.f26050b.getNotificationCenter().k(2, 64);
                return;
            case 20:
                qp qpVar8 = this.f26050b;
                qpVar8.f24960z2 = 0L;
                qpVar8.D2 = null;
                qpVar8.f24904t2 = qpVar8.getConnectionsManager().getCurrentTime() + 3600;
                qp.e1().edit().putLong("proxy_dialog", qpVar8.f24960z2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", qpVar8.f24904t2).commit();
                return;
            case 21:
                qp qpVar9 = this.f26050b;
                qpVar9.getMessagesStorage().t1(false);
                g0.h3(new sn(qpVar9, 1));
                return;
            case 22:
                this.f26050b.h3();
                return;
            case 23:
                this.f26050b.h3();
                return;
            case 24:
                qp qpVar10 = this.f26050b;
                TLRPC.Dialog dialog = qpVar10.f24941x2;
                if (dialog != null) {
                    long j11 = dialog.f26964id;
                    if (j11 < 0) {
                        TLRPC.Chat M0 = qpVar10.M0(Long.valueOf(-j11));
                        if (t3.r0(M0) || M0.restricted) {
                            qpVar10.f4(qpVar10.f24941x2);
                        }
                    } else {
                        qpVar10.f4(dialog);
                    }
                    qpVar10.f24941x2 = null;
                    qpVar10.T4(null);
                    qpVar10.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            case 25:
                this.f26050b.getNotificationCenter().k(2, 8192);
                return;
            case 26:
                this.f26050b.f24773e2 = false;
                return;
            case 27:
                this.f26050b.N(true);
                return;
            case 28:
                this.f26050b.getNotificationCenter().k(2, 8192);
                return;
            default:
                this.f26050b.getNotificationCenter().k(2, 8192);
                return;
        }
    }
}
