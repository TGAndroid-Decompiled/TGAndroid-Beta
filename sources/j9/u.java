package j9;

import android.app.Application;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
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
import org.telegram.messenger.i0;
import org.telegram.messenger.pi;
import org.telegram.messenger.s1;
import org.telegram.messenger.t1;
import org.telegram.messenger.u1;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.wb;
import org.telegram.ui.hm;
import org.telegram.ui.jr;
import org.telegram.ui.ky;
import org.telegram.ui.lr;
import org.telegram.ui.pr;
import org.telegram.ui.un;
import s4.c1;
import s4.l0;
import v7.p8;
public final class u implements Runnable {
    public final int f9766a;
    public Object f9767b;
    public final Object f9768c;

    public u(int i10, Object obj, Object obj2) {
        this.f9766a = i10;
        this.f9767b = obj;
        this.f9768c = obj2;
    }

    private final void a() {
        j6.j jVar = (j6.j) this.f9767b;
        IBinder iBinder = (IBinder) this.f9768c;
        synchronized (jVar) {
            if (iBinder == null) {
                jVar.a("Null service connection");
                return;
            }
            try {
                jVar.f9694c = new n4.q(iBinder);
                jVar.f9692a = 2;
                ((ScheduledExecutorService) jVar.f9695f.f9701c).execute(new j6.h(jVar, 0));
            } catch (RemoteException e) {
                jVar.a(e.getMessage());
            }
        }
    }

    private final void b() {
        j6.j jVar = (j6.j) this.f9767b;
        int i10 = ((j6.k) this.f9768c).f9696a;
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

    public void c() {
        throw new UnsupportedOperationException("Method not decompiled: j9.u.c():void");
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
        boolean z19 = true;
        switch (this.f9766a) {
            case 0:
                t tVar = (t) this.f9768c;
                y yVar = (y) this.f9767b;
                if (yVar instanceof k9.a) {
                    o oVar = (o) ((k9.a) yVar);
                    if (oVar instanceof g) {
                        Object obj = oVar.f9759a;
                        if (obj instanceof b) {
                            th2 = ((b) obj).f9734a;
                        }
                    }
                    if (th2 != null) {
                        tVar.i(th2);
                        return;
                    }
                }
                try {
                    tVar.onSuccess(p8.a(yVar));
                    return;
                } catch (ExecutionException e) {
                    tVar.i(e.getCause());
                    return;
                } catch (Throwable th3) {
                    tVar.i(th3);
                    return;
                }
            case 1:
                androidx.biometric.y yVar2 = ((androidx.biometric.p) this.f9768c).f1115l0;
                if (yVar2.e == null) {
                    yVar2.e = new Object();
                }
                yVar2.e.c((androidx.biometric.t) this.f9767b);
                return;
            case 2:
                c5.b bVar = (c5.b) this.f9767b;
                c5.g gVar = (c5.g) this.f9768c;
                if (((c5.o) bVar.f3737f.f3783c) != null) {
                    ((u1) ((c5.o) bVar.f3737f.f3783c)).n(gVar, null, null);
                    return;
                } else {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 3:
                Future future = (Future) this.f9767b;
                if (!future.isDone() && !future.isCancelled()) {
                    Runnable runnable = (Runnable) this.f9768c;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                c5.g gVar2 = c5.c0.f3762i;
                ((c5.b) this.f9767b).y(24, 4, gVar2);
                ((c5.h) this.f9768c).a(gVar2);
                return;
            case 5:
                c5.g gVar3 = c5.c0.f3762i;
                ((c5.b) this.f9767b).y(24, 7, gVar3);
                com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f5191b;
                ((t1) ((s1) this.f9768c).f18056b).a(gVar3, com.google.android.gms.internal.play_billing.v.e);
                return;
            case 6:
                c5.g gVar4 = c5.c0.f3762i;
                ((c5.b) this.f9767b).y(24, 9, gVar4);
                com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.f5191b;
                ((c5.n) this.f9768c).b(gVar4, com.google.android.gms.internal.play_billing.v.e);
                return;
            case 7:
                c6.e0 e0Var = ((c6.d0) this.f9767b).f3863b;
                g6.d dVar = (g6.d) this.f9768c;
                g6.b bVar2 = c6.e0.G;
                c6.d dVar2 = dVar.d;
                c6.x xVar = dVar.f7375f;
                c6.d dVar3 = e0Var.f3876t;
                d6.d0 d0Var = e0Var.D;
                if (!g6.a.d(dVar2, dVar3)) {
                    e0Var.f3876t = dVar2;
                    d0Var.c();
                }
                double d = dVar.f7372a;
                if (!Double.isNaN(d) && Math.abs(d - e0Var.v) > 1.0E-7d) {
                    e0Var.v = d;
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z20 = dVar.f7373b;
                if (z20 != e0Var.f3878w) {
                    e0Var.f3878w = z20;
                    z10 = true;
                }
                g6.b bVar3 = c6.e0.G;
                bVar3.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(e0Var.f3869m));
                if (d0Var != null && (z10 || e0Var.f3869m)) {
                    d0Var.f();
                }
                Double.isNaN(dVar.h);
                int i11 = dVar.f7374c;
                if (i11 != e0Var.f3879x) {
                    e0Var.f3879x = i11;
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar3.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(e0Var.f3869m));
                if (d0Var != null && (z11 || e0Var.f3869m)) {
                    d0Var.a();
                }
                int i12 = dVar.e;
                if (i12 != e0Var.f3880y) {
                    e0Var.f3880y = i12;
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar3.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(e0Var.f3869m));
                if (d0Var != null && (z12 || e0Var.f3869m)) {
                    d0Var.e();
                }
                if (!g6.a.d(e0Var.f3881z, xVar)) {
                    e0Var.f3881z = xVar;
                }
                e0Var.f3869m = false;
                return;
            case 8:
                c6.e0 e0Var2 = ((c6.d0) this.f9767b).f3863b;
                g6.b bVar4 = c6.e0.G;
                String str = ((g6.c) this.f9768c).f7371a;
                if (!g6.a.d(str, e0Var2.f3877u)) {
                    e0Var2.f3877u = str;
                    z13 = true;
                } else {
                    z13 = false;
                }
                c6.e0.G.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z13), Boolean.valueOf(e0Var2.f3870n));
                d6.d0 d0Var2 = e0Var2.D;
                if (d0Var2 != null && (z13 || e0Var2.f3870n)) {
                    d0Var2.d();
                }
                e0Var2.f3870n = false;
                return;
            case 9:
                ci.o oVar2 = (ci.o) this.f9768c;
                ArrayList arrayList = (ArrayList) this.f9767b;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    oVar2.B((s4.h) obj2);
                }
                arrayList.clear();
                oVar2.v.remove(arrayList);
                return;
            case 10:
                ((com.google.android.gms.internal.cast.q) this.f9767b).O0((p4.s) this.f9768c);
                return;
            case 11:
                ((e0.d) this.f9767b).f5999a = this.f9768c;
                return;
            case 12:
                ((Application) this.f9767b).unregisterActivityLifecycleCallbacks((e0.d) this.f9768c);
                return;
            case 13:
                Object obj3 = this.f9768c;
                Object obj4 = this.f9767b;
                try {
                    Method method = e0.e.d;
                    if (method != null) {
                        method.invoke(obj4, obj3, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        e0.e.e.invoke(obj4, obj3, Boolean.FALSE);
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
                g6.v vVar = (g6.v) this.f9767b;
                g6.d dVar4 = (g6.d) this.f9768c;
                g6.b bVar5 = g6.v.f7409n0;
                c6.d dVar5 = dVar4.d;
                c6.x xVar2 = dVar4.f7375f;
                c6.d dVar6 = vVar.U;
                d6.d0 d0Var3 = vVar.W;
                if (!g6.a.d(dVar5, dVar6)) {
                    vVar.U = dVar5;
                    d0Var3.c();
                }
                double d10 = dVar4.f7372a;
                if (!Double.isNaN(d10) && Math.abs(d10 - vVar.f7417f0) > 1.0E-7d) {
                    vVar.f7417f0 = d10;
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z21 = dVar4.f7373b;
                if (z21 != vVar.f7414c0) {
                    vVar.f7414c0 = z21;
                    z14 = true;
                }
                Double.isNaN(dVar4.h);
                g6.b bVar6 = g6.v.f7409n0;
                bVar6.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z14), Boolean.valueOf(vVar.f7416e0));
                if (d0Var3 != null && (z14 || vVar.f7416e0)) {
                    d0Var3.f();
                }
                int i13 = dVar4.f7374c;
                if (i13 != vVar.f7419h0) {
                    vVar.f7419h0 = i13;
                    z15 = true;
                } else {
                    z15 = false;
                }
                bVar6.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z15), Boolean.valueOf(vVar.f7416e0));
                if (d0Var3 != null && (z15 || vVar.f7416e0)) {
                    d0Var3.a();
                }
                int i14 = dVar4.e;
                if (i14 != vVar.f7420i0) {
                    vVar.f7420i0 = i14;
                    z16 = true;
                } else {
                    z16 = false;
                }
                bVar6.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z16), Boolean.valueOf(vVar.f7416e0));
                if (d0Var3 != null && (z16 || vVar.f7416e0)) {
                    d0Var3.e();
                }
                if (!g6.a.d(vVar.f7418g0, xVar2)) {
                    vVar.f7418g0 = xVar2;
                }
                vVar.f7416e0 = false;
                return;
            case 15:
                g6.v vVar2 = (g6.v) this.f9767b;
                g6.b bVar7 = g6.v.f7409n0;
                String str2 = ((g6.c) this.f9768c).f7371a;
                if (!g6.a.d(str2, vVar2.f7413b0)) {
                    vVar2.f7413b0 = str2;
                    z17 = true;
                } else {
                    z17 = false;
                }
                g6.v.f7409n0.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z17), Boolean.valueOf(vVar2.f7415d0));
                d6.d0 d0Var4 = vVar2.W;
                if (d0Var4 != null && (z17 || vVar2.f7415d0)) {
                    d0Var4.d();
                }
                vVar2.f7415d0 = false;
                return;
            case 16:
                a();
                return;
            case 17:
                b();
                return;
            case 18:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.f9767b;
                while (!((Set) this.f9768c).isEmpty()) {
                    try {
                        jb.l lVar = (jb.l) referenceQueue.remove();
                        if (lVar.f9796a.remove(lVar)) {
                            lVar.clear();
                            lVar.f9797b.getClass();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            case 19:
                Callable callable = (Callable) this.f9767b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f9768c;
                try {
                    taskCompletionSource.setResult(callable.call());
                    return;
                } catch (fb.a e10) {
                    taskCompletionSource.setException(e10);
                    return;
                } catch (Exception e11) {
                    taskCompletionSource.setException(new fb.a("Internal error has occurred when executing ML Kit tasks", e11));
                    return;
                }
            case 20:
                jb.i iVar = (jb.i) this.f9767b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f9768c;
                int decrementAndGet = iVar.f9789b.decrementAndGet();
                if (decrementAndGet < 0) {
                    z19 = false;
                }
                n6.l.j(z19);
                if (decrementAndGet == 0) {
                    iVar.c();
                    iVar.f9790c.set(false);
                }
                t7.n.f48562a.clear();
                t7.t.f48569a.clear();
                taskCompletionSource2.setResult(null);
                return;
            case 21:
                ac.a aVar = (ac.a) this.f9767b;
                if (((Thread) ((AtomicReference) aVar.d).getAndSet(Thread.currentThread())) == null) {
                    z18 = true;
                }
                n6.l.j(z18);
                try {
                    ((Runnable) this.f9768c).run();
                    ((AtomicReference) aVar.d).set(null);
                    aVar.E();
                    return;
                } catch (Throwable th5) {
                    try {
                        ((AtomicReference) aVar.d).set(null);
                        aVar.E();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            case 22:
                Typeface typeface = (Typeface) this.f9768c;
                j0 j0Var = (j0) ((za.c) this.f9767b).f55450b;
                if (j0Var != null) {
                    j0Var.h(typeface);
                    return;
                }
                return;
            case 23:
                ((c5.v) this.f9767b).accept(this.f9768c);
                return;
            case 24:
                ArrayList arrayList2 = (ArrayList) this.f9767b;
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    if (arrayList2.get(i15) != null && ((cp) arrayList2.get(i15)).f25197a != null) {
                        ((cp) arrayList2.get(i15)).f25197a.m(0);
                    }
                }
                i0.g3(new pi(0, this, arrayList2));
                return;
            case 25:
                un unVar = ((hm) this.f9768c).f37835b;
                if (this == unVar.Z5) {
                    unVar.tb((CharSequence) this.f9767b, false);
                    unVar.Z5 = null;
                    return;
                }
                return;
            case 26:
                s8 s8Var = (s8) this.f9767b;
                boolean z22 = s8Var.d.h;
                s8Var.setChecked(!z22);
                pr prVar = ((lr) this.f9768c).d;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = prVar.D;
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
                i0.a4(prVar.f40531c);
                jr B0 = prVar.B0();
                prVar.G0();
                prVar.F0(B0);
                return;
            case 27:
                ((wb) this.f9767b).j();
                ((ky) this.f9768c).E = null;
                return;
            case 28:
                s4.t tVar2 = (s4.t) this.f9767b;
                c1 c1Var = tVar2.e;
                s4.x xVar3 = (s4.x) this.f9768c;
                RecyclerView recyclerView = xVar3.H;
                if (recyclerView != null && recyclerView.G && !tVar2.f48018w && c1Var.b() != -1) {
                    l0 itemAnimator = xVar3.H.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.k()) {
                        ArrayList arrayList3 = xVar3.F;
                        int size2 = arrayList3.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            if (((s4.t) arrayList3.get(i16)).f48019x) {
                            }
                        }
                        xVar3.f48041y.q(c1Var);
                        return;
                    }
                    xVar3.H.post(this);
                    return;
                }
                return;
            default:
                try {
                    c();
                    return;
                } catch (Error e12) {
                    synchronized (((s9.j) this.f9768c).f48128b) {
                        ((s9.j) this.f9768c).f48129c = 1;
                        throw e12;
                    }
                }
        }
    }

    public String toString() {
        String str;
        switch (this.f9766a) {
            case 0:
                android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(u.class.getSimpleName(), 13);
                hf.b bVar = new hf.b(14, false);
                ((hf.b) a0Var.d).f7659c = bVar;
                a0Var.d = bVar;
                bVar.f7658b = (t) this.f9768c;
                return a0Var.toString();
            case 29:
                Runnable runnable = (Runnable) this.f9767b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i10 = ((s9.j) this.f9768c).f48129c;
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

    public u(c5.b bVar, c5.h hVar, k6.h hVar2) {
        this.f9766a = 4;
        this.f9767b = bVar;
        this.f9768c = hVar;
    }

    public u(Object obj, Object obj2, boolean z10, int i10) {
        this.f9766a = i10;
        this.f9768c = obj;
        this.f9767b = obj2;
    }

    public u(s9.j jVar) {
        this.f9766a = 29;
        this.f9768c = jVar;
    }

    public u(s4.x xVar, s4.t tVar, int i10) {
        this.f9766a = 28;
        this.f9768c = xVar;
        this.f9767b = tVar;
    }
}
