package k9;

import a8.h0;
import a8.qd;
import android.app.Application;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import ce.z0;
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
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.qc;
import org.telegram.ui.er;
import org.telegram.ui.gr;
import org.telegram.ui.jm;
import org.telegram.ui.kr;
import org.telegram.ui.oy;
import org.telegram.ui.un;
import s4.e1;
import s4.m0;
public final class u implements Runnable {
    public final int f16493a;
    public Object f16494b;
    public final Object f16495c;

    public u(int i10, Object obj, Object obj2) {
        this.f16493a = i10;
        this.f16494b = obj;
        this.f16495c = obj2;
    }

    private final void a() {
        k6.k kVar = (k6.k) this.f16494b;
        int i10 = ((k6.l) this.f16495c).f16420a;
        synchronized (kVar) {
            k6.l lVar = (k6.l) kVar.e.get(i10);
            if (lVar != 0) {
                Log.w("MessengerIpcClient", "Timing out request: " + i10);
                kVar.e.remove(i10);
                lVar.b(new Exception("Timed out waiting for response", null));
                kVar.c();
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
        switch (this.f16493a) {
            case 0:
                t tVar = (t) this.f16495c;
                y yVar = (y) this.f16494b;
                if (yVar instanceof l9.a) {
                    o oVar = (o) ((l9.a) yVar);
                    if (oVar instanceof g) {
                        Object obj = oVar.f16486a;
                        if (obj instanceof b) {
                            th2 = ((b) obj).f16461a;
                        }
                    }
                    if (th2 != null) {
                        tVar.i(th2);
                        return;
                    }
                }
                try {
                    tVar.onSuccess(qd.a(yVar));
                    return;
                } catch (ExecutionException e) {
                    tVar.i(e.getCause());
                    return;
                } catch (Throwable th3) {
                    tVar.i(th3);
                    return;
                }
            case 1:
                androidx.biometric.x xVar = ((androidx.biometric.p) this.f16495c).f2283l0;
                if (xVar.e == null) {
                    xVar.e = new Object();
                }
                xVar.e.c((androidx.biometric.s) this.f16494b);
                return;
            case 2:
                ((ce.m) this.f16495c).D((z0) this.f16494b);
                return;
            case 3:
                ((com.google.android.gms.internal.cast.p) this.f16494b).M0((p4.r) this.f16495c);
                return;
            case 4:
                d5.c cVar = (d5.c) this.f16494b;
                d5.i iVar = (d5.i) this.f16495c;
                if (((d5.q) cVar.f7934f.f7983c) != null) {
                    ((d5.q) cVar.f7934f.f7983c).onPurchasesUpdated(iVar, null);
                    return;
                } else {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 5:
                Future future = (Future) this.f16494b;
                if (!future.isDone() && !future.isCancelled()) {
                    Runnable runnable = (Runnable) this.f16495c;
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
                d5.i iVar2 = d5.e0.f7962i;
                ((d5.c) this.f16494b).y(24, 7, iVar2);
                com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f7309b;
                com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.e;
                ((org.telegram.messenger.g0) this.f16495c).a(iVar2, new d5.s(vVar, vVar));
                return;
            case 7:
                d5.i iVar3 = d5.e0.f7962i;
                ((d5.c) this.f16494b).y(24, 9, iVar3);
                com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.f7309b;
                ((d5.p) this.f16495c).a(iVar3, com.google.android.gms.internal.play_billing.v.e);
                return;
            case 8:
                d6.e0 e0Var = ((d6.d0) this.f16494b).f8060b;
                h6.d dVar = (h6.d) this.f16495c;
                h6.b bVar = d6.e0.G;
                d6.d dVar2 = dVar.d;
                d6.x xVar2 = dVar.f12628f;
                d6.d dVar3 = e0Var.f8073t;
                e6.d0 d0Var = e0Var.D;
                if (!h6.a.d(dVar2, dVar3)) {
                    e0Var.f8073t = dVar2;
                    d0Var.c();
                }
                double d = dVar.f12625a;
                if (!Double.isNaN(d) && Math.abs(d - e0Var.v) > 1.0E-7d) {
                    e0Var.v = d;
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z20 = dVar.f12626b;
                if (z20 != e0Var.f8075w) {
                    e0Var.f8075w = z20;
                    z10 = true;
                }
                h6.b bVar2 = d6.e0.G;
                bVar2.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(e0Var.f8066m));
                if (d0Var != null && (z10 || e0Var.f8066m)) {
                    d0Var.f();
                }
                Double.isNaN(dVar.h);
                int i12 = dVar.f12627c;
                if (i12 != e0Var.f8076x) {
                    e0Var.f8076x = i12;
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar2.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(e0Var.f8066m));
                if (d0Var != null && (z11 || e0Var.f8066m)) {
                    d0Var.a();
                }
                int i13 = dVar.e;
                if (i13 != e0Var.f8077y) {
                    e0Var.f8077y = i13;
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar2.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(e0Var.f8066m));
                if (d0Var != null && (z12 || e0Var.f8066m)) {
                    d0Var.e();
                }
                if (!h6.a.d(e0Var.f8078z, xVar2)) {
                    e0Var.f8078z = xVar2;
                }
                e0Var.f8066m = false;
                return;
            case 9:
                d6.e0 e0Var2 = ((d6.d0) this.f16494b).f8060b;
                h6.b bVar3 = d6.e0.G;
                String str = ((h6.c) this.f16495c).f12624a;
                if (!h6.a.d(str, e0Var2.f8074u)) {
                    e0Var2.f8074u = str;
                    z13 = true;
                } else {
                    z13 = false;
                }
                d6.e0.G.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z13), Boolean.valueOf(e0Var2.f8067n));
                e6.d0 d0Var2 = e0Var2.D;
                if (d0Var2 != null && (z13 || e0Var2.f8067n)) {
                    d0Var2.d();
                }
                e0Var2.f8067n = false;
                return;
            case 10:
                ((ce.m) this.f16494b).D((de.e) this.f16495c);
                return;
            case 11:
                ((e0.c) this.f16494b).f9513a = this.f16495c;
                return;
            case 12:
                ((Application) this.f16494b).unregisterActivityLifecycleCallbacks((e0.c) this.f16495c);
                return;
            case 13:
                Object obj2 = this.f16495c;
                Object obj3 = this.f16494b;
                try {
                    Method method = e0.d.d;
                    if (method != null) {
                        method.invoke(obj3, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        e0.d.e.invoke(obj3, obj2, Boolean.FALSE);
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
                h6.v vVar2 = (h6.v) this.f16494b;
                h6.d dVar4 = (h6.d) this.f16495c;
                h6.b bVar4 = h6.v.f12662n0;
                d6.d dVar5 = dVar4.d;
                d6.x xVar3 = dVar4.f12628f;
                d6.d dVar6 = vVar2.U;
                e6.d0 d0Var3 = vVar2.W;
                if (!h6.a.d(dVar5, dVar6)) {
                    vVar2.U = dVar5;
                    d0Var3.c();
                }
                double d10 = dVar4.f12625a;
                if (!Double.isNaN(d10) && Math.abs(d10 - vVar2.f12670f0) > 1.0E-7d) {
                    vVar2.f12670f0 = d10;
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z21 = dVar4.f12626b;
                if (z21 != vVar2.f12667c0) {
                    vVar2.f12667c0 = z21;
                    z14 = true;
                }
                Double.isNaN(dVar4.h);
                h6.b bVar5 = h6.v.f12662n0;
                bVar5.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z14), Boolean.valueOf(vVar2.f12669e0));
                if (d0Var3 != null && (z14 || vVar2.f12669e0)) {
                    d0Var3.f();
                }
                int i14 = dVar4.f12627c;
                if (i14 != vVar2.f12672h0) {
                    vVar2.f12672h0 = i14;
                    z15 = true;
                } else {
                    z15 = false;
                }
                bVar5.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z15), Boolean.valueOf(vVar2.f12669e0));
                if (d0Var3 != null && (z15 || vVar2.f12669e0)) {
                    d0Var3.a();
                }
                int i15 = dVar4.e;
                if (i15 != vVar2.f12673i0) {
                    vVar2.f12673i0 = i15;
                    z16 = true;
                } else {
                    z16 = false;
                }
                bVar5.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z16), Boolean.valueOf(vVar2.f12669e0));
                if (d0Var3 != null && (z16 || vVar2.f12669e0)) {
                    d0Var3.e();
                }
                if (!h6.a.d(vVar2.f12671g0, xVar3)) {
                    vVar2.f12671g0 = xVar3;
                }
                vVar2.f12669e0 = false;
                return;
            case 15:
                h6.v vVar3 = (h6.v) this.f16494b;
                h6.b bVar6 = h6.v.f12662n0;
                String str2 = ((h6.c) this.f16495c).f12624a;
                if (!h6.a.d(str2, vVar3.f12666b0)) {
                    vVar3.f12666b0 = str2;
                    z17 = true;
                } else {
                    z17 = false;
                }
                h6.v.f12662n0.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z17), Boolean.valueOf(vVar3.f12668d0));
                e6.d0 d0Var4 = vVar3.W;
                if (d0Var4 != null && (z17 || vVar3.f12668d0)) {
                    d0Var4.d();
                }
                vVar3.f12668d0 = false;
                return;
            case 16:
                he.i iVar4 = (he.i) this.f16495c;
                ce.a0 a0Var = iVar4.f12804c;
                while (true) {
                    try {
                        ((Runnable) this.f16494b).run();
                    } catch (Throwable th5) {
                        ce.f0.m(th5, ld.i.f16988a);
                    }
                    Runnable f7 = iVar4.f();
                    if (f7 != null) {
                        this.f16494b = f7;
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
                k6.k kVar = (k6.k) this.f16494b;
                IBinder iBinder = (IBinder) this.f16495c;
                synchronized (kVar) {
                    if (iBinder == null) {
                        kVar.a("Null service connection");
                        return;
                    }
                    try {
                        kVar.f16418c = new n4.s(iBinder);
                        kVar.f16416a = 2;
                        ((ScheduledExecutorService) kVar.f16419f.f16425c).execute(new k6.i(kVar, 0));
                        return;
                    } catch (RemoteException e11) {
                        kVar.a(e11.getMessage());
                        return;
                    }
                }
            case 18:
                a();
                return;
            case 19:
                mi.m mVar = (mi.m) this.f16495c;
                ArrayList arrayList = (ArrayList) this.f16494b;
                int size = arrayList.size();
                while (i11 < size) {
                    Object obj4 = arrayList.get(i11);
                    i11++;
                    mVar.B((s4.j) obj4);
                }
                arrayList.clear();
                mVar.v.remove(arrayList);
                return;
            case 20:
                Typeface typeface = (Typeface) this.f16495c;
                j0 j0Var = (j0) ((b6.i) this.f16494b).f3670b;
                if (j0Var != null) {
                    j0Var.e(typeface);
                    return;
                }
                return;
            case 21:
                ((d5.x) this.f16494b).accept(this.f16495c);
                return;
            case 22:
                un unVar = ((jm) this.f16495c).f40685c;
                if (this == unVar.V5) {
                    unVar.hb((CharSequence) this.f16494b, false);
                    unVar.V5 = null;
                    return;
                }
                return;
            case 23:
                z8 z8Var = (z8) this.f16494b;
                boolean z22 = z8Var.d.h;
                z8Var.setChecked(!z22);
                kr krVar = ((gr) this.f16495c).d;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = krVar.f41056y;
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
                AndroidUtilities.updateVisibleRows(krVar.f41007c);
                er x02 = krVar.x0();
                krVar.C0();
                krVar.B0(x02);
                return;
            case 24:
                ((qc) this.f16494b).j();
                ((oy) this.f16495c).E = null;
                return;
            case 25:
                s4.v vVar4 = (s4.v) this.f16494b;
                e1 e1Var = vVar4.e;
                s4.z zVar = (s4.z) this.f16495c;
                RecyclerView recyclerView = zVar.H;
                if (recyclerView != null && recyclerView.G && !vVar4.v && e1Var.b() != -1) {
                    m0 itemAnimator = zVar.H.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.k()) {
                        ArrayList arrayList2 = zVar.F;
                        int size2 = arrayList2.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            if (((s4.v) arrayList2.get(i16)).f47844w) {
                            }
                        }
                        zVar.f47866x.q(e1Var);
                        return;
                    }
                    zVar.H.post(this);
                    return;
                }
                return;
            case 26:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.f16494b;
                while (!((Set) this.f16495c).isEmpty()) {
                    try {
                        sb.l lVar = (sb.l) referenceQueue.remove();
                        if (lVar.f48059a.remove(lVar)) {
                            lVar.clear();
                            lVar.f48060b.getClass();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            case 27:
                Callable callable = (Callable) this.f16494b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f16495c;
                try {
                    taskCompletionSource.setResult(callable.call());
                    return;
                } catch (ob.a e12) {
                    taskCompletionSource.setException(e12);
                    return;
                } catch (Exception e13) {
                    taskCompletionSource.setException(new ob.a("Internal error has occurred when executing ML Kit tasks", e13));
                    return;
                }
            case 28:
                sb.i iVar5 = (sb.i) this.f16494b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f16495c;
                int decrementAndGet = iVar5.f48052b.decrementAndGet();
                if (decrementAndGet < 0) {
                    z19 = false;
                }
                o6.l.k(z19);
                if (decrementAndGet == 0) {
                    iVar5.c();
                    iVar5.f48053c.set(false);
                }
                u7.n.f49606a.clear();
                u7.r.f49610a.clear();
                taskCompletionSource2.setResult(null);
                return;
            default:
                c2.b bVar7 = (c2.b) this.f16494b;
                if (((Thread) ((AtomicReference) bVar7.d).getAndSet(Thread.currentThread())) == null) {
                    z18 = true;
                }
                o6.l.k(z18);
                try {
                    ((Runnable) this.f16495c).run();
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
        }
    }

    public String toString() {
        switch (this.f16493a) {
            case 0:
                h0 h0Var = new h0(u.class.getSimpleName(), 16);
                rf.b bVar = new rf.b(17, false);
                ((rf.b) h0Var.d).f47333c = bVar;
                h0Var.d = bVar;
                bVar.f47332b = (t) this.f16495c;
                return h0Var.toString();
            default:
                return super.toString();
        }
    }

    public u(Object obj, Object obj2, boolean z10, int i10) {
        this.f16493a = i10;
        this.f16495c = obj;
        this.f16494b = obj2;
    }

    public u(s4.z zVar, s4.v vVar, int i10) {
        this.f16493a = 25;
        this.f16495c = zVar;
        this.f16494b = vVar;
    }
}
