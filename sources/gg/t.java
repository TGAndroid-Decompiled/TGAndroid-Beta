package gg;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.SpannableString;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import hg.g2;
import ii.c6;
import ii.e6;
import ii.f3;
import ii.f6;
import ii.h6;
import ii.k3;
import ii.q5;
import ii.x3;
import ii.z5;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ai;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.g11;
import org.telegram.ui.Components.i11;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.sc;
public final class t implements Runnable {
    public final int f10809a;
    public final Object f10810b;
    public final Object f10811c;
    public final Object d;

    public t(Object obj, Object obj2, Object obj3, int i10) {
        this.f10809a = i10;
        this.f10810b = obj;
        this.f10811c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        ConcurrentHashMap<Long, Integer> concurrentHashMap;
        int i10;
        int i11;
        ArrayList arrayList;
        boolean z10 = false;
        switch (this.f10809a) {
            case 0:
                s sVar = (s) this.d;
                int i12 = ((h0) this.f10810b).f10637s0;
                MessagesController messagesController = MessagesController.getInstance(i12);
                Iterator it = ((HashSet) this.f10811c).iterator();
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
                j1 j1Var = (j1) this.f10810b;
                String str = (String) this.f10811c;
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
                    if (!j1Var.f10682o0 && (arrayList = j1Var.A0) != null && !arrayList.isEmpty()) {
                        j1Var.H();
                        lb0 lb0Var = j1Var.V;
                        if (j1Var.K() > 0) {
                            z10 = true;
                        }
                        lb0Var.a(z10);
                        j1Var.f10682o0 = true;
                    }
                    if (i10 != i11) {
                        j1Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                j1 j1Var2 = (j1) this.f10810b;
                a0.i iVar = (a0.i) this.d;
                j1Var2.f10683p0 = null;
                j1Var2.Y(iVar, (ArrayList) this.f10811c, true);
                return;
            case 3:
                b2 b2Var = (b2) this.f10810b;
                ArrayList arrayList4 = (ArrayList) this.f10811c;
                b2Var.f10545q = arrayList4;
                b2Var.f10546r = (HashMap) this.d;
                b2Var.f10547s = true;
                b2Var.f10531a.x0(arrayList4);
                return;
            case 4:
                d2 d2Var = (d2) this.f10810b;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str2 = ((TLRPC.TL_messages_searchStickerSets) this.f10811c).f20144q;
                f2 f2Var = d2Var.f10574a;
                String str3 = f2Var.R;
                b61 b61Var = f2Var.f10598e;
                if (str2.equals(str3)) {
                    d2Var.a();
                    b61Var.f24868b.h.getProgressDrawable().f32461e = false;
                    f2Var.N = 0;
                    b61Var.b(true);
                    f2Var.E.addAll(tL_messages_foundStickerSets.sets);
                    f2Var.l();
                    return;
                }
                return;
            case 5:
                hg.d dVar = (hg.d) this.f10810b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f10811c;
                TLObject tLObject2 = (TLObject) this.d;
                if (tL_error != null) {
                    dVar.f11186a.a(0.0f);
                    ad.d0(tL_error);
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                    dVar.f11186a.a(0.0f);
                    ai.q(R.string.UnknownError, ad.a0(dVar), null);
                    return;
                } else {
                    dVar.finishFragment();
                    return;
                }
            case 6:
                hg.n nVar = (hg.n) this.f10810b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f10811c;
                TLObject tLObject3 = (TLObject) this.d;
                if (tL_error2 != null) {
                    nVar.f11318e.a(0.0f);
                    ad.d0(tL_error2);
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    nVar.f11318e.a(0.0f);
                    ai.q(R.string.UnknownError, ad.a0(nVar), null);
                    return;
                } else {
                    if (nVar.E != null) {
                        nVar.getMessagesController().loadFullUser(nVar.getUserConfig().getCurrentUser(), 0, true);
                    }
                    nVar.finishFragment();
                    return;
                }
            case 7:
                hg.z zVar = (hg.z) this.f10810b;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                ArrayList arrayList5 = zVar.f11461b;
                if (((TLObject) this.f10811c) instanceof TLRPC.TL_boolTrue) {
                    if (arrayList5.contains(tL_businessChatLink)) {
                        arrayList5.remove(tL_businessChatLink);
                        NotificationCenter.getInstance(zVar.f11460a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                    }
                    zVar.f();
                    return;
                }
                FileLog.e(new RuntimeException("Unexpected response from server!"));
                return;
            case 8:
                hg.z zVar2 = (hg.z) this.f10810b;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = (String) this.f10811c;
                ConnectionsManager.getInstance(zVar2.f11460a).sendRequest(deletebusinesschatlink, new ai.v1(13, zVar2, (TL_account.TL_businessChatLink) this.d));
                return;
            case 9:
                hg.l0.Q((hg.l0) this.f10810b, (TL_account.TL_connectedBot) this.f10811c, (TL_account.TL_businessBotRecipients) this.d);
                return;
            case 10:
                hg.w0 w0Var = (hg.w0) this.f10810b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f10811c;
                TLObject tLObject4 = (TLObject) this.d;
                if (tL_error3 != null) {
                    w0Var.f11420a.a(0.0f);
                    ad.d0(tL_error3);
                    return;
                } else if (tLObject4 instanceof TLRPC.TL_boolFalse) {
                    w0Var.f11420a.a(0.0f);
                    ai.q(R.string.UnknownError, ad.a0(w0Var), null);
                    return;
                } else {
                    w0Var.finishFragment();
                    return;
                }
            case 11:
                hg.g1.U((hg.g1) this.f10810b, (TLRPC.TL_error) this.f10811c, (TLObject) this.d);
                return;
            case 12:
                g2 g2Var = (g2) this.f10810b;
                TLObject tLObject5 = (TLObject) this.f10811c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                ArrayList arrayList6 = g2Var.d;
                if (tLObject5 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList6.clear();
                    arrayList6.addAll(((TLRPC.TL_help_timezonesList) tLObject5).timezones);
                    SerializedData serializedData = new SerializedData(tLObject5.getObjectSize());
                    tLObject5.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                    NotificationCenter.getInstance(g2Var.f11253a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
                }
                g2Var.f11255c = true;
                g2Var.f11254b = false;
                return;
            case 13:
                u2.f0 f0Var = (u2.f0) this.d;
                j2.f fVar = ((i2.w0) this.f10810b).f11919c;
                e9.a1 i13 = ((e9.f0) this.f10811c).i();
                com.google.firebase.messaging.n nVar2 = fVar.d;
                b2.b1 b1Var = fVar.h;
                b1Var.getClass();
                nVar2.getClass();
                nVar2.f7954b = e9.i0.v(i13);
                if (!i13.isEmpty()) {
                    nVar2.f7956e = (u2.f0) i13.get(0);
                    f0Var.getClass();
                    nVar2.f7957f = f0Var;
                }
                if (((u2.f0) nVar2.d) == null) {
                    nVar2.d = com.google.firebase.messaging.n.p(b1Var, (e9.i0) nVar2.f7954b, (u2.f0) nVar2.f7956e, (b2.h1) nVar2.f7953a);
                }
                nVar2.H(b1Var.w0());
                return;
            case 14:
                Pair pair2 = (Pair) this.f10811c;
                ((i2.d1) this.f10810b).f11630b.h.b(((Integer) pair2.first).intValue(), (u2.f0) pair2.second, (Exception) this.d);
                return;
            case 15:
                x3 x3Var = (x3) this.f10810b;
                q80 q80Var = (q80) this.f10811c;
                q5 q5Var = (q5) this.d;
                if (x3Var.f12813h4 == q80Var) {
                    x3Var.f12813h4 = null;
                    if (x3Var.A3 && x3Var.f12811g4 == q5Var && !q5Var.H.isEmpty()) {
                        x3Var.N2();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                x3 x3Var2 = (x3) this.f10810b;
                ii.a aVar = (ii.a) this.f10811c;
                ii.a aVar2 = (ii.a) this.d;
                ArrayList arrayList7 = x3Var2.f12823n4;
                k3 k3Var = x3Var2.f12819l3;
                if (k3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList7.indexOf(aVar);
                    int indexOf2 = arrayList7.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        for (int i14 = 0; i14 < arrayList7.size(); i14++) {
                            ii.a aVar3 = (ii.a) arrayList7.get(i14);
                            long j3 = aVar3.f12249t;
                            if (j3 != 0) {
                                k3Var.X(i14, h6.l((TL_iv.RichText) x3Var2.f12817k3.get(Long.valueOf(j3))));
                            } else {
                                k3Var.X(i14, f6.z(aVar3.f12233b));
                            }
                        }
                        k3Var.i0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ((x3) this.f10810b).a5((ii.a) this.f10811c, (String) this.d);
                return;
            case 18:
                ii.a aVar4 = (ii.a) this.f10811c;
                e6 e6Var = (e6) this.d;
                c6 c6Var = ((z5) this.f10810b).f12881a.f12424y;
                if (c6Var != null) {
                    ((f3) c6Var).d(aVar4, e6Var.f12398a, e6Var.f12399b, e6Var.f12400c, e6Var.d, e6Var.f12401e);
                    return;
                }
                return;
            case 19:
                ji.n nVar3 = (ji.n) this.f10810b;
                ArrayList arrayList8 = (ArrayList) this.f10811c;
                ArrayList arrayList9 = (ArrayList) this.d;
                nVar3.getClass();
                for (int i15 = 0; i15 < arrayList8.size(); i15++) {
                    ((View) arrayList8.get(i15)).setVisibility(0);
                }
                if (nVar3.A.removeAll(arrayList9)) {
                    for (int i16 = 0; i16 < arrayList9.size(); i16++) {
                        nVar3.d((s4.d1) arrayList9.get(i16));
                    }
                    nVar3.G();
                }
                nVar3.K.removeAll(arrayList8);
                return;
            case 20:
                ji.n nVar4 = (ji.n) this.f10810b;
                View view = (View) this.f10811c;
                s4.d1 d1Var = (s4.d1) this.d;
                nVar4.getClass();
                view.setVisibility(0);
                if (nVar4.A.remove(d1Var)) {
                    nVar4.d(d1Var);
                    nVar4.G();
                }
                nVar4.K.remove(view);
                return;
            case 21:
                String str4 = e2.d0.f8531a;
                j2.f fVar2 = ((i2.c0) ((k2.j) ((n4.x) this.f10810b).f16659c)).f11619a.f11682s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1009, new j2.c(p5, (b2.s) this.f10811c, (i2.h) this.d, 19));
                return;
            case 22:
                ki.r rVar = (ki.r) this.f10810b;
                HandlerThread handlerThread = (HandlerThread) this.f10811c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                rVar.getClass();
                try {
                    rVar.f();
                    return;
                } finally {
                    handlerThread.quitSafely();
                    countDownLatch.countDown();
                }
            case 23:
                ki.t0 t0Var = (ki.t0) this.f10810b;
                ki.u uVar = (ki.u) this.f10811c;
                File file = (File) this.d;
                Handler handler = t0Var.f15122i;
                try {
                    uVar.c(file);
                    t0Var.g();
                    long e7 = w7.j.e(file) / 1000;
                    t0Var.f15126m.b("preview snapshot completed: durationMs=" + e7 + ", size=" + file.length() + ", elapsedMs=" + ki.t0.f(t0Var.J));
                    handler.post(new ki.e0(t0Var, e7, 1));
                    return;
                } catch (Exception e10) {
                    handler.post(new ki.d0(t0Var, e10, 3));
                    return;
                }
            case 24:
                File file2 = (File) this.d;
                ki.q0 q0Var = ((ki.t0) this.f10810b).f15119e;
                long j10 = ((ki.p0) this.f10811c).f15070a;
                i11 i11Var = (i11) q0Var;
                synchronized (i11Var) {
                    if (!i11Var.d) {
                        i11Var.f27137c.put(Long.valueOf(j10), new g11(file2));
                        return;
                    }
                    return;
                }
            case 25:
                SpannableString spannableString = (SpannableString) this.f10810b;
                li.k.a(spannableString, spannableString.length(), (com.google.android.gms.internal.play_billing.s0) ((n4.x) this.f10811c).f16658b);
                ((fi.m0) this.d).run(spannableString);
                return;
            case 26:
                m4.x xVar = (m4.x) this.f10810b;
                m4.r rVar2 = (m4.r) this.f10811c;
                KeyEvent keyEvent = (KeyEvent) this.d;
                m4.b0 b0Var = xVar.f16274b;
                if (b0Var.i(rVar2)) {
                    b0Var.b(keyEvent, false, false);
                } else {
                    m4.l0 l0Var = b0Var.h;
                    n4.z zVar3 = rVar2.f16242a;
                    zVar3.getClass();
                    l0Var.getClass();
                    l0Var.H(1, new m4.c0(l0Var, 7), zVar3, true);
                }
                xVar.f16273a = null;
                return;
            case 27:
                m4.b0 b0Var2 = (m4.b0) this.f10810b;
                m4.p0 p0Var = (m4.p0) this.f10811c;
                m4.s sVar2 = (m4.s) this.d;
                if (!b0Var2.j()) {
                    m4.g1 g1Var = b0Var2.f16022t;
                    p0Var.getClass();
                    w7.s.b(g1Var, sVar2);
                    return;
                }
                return;
            case 28:
                n2.j jVar = (n2.j) this.f10810b;
                this.f10811c.b(jVar.f16564a, jVar.f16565b, (Exception) this.d);
                return;
            default:
                ((VideoAds) this.f10810b).lambda$show$3((sc) this.f10811c, (TLRPC.TL_sponsoredMessage) this.d);
                return;
        }
    }
}
