package gg;

import android.content.SharedPreferences;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import ii.b6;
import ii.d6;
import ii.e6;
import ii.f3;
import ii.g6;
import ii.k3;
import ii.p5;
import ii.x3;
import ii.y5;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.xc;
public final class t implements Runnable {
    public final int f9909a;
    public final Object f9910b;
    public final Object f9911c;
    public final Object d;

    public t(Object obj, Object obj2, Object obj3, int i10) {
        this.f9909a = i10;
        this.f9910b = obj;
        this.f9911c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        ArrayList arrayList;
        int i12 = this.f9909a;
        boolean z10 = false;
        Object obj = this.d;
        ?? r62 = this.f9911c;
        Object obj2 = this.f9910b;
        switch (i12) {
            case 0:
                ((g0) obj2).a((a0.i) obj, (ArrayList) r62);
                return;
            case 1:
                k1 k1Var = (k1) obj2;
                String str = (String) r62;
                TLObject tLObject = (TLObject) obj;
                k1Var.E0 = 0;
                if (str.equals(k1Var.D0) && (tLObject instanceof TLRPC.TL_messages_stickers)) {
                    TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
                    ArrayList arrayList2 = k1Var.A0;
                    if (arrayList2 != null) {
                        i10 = arrayList2.size();
                    } else {
                        i10 = 0;
                    }
                    k1Var.F("sticker_search_".concat(str), tL_messages_stickers.stickers);
                    ArrayList arrayList3 = k1Var.A0;
                    if (arrayList3 != null) {
                        i11 = arrayList3.size();
                    } else {
                        i11 = 0;
                    }
                    if (!k1Var.f9813o0 && (arrayList = k1Var.A0) != null && !arrayList.isEmpty()) {
                        k1Var.H();
                        ja0 ja0Var = k1Var.V;
                        if (k1Var.K() > 0) {
                            z10 = true;
                        }
                        ja0Var.a(z10);
                        k1Var.f9813o0 = true;
                    }
                    if (i10 != i11) {
                        k1Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                k1 k1Var2 = (k1) obj2;
                k1Var2.f9814p0 = null;
                k1Var2.Y((a0.i) obj, (ArrayList) r62, true);
                return;
            case 3:
                c2 c2Var = (c2) obj2;
                ArrayList arrayList4 = (ArrayList) r62;
                c2Var.f9685q = arrayList4;
                c2Var.f9686r = (HashMap) obj;
                c2Var.f9687s = true;
                c2Var.f9672a.Q(arrayList4);
                return;
            case 4:
                e2 e2Var = (e2) obj2;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) obj;
                String str2 = ((TLRPC.TL_messages_searchStickerSets) r62).f18195q;
                g2 g2Var = e2Var.f9710a;
                String str3 = g2Var.R;
                r41 r41Var = g2Var.e;
                if (str2.equals(str3)) {
                    e2Var.a();
                    r41Var.f27553b.h.getProgressDrawable().e = false;
                    g2Var.N = 0;
                    r41Var.b(true);
                    g2Var.E.addAll(tL_messages_foundStickerSets.sets);
                    g2Var.l();
                    return;
                }
                return;
            case 5:
                hg.d dVar = (hg.d) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) r62;
                TLObject tLObject2 = (TLObject) obj;
                if (tL_error != null) {
                    dVar.f10228a.a(0.0f);
                    xc.b0(tL_error);
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                    dVar.f10228a.a(0.0f);
                    org.telegram.messenger.z0.p(R.string.UnknownError, xc.a0(dVar), null);
                    return;
                } else {
                    dVar.finishFragment();
                    return;
                }
            case 6:
                hg.n nVar = (hg.n) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) r62;
                TLObject tLObject3 = (TLObject) obj;
                if (tL_error2 != null) {
                    nVar.e.a(0.0f);
                    xc.b0(tL_error2);
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    nVar.e.a(0.0f);
                    org.telegram.messenger.z0.p(R.string.UnknownError, xc.a0(nVar), null);
                    return;
                } else {
                    if (nVar.E != null) {
                        nVar.getMessagesController().loadFullUser(nVar.getUserConfig().getCurrentUser(), 0, true);
                    }
                    nVar.finishFragment();
                    return;
                }
            case 7:
                hg.a0 a0Var = (hg.a0) obj2;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) obj;
                ArrayList arrayList5 = a0Var.f10193b;
                if (((TLObject) r62) instanceof TLRPC.TL_boolTrue) {
                    if (arrayList5.contains(tL_businessChatLink)) {
                        arrayList5.remove(tL_businessChatLink);
                        NotificationCenter.getInstance(a0Var.f10192a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                    }
                    a0Var.f();
                    return;
                }
                FileLog.e(new RuntimeException("Unexpected response from server!"));
                return;
            case 8:
                hg.a0 a0Var2 = (hg.a0) obj2;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = (String) r62;
                ConnectionsManager.getInstance(a0Var2.f10192a).sendRequest(deletebusinesschatlink, new ai.v1(13, a0Var2, (TL_account.TL_businessChatLink) obj));
                return;
            case 9:
                hg.m0.P((hg.m0) obj2, (TL_account.TL_connectedBot) r62, (TL_account.TL_businessBotRecipients) obj);
                return;
            case 10:
                hg.x0 x0Var = (hg.x0) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) r62;
                TLObject tLObject4 = (TLObject) obj;
                if (tL_error3 != null) {
                    x0Var.f10448a.a(0.0f);
                    xc.b0(tL_error3);
                    return;
                } else if (tLObject4 instanceof TLRPC.TL_boolFalse) {
                    x0Var.f10448a.a(0.0f);
                    org.telegram.messenger.z0.p(R.string.UnknownError, xc.a0(x0Var), null);
                    return;
                } else {
                    x0Var.finishFragment();
                    return;
                }
            case 11:
                hg.h1.U((hg.h1) obj2, (TLRPC.TL_error) r62, (TLObject) obj);
                return;
            case 12:
                hg.g2 g2Var2 = (hg.g2) obj2;
                TLObject tLObject5 = (TLObject) r62;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                ArrayList arrayList6 = g2Var2.d;
                if (tLObject5 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList6.clear();
                    arrayList6.addAll(((TLRPC.TL_help_timezonesList) tLObject5).timezones);
                    SerializedData serializedData = new SerializedData(tLObject5.getObjectSize());
                    tLObject5.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                    NotificationCenter.getInstance(g2Var2.f10280a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
                }
                g2Var2.f10282c = true;
                g2Var2.f10281b = false;
                return;
            case 13:
                u2.f0 f0Var = (u2.f0) obj;
                j2.f fVar = ((i2.w0) obj2).f10895c;
                e9.a1 i13 = ((e9.f0) r62).i();
                com.google.firebase.messaging.n nVar2 = fVar.d;
                b2.b1 b1Var = fVar.h;
                b1Var.getClass();
                nVar2.getClass();
                nVar2.f7320b = e9.i0.v(i13);
                if (!i13.isEmpty()) {
                    nVar2.e = (u2.f0) i13.get(0);
                    f0Var.getClass();
                    nVar2.f7322f = f0Var;
                }
                if (((u2.f0) nVar2.d) == null) {
                    nVar2.d = com.google.firebase.messaging.n.p(b1Var, (e9.i0) nVar2.f7320b, (u2.f0) nVar2.e, (b2.h1) nVar2.f7319a);
                }
                nVar2.H(b1Var.w0());
                return;
            case 14:
                Pair pair = (Pair) r62;
                ((i2.d1) obj2).f10626b.h.b(((Integer) pair.first).intValue(), (u2.f0) pair.second, (Exception) obj);
                return;
            case 15:
                x3 x3Var = (x3) obj2;
                p5 p5Var = (p5) obj;
                if (x3Var.f11732j4 == ((o70) r62)) {
                    x3Var.f11732j4 = null;
                    if (x3Var.C3 && x3Var.f11731i4 == p5Var && !p5Var.H.isEmpty()) {
                        x3Var.M2();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                x3 x3Var2 = (x3) obj2;
                ii.a aVar = (ii.a) r62;
                ii.a aVar2 = (ii.a) obj;
                ArrayList arrayList7 = x3Var2.f11743p4;
                k3 k3Var = x3Var2.f11738n3;
                if (k3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList7.indexOf(aVar);
                    int indexOf2 = arrayList7.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        for (int i14 = 0; i14 < arrayList7.size(); i14++) {
                            ii.a aVar3 = (ii.a) arrayList7.get(i14);
                            long j3 = aVar3.f11206t;
                            if (j3 != 0) {
                                k3Var.Y(i14, g6.l((TL_iv.RichText) x3Var2.f11736m3.get(Long.valueOf(j3))));
                            } else {
                                k3Var.Y(i14, e6.z(aVar3.f11191b));
                            }
                        }
                        k3Var.j0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ((x3) obj2).Z4((ii.a) r62, (String) obj);
                return;
            case 18:
                ii.a aVar4 = (ii.a) r62;
                d6 d6Var = (d6) obj;
                b6 b6Var = ((y5) obj2).f11779a.f11355y;
                if (b6Var != null) {
                    ((f3) b6Var).d(aVar4, d6Var.f11297a, d6Var.f11298b, d6Var.f11299c, d6Var.d, d6Var.e);
                    return;
                }
                return;
            case 19:
                ji.n nVar3 = (ji.n) obj2;
                ArrayList arrayList8 = (ArrayList) r62;
                ArrayList arrayList9 = (ArrayList) obj;
                nVar3.getClass();
                for (int i15 = 0; i15 < arrayList8.size(); i15++) {
                    ((View) arrayList8.get(i15)).setVisibility(0);
                }
                if (nVar3.A.removeAll(arrayList9)) {
                    for (int i16 = 0; i16 < arrayList9.size(); i16++) {
                        nVar3.d((s4.c1) arrayList9.get(i16));
                    }
                    nVar3.G();
                }
                nVar3.K.removeAll(arrayList8);
                return;
            case 20:
                ji.n nVar4 = (ji.n) obj2;
                View view = (View) r62;
                s4.c1 c1Var = (s4.c1) obj;
                nVar4.getClass();
                view.setVisibility(0);
                if (nVar4.A.remove(c1Var)) {
                    nVar4.d(c1Var);
                    nVar4.G();
                }
                nVar4.K.remove(view);
                return;
            case 21:
                String str4 = e2.d0.f7871a;
                j2.f fVar2 = ((i2.c0) ((k2.j) ((n4.y) obj2).f14970c)).f10616a.f10675s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1009, new j2.c(p5, (b2.s) r62, (i2.h) obj, 20));
                return;
            case 22:
                m4.w wVar = (m4.w) obj2;
                m4.r rVar = (m4.r) r62;
                KeyEvent keyEvent = (KeyEvent) obj;
                m4.a0 a0Var3 = wVar.f14690b;
                if (a0Var3.i(rVar)) {
                    a0Var3.b(keyEvent, false, false);
                } else {
                    m4.l0 l0Var = a0Var3.h;
                    n4.a0 a0Var4 = rVar.f14665a;
                    a0Var4.getClass();
                    l0Var.getClass();
                    l0Var.H(1, new m4.b0(l0Var, 7), a0Var4, true);
                }
                wVar.f14689a = null;
                return;
            case 23:
                m4.a0 a0Var5 = (m4.a0) obj2;
                m4.p0 p0Var = (m4.p0) r62;
                m4.s sVar = (m4.s) obj;
                if (!a0Var5.j()) {
                    m4.f1 f1Var = a0Var5.f14454t;
                    p0Var.getClass();
                    w7.t.b(f1Var, sVar);
                    return;
                }
                return;
            case 24:
                n2.j jVar = (n2.j) obj2;
                r62.b(jVar.f14880a, jVar.f14881b, (Exception) obj);
                return;
            case 25:
                ((VideoAds) obj2).lambda$show$3((qc) r62, (TLRPC.TL_sponsoredMessage) obj);
                return;
            case 26:
                ((VideoAds) obj2).lambda$show$5((qc) r62, (boolean[]) obj);
                return;
            case 27:
                ((VideoPlayerHolderBase) obj2).lambda$release$3((TLRPC.Document) r62, (Runnable) obj);
                return;
            case 28:
                ((Utilities.Callback2) obj2).run((TLObject) r62, (TLRPC.TL_error) obj);
                return;
            default:
                ((Utilities.Callback2) obj2).run((TLRPC.Updates) r62, (TLRPC.TL_error) obj);
                return;
        }
    }
}
