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
import c8.u9;
import com.google.android.gms.common.data.DataHolder;
import h2.j0;
import hi.u0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.messenger.WearAuthListenerService;
import org.telegram.messenger.a8;
import org.telegram.messenger.fi;
import org.telegram.messenger.j1;
import org.telegram.messenger.nz;
import org.telegram.messenger.q1;
import org.telegram.messenger.r1;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.jp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.lq;
import org.telegram.ui.ml;
import org.telegram.ui.mx;
import org.telegram.ui.nq;
import org.telegram.ui.rq;
public final class u implements Runnable {
    public final int f21047a;
    public Object f21048b;
    public final Object f21049c;

    public u(int i7, Object obj, Object obj2) {
        this.f21047a = i7;
        this.f21048b = obj;
        this.f21049c = obj2;
    }

    private final void a() {
        m6.l lVar = (m6.l) this.f21048b;
        int i7 = ((m6.m) this.f21049c).f20966a;
        synchronized (lVar) {
            SparseArray sparseArray = lVar.f20964e;
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
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        Throwable th2 = null;
        int i7 = 0;
        switch (this.f21047a) {
            case 0:
                t tVar = (t) this.f21049c;
                y yVar = (y) this.f21048b;
                if (yVar instanceof n9.a) {
                    o oVar = (o) ((n9.a) yVar);
                    if (oVar instanceof g) {
                        Object obj = oVar.f21040a;
                        if (obj instanceof b) {
                            th2 = ((b) obj).f21012a;
                        }
                    }
                    if (th2 != null) {
                        tVar.h(th2);
                        return;
                    }
                }
                try {
                    tVar.onSuccess(u9.a(yVar));
                    return;
                } catch (ExecutionException e10) {
                    tVar.h(e10.getCause());
                    return;
                } catch (Throwable th3) {
                    tVar.h(th3);
                    return;
                }
            case 1:
                a2.a aVar = (a2.a) this.f21049c;
                Object obj2 = this.f21048b;
                if (aVar.f52c.get()) {
                    d6.d dVar = aVar.f53e;
                    if (dVar.h == aVar) {
                        SystemClock.uptimeMillis();
                        dVar.h = null;
                        dVar.b();
                    }
                } else {
                    d6.d dVar2 = aVar.f53e;
                    if (dVar2.f7863g != aVar) {
                        if (dVar2.h == aVar) {
                            SystemClock.uptimeMillis();
                            dVar2.h = null;
                            dVar2.b();
                        }
                    } else if (!dVar2.f7860c) {
                        SystemClock.uptimeMillis();
                        dVar2.f7863g = null;
                        z1.a aVar2 = dVar2.f7858a;
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
                DataHolder dataHolder = (DataHolder) this.f21048b;
                int i10 = dataHolder.f6397e;
                try {
                    ((a9.d) this.f21049c).f757c.getClass();
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
                WearAuthListenerService wearAuthListenerService = ((a9.d) this.f21049c).f757c;
                k0 k0Var = (k0) this.f21048b;
                String str = k0Var.f2991b;
                String str2 = k0Var.d;
                byte[] bArr = k0Var.f2992c;
                if ("/tg-wear-auth/offer".equals(str)) {
                    try {
                        Intent intent = new Intent(wearAuthListenerService, LaunchActivity.class);
                        intent.addFlags(268566528);
                        wearAuthListenerService.startActivity(intent);
                    } catch (Exception e11) {
                        a8.e("wear-auth: failed to pop LaunchActivity", e11);
                    }
                }
                org.telegram.messenger.g0.g3(new nz(bArr, str, str2));
                return;
            case 4:
                ((a9.d) this.f21049c).f757c.getClass();
                return;
            case 5:
                b9.e eVar = (b9.e) this.f21048b;
                a9.d dVar3 = (a9.d) this.f21049c;
                eVar.b(dVar3.f757c);
                eVar.b(dVar3.f757c.f22894n);
                return;
            case 6:
                ((zd.m) this.f21048b).D((ae.e) this.f21049c);
                return;
            case 7:
                androidx.biometric.z zVar = ((androidx.biometric.q) this.f21049c).m0;
                if (zVar.f1943e == null) {
                    zVar.f1943e = new Object();
                }
                zVar.f1943e.c((androidx.biometric.u) this.f21048b);
                return;
            case 8:
                ((com.google.android.gms.internal.cast.p) this.f21048b).o1((s4.r) this.f21049c);
                return;
            case 9:
                ((e0.c) this.f21048b).f10171a = this.f21049c;
                return;
            case 10:
                ((Application) this.f21048b).unregisterActivityLifecycleCallbacks((e0.c) this.f21049c);
                return;
            case 11:
                Object obj3 = this.f21049c;
                Object obj4 = this.f21048b;
                try {
                    Method method = e0.d.d;
                    if (method != null) {
                        method.invoke(obj4, obj3, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        e0.d.f10179e.invoke(obj4, obj3, Boolean.FALSE);
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
                ee.g gVar = (ee.g) this.f21049c;
                zd.x xVar = gVar.d;
                while (true) {
                    try {
                        ((Runnable) this.f21048b).run();
                    } catch (Throwable th5) {
                        zd.b0.m(id.i.f16317a, th5);
                    }
                    Runnable g10 = gVar.g();
                    if (g10 != null) {
                        this.f21048b = g10;
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
                f5.b bVar = (f5.b) this.f21048b;
                f5.f fVar = (f5.f) this.f21049c;
                if (((f5.o) bVar.f11247f.f11274c) != null) {
                    ((r1) ((f5.o) bVar.f11247f.f11274c)).n(fVar, null, null);
                    return;
                } else {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 14:
                Future future = (Future) this.f21048b;
                if (!future.isDone() && !future.isCancelled()) {
                    Runnable runnable = (Runnable) this.f21049c;
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
                f5.f fVar2 = f5.z.f11326i;
                ((f5.b) this.f21048b).z(24, 4, fVar2);
                ((f5.h) this.f21049c).a(fVar2);
                return;
            case 16:
                f5.f fVar3 = f5.z.f11326i;
                ((f5.b) this.f21048b).z(24, 7, fVar3);
                com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f7108b;
                ((q1) ((j1) this.f21049c).f24906b).a(fVar3, com.google.android.gms.internal.play_billing.v.f7135e);
                return;
            case 17:
                f5.f fVar4 = f5.z.f11326i;
                ((f5.b) this.f21048b).z(24, 9, fVar4);
                com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.f7108b;
                ((f5.n) this.f21049c).e(fVar4, com.google.android.gms.internal.play_billing.v.f7135e);
                return;
            case 18:
                f6.e0 e0Var = ((f6.d0) this.f21048b).f11371b;
                j6.d dVar4 = (j6.d) this.f21049c;
                j6.b bVar2 = f6.e0.H;
                f6.d dVar5 = dVar4.d;
                f6.x xVar2 = dVar4.f17340f;
                f6.d dVar6 = e0Var.f11384u;
                g6.d0 d0Var = e0Var.E;
                if (!j6.a.d(dVar5, dVar6)) {
                    e0Var.f11384u = dVar5;
                    d0Var.c();
                }
                double d = dVar4.f17336a;
                if (!Double.isNaN(d) && Math.abs(d - e0Var.f11385w) > 1.0E-7d) {
                    e0Var.f11385w = d;
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z18 = dVar4.f17337b;
                if (z18 != e0Var.f11386x) {
                    e0Var.f11386x = z18;
                    z10 = true;
                }
                j6.b bVar3 = f6.e0.H;
                bVar3.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(e0Var.f11377n));
                if (d0Var != null && (z10 || e0Var.f11377n)) {
                    d0Var.f();
                }
                Double.isNaN(dVar4.h);
                int i11 = dVar4.f17338c;
                if (i11 != e0Var.f11387y) {
                    e0Var.f11387y = i11;
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar3.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(e0Var.f11377n));
                if (d0Var != null && (z11 || e0Var.f11377n)) {
                    d0Var.a();
                }
                int i12 = dVar4.f17339e;
                if (i12 != e0Var.f11388z) {
                    e0Var.f11388z = i12;
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar3.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(e0Var.f11377n));
                if (d0Var != null && (z12 || e0Var.f11377n)) {
                    d0Var.e();
                }
                if (!j6.a.d(e0Var.A, xVar2)) {
                    e0Var.A = xVar2;
                }
                e0Var.f11377n = false;
                return;
            case 19:
                f6.e0 e0Var2 = ((f6.d0) this.f21048b).f11371b;
                j6.b bVar4 = f6.e0.H;
                String str3 = ((j6.c) this.f21049c).f17335a;
                if (!j6.a.d(str3, e0Var2.v)) {
                    e0Var2.v = str3;
                    z13 = true;
                } else {
                    z13 = false;
                }
                f6.e0.H.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z13), Boolean.valueOf(e0Var2.f11378o));
                g6.d0 d0Var2 = e0Var2.E;
                if (d0Var2 != null && (z13 || e0Var2.f11378o)) {
                    d0Var2.d();
                }
                e0Var2.f11378o = false;
                return;
            case 20:
                j6.x xVar3 = (j6.x) this.f21048b;
                j6.d dVar7 = (j6.d) this.f21049c;
                j6.b bVar5 = j6.x.Y;
                f6.d dVar8 = dVar7.d;
                f6.x xVar4 = dVar7.f17340f;
                f6.d dVar9 = xVar3.F;
                g6.d0 d0Var3 = xVar3.H;
                if (!j6.a.d(dVar8, dVar9)) {
                    xVar3.F = dVar8;
                    d0Var3.c();
                }
                double d2 = dVar7.f17336a;
                if (!Double.isNaN(d2) && Math.abs(d2 - xVar3.Q) > 1.0E-7d) {
                    xVar3.Q = d2;
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z19 = dVar7.f17337b;
                if (z19 != xVar3.N) {
                    xVar3.N = z19;
                    z14 = true;
                }
                Double.isNaN(dVar7.h);
                j6.b bVar6 = j6.x.Y;
                bVar6.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z14), Boolean.valueOf(xVar3.P));
                if (d0Var3 != null && (z14 || xVar3.P)) {
                    d0Var3.f();
                }
                int i13 = dVar7.f17338c;
                if (i13 != xVar3.S) {
                    xVar3.S = i13;
                    z15 = true;
                } else {
                    z15 = false;
                }
                bVar6.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z15), Boolean.valueOf(xVar3.P));
                if (d0Var3 != null && (z15 || xVar3.P)) {
                    d0Var3.a();
                }
                int i14 = dVar7.f17339e;
                if (i14 != xVar3.T) {
                    xVar3.T = i14;
                    z16 = true;
                } else {
                    z16 = false;
                }
                bVar6.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z16), Boolean.valueOf(xVar3.P));
                if (d0Var3 != null && (z16 || xVar3.P)) {
                    d0Var3.e();
                }
                if (!j6.a.d(xVar3.R, xVar4)) {
                    xVar3.R = xVar4;
                }
                xVar3.P = false;
                return;
            case 21:
                j6.x xVar5 = (j6.x) this.f21048b;
                j6.b bVar7 = j6.x.Y;
                String str4 = ((j6.c) this.f21049c).f17335a;
                if (!j6.a.d(str4, xVar5.M)) {
                    xVar5.M = str4;
                    z17 = true;
                } else {
                    z17 = false;
                }
                j6.x.Y.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z17), Boolean.valueOf(xVar5.O));
                g6.d0 d0Var4 = xVar5.H;
                if (d0Var4 != null && (z17 || xVar5.O)) {
                    d0Var4.d();
                }
                xVar5.O = false;
                return;
            case 22:
                IBinder iBinder = (IBinder) this.f21049c;
                m6.l lVar = (m6.l) this.f21048b;
                synchronized (lVar) {
                    if (iBinder == null) {
                        lVar.b("Null service connection");
                        return;
                    }
                    try {
                        lVar.f20963c = new jb.m(iBinder);
                        lVar.f20961a = 2;
                        ((ScheduledExecutorService) lVar.f20965f.f20973c).execute(new m6.j(lVar, 1));
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
                Typeface typeface = (Typeface) this.f21049c;
                j0 j0Var = (j0) ((u0) this.f21048b).f15482b;
                if (j0Var != null) {
                    j0Var.h(typeface);
                    return;
                }
                return;
            case 25:
                ((f5.u) this.f21048b).accept(this.f21049c);
                return;
            case 26:
                ArrayList arrayList = (ArrayList) this.f21048b;
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    if (arrayList.get(i15) != null && ((jp) arrayList.get(i15)).f36472a != null) {
                        ((jp) arrayList.get(i15)).f36472a.m(0);
                    }
                }
                org.telegram.messenger.g0.g3(new fi(2, this, arrayList));
                return;
            case 27:
                bn bnVar = ((ml) this.f21049c).f50076b;
                if (this == bnVar.f46139b6) {
                    bnVar.Cb((CharSequence) this.f21048b, false);
                    bnVar.f46139b6 = null;
                    return;
                }
                return;
            case 28:
                q8 q8Var = (q8) this.f21048b;
                boolean z20 = q8Var.d.h;
                q8Var.setChecked(!z20);
                rq rqVar = ((nq) this.f21049c).d;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = rqVar.E;
                tL_chatBannedRights.send_media = z20;
                tL_chatBannedRights.send_gifs = z20;
                tL_chatBannedRights.send_inline = z20;
                tL_chatBannedRights.send_games = z20;
                tL_chatBannedRights.send_photos = z20;
                tL_chatBannedRights.send_videos = z20;
                tL_chatBannedRights.send_stickers = z20;
                tL_chatBannedRights.send_audios = z20;
                tL_chatBannedRights.send_docs = z20;
                tL_chatBannedRights.send_voices = z20;
                tL_chatBannedRights.send_roundvideos = z20;
                tL_chatBannedRights.embed_links = z20;
                tL_chatBannedRights.send_polls = z20;
                tL_chatBannedRights.send_reactions = z20;
                org.telegram.messenger.g0.Z3(rqVar.f51816c);
                lq B0 = rqVar.B0();
                rqVar.G0();
                rqVar.F0(B0);
                return;
            default:
                ((fc) this.f21048b).j();
                ((mx) this.f21049c).F = null;
                return;
        }
    }

    public String toString() {
        switch (this.f21047a) {
            case 0:
                android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(u.class.getSimpleName(), 27);
                wf.b bVar = new wf.b(21, false);
                ((wf.b) a0Var.d).f59801c = bVar;
                a0Var.d = bVar;
                bVar.f59800b = (t) this.f21049c;
                return a0Var.toString();
            default:
                return super.toString();
        }
    }

    public u(f5.b bVar, f5.h hVar, f5.g gVar) {
        this.f21047a = 15;
        this.f21048b = bVar;
        this.f21049c = hVar;
    }

    public u(Object obj, Object obj2, boolean z10, int i7) {
        this.f21047a = i7;
        this.f21049c = obj;
        this.f21048b = obj2;
    }
}
