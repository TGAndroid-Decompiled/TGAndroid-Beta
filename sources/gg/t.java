package gg;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
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
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qk;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.q01;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.va0;
import org.telegram.ui.Components.xc;
public final class t implements Runnable {
    public final int f9914a;
    public final Object f9915b;
    public final Object f9916c;
    public final Object d;

    public t(Object obj, Object obj2, Object obj3, int i10) {
        this.f9914a = i10;
        this.f9915b = obj;
        this.f9916c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        ArrayList arrayList;
        boolean z10 = false;
        switch (this.f9914a) {
            case 0:
                ((g0) this.f9915b).a((a0.i) this.d, (ArrayList) this.f9916c);
                return;
            case 1:
                k1 k1Var = (k1) this.f9915b;
                String str = (String) this.f9916c;
                TLObject tLObject = (TLObject) this.d;
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
                    if (!k1Var.f9818o0 && (arrayList = k1Var.A0) != null && !arrayList.isEmpty()) {
                        k1Var.H();
                        va0 va0Var = k1Var.V;
                        if (k1Var.K() > 0) {
                            z10 = true;
                        }
                        va0Var.a(z10);
                        k1Var.f9818o0 = true;
                    }
                    if (i10 != i11) {
                        k1Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                k1 k1Var2 = (k1) this.f9915b;
                a0.i iVar = (a0.i) this.d;
                k1Var2.f9819p0 = null;
                k1Var2.Y(iVar, (ArrayList) this.f9916c, true);
                return;
            case 3:
                c2 c2Var = (c2) this.f9915b;
                ArrayList arrayList4 = (ArrayList) this.f9916c;
                c2Var.f9690q = arrayList4;
                c2Var.f9691r = (HashMap) this.d;
                c2Var.f9692s = true;
                c2Var.f9677a.F(arrayList4);
                return;
            case 4:
                e2 e2Var = (e2) this.f9915b;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str2 = ((TLRPC.TL_messages_searchStickerSets) this.f9916c).f18441q;
                g2 g2Var = e2Var.f9715a;
                String str3 = g2Var.R;
                h51 h51Var = g2Var.e;
                if (str2.equals(str3)) {
                    e2Var.a();
                    h51Var.f24733b.h.getProgressDrawable().e = false;
                    g2Var.N = 0;
                    h51Var.b(true);
                    g2Var.E.addAll(tL_messages_foundStickerSets.sets);
                    g2Var.l();
                    return;
                }
                return;
            case 5:
                hg.c cVar = (hg.c) this.f9915b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f9916c;
                TLObject tLObject2 = (TLObject) this.d;
                if (tL_error != null) {
                    cVar.f10226a.a(0.0f);
                    xc.b0(tL_error);
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                    cVar.f10226a.a(0.0f);
                    qk.p(R.string.UnknownError, xc.a0(cVar), null);
                    return;
                } else {
                    cVar.finishFragment();
                    return;
                }
            case 6:
                hg.m mVar = (hg.m) this.f9915b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f9916c;
                TLObject tLObject3 = (TLObject) this.d;
                if (tL_error2 != null) {
                    mVar.f10342f.a(0.0f);
                    xc.b0(tL_error2);
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    mVar.f10342f.a(0.0f);
                    qk.p(R.string.UnknownError, xc.a0(mVar), null);
                    return;
                } else {
                    if (mVar.F != null) {
                        mVar.getMessagesController().loadFullUser(mVar.getUserConfig().getCurrentUser(), 0, true);
                    }
                    mVar.finishFragment();
                    return;
                }
            case 7:
                hg.y yVar = (hg.y) this.f9915b;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                ArrayList arrayList5 = yVar.f10471b;
                if (((TLObject) this.f9916c) instanceof TLRPC.TL_boolTrue) {
                    if (arrayList5.contains(tL_businessChatLink)) {
                        arrayList5.remove(tL_businessChatLink);
                        NotificationCenter.getInstance(yVar.f10470a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                    }
                    yVar.f();
                    return;
                }
                FileLog.e(new RuntimeException("Unexpected response from server!"));
                return;
            case 8:
                hg.y yVar2 = (hg.y) this.f9915b;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = (String) this.f9916c;
                ConnectionsManager.getInstance(yVar2.f10470a).sendRequest(deletebusinesschatlink, new ai.v1(13, yVar2, (TL_account.TL_businessChatLink) this.d));
                return;
            case 9:
                hg.l0.P((hg.l0) this.f9915b, (TL_account.TL_connectedBot) this.f9916c, (TL_account.TL_businessBotRecipients) this.d);
                return;
            case 10:
                hg.w0 w0Var = (hg.w0) this.f9915b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f9916c;
                TLObject tLObject4 = (TLObject) this.d;
                if (tL_error3 != null) {
                    w0Var.f10447a.a(0.0f);
                    xc.b0(tL_error3);
                    return;
                } else if (tLObject4 instanceof TLRPC.TL_boolFalse) {
                    w0Var.f10447a.a(0.0f);
                    qk.p(R.string.UnknownError, xc.a0(w0Var), null);
                    return;
                } else {
                    w0Var.finishFragment();
                    return;
                }
            case 11:
                hg.g1.U((hg.g1) this.f9915b, (TLRPC.TL_error) this.f9916c, (TLObject) this.d);
                return;
            case 12:
                hg.f2 f2Var = (hg.f2) this.f9915b;
                TLObject tLObject5 = (TLObject) this.f9916c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                ArrayList arrayList6 = f2Var.d;
                if (tLObject5 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList6.clear();
                    arrayList6.addAll(((TLRPC.TL_help_timezonesList) tLObject5).timezones);
                    SerializedData serializedData = new SerializedData(tLObject5.getObjectSize());
                    tLObject5.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                    NotificationCenter.getInstance(f2Var.f10280a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
                }
                f2Var.f10282c = true;
                f2Var.f10281b = false;
                return;
            case 13:
                u2.f0 f0Var = (u2.f0) this.d;
                j2.f fVar = ((i2.w0) this.f9915b).f10898c;
                e9.a1 i12 = ((e9.f0) this.f9916c).i();
                com.google.firebase.messaging.n nVar = fVar.d;
                b2.b1 b1Var = fVar.h;
                b1Var.getClass();
                nVar.getClass();
                nVar.f7321b = e9.i0.v(i12);
                if (!i12.isEmpty()) {
                    nVar.e = (u2.f0) i12.get(0);
                    f0Var.getClass();
                    nVar.f7323f = f0Var;
                }
                if (((u2.f0) nVar.d) == null) {
                    nVar.d = com.google.firebase.messaging.n.p(b1Var, (e9.i0) nVar.f7321b, (u2.f0) nVar.e, (b2.h1) nVar.f7320a);
                }
                nVar.H(b1Var.w0());
                return;
            case 14:
                Pair pair = (Pair) this.f9916c;
                ((i2.d1) this.f9915b).f10629b.h.b(((Integer) pair.first).intValue(), (u2.f0) pair.second, (Exception) this.d);
                return;
            case 15:
                x3 x3Var = (x3) this.f9915b;
                a80 a80Var = (a80) this.f9916c;
                p5 p5Var = (p5) this.d;
                if (x3Var.f11735j4 == a80Var) {
                    x3Var.f11735j4 = null;
                    if (x3Var.C3 && x3Var.f11734i4 == p5Var && !p5Var.H.isEmpty()) {
                        x3Var.N2();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                x3 x3Var2 = (x3) this.f9915b;
                ii.a aVar = (ii.a) this.f9916c;
                ii.a aVar2 = (ii.a) this.d;
                ArrayList arrayList7 = x3Var2.f11746p4;
                k3 k3Var = x3Var2.f11741n3;
                if (k3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList7.indexOf(aVar);
                    int indexOf2 = arrayList7.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        for (int i13 = 0; i13 < arrayList7.size(); i13++) {
                            ii.a aVar3 = (ii.a) arrayList7.get(i13);
                            long j3 = aVar3.f11209t;
                            if (j3 != 0) {
                                k3Var.Y(i13, g6.l((TL_iv.RichText) x3Var2.f11739m3.get(Long.valueOf(j3))));
                            } else {
                                k3Var.Y(i13, e6.z(aVar3.f11194b));
                            }
                        }
                        k3Var.j0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ((x3) this.f9915b).a5((ii.a) this.f9916c, (String) this.d);
                return;
            case 18:
                ii.a aVar4 = (ii.a) this.f9916c;
                d6 d6Var = (d6) this.d;
                b6 b6Var = ((y5) this.f9915b).f11782a.f11358y;
                if (b6Var != null) {
                    ((f3) b6Var).d(aVar4, d6Var.f11300a, d6Var.f11301b, d6Var.f11302c, d6Var.d, d6Var.e);
                    return;
                }
                return;
            case 19:
                ji.n nVar2 = (ji.n) this.f9915b;
                ArrayList arrayList8 = (ArrayList) this.f9916c;
                ArrayList arrayList9 = (ArrayList) this.d;
                nVar2.getClass();
                for (int i14 = 0; i14 < arrayList8.size(); i14++) {
                    ((View) arrayList8.get(i14)).setVisibility(0);
                }
                if (nVar2.A.removeAll(arrayList9)) {
                    for (int i15 = 0; i15 < arrayList9.size(); i15++) {
                        nVar2.d((s4.c1) arrayList9.get(i15));
                    }
                    nVar2.G();
                }
                nVar2.K.removeAll(arrayList8);
                return;
            case 20:
                ji.n nVar3 = (ji.n) this.f9915b;
                View view = (View) this.f9916c;
                s4.c1 c1Var = (s4.c1) this.d;
                nVar3.getClass();
                view.setVisibility(0);
                if (nVar3.A.remove(c1Var)) {
                    nVar3.d(c1Var);
                    nVar3.G();
                }
                nVar3.K.remove(view);
                return;
            case 21:
                String str4 = e2.d0.f7872a;
                j2.f fVar2 = ((i2.c0) ((k2.j) ((n4.y) this.f9915b).f15258c)).f10619a.f10678s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1009, new j2.c(p5, (b2.s) this.f9916c, (i2.h) this.d, 21));
                return;
            case 22:
                ki.q qVar = (ki.q) this.f9915b;
                HandlerThread handlerThread = (HandlerThread) this.f9916c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                qVar.getClass();
                try {
                    qVar.f();
                    return;
                } finally {
                    handlerThread.quitSafely();
                    countDownLatch.countDown();
                }
            case 23:
                ki.s0 s0Var = (ki.s0) this.f9915b;
                ki.t tVar = (ki.t) this.f9916c;
                File file = (File) this.d;
                Handler handler = s0Var.h;
                try {
                    tVar.d(file);
                    s0Var.f();
                    long e = w7.k.e(file) / 1000;
                    ki.m mVar2 = s0Var.f13852l;
                    mVar2.b("preview snapshot completed: durationMs=" + e + ", size=" + file.length() + ", elapsedMs=" + ki.s0.e(s0Var.I));
                    handler.post(new ki.d0(s0Var, e, 1));
                    return;
                } catch (Exception e7) {
                    handler.post(new ki.c0(s0Var, e7, 3));
                    return;
                }
            case 24:
                File file2 = (File) this.d;
                ki.p0 p0Var = ((ki.s0) this.f9915b).d;
                long j10 = ((ki.o0) this.f9916c).f13801a;
                q01 q01Var = (q01) p0Var;
                synchronized (q01Var) {
                    if (!q01Var.d) {
                        q01Var.f27542c.put(Long.valueOf(j10), new o01(file2));
                        return;
                    }
                    return;
                }
            case 25:
                m4.w wVar = (m4.w) this.f9915b;
                m4.r rVar = (m4.r) this.f9916c;
                KeyEvent keyEvent = (KeyEvent) this.d;
                m4.a0 a0Var = wVar.f14970b;
                if (a0Var.i(rVar)) {
                    a0Var.b(keyEvent, false, false);
                } else {
                    m4.k0 k0Var = a0Var.h;
                    n4.a0 a0Var2 = rVar.f14944a;
                    a0Var2.getClass();
                    k0Var.getClass();
                    k0Var.H(1, new m4.b0(k0Var, 7), a0Var2, true);
                }
                wVar.f14969a = null;
                return;
            case 26:
                m4.a0 a0Var3 = (m4.a0) this.f9915b;
                m4.o0 o0Var = (m4.o0) this.f9916c;
                m4.s sVar = (m4.s) this.d;
                if (!a0Var3.j()) {
                    m4.e1 e1Var = a0Var3.f14734t;
                    o0Var.getClass();
                    w7.u.b(e1Var, sVar);
                    return;
                }
                return;
            case 27:
                n2.j jVar = (n2.j) this.f9915b;
                this.f9916c.b(jVar.f15168a, jVar.f15169b, (Exception) this.d);
                return;
            case 28:
                ((VideoAds) this.f9915b).lambda$show$3((qc) this.f9916c, (TLRPC.TL_sponsoredMessage) this.d);
                return;
            default:
                ((VideoAds) this.f9915b).lambda$show$5((qc) this.f9916c, (boolean[]) this.d);
                return;
        }
    }
}
