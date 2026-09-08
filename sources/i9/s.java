package i9;

import android.app.Application;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
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
import org.telegram.ui.Components.qc;
import org.telegram.ui.co;
import org.telegram.ui.gz;
import org.telegram.ui.pr;
import org.telegram.ui.rr;
import org.telegram.ui.sm;
import org.telegram.ui.vr;
import s4.c1;
import s4.m0;
import v7.l8;
public final class s implements Runnable {
    public final int f11948a;
    public Object f11949b;
    public final Object f11950c;

    public s(int i10, Object obj, Object obj2) {
        this.f11948a = i10;
        this.f11949b = obj;
        this.f11950c = obj2;
    }

    private final void a() {
        j6.j jVar = (j6.j) this.f11949b;
        int i10 = ((j6.k) this.f11950c).f13571a;
        synchronized (jVar) {
            j6.k kVar = (j6.k) jVar.f13569e.get(i10);
            if (kVar != 0) {
                Log.w("MessengerIpcClient", "Timing out request: " + i10);
                jVar.f13569e.remove(i10);
                kVar.b(new Exception("Timed out waiting for response", null));
                jVar.c();
            }
        }
    }

    private final void b() {
        try {
            c();
        } catch (Error e7) {
            synchronized (((r9.j) this.f11950c).f45083b) {
                ((r9.j) this.f11950c).f45084c = 1;
                throw e7;
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
        switch (this.f11948a) {
            case 0:
                r rVar = (r) this.f11950c;
                w wVar = (w) this.f11949b;
                if (wVar instanceof j9.a) {
                    o oVar = (o) ((j9.a) wVar);
                    if (oVar instanceof g) {
                        Object obj = oVar.f11943a;
                        if (obj instanceof b) {
                            th2 = ((b) obj).f11918a;
                        }
                    }
                    if (th2 != null) {
                        rVar.h(th2);
                        return;
                    }
                }
                try {
                    rVar.onSuccess(l8.a(wVar));
                    return;
                } catch (ExecutionException e7) {
                    rVar.h(e7.getCause());
                    return;
                } catch (Throwable th3) {
                    rVar.h(th3);
                    return;
                }
            case 1:
                ((zd.m) this.f11949b).D((ae.e) this.f11950c);
                return;
            case 2:
                androidx.biometric.y yVar = ((androidx.biometric.p) this.f11950c).f1066l0;
                if (yVar.f1076e == null) {
                    yVar.f1076e = new Object();
                }
                yVar.f1076e.c((androidx.biometric.t) this.f11949b);
                return;
            case 3:
                c5.c cVar = (c5.c) this.f11949b;
                c5.h hVar = (c5.h) this.f11950c;
                if (((c5.q) cVar.f4379f.f4407c) != null) {
                    ((c5.q) cVar.f4379f.f4407c).onPurchasesUpdated(hVar, null);
                    return;
                } else {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 4:
                Future future = (Future) this.f11949b;
                if (!future.isDone() && !future.isCancelled()) {
                    Runnable runnable = (Runnable) this.f11950c;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                c5.h hVar2 = g0.f4416i;
                ((c5.c) this.f11949b).y(24, 7, hVar2);
                com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f5900b;
                com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.f5927e;
                ((org.telegram.messenger.c0) this.f11950c).a(hVar2, new c5.s(vVar, vVar));
                return;
            case 6:
                c5.h hVar3 = g0.f4416i;
                ((c5.c) this.f11949b).y(24, 9, hVar3);
                com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.f5900b;
                ((c5.p) this.f11950c).b(hVar3, com.google.android.gms.internal.play_billing.v.f5927e);
                return;
            case 7:
                c6.e0 e0Var = ((c6.d0) this.f11949b).f4513b;
                g6.d dVar = (g6.d) this.f11950c;
                g6.b bVar = c6.e0.G;
                c6.d dVar2 = dVar.d;
                c6.x xVar = dVar.f10422f;
                c6.d dVar3 = e0Var.f4526t;
                d6.d0 d0Var = e0Var.D;
                if (!g6.a.d(dVar2, dVar3)) {
                    e0Var.f4526t = dVar2;
                    d0Var.c();
                }
                double d = dVar.f10418a;
                if (!Double.isNaN(d) && Math.abs(d - e0Var.v) > 1.0E-7d) {
                    e0Var.v = d;
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z20 = dVar.f10419b;
                if (z20 != e0Var.f4528w) {
                    e0Var.f4528w = z20;
                    z10 = true;
                }
                g6.b bVar2 = c6.e0.G;
                bVar2.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(e0Var.f4519m));
                if (d0Var != null && (z10 || e0Var.f4519m)) {
                    d0Var.f();
                }
                Double.isNaN(dVar.h);
                int i12 = dVar.f10420c;
                if (i12 != e0Var.f4529x) {
                    e0Var.f4529x = i12;
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar2.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(e0Var.f4519m));
                if (d0Var != null && (z11 || e0Var.f4519m)) {
                    d0Var.a();
                }
                int i13 = dVar.f10421e;
                if (i13 != e0Var.f4530y) {
                    e0Var.f4530y = i13;
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar2.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(e0Var.f4519m));
                if (d0Var != null && (z12 || e0Var.f4519m)) {
                    d0Var.e();
                }
                if (!g6.a.d(e0Var.f4531z, xVar)) {
                    e0Var.f4531z = xVar;
                }
                e0Var.f4519m = false;
                return;
            case 8:
                c6.e0 e0Var2 = ((c6.d0) this.f11949b).f4513b;
                g6.b bVar3 = c6.e0.G;
                String str = ((g6.c) this.f11950c).f10417a;
                if (!g6.a.d(str, e0Var2.f4527u)) {
                    e0Var2.f4527u = str;
                    z13 = true;
                } else {
                    z13 = false;
                }
                c6.e0.G.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z13), Boolean.valueOf(e0Var2.f4520n));
                d6.d0 d0Var2 = e0Var2.D;
                if (d0Var2 != null && (z13 || e0Var2.f4520n)) {
                    d0Var2.d();
                }
                e0Var2.f4520n = false;
                return;
            case 9:
                ((com.google.android.gms.internal.cast.r) this.f11949b).N0((p4.r) this.f11950c);
                return;
            case 10:
                ((e0.f) this.f11949b).f8634a = this.f11950c;
                return;
            case 11:
                ((Application) this.f11949b).unregisterActivityLifecycleCallbacks((e0.f) this.f11950c);
                return;
            case 12:
                Object obj2 = this.f11950c;
                Object obj3 = this.f11949b;
                try {
                    Method method = e0.g.d;
                    if (method != null) {
                        method.invoke(obj3, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        e0.g.f8642e.invoke(obj3, obj2, Boolean.FALSE);
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
            case 13:
                ee.i iVar = (ee.i) this.f11950c;
                zd.a0 a0Var = iVar.f9104c;
                while (true) {
                    try {
                        ((Runnable) this.f11949b).run();
                    } catch (Throwable th5) {
                        zd.e0.m(id.i.f11980a, th5);
                    }
                    Runnable f7 = iVar.f();
                    if (f7 != null) {
                        this.f11949b = f7;
                        i10++;
                        if (i10 >= 16 && a0Var.e()) {
                            a0Var.c(iVar, this);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                break;
            case 14:
                g6.v vVar2 = (g6.v) this.f11949b;
                g6.d dVar4 = (g6.d) this.f11950c;
                g6.b bVar4 = g6.v.f10459n0;
                c6.d dVar5 = dVar4.d;
                c6.x xVar2 = dVar4.f10422f;
                c6.d dVar6 = vVar2.U;
                d6.d0 d0Var3 = vVar2.W;
                if (!g6.a.d(dVar5, dVar6)) {
                    vVar2.U = dVar5;
                    d0Var3.c();
                }
                double d10 = dVar4.f10418a;
                if (!Double.isNaN(d10) && Math.abs(d10 - vVar2.f10467f0) > 1.0E-7d) {
                    vVar2.f10467f0 = d10;
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z21 = dVar4.f10419b;
                if (z21 != vVar2.f10464c0) {
                    vVar2.f10464c0 = z21;
                    z14 = true;
                }
                Double.isNaN(dVar4.h);
                g6.b bVar5 = g6.v.f10459n0;
                bVar5.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z14), Boolean.valueOf(vVar2.f10466e0));
                if (d0Var3 != null && (z14 || vVar2.f10466e0)) {
                    d0Var3.f();
                }
                int i14 = dVar4.f10420c;
                if (i14 != vVar2.f10469h0) {
                    vVar2.f10469h0 = i14;
                    z15 = true;
                } else {
                    z15 = false;
                }
                bVar5.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z15), Boolean.valueOf(vVar2.f10466e0));
                if (d0Var3 != null && (z15 || vVar2.f10466e0)) {
                    d0Var3.a();
                }
                int i15 = dVar4.f10421e;
                if (i15 != vVar2.f10470i0) {
                    vVar2.f10470i0 = i15;
                    z16 = true;
                } else {
                    z16 = false;
                }
                bVar5.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z16), Boolean.valueOf(vVar2.f10466e0));
                if (d0Var3 != null && (z16 || vVar2.f10466e0)) {
                    d0Var3.e();
                }
                if (!g6.a.d(vVar2.f10468g0, xVar2)) {
                    vVar2.f10468g0 = xVar2;
                }
                vVar2.f10466e0 = false;
                return;
            case 15:
                g6.v vVar3 = (g6.v) this.f11949b;
                g6.b bVar6 = g6.v.f10459n0;
                String str2 = ((g6.c) this.f11950c).f10417a;
                if (!g6.a.d(str2, vVar3.f10463b0)) {
                    vVar3.f10463b0 = str2;
                    z17 = true;
                } else {
                    z17 = false;
                }
                g6.v.f10459n0.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z17), Boolean.valueOf(vVar3.f10465d0));
                d6.d0 d0Var4 = vVar3.W;
                if (d0Var4 != null && (z17 || vVar3.f10465d0)) {
                    d0Var4.d();
                }
                vVar3.f10465d0 = false;
                return;
            case 16:
                j6.j jVar = (j6.j) this.f11949b;
                IBinder iBinder = (IBinder) this.f11950c;
                synchronized (jVar) {
                    if (iBinder == null) {
                        jVar.a("Null service connection");
                        return;
                    }
                    try {
                        jVar.f13568c = new n4.y(iBinder);
                        jVar.f13566a = 2;
                        ((ScheduledExecutorService) jVar.f13570f.f13578c).execute(new j6.h(jVar, 0));
                        return;
                    } catch (RemoteException e11) {
                        jVar.a(e11.getMessage());
                        return;
                    }
                }
            case 17:
                a();
                return;
            case 18:
                ki.o oVar2 = (ki.o) this.f11950c;
                ArrayList arrayList = (ArrayList) this.f11949b;
                int size = arrayList.size();
                while (i11 < size) {
                    Object obj4 = arrayList.get(i11);
                    i11++;
                    oVar2.B((s4.h) obj4);
                }
                arrayList.clear();
                oVar2.v.remove(arrayList);
                return;
            case 19:
                Typeface typeface = (Typeface) this.f11950c;
                e2.a0 a0Var2 = (e2.a0) ((xa.c) this.f11949b).f49360b;
                if (a0Var2 != null) {
                    a0Var2.e(typeface);
                    return;
                }
                return;
            case 20:
                ((c5.z) this.f11949b).accept(this.f11950c);
                return;
            case 21:
                co coVar = ((sm) this.f11950c).f40500c;
                if (this == coVar.J5) {
                    coVar.Ya((CharSequence) this.f11949b, false);
                    coVar.J5 = null;
                    return;
                }
                return;
            case 22:
                v8 v8Var = (v8) this.f11949b;
                boolean z22 = v8Var.d.h;
                v8Var.setChecked(!z22);
                vr vrVar = ((rr) this.f11950c).d;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = vrVar.E;
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
                AndroidUtilities.updateVisibleRows(vrVar.f41662c);
                pr w02 = vrVar.w0();
                vrVar.B0();
                vrVar.A0(w02);
                return;
            case 23:
                ((qc) this.f11949b).j();
                ((gz) this.f11950c).E = null;
                return;
            case 24:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.f11949b;
                while (!((Set) this.f11950c).isEmpty()) {
                    try {
                        qb.l lVar = (qb.l) referenceQueue.remove();
                        if (lVar.f44319a.remove(lVar)) {
                            lVar.clear();
                            lVar.f44320b.getClass();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            case 25:
                Callable callable = (Callable) this.f11949b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f11950c;
                try {
                    taskCompletionSource.setResult(callable.call());
                    return;
                } catch (mb.a e12) {
                    taskCompletionSource.setException(e12);
                    return;
                } catch (Exception e13) {
                    taskCompletionSource.setException(new mb.a("Internal error has occurred when executing ML Kit tasks", e13));
                    return;
                }
            case 26:
                qb.i iVar2 = (qb.i) this.f11949b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f11950c;
                int decrementAndGet = iVar2.f44312b.decrementAndGet();
                if (decrementAndGet < 0) {
                    z19 = false;
                }
                n6.l.k(z19);
                if (decrementAndGet == 0) {
                    iVar2.c();
                    iVar2.f44313c.set(false);
                }
                t7.n.f46482a.clear();
                t7.t.f46489a.clear();
                taskCompletionSource2.setResult(null);
                return;
            case 27:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f11949b;
                if (((Thread) ((AtomicReference) mVar.d).getAndSet(Thread.currentThread())) == null) {
                    z18 = true;
                }
                n6.l.k(z18);
                try {
                    ((Runnable) this.f11950c).run();
                    ((AtomicReference) mVar.d).set(null);
                    mVar.y();
                    return;
                } catch (Throwable th6) {
                    try {
                        ((AtomicReference) mVar.d).set(null);
                        mVar.y();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                    throw th6;
                }
            case 28:
                b();
                return;
            default:
                s4.u uVar = (s4.u) this.f11949b;
                c1 c1Var = uVar.f45901e;
                s4.y yVar2 = (s4.y) this.f11950c;
                RecyclerView recyclerView = yVar2.H;
                if (recyclerView != null && recyclerView.G && !uVar.v && c1Var.b() != -1) {
                    m0 itemAnimator = yVar2.H.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.k()) {
                        ArrayList arrayList2 = yVar2.F;
                        int size2 = arrayList2.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            if (((s4.u) arrayList2.get(i16)).f45906w) {
                            }
                        }
                        yVar2.f45932x.q(c1Var);
                        return;
                    }
                    yVar2.H.post(this);
                    return;
                }
                return;
        }
    }

    public String toString() {
        String str;
        switch (this.f11948a) {
            case 0:
                aa.a aVar = new aa.a(s.class.getSimpleName(), 12);
                pf.b bVar = new pf.b(13, false);
                ((pf.b) aVar.d).f44074c = bVar;
                aVar.d = bVar;
                bVar.f44073b = (r) this.f11950c;
                return aVar.toString();
            case 28:
                Runnable runnable = (Runnable) this.f11949b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i10 = ((r9.j) this.f11950c).f45084c;
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
        this.f11948a = i10;
        this.f11950c = obj;
        this.f11949b = obj2;
    }

    public s(r9.j jVar) {
        this.f11948a = 28;
        this.f11950c = jVar;
    }

    public s(s4.y yVar, s4.u uVar, int i10) {
        this.f11948a = 29;
        this.f11950c = yVar;
        this.f11949b = uVar;
    }
}
