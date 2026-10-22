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
import org.telegram.ui.Cells.u8;
import org.telegram.ui.Components.qc;
import org.telegram.ui.br;
import org.telegram.ui.dr;
import org.telegram.ui.hm;
import org.telegram.ui.hr;
import org.telegram.ui.oy;
import org.telegram.ui.qn;
import s4.b1;
import s4.l0;
import v7.q8;
public final class u implements Runnable {
    public final int f14358a;
    public Object f14359b;
    public final Object f14360c;

    public u(int i10, Object obj, Object obj2) {
        this.f14358a = i10;
        this.f14359b = obj;
        this.f14360c = obj2;
    }

    private final void a() {
        j6.j jVar = (j6.j) this.f14359b;
        int i10 = ((j6.k) this.f14360c).f14285a;
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
        switch (this.f14358a) {
            case 0:
                t tVar = (t) this.f14360c;
                y yVar = (y) this.f14359b;
                if (yVar instanceof k9.a) {
                    o oVar = (o) ((k9.a) yVar);
                    if (oVar instanceof g) {
                        Object obj = oVar.f14351a;
                        if (obj instanceof b) {
                            th2 = ((b) obj).f14326a;
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
                androidx.biometric.y yVar2 = ((androidx.biometric.q) this.f14360c).f2833l0;
                if (yVar2.e == null) {
                    yVar2.e = new Object();
                }
                yVar2.e.c((androidx.biometric.t) this.f14359b);
                return;
            case 2:
                ((be.m) this.f14360c).D((z0) this.f14359b);
                return;
            case 3:
                c5.c cVar = (c5.c) this.f14359b;
                c5.i iVar = (c5.i) this.f14360c;
                if (((c5.r) cVar.f4703f.f4737c) != null) {
                    ((c5.r) cVar.f4703f.f4737c).onPurchasesUpdated(iVar, null);
                    return;
                } else {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 4:
                Future future = (Future) this.f14359b;
                if (!future.isDone() && !future.isCancelled()) {
                    Runnable runnable = (Runnable) this.f14360c;
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
                c5.i iVar2 = h0.f4744i;
                ((c5.c) this.f14359b).y(24, 7, iVar2);
                com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f7198b;
                com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.e;
                ((org.telegram.messenger.d0) this.f14360c).a(iVar2, new c5.t(vVar, vVar));
                return;
            case 6:
                c5.i iVar3 = h0.f4744i;
                ((c5.c) this.f14359b).y(24, 9, iVar3);
                com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.f7198b;
                ((c5.q) this.f14360c).b(iVar3, com.google.android.gms.internal.play_billing.v.e);
                return;
            case 7:
                c6.e0 e0Var = ((c6.d0) this.f14359b).f4832b;
                g6.d dVar = (g6.d) this.f14360c;
                g6.b bVar = c6.e0.G;
                c6.d dVar2 = dVar.d;
                c6.x xVar = dVar.f10849f;
                c6.d dVar3 = e0Var.f4845t;
                d6.d0 d0Var = e0Var.D;
                if (!g6.a.d(dVar2, dVar3)) {
                    e0Var.f4845t = dVar2;
                    d0Var.c();
                }
                double d = dVar.f10846a;
                if (!Double.isNaN(d) && Math.abs(d - e0Var.v) > 1.0E-7d) {
                    e0Var.v = d;
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z20 = dVar.f10847b;
                if (z20 != e0Var.f4847w) {
                    e0Var.f4847w = z20;
                    z10 = true;
                }
                g6.b bVar2 = c6.e0.G;
                bVar2.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(e0Var.f4838m));
                if (d0Var != null && (z10 || e0Var.f4838m)) {
                    d0Var.f();
                }
                Double.isNaN(dVar.h);
                int i12 = dVar.f10848c;
                if (i12 != e0Var.f4848x) {
                    e0Var.f4848x = i12;
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar2.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(e0Var.f4838m));
                if (d0Var != null && (z11 || e0Var.f4838m)) {
                    d0Var.a();
                }
                int i13 = dVar.e;
                if (i13 != e0Var.f4849y) {
                    e0Var.f4849y = i13;
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar2.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(e0Var.f4838m));
                if (d0Var != null && (z12 || e0Var.f4838m)) {
                    d0Var.e();
                }
                if (!g6.a.d(e0Var.f4850z, xVar)) {
                    e0Var.f4850z = xVar;
                }
                e0Var.f4838m = false;
                return;
            case 8:
                c6.e0 e0Var2 = ((c6.d0) this.f14359b).f4832b;
                g6.b bVar3 = c6.e0.G;
                String str = ((g6.c) this.f14360c).f10845a;
                if (!g6.a.d(str, e0Var2.f4846u)) {
                    e0Var2.f4846u = str;
                    z13 = true;
                } else {
                    z13 = false;
                }
                c6.e0.G.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z13), Boolean.valueOf(e0Var2.f4839n));
                d6.d0 d0Var2 = e0Var2.D;
                if (d0Var2 != null && (z13 || e0Var2.f4839n)) {
                    d0Var2.d();
                }
                e0Var2.f4839n = false;
                return;
            case 9:
                ((be.m) this.f14359b).D((ce.e) this.f14360c);
                return;
            case 10:
                ((com.google.android.gms.internal.cast.r) this.f14359b).M0((p4.r) this.f14360c);
                return;
            case 11:
                ((e0.c) this.f14359b).f8078a = this.f14360c;
                return;
            case 12:
                ((Application) this.f14359b).unregisterActivityLifecycleCallbacks((e0.c) this.f14360c);
                return;
            case 13:
                Object obj2 = this.f14360c;
                Object obj3 = this.f14359b;
                try {
                    Method method = e0.d.d;
                    if (method != null) {
                        method.invoke(obj3, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        e0.d.e.invoke(obj3, obj2, Boolean.FALSE);
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
                g6.v vVar2 = (g6.v) this.f14359b;
                g6.d dVar4 = (g6.d) this.f14360c;
                g6.b bVar4 = g6.v.f10883n0;
                c6.d dVar5 = dVar4.d;
                c6.x xVar2 = dVar4.f10849f;
                c6.d dVar6 = vVar2.U;
                d6.d0 d0Var3 = vVar2.W;
                if (!g6.a.d(dVar5, dVar6)) {
                    vVar2.U = dVar5;
                    d0Var3.c();
                }
                double d10 = dVar4.f10846a;
                if (!Double.isNaN(d10) && Math.abs(d10 - vVar2.f10891f0) > 1.0E-7d) {
                    vVar2.f10891f0 = d10;
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z21 = dVar4.f10847b;
                if (z21 != vVar2.f10888c0) {
                    vVar2.f10888c0 = z21;
                    z14 = true;
                }
                Double.isNaN(dVar4.h);
                g6.b bVar5 = g6.v.f10883n0;
                bVar5.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z14), Boolean.valueOf(vVar2.f10890e0));
                if (d0Var3 != null && (z14 || vVar2.f10890e0)) {
                    d0Var3.f();
                }
                int i14 = dVar4.f10848c;
                if (i14 != vVar2.f10893h0) {
                    vVar2.f10893h0 = i14;
                    z15 = true;
                } else {
                    z15 = false;
                }
                bVar5.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z15), Boolean.valueOf(vVar2.f10890e0));
                if (d0Var3 != null && (z15 || vVar2.f10890e0)) {
                    d0Var3.a();
                }
                int i15 = dVar4.e;
                if (i15 != vVar2.f10894i0) {
                    vVar2.f10894i0 = i15;
                    z16 = true;
                } else {
                    z16 = false;
                }
                bVar5.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z16), Boolean.valueOf(vVar2.f10890e0));
                if (d0Var3 != null && (z16 || vVar2.f10890e0)) {
                    d0Var3.e();
                }
                if (!g6.a.d(vVar2.f10892g0, xVar2)) {
                    vVar2.f10892g0 = xVar2;
                }
                vVar2.f10890e0 = false;
                return;
            case 15:
                g6.v vVar3 = (g6.v) this.f14359b;
                g6.b bVar6 = g6.v.f10883n0;
                String str2 = ((g6.c) this.f14360c).f10845a;
                if (!g6.a.d(str2, vVar3.f10887b0)) {
                    vVar3.f10887b0 = str2;
                    z17 = true;
                } else {
                    z17 = false;
                }
                g6.v.f10883n0.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z17), Boolean.valueOf(vVar3.f10889d0));
                d6.d0 d0Var4 = vVar3.W;
                if (d0Var4 != null && (z17 || vVar3.f10889d0)) {
                    d0Var4.d();
                }
                vVar3.f10889d0 = false;
                return;
            case 16:
                ge.i iVar4 = (ge.i) this.f14360c;
                be.a0 a0Var = iVar4.f11025c;
                while (true) {
                    try {
                        ((Runnable) this.f14359b).run();
                    } catch (Throwable th5) {
                        be.f0.m(th5, kd.i.f15029a);
                    }
                    Runnable f7 = iVar4.f();
                    if (f7 != null) {
                        this.f14359b = f7;
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
                j6.j jVar = (j6.j) this.f14359b;
                IBinder iBinder = (IBinder) this.f14360c;
                synchronized (jVar) {
                    if (iBinder == null) {
                        jVar.a("Null service connection");
                        return;
                    }
                    try {
                        jVar.f14283c = new n4.s(iBinder);
                        jVar.f14281a = 2;
                        ((ScheduledExecutorService) jVar.f14284f.f14290c).execute(new j6.h(jVar, 0));
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
                li.m mVar = (li.m) this.f14360c;
                ArrayList arrayList = (ArrayList) this.f14359b;
                int size = arrayList.size();
                while (i11 < size) {
                    Object obj4 = arrayList.get(i11);
                    i11++;
                    mVar.B((s4.i) obj4);
                }
                arrayList.clear();
                mVar.v.remove(arrayList);
                return;
            case 20:
                Typeface typeface = (Typeface) this.f14360c;
                j0 j0Var = (j0) ((a6.i) this.f14359b).f307b;
                if (j0Var != null) {
                    j0Var.e(typeface);
                    return;
                }
                return;
            case 21:
                ((c5.a0) this.f14359b).accept(this.f14360c);
                return;
            case 22:
                qn qnVar = ((hm) this.f14360c).f37691c;
                if (this == qnVar.J5) {
                    qnVar.cb((CharSequence) this.f14359b, false);
                    qnVar.J5 = null;
                    return;
                }
                return;
            case 23:
                u8 u8Var = (u8) this.f14359b;
                boolean z22 = u8Var.d.h;
                u8Var.setChecked(!z22);
                hr hrVar = ((dr) this.f14360c).d;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = hrVar.E;
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
                AndroidUtilities.updateVisibleRows(hrVar.f37725c);
                br w02 = hrVar.w0();
                hrVar.B0();
                hrVar.A0(w02);
                return;
            case 24:
                ((qc) this.f14359b).j();
                ((oy) this.f14360c).E = null;
                return;
            case 25:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.f14359b;
                while (!((Set) this.f14360c).isEmpty()) {
                    try {
                        rb.l lVar = (rb.l) referenceQueue.remove();
                        if (lVar.f45208a.remove(lVar)) {
                            lVar.clear();
                            lVar.f45209b.getClass();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            case 26:
                Callable callable = (Callable) this.f14359b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f14360c;
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
                rb.i iVar5 = (rb.i) this.f14359b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f14360c;
                int decrementAndGet = iVar5.f45201b.decrementAndGet();
                if (decrementAndGet < 0) {
                    z19 = false;
                }
                n6.l.k(z19);
                if (decrementAndGet == 0) {
                    iVar5.c();
                    iVar5.f45202c.set(false);
                }
                t7.n.f46900a.clear();
                t7.t.f46907a.clear();
                taskCompletionSource2.setResult(null);
                return;
            case 28:
                c2.b bVar7 = (c2.b) this.f14359b;
                if (((Thread) ((AtomicReference) bVar7.d).getAndSet(Thread.currentThread())) == null) {
                    z18 = true;
                }
                n6.l.k(z18);
                try {
                    ((Runnable) this.f14360c).run();
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
                s4.u uVar = (s4.u) this.f14359b;
                b1 b1Var = uVar.e;
                s4.y yVar3 = (s4.y) this.f14360c;
                RecyclerView recyclerView = yVar3.H;
                if (recyclerView != null && recyclerView.G && !uVar.v && b1Var.b() != -1) {
                    l0 itemAnimator = yVar3.H.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.k()) {
                        ArrayList arrayList2 = yVar3.F;
                        int size2 = arrayList2.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            if (((s4.u) arrayList2.get(i16)).f46047w) {
                            }
                        }
                        yVar3.f46074x.q(b1Var);
                        return;
                    }
                    yVar3.H.post(this);
                    return;
                }
                return;
        }
    }

    public String toString() {
        switch (this.f14358a) {
            case 0:
                androidx.biometric.e eVar = new androidx.biometric.e(u.class.getSimpleName(), 11);
                qf.b bVar = new qf.b(12);
                ((qf.b) eVar.d).f44451c = bVar;
                eVar.d = bVar;
                bVar.f44450b = (t) this.f14360c;
                return eVar.toString();
            default:
                return super.toString();
        }
    }

    public u(Object obj, Object obj2, boolean z10, int i10) {
        this.f14358a = i10;
        this.f14360c = obj;
        this.f14359b = obj2;
    }

    public u(s4.y yVar, s4.u uVar, int i10) {
        this.f14358a = 29;
        this.f14360c = yVar;
        this.f14359b = uVar;
    }
}
