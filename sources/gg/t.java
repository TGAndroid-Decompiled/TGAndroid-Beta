package gg;

import android.content.SharedPreferences;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import ii.a6;
import ii.c6;
import ii.d6;
import ii.e3;
import ii.f6;
import ii.j3;
import ii.o5;
import ii.w3;
import ii.x5;
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
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.vc;
public final class t implements Runnable {
    public final int f9922a;
    public final Object f9923b;
    public final Object f9924c;
    public final Object d;

    public t(Object obj, Object obj2, Object obj3, int i10) {
        this.f9922a = i10;
        this.f9923b = obj;
        this.f9924c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        ArrayList arrayList;
        int i12 = this.f9922a;
        boolean z10 = false;
        Object obj = this.d;
        ?? r62 = this.f9924c;
        Object obj2 = this.f9923b;
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
                    if (!k1Var.f9826o0 && (arrayList = k1Var.A0) != null && !arrayList.isEmpty()) {
                        k1Var.H();
                        ia0 ia0Var = k1Var.V;
                        if (k1Var.K() > 0) {
                            z10 = true;
                        }
                        ia0Var.a(z10);
                        k1Var.f9826o0 = true;
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
                k1Var2.f9827p0 = null;
                k1Var2.Y((a0.i) obj, (ArrayList) r62, true);
                return;
            case 3:
                c2 c2Var = (c2) obj2;
                ArrayList arrayList4 = (ArrayList) r62;
                c2Var.f9698q = arrayList4;
                c2Var.f9699r = (HashMap) obj;
                c2Var.f9700s = true;
                c2Var.f9685a.Q(arrayList4);
                return;
            case 4:
                e2 e2Var = (e2) obj2;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) obj;
                String str2 = ((TLRPC.TL_messages_searchStickerSets) r62).f18224q;
                g2 g2Var = e2Var.f9723a;
                String str3 = g2Var.R;
                s41 s41Var = g2Var.e;
                if (str2.equals(str3)) {
                    e2Var.a();
                    s41Var.f27770b.h.getProgressDrawable().e = false;
                    g2Var.N = 0;
                    s41Var.b(true);
                    g2Var.E.addAll(tL_messages_foundStickerSets.sets);
                    g2Var.l();
                    return;
                }
                return;
            case 5:
                hg.c cVar = (hg.c) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) r62;
                TLObject tLObject2 = (TLObject) obj;
                if (tL_error != null) {
                    cVar.f10233a.a(0.0f);
                    vc.b0(tL_error);
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                    cVar.f10233a.a(0.0f);
                    org.telegram.messenger.w1.p(R.string.UnknownError, vc.a0(cVar), null);
                    return;
                } else {
                    cVar.finishFragment();
                    return;
                }
            case 6:
                hg.m mVar = (hg.m) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) r62;
                TLObject tLObject3 = (TLObject) obj;
                if (tL_error2 != null) {
                    mVar.f10349f.a(0.0f);
                    vc.b0(tL_error2);
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    mVar.f10349f.a(0.0f);
                    org.telegram.messenger.w1.p(R.string.UnknownError, vc.a0(mVar), null);
                    return;
                } else {
                    if (mVar.F != null) {
                        mVar.getMessagesController().loadFullUser(mVar.getUserConfig().getCurrentUser(), 0, true);
                    }
                    mVar.finishFragment();
                    return;
                }
            case 7:
                hg.y yVar = (hg.y) obj2;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) obj;
                ArrayList arrayList5 = yVar.f10478b;
                if (((TLObject) r62) instanceof TLRPC.TL_boolTrue) {
                    if (arrayList5.contains(tL_businessChatLink)) {
                        arrayList5.remove(tL_businessChatLink);
                        NotificationCenter.getInstance(yVar.f10477a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                    }
                    yVar.f();
                    return;
                }
                FileLog.e(new RuntimeException("Unexpected response from server!"));
                return;
            case 8:
                hg.y yVar2 = (hg.y) obj2;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = (String) r62;
                ConnectionsManager.getInstance(yVar2.f10477a).sendRequest(deletebusinesschatlink, new ai.v1(13, yVar2, (TL_account.TL_businessChatLink) obj));
                return;
            case 9:
                hg.l0.P((hg.l0) obj2, (TL_account.TL_connectedBot) r62, (TL_account.TL_businessBotRecipients) obj);
                return;
            case 10:
                hg.w0 w0Var = (hg.w0) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) r62;
                TLObject tLObject4 = (TLObject) obj;
                if (tL_error3 != null) {
                    w0Var.f10454a.a(0.0f);
                    vc.b0(tL_error3);
                    return;
                } else if (tLObject4 instanceof TLRPC.TL_boolFalse) {
                    w0Var.f10454a.a(0.0f);
                    org.telegram.messenger.w1.p(R.string.UnknownError, vc.a0(w0Var), null);
                    return;
                } else {
                    w0Var.finishFragment();
                    return;
                }
            case 11:
                hg.g1.U((hg.g1) obj2, (TLRPC.TL_error) r62, (TLObject) obj);
                return;
            case 12:
                hg.f2 f2Var = (hg.f2) obj2;
                TLObject tLObject5 = (TLObject) r62;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                ArrayList arrayList6 = f2Var.d;
                if (tLObject5 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList6.clear();
                    arrayList6.addAll(((TLRPC.TL_help_timezonesList) tLObject5).timezones);
                    SerializedData serializedData = new SerializedData(tLObject5.getObjectSize());
                    tLObject5.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                    NotificationCenter.getInstance(f2Var.f10287a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
                }
                f2Var.f10289c = true;
                f2Var.f10288b = false;
                return;
            case 13:
                u2.f0 f0Var = (u2.f0) obj;
                j2.f fVar = ((i2.v0) obj2).f10899c;
                e9.a1 i13 = ((e9.f0) r62).i();
                com.google.firebase.messaging.n nVar = fVar.d;
                b2.b1 b1Var = fVar.h;
                b1Var.getClass();
                nVar.getClass();
                nVar.f7332b = e9.i0.v(i13);
                if (!i13.isEmpty()) {
                    nVar.e = (u2.f0) i13.get(0);
                    f0Var.getClass();
                    nVar.f7334f = f0Var;
                }
                if (((u2.f0) nVar.d) == null) {
                    nVar.d = com.google.firebase.messaging.n.p(b1Var, (e9.i0) nVar.f7332b, (u2.f0) nVar.e, (b2.h1) nVar.f7331a);
                }
                nVar.H(b1Var.w0());
                return;
            case 14:
                Pair pair = (Pair) r62;
                ((i2.c1) obj2).f10630b.h.b(((Integer) pair.first).intValue(), (u2.f0) pair.second, (Exception) obj);
                return;
            case 15:
                w3 w3Var = (w3) obj2;
                o5 o5Var = (o5) obj;
                if (w3Var.f11715j4 == ((n70) r62)) {
                    w3Var.f11715j4 = null;
                    if (w3Var.C3 && w3Var.f11714i4 == o5Var && !o5Var.H.isEmpty()) {
                        w3Var.M2();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                w3 w3Var2 = (w3) obj2;
                ii.a aVar = (ii.a) r62;
                ii.a aVar2 = (ii.a) obj;
                ArrayList arrayList7 = w3Var2.f11726p4;
                j3 j3Var = w3Var2.f11721n3;
                if (j3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList7.indexOf(aVar);
                    int indexOf2 = arrayList7.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        for (int i14 = 0; i14 < arrayList7.size(); i14++) {
                            ii.a aVar3 = (ii.a) arrayList7.get(i14);
                            long j3 = aVar3.f11216t;
                            if (j3 != 0) {
                                j3Var.Y(i14, f6.l((TL_iv.RichText) w3Var2.f11719m3.get(Long.valueOf(j3))));
                            } else {
                                j3Var.Y(i14, d6.z(aVar3.f11201b));
                            }
                        }
                        j3Var.j0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ((w3) obj2).Z4((ii.a) r62, (String) obj);
                return;
            case 18:
                ii.a aVar4 = (ii.a) r62;
                c6 c6Var = (c6) obj;
                a6 a6Var = ((x5) obj2).f11767a.f11343y;
                if (a6Var != null) {
                    ((e3) a6Var).d(aVar4, c6Var.f11287a, c6Var.f11288b, c6Var.f11289c, c6Var.d, c6Var.e);
                    return;
                }
                return;
            case 19:
                ji.n nVar2 = (ji.n) obj2;
                ArrayList arrayList8 = (ArrayList) r62;
                ArrayList arrayList9 = (ArrayList) obj;
                nVar2.getClass();
                for (int i15 = 0; i15 < arrayList8.size(); i15++) {
                    ((View) arrayList8.get(i15)).setVisibility(0);
                }
                if (nVar2.A.removeAll(arrayList9)) {
                    for (int i16 = 0; i16 < arrayList9.size(); i16++) {
                        nVar2.d((s4.c1) arrayList9.get(i16));
                    }
                    nVar2.G();
                }
                nVar2.K.removeAll(arrayList8);
                return;
            case 20:
                ji.n nVar3 = (ji.n) obj2;
                View view = (View) r62;
                s4.c1 c1Var = (s4.c1) obj;
                nVar3.getClass();
                view.setVisibility(0);
                if (nVar3.A.remove(c1Var)) {
                    nVar3.d(c1Var);
                    nVar3.G();
                }
                nVar3.K.remove(view);
                return;
            case 21:
                String str4 = e2.d0.f7883a;
                j2.f fVar2 = ((i2.b0) ((k2.j) ((n4.y) obj2).f14995c)).f10621a.f10671s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1009, new j2.c(p5, (b2.s) r62, (i2.h) obj, 21));
                return;
            case 22:
                m4.w wVar = (m4.w) obj2;
                m4.r rVar = (m4.r) r62;
                KeyEvent keyEvent = (KeyEvent) obj;
                m4.a0 a0Var = wVar.f14712b;
                if (a0Var.i(rVar)) {
                    a0Var.b(keyEvent, false, false);
                } else {
                    m4.l0 l0Var = a0Var.h;
                    n4.a0 a0Var2 = rVar.f14667a;
                    a0Var2.getClass();
                    l0Var.getClass();
                    l0Var.H(1, new m4.b0(l0Var, 7), a0Var2, true);
                }
                wVar.f14711a = null;
                return;
            case 23:
                m4.a0 a0Var3 = (m4.a0) obj2;
                m4.u0 u0Var = (m4.u0) r62;
                m4.s sVar = (m4.s) obj;
                if (!a0Var3.j()) {
                    m4.k1 k1Var3 = a0Var3.f14466t;
                    u0Var.getClass();
                    w7.t.b(k1Var3, sVar);
                    return;
                }
                return;
            case 24:
                n2.j jVar = (n2.j) obj2;
                r62.b(jVar.f14905a, jVar.f14906b, (Exception) obj);
                return;
            case 25:
                ((VideoAds) obj2).lambda$show$3((oc) r62, (TLRPC.TL_sponsoredMessage) obj);
                return;
            case 26:
                ((VideoAds) obj2).lambda$show$5((oc) r62, (boolean[]) obj);
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
