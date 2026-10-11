package i9;

import ae.a1;
import android.app.Application;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import c5.g0;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.sc;
import org.telegram.ui.ez;
import org.telegram.ui.mr;
import org.telegram.ui.or;
import org.telegram.ui.qm;
import org.telegram.ui.sr;
import org.telegram.ui.zn;
import v7.j8;
public final class s implements Runnable {
    public final int f12076a;
    public Object f12077b;
    public final Object f12078c;

    public s(int i10, Object obj, Object obj2) {
        this.f12076a = i10;
        this.f12077b = obj;
        this.f12078c = obj2;
    }

    private final void a() {
        j6.j jVar = (j6.j) this.f12077b;
        IBinder iBinder = (IBinder) this.f12078c;
        synchronized (jVar) {
            if (iBinder == null) {
                jVar.a("Null service connection");
                return;
            }
            try {
                jVar.f14052c = new n4.x(iBinder);
                jVar.f14050a = 2;
                ((ScheduledExecutorService) jVar.f14054f.f14062c).execute(new j6.h(jVar, 0));
            } catch (RemoteException e7) {
                jVar.a(e7.getMessage());
            }
        }
    }

    private final void b() {
        j6.j jVar = (j6.j) this.f12077b;
        int i10 = ((j6.k) this.f12078c).f14055a;
        synchronized (jVar) {
            j6.k kVar = (j6.k) jVar.f14053e.get(i10);
            if (kVar != 0) {
                Log.w("MessengerIpcClient", "Timing out request: " + i10);
                jVar.f14053e.remove(i10);
                kVar.b(new Exception("Timed out waiting for response", null));
                jVar.c();
            }
        }
    }

    public void c() {
        throw new UnsupportedOperationException("Method not decompiled: i9.s.c():void");
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
        int i10 = 0;
        boolean z18 = false;
        int i11 = 0;
        boolean z19 = true;
        switch (this.f12076a) {
            case 0:
                r rVar = (r) this.f12078c;
                w wVar = (w) this.f12077b;
                if (wVar instanceof j9.a) {
                    o oVar = (o) ((j9.a) wVar);
                    if (oVar instanceof g) {
                        Object obj = oVar.f12071a;
                        if (obj instanceof b) {
                            th2 = ((b) obj).f12046a;
                        }
                    }
                    if (th2 != null) {
                        rVar.h(th2);
                        return;
                    }
                }
                try {
                    rVar.onSuccess(j8.a(wVar));
                    return;
                } catch (ExecutionException e7) {
                    rVar.h(e7.getCause());
                    return;
                } catch (Throwable th3) {
                    rVar.h(th3);
                    return;
                }
            case 1:
                ((ae.m) this.f12078c).D((a1) this.f12077b);
                return;
            case 2:
                androidx.biometric.x xVar = ((androidx.biometric.p) this.f12078c).f2317l0;
                if (xVar.f2326e == null) {
                    xVar.f2326e = new Object();
                }
                xVar.f2326e.c((androidx.biometric.s) this.f12077b);
                return;
            case 3:
                ((ae.m) this.f12077b).D((be.e) this.f12078c);
                return;
            case 4:
                c5.c cVar = (c5.c) this.f12077b;
                c5.h hVar = (c5.h) this.f12078c;
                if (((c5.q) cVar.f4208f.f4236c) != null) {
                    ((c5.q) cVar.f4208f.f4236c).onPurchasesUpdated(hVar, null);
                    return;
                } else {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 5:
                Future future = (Future) this.f12077b;
                if (!future.isDone() && !future.isCancelled()) {
                    Runnable runnable = (Runnable) this.f12078c;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                c5.h hVar2 = g0.f4245i;
                ((c5.c) this.f12077b).y(24, 7, hVar2);
                com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f7450b;
                com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.f7477e;
                ((org.telegram.messenger.d0) this.f12078c).a(hVar2, new c5.s(vVar, vVar));
                return;
            case 7:
                c5.h hVar3 = g0.f4245i;
                ((c5.c) this.f12077b).y(24, 9, hVar3);
                com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.f7450b;
                ((c5.p) this.f12078c).a(hVar3, com.google.android.gms.internal.play_billing.v.f7477e);
                return;
            case 8:
                c6.e0 e0Var = ((c6.d0) this.f12077b).f4342b;
                g6.d dVar = (g6.d) this.f12078c;
                g6.b bVar = c6.e0.G;
                c6.d dVar2 = dVar.d;
                c6.x xVar2 = dVar.f10330f;
                c6.d dVar3 = e0Var.f4355t;
                d6.d0 d0Var = e0Var.D;
                if (!g6.a.d(dVar2, dVar3)) {
                    e0Var.f4355t = dVar2;
                    d0Var.c();
                }
                double d = dVar.f10326a;
                if (!Double.isNaN(d) && Math.abs(d - e0Var.v) > 1.0E-7d) {
                    e0Var.v = d;
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z20 = dVar.f10327b;
                if (z20 != e0Var.f4357w) {
                    e0Var.f4357w = z20;
                    z10 = true;
                }
                g6.b bVar2 = c6.e0.G;
                bVar2.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(e0Var.f4348m));
                if (d0Var != null && (z10 || e0Var.f4348m)) {
                    d0Var.f();
                }
                Double.isNaN(dVar.h);
                int i12 = dVar.f10328c;
                if (i12 != e0Var.f4358x) {
                    e0Var.f4358x = i12;
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar2.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(e0Var.f4348m));
                if (d0Var != null && (z11 || e0Var.f4348m)) {
                    d0Var.a();
                }
                int i13 = dVar.f10329e;
                if (i13 != e0Var.f4359y) {
                    e0Var.f4359y = i13;
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar2.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(e0Var.f4348m));
                if (d0Var != null && (z12 || e0Var.f4348m)) {
                    d0Var.e();
                }
                if (!g6.a.d(e0Var.f4360z, xVar2)) {
                    e0Var.f4360z = xVar2;
                }
                e0Var.f4348m = false;
                return;
            case 9:
                c6.e0 e0Var2 = ((c6.d0) this.f12077b).f4342b;
                g6.b bVar3 = c6.e0.G;
                String str = ((g6.c) this.f12078c).f10325a;
                if (!g6.a.d(str, e0Var2.f4356u)) {
                    e0Var2.f4356u = str;
                    z13 = true;
                } else {
                    z13 = false;
                }
                c6.e0.G.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z13), Boolean.valueOf(e0Var2.f4349n));
                d6.d0 d0Var2 = e0Var2.D;
                if (d0Var2 != null && (z13 || e0Var2.f4349n)) {
                    d0Var2.d();
                }
                e0Var2.f4349n = false;
                return;
            case 10:
                ((com.google.android.gms.internal.cast.r) this.f12077b).M0((p4.r) this.f12078c);
                return;
            case 11:
                ((e0.d) this.f12077b).f8392a = this.f12078c;
                return;
            case 12:
                ((Application) this.f12077b).unregisterActivityLifecycleCallbacks((e0.d) this.f12078c);
                return;
            case 13:
                Object obj2 = this.f12078c;
                Object obj3 = this.f12077b;
                try {
                    Method method = e0.e.d;
                    if (method != null) {
                        method.invoke(obj3, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        e0.e.f8400e.invoke(obj3, obj2, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e10) {
                    if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                        throw e10;
                    }
                    return;
                } catch (Throwable th4) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th4);
                    return;
                }
            case 14:
                fe.i iVar = (fe.i) this.f12078c;
                ae.b0 b0Var = iVar.f9898c;
                while (true) {
                    try {
                        ((Runnable) this.f12077b).run();
                    } catch (Throwable th5) {
                        ae.g0.m(th5, jd.i.f14128a);
                    }
                    Runnable f7 = iVar.f();
                    if (f7 != null) {
                        this.f12077b = f7;
                        i10++;
                        if (i10 >= 16 && b0Var.e()) {
                            b0Var.c(iVar, this);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                break;
            case 15:
                g6.v vVar2 = (g6.v) this.f12077b;
                g6.d dVar4 = (g6.d) this.f12078c;
                g6.b bVar4 = g6.v.f10367n0;
                c6.d dVar5 = dVar4.d;
                c6.x xVar3 = dVar4.f10330f;
                c6.d dVar6 = vVar2.U;
                d6.d0 d0Var3 = vVar2.W;
                if (!g6.a.d(dVar5, dVar6)) {
                    vVar2.U = dVar5;
                    d0Var3.c();
                }
                double d10 = dVar4.f10326a;
                if (!Double.isNaN(d10) && Math.abs(d10 - vVar2.f10375f0) > 1.0E-7d) {
                    vVar2.f10375f0 = d10;
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z21 = dVar4.f10327b;
                if (z21 != vVar2.f10372c0) {
                    vVar2.f10372c0 = z21;
                    z14 = true;
                }
                Double.isNaN(dVar4.h);
                g6.b bVar5 = g6.v.f10367n0;
                bVar5.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z14), Boolean.valueOf(vVar2.f10374e0));
                if (d0Var3 != null && (z14 || vVar2.f10374e0)) {
                    d0Var3.f();
                }
                int i14 = dVar4.f10328c;
                if (i14 != vVar2.f10377h0) {
                    vVar2.f10377h0 = i14;
                    z15 = true;
                } else {
                    z15 = false;
                }
                bVar5.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z15), Boolean.valueOf(vVar2.f10374e0));
                if (d0Var3 != null && (z15 || vVar2.f10374e0)) {
                    d0Var3.a();
                }
                int i15 = dVar4.f10329e;
                if (i15 != vVar2.f10378i0) {
                    vVar2.f10378i0 = i15;
                    z16 = true;
                } else {
                    z16 = false;
                }
                bVar5.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z16), Boolean.valueOf(vVar2.f10374e0));
                if (d0Var3 != null && (z16 || vVar2.f10374e0)) {
                    d0Var3.e();
                }
                if (!g6.a.d(vVar2.f10376g0, xVar3)) {
                    vVar2.f10376g0 = xVar3;
                }
                vVar2.f10374e0 = false;
                return;
            case 16:
                g6.v vVar3 = (g6.v) this.f12077b;
                g6.b bVar6 = g6.v.f10367n0;
                String str2 = ((g6.c) this.f12078c).f10325a;
                if (!g6.a.d(str2, vVar3.f10371b0)) {
                    vVar3.f10371b0 = str2;
                    z17 = true;
                } else {
                    z17 = false;
                }
                g6.v.f10367n0.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z17), Boolean.valueOf(vVar3.f10373d0));
                d6.d0 d0Var4 = vVar3.W;
                if (d0Var4 != null && (z17 || vVar3.f10373d0)) {
                    d0Var4.d();
                }
                vVar3.f10373d0 = false;
                return;
            case 17:
                a();
                return;
            case 18:
                b();
                return;
            case 19:
                ji.n nVar = (ji.n) this.f12078c;
                ArrayList arrayList = (ArrayList) this.f12077b;
                int size = arrayList.size();
                while (i11 < size) {
                    Object obj4 = arrayList.get(i11);
                    i11++;
                    nVar.B((s4.h) obj4);
                }
                arrayList.clear();
                nVar.v.remove(arrayList);
                return;
            case 20:
                Typeface typeface = (Typeface) this.f12078c;
                e2.a0 a0Var = (e2.a0) ((xa.c) this.f12077b).f51194b;
                if (a0Var != null) {
                    a0Var.g(typeface);
                    return;
                }
                return;
            case 21:
                ((c5.z) this.f12077b).accept(this.f12078c);
                return;
            case 22:
                zn znVar = ((qm) this.f12078c).f41202c;
                if (this == znVar.J5) {
                    znVar.cb((CharSequence) this.f12077b, false);
                    znVar.J5 = null;
                    return;
                }
                return;
            case 23:
                v8 v8Var = (v8) this.f12077b;
                boolean z22 = v8Var.d.h;
                v8Var.setChecked(!z22);
                sr srVar = ((or) this.f12078c).d;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = srVar.E;
                tL_chatBannedRights.send_media = z22;
                tL_chatBannedRights.send_gifs = z22;
                tL_chatBannedRights.send_inline = z22;
                tL_chatBannedRights.send_games = z22;
                tL_chatBannedRights.send_photos = z22;
                tL_chatBannedRights.send_videos = z22;
                tL_chatBannedRights.send_stickers = z22;
                tL_chatBannedRights.send_audios = z22;
                tL_chatBannedRights.send_docs = z22;
                tL_chatBannedRights.send_voices = z22;
                tL_chatBannedRights.send_roundvideos = z22;
                tL_chatBannedRights.embed_links = z22;
                tL_chatBannedRights.send_polls = z22;
                tL_chatBannedRights.send_reactions = z22;
                AndroidUtilities.updateVisibleRows(srVar.f41790c);
                mr w02 = srVar.w0();
                srVar.B0();
                srVar.A0(w02);
                return;
            case 24:
                ((sc) this.f12077b).j();
                ((ez) this.f12078c).E = null;
                return;
            case 25:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.f12077b;
                while (!((Set) this.f12078c).isEmpty()) {
                    try {
                        qb.l lVar = (qb.l) referenceQueue.remove();
                        if (lVar.f46167a.remove(lVar)) {
                            lVar.clear();
                            lVar.f46168b.getClass();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            case 26:
                Callable callable = (Callable) this.f12077b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f12078c;
                try {
                    taskCompletionSource.setResult(callable.call());
                    return;
                } catch (mb.a e11) {
                    taskCompletionSource.setException(e11);
                    return;
                } catch (Exception e12) {
                    taskCompletionSource.setException(new mb.a("Internal error has occurred when executing ML Kit tasks", e12));
                    return;
                }
            case 27:
                qb.i iVar2 = (qb.i) this.f12077b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f12078c;
                int decrementAndGet = iVar2.f46160b.decrementAndGet();
                if (decrementAndGet < 0) {
                    z19 = false;
                }
                n6.m.k(z19);
                if (decrementAndGet == 0) {
                    iVar2.c();
                    iVar2.f46161c.set(false);
                }
                t7.n.f48313a.clear();
                t7.s.f48319a.clear();
                taskCompletionSource2.setResult(null);
                return;
            case 28:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f12077b;
                if (((Thread) ((AtomicReference) mVar.d).getAndSet(Thread.currentThread())) == null) {
                    z18 = true;
                }
                n6.m.k(z18);
                try {
                    ((Runnable) this.f12078c).run();
                    ((AtomicReference) mVar.d).set(null);
                    mVar.B();
                    return;
                } catch (Throwable th6) {
                    try {
                        ((AtomicReference) mVar.d).set(null);
                        mVar.B();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                    throw th6;
                }
            default:
                try {
                    c();
                    return;
                } catch (Error e13) {
                    synchronized (((r9.i) this.f12078c).f47211b) {
                        ((r9.i) this.f12078c).f47212c = 1;
                        throw e13;
                    }
                }
        }
    }

    public String toString() {
        String str;
        switch (this.f12076a) {
            case 0:
                aa.a aVar = new aa.a(s.class.getSimpleName(), 13);
                n4.x xVar = new n4.x(11, false);
                ((n4.x) aVar.d).f16659c = xVar;
                aVar.d = xVar;
                xVar.f16658b = (r) this.f12078c;
                return aVar.toString();
            case 29:
                Runnable runnable = (Runnable) this.f12077b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i10 = ((r9.i) this.f12078c).f47212c;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                str = "null";
                            } else {
                                str = "RUNNING";
                            }
                        } else {
                            str = "QUEUED";
                        }
                    } else {
                        str = "QUEUING";
                    }
                } else {
                    str = "IDLE";
                }
                sb2.append(str);
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public s(Object obj, Object obj2, boolean z10, int i10) {
        this.f12076a = i10;
        this.f12078c = obj;
        this.f12077b = obj2;
    }

    public s(r9.i iVar) {
        this.f12076a = 29;
        this.f12078c = iVar;
    }
}
