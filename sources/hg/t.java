package hg;

import android.content.SharedPreferences;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import ji.a6;
import ji.d3;
import ji.d6;
import ji.f6;
import ji.g6;
import ji.i3;
import ji.i6;
import ji.s5;
import ji.v3;
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
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.yc;
public final class t implements Runnable {
    public final int f11275a;
    public final Object f11276b;
    public final Object f11277c;
    public final Object d;

    public t(Object obj, Object obj2, Object obj3, int i10) {
        this.f11275a = i10;
        this.f11276b = obj;
        this.f11277c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        ArrayList arrayList;
        int i12 = this.f11275a;
        boolean z10 = false;
        Object obj = this.d;
        ?? r62 = this.f11277c;
        Object obj2 = this.f11276b;
        switch (i12) {
            case 0:
                ((g0) obj2).b((a0.i) obj, (ArrayList) r62);
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
                    if (!k1Var.f11171o0 && (arrayList = k1Var.A0) != null && !arrayList.isEmpty()) {
                        k1Var.H();
                        ja0 ja0Var = k1Var.V;
                        if (k1Var.K() > 0) {
                            z10 = true;
                        }
                        ja0Var.a(z10);
                        k1Var.f11171o0 = true;
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
                k1Var2.f11172p0 = null;
                k1Var2.Y((a0.i) obj, (ArrayList) r62, true);
                return;
            case 3:
                b2 b2Var = (b2) obj2;
                ArrayList arrayList4 = (ArrayList) r62;
                b2Var.f11019q = arrayList4;
                b2Var.f11020r = (HashMap) obj;
                b2Var.f11021s = true;
                b2Var.f11005a.Y(arrayList4);
                return;
            case 4:
                d2 d2Var = (d2) obj2;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) obj;
                String str2 = ((TLRPC.TL_messages_searchStickerSets) r62).f20008q;
                f2 f2Var = d2Var.f11046a;
                String str3 = f2Var.R;
                r41 r41Var = f2Var.f11071e;
                if (str2.equals(str3)) {
                    d2Var.a();
                    r41Var.f29958b.h.getProgressDrawable().f25776e = false;
                    f2Var.N = 0;
                    r41Var.b(true);
                    f2Var.E.addAll(tL_messages_foundStickerSets.sets);
                    f2Var.l();
                    return;
                }
                return;
            case 5:
                u2.f0 f0Var = (u2.f0) obj;
                j2.f fVar = ((i2.v0) obj2).f11786c;
                e9.a1 i13 = ((e9.f0) r62).i();
                com.google.firebase.messaging.n nVar = fVar.d;
                b2.b1 b1Var = fVar.h;
                b1Var.getClass();
                nVar.getClass();
                nVar.f6402b = e9.i0.v(i13);
                if (!i13.isEmpty()) {
                    nVar.f6404e = (u2.f0) i13.get(0);
                    f0Var.getClass();
                    nVar.f6405f = f0Var;
                }
                if (((u2.f0) nVar.d) == null) {
                    nVar.d = com.google.firebase.messaging.n.p(b1Var, (e9.i0) nVar.f6402b, (u2.f0) nVar.f6404e, (b2.h1) nVar.f6401a);
                }
                nVar.H(b1Var.w0());
                return;
            case 6:
                Pair pair = (Pair) r62;
                ((i2.c1) obj2).f11499b.h.b(((Integer) pair.first).intValue(), (u2.f0) pair.second, (Exception) obj);
                return;
            case 7:
                ig.c cVar = (ig.c) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) r62;
                TLObject tLObject2 = (TLObject) obj;
                if (tL_error != null) {
                    cVar.f12037a.a(0.0f);
                    yc.b0(tL_error);
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                    cVar.f12037a.a(0.0f);
                    org.telegram.messenger.w1.p(R.string.UnknownError, yc.a0(cVar), null);
                    return;
                } else {
                    cVar.finishFragment();
                    return;
                }
            case 8:
                ig.m mVar = (ig.m) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) r62;
                TLObject tLObject3 = (TLObject) obj;
                if (tL_error2 != null) {
                    mVar.f12168e.a(0.0f);
                    yc.b0(tL_error2);
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    mVar.f12168e.a(0.0f);
                    org.telegram.messenger.w1.p(R.string.UnknownError, yc.a0(mVar), null);
                    return;
                } else {
                    if (mVar.E != null) {
                        mVar.getMessagesController().loadFullUser(mVar.getUserConfig().getCurrentUser(), 0, true);
                    }
                    mVar.finishFragment();
                    return;
                }
            case 9:
                ig.y yVar = (ig.y) obj2;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) obj;
                ArrayList arrayList5 = yVar.f12310b;
                if (((TLObject) r62) instanceof TLRPC.TL_boolTrue) {
                    if (arrayList5.contains(tL_businessChatLink)) {
                        arrayList5.remove(tL_businessChatLink);
                        NotificationCenter.getInstance(yVar.f12309a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                    }
                    yVar.f();
                    return;
                }
                FileLog.e(new RuntimeException("Unexpected response from server!"));
                return;
            case 10:
                ig.y yVar2 = (ig.y) obj2;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = (String) r62;
                ConnectionsManager.getInstance(yVar2.f12309a).sendRequest(deletebusinesschatlink, new bi.m1(13, yVar2, (TL_account.TL_businessChatLink) obj));
                return;
            case 11:
                ig.k0.P((ig.k0) obj2, (TL_account.TL_connectedBot) r62, (TL_account.TL_businessBotRecipients) obj);
                return;
            case 12:
                ig.w0 w0Var = (ig.w0) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) r62;
                TLObject tLObject4 = (TLObject) obj;
                if (tL_error3 != null) {
                    w0Var.f12283a.a(0.0f);
                    yc.b0(tL_error3);
                    return;
                } else if (tLObject4 instanceof TLRPC.TL_boolFalse) {
                    w0Var.f12283a.a(0.0f);
                    org.telegram.messenger.w1.p(R.string.UnknownError, yc.a0(w0Var), null);
                    return;
                } else {
                    w0Var.finishFragment();
                    return;
                }
            case 13:
                ig.g1.U((ig.g1) obj2, (TLRPC.TL_error) r62, (TLObject) obj);
                return;
            case 14:
                ig.f2 f2Var2 = (ig.f2) obj2;
                TLObject tLObject5 = (TLObject) r62;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                ArrayList arrayList6 = f2Var2.d;
                if (tLObject5 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList6.clear();
                    arrayList6.addAll(((TLRPC.TL_help_timezonesList) tLObject5).timezones);
                    SerializedData serializedData = new SerializedData(tLObject5.getObjectSize());
                    tLObject5.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                    NotificationCenter.getInstance(f2Var2.f12097a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
                }
                f2Var2.f12099c = true;
                f2Var2.f12098b = false;
                return;
            case 15:
                v3 v3Var = (v3) obj2;
                s5 s5Var = (s5) obj;
                if (v3Var.f14279j4 == ((n70) r62)) {
                    v3Var.f14279j4 = null;
                    if (v3Var.C3 && v3Var.f14278i4 == s5Var && !s5Var.H.isEmpty()) {
                        v3Var.L2();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                v3 v3Var2 = (v3) obj2;
                ji.a aVar = (ji.a) r62;
                ji.a aVar2 = (ji.a) obj;
                ArrayList arrayList7 = v3Var2.f14290p4;
                i3 i3Var = v3Var2.f14285n3;
                if (i3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList7.indexOf(aVar);
                    int indexOf2 = arrayList7.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        for (int i14 = 0; i14 < arrayList7.size(); i14++) {
                            ji.a aVar3 = (ji.a) arrayList7.get(i14);
                            long j3 = aVar3.f13774t;
                            if (j3 != 0) {
                                i3Var.Y(i14, i6.l((TL_iv.RichText) v3Var2.f14283m3.get(Long.valueOf(j3))));
                            } else {
                                i3Var.Y(i14, g6.z(aVar3.f13758b));
                            }
                        }
                        i3Var.j0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ((v3) obj2).Y4((String) obj, (ji.a) r62);
                return;
            case 18:
                ji.a aVar4 = (ji.a) r62;
                f6 f6Var = (f6) obj;
                d6 d6Var = ((a6) obj2).f13804a.f13965y;
                if (d6Var != null) {
                    ((d3) d6Var).d(aVar4, f6Var.f13928a, f6Var.f13929b, f6Var.f13930c, f6Var.d, f6Var.f13931e);
                    return;
                }
                return;
            case 19:
                String str4 = e2.d0.f8765a;
                j2.f fVar2 = ((i2.c0) ((k2.j) ((n4.y) obj2).f16524c)).f11497a.f11559s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1009, new j2.c(p5, (b2.s) r62, (i2.i) obj, 19));
                return;
            case 20:
                ki.o oVar = (ki.o) obj2;
                ArrayList arrayList8 = (ArrayList) r62;
                ArrayList arrayList9 = (ArrayList) obj;
                oVar.getClass();
                for (int i15 = 0; i15 < arrayList8.size(); i15++) {
                    ((View) arrayList8.get(i15)).setVisibility(0);
                }
                if (oVar.A.removeAll(arrayList9)) {
                    for (int i16 = 0; i16 < arrayList9.size(); i16++) {
                        oVar.d((s4.c1) arrayList9.get(i16));
                    }
                    oVar.G();
                }
                oVar.K.removeAll(arrayList8);
                return;
            case 21:
                ki.o oVar2 = (ki.o) obj2;
                View view = (View) r62;
                s4.c1 c1Var = (s4.c1) obj;
                oVar2.getClass();
                view.setVisibility(0);
                if (oVar2.A.remove(c1Var)) {
                    oVar2.d(c1Var);
                    oVar2.G();
                }
                oVar2.K.remove(view);
                return;
            case 22:
                m4.w wVar = (m4.w) obj2;
                m4.r rVar = (m4.r) r62;
                KeyEvent keyEvent = (KeyEvent) obj;
                m4.a0 a0Var = wVar.f16127b;
                if (a0Var.i(rVar)) {
                    a0Var.b(keyEvent, false, false);
                } else {
                    m4.k0 k0Var = a0Var.h;
                    n4.a0 a0Var2 = rVar.f16085a;
                    a0Var2.getClass();
                    k0Var.getClass();
                    k0Var.H(1, new m4.b0(k0Var, 7), a0Var2, true);
                }
                wVar.f16126a = null;
                return;
            case 23:
                m4.a0 a0Var3 = (m4.a0) obj2;
                m4.t0 t0Var = (m4.t0) r62;
                m4.s sVar = (m4.s) obj;
                if (!a0Var3.j()) {
                    m4.j1 j1Var = a0Var3.f15870t;
                    t0Var.getClass();
                    w7.t.b(j1Var, sVar);
                    return;
                }
                return;
            case 24:
                n2.j jVar = (n2.j) obj2;
                r62.b(jVar.f16427a, jVar.f16428b, (Exception) obj);
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
