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
public final class f67 implements Runnable {
    public final byte a;
    public final na7 b;

    public f67(na7 na7Var, byte b) {
        this.a = b;
        this.b = na7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                kk7.f(na7Var.currentAccount).k(196, new Object[0]);
                return;
            case 1:
                k96.D0().j(na7Var.currentAccount);
                return;
            case 2:
                a61 a61Var = na7Var.v4;
                if (a61Var != null) {
                    a61Var.a(Boolean.TRUE);
                    na7Var.v4 = null;
                    return;
                }
                return;
            case 3:
                na7Var.getNotificationCenter().k(184, new Object[0]);
                return;
            case 4:
                a61 a61Var2 = na7Var.v4;
                if (a61Var2 != null) {
                    a61Var2.a(Boolean.TRUE);
                    na7Var.v4 = null;
                    return;
                }
                return;
            case 5:
                a61 a61Var3 = na7Var.v4;
                if (a61Var3 != null) {
                    a61Var3.a(Boolean.FALSE);
                    na7Var.v4 = null;
                    return;
                }
                return;
            case 6:
                na7Var.j3();
                return;
            case 7:
                na7 messagesController = na7Var.getMessagesController();
                na7Var.getNotificationCenter().a(messagesController, 138);
                na7Var.getNotificationCenter().a(messagesController, 139);
                na7Var.getNotificationCenter().a(messagesController, 140);
                na7Var.getNotificationCenter().a(messagesController, 142);
                na7Var.getNotificationCenter().a(messagesController, 143);
                na7Var.getNotificationCenter().a(messagesController, 21);
                na7Var.getNotificationCenter().a(messagesController, 48);
                return;
            case 8:
                f67 f67Var = na7Var.x4;
                gl.r(f67Var);
                long currentTime = na7Var.H3 - na7Var.getConnectionsManager().getCurrentTime();
                if (currentTime > 0) {
                    gl.d3(f67Var, currentTime);
                    return;
                }
                return;
            case 9:
                na7Var.getNotificationCenter().k(2, 524288);
                na7Var.o5();
                return;
            case 10:
                na7Var.c2 = false;
                return;
            case 11:
                a.w();
                ConnectionsManager connectionsManager = na7Var.getConnectionsManager();
                connectionsManager.setPushConnectionEnabled(connectionsManager.isPushConnectionEnabled());
                return;
            case 12:
                y6c userConfig = na7Var.getUserConfig();
                if ((userConfig.l0 != null || userConfig.k0 != null) && Math.abs(SystemClock.elapsedRealtime() - userConfig.m0) >= 1800000) {
                    userConfig.t();
                    return;
                }
                return;
            case 13:
                na7Var.getNotificationsController().g(0);
                return;
            case 14:
                na7Var.getNotificationsController().g(1);
                return;
            case 15:
                na7Var.getNotificationsController().g(2);
                return;
            case 16:
                if (na7Var.k4.s0.f) {
                    ConcurrentHashMap concurrentHashMap = vvc.a;
                    gl.c3(new cza((byte) 20));
                    return;
                }
                return;
            case 17:
                na7Var.U2(true);
                return;
            case 18:
                na7Var.I(false);
                return;
            case 19:
                SharedPreferences sharedPreferences = na7Var.W3;
                sharedPreferences.getBoolean("EnableContactJoined", true);
                na7Var.y2 = sharedPreferences.getInt("nextTosCheckTime", 0);
                return;
            case 20:
                na7Var.p(null, null, null);
                return;
            case 21:
                na7Var.getNotificationCenter().k(119, new Object[0]);
                return;
            case 22:
                HashSet hashSet = na7Var.S4;
                if (!hashSet.isEmpty()) {
                    TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        Long l = (Long) it.next();
                        l.getClass();
                        getrequirementstocontact.id.add(na7Var.o1(na7Var.V1(l)));
                        arrayList.add(l);
                    }
                    hashSet.clear();
                    if (!getrequirementstocontact.id.isEmpty()) {
                        na7Var.getConnectionsManager().sendRequest(getrequirementstocontact, new rv3(na7Var, arrayList, (byte) 28));
                        return;
                    }
                    return;
                }
                return;
            case 23:
                vf6 vf6Var = new vf6();
                HashSet hashSet2 = na7Var.d5;
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    Pair pair2 = (Pair) vf6Var.f(((zsa) pair.first).a);
                    if (pair2 == null) {
                        long j = ((zsa) pair.first).a;
                        pair2 = new Pair(new HashSet(), (AtomicBoolean) pair.second);
                        vf6Var.k(pair2, j);
                    }
                    if (!((AtomicBoolean) pair.second).get()) {
                        ((AtomicBoolean) pair2.second).set(false);
                    }
                    ((HashSet) pair2.first).add(Integer.valueOf(((zsa) pair.first).b));
                }
                hashSet2.clear();
                for (int i = 0; i < vf6Var.m(); i++) {
                    Pair pair3 = (Pair) vf6Var.n(i);
                    long j2 = vf6Var.j(i);
                    boolean z = ((AtomicBoolean) pair3.second).get();
                    TLRPC.TL_reportMessagesDelivery tL_reportMessagesDelivery = new TLRPC.TL_reportMessagesDelivery();
                    tL_reportMessagesDelivery.peer = na7Var.h1(j2);
                    tL_reportMessagesDelivery.id.addAll((HashSet) pair3.first);
                    tL_reportMessagesDelivery.push = z;
                    na7Var.getConnectionsManager().sendRequest(tL_reportMessagesDelivery, null);
                }
                return;
            case 24:
                na7Var.getNotificationCenter().k(243, new Object[0]);
                return;
            case 25:
                na7Var.getNotificationCenter().k(197, new Object[0]);
                return;
            case 26:
                na7Var.s2 = 0L;
                na7Var.w2 = null;
                na7Var.m2 = na7Var.getConnectionsManager().getCurrentTime() + 3600;
                na7.c1().edit().putLong("proxy_dialog", na7Var.s2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", na7Var.m2).commit();
                return;
            case 27:
                na7Var.getNotificationCenter().k(2, 4);
                return;
            case 28:
                na7Var.getMessagesStorage().q1(false);
                gl.c3(new c87(na7Var, (byte) 7));
                return;
            default:
                na7Var.j3();
                return;
        }
    }
}
