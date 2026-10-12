package hg;

import android.content.SharedPreferences;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.SpannableString;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import ig.f2;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import ji.c6;
import ji.f3;
import ji.f6;
import ji.h6;
import ji.i6;
import ji.k3;
import ji.k6;
import ji.u5;
import ji.x3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.yh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a11;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.zc;
public final class t implements Runnable {
    public final int f10744a;
    public final Object f10745b;
    public final Object f10746c;
    public final Object d;

    public t(Object obj, Object obj2, Object obj3, int i10) {
        this.f10744a = i10;
        this.f10745b = obj;
        this.f10746c = obj2;
        this.d = obj3;
    }

    private final void a() {
        File file = (File) this.d;
        li.r0 r0Var = ((li.u0) this.f10745b).e;
        long j10 = ((li.q0) this.f10746c).f14945a;
        c11 c11Var = (c11) r0Var;
        synchronized (c11Var) {
            if (c11Var.d) {
                return;
            }
            c11Var.f23913c.put(Long.valueOf(j10), new a11(file));
        }
    }

    @Override
    public final void run() {
        ConcurrentHashMap<Long, Integer> concurrentHashMap;
        int i10;
        int i11;
        ArrayList arrayList;
        boolean z10 = false;
        switch (this.f10744a) {
            case 0:
                s sVar = (s) this.d;
                int i12 = ((h0) this.f10745b).f10586s0;
                MessagesController messagesController = MessagesController.getInstance(i12);
                Iterator it = ((HashSet) this.f10746c).iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    boolean booleanValue = ((Boolean) pair.first).booleanValue();
                    Long l4 = (Long) pair.second;
                    long longValue = l4.longValue();
                    if (booleanValue) {
                        concurrentHashMap = messagesController.dialogs_read_outbox_max;
                    } else {
                        concurrentHashMap = messagesController.dialogs_read_inbox_max;
                    }
                    concurrentHashMap.put(l4, Integer.valueOf(MessagesStorage.getInstance(i12).getDialogReadMaxSync(booleanValue, longValue)));
                }
                AndroidUtilities.runOnUIThread(sVar);
                return;
            case 1:
                j1 j1Var = (j1) this.f10745b;
                String str = (String) this.f10746c;
                TLObject tLObject = (TLObject) this.d;
                j1Var.E0 = 0;
                if (str.equals(j1Var.D0) && (tLObject instanceof TLRPC.TL_messages_stickers)) {
                    TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
                    ArrayList arrayList2 = j1Var.A0;
                    if (arrayList2 != null) {
                        i10 = arrayList2.size();
                    } else {
                        i10 = 0;
                    }
                    j1Var.F("sticker_search_".concat(str), tL_messages_stickers.stickers);
                    ArrayList arrayList3 = j1Var.A0;
                    if (arrayList3 != null) {
                        i11 = arrayList3.size();
                    } else {
                        i11 = 0;
                    }
                    if (!j1Var.f10627o0 && (arrayList = j1Var.A0) != null && !arrayList.isEmpty()) {
                        j1Var.H();
                        jb0 jb0Var = j1Var.V;
                        if (j1Var.K() > 0) {
                            z10 = true;
                        }
                        jb0Var.a(z10);
                        j1Var.f10627o0 = true;
                    }
                    if (i10 != i11) {
                        j1Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                j1 j1Var2 = (j1) this.f10745b;
                a0.h hVar = (a0.h) this.d;
                j1Var2.f10628p0 = null;
                j1Var2.Y(hVar, (ArrayList) this.f10746c, true);
                return;
            case 3:
                a2 a2Var = (a2) this.f10745b;
                ArrayList arrayList4 = (ArrayList) this.f10746c;
                a2Var.f10497q = arrayList4;
                a2Var.f10498r = (HashMap) this.d;
                a2Var.f10499s = true;
                a2Var.f10484a.I0(arrayList4);
                return;
            case 4:
                c2 c2Var = (c2) this.f10745b;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str2 = ((TLRPC.TL_messages_searchStickerSets) this.f10746c).f19328q;
                e2 e2Var = c2Var.f10519a;
                String str3 = e2Var.R;
                v51 v51Var = e2Var.e;
                if (str2.equals(str3)) {
                    c2Var.a();
                    v51Var.f29898b.h.getProgressDrawable().e = false;
                    e2Var.N = 0;
                    v51Var.b(true);
                    e2Var.E.addAll(tL_messages_foundStickerSets.sets);
                    e2Var.l();
                    return;
                }
                return;
            case 5:
                u2.g0 g0Var = (u2.g0) this.d;
                j2.f fVar = ((i2.z0) this.f10745b).f11241c;
                e9.x1 f7 = ((e9.k0) this.f10746c).f();
                com.google.firebase.messaging.m mVar = fVar.d;
                b2.g1 g1Var = fVar.h;
                g1Var.getClass();
                mVar.getClass();
                mVar.f6192b = e9.n0.u(f7);
                if (!f7.isEmpty()) {
                    mVar.e = (u2.g0) f7.get(0);
                    g0Var.getClass();
                    mVar.f6194f = g0Var;
                }
                if (((u2.g0) mVar.d) == null) {
                    mVar.d = com.google.firebase.messaging.m.p(g1Var, (e9.n0) mVar.f6192b, (u2.g0) mVar.e, (b2.m1) mVar.f6191a);
                }
                mVar.H(g1Var.y0());
                return;
            case 6:
                Pair pair2 = (Pair) this.f10746c;
                ((i2.g1) this.f10745b).f10977b.h.c(((Integer) pair2.first).intValue(), (u2.g0) pair2.second, (oa.d) this.d);
                return;
            case 7:
                Pair pair3 = (Pair) this.f10746c;
                ((i2.g1) this.f10745b).f10977b.h.b(((Integer) pair3.first).intValue(), (u2.g0) pair3.second, (Exception) this.d);
                return;
            case 8:
                ig.c cVar = (ig.c) this.f10745b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f10746c;
                TLObject tLObject2 = (TLObject) this.d;
                if (tL_error != null) {
                    cVar.f11451a.a(0.0f);
                    zc.d0(tL_error);
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                    cVar.f11451a.a(0.0f);
                    yh.p(R.string.UnknownError, zc.a0(cVar), null);
                    return;
                } else {
                    cVar.finishFragment();
                    return;
                }
            case 9:
                ig.m mVar2 = (ig.m) this.f10745b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f10746c;
                TLObject tLObject3 = (TLObject) this.d;
                if (tL_error2 != null) {
                    mVar2.e.a(0.0f);
                    zc.d0(tL_error2);
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    mVar2.e.a(0.0f);
                    yh.p(R.string.UnknownError, zc.a0(mVar2), null);
                    return;
                } else {
                    if (mVar2.E != null) {
                        mVar2.getMessagesController().loadFullUser(mVar2.getUserConfig().getCurrentUser(), 0, true);
                    }
                    mVar2.finishFragment();
                    return;
                }
            case 10:
                ig.y yVar = (ig.y) this.f10745b;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                ArrayList arrayList5 = yVar.f11698b;
                if (((TLObject) this.f10746c) instanceof TLRPC.TL_boolTrue) {
                    if (arrayList5.contains(tL_businessChatLink)) {
                        arrayList5.remove(tL_businessChatLink);
                        NotificationCenter.getInstance(yVar.f11697a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                    }
                    yVar.f();
                    return;
                }
                FileLog.e(new RuntimeException("Unexpected response from server!"));
                return;
            case 11:
                ig.y yVar2 = (ig.y) this.f10745b;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = (String) this.f10746c;
                ConnectionsManager.getInstance(yVar2.f11697a).sendRequest(deletebusinesschatlink, new bi.m1(13, yVar2, (TL_account.TL_businessChatLink) this.d));
                return;
            case 12:
                ig.k0.Q((ig.k0) this.f10745b, (TL_account.TL_connectedBot) this.f10746c, (TL_account.TL_businessBotRecipients) this.d);
                return;
            case 13:
                ig.w0 w0Var = (ig.w0) this.f10745b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f10746c;
                TLObject tLObject4 = (TLObject) this.d;
                if (tL_error3 != null) {
                    w0Var.f11674a.a(0.0f);
                    zc.d0(tL_error3);
                    return;
                } else if (tLObject4 instanceof TLRPC.TL_boolFalse) {
                    w0Var.f11674a.a(0.0f);
                    yh.p(R.string.UnknownError, zc.a0(w0Var), null);
                    return;
                } else {
                    w0Var.finishFragment();
                    return;
                }
            case 14:
                ig.g1.U((ig.g1) this.f10745b, (TLRPC.TL_error) this.f10746c, (TLObject) this.d);
                return;
            case 15:
                f2 f2Var = (f2) this.f10745b;
                TLObject tLObject5 = (TLObject) this.f10746c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                ArrayList arrayList6 = f2Var.d;
                if (tLObject5 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList6.clear();
                    arrayList6.addAll(((TLRPC.TL_help_timezonesList) tLObject5).timezones);
                    SerializedData serializedData = new SerializedData(tLObject5.getObjectSize());
                    tLObject5.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                    NotificationCenter.getInstance(f2Var.f11505a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
                }
                f2Var.f11507c = true;
                f2Var.f11506b = false;
                return;
            case 16:
                x3 x3Var = (x3) this.f10745b;
                m80 m80Var = (m80) this.f10746c;
                u5 u5Var = (u5) this.d;
                if (x3Var.f13632h4 == m80Var) {
                    x3Var.f13632h4 = null;
                    if (x3Var.A3 && x3Var.f13630g4 == u5Var && !u5Var.H.isEmpty()) {
                        x3Var.N2();
                        return;
                    }
                    return;
                }
                return;
            case 17:
                x3 x3Var2 = (x3) this.f10745b;
                ji.a aVar = (ji.a) this.f10746c;
                ji.a aVar2 = (ji.a) this.d;
                ArrayList arrayList7 = x3Var2.f13643n4;
                k3 k3Var = x3Var2.f13639l3;
                if (k3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList7.indexOf(aVar);
                    int indexOf2 = arrayList7.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        for (int i13 = 0; i13 < arrayList7.size(); i13++) {
                            ji.a aVar3 = (ji.a) arrayList7.get(i13);
                            long j10 = aVar3.f13118t;
                            if (j10 != 0) {
                                k3Var.X(i13, k6.l((TL_iv.RichText) x3Var2.f13637k3.get(Long.valueOf(j10))));
                            } else {
                                k3Var.X(i13, i6.z(aVar3.f13103b));
                            }
                        }
                        k3Var.i0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                        return;
                    }
                    return;
                }
                return;
            case 18:
                ((x3) this.f10745b).a5((String) this.d, (ji.a) this.f10746c);
                return;
            case 19:
                ji.a aVar4 = (ji.a) this.f10746c;
                h6 h6Var = (h6) this.d;
                f6 f6Var = ((c6) this.f10745b).f13188a.f13343y;
                if (f6Var != null) {
                    ((f3) f6Var).d(aVar4, h6Var.f13313a, h6Var.f13314b, h6Var.f13315c, h6Var.d, h6Var.e);
                    return;
                }
                return;
            case 20:
                String str4 = e2.m0.f8372a;
                j2.f fVar2 = ((i2.b0) ((k2.u) ((qf.b) this.f10745b).f43356c)).f10925a.f11012s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1009, new j2.e(p5, (b2.x) this.f10746c, (i2.f) this.d));
                return;
            case 21:
                AudioTrack audioTrack = (AudioTrack) this.f10745b;
                Handler handler = (Handler) this.f10746c;
                e2.r rVar = (e2.r) this.d;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new ig.t0(rVar, 13));
                    }
                    synchronized (k2.h0.f13888t) {
                        try {
                            int i14 = k2.h0.v - 1;
                            k2.h0.v = i14;
                            if (i14 == 0) {
                                ScheduledExecutorService scheduledExecutorService = k2.h0.f13889u;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                k2.h0.f13889u = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new ig.t0(rVar, 13));
                    }
                    synchronized (k2.h0.f13888t) {
                        try {
                            int i15 = k2.h0.v - 1;
                            k2.h0.v = i15;
                            if (i15 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = k2.h0.f13889u;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                k2.h0.f13889u = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            case 22:
                ki.n nVar = (ki.n) this.f10745b;
                ArrayList arrayList8 = (ArrayList) this.f10746c;
                ArrayList arrayList9 = (ArrayList) this.d;
                nVar.getClass();
                for (int i16 = 0; i16 < arrayList8.size(); i16++) {
                    ((View) arrayList8.get(i16)).setVisibility(0);
                }
                if (nVar.A.removeAll(arrayList9)) {
                    for (int i17 = 0; i17 < arrayList9.size(); i17++) {
                        nVar.d((s4.b1) arrayList9.get(i17));
                    }
                    nVar.G();
                }
                nVar.K.removeAll(arrayList8);
                return;
            case 23:
                ki.n nVar2 = (ki.n) this.f10745b;
                View view = (View) this.f10746c;
                s4.b1 b1Var = (s4.b1) this.d;
                nVar2.getClass();
                view.setVisibility(0);
                if (nVar2.A.remove(b1Var)) {
                    nVar2.d(b1Var);
                    nVar2.G();
                }
                nVar2.K.remove(view);
                return;
            case 24:
                li.u uVar = (li.u) this.f10745b;
                HandlerThread handlerThread = (HandlerThread) this.f10746c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                uVar.getClass();
                try {
                    uVar.i();
                    return;
                } finally {
                    handlerThread.quitSafely();
                    countDownLatch.countDown();
                }
            case 25:
                li.u0 u0Var = (li.u0) this.f10745b;
                li.x xVar = (li.x) this.f10746c;
                File file = (File) this.d;
                Handler handler2 = u0Var.f15011i;
                try {
                    xVar.c(file);
                    u0Var.g();
                    long e = w7.p.e(file) / 1000;
                    u0Var.f15015m.b("preview snapshot completed: durationMs=" + e + ", size=" + file.length() + ", elapsedMs=" + li.u0.f(u0Var.J));
                    handler2.post(new li.h0(u0Var, e, 1));
                    return;
                } catch (Exception e7) {
                    handler2.post(new li.g0(u0Var, e7, 3));
                    return;
                }
            case 26:
                a();
                return;
            case 27:
                m4.b0 b0Var = (m4.b0) this.f10745b;
                m4.w wVar = (m4.w) this.f10746c;
                KeyEvent keyEvent = (KeyEvent) this.d;
                m4.f0 f0Var = b0Var.f15390b;
                if (f0Var.i(wVar)) {
                    f0Var.b(keyEvent, false, false);
                } else {
                    m4.q0 q0Var = f0Var.h;
                    n4.t tVar = wVar.f15670a;
                    tVar.getClass();
                    q0Var.getClass();
                    q0Var.H(1, new m4.i0(q0Var, 9), tVar, true);
                }
                b0Var.f15389a = null;
                return;
            case 28:
                m4.f0 f0Var2 = (m4.f0) this.f10745b;
                m4.w0 w0Var2 = (m4.w0) this.f10746c;
                m4.x xVar2 = (m4.x) this.d;
                if (!f0Var2.j()) {
                    m4.n1 n1Var = f0Var2.f15440t;
                    w0Var2.getClass();
                    w7.w.b(n1Var, xVar2);
                    return;
                }
                return;
            default:
                SpannableString spannableString = (SpannableString) this.f10745b;
                mi.k.a(spannableString, spannableString.length(), (com.google.android.gms.internal.play_billing.s0) ((m4.c) this.f10746c).f15392b);
                ((gi.m0) this.d).run(spannableString);
                return;
        }
    }
}
