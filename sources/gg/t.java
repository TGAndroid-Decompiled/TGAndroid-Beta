package gg;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
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
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rk;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.xc;
public final class t implements Runnable {
    public final int f9927a;
    public final Object f9928b;
    public final Object f9929c;
    public final Object d;

    public t(Object obj, Object obj2, Object obj3, int i10) {
        this.f9927a = i10;
        this.f9928b = obj;
        this.f9929c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        ArrayList arrayList;
        boolean z10 = false;
        switch (this.f9927a) {
            case 0:
                ((g0) this.f9928b).a((a0.i) this.d, (ArrayList) this.f9929c);
                return;
            case 1:
                k1 k1Var = (k1) this.f9928b;
                String str = (String) this.f9929c;
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
                    if (!k1Var.f9831o0 && (arrayList = k1Var.A0) != null && !arrayList.isEmpty()) {
                        k1Var.H();
                        qa0 qa0Var = k1Var.V;
                        if (k1Var.K() > 0) {
                            z10 = true;
                        }
                        qa0Var.a(z10);
                        k1Var.f9831o0 = true;
                    }
                    if (i10 != i11) {
                        k1Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                k1 k1Var2 = (k1) this.f9928b;
                a0.i iVar = (a0.i) this.d;
                k1Var2.f9832p0 = null;
                k1Var2.Y(iVar, (ArrayList) this.f9929c, true);
                return;
            case 3:
                c2 c2Var = (c2) this.f9928b;
                ArrayList arrayList4 = (ArrayList) this.f9929c;
                c2Var.f9703q = arrayList4;
                c2Var.f9704r = (HashMap) this.d;
                c2Var.f9705s = true;
                c2Var.f9690a.G(arrayList4);
                return;
            case 4:
                e2 e2Var = (e2) this.f9928b;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str2 = ((TLRPC.TL_messages_searchStickerSets) this.f9929c).f18440q;
                g2 g2Var = e2Var.f9728a;
                String str3 = g2Var.R;
                g51 g51Var = g2Var.e;
                if (str2.equals(str3)) {
                    e2Var.a();
                    g51Var.f24260b.h.getProgressDrawable().e = false;
                    g2Var.N = 0;
                    g51Var.b(true);
                    g2Var.E.addAll(tL_messages_foundStickerSets.sets);
                    g2Var.l();
                    return;
                }
                return;
            case 5:
                hg.c cVar = (hg.c) this.f9928b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f9929c;
                TLObject tLObject2 = (TLObject) this.d;
                if (tL_error != null) {
                    cVar.f10239a.a(0.0f);
                    xc.b0(tL_error);
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                    cVar.f10239a.a(0.0f);
                    rk.p(R.string.UnknownError, xc.a0(cVar), null);
                    return;
                } else {
                    cVar.finishFragment();
                    return;
                }
            case 6:
                hg.m mVar = (hg.m) this.f9928b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f9929c;
                TLObject tLObject3 = (TLObject) this.d;
                if (tL_error2 != null) {
                    mVar.f10355f.a(0.0f);
                    xc.b0(tL_error2);
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    mVar.f10355f.a(0.0f);
                    rk.p(R.string.UnknownError, xc.a0(mVar), null);
                    return;
                } else {
                    if (mVar.F != null) {
                        mVar.getMessagesController().loadFullUser(mVar.getUserConfig().getCurrentUser(), 0, true);
                    }
                    mVar.finishFragment();
                    return;
                }
            case 7:
                hg.y yVar = (hg.y) this.f9928b;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                ArrayList arrayList5 = yVar.f10484b;
                if (((TLObject) this.f9929c) instanceof TLRPC.TL_boolTrue) {
                    if (arrayList5.contains(tL_businessChatLink)) {
                        arrayList5.remove(tL_businessChatLink);
                        NotificationCenter.getInstance(yVar.f10483a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                    }
                    yVar.f();
                    return;
                }
                FileLog.e(new RuntimeException("Unexpected response from server!"));
                return;
            case 8:
                hg.y yVar2 = (hg.y) this.f9928b;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = (String) this.f9929c;
                ConnectionsManager.getInstance(yVar2.f10483a).sendRequest(deletebusinesschatlink, new ai.v1(13, yVar2, (TL_account.TL_businessChatLink) this.d));
                return;
            case 9:
                hg.l0.P((hg.l0) this.f9928b, (TL_account.TL_connectedBot) this.f9929c, (TL_account.TL_businessBotRecipients) this.d);
                return;
            case 10:
                hg.w0 w0Var = (hg.w0) this.f9928b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f9929c;
                TLObject tLObject4 = (TLObject) this.d;
                if (tL_error3 != null) {
                    w0Var.f10460a.a(0.0f);
                    xc.b0(tL_error3);
                    return;
                } else if (tLObject4 instanceof TLRPC.TL_boolFalse) {
                    w0Var.f10460a.a(0.0f);
                    rk.p(R.string.UnknownError, xc.a0(w0Var), null);
                    return;
                } else {
                    w0Var.finishFragment();
                    return;
                }
            case 11:
                hg.g1.U((hg.g1) this.f9928b, (TLRPC.TL_error) this.f9929c, (TLObject) this.d);
                return;
            case 12:
                hg.f2 f2Var = (hg.f2) this.f9928b;
                TLObject tLObject5 = (TLObject) this.f9929c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                ArrayList arrayList6 = f2Var.d;
                if (tLObject5 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList6.clear();
                    arrayList6.addAll(((TLRPC.TL_help_timezonesList) tLObject5).timezones);
                    SerializedData serializedData = new SerializedData(tLObject5.getObjectSize());
                    tLObject5.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                    NotificationCenter.getInstance(f2Var.f10293a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
                }
                f2Var.f10295c = true;
                f2Var.f10294b = false;
                return;
            case 13:
                u2.f0 f0Var = (u2.f0) this.d;
                j2.f fVar = ((i2.v0) this.f9928b).f10903c;
                e9.a1 i12 = ((e9.f0) this.f9929c).i();
                com.google.firebase.messaging.n nVar = fVar.d;
                b2.b1 b1Var = fVar.h;
                b1Var.getClass();
                nVar.getClass();
                nVar.f7331b = e9.i0.v(i12);
                if (!i12.isEmpty()) {
                    nVar.e = (u2.f0) i12.get(0);
                    f0Var.getClass();
                    nVar.f7333f = f0Var;
                }
                if (((u2.f0) nVar.d) == null) {
                    nVar.d = com.google.firebase.messaging.n.p(b1Var, (e9.i0) nVar.f7331b, (u2.f0) nVar.e, (b2.h1) nVar.f7330a);
                }
                nVar.H(b1Var.w0());
                return;
            case 14:
                Pair pair = (Pair) this.f9929c;
                ((i2.c1) this.f9928b).f10634b.h.b(((Integer) pair.first).intValue(), (u2.f0) pair.second, (Exception) this.d);
                return;
            case 15:
                w3 w3Var = (w3) this.f9928b;
                v70 v70Var = (v70) this.f9929c;
                o5 o5Var = (o5) this.d;
                if (w3Var.f11719j4 == v70Var) {
                    w3Var.f11719j4 = null;
                    if (w3Var.C3 && w3Var.f11718i4 == o5Var && !o5Var.H.isEmpty()) {
                        w3Var.N2();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                w3 w3Var2 = (w3) this.f9928b;
                ii.a aVar = (ii.a) this.f9929c;
                ii.a aVar2 = (ii.a) this.d;
                ArrayList arrayList7 = w3Var2.f11730p4;
                j3 j3Var = w3Var2.f11725n3;
                if (j3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList7.indexOf(aVar);
                    int indexOf2 = arrayList7.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        for (int i13 = 0; i13 < arrayList7.size(); i13++) {
                            ii.a aVar3 = (ii.a) arrayList7.get(i13);
                            long j3 = aVar3.f11220t;
                            if (j3 != 0) {
                                j3Var.Y(i13, f6.l((TL_iv.RichText) w3Var2.f11723m3.get(Long.valueOf(j3))));
                            } else {
                                j3Var.Y(i13, d6.z(aVar3.f11205b));
                            }
                        }
                        j3Var.j0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ((w3) this.f9928b).a5((ii.a) this.f9929c, (String) this.d);
                return;
            case 18:
                ii.a aVar4 = (ii.a) this.f9929c;
                c6 c6Var = (c6) this.d;
                a6 a6Var = ((x5) this.f9928b).f11771a.f11347y;
                if (a6Var != null) {
                    ((e3) a6Var).d(aVar4, c6Var.f11291a, c6Var.f11292b, c6Var.f11293c, c6Var.d, c6Var.e);
                    return;
                }
                return;
            case 19:
                ji.n nVar2 = (ji.n) this.f9928b;
                ArrayList arrayList8 = (ArrayList) this.f9929c;
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
                ji.n nVar3 = (ji.n) this.f9928b;
                View view = (View) this.f9929c;
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
                String str4 = e2.d0.f7888a;
                j2.f fVar2 = ((i2.b0) ((k2.j) ((n4.y) this.f9928b).f15218b)).f10625a.f10675s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1009, new j2.c(p5, (b2.s) this.f9929c, (i2.h) this.d, 21));
                return;
            case 22:
                ki.o oVar = (ki.o) this.f9928b;
                HandlerThread handlerThread = (HandlerThread) this.f9929c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                oVar.getClass();
                try {
                    oVar.d();
                    return;
                } finally {
                    handlerThread.quitSafely();
                    countDownLatch.countDown();
                }
            case 23:
                ki.o0 o0Var = (ki.o0) this.f9928b;
                ki.q qVar = (ki.q) this.f9929c;
                File file = (File) this.d;
                Handler handler = o0Var.h;
                try {
                    qVar.b(file);
                    o0Var.f();
                    long e = w7.k.e(file) / 1000;
                    ki.k kVar = o0Var.f13808l;
                    kVar.b("preview snapshot completed: durationMs=" + e + ", size=" + file.length() + ", elapsedMs=" + ki.o0.e(o0Var.I));
                    handler.post(new ki.a0(o0Var, e, 1));
                    return;
                } catch (Exception e7) {
                    handler.post(new ki.z(o0Var, e7, 3));
                    return;
                }
            case 24:
                File file2 = (File) this.d;
                ki.l0 l0Var = ((ki.o0) this.f9928b).d;
                long j10 = ((ki.k0) this.f9929c).f13762a;
                p01 p01Var = (p01) l0Var;
                synchronized (p01Var) {
                    if (!p01Var.d) {
                        p01Var.f27108c.put(Long.valueOf(j10), new n01(file2));
                        return;
                    }
                    return;
                }
            case 25:
                m4.w wVar = (m4.w) this.f9928b;
                m4.r rVar = (m4.r) this.f9929c;
                KeyEvent keyEvent = (KeyEvent) this.d;
                m4.a0 a0Var = wVar.f14928b;
                if (a0Var.i(rVar)) {
                    a0Var.b(keyEvent, false, false);
                } else {
                    m4.k0 k0Var = a0Var.h;
                    n4.a0 a0Var2 = rVar.f14886a;
                    a0Var2.getClass();
                    k0Var.getClass();
                    k0Var.H(1, new m4.b0(k0Var, 7), a0Var2, true);
                }
                wVar.f14927a = null;
                return;
            case 26:
                m4.a0 a0Var3 = (m4.a0) this.f9928b;
                m4.q0 q0Var = (m4.q0) this.f9929c;
                m4.s sVar = (m4.s) this.d;
                if (!a0Var3.j()) {
                    m4.j1 j1Var = a0Var3.f14687t;
                    q0Var.getClass();
                    w7.u.b(j1Var, sVar);
                    return;
                }
                return;
            case 27:
                n2.k kVar2 = (n2.k) this.f9928b;
                this.f9929c.b(kVar2.f15129a, kVar2.f15130b, (Exception) this.d);
                return;
            case 28:
                ((VideoAds) this.f9928b).lambda$show$3((pc) this.f9929c, (TLRPC.TL_sponsoredMessage) this.d);
                return;
            default:
                ((VideoAds) this.f9928b).lambda$show$5((pc) this.f9929c, (boolean[]) this.d);
                return;
        }
    }
}
