package gg;

import android.content.SharedPreferences;
import android.text.SpannableString;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import hg.g2;
import ii.b6;
import ii.d6;
import ii.e6;
import ii.f3;
import ii.g6;
import ii.k3;
import ii.p5;
import ii.x3;
import ii.y5;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.am;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
public final class t implements Runnable {
    public final int f10808a;
    public final Object f10809b;
    public final Object f10810c;
    public final Object d;

    public t(Object obj, Object obj2, Object obj3, int i10) {
        this.f10808a = i10;
        this.f10809b = obj;
        this.f10810c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        ConcurrentHashMap<Long, Integer> concurrentHashMap;
        int i10;
        int i11;
        ArrayList arrayList;
        boolean z10 = false;
        switch (this.f10808a) {
            case 0:
                s sVar = (s) this.d;
                int i12 = ((h0) this.f10809b).f10636s0;
                MessagesController messagesController = MessagesController.getInstance(i12);
                Iterator it = ((HashSet) this.f10810c).iterator();
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
                j1 j1Var = (j1) this.f10809b;
                String str = (String) this.f10810c;
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
                    if (!j1Var.f10681o0 && (arrayList = j1Var.A0) != null && !arrayList.isEmpty()) {
                        j1Var.H();
                        ob0 ob0Var = j1Var.V;
                        if (j1Var.K() > 0) {
                            z10 = true;
                        }
                        ob0Var.a(z10);
                        j1Var.f10681o0 = true;
                    }
                    if (i10 != i11) {
                        j1Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                j1 j1Var2 = (j1) this.f10809b;
                a0.i iVar = (a0.i) this.d;
                j1Var2.f10682p0 = null;
                j1Var2.Y(iVar, (ArrayList) this.f10810c, true);
                return;
            case 3:
                b2 b2Var = (b2) this.f10809b;
                ArrayList arrayList4 = (ArrayList) this.f10810c;
                b2Var.f10544q = arrayList4;
                b2Var.f10545r = (HashMap) this.d;
                b2Var.f10546s = true;
                b2Var.f10530a.i0(arrayList4);
                return;
            case 4:
                d2 d2Var = (d2) this.f10809b;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str2 = ((TLRPC.TL_messages_searchStickerSets) this.f10810c).f19914q;
                f2 f2Var = d2Var.f10573a;
                String str3 = f2Var.R;
                e61 e61Var = f2Var.f10597e;
                if (str2.equals(str3)) {
                    d2Var.a();
                    e61Var.f25610b.h.getProgressDrawable().f32827e = false;
                    f2Var.N = 0;
                    e61Var.b(true);
                    f2Var.E.addAll(tL_messages_foundStickerSets.sets);
                    f2Var.l();
                    return;
                }
                return;
            case 5:
                hg.d dVar = (hg.d) this.f10809b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f10810c;
                TLObject tLObject2 = (TLObject) this.d;
                if (tL_error != null) {
                    dVar.f11185a.a(0.0f);
                    zc.d0(tL_error);
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                    dVar.f11185a.a(0.0f);
                    am.q(R.string.UnknownError, zc.a0(dVar), null);
                    return;
                } else {
                    dVar.finishFragment();
                    return;
                }
            case 6:
                hg.n nVar = (hg.n) this.f10809b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f10810c;
                TLObject tLObject3 = (TLObject) this.d;
                if (tL_error2 != null) {
                    nVar.f11317e.a(0.0f);
                    zc.d0(tL_error2);
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    nVar.f11317e.a(0.0f);
                    am.q(R.string.UnknownError, zc.a0(nVar), null);
                    return;
                } else {
                    if (nVar.E != null) {
                        nVar.getMessagesController().loadFullUser(nVar.getUserConfig().getCurrentUser(), 0, true);
                    }
                    nVar.finishFragment();
                    return;
                }
            case 7:
                hg.z zVar = (hg.z) this.f10809b;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                ArrayList arrayList5 = zVar.f11460b;
                if (((TLObject) this.f10810c) instanceof TLRPC.TL_boolTrue) {
                    if (arrayList5.contains(tL_businessChatLink)) {
                        arrayList5.remove(tL_businessChatLink);
                        NotificationCenter.getInstance(zVar.f11459a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                    }
                    zVar.f();
                    return;
                }
                FileLog.e(new RuntimeException("Unexpected response from server!"));
                return;
            case 8:
                hg.z zVar2 = (hg.z) this.f10809b;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = (String) this.f10810c;
                ConnectionsManager.getInstance(zVar2.f11459a).sendRequest(deletebusinesschatlink, new ai.v1(13, zVar2, (TL_account.TL_businessChatLink) this.d));
                return;
            case 9:
                hg.l0.Q((hg.l0) this.f10809b, (TL_account.TL_connectedBot) this.f10810c, (TL_account.TL_businessBotRecipients) this.d);
                return;
            case 10:
                hg.w0 w0Var = (hg.w0) this.f10809b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f10810c;
                TLObject tLObject4 = (TLObject) this.d;
                if (tL_error3 != null) {
                    w0Var.f11419a.a(0.0f);
                    zc.d0(tL_error3);
                    return;
                } else if (tLObject4 instanceof TLRPC.TL_boolFalse) {
                    w0Var.f11419a.a(0.0f);
                    am.q(R.string.UnknownError, zc.a0(w0Var), null);
                    return;
                } else {
                    w0Var.finishFragment();
                    return;
                }
            case 11:
                hg.g1.U((hg.g1) this.f10809b, (TLRPC.TL_error) this.f10810c, (TLObject) this.d);
                return;
            case 12:
                g2 g2Var = (g2) this.f10809b;
                TLObject tLObject5 = (TLObject) this.f10810c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                ArrayList arrayList6 = g2Var.d;
                if (tLObject5 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList6.clear();
                    arrayList6.addAll(((TLRPC.TL_help_timezonesList) tLObject5).timezones);
                    SerializedData serializedData = new SerializedData(tLObject5.getObjectSize());
                    tLObject5.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                    NotificationCenter.getInstance(g2Var.f11252a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
                }
                g2Var.f11254c = true;
                g2Var.f11253b = false;
                return;
            case 13:
                u2.f0 f0Var = (u2.f0) this.d;
                j2.f fVar = ((i2.w0) this.f10809b).f11918c;
                e9.a1 i13 = ((e9.f0) this.f10810c).i();
                com.google.firebase.messaging.n nVar2 = fVar.d;
                b2.b1 b1Var = fVar.h;
                b1Var.getClass();
                nVar2.getClass();
                nVar2.f7951b = e9.i0.v(i13);
                if (!i13.isEmpty()) {
                    nVar2.f7953e = (u2.f0) i13.get(0);
                    f0Var.getClass();
                    nVar2.f7954f = f0Var;
                }
                if (((u2.f0) nVar2.d) == null) {
                    nVar2.d = com.google.firebase.messaging.n.p(b1Var, (e9.i0) nVar2.f7951b, (u2.f0) nVar2.f7953e, (b2.h1) nVar2.f7950a);
                }
                nVar2.H(b1Var.w0());
                return;
            case 14:
                Pair pair2 = (Pair) this.f10810c;
                ((i2.d1) this.f10809b).f11629b.h.b(((Integer) pair2.first).intValue(), (u2.f0) pair2.second, (Exception) this.d);
                return;
            case 15:
                x3 x3Var = (x3) this.f10809b;
                s80 s80Var = (s80) this.f10810c;
                p5 p5Var = (p5) this.d;
                if (x3Var.f12812h4 == s80Var) {
                    x3Var.f12812h4 = null;
                    if (x3Var.A3 && x3Var.f12810g4 == p5Var && !p5Var.H.isEmpty()) {
                        x3Var.N2();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                x3 x3Var2 = (x3) this.f10809b;
                ii.a aVar = (ii.a) this.f10810c;
                ii.a aVar2 = (ii.a) this.d;
                ArrayList arrayList7 = x3Var2.f12822n4;
                k3 k3Var = x3Var2.f12818l3;
                if (k3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList7.indexOf(aVar);
                    int indexOf2 = arrayList7.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        for (int i14 = 0; i14 < arrayList7.size(); i14++) {
                            ii.a aVar3 = (ii.a) arrayList7.get(i14);
                            long j3 = aVar3.f12248t;
                            if (j3 != 0) {
                                k3Var.X(i14, g6.l((TL_iv.RichText) x3Var2.f12816k3.get(Long.valueOf(j3))));
                            } else {
                                k3Var.X(i14, e6.z(aVar3.f12232b));
                            }
                        }
                        k3Var.i0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ((x3) this.f10809b).a5((ii.a) this.f10810c, (String) this.d);
                return;
            case 18:
                ii.a aVar4 = (ii.a) this.f10810c;
                d6 d6Var = (d6) this.d;
                b6 b6Var = ((y5) this.f10809b).f12863a.f12410y;
                if (b6Var != null) {
                    ((f3) b6Var).d(aVar4, d6Var.f12348a, d6Var.f12349b, d6Var.f12350c, d6Var.d, d6Var.f12351e);
                    return;
                }
                return;
            case 19:
                ji.n nVar3 = (ji.n) this.f10809b;
                ArrayList arrayList8 = (ArrayList) this.f10810c;
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
                ji.n nVar4 = (ji.n) this.f10809b;
                View view = (View) this.f10810c;
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
                String str4 = e2.d0.f8529a;
                j2.f fVar2 = ((i2.c0) ((k2.j) ((n4.y) this.f10809b).f16363c)).f11618a.f11681s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1009, new j2.c(p5, (b2.s) this.f10810c, (i2.h) this.d, 19));
                return;
            case 22:
                SpannableString spannableString = (SpannableString) this.f10809b;
                ki.k.a(spannableString, spannableString.length(), (com.google.android.gms.internal.play_billing.s0) ((n4.y) this.f10810c).f16362b);
                ((fi.m0) this.d).run(spannableString);
                return;
            case 23:
                m4.y yVar = (m4.y) this.f10809b;
                m4.r rVar = (m4.r) this.f10810c;
                KeyEvent keyEvent = (KeyEvent) this.d;
                m4.c0 c0Var = yVar.f16001b;
                if (c0Var.i(rVar)) {
                    c0Var.b(keyEvent, false, false);
                } else {
                    m4.m0 m0Var = c0Var.h;
                    n4.a0 a0Var = rVar.f15965a;
                    a0Var.getClass();
                    m0Var.getClass();
                    m0Var.H(1, new m4.d0(m0Var, 7), a0Var, true);
                }
                yVar.f16000a = null;
                return;
            case 24:
                m4.c0 c0Var2 = (m4.c0) this.f10809b;
                m4.r0 r0Var = (m4.r0) this.f10810c;
                m4.s sVar2 = (m4.s) this.d;
                if (!c0Var2.j()) {
                    m4.g1 g1Var = c0Var2.f15748t;
                    r0Var.getClass();
                    w7.r.b(g1Var, sVar2);
                    return;
                }
                return;
            case 25:
                n2.j jVar = (n2.j) this.f10809b;
                this.f10810c.b(jVar.f16266a, jVar.f16267b, (Exception) this.d);
                return;
            case 26:
                oi.k kVar = (oi.k) this.f10809b;
                WebView webView = (WebView) this.f10810c;
                b5.h hVar = (b5.h) this.d;
                synchronized (kVar.f16939a) {
                    if (!kVar.f16957u && kVar.f16951o == webView && kVar.f16952p == hVar && !kVar.f16954r) {
                        if (kVar.f16955s) {
                            FileLog.e("WEB proxy: Base64 bridge installation timed out again; transport stopped");
                            kVar.o();
                            return;
                        }
                        kVar.f16955s = true;
                        FileLog.e("WEB proxy: Base64 bridge installation timed out; retrying once");
                        kVar.f();
                        return;
                    }
                    return;
                }
            case 27:
                ((VideoAds) this.f10809b).lambda$show$3((sc) this.f10810c, (TLRPC.TL_sponsoredMessage) this.d);
                return;
            case 28:
                ((VideoAds) this.f10809b).lambda$show$5((sc) this.f10810c, (boolean[]) this.d);
                return;
            default:
                ((VideoPlayerHolderBase) this.f10809b).lambda$release$3((TLRPC.Document) this.f10810c, (Runnable) this.d);
                return;
        }
    }
}
