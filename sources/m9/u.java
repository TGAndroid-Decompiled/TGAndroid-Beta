package m9;

import android.app.Application;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import b9.k0;
import c8.s9;
import com.google.android.gms.common.data.DataHolder;
import h2.j0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.messenger.WearAuthListenerService;
import org.telegram.messenger.a8;
import org.telegram.messenger.hi;
import org.telegram.messenger.j1;
import org.telegram.messenger.q1;
import org.telegram.messenger.r1;
import org.telegram.messenger.uz;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.uo;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
import org.telegram.ui.kq;
import org.telegram.ui.mq;
import org.telegram.ui.nl;
import org.telegram.ui.qq;
public final class u implements Runnable {
    public final int f19996a;
    public Object f19997b;
    public final Object f19998c;

    public u(int i7, Object obj, Object obj2) {
        this.f19996a = i7;
        this.f19997b = obj;
        this.f19998c = obj2;
    }

    private final void a() {
        m6.l lVar = (m6.l) this.f19997b;
        int i7 = ((m6.m) this.f19998c).f19915a;
        synchronized (lVar) {
            SparseArray sparseArray = lVar.f19913e;
            m6.m mVar = (m6.m) sparseArray.get(i7);
            if (mVar != 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 20);
                sb2.append("Timing out request: ");
                sb2.append(i7);
                Log.w("MessengerIpcClient", sb2.toString());
                sparseArray.remove(i7);
                mVar.c(new Exception("Timed out waiting for response", null));
                lVar.d();
            }
        }
    }

    @Override
    public final void run() {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Throwable th2 = null;
        int i7 = 0;
        switch (this.f19996a) {
            case 0:
                t tVar = (t) this.f19998c;
                y yVar = (y) this.f19997b;
                if (yVar instanceof n9.a) {
                    o oVar = (o) ((n9.a) yVar);
                    if (oVar instanceof g) {
                        Object obj = oVar.f19989a;
                        if (obj instanceof b) {
                            th2 = ((b) obj).f19961a;
                        }
                    }
                    if (th2 != null) {
                        tVar.h(th2);
                        return;
                    }
                }
                try {
                    tVar.onSuccess(s9.a(yVar));
                    return;
                } catch (ExecutionException e10) {
                    tVar.h(e10.getCause());
                    return;
                } catch (Throwable th3) {
                    tVar.h(th3);
                    return;
                }
            case 1:
                a2.a aVar = (a2.a) this.f19998c;
                Object obj2 = this.f19997b;
                if (aVar.f52c.get()) {
                    d6.d dVar = aVar.f53e;
                    if (dVar.h == aVar) {
                        SystemClock.uptimeMillis();
                        dVar.h = null;
                        dVar.b();
                    }
                } else {
                    d6.d dVar2 = aVar.f53e;
                    if (dVar2.f8198g != aVar) {
                        if (dVar2.h == aVar) {
                            SystemClock.uptimeMillis();
                            dVar2.h = null;
                            dVar2.b();
                        }
                    } else if (!dVar2.f8195c) {
                        SystemClock.uptimeMillis();
                        dVar2.f8198g = null;
                        z1.a aVar2 = dVar2.f8193a;
                        if (aVar2 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                aVar2.j(obj2);
                            } else {
                                aVar2.h(obj2);
                            }
                        }
                    }
                }
                aVar.f51b = 3;
                return;
            case 2:
                DataHolder dataHolder = (DataHolder) this.f19997b;
                int i10 = dataHolder.f6730e;
                try {
                    ((a9.d) this.f19998c).f757c.getClass();
                    if (dataHolder != null) {
                        return;
                    }
                    return;
                } finally {
                    if (dataHolder != null) {
                        dataHolder.close();
                    }
                }
            case 3:
                WearAuthListenerService wearAuthListenerService = ((a9.d) this.f19998c).f757c;
                k0 k0Var = (k0) this.f19997b;
                String str = k0Var.f3068b;
                String str2 = k0Var.d;
                byte[] bArr = k0Var.f3069c;
                if ("/tg-wear-auth/offer".equals(str)) {
                    try {
                        Intent intent = new Intent(wearAuthListenerService, LaunchActivity.class);
                        intent.addFlags(268566528);
                        wearAuthListenerService.startActivity(intent);
                    } catch (Exception e11) {
                        a8.e("wear-auth: failed to pop LaunchActivity", e11);
                    }
                }
                org.telegram.messenger.g0.h3(new uz(bArr, str, str2));
                return;
            case 4:
                ((a9.d) this.f19998c).f757c.getClass();
                return;
            case 5:
                b9.e eVar = (b9.e) this.f19997b;
                a9.d dVar3 = (a9.d) this.f19998c;
                eVar.b(dVar3.f757c);
                eVar.b(dVar3.f757c.f21353n);
                return;
            case 6:
                ((zd.m) this.f19997b).D((ae.e) this.f19998c);
                return;
            case 7:
                androidx.biometric.z zVar = ((androidx.biometric.q) this.f19998c).f2019l0;
                if (zVar.f2029e == null) {
                    zVar.f2029e = new Object();
                }
                zVar.f2029e.c((androidx.biometric.u) this.f19997b);
                return;
            case 8:
                ((com.google.android.gms.internal.cast.p) this.f19997b).o1((s4.r) this.f19998c);
                return;
            case 9:
                ((e0.c) this.f19997b).f10027a = this.f19998c;
                return;
            case 10:
                ((Application) this.f19997b).unregisterActivityLifecycleCallbacks((e0.c) this.f19998c);
                return;
            case 11:
                Object obj3 = this.f19998c;
                Object obj4 = this.f19997b;
                try {
                    Method method = e0.d.d;
                    if (method != null) {
                        method.invoke(obj4, obj3, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        e0.d.f10035e.invoke(obj4, obj3, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e12) {
                    if (e12.getClass() == RuntimeException.class && e12.getMessage() != null && e12.getMessage().startsWith("Unable to stop")) {
                        throw e12;
                    }
                    return;
                } catch (Throwable th4) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th4);
                    return;
                }
            case 12:
                ee.g gVar = (ee.g) this.f19998c;
                zd.x xVar = gVar.d;
                while (true) {
                    try {
                        ((Runnable) this.f19997b).run();
                    } catch (Throwable th5) {
                        zd.b0.m(id.i.f15456a, th5);
                    }
                    Runnable g10 = gVar.g();
                    if (g10 != null) {
                        this.f19997b = g10;
                        i7++;
                        if (i7 >= 16 && xVar.d(gVar)) {
                            xVar.c(gVar, this);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                break;
            case 13:
                f5.b bVar = (f5.b) this.f19997b;
                f5.f fVar = (f5.f) this.f19998c;
                if (((f5.n) bVar.f11121f.f11148c) != null) {
                    ((r1) ((f5.n) bVar.f11121f.f11148c)).n(fVar, null, null);
                    return;
                } else {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 14:
                Future future = (Future) this.f19997b;
                if (!future.isDone() && !future.isCancelled()) {
                    Runnable runnable = (Runnable) this.f19998c;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 15:
                f5.f fVar2 = f5.z.f11201i;
                ((f5.b) this.f19997b).y(24, 4, fVar2);
                ((f5.g) this.f19998c).a(fVar2);
                return;
            case 16:
                f5.f fVar3 = f5.z.f11201i;
                ((f5.b) this.f19997b).y(24, 7, fVar3);
                com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f7442b;
                ((q1) ((j1) this.f19998c).f23465b).a(fVar3, com.google.android.gms.internal.play_billing.v.f7469e);
                return;
            case 17:
                f5.f fVar4 = f5.z.f11201i;
                ((f5.b) this.f19997b).y(24, 9, fVar4);
                com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.f7442b;
                ((f5.m) this.f19998c).b(fVar4, com.google.android.gms.internal.play_billing.v.f7469e);
                return;
            case 18:
                f6.e0 e0Var = ((f6.d0) this.f19997b).f11246b;
                j6.d dVar4 = (j6.d) this.f19998c;
                j6.b bVar2 = f6.e0.H;
                f6.d dVar5 = dVar4.d;
                f6.x xVar2 = dVar4.f16516f;
                f6.d dVar6 = e0Var.f11259u;
                g6.e0 e0Var2 = e0Var.E;
                if (!j6.a.d(dVar5, dVar6)) {
                    e0Var.f11259u = dVar5;
                    e0Var2.c();
                }
                double d = dVar4.f16512a;
                if (!Double.isNaN(d) && Math.abs(d - e0Var.f11260w) > 1.0E-7d) {
                    e0Var.f11260w = d;
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z17 = dVar4.f16513b;
                if (z17 != e0Var.f11261x) {
                    e0Var.f11261x = z17;
                    z9 = true;
                }
                j6.b bVar3 = f6.e0.H;
                bVar3.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z9), Boolean.valueOf(e0Var.f11252n));
                if (e0Var2 != null && (z9 || e0Var.f11252n)) {
                    e0Var2.f();
                }
                Double.isNaN(dVar4.h);
                int i11 = dVar4.f16514c;
                if (i11 != e0Var.f11262y) {
                    e0Var.f11262y = i11;
                    z10 = true;
                } else {
                    z10 = false;
                }
                bVar3.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(e0Var.f11252n));
                if (e0Var2 != null && (z10 || e0Var.f11252n)) {
                    e0Var2.a();
                }
                int i12 = dVar4.f16515e;
                if (i12 != e0Var.f11263z) {
                    e0Var.f11263z = i12;
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar3.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(e0Var.f11252n));
                if (e0Var2 != null && (z11 || e0Var.f11252n)) {
                    e0Var2.e();
                }
                if (!j6.a.d(e0Var.A, xVar2)) {
                    e0Var.A = xVar2;
                }
                e0Var.f11252n = false;
                return;
            case 19:
                f6.e0 e0Var3 = ((f6.d0) this.f19997b).f11246b;
                j6.b bVar4 = f6.e0.H;
                String str3 = ((j6.c) this.f19998c).f16511a;
                if (!j6.a.d(str3, e0Var3.v)) {
                    e0Var3.v = str3;
                    z12 = true;
                } else {
                    z12 = false;
                }
                f6.e0.H.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(e0Var3.f11253o));
                g6.e0 e0Var4 = e0Var3.E;
                if (e0Var4 != null && (z12 || e0Var3.f11253o)) {
                    e0Var4.d();
                }
                e0Var3.f11253o = false;
                return;
            case 20:
                j6.v vVar = (j6.v) this.f19997b;
                j6.d dVar7 = (j6.d) this.f19998c;
                j6.b bVar5 = j6.v.Y;
                f6.d dVar8 = dVar7.d;
                f6.x xVar3 = dVar7.f16516f;
                f6.d dVar9 = vVar.F;
                g6.e0 e0Var5 = vVar.H;
                if (!j6.a.d(dVar8, dVar9)) {
                    vVar.F = dVar8;
                    e0Var5.c();
                }
                double d2 = dVar7.f16512a;
                if (!Double.isNaN(d2) && Math.abs(d2 - vVar.Q) > 1.0E-7d) {
                    vVar.Q = d2;
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z18 = dVar7.f16513b;
                if (z18 != vVar.N) {
                    vVar.N = z18;
                    z13 = true;
                }
                Double.isNaN(dVar7.h);
                j6.b bVar6 = j6.v.Y;
                bVar6.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z13), Boolean.valueOf(vVar.P));
                if (e0Var5 != null && (z13 || vVar.P)) {
                    e0Var5.f();
                }
                int i13 = dVar7.f16514c;
                if (i13 != vVar.S) {
                    vVar.S = i13;
                    z14 = true;
                } else {
                    z14 = false;
                }
                bVar6.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z14), Boolean.valueOf(vVar.P));
                if (e0Var5 != null && (z14 || vVar.P)) {
                    e0Var5.a();
                }
                int i14 = dVar7.f16515e;
                if (i14 != vVar.T) {
                    vVar.T = i14;
                    z15 = true;
                } else {
                    z15 = false;
                }
                bVar6.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z15), Boolean.valueOf(vVar.P));
                if (e0Var5 != null && (z15 || vVar.P)) {
                    e0Var5.e();
                }
                if (!j6.a.d(vVar.R, xVar3)) {
                    vVar.R = xVar3;
                }
                vVar.P = false;
                return;
            case 21:
                j6.v vVar2 = (j6.v) this.f19997b;
                j6.b bVar7 = j6.v.Y;
                String str4 = ((j6.c) this.f19998c).f16511a;
                if (!j6.a.d(str4, vVar2.M)) {
                    vVar2.M = str4;
                    z16 = true;
                } else {
                    z16 = false;
                }
                j6.v.Y.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z16), Boolean.valueOf(vVar2.O));
                g6.e0 e0Var6 = vVar2.H;
                if (e0Var6 != null && (z16 || vVar2.O)) {
                    e0Var6.d();
                }
                vVar2.O = false;
                return;
            case 22:
                IBinder iBinder = (IBinder) this.f19998c;
                m6.l lVar = (m6.l) this.f19997b;
                synchronized (lVar) {
                    if (iBinder == null) {
                        lVar.b("Null service connection");
                        return;
                    }
                    try {
                        lVar.f19912c = new j2.n(iBinder);
                        lVar.f19910a = 2;
                        ((ScheduledExecutorService) lVar.f19914f.f19922c).execute(new m6.j(lVar, 1));
                        return;
                    } catch (RemoteException e13) {
                        lVar.b(e13.getMessage());
                        return;
                    }
                }
            case 23:
                a();
                return;
            case 24:
                mi.l lVar2 = (mi.l) this.f19998c;
                ArrayList arrayList = (ArrayList) this.f19997b;
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj5 = arrayList.get(i7);
                    i7++;
                    lVar2.B((v4.i) obj5);
                }
                arrayList.clear();
                lVar2.v.remove(arrayList);
                return;
            case 25:
                Typeface typeface = (Typeface) this.f19998c;
                j0 j0Var = (j0) ((gf.g) this.f19997b).f13889b;
                if (j0Var != null) {
                    j0Var.h(typeface);
                    return;
                }
                return;
            case 26:
                ((f5.t) this.f19997b).accept(this.f19998c);
                return;
            case 27:
                ArrayList arrayList2 = (ArrayList) this.f19997b;
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    if (arrayList2.get(i15) != null && ((uo) arrayList2.get(i15)).f38760a != null) {
                        ((uo) arrayList2.get(i15)).f38760a.m(0);
                    }
                }
                org.telegram.messenger.g0.h3(new hi(2, this, arrayList2));
                return;
            case 28:
                cn cnVar = ((nl) this.f19998c).f48204b;
                if (this == cnVar.Z5) {
                    cnVar.Bb((CharSequence) this.f19997b, false);
                    cnVar.Z5 = null;
                    return;
                }
                return;
            default:
                q8 q8Var = (q8) this.f19997b;
                boolean z19 = q8Var.d.h;
                q8Var.setChecked(!z19);
                qq qqVar = ((mq) this.f19998c).d;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = qqVar.D;
                tL_chatBannedRights.send_media = z19;
                tL_chatBannedRights.send_gifs = z19;
                tL_chatBannedRights.send_inline = z19;
                tL_chatBannedRights.send_games = z19;
                tL_chatBannedRights.send_photos = z19;
                tL_chatBannedRights.send_videos = z19;
                tL_chatBannedRights.send_stickers = z19;
                tL_chatBannedRights.send_audios = z19;
                tL_chatBannedRights.send_docs = z19;
                tL_chatBannedRights.send_voices = z19;
                tL_chatBannedRights.send_roundvideos = z19;
                tL_chatBannedRights.embed_links = z19;
                tL_chatBannedRights.send_polls = z19;
                tL_chatBannedRights.send_reactions = z19;
                org.telegram.messenger.g0.b4(qqVar.f49121c);
                kq B0 = qqVar.B0();
                qqVar.G0();
                qqVar.F0(B0);
                return;
        }
    }

    public String toString() {
        switch (this.f19996a) {
            case 0:
                android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(u.class.getSimpleName(), 28);
                wf.b bVar = new wf.b(19, false);
                ((wf.b) a0Var.d).f57668c = bVar;
                a0Var.d = bVar;
                bVar.f57667b = (t) this.f19998c;
                return a0Var.toString();
            default:
                return super.toString();
        }
    }

    public u(f5.b bVar, f5.g gVar, aa.c0 c0Var) {
        this.f19996a = 15;
        this.f19997b = bVar;
        this.f19998c = gVar;
    }

    public u(Object obj, Object obj2, boolean z9, int i7) {
        this.f19996a = i7;
        this.f19998c = obj;
        this.f19997b = obj2;
    }
}
