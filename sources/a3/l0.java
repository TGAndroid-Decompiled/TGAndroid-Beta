package a3;

import ag.h2;
import ag.j1;
import ag.n3;
import ag.s0;
import ag.v1;
import android.content.SharedPreferences;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Handler;
import android.text.SpannableString;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import androidx.car.app.IOnDoneCallback;
import b2.f1;
import b2.l1;
import bi.d4;
import bi.i6;
import bi.k6;
import bi.m3;
import bi.n6;
import bi.p6;
import bi.q3;
import bi.q6;
import bi.s6;
import bi.z5;
import e9.x1;
import i2.a1;
import i2.i1;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import m4.t1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i20;
import org.telegram.messenger.m5;
import org.telegram.messenger.ne;
import org.telegram.messenger.x0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import s4.c1;
import v7.p8;
public final class l0 implements Runnable {
    public final int f142a;
    public final Object f143b;
    public final Object f144c;
    public final Object d;

    public l0(Object obj, Object obj2, Object obj3, int i10) {
        this.f142a = i10;
        this.f143b = obj;
        this.f144c = obj2;
        this.d = obj3;
    }

    private final void a() {
        androidx.biometric.s sVar = (androidx.biometric.s) this.f143b;
        v7.t tVar = (v7.t) this.f144c;
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
        try {
            androidx.emoji2.text.r a2 = v7.s.a(sVar.f1116a);
            if (a2 != null) {
                androidx.emoji2.text.q qVar = (androidx.emoji2.text.q) ((androidx.emoji2.text.k) a2.f1383b);
                synchronized (qVar.d) {
                    qVar.f1408f = threadPoolExecutor;
                }
                ((androidx.emoji2.text.k) a2.f1383b).a(new androidx.emoji2.text.m(tVar, threadPoolExecutor));
                return;
            }
            throw new RuntimeException("EmojiCompat font provider not available on this device.");
        } catch (Throwable th2) {
            tVar.a(th2);
            threadPoolExecutor.shutdown();
        }
    }

    private final void b() {
        ji.k kVar = (ji.k) this.f143b;
        WebView webView = (WebView) this.f144c;
        b5.h hVar = (b5.h) this.d;
        synchronized (kVar.f10453a) {
            if (!kVar.f10470u && kVar.f10464o == webView && kVar.f10465p == hVar && !kVar.f10467r) {
                if (kVar.f10468s) {
                    f8.d("WEB proxy: Base64 bridge installation timed out again; transport stopped");
                    kVar.q();
                    return;
                }
                kVar.f10468s = true;
                f8.d("WEB proxy: Base64 bridge installation timed out; retrying once");
                kVar.h();
            }
        }
    }

    private final void c() {
        AudioTrack audioTrack = (AudioTrack) this.f143b;
        Handler handler = (Handler) this.f144c;
        e2.r rVar = (e2.r) this.d;
        try {
            audioTrack.flush();
            audioTrack.release();
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new gg.c(rVar, 20));
            }
            synchronized (k2.j0.f10673t) {
                try {
                    int i10 = k2.j0.v - 1;
                    k2.j0.v = i10;
                    if (i10 == 0) {
                        ScheduledExecutorService scheduledExecutorService = k2.j0.f10674u;
                        scheduledExecutorService.getClass();
                        scheduledExecutorService.shutdown();
                        k2.j0.f10674u = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new gg.c(rVar, 20));
            }
            synchronized (k2.j0.f10673t) {
                try {
                    int i11 = k2.j0.v - 1;
                    k2.j0.v = i11;
                    if (i11 == 0) {
                        ScheduledExecutorService scheduledExecutorService2 = k2.j0.f10674u;
                        scheduledExecutorService2.getClass();
                        scheduledExecutorService2.shutdown();
                        k2.j0.f10674u = null;
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    @Override
    public final void run() {
        Exception runtimeException;
        byte[] bArr = null;
        boolean z10 = true;
        int i10 = 0;
        switch (this.f142a) {
            case 0:
                b2.x xVar = (b2.x) this.f144c;
                String str = e2.l0.f6165a;
                i2.i0 i0Var = ((i2.c0) ((m0) ((hf.b) this.f143b).f7659c)).f7822a;
                i0Var.S = xVar;
                j2.g gVar = i0Var.f7928s;
                j2.a U = gVar.U();
                gVar.V(U, 1017, new j2.c(U, xVar, (i2.e) this.d, 29));
                return;
            case 1:
                ag.f fVar = (ag.f) this.f143b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f144c;
                TLObject tLObject = (TLObject) this.d;
                if (tL_error != null) {
                    fVar.f503a.b(false);
                    cc.d0(tL_error);
                    return;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    fVar.f503a.b(false);
                    m5.o(null, 2131743904, cc.a0(fVar), null);
                    return;
                } else {
                    fVar.finishFragment();
                    return;
                }
            case 2:
                ag.w wVar = (ag.w) this.f143b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f144c;
                TLObject tLObject2 = (TLObject) this.d;
                if (tL_error2 != null) {
                    wVar.f761f.b(false);
                    cc.d0(tL_error2);
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                    wVar.f761f.b(false);
                    m5.o(null, 2131743904, cc.a0(wVar), null);
                    return;
                } else {
                    if (wVar.E != null) {
                        wVar.getMessagesController().U2(wVar.getUserConfig().f(), 0, true, null);
                    }
                    wVar.finishFragment();
                    return;
                }
            case 3:
                s0 s0Var = (s0) this.f143b;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                ArrayList arrayList = s0Var.f702b;
                if (((TLObject) this.f144c) instanceof TLRPC.TL_boolTrue) {
                    if (arrayList.contains(tL_businessChatLink)) {
                        arrayList.remove(tL_businessChatLink);
                        at.f(s0Var.f701a).k(125, new Object[0]);
                    }
                    s0Var.f();
                    return;
                }
                f8.g(new RuntimeException("Unexpected response from server!"), true);
                return;
            case 4:
                s0 s0Var2 = (s0) this.f143b;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = (String) this.f144c;
                ConnectionsManager.getInstance(s0Var2.f701a).sendRequest(deletebusinesschatlink, new ag.k0(0, s0Var2, (TL_account.TL_businessChatLink) this.d));
                return;
            case 5:
                j1 j1Var = (j1) this.f143b;
                TL_account.TL_businessBotRecipients tL_businessBotRecipients = (TL_account.TL_businessBotRecipients) this.d;
                ag.k.a(j1Var.f21584a).b();
                j1Var.dismiss();
                ((TL_account.TL_connectedBot) this.f144c).recipients = tL_businessBotRecipients;
                k2 T = LaunchActivity.T();
                if (T != null) {
                    cc.a0(T).Q(2131623989, 36, dd.a0(null, null, 2131752784, i20.p(j1Var.Q1))).j();
                    return;
                }
                return;
            case 6:
                v1 v1Var = (v1) this.f143b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f144c;
                TLObject tLObject3 = (TLObject) this.d;
                if (tL_error3 != null) {
                    v1Var.f748a.b(false);
                    cc.d0(tL_error3);
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    v1Var.f748a.b(false);
                    m5.o(null, 2131743904, cc.a0(v1Var), null);
                    return;
                } else {
                    v1Var.finishFragment();
                    return;
                }
            case 7:
                h2.Z((h2) this.f143b, (TLRPC.TL_error) this.f144c, (TLObject) this.d);
                return;
            case 8:
                n3 n3Var = (n3) this.f143b;
                TLObject tLObject4 = (TLObject) this.f144c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                ArrayList arrayList2 = n3Var.d;
                if (tLObject4 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.TL_help_timezonesList) tLObject4).timezones);
                    SerializedData serializedData = new SerializedData(tLObject4.getObjectSize());
                    tLObject4.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.f(serializedData.toByteArray())).apply();
                    at.f(n3Var.f656a).k(214, new Object[0]);
                }
                n3Var.f658c = true;
                n3Var.f657b = false;
                return;
            case 9:
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) this.f143b;
                androidx.car.app.utils.b bVar = (androidx.car.app.utils.b) this.f144c;
                String str2 = (String) this.d;
                if (oVar != null) {
                    try {
                        if (((androidx.lifecycle.v) oVar).f1659c.compareTo(androidx.lifecycle.n.f1640c) < 0) {
                            z10 = false;
                        }
                        if (z10) {
                            bVar.a();
                            return;
                        }
                    } catch (w.f e) {
                        Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str2), e);
                        return;
                    }
                }
                Log.w("CarApp.Dispatch", "Lifecycle is not at least created when dispatching " + bVar);
                return;
            case 10:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.f143b;
                String str3 = (String) this.f144c;
                try {
                    androidx.car.app.utils.h.d(str3.concat(" onSuccess"), new androidx.car.app.utils.a(iOnDoneCallback, ((androidx.car.app.utils.b) this.d).a(), str3, 0));
                    return;
                } catch (RuntimeException e7) {
                    androidx.car.app.utils.h.f(iOnDoneCallback, str3, e7);
                    throw new RuntimeException(e7);
                } catch (w.f e10) {
                    androidx.car.app.utils.h.f(iOnDoneCallback, str3, e10);
                    return;
                }
            case 11:
                a();
                return;
            case 12:
                d4 d4Var = (d4) this.f143b;
                z60 z60Var = (z60) this.f144c;
                z5 z5Var = (z5) this.d;
                if (d4Var.f2943q4 == z60Var) {
                    d4Var.f2943q4 = null;
                    if (d4Var.J3 && d4Var.f2941p4 == z5Var && !z5Var.H.isEmpty()) {
                        d4Var.P2();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                d4 d4Var2 = (d4) this.f143b;
                bi.a aVar = (bi.a) this.f144c;
                bi.a aVar2 = (bi.a) this.d;
                ArrayList arrayList3 = d4Var2.f2955w4;
                q3 q3Var = d4Var2.f2950u3;
                if (q3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList3.indexOf(aVar);
                    int indexOf2 = arrayList3.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        while (i10 < arrayList3.size()) {
                            bi.a aVar3 = (bi.a) arrayList3.get(i10);
                            long j10 = aVar3.f2833t;
                            if (j10 != 0) {
                                q3Var.X(i10, s6.l((TL_iv.RichText) d4Var2.f2948t3.get(Long.valueOf(j10))));
                            } else {
                                q3Var.X(i10, q6.z(aVar3.f2818b));
                            }
                            i10++;
                        }
                        q3Var.i0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                ((d4) this.f143b).c5((bi.a) this.f144c, (String) this.d);
                return;
            case 15:
                bi.a aVar4 = (bi.a) this.f144c;
                p6 p6Var = (p6) this.d;
                n6 n6Var = ((k6) this.f143b).f3173a.D;
                if (n6Var != null) {
                    ((m3) n6Var).d(aVar4, p6Var.f3286a, p6Var.f3287b, p6Var.f3288c, p6Var.d, p6Var.e);
                    return;
                }
                return;
            case 16:
                ci.o oVar2 = (ci.o) this.f143b;
                ArrayList arrayList4 = (ArrayList) this.f144c;
                ArrayList arrayList5 = (ArrayList) this.d;
                oVar2.getClass();
                for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                    ((View) arrayList4.get(i11)).setVisibility(0);
                }
                if (oVar2.A.removeAll(arrayList5)) {
                    while (i10 < arrayList5.size()) {
                        oVar2.d((c1) arrayList5.get(i10));
                        i10++;
                    }
                    oVar2.G();
                }
                oVar2.K.removeAll(arrayList4);
                return;
            case 17:
                ci.o oVar3 = (ci.o) this.f143b;
                View view = (View) this.f144c;
                c1 c1Var = (c1) this.d;
                oVar3.getClass();
                view.setVisibility(0);
                if (oVar3.A.remove(c1Var)) {
                    oVar3.d(c1Var);
                    oVar3.G();
                }
                oVar3.K.remove(view);
                return;
            case 18:
                SpannableString spannableString = (SpannableString) this.f143b;
                di.l.a(spannableString, spannableString.length(), (com.google.android.gms.internal.play_billing.s0) ((n4.q) this.f144c).f13527a);
                ((org.telegram.ui.h0) this.d).run();
                return;
            case 19:
                SpannableString spannableString2 = (SpannableString) this.f143b;
                di.l.a(spannableString2, spannableString2.length(), (com.google.android.gms.internal.play_billing.s0) ((n4.q) this.f144c).f13527a);
                ((i6) this.d).a(spannableString2);
                return;
            case 20:
                j9.y yVar = (j9.y) this.f143b;
                j9.e0 e0Var = (j9.e0) this.f144c;
                try {
                    try {
                        e0Var.o(((j9.q) this.d).apply(p8.a(yVar)));
                        return;
                    } catch (Throwable th2) {
                        e0Var.n(th2);
                        return;
                    }
                } catch (Error e11) {
                    e = e11;
                    e0Var.n(e);
                    return;
                } catch (CancellationException unused) {
                    e0Var.cancel(false);
                    return;
                } catch (RuntimeException e12) {
                    e = e12;
                    e0Var.n(e);
                    return;
                } catch (ExecutionException e13) {
                    e = e13;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    e0Var.n(e);
                    return;
                }
            case 21:
                j9.e0 e0Var2 = (j9.e0) this.f143b;
                k2.u uVar = (k2.u) this.f144c;
                t1 t1Var = (t1) this.d;
                try {
                    if (!(e0Var2.f9759a instanceof j9.a)) {
                        uVar.run();
                        e0Var2.m(t1Var);
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    e0Var2.n(th3);
                    return;
                }
            case 22:
                u2.g0 g0Var = (u2.g0) this.d;
                j2.g gVar2 = ((a1) this.f143b).f7796c;
                x1 f7 = ((e9.k0) this.f144c).f();
                j2.f fVar2 = gVar2.d;
                f1 f1Var = gVar2.h;
                f1Var.getClass();
                fVar2.getClass();
                fVar2.f9349b = e9.n0.u(f7);
                if (!f7.isEmpty()) {
                    fVar2.e = (u2.g0) f7.get(0);
                    g0Var.getClass();
                    fVar2.f9351f = g0Var;
                }
                if (((u2.g0) fVar2.d) == null) {
                    fVar2.d = j2.f.o(f1Var, (e9.n0) fVar2.f9349b, (u2.g0) fVar2.e, (l1) fVar2.f9348a);
                }
                fVar2.G(f1Var.y0());
                return;
            case 23:
                Pair pair = (Pair) this.f144c;
                ((i1) this.f143b).f7938b.h.l(((Integer) pair.first).intValue(), (u2.g0) pair.second, (oa.d) this.d);
                return;
            case 24:
                Pair pair2 = (Pair) this.f144c;
                ((i1) this.f143b).f7938b.h.j(((Integer) pair2.first).intValue(), (u2.g0) pair2.second, (Exception) this.d);
                return;
            case 25:
                b();
                return;
            case 26:
                String str4 = e2.l0.f6165a;
                j2.g gVar3 = ((i2.c0) ((k2.w) ((hf.b) this.f143b).f7659c)).f7822a.f7928s;
                j2.a U2 = gVar3.U();
                gVar3.V(U2, 1009, new j2.e(U2, (b2.x) this.f144c, (i2.e) this.d));
                return;
            case 27:
                c();
                return;
            case 28:
                ki.k kVar = (ki.k) this.f143b;
                byte[] bArr2 = (byte[]) this.d;
                File file = ((ki.j) this.f144c).f11411b;
                if (kVar.G == 4) {
                    kVar.B = bArr2;
                    try {
                        kVar.p();
                        if (kVar.e) {
                            i2.i0 a2 = new i2.n(kVar.f11413a).a();
                            kVar.A = a2;
                            a2.o0(kVar.F);
                            kVar.A.s0(b2.p0.b(Uri.fromFile(file)));
                            kVar.A.a();
                        }
                        kVar.s(5);
                        m5.e eVar = kVar.f11416f;
                        long j11 = kVar.j();
                        byte[] bArr3 = kVar.B;
                        if (bArr3 != null) {
                            bArr = (byte[]) bArr3.clone();
                        }
                        eVar.T(j11, bArr);
                        return;
                    } catch (Throwable th4) {
                        if (th4 instanceof Exception) {
                            runtimeException = th4;
                        } else {
                            runtimeException = new RuntimeException(th4);
                        }
                        kVar.g(runtimeException);
                        return;
                    }
                }
                return;
            default:
                File file2 = (File) this.d;
                m4.c cVar = ((ki.k) this.f143b).f11417g;
                long j12 = ((ki.j) this.f144c).f11410a;
                synchronized (((e0.h) cVar.f12707c).f6022f) {
                    ((HashMap) ((e0.h) cVar.f12707c).f6023g).put(Long.valueOf(j12), file2);
                }
                ((Handler) ((e0.h) cVar.f12707c).d).post(new x0(cVar, j12, (ne) cVar.f12706b, file2, 1));
                return;
        }
    }
}
