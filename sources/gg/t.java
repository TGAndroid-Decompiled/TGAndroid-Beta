package gg;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import ii.c6;
import ii.e6;
import ii.f3;
import ii.f6;
import ii.h6;
import ii.k3;
import ii.q5;
import ii.x3;
import ii.z5;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bi;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.x01;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.z01;
public final class t implements Runnable {
    public final int f10791a;
    public final Object f10792b;
    public final Object f10793c;
    public final Object d;

    public t(Object obj, Object obj2, Object obj3, int i10) {
        this.f10791a = i10;
        this.f10792b = obj;
        this.f10793c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        ArrayList arrayList;
        boolean z10 = false;
        switch (this.f10791a) {
            case 0:
                ((g0) this.f10792b).a((a0.i) this.d, (ArrayList) this.f10793c);
                return;
            case 1:
                k1 k1Var = (k1) this.f10792b;
                String str = (String) this.f10793c;
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
                    if (!k1Var.f10685o0 && (arrayList = k1Var.A0) != null && !arrayList.isEmpty()) {
                        k1Var.H();
                        wa0 wa0Var = k1Var.V;
                        if (k1Var.K() > 0) {
                            z10 = true;
                        }
                        wa0Var.a(z10);
                        k1Var.f10685o0 = true;
                    }
                    if (i10 != i11) {
                        k1Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                k1 k1Var2 = (k1) this.f10792b;
                a0.i iVar = (a0.i) this.d;
                k1Var2.f10686p0 = null;
                k1Var2.Y(iVar, (ArrayList) this.f10793c, true);
                return;
            case 3:
                c2 c2Var = (c2) this.f10792b;
                ArrayList arrayList4 = (ArrayList) this.f10793c;
                c2Var.f10546q = arrayList4;
                c2Var.f10547r = (HashMap) this.d;
                c2Var.f10548s = true;
                c2Var.f10532a.C(arrayList4);
                return;
            case 4:
                e2 e2Var = (e2) this.f10792b;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str2 = ((TLRPC.TL_messages_searchStickerSets) this.f10793c).f20154q;
                g2 g2Var = e2Var.f10572a;
                String str3 = g2Var.R;
                q51 q51Var = g2Var.f10593e;
                if (str2.equals(str3)) {
                    e2Var.a();
                    q51Var.f29932b.h.getProgressDrawable().f27463e = false;
                    g2Var.N = 0;
                    q51Var.b(true);
                    g2Var.E.addAll(tL_messages_foundStickerSets.sets);
                    g2Var.l();
                    return;
                }
                return;
            case 5:
                hg.d dVar = (hg.d) this.f10792b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f10793c;
                TLObject tLObject2 = (TLObject) this.d;
                if (tL_error != null) {
                    dVar.f11136a.a(0.0f);
                    yc.b0(tL_error);
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                    dVar.f11136a.a(0.0f);
                    bi.o(R.string.UnknownError, yc.a0(dVar), null);
                    return;
                } else {
                    dVar.finishFragment();
                    return;
                }
            case 6:
                hg.n nVar = (hg.n) this.f10792b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f10793c;
                TLObject tLObject3 = (TLObject) this.d;
                if (tL_error2 != null) {
                    nVar.f11268f.a(0.0f);
                    yc.b0(tL_error2);
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    nVar.f11268f.a(0.0f);
                    bi.o(R.string.UnknownError, yc.a0(nVar), null);
                    return;
                } else {
                    if (nVar.F != null) {
                        nVar.getMessagesController().loadFullUser(nVar.getUserConfig().getCurrentUser(), 0, true);
                    }
                    nVar.finishFragment();
                    return;
                }
            case 7:
                hg.z zVar = (hg.z) this.f10792b;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                ArrayList arrayList5 = zVar.f11415b;
                if (((TLObject) this.f10793c) instanceof TLRPC.TL_boolTrue) {
                    if (arrayList5.contains(tL_businessChatLink)) {
                        arrayList5.remove(tL_businessChatLink);
                        NotificationCenter.getInstance(zVar.f11414a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                    }
                    zVar.f();
                    return;
                }
                FileLog.e(new RuntimeException("Unexpected response from server!"));
                return;
            case 8:
                hg.z zVar2 = (hg.z) this.f10792b;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = (String) this.f10793c;
                ConnectionsManager.getInstance(zVar2.f11414a).sendRequest(deletebusinesschatlink, new ai.v1(13, zVar2, (TL_account.TL_businessChatLink) this.d));
                return;
            case 9:
                hg.l0.N((hg.l0) this.f10792b, (TL_account.TL_connectedBot) this.f10793c, (TL_account.TL_businessBotRecipients) this.d);
                return;
            case 10:
                hg.w0 w0Var = (hg.w0) this.f10792b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f10793c;
                TLObject tLObject4 = (TLObject) this.d;
                if (tL_error3 != null) {
                    w0Var.f11377a.a(0.0f);
                    yc.b0(tL_error3);
                    return;
                } else if (tLObject4 instanceof TLRPC.TL_boolFalse) {
                    w0Var.f11377a.a(0.0f);
                    bi.o(R.string.UnknownError, yc.a0(w0Var), null);
                    return;
                } else {
                    w0Var.finishFragment();
                    return;
                }
            case 11:
                hg.g1.S((hg.g1) this.f10792b, (TLRPC.TL_error) this.f10793c, (TLObject) this.d);
                return;
            case 12:
                hg.f2 f2Var = (hg.f2) this.f10792b;
                TLObject tLObject5 = (TLObject) this.f10793c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                ArrayList arrayList6 = f2Var.d;
                if (tLObject5 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList6.clear();
                    arrayList6.addAll(((TLRPC.TL_help_timezonesList) tLObject5).timezones);
                    SerializedData serializedData = new SerializedData(tLObject5.getObjectSize());
                    tLObject5.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                    NotificationCenter.getInstance(f2Var.f11186a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
                }
                f2Var.f11188c = true;
                f2Var.f11187b = false;
                return;
            case 13:
                u2.f0 f0Var = (u2.f0) this.d;
                j2.f fVar = ((i2.w0) this.f10792b).f11870c;
                e9.a1 i12 = ((e9.f0) this.f10793c).i();
                com.google.firebase.messaging.n nVar2 = fVar.d;
                b2.b1 b1Var = fVar.h;
                b1Var.getClass();
                nVar2.getClass();
                nVar2.f7906b = e9.i0.v(i12);
                if (!i12.isEmpty()) {
                    nVar2.f7908e = (u2.f0) i12.get(0);
                    f0Var.getClass();
                    nVar2.f7909f = f0Var;
                }
                if (((u2.f0) nVar2.d) == null) {
                    nVar2.d = com.google.firebase.messaging.n.p(b1Var, (e9.i0) nVar2.f7906b, (u2.f0) nVar2.f7908e, (b2.h1) nVar2.f7905a);
                }
                nVar2.G(b1Var.w0());
                return;
            case 14:
                Pair pair = (Pair) this.f10793c;
                ((i2.d1) this.f10792b).f11581b.h.b(((Integer) pair.first).intValue(), (u2.f0) pair.second, (Exception) this.d);
                return;
            case 15:
                x3 x3Var = (x3) this.f10792b;
                b80 b80Var = (b80) this.f10793c;
                q5 q5Var = (q5) this.d;
                if (x3Var.f12775q4 == b80Var) {
                    x3Var.f12775q4 = null;
                    if (x3Var.J3 && x3Var.f12773p4 == q5Var && !q5Var.H.isEmpty()) {
                        x3Var.O2();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                x3 x3Var2 = (x3) this.f10792b;
                ii.a aVar = (ii.a) this.f10793c;
                ii.a aVar2 = (ii.a) this.d;
                ArrayList arrayList7 = x3Var2.f12787w4;
                k3 k3Var = x3Var2.f12782u3;
                if (k3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList7.indexOf(aVar);
                    int indexOf2 = arrayList7.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        for (int i13 = 0; i13 < arrayList7.size(); i13++) {
                            ii.a aVar3 = (ii.a) arrayList7.get(i13);
                            long j3 = aVar3.f12203t;
                            if (j3 != 0) {
                                k3Var.Y(i13, h6.l((TL_iv.RichText) x3Var2.f12780t3.get(Long.valueOf(j3))));
                            } else {
                                k3Var.Y(i13, f6.z(aVar3.f12187b));
                            }
                        }
                        k3Var.j0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ((x3) this.f10792b).b5((ii.a) this.f10793c, (String) this.d);
                return;
            case 18:
                ii.a aVar4 = (ii.a) this.f10793c;
                e6 e6Var = (e6) this.d;
                c6 c6Var = ((z5) this.f10792b).f12836a.f12378y;
                if (c6Var != null) {
                    ((f3) c6Var).d(aVar4, e6Var.f12350a, e6Var.f12351b, e6Var.f12352c, e6Var.d, e6Var.f12353e);
                    return;
                }
                return;
            case 19:
                ji.n nVar3 = (ji.n) this.f10792b;
                ArrayList arrayList8 = (ArrayList) this.f10793c;
                ArrayList arrayList9 = (ArrayList) this.d;
                nVar3.getClass();
                for (int i14 = 0; i14 < arrayList8.size(); i14++) {
                    ((View) arrayList8.get(i14)).setVisibility(0);
                }
                if (nVar3.A.removeAll(arrayList9)) {
                    for (int i15 = 0; i15 < arrayList9.size(); i15++) {
                        nVar3.d((s4.c1) arrayList9.get(i15));
                    }
                    nVar3.G();
                }
                nVar3.K.removeAll(arrayList8);
                return;
            case 20:
                ji.n nVar4 = (ji.n) this.f10792b;
                View view = (View) this.f10793c;
                s4.c1 c1Var = (s4.c1) this.d;
                nVar4.getClass();
                view.setVisibility(0);
                if (nVar4.A.remove(c1Var)) {
                    nVar4.d(c1Var);
                    nVar4.G();
                }
                nVar4.K.remove(view);
                return;
            case 21:
                String str4 = e2.d0.f8538a;
                j2.f fVar2 = ((i2.c0) ((k2.k) ((n4.y) this.f10792b).f16645c)).f11570a.f11633s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1009, new j2.c(p5, (b2.s) this.f10793c, (i2.h) this.d, 21));
                return;
            case 22:
                ki.q qVar = (ki.q) this.f10792b;
                HandlerThread handlerThread = (HandlerThread) this.f10793c;
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
                ki.s0 s0Var = (ki.s0) this.f10792b;
                ki.t tVar = (ki.t) this.f10793c;
                File file = (File) this.d;
                Handler handler = s0Var.f15050i;
                try {
                    tVar.c(file);
                    s0Var.g();
                    long e7 = w7.k.e(file) / 1000;
                    ki.m mVar = s0Var.f15054m;
                    mVar.b("preview snapshot completed: durationMs=" + e7 + ", size=" + file.length() + ", elapsedMs=" + ki.s0.f(s0Var.J));
                    handler.post(new ki.d0(s0Var, e7, 1));
                    return;
                } catch (Exception e10) {
                    handler.post(new ki.c0(s0Var, e10, 3));
                    return;
                }
            case 24:
                File file2 = (File) this.d;
                ki.p0 p0Var = ((ki.s0) this.f10792b).f15047e;
                long j10 = ((ki.o0) this.f10793c).f14998a;
                z01 z01Var = (z01) p0Var;
                synchronized (z01Var) {
                    if (!z01Var.d) {
                        z01Var.f33334c.put(Long.valueOf(j10), new x01(file2));
                        return;
                    }
                    return;
                }
            case 25:
                m4.w wVar = (m4.w) this.f10792b;
                m4.r rVar = (m4.r) this.f10793c;
                KeyEvent keyEvent = (KeyEvent) this.d;
                m4.a0 a0Var = wVar.f16310b;
                if (a0Var.i(rVar)) {
                    a0Var.b(keyEvent, false, false);
                } else {
                    m4.k0 k0Var = a0Var.h;
                    n4.a0 a0Var2 = rVar.f16282a;
                    a0Var2.getClass();
                    k0Var.getClass();
                    k0Var.H(1, new m4.b0(k0Var, 7), a0Var2, true);
                }
                wVar.f16309a = null;
                return;
            case 26:
                m4.a0 a0Var3 = (m4.a0) this.f10792b;
                m4.o0 o0Var = (m4.o0) this.f10793c;
                m4.s sVar = (m4.s) this.d;
                if (!a0Var3.j()) {
                    m4.e1 e1Var = a0Var3.f16057t;
                    o0Var.getClass();
                    w7.u.b(e1Var, sVar);
                    return;
                }
                return;
            case 27:
                n2.k kVar = (n2.k) this.f10792b;
                this.f10793c.b(kVar.f16548a, kVar.f16549b, (Exception) this.d);
                return;
            case 28:
                ((VideoAds) this.f10792b).lambda$show$3((rc) this.f10793c, (TLRPC.TL_sponsoredMessage) this.d);
                return;
            default:
                ((VideoAds) this.f10792b).lambda$show$5((rc) this.f10793c, (boolean[]) this.d);
                return;
        }
    }
}
