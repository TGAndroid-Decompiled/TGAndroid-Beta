package j9;

import android.app.Application;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import be.z0;
import c5.h0;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.j0;
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
import org.telegram.ui.fo;
import org.telegram.ui.kz;
import org.telegram.ui.sr;
import org.telegram.ui.ur;
import org.telegram.ui.vm;
import org.telegram.ui.yr;
import s4.b1;
import s4.l0;
import v7.q8;
public final class u implements Runnable {
    public final int f12946a;
    public Object f12947b;
    public final Object f12948c;

    public u(int i10, Object obj, Object obj2) {
        this.f12946a = i10;
        this.f12947b = obj;
        this.f12948c = obj2;
    }

    private final void a() {
        j6.j jVar = (j6.j) this.f12947b;
        int i10 = ((j6.k) this.f12948c).f12873a;
        synchronized (jVar) {
            j6.k kVar = (j6.k) jVar.e.get(i10);
            if (kVar != 0) {
                Log.w("MessengerIpcClient", "Timing out request: " + i10);
                jVar.e.remove(i10);
                kVar.b(new Exception("Timed out waiting for response", null));
                jVar.c();
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
        int i10 = 0;
        boolean z18 = false;
        int i11 = 0;
        boolean z19 = true;
        switch (this.f12946a) {
            case 0:
                t tVar = (t) this.f12948c;
                y yVar = (y) this.f12947b;
                if (yVar instanceof k9.a) {
                    o oVar = (o) ((k9.a) yVar);
                    if (oVar instanceof g) {
                        Object obj = oVar.f12939a;
                        if (obj instanceof b) {
                            th2 = ((b) obj).f12914a;
                        }
                    }
                    if (th2 != null) {
                        tVar.i(th2);
                        return;
                    }
                }
                try {
                    tVar.onSuccess(q8.a(yVar));
                    return;
                } catch (ExecutionException e) {
                    tVar.i(e.getCause());
                    return;
                } catch (Throwable th3) {
                    tVar.i(th3);
                    return;
                }
            case 1:
                androidx.biometric.z zVar = ((androidx.biometric.q) this.f12948c).f1218l0;
                if (zVar.e == null) {
                    zVar.e = new Object();
                }
                zVar.e.c((androidx.biometric.u) this.f12947b);
                return;
            case 2:
                ((be.m) this.f12948c).D((z0) this.f12947b);
                return;
            case 3:
                c5.c cVar = (c5.c) this.f12947b;
                c5.i iVar = (c5.i) this.f12948c;
                if (((c5.r) cVar.f4335f.f4369c) != null) {
                    ((c5.r) cVar.f4335f.f4369c).onPurchasesUpdated(iVar, null);
                    return;
                } else {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 4:
                Future future = (Future) this.f12947b;
                if (!future.isDone() && !future.isCancelled()) {
                    Runnable runnable = (Runnable) this.f12948c;
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
                c5.i iVar2 = h0.f4376i;
                ((c5.c) this.f12947b).y(24, 7, iVar2);
                com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f5744b;
                com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.e;
                ((org.telegram.messenger.d0) this.f12948c).a(iVar2, new c5.t(vVar, vVar));
                return;
            case 6:
                c5.i iVar3 = h0.f4376i;
                ((c5.c) this.f12947b).y(24, 9, iVar3);
                com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.f5744b;
                ((c5.q) this.f12948c).b(iVar3, com.google.android.gms.internal.play_billing.v.e);
                return;
            case 7:
                c6.e0 e0Var = ((c6.d0) this.f12947b).f4464b;
                g6.d dVar = (g6.d) this.f12948c;
                g6.b bVar = c6.e0.G;
                c6.d dVar2 = dVar.d;
                c6.x xVar = dVar.f9944f;
                c6.d dVar3 = e0Var.f4477t;
                d6.d0 d0Var = e0Var.D;
                if (!g6.a.d(dVar2, dVar3)) {
                    e0Var.f4477t = dVar2;
                    d0Var.c();
                }
                double d = dVar.f9941a;
                if (!Double.isNaN(d) && Math.abs(d - e0Var.v) > 1.0E-7d) {
                    e0Var.v = d;
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z20 = dVar.f9942b;
                if (z20 != e0Var.f4479w) {
                    e0Var.f4479w = z20;
                    z10 = true;
                }
                g6.b bVar2 = c6.e0.G;
                bVar2.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(e0Var.f4470m));
                if (d0Var != null && (z10 || e0Var.f4470m)) {
                    d0Var.f();
                }
                Double.isNaN(dVar.h);
                int i12 = dVar.f9943c;
                if (i12 != e0Var.f4480x) {
                    e0Var.f4480x = i12;
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar2.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(e0Var.f4470m));
                if (d0Var != null && (z11 || e0Var.f4470m)) {
                    d0Var.a();
                }
                int i13 = dVar.e;
                if (i13 != e0Var.f4481y) {
                    e0Var.f4481y = i13;
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar2.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(e0Var.f4470m));
                if (d0Var != null && (z12 || e0Var.f4470m)) {
                    d0Var.e();
                }
                if (!g6.a.d(e0Var.f4482z, xVar)) {
                    e0Var.f4482z = xVar;
                }
                e0Var.f4470m = false;
                return;
            case 8:
                c6.e0 e0Var2 = ((c6.d0) this.f12947b).f4464b;
                g6.b bVar3 = c6.e0.G;
                String str = ((g6.c) this.f12948c).f9940a;
                if (!g6.a.d(str, e0Var2.f4478u)) {
                    e0Var2.f4478u = str;
                    z13 = true;
                } else {
                    z13 = false;
                }
                c6.e0.G.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z13), Boolean.valueOf(e0Var2.f4471n));
                d6.d0 d0Var2 = e0Var2.D;
                if (d0Var2 != null && (z13 || e0Var2.f4471n)) {
                    d0Var2.d();
                }
                e0Var2.f4471n = false;
                return;
            case 9:
                ((be.m) this.f12947b).D((ce.e) this.f12948c);
                return;
            case 10:
                ((com.google.android.gms.internal.cast.r) this.f12947b).M0((p4.r) this.f12948c);
                return;
            case 11:
                ((e0.d) this.f12947b).f8204a = this.f12948c;
                return;
            case 12:
                ((Application) this.f12947b).unregisterActivityLifecycleCallbacks((e0.d) this.f12948c);
                return;
            case 13:
                Object obj2 = this.f12948c;
                Object obj3 = this.f12947b;
                try {
                    Method method = e0.e.d;
                    if (method != null) {
                        method.invoke(obj3, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        e0.e.e.invoke(obj3, obj2, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e7) {
                    if (e7.getClass() == RuntimeException.class && e7.getMessage() != null && e7.getMessage().startsWith("Unable to stop")) {
                        throw e7;
                    }
                    return;
                } catch (Throwable th4) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th4);
                    return;
                }
            case 14:
                g6.v vVar2 = (g6.v) this.f12947b;
                g6.d dVar4 = (g6.d) this.f12948c;
                g6.b bVar4 = g6.v.f9978n0;
                c6.d dVar5 = dVar4.d;
                c6.x xVar2 = dVar4.f9944f;
                c6.d dVar6 = vVar2.U;
                d6.d0 d0Var3 = vVar2.W;
                if (!g6.a.d(dVar5, dVar6)) {
                    vVar2.U = dVar5;
                    d0Var3.c();
                }
                double d10 = dVar4.f9941a;
                if (!Double.isNaN(d10) && Math.abs(d10 - vVar2.f9986f0) > 1.0E-7d) {
                    vVar2.f9986f0 = d10;
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z21 = dVar4.f9942b;
                if (z21 != vVar2.f9983c0) {
                    vVar2.f9983c0 = z21;
                    z14 = true;
                }
                Double.isNaN(dVar4.h);
                g6.b bVar5 = g6.v.f9978n0;
                bVar5.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z14), Boolean.valueOf(vVar2.f9985e0));
                if (d0Var3 != null && (z14 || vVar2.f9985e0)) {
                    d0Var3.f();
                }
                int i14 = dVar4.f9943c;
                if (i14 != vVar2.f9988h0) {
                    vVar2.f9988h0 = i14;
                    z15 = true;
                } else {
                    z15 = false;
                }
                bVar5.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z15), Boolean.valueOf(vVar2.f9985e0));
                if (d0Var3 != null && (z15 || vVar2.f9985e0)) {
                    d0Var3.a();
                }
                int i15 = dVar4.e;
                if (i15 != vVar2.f9989i0) {
                    vVar2.f9989i0 = i15;
                    z16 = true;
                } else {
                    z16 = false;
                }
                bVar5.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z16), Boolean.valueOf(vVar2.f9985e0));
                if (d0Var3 != null && (z16 || vVar2.f9985e0)) {
                    d0Var3.e();
                }
                if (!g6.a.d(vVar2.f9987g0, xVar2)) {
                    vVar2.f9987g0 = xVar2;
                }
                vVar2.f9985e0 = false;
                return;
            case 15:
                g6.v vVar3 = (g6.v) this.f12947b;
                g6.b bVar6 = g6.v.f9978n0;
                String str2 = ((g6.c) this.f12948c).f9940a;
                if (!g6.a.d(str2, vVar3.f9982b0)) {
                    vVar3.f9982b0 = str2;
                    z17 = true;
                } else {
                    z17 = false;
                }
                g6.v.f9978n0.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z17), Boolean.valueOf(vVar3.f9984d0));
                d6.d0 d0Var4 = vVar3.W;
                if (d0Var4 != null && (z17 || vVar3.f9984d0)) {
                    d0Var4.d();
                }
                vVar3.f9984d0 = false;
                return;
            case 16:
                ge.i iVar4 = (ge.i) this.f12948c;
                be.a0 a0Var = iVar4.f10122c;
                while (true) {
                    try {
                        ((Runnable) this.f12947b).run();
                    } catch (Throwable th5) {
                        be.f0.m(th5, kd.i.f14228a);
                    }
                    Runnable f7 = iVar4.f();
                    if (f7 != null) {
                        this.f12947b = f7;
                        i10++;
                        if (i10 >= 16 && a0Var.d()) {
                            a0Var.c(iVar4, this);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                break;
            case 17:
                j6.j jVar = (j6.j) this.f12947b;
                IBinder iBinder = (IBinder) this.f12948c;
                synchronized (jVar) {
                    if (iBinder == null) {
                        jVar.a("Null service connection");
                        return;
                    }
                    try {
                        jVar.f12871c = new n4.s(iBinder);
                        jVar.f12869a = 2;
                        ((ScheduledExecutorService) jVar.f12872f.f12878c).execute(new j6.h(jVar, 0));
                        return;
                    } catch (RemoteException e10) {
                        jVar.a(e10.getMessage());
                        return;
                    }
                }
            case 18:
                a();
                return;
            case 19:
                ki.n nVar = (ki.n) this.f12948c;
                ArrayList arrayList = (ArrayList) this.f12947b;
                int size = arrayList.size();
                while (i11 < size) {
                    Object obj4 = arrayList.get(i11);
                    i11++;
                    nVar.B((s4.i) obj4);
                }
                arrayList.clear();
                nVar.v.remove(arrayList);
                return;
            case 20:
                Typeface typeface = (Typeface) this.f12948c;
                j0 j0Var = (j0) ((a6.i) this.f12947b).f307b;
                if (j0Var != null) {
                    j0Var.g(typeface);
                    return;
                }
                return;
            case 21:
                ((c5.a0) this.f12947b).accept(this.f12948c);
                return;
            case 22:
                fo foVar = ((vm) this.f12948c).f40731c;
                if (this == foVar.J5) {
                    foVar.cb((CharSequence) this.f12947b, false);
                    foVar.J5 = null;
                    return;
                }
                return;
            case 23:
                v8 v8Var = (v8) this.f12947b;
                boolean z22 = v8Var.d.h;
                v8Var.setChecked(!z22);
                yr yrVar = ((ur) this.f12948c).d;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = yrVar.E;
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
                AndroidUtilities.updateVisibleRows(yrVar.f41895c);
                sr w02 = yrVar.w0();
                yrVar.B0();
                yrVar.A0(w02);
                return;
            case 24:
                ((sc) this.f12947b).j();
                ((kz) this.f12948c).E = null;
                return;
            case 25:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.f12947b;
                while (!((Set) this.f12948c).isEmpty()) {
                    try {
                        rb.l lVar = (rb.l) referenceQueue.remove();
                        if (lVar.f43867a.remove(lVar)) {
                            lVar.clear();
                            lVar.f43868b.getClass();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            case 26:
                Callable callable = (Callable) this.f12947b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f12948c;
                try {
                    taskCompletionSource.setResult(callable.call());
                    return;
                } catch (nb.a e11) {
                    taskCompletionSource.setException(e11);
                    return;
                } catch (Exception e12) {
                    taskCompletionSource.setException(new nb.a("Internal error has occurred when executing ML Kit tasks", e12));
                    return;
                }
            case 27:
                rb.i iVar5 = (rb.i) this.f12947b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f12948c;
                int decrementAndGet = iVar5.f43860b.decrementAndGet();
                if (decrementAndGet < 0) {
                    z19 = false;
                }
                n6.l.k(z19);
                if (decrementAndGet == 0) {
                    iVar5.c();
                    iVar5.f43861c.set(false);
                }
                t7.n.f45529a.clear();
                t7.t.f45536a.clear();
                taskCompletionSource2.setResult(null);
                return;
            case 28:
                c2.b bVar7 = (c2.b) this.f12947b;
                if (((Thread) ((AtomicReference) bVar7.d).getAndSet(Thread.currentThread())) == null) {
                    z18 = true;
                }
                n6.l.k(z18);
                try {
                    ((Runnable) this.f12948c).run();
                    ((AtomicReference) bVar7.d).set(null);
                    bVar7.B();
                    return;
                } catch (Throwable th6) {
                    try {
                        ((AtomicReference) bVar7.d).set(null);
                        bVar7.B();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                    throw th6;
                }
            default:
                s4.u uVar = (s4.u) this.f12947b;
                b1 b1Var = uVar.e;
                s4.y yVar2 = (s4.y) this.f12948c;
                RecyclerView recyclerView = yVar2.H;
                if (recyclerView != null && recyclerView.G && !uVar.v && b1Var.b() != -1) {
                    l0 itemAnimator = yVar2.H.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.k()) {
                        ArrayList arrayList2 = yVar2.F;
                        int size2 = arrayList2.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            if (((s4.u) arrayList2.get(i16)).f44965w) {
                            }
                        }
                        yVar2.f44992x.q(b1Var);
                        return;
                    }
                    yVar2.H.post(this);
                    return;
                }
                return;
        }
    }

    public String toString() {
        switch (this.f12946a) {
            case 0:
                androidx.biometric.e eVar = new androidx.biometric.e(u.class.getSimpleName(), 11);
                qf.b bVar = new qf.b(14);
                ((qf.b) eVar.d).f43098c = bVar;
                eVar.d = bVar;
                bVar.f43097b = (t) this.f12948c;
                return eVar.toString();
            default:
                return super.toString();
        }
    }

    public u(Object obj, Object obj2, boolean z10, int i10) {
        this.f12946a = i10;
        this.f12948c = obj;
        this.f12947b = obj2;
    }

    public u(s4.y yVar, s4.u uVar, int i10) {
        this.f12946a = 29;
        this.f12948c = yVar;
        this.f12947b = uVar;
    }
}
