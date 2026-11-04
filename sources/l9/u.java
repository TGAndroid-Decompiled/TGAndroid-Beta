package l9;

import android.app.Application;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import b8.yd;
import com.google.android.gms.tasks.TaskCompletionSource;
import g2.k0;
import gi.w5;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.p1;
import org.telegram.messenger.q1;
import org.telegram.messenger.r1;
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.uo;
import org.telegram.ui.fx;
import org.telegram.ui.gq;
import org.telegram.ui.hl;
import org.telegram.ui.iq;
import org.telegram.ui.nq;
import org.telegram.ui.wm;
import u4.d1;
import u4.m0;
public final class u implements Runnable {
    public final int f18164a;
    public Object f18165b;
    public final Object f18166c;

    public u(int i3, Object obj, Object obj2) {
        this.f18164a = i3;
        this.f18165b = obj;
        this.f18166c = obj2;
    }

    private final void a() {
        l6.k kVar = (l6.k) this.f18165b;
        int i3 = ((l6.l) this.f18166c).f18083a;
        synchronized (kVar) {
            SparseArray sparseArray = kVar.f18081e;
            l6.l lVar = (l6.l) sparseArray.get(i3);
            if (lVar != 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 20);
                sb2.append("Timing out request: ");
                sb2.append(i3);
                Log.w("MessengerIpcClient", sb2.toString());
                sparseArray.remove(i3);
                lVar.c(new Exception("Timed out waiting for response", null));
                kVar.d();
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
        int i3 = 0;
        int i10 = 0;
        boolean z18 = false;
        boolean z19 = true;
        switch (this.f18164a) {
            case 0:
                t tVar = (t) this.f18166c;
                y yVar = (y) this.f18165b;
                if (yVar instanceof m9.a) {
                    o oVar = (o) ((m9.a) yVar);
                    if (oVar instanceof g) {
                        Object obj = oVar.f18157a;
                        if (obj instanceof b) {
                            th2 = ((b) obj).f18129a;
                        }
                    }
                    if (th2 != null) {
                        tVar.h(th2);
                        return;
                    }
                }
                try {
                    tVar.onSuccess(yd.a(yVar));
                    return;
                } catch (ExecutionException e10) {
                    tVar.h(e10.getCause());
                    return;
                } catch (Throwable th3) {
                    tVar.h(th3);
                    return;
                }
            case 1:
                androidx.biometric.z zVar = ((androidx.biometric.q) this.f18166c).m0;
                if (zVar.f1452e == null) {
                    zVar.f1452e = new Object();
                }
                zVar.f1452e.c((androidx.biometric.u) this.f18165b);
                return;
            case 2:
                be.g gVar = (be.g) this.f18166c;
                wd.x xVar = gVar.d;
                while (true) {
                    try {
                        ((Runnable) this.f18165b).run();
                    } catch (Throwable th4) {
                        wd.b0.m(fd.i.f11567a, th4);
                    }
                    Runnable g7 = gVar.g();
                    if (g7 != null) {
                        this.f18165b = g7;
                        i3++;
                        if (i3 >= 16 && xVar.e(gVar)) {
                            xVar.c(gVar, this);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                break;
            case 3:
                ((com.google.android.gms.internal.cast.q) this.f18165b).O0((r4.r) this.f18166c);
                return;
            case 4:
                ((e0.c) this.f18165b).f9206a = this.f18166c;
                return;
            case 5:
                ((Application) this.f18165b).unregisterActivityLifecycleCallbacks((e0.c) this.f18166c);
                return;
            case 6:
                Object obj2 = this.f18166c;
                Object obj3 = this.f18165b;
                try {
                    Method method = e0.d.d;
                    if (method != null) {
                        method.invoke(obj3, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        e0.d.f9214e.invoke(obj3, obj2, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e11) {
                    if (e11.getClass() == RuntimeException.class && e11.getMessage() != null && e11.getMessage().startsWith("Unable to stop")) {
                        throw e11;
                    }
                    return;
                } catch (Throwable th5) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th5);
                    return;
                }
            case 7:
                e5.b bVar = (e5.b) this.f18165b;
                e5.f fVar = (e5.f) this.f18166c;
                if (((e5.n) bVar.f9563f.f9590c) != null) {
                    ((r1) ((e5.n) bVar.f9563f.f9590c)).n(fVar, null, null);
                    return;
                } else {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 8:
                Future future = (Future) this.f18165b;
                if (!future.isDone() && !future.isCancelled()) {
                    Runnable runnable = (Runnable) this.f18166c;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                e5.f fVar2 = e5.z.f9644i;
                ((e5.b) this.f18165b).y(24, 4, fVar2);
                ((e5.g) this.f18166c).a(fVar2);
                return;
            case 10:
                e5.f fVar3 = e5.z.f9644i;
                ((e5.b) this.f18165b).y(24, 7, fVar3);
                com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f7499b;
                ((q1) ((p1) this.f18166c).f24685b).k(fVar3, com.google.android.gms.internal.play_billing.v.f7526e);
                return;
            case 11:
                e5.f fVar4 = e5.z.f9644i;
                ((e5.b) this.f18165b).y(24, 9, fVar4);
                com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.f7499b;
                ((e5.m) this.f18166c).a(fVar4, com.google.android.gms.internal.play_billing.v.f7526e);
                return;
            case 12:
                e6.e0 e0Var = ((e6.d0) this.f18165b).f9689b;
                i6.d dVar = (i6.d) this.f18166c;
                i6.b bVar2 = e6.e0.H;
                e6.d dVar2 = dVar.d;
                e6.x xVar2 = dVar.f14628f;
                e6.d dVar3 = e0Var.f9702u;
                f6.e0 e0Var2 = e0Var.E;
                if (!i6.a.d(dVar2, dVar3)) {
                    e0Var.f9702u = dVar2;
                    e0Var2.c();
                }
                double d = dVar.f14624a;
                if (!Double.isNaN(d) && Math.abs(d - e0Var.f9703w) > 1.0E-7d) {
                    e0Var.f9703w = d;
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z20 = dVar.f14625b;
                if (z20 != e0Var.f9704x) {
                    e0Var.f9704x = z20;
                    z10 = true;
                }
                i6.b bVar3 = e6.e0.H;
                bVar3.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(e0Var.f9695n));
                if (e0Var2 != null && (z10 || e0Var.f9695n)) {
                    e0Var2.f();
                }
                Double.isNaN(dVar.h);
                int i11 = dVar.f14626c;
                if (i11 != e0Var.f9705y) {
                    e0Var.f9705y = i11;
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar3.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(e0Var.f9695n));
                if (e0Var2 != null && (z11 || e0Var.f9695n)) {
                    e0Var2.a();
                }
                int i12 = dVar.f14627e;
                if (i12 != e0Var.f9706z) {
                    e0Var.f9706z = i12;
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar3.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(e0Var.f9695n));
                if (e0Var2 != null && (z12 || e0Var.f9695n)) {
                    e0Var2.e();
                }
                if (!i6.a.d(e0Var.A, xVar2)) {
                    e0Var.A = xVar2;
                }
                e0Var.f9695n = false;
                return;
            case 13:
                e6.e0 e0Var3 = ((e6.d0) this.f18165b).f9689b;
                i6.b bVar4 = e6.e0.H;
                String str = ((i6.c) this.f18166c).f14623a;
                if (!i6.a.d(str, e0Var3.v)) {
                    e0Var3.v = str;
                    z13 = true;
                } else {
                    z13 = false;
                }
                e6.e0.H.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z13), Boolean.valueOf(e0Var3.f9696o));
                f6.e0 e0Var4 = e0Var3.E;
                if (e0Var4 != null && (z13 || e0Var3.f9696o)) {
                    e0Var4.d();
                }
                e0Var3.f9696o = false;
                return;
            case 14:
                i6.v vVar = (i6.v) this.f18165b;
                i6.d dVar4 = (i6.d) this.f18166c;
                i6.b bVar5 = i6.v.Y;
                e6.d dVar5 = dVar4.d;
                e6.x xVar3 = dVar4.f14628f;
                e6.d dVar6 = vVar.F;
                f6.e0 e0Var5 = vVar.H;
                if (!i6.a.d(dVar5, dVar6)) {
                    vVar.F = dVar5;
                    e0Var5.c();
                }
                double d10 = dVar4.f14624a;
                if (!Double.isNaN(d10) && Math.abs(d10 - vVar.Q) > 1.0E-7d) {
                    vVar.Q = d10;
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z21 = dVar4.f14625b;
                if (z21 != vVar.N) {
                    vVar.N = z21;
                    z14 = true;
                }
                Double.isNaN(dVar4.h);
                i6.b bVar6 = i6.v.Y;
                bVar6.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z14), Boolean.valueOf(vVar.P));
                if (e0Var5 != null && (z14 || vVar.P)) {
                    e0Var5.f();
                }
                int i13 = dVar4.f14626c;
                if (i13 != vVar.S) {
                    vVar.S = i13;
                    z15 = true;
                } else {
                    z15 = false;
                }
                bVar6.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z15), Boolean.valueOf(vVar.P));
                if (e0Var5 != null && (z15 || vVar.P)) {
                    e0Var5.a();
                }
                int i14 = dVar4.f14627e;
                if (i14 != vVar.T) {
                    vVar.T = i14;
                    z16 = true;
                } else {
                    z16 = false;
                }
                bVar6.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z16), Boolean.valueOf(vVar.P));
                if (e0Var5 != null && (z16 || vVar.P)) {
                    e0Var5.e();
                }
                if (!i6.a.d(vVar.R, xVar3)) {
                    vVar.R = xVar3;
                }
                vVar.P = false;
                return;
            case 15:
                i6.v vVar2 = (i6.v) this.f18165b;
                i6.b bVar7 = i6.v.Y;
                String str2 = ((i6.c) this.f18166c).f14623a;
                if (!i6.a.d(str2, vVar2.M)) {
                    vVar2.M = str2;
                    z17 = true;
                } else {
                    z17 = false;
                }
                i6.v.Y.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z17), Boolean.valueOf(vVar2.O));
                f6.e0 e0Var6 = vVar2.H;
                if (e0Var6 != null && (z17 || vVar2.O)) {
                    e0Var6.d();
                }
                vVar2.O = false;
                return;
            case 16:
                IBinder iBinder = (IBinder) this.f18166c;
                l6.k kVar = (l6.k) this.f18165b;
                synchronized (kVar) {
                    if (iBinder == null) {
                        kVar.b("Null service connection");
                        return;
                    }
                    try {
                        kVar.f18080c = new p4.q(iBinder);
                        kVar.f18078a = 2;
                        ((ScheduledExecutorService) kVar.f18082f.f18090c).execute(new l6.i(kVar, 1));
                        return;
                    } catch (RemoteException e12) {
                        kVar.b(e12.getMessage());
                        return;
                    }
                }
            case 17:
                a();
                return;
            case 18:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.f18165b;
                while (!((Set) this.f18166c).isEmpty()) {
                    try {
                        mb.l lVar = (mb.l) referenceQueue.remove();
                        if (lVar.f19243a.remove(lVar)) {
                            lVar.clear();
                            lVar.f19244b.getClass();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            case 19:
                Callable callable = (Callable) this.f18165b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f18166c;
                try {
                    taskCompletionSource.setResult(callable.call());
                    return;
                } catch (ib.a e13) {
                    taskCompletionSource.setException(e13);
                    return;
                } catch (Exception e14) {
                    taskCompletionSource.setException(new ib.a("Internal error has occurred when executing ML Kit tasks", e14));
                    return;
                }
            case 20:
                mb.i iVar = (mb.i) this.f18165b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f18166c;
                int decrementAndGet = iVar.f19236b.decrementAndGet();
                if (decrementAndGet < 0) {
                    z19 = false;
                }
                p6.m.j(z19);
                if (decrementAndGet == 0) {
                    iVar.c();
                    iVar.f19237c.set(false);
                }
                v7.n.f56468a.clear();
                v7.r.f56472a.clear();
                taskCompletionSource2.setResult(null);
                return;
            case 21:
                b4.n nVar = (b4.n) this.f18165b;
                if (((Thread) ((AtomicReference) nVar.d).getAndSet(Thread.currentThread())) == null) {
                    z18 = true;
                }
                p6.m.j(z18);
                try {
                    ((Runnable) this.f18166c).run();
                    ((AtomicReference) nVar.d).set(null);
                    nVar.F();
                    return;
                } catch (Throwable th6) {
                    try {
                        ((AtomicReference) nVar.d).set(null);
                        nVar.F();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                    throw th6;
                }
            case 22:
                ni.l lVar2 = (ni.l) this.f18166c;
                ArrayList arrayList = (ArrayList) this.f18165b;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj4 = arrayList.get(i10);
                    i10++;
                    lVar2.B((u4.i) obj4);
                }
                arrayList.clear();
                lVar2.v.remove(arrayList);
                return;
            case 23:
                Typeface typeface = (Typeface) this.f18166c;
                k0 k0Var = (k0) ((w5) this.f18165b).f13798b;
                if (k0Var != null) {
                    k0Var.h(typeface);
                    return;
                }
                return;
            case 24:
                ((e5.t) this.f18165b).accept(this.f18166c);
                return;
            case 25:
                ArrayList arrayList2 = (ArrayList) this.f18165b;
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    if (arrayList2.get(i15) != null && ((uo) arrayList2.get(i15)).f38832a != null) {
                        ((uo) arrayList2.get(i15)).f38832a.m(0);
                    }
                }
                org.telegram.messenger.g0.h3(new yh(2, this, arrayList2));
                return;
            case 26:
                wm wmVar = ((hl) this.f18166c).f45933b;
                if (this == wmVar.f51243a6) {
                    wmVar.yb((CharSequence) this.f18165b, false);
                    wmVar.f51243a6 = null;
                    return;
                }
                return;
            case 27:
                p8 p8Var = (p8) this.f18165b;
                boolean z22 = p8Var.d.h;
                p8Var.setChecked(!z22);
                nq nqVar = ((iq) this.f18166c).d;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = nqVar.E;
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
                org.telegram.messenger.g0.b4(nqVar.f48052c);
                gq B0 = nqVar.B0();
                nqVar.G0();
                nqVar.F0(B0);
                return;
            case 28:
                ((ac) this.f18165b).j();
                ((fx) this.f18166c).F = null;
                return;
            default:
                u4.u uVar = (u4.u) this.f18165b;
                d1 d1Var = uVar.f55658e;
                u4.y yVar2 = (u4.y) this.f18166c;
                RecyclerView recyclerView = yVar2.I;
                if (recyclerView != null && recyclerView.H && !uVar.f55663w && d1Var.b() != -1) {
                    m0 itemAnimator = yVar2.I.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.k()) {
                        ArrayList arrayList3 = yVar2.G;
                        int size2 = arrayList3.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            if (((u4.u) arrayList3.get(i16)).f55664x) {
                            }
                        }
                        yVar2.f55687y.q(d1Var);
                        return;
                    }
                    yVar2.I.post(this);
                    return;
                }
                return;
        }
    }

    public String toString() {
        switch (this.f18164a) {
            case 0:
                android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(u.class.getSimpleName(), 19);
                ?? obj = new Object();
                ((p4.q) a0Var.d).f53182b = obj;
                a0Var.d = obj;
                obj.f53181a = (t) this.f18166c;
                return a0Var.toString();
            default:
                return super.toString();
        }
    }

    public u(e5.b bVar, e5.g gVar, com.google.android.gms.internal.clearcut.e eVar) {
        this.f18164a = 9;
        this.f18165b = bVar;
        this.f18166c = gVar;
    }

    public u(Object obj, Object obj2, boolean z10, int i3) {
        this.f18164a = i3;
        this.f18166c = obj;
        this.f18165b = obj2;
    }

    public u(u4.y yVar, u4.u uVar, int i3) {
        this.f18164a = 29;
        this.f18166c = yVar;
        this.f18165b = uVar;
    }
}
