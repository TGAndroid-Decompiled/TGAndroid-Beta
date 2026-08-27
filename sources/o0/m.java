package o0;

import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.s;
import e7.n;
import e7.u;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import m5.y;
import n2.t;
import n5.e0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Components.ec;
import org.telegram.ui.er;
import org.telegram.ui.hm;
import org.telegram.ui.hr;
import org.telegram.ui.i6;
import org.telegram.ui.lr;
import org.telegram.ui.rn;
import org.telegram.ui.sy;
import r5.w;

public final class m implements Runnable {

    public final int f19114a;

    public final Object f19115b;

    public final Object f19116c;

    public m(int i10, Object obj, Object obj2) {
        this.f19114a = i10;
        this.f19115b = obj;
        this.f19116c = obj2;
    }

    private final void a() {
        u5.i iVar = (u5.i) this.f19115b;
        int i10 = ((u5.j) this.f19116c).f48416a;
        synchronized (iVar) {
            u5.j jVar = (u5.j) iVar.f48414e.get(i10);
            if (jVar != null) {
                Log.w("MessengerIpcClient", "Timing out request: " + i10);
                iVar.f48414e.remove(i10);
                jVar.b(new s("Timed out waiting for response", null));
                iVar.c();
            }
        }
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10 = 0;
        switch (this.f19114a) {
            case 0:
                ((t) this.f19115b).accept(this.f19116c);
                return;
            case 1:
                rn rnVar = ((hm) this.f19116c).f38857c;
                if (this == rnVar.F5) {
                    rnVar.Ya((CharSequence) this.f19115b, false);
                    rnVar.F5 = null;
                    return;
                }
                return;
            case 2:
                o8 o8Var = (o8) this.f19115b;
                boolean z14 = o8Var.d.h;
                o8Var.setChecked(!z14);
                lr lrVar = ((hr) this.f19116c).d;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = lrVar.A;
                tL_chatBannedRights.send_media = z14;
                tL_chatBannedRights.send_gifs = z14;
                tL_chatBannedRights.send_inline = z14;
                tL_chatBannedRights.send_games = z14;
                tL_chatBannedRights.send_photos = z14;
                tL_chatBannedRights.send_videos = z14;
                tL_chatBannedRights.send_stickers = z14;
                tL_chatBannedRights.send_audios = z14;
                tL_chatBannedRights.send_docs = z14;
                tL_chatBannedRights.send_voices = z14;
                tL_chatBannedRights.send_roundvideos = z14;
                tL_chatBannedRights.embed_links = z14;
                tL_chatBannedRights.send_polls = z14;
                tL_chatBannedRights.send_reactions = z14;
                AndroidUtilities.updateVisibleRows(lrVar.f40185c);
                er erVarW0 = lrVar.w0();
                lrVar.B0();
                lrVar.A0(erVarW0);
                return;
            case 3:
                ((ec) this.f19115b).j();
                ((sy) this.f19116c).A = null;
                return;
            case 4:
                w wVar = (w) this.f19115b;
                r5.d dVar = (r5.d) this.f19116c;
                r5.b bVar = w.f46816j0;
                m5.d dVar2 = dVar.d;
                y yVar = dVar.f46776f;
                m5.d dVar3 = wVar.Q;
                e0 e0Var = wVar.S;
                if (!r5.a.d(dVar2, dVar3)) {
                    wVar.Q = dVar2;
                    e0Var.c();
                }
                double d = dVar.f46772a;
                if (Double.isNaN(d) || Math.abs(d - wVar.f46820b0) <= 1.0E-7d) {
                    z10 = false;
                } else {
                    wVar.f46820b0 = d;
                    z10 = true;
                }
                boolean z15 = dVar.f46773b;
                if (z15 != wVar.Y) {
                    wVar.Y = z15;
                    z10 = true;
                }
                Double.isNaN(dVar.h);
                r5.b bVar2 = w.f46816j0;
                bVar2.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(wVar.f46819a0));
                if (e0Var != null && (z10 || wVar.f46819a0)) {
                    e0Var.f();
                }
                int i11 = dVar.f46774c;
                if (i11 != wVar.f46822d0) {
                    wVar.f46822d0 = i11;
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar2.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(wVar.f46819a0));
                if (e0Var != null && (z11 || wVar.f46819a0)) {
                    e0Var.a();
                }
                int i12 = dVar.f46775e;
                if (i12 != wVar.f46823e0) {
                    wVar.f46823e0 = i12;
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar2.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(wVar.f46819a0));
                if (e0Var != null && (z12 || wVar.f46819a0)) {
                    e0Var.e();
                }
                if (!r5.a.d(wVar.f46821c0, yVar)) {
                    wVar.f46821c0 = yVar;
                }
                wVar.f46819a0 = false;
                return;
            case 5:
                w wVar2 = (w) this.f19115b;
                r5.c cVar = (r5.c) this.f19116c;
                r5.b bVar3 = w.f46816j0;
                String str = cVar.f46771a;
                if (r5.a.d(str, wVar2.X)) {
                    z13 = false;
                } else {
                    wVar2.X = str;
                    z13 = true;
                }
                w.f46816j0.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z13), Boolean.valueOf(wVar2.Z));
                e0 e0Var2 = wVar2.S;
                if (e0Var2 != null && (z13 || wVar2.Z)) {
                    e0Var2.d();
                }
                wVar2.Z = false;
                return;
            case 6:
                sh.m mVar = (sh.m) this.f19116c;
                ArrayList arrayList = (ArrayList) this.f19115b;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    mVar.B((f2.j) obj);
                }
                arrayList.clear();
                mVar.v.remove(arrayList);
                return;
            case 7:
                u5.i iVar = (u5.i) this.f19115b;
                IBinder iBinder = (IBinder) this.f19116c;
                synchronized (iVar) {
                    if (iBinder == null) {
                        iVar.a("Null service connection");
                    } else {
                        try {
                            iVar.f48413c = new i6(iBinder);
                            iVar.f48411a = 2;
                            ((ScheduledExecutorService) iVar.f48415f.f48423c).execute(new u5.g(iVar, i10));
                        } catch (RemoteException e9) {
                            iVar.a(e9.getMessage());
                        }
                    }
                }
                return;
            case 8:
                a();
                return;
            case 9:
                x1.a aVar = (x1.a) this.f19115b;
                Object obj2 = this.f19116c;
                if (aVar.f49327c.get()) {
                    k5.d dVar4 = aVar.f49328e;
                    if (dVar4.h == aVar) {
                        SystemClock.uptimeMillis();
                        dVar4.h = null;
                        dVar4.b();
                    }
                } else {
                    k5.d dVar5 = aVar.f49328e;
                    if (dVar5.f14471g != aVar) {
                        if (dVar5.h == aVar) {
                            SystemClock.uptimeMillis();
                            dVar5.h = null;
                            dVar5.b();
                        }
                    } else if (!dVar5.f14468c) {
                        SystemClock.uptimeMillis();
                        dVar5.f14471g = null;
                        w1.a aVar2 = dVar5.f14466a;
                        if (aVar2 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                aVar2.j(obj2);
                            } else {
                                aVar2.h(obj2);
                            }
                        }
                    }
                }
                aVar.f49326b = 3;
                return;
            case 10:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.f19115b;
                while (!((Set) this.f19116c).isEmpty()) {
                    try {
                        za.l lVar = (za.l) referenceQueue.remove();
                        if (lVar.f50299a.remove(lVar)) {
                            lVar.clear();
                            lVar.f50300b.getClass();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            case 11:
                Callable callable = (Callable) this.f19115b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f19116c;
                try {
                    taskCompletionSource.setResult(callable.call());
                    return;
                } catch (va.a e10) {
                    taskCompletionSource.setException(e10);
                    return;
                } catch (Exception e11) {
                    taskCompletionSource.setException(new va.a("Internal error has occurred when executing ML Kit tasks", e11));
                    return;
                }
            case 12:
                za.i iVar2 = (za.i) this.f19115b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f19116c;
                int iDecrementAndGet = iVar2.f50292b.decrementAndGet();
                y5.l.k(iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    iVar2.c();
                    iVar2.f50293c.set(false);
                }
                n.f5335a.clear();
                u.f5344a.clear();
                taskCompletionSource2.setResult(null);
                return;
            default:
                com.google.firebase.messaging.l lVar2 = (com.google.firebase.messaging.l) this.f19115b;
                y5.l.k(((Thread) ((AtomicReference) lVar2.d).getAndSet(Thread.currentThread())) == null);
                try {
                    ((Runnable) this.f19116c).run();
                    ((AtomicReference) lVar2.d).set(null);
                    lVar2.v();
                    return;
                } catch (Throwable th) {
                    try {
                        ((AtomicReference) lVar2.d).set(null);
                        lVar2.v();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
        }
    }

    public m(Object obj, Object obj2, boolean z10, int i10) {
        this.f19114a = i10;
        this.f19116c = obj;
        this.f19115b = obj2;
    }
}
