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
public final class mj implements Runnable {
    public final int f24213a;
    public final hp f24214b;

    public mj(hp hpVar, int i3) {
        this.f24213a = i3;
        this.f24214b = hpVar;
    }

    @Override
    public final void run() {
        switch (this.f24213a) {
            case 0:
                hp hpVar = this.f24214b;
                hpVar.getNotificationCenter().k(46, new Object[0]);
                hpVar.getNotificationCenter().k(2, 2);
                hpVar.getUserConfig().v(true);
                return;
            case 1:
                this.f24214b.h3();
                return;
            case 2:
                hp hpVar2 = this.f24214b;
                hp messagesController = hpVar2.getMessagesController();
                hpVar2.getNotificationCenter().b(messagesController, 138);
                hpVar2.getNotificationCenter().b(messagesController, 139);
                hpVar2.getNotificationCenter().b(messagesController, 140);
                hpVar2.getNotificationCenter().b(messagesController, 142);
                hpVar2.getNotificationCenter().b(messagesController, 143);
                hpVar2.getNotificationCenter().b(messagesController, 21);
                hpVar2.getNotificationCenter().b(messagesController, 48);
                return;
            case 3:
                hp hpVar3 = this.f24214b;
                mj mjVar = hpVar3.J7;
                g0.r(mjVar);
                long currentTime = hpVar3.f23135u4 - hpVar3.getConnectionsManager().getCurrentTime();
                if (currentTime > 0) {
                    g0.i3(mjVar, currentTime);
                    return;
                }
                return;
            case 4:
                this.f24214b.f23045k2 = false;
                return;
            case 5:
                this.f24214b.R2(true);
                return;
            case 6:
                this.f24214b.M(false);
                return;
            case 7:
                h10 userConfig = this.f24214b.getUserConfig();
                if ((userConfig.f22847l0 != null || userConfig.f22846k0 != null) && Math.abs(SystemClock.elapsedRealtime() - userConfig.m0) >= 1800000) {
                    userConfig.u();
                    return;
                }
                return;
            case 8:
                hp hpVar4 = this.f24214b;
                SharedPreferences sharedPreferences = hpVar4.f22989d7;
                sharedPreferences.getBoolean("EnableContactJoined", true);
                hpVar4.G2 = sharedPreferences.getInt("nextTosCheckTime", 0);
                return;
            case 9:
                this.f24214b.getNotificationsController().m(0);
                return;
            case 10:
                this.f24214b.getNotificationsController().m(1);
                return;
            case 11:
                this.f24214b.getNotificationsController().m(2);
                return;
            case 12:
                this.f24214b.getNotificationCenter().k(119, new Object[0]);
                return;
            case 13:
                hp hpVar5 = this.f24214b;
                HashSet hashSet = hpVar5.f23000e8;
                if (!hashSet.isEmpty()) {
                    TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        Long l10 = (Long) it.next();
                        l10.getClass();
                        getrequirementstocontact.f27210id.add(hpVar5.q1(hpVar5.a2(l10)));
                        arrayList.add(l10);
                    }
                    hashSet.clear();
                    if (!getrequirementstocontact.f27210id.isEmpty()) {
                        hpVar5.getConnectionsManager().sendRequest(getrequirementstocontact, new s4(6, hpVar5, arrayList));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                hp hpVar6 = this.f24214b;
                hpVar6.getClass();
                a0.h hVar = new a0.h();
                HashSet hashSet2 = hpVar6.f23094p8;
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    Pair pair2 = (Pair) hVar.f(((ci.x8) pair.first).f6364a);
                    if (pair2 == null) {
                        long j10 = ((ci.x8) pair.first).f6364a;
                        pair2 = new Pair(new HashSet(), (AtomicBoolean) pair.second);
                        hVar.k(pair2, j10);
                    }
                    if (!((AtomicBoolean) pair.second).get()) {
                        ((AtomicBoolean) pair2.second).set(false);
                    }
                    ((HashSet) pair2.first).add(Integer.valueOf(((ci.x8) pair.first).f6365b));
                }
                hashSet2.clear();
                for (int i3 = 0; i3 < hVar.m(); i3++) {
                    Pair pair3 = (Pair) hVar.n(i3);
                    long j11 = hVar.j(i3);
                    boolean z10 = ((AtomicBoolean) pair3.second).get();
                    TLRPC.TL_reportMessagesDelivery tL_reportMessagesDelivery = new TLRPC.TL_reportMessagesDelivery();
                    tL_reportMessagesDelivery.peer = hpVar6.j1(j11);
                    tL_reportMessagesDelivery.f27137id.addAll((HashSet) pair3.first);
                    tL_reportMessagesDelivery.push = z10;
                    hpVar6.getConnectionsManager().sendRequest(tL_reportMessagesDelivery, null);
                }
                return;
            case 15:
                this.f24214b.getNotificationCenter().k(240, new Object[0]);
                return;
            case 16:
                this.f24214b.getNotificationCenter().k(195, new Object[0]);
                return;
            case 17:
                this.f24214b.getNotificationCenter().k(2, 4);
                return;
            case 18:
                this.f24214b.getNotificationCenter().k(2, 64);
                return;
            case 19:
                hp hpVar7 = this.f24214b;
                hpVar7.A2 = 0L;
                hpVar7.E2 = null;
                hpVar7.f23133u2 = hpVar7.getConnectionsManager().getCurrentTime() + 3600;
                hp.e1().edit().putLong("proxy_dialog", hpVar7.A2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", hpVar7.f23133u2).commit();
                return;
            case 20:
                hp hpVar8 = this.f24214b;
                hpVar8.getMessagesStorage().t1(false);
                g0.h3(new in(hpVar8, 0));
                return;
            case 21:
                this.f24214b.h3();
                return;
            case 22:
                this.f24214b.h3();
                return;
            case 23:
                hp hpVar9 = this.f24214b;
                TLRPC.Dialog dialog = hpVar9.f23172y2;
                if (dialog != null) {
                    long j12 = dialog.f27005id;
                    if (j12 < 0) {
                        TLRPC.Chat M0 = hpVar9.M0(Long.valueOf(-j12));
                        if (t3.r0(M0) || M0.restricted) {
                            hpVar9.f4(hpVar9.f23172y2);
                        }
                    } else {
                        hpVar9.f4(dialog);
                    }
                    hpVar9.f23172y2 = null;
                    hpVar9.T4(null);
                    hpVar9.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            case 24:
                this.f24214b.getNotificationCenter().k(2, 8192);
                return;
            case 25:
                this.f24214b.f23004f2 = false;
                return;
            case 26:
                this.f24214b.N(true);
                return;
            case 27:
                this.f24214b.getNotificationCenter().k(2, 8192);
                return;
            case 28:
                this.f24214b.getNotificationCenter().k(2, 8192);
                return;
            default:
                this.f24214b.I(true);
                return;
        }
    }
}
