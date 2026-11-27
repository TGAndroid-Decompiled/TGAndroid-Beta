package defpackage;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class l87 implements Runnable {
    public final byte a;
    public final uc7 b;

    public l87(uc7 uc7Var, byte b) {
        this.a = b;
        this.b = uc7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                jn7.f(uc7Var.currentAccount).k(197, new Object[0]);
                return;
            case 1:
                ob6.D0().j(uc7Var.currentAccount);
                return;
            case 2:
                i61 i61Var = uc7Var.v4;
                if (i61Var != null) {
                    i61Var.a(Boolean.TRUE);
                    uc7Var.v4 = null;
                    return;
                }
                return;
            case 3:
                uc7Var.getNotificationCenter().k(185, new Object[0]);
                return;
            case 4:
                i61 i61Var2 = uc7Var.v4;
                if (i61Var2 != null) {
                    i61Var2.a(Boolean.TRUE);
                    uc7Var.v4 = null;
                    return;
                }
                return;
            case 5:
                i61 i61Var3 = uc7Var.v4;
                if (i61Var3 != null) {
                    i61Var3.a(Boolean.FALSE);
                    uc7Var.v4 = null;
                    return;
                }
                return;
            case 6:
                uc7Var.p3();
                return;
            case 7:
                uc7 messagesController = uc7Var.getMessagesController();
                uc7Var.getNotificationCenter().a(messagesController, 139);
                uc7Var.getNotificationCenter().a(messagesController, 140);
                uc7Var.getNotificationCenter().a(messagesController, 141);
                uc7Var.getNotificationCenter().a(messagesController, 143);
                uc7Var.getNotificationCenter().a(messagesController, 144);
                uc7Var.getNotificationCenter().a(messagesController, 21);
                uc7Var.getNotificationCenter().a(messagesController, 49);
                return;
            case 8:
                l87 l87Var = uc7Var.x4;
                hl.r(l87Var);
                long currentTime = uc7Var.H3 - uc7Var.getConnectionsManager().getCurrentTime();
                if (currentTime > 0) {
                    hl.d3(l87Var, currentTime);
                    return;
                }
                return;
            case 9:
                uc7Var.getNotificationCenter().k(2, 524288);
                uc7Var.w5();
                return;
            case 10:
                uc7Var.getNotificationCenter().k(47, new Object[0]);
                uc7Var.getNotificationCenter().k(2, 2);
                uc7Var.getUserConfig().u(true);
                return;
            case 11:
                a.w();
                ConnectionsManager connectionsManager = uc7Var.getConnectionsManager();
                connectionsManager.setPushConnectionEnabled(connectionsManager.isPushConnectionEnabled());
                return;
            case 12:
                yac userConfig = uc7Var.getUserConfig();
                if ((userConfig.l0 != null || userConfig.k0 != null) && Math.abs(SystemClock.elapsedRealtime() - userConfig.m0) >= 1800000) {
                    userConfig.t();
                    return;
                }
                return;
            case 13:
                if (uc7Var.k4.A0.f) {
                    ConcurrentHashMap concurrentHashMap = k0d.a;
                    hl.c3(new osa((byte) 23));
                    return;
                }
                return;
            case 14:
                uc7Var.a3(true);
                return;
            case 15:
                uc7Var.getNotificationsController().g(0);
                return;
            case 16:
                uc7Var.getNotificationsController().g(1);
                return;
            case 17:
                uc7Var.K(false);
                return;
            case 18:
                uc7Var.getNotificationsController().g(2);
                return;
            case 19:
                SharedPreferences sharedPreferences = uc7Var.W3;
                sharedPreferences.getBoolean("EnableContactJoined", true);
                uc7Var.y2 = sharedPreferences.getInt("nextTosCheckTime", 0);
                return;
            case 20:
                uc7Var.q(null, null, null);
                return;
            case 21:
                uc7Var.getNotificationCenter().k(244, new Object[0]);
                return;
            case 22:
                uc7Var.getNotificationCenter().k(120, new Object[0]);
                return;
            case 23:
                uc7Var.getNotificationCenter().k(198, new Object[0]);
                return;
            case 24:
                HashSet hashSet = uc7Var.T4;
                if (!hashSet.isEmpty()) {
                    TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        Long l = (Long) it.next();
                        l.getClass();
                        getrequirementstocontact.id.add(uc7Var.q1(uc7Var.X1(l)));
                        arrayList.add(l);
                    }
                    hashSet.clear();
                    if (!getrequirementstocontact.id.isEmpty()) {
                        uc7Var.getConnectionsManager().sendRequest(getrequirementstocontact, new mw3(uc7Var, arrayList, (byte) 28));
                        return;
                    }
                    return;
                }
                return;
            case 25:
                zh6 zh6Var = new zh6();
                HashSet hashSet2 = uc7Var.e5;
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    Pair pair2 = (Pair) zh6Var.f(((cxa) pair.first).a);
                    if (pair2 == null) {
                        long j = ((cxa) pair.first).a;
                        pair2 = new Pair(new HashSet(), (AtomicBoolean) pair.second);
                        zh6Var.k(j, pair2);
                    }
                    if (!((AtomicBoolean) pair.second).get()) {
                        ((AtomicBoolean) pair2.second).set(false);
                    }
                    ((HashSet) pair2.first).add(Integer.valueOf(((cxa) pair.first).b));
                }
                hashSet2.clear();
                for (int i = 0; i < zh6Var.m(); i++) {
                    Pair pair3 = (Pair) zh6Var.n(i);
                    long j2 = zh6Var.j(i);
                    boolean z = ((AtomicBoolean) pair3.second).get();
                    TLRPC.TL_reportMessagesDelivery tL_reportMessagesDelivery = new TLRPC.TL_reportMessagesDelivery();
                    tL_reportMessagesDelivery.peer = uc7Var.j1(j2);
                    tL_reportMessagesDelivery.id.addAll((HashSet) pair3.first);
                    tL_reportMessagesDelivery.push = z;
                    uc7Var.getConnectionsManager().sendRequest(tL_reportMessagesDelivery, null);
                }
                return;
            case 26:
                uc7Var.s2 = 0L;
                uc7Var.w2 = null;
                uc7Var.m2 = uc7Var.getConnectionsManager().getCurrentTime() + 3600;
                uc7.e1().edit().putLong("proxy_dialog", uc7Var.s2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", uc7Var.m2).commit();
                return;
            case 27:
                uc7Var.getNotificationCenter().k(2, 4);
                return;
            case 28:
                uc7Var.getNotificationCenter().k(2, 64);
                return;
            default:
                TLRPC.Dialog dialog = uc7Var.q2;
                if (dialog != null) {
                    long j3 = dialog.id;
                    if (j3 < 0) {
                        TLRPC.Chat M0 = uc7Var.M0(Long.valueOf(-j3));
                        if (xc2.r0(M0) || M0.restricted) {
                            uc7Var.q4(uc7Var.q2);
                        }
                    } else {
                        uc7Var.q4(dialog);
                    }
                    uc7Var.q2 = null;
                    uc7Var.h5(null);
                    uc7Var.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
        }
    }
}
