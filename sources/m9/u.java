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
import b9.l0;
import c8.r9;
import com.google.android.gms.common.data.DataHolder;
import h2.j0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.messenger.WearAuthListenerService;
import org.telegram.messenger.a8;
import org.telegram.messenger.fi;
import org.telegram.messenger.j1;
import org.telegram.messenger.q1;
import org.telegram.messenger.r1;
import org.telegram.messenger.sz;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.jx;
import org.telegram.ui.kq;
import org.telegram.ui.ll;
import org.telegram.ui.mq;
import org.telegram.ui.qq;
public final class u implements Runnable {
    public final int f20593a;
    public Object f20594b;
    public final Object f20595c;

    public u(int i7, Object obj, Object obj2) {
        this.f20593a = i7;
        this.f20594b = obj;
        this.f20595c = obj2;
    }

    private final void a() {
        m6.l lVar = (m6.l) this.f20594b;
        int i7 = ((m6.m) this.f20595c).f20512a;
        synchronized (lVar) {
            SparseArray sparseArray = lVar.f20510e;
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
        switch (this.f20593a) {
            case 0:
                t tVar = (t) this.f20595c;
                y yVar = (y) this.f20594b;
                if (yVar instanceof n9.a) {
                    o oVar = (o) ((n9.a) yVar);
                    if (oVar instanceof g) {
                        Object obj = oVar.f20586a;
                        if (obj instanceof b) {
                            th2 = ((b) obj).f20558a;
                        }
                    }
                    if (th2 != null) {
                        tVar.h(th2);
                        return;
                    }
                }
                try {
                    tVar.onSuccess(r9.a(yVar));
                    return;
                } catch (ExecutionException e10) {
                    tVar.h(e10.getCause());
                    return;
                } catch (Throwable th3) {
                    tVar.h(th3);
                    return;
                }
            case 1:
                a2.a aVar = (a2.a) this.f20595c;
                Object obj2 = this.f20594b;
                if (aVar.f52c.get()) {
                    d6.d dVar = aVar.f53e;
                    if (dVar.h == aVar) {
                        SystemClock.uptimeMillis();
                        dVar.h = null;
                        dVar.b();
                    }
                } else {
                    d6.d dVar2 = aVar.f53e;
                    if (dVar2.f7589g != aVar) {
                        if (dVar2.h == aVar) {
                            SystemClock.uptimeMillis();
                            dVar2.h = null;
                            dVar2.b();
                        }
                    } else if (!dVar2.f7586c) {
                        SystemClock.uptimeMillis();
                        dVar2.f7589g = null;
                        z1.a aVar2 = dVar2.f7584a;
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
                DataHolder dataHolder = (DataHolder) this.f20594b;
                int i10 = dataHolder.f6123e;
                try {
                    ((a9.d) this.f20595c).f757c.getClass();
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
                WearAuthListenerService wearAuthListenerService = ((a9.d) this.f20595c).f757c;
                l0 l0Var = (l0) this.f20594b;
                String str = l0Var.f3031b;
                String str2 = l0Var.d;
                byte[] bArr = l0Var.f3032c;
                if ("/tg-wear-auth/offer".equals(str)) {
                    try {
                        Intent intent = new Intent(wearAuthListenerService, LaunchActivity.class);
                        intent.addFlags(268566528);
                        wearAuthListenerService.startActivity(intent);
                    } catch (Exception e11) {
                        a8.e("wear-auth: failed to pop LaunchActivity", e11);
                    }
                }
                org.telegram.messenger.g0.h3(new sz(bArr, str, str2));
                return;
            case 4:
                ((a9.d) this.f20595c).f757c.getClass();
                return;
            case 5:
                b9.e eVar = (b9.e) this.f20594b;
                a9.d dVar3 = (a9.d) this.f20595c;
                eVar.b(dVar3.f757c);
                eVar.b(dVar3.f757c.f22433n);
                return;
            case 6:
                ((zd.m) this.f20594b).D((ae.e) this.f20595c);
                return;
            case 7:
                androidx.biometric.z zVar = ((androidx.biometric.q) this.f20595c).m0;
                if (zVar.f1980e == null) {
                    zVar.f1980e = new Object();
                }
                zVar.f1980e.c((androidx.biometric.u) this.f20594b);
                return;
            case 8:
                ((com.google.android.gms.internal.cast.p) this.f20594b).o1((s4.r) this.f20595c);
                return;
            case 9:
                ((e0.c) this.f20594b).f9863a = this.f20595c;
                return;
            case 10:
                ((Application) this.f20594b).unregisterActivityLifecycleCallbacks((e0.c) this.f20595c);
                return;
            case 11:
                Object obj3 = this.f20595c;
                Object obj4 = this.f20594b;
                try {
                    Method method = e0.d.d;
                    if (method != null) {
                        method.invoke(obj4, obj3, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        e0.d.f9871e.invoke(obj4, obj3, Boolean.FALSE);
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
                ee.g gVar = (ee.g) this.f20595c;
                zd.x xVar = gVar.d;
                while (true) {
                    try {
                        ((Runnable) this.f20594b).run();
                    } catch (Throwable th5) {
                        zd.b0.m(id.i.f15913a, th5);
                    }
                    Runnable g10 = gVar.g();
                    if (g10 != null) {
                        this.f20594b = g10;
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
                f5.b bVar = (f5.b) this.f20594b;
                f5.f fVar = (f5.f) this.f20595c;
                if (((f5.o) bVar.f10945f.f10975c) != null) {
                    ((r1) ((f5.o) bVar.f10945f.f10975c)).n(fVar, null, null);
                    return;
                } else {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 14:
                Future future = (Future) this.f20594b;
                if (!future.isDone() && !future.isCancelled()) {
                    Runnable runnable = (Runnable) this.f20595c;
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
                f5.f fVar2 = f5.a0.f10933i;
                ((f5.b) this.f20594b).y(24, 4, fVar2);
                ((f5.h) this.f20595c).a(fVar2);
                return;
            case 16:
                f5.f fVar3 = f5.a0.f10933i;
                ((f5.b) this.f20594b).y(24, 7, fVar3);
                com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f6834b;
                ((q1) ((j1) this.f20595c).f24505b).a(fVar3, com.google.android.gms.internal.play_billing.v.f6861e);
                return;
            case 17:
                f5.f fVar4 = f5.a0.f10933i;
                ((f5.b) this.f20594b).y(24, 9, fVar4);
                com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.f6834b;
                ((f5.n) this.f20595c).f(fVar4, com.google.android.gms.internal.play_billing.v.f6861e);
                return;
            case 18:
                f6.e0 e0Var = ((f6.d0) this.f20594b).f11060b;
                j6.d dVar4 = (j6.d) this.f20595c;
                j6.b bVar2 = f6.e0.H;
                f6.d dVar5 = dVar4.d;
                f6.x xVar2 = dVar4.f16867f;
                f6.d dVar6 = e0Var.f11073u;
                g6.d0 d0Var = e0Var.E;
                if (!j6.a.d(dVar5, dVar6)) {
                    e0Var.f11073u = dVar5;
                    d0Var.c();
                }
                double d = dVar4.f16863a;
                if (!Double.isNaN(d) && Math.abs(d - e0Var.f11074w) > 1.0E-7d) {
                    e0Var.f11074w = d;
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z18 = dVar4.f16864b;
                if (z18 != e0Var.f11075x) {
                    e0Var.f11075x = z18;
                    z10 = true;
                }
                j6.b bVar3 = f6.e0.H;
                bVar3.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(e0Var.f11066n));
                if (d0Var != null && (z10 || e0Var.f11066n)) {
                    d0Var.f();
                }
                Double.isNaN(dVar4.h);
                int i11 = dVar4.f16865c;
                if (i11 != e0Var.f11076y) {
                    e0Var.f11076y = i11;
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar3.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(e0Var.f11066n));
                if (d0Var != null && (z11 || e0Var.f11066n)) {
                    d0Var.a();
                }
                int i12 = dVar4.f16866e;
                if (i12 != e0Var.f11077z) {
                    e0Var.f11077z = i12;
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar3.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(e0Var.f11066n));
                if (d0Var != null && (z12 || e0Var.f11066n)) {
                    d0Var.e();
                }
                if (!j6.a.d(e0Var.A, xVar2)) {
                    e0Var.A = xVar2;
                }
                e0Var.f11066n = false;
                return;
            case 19:
                f6.e0 e0Var2 = ((f6.d0) this.f20594b).f11060b;
                j6.b bVar4 = f6.e0.H;
                String str3 = ((j6.c) this.f20595c).f16862a;
                if (!j6.a.d(str3, e0Var2.v)) {
                    e0Var2.v = str3;
                    z13 = true;
                } else {
                    z13 = false;
                }
                f6.e0.H.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z13), Boolean.valueOf(e0Var2.f11067o));
                g6.d0 d0Var2 = e0Var2.E;
                if (d0Var2 != null && (z13 || e0Var2.f11067o)) {
                    d0Var2.d();
                }
                e0Var2.f11067o = false;
                return;
            case 20:
                j6.w wVar = (j6.w) this.f20594b;
                j6.d dVar7 = (j6.d) this.f20595c;
                j6.b bVar5 = j6.w.Y;
                f6.d dVar8 = dVar7.d;
                f6.x xVar3 = dVar7.f16867f;
                f6.d dVar9 = wVar.F;
                g6.d0 d0Var3 = wVar.H;
                if (!j6.a.d(dVar8, dVar9)) {
                    wVar.F = dVar8;
                    d0Var3.c();
                }
                double d2 = dVar7.f16863a;
                if (!Double.isNaN(d2) && Math.abs(d2 - wVar.Q) > 1.0E-7d) {
                    wVar.Q = d2;
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z19 = dVar7.f16864b;
                if (z19 != wVar.N) {
                    wVar.N = z19;
                    z14 = true;
                }
                Double.isNaN(dVar7.h);
                j6.b bVar6 = j6.w.Y;
                bVar6.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z14), Boolean.valueOf(wVar.P));
                if (d0Var3 != null && (z14 || wVar.P)) {
                    d0Var3.f();
                }
                int i13 = dVar7.f16865c;
                if (i13 != wVar.S) {
                    wVar.S = i13;
                    z15 = true;
                } else {
                    z15 = false;
                }
                bVar6.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z15), Boolean.valueOf(wVar.P));
                if (d0Var3 != null && (z15 || wVar.P)) {
                    d0Var3.a();
                }
                int i14 = dVar7.f16866e;
                if (i14 != wVar.T) {
                    wVar.T = i14;
                    z16 = true;
                } else {
                    z16 = false;
                }
                bVar6.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z16), Boolean.valueOf(wVar.P));
                if (d0Var3 != null && (z16 || wVar.P)) {
                    d0Var3.e();
                }
                if (!j6.a.d(wVar.R, xVar3)) {
                    wVar.R = xVar3;
                }
                wVar.P = false;
                return;
            case 21:
                j6.w wVar2 = (j6.w) this.f20594b;
                j6.b bVar7 = j6.w.Y;
                String str4 = ((j6.c) this.f20595c).f16862a;
                if (!j6.a.d(str4, wVar2.M)) {
                    wVar2.M = str4;
                    z17 = true;
                } else {
                    z17 = false;
                }
                j6.w.Y.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z17), Boolean.valueOf(wVar2.O));
                g6.d0 d0Var4 = wVar2.H;
                if (d0Var4 != null && (z17 || wVar2.O)) {
                    d0Var4.d();
                }
                wVar2.O = false;
                return;
            case 22:
                IBinder iBinder = (IBinder) this.f20595c;
                m6.l lVar = (m6.l) this.f20594b;
                synchronized (lVar) {
                    if (iBinder == null) {
                        lVar.b("Null service connection");
                        return;
                    }
                    try {
                        lVar.f20509c = new k8.a(iBinder);
                        lVar.f20507a = 2;
                        ((ScheduledExecutorService) lVar.f20511f.f20519c).execute(new m6.j(lVar, 1));
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
                Typeface typeface = (Typeface) this.f20595c;
                j0 j0Var = (j0) ((d6.i) this.f20594b).f7598b;
                if (j0Var != null) {
                    j0Var.h(typeface);
                    return;
                }
                return;
            case 25:
                ((f5.u) this.f20594b).accept(this.f20595c);
                return;
            case 26:
                ArrayList arrayList = (ArrayList) this.f20594b;
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    if (arrayList.get(i15) != null && ((dp) arrayList.get(i15)).f34009a != null) {
                        ((dp) arrayList.get(i15)).f34009a.m(0);
                    }
                }
                org.telegram.messenger.g0.h3(new fi(2, this, arrayList));
                return;
            case 27:
                an anVar = ((ll) this.f20595c).f48998b;
                if (this == anVar.f45123a6) {
                    anVar.Cb((CharSequence) this.f20594b, false);
                    anVar.f45123a6 = null;
                    return;
                }
                return;
            case 28:
                p8 p8Var = (p8) this.f20594b;
                boolean z20 = p8Var.d.h;
                p8Var.setChecked(!z20);
                qq qqVar = ((mq) this.f20595c).d;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = qqVar.E;
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
                org.telegram.messenger.g0.a4(qqVar.f50714c);
                kq B0 = qqVar.B0();
                qqVar.G0();
                qqVar.F0(B0);
                return;
            default:
                ((xb) this.f20594b).j();
                ((jx) this.f20595c).F = null;
                return;
        }
    }

    public String toString() {
        switch (this.f20593a) {
            case 0:
                android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(u.class.getSimpleName(), 27);
                wf.b bVar = new wf.b(21, false);
                ((wf.b) a0Var.d).f59108c = bVar;
                a0Var.d = bVar;
                bVar.f59107b = (t) this.f20595c;
                return a0Var.toString();
            default:
                return super.toString();
        }
    }

    public u(f5.b bVar, f5.h hVar, f5.g gVar) {
        this.f20593a = 15;
        this.f20594b = bVar;
        this.f20595c = hVar;
    }

    public u(Object obj, Object obj2, boolean z10, int i7) {
        this.f20593a = i7;
        this.f20595c = obj;
        this.f20594b = obj2;
    }
}
