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
public final class ak implements Runnable {
    public final int f14638a;
    public final wp f14639b;

    public ak(wp wpVar, int i10) {
        this.f14638a = i10;
        this.f14639b = wpVar;
    }

    @Override
    public final void run() {
        switch (this.f14638a) {
            case 0:
                this.f14639b.f3();
                return;
            case 1:
                wp wpVar = this.f14639b;
                wpVar.getNotificationCenter().k(46, new Object[0]);
                wpVar.getNotificationCenter().k(2, 2);
                wpVar.getUserConfig().v(true);
                return;
            case 2:
                wp wpVar2 = this.f14639b;
                wp messagesController = wpVar2.getMessagesController();
                wpVar2.getNotificationCenter().b(messagesController, 138);
                wpVar2.getNotificationCenter().b(messagesController, 139);
                wpVar2.getNotificationCenter().b(messagesController, 140);
                wpVar2.getNotificationCenter().b(messagesController, 142);
                wpVar2.getNotificationCenter().b(messagesController, 143);
                wpVar2.getNotificationCenter().b(messagesController, 21);
                wpVar2.getNotificationCenter().b(messagesController, 48);
                return;
            case 3:
                wp wpVar3 = this.f14639b;
                ak akVar = wpVar3.K7;
                i0.r(akVar);
                long currentTime = wpVar3.f19268v4 - wpVar3.getConnectionsManager().getCurrentTime();
                if (currentTime > 0) {
                    i0.h3(akVar, currentTime);
                    return;
                }
                return;
            case 4:
                this.f14639b.P2(true);
                return;
            case 5:
                this.f14639b.M(false);
                return;
            case 6:
                e20 userConfig = this.f14639b.getUserConfig();
                if ((userConfig.f15522k0 != null || userConfig.f15521j0 != null) && Math.abs(SystemClock.elapsedRealtime() - userConfig.f15523l0) >= 1800000) {
                    userConfig.u();
                    return;
                }
                return;
            case 7:
                wp wpVar4 = this.f14639b;
                SharedPreferences sharedPreferences = wpVar4.e7;
                sharedPreferences.getBoolean("EnableContactJoined", true);
                wpVar4.F2 = sharedPreferences.getInt("nextTosCheckTime", 0);
                return;
            case 8:
                this.f14639b.getNotificationCenter().k(119, new Object[0]);
                return;
            case 9:
                this.f14639b.getNotificationsController().m(0);
                return;
            case 10:
                this.f14639b.getNotificationsController().m(1);
                return;
            case 11:
                this.f14639b.getNotificationsController().m(2);
                return;
            case 12:
                wp wpVar5 = this.f14639b;
                HashSet hashSet = wpVar5.f19130f8;
                if (!hashSet.isEmpty()) {
                    TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        Long l4 = (Long) it.next();
                        l4.getClass();
                        getrequirementstocontact.f20002id.add(wpVar5.p1(wpVar5.Z1(l4)));
                        arrayList.add(l4);
                    }
                    hashSet.clear();
                    if (!getrequirementstocontact.f20002id.isEmpty()) {
                        wpVar5.getConnectionsManager().sendRequest(getrequirementstocontact, new v4(6, wpVar5, arrayList));
                        return;
                    }
                    return;
                }
                return;
            case 13:
                wp wpVar6 = this.f14639b;
                wpVar6.getClass();
                a0.h hVar = new a0.h();
                HashSet hashSet2 = wpVar6.f19225q8;
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    Pair pair2 = (Pair) hVar.f(((rh.x5) pair.first).f47705a);
                    if (pair2 == null) {
                        long j10 = ((rh.x5) pair.first).f47705a;
                        Pair pair3 = new Pair(new HashSet(), (AtomicBoolean) pair.second);
                        hVar.k(pair3, j10);
                        pair2 = pair3;
                    }
                    if (!((AtomicBoolean) pair.second).get()) {
                        ((AtomicBoolean) pair2.second).set(false);
                    }
                    ((HashSet) pair2.first).add(Integer.valueOf(((rh.x5) pair.first).f47706b));
                }
                hashSet2.clear();
                for (int i10 = 0; i10 < hVar.m(); i10++) {
                    Pair pair4 = (Pair) hVar.n(i10);
                    long j11 = hVar.j(i10);
                    boolean z10 = ((AtomicBoolean) pair4.second).get();
                    TLRPC.TL_reportMessagesDelivery tL_reportMessagesDelivery = new TLRPC.TL_reportMessagesDelivery();
                    tL_reportMessagesDelivery.peer = wpVar6.i1(j11);
                    tL_reportMessagesDelivery.f19930id.addAll((HashSet) pair4.first);
                    tL_reportMessagesDelivery.push = z10;
                    wpVar6.getConnectionsManager().sendRequest(tL_reportMessagesDelivery, null);
                }
                return;
            case 14:
                this.f14639b.getNotificationCenter().k(240, new Object[0]);
                return;
            case 15:
                this.f14639b.getNotificationCenter().k(195, new Object[0]);
                return;
            case 16:
                this.f14639b.getNotificationCenter().k(2, 4);
                return;
            case 17:
                this.f14639b.getNotificationCenter().k(2, 64);
                return;
            case 18:
                wp wpVar7 = this.f14639b;
                wpVar7.f19304z2 = 0L;
                wpVar7.D2 = null;
                wpVar7.f19248t2 = wpVar7.getConnectionsManager().getCurrentTime() + 3600;
                wp.d1().edit().putLong("proxy_dialog", wpVar7.f19304z2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", wpVar7.f19248t2).commit();
                return;
            case 19:
                wp wpVar8 = this.f14639b;
                wpVar8.getMessagesStorage().t1(false);
                i0.g3(new ak(wpVar8, 29));
                return;
            case 20:
                this.f14639b.f3();
                return;
            case 21:
                wp wpVar9 = this.f14639b;
                TLRPC.Dialog dialog = wpVar9.f19286x2;
                if (dialog != null) {
                    long j12 = dialog.f19798id;
                    if (j12 < 0) {
                        TLRPC.Chat L0 = wpVar9.L0(Long.valueOf(-j12));
                        if (w3.r0(L0) || L0.restricted) {
                            wpVar9.c4(wpVar9.f19286x2);
                        }
                    } else {
                        wpVar9.c4(dialog);
                    }
                    wpVar9.f19286x2 = null;
                    wpVar9.Q4(null);
                    wpVar9.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            case 22:
                this.f14639b.f3();
                return;
            case 23:
                this.f14639b.getNotificationCenter().k(2, 8192);
                return;
            case 24:
                this.f14639b.f19116e2 = false;
                return;
            case 25:
                this.f14639b.N(true);
                return;
            case 26:
                this.f14639b.I(true);
                return;
            case 27:
                this.f14639b.getNotificationCenter().k(2, 8192);
                return;
            case 28:
                this.f14639b.getNotificationCenter().k(2, 8192);
                return;
            default:
                wp wpVar10 = this.f14639b;
                wpVar10.getMessagesController().Q4(null);
                wpVar10.getNotificationCenter().k(3, Boolean.TRUE);
                return;
        }
    }
}
