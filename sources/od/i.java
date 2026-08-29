package od;

import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import jd.a0;
import jd.e0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.mc;
import org.telegram.ui.dr;
import org.telegram.ui.fr;
import org.telegram.ui.im;
import org.telegram.ui.jr;
import org.telegram.ui.ry;
import org.telegram.ui.tn;
import p5.d0;
public final class i implements Runnable {
    public final int f19516a;
    public Object f19517b;
    public final Object f19518c;

    public i(int i10, Object obj, Object obj2) {
        this.f19516a = i10;
        this.f19518c = obj;
        this.f19517b = obj2;
    }

    private final void a() {
        v5.j jVar = (v5.j) this.f19517b;
        int i10 = ((v5.k) this.f19518c).f49421a;
        synchronized (jVar) {
            v5.k kVar = (v5.k) jVar.f49419e.get(i10);
            if (kVar != 0) {
                Log.w("MessengerIpcClient", "Timing out request: " + i10);
                jVar.f49419e.remove(i10);
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
        int i10 = 0;
        switch (this.f19516a) {
            case 0:
                j jVar = (j) this.f19518c;
                a0 a0Var = jVar.f19520c;
                while (true) {
                    try {
                        ((Runnable) this.f19517b).run();
                    } catch (Throwable th2) {
                        e0.m(th2, sc.i.f47711a);
                    }
                    Runnable f9 = jVar.f();
                    if (f9 != null) {
                        this.f19517b = f9;
                        i10++;
                        if (i10 >= 16 && a0Var.e()) {
                            a0Var.c(jVar, this);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                break;
            case 1:
                tn tnVar = ((im) this.f19518c).f39293c;
                if (this == tnVar.F5) {
                    tnVar.Ya((CharSequence) this.f19517b, false);
                    tnVar.F5 = null;
                    return;
                }
                return;
            case 2:
                p8 p8Var = (p8) this.f19517b;
                boolean z14 = p8Var.d.h;
                p8Var.setChecked(!z14);
                jr jrVar = ((fr) this.f19518c).d;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = jrVar.A;
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
                AndroidUtilities.updateVisibleRows(jrVar.f39624c);
                dr w02 = jrVar.w0();
                jrVar.B0();
                jrVar.A0(w02);
                return;
            case 3:
                ((mc) this.f19517b).j();
                ((ry) this.f19518c).A = null;
                return;
            case 4:
                p2.b bVar = (p2.b) this.f19517b;
                p2.g gVar = (p2.g) this.f19518c;
                if (((p2.n) bVar.f45425f.f45454c) != null) {
                    ((p2.n) bVar.f45425f.f45454c).onPurchasesUpdated(gVar, null);
                    return;
                } else {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 5:
                Future future = (Future) this.f19518c;
                if (!future.isDone() && !future.isCancelled()) {
                    Runnable runnable = (Runnable) this.f19517b;
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
                p2.g gVar2 = p2.z.f45505i;
                ((p2.b) this.f19517b).y(24, 7, gVar2);
                com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f4681b;
                com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.f4708e;
                ((org.telegram.messenger.d) this.f19518c).a(gVar2, new p2.p(vVar, vVar));
                return;
            case 7:
                p2.g gVar3 = p2.z.f45505i;
                ((p2.b) this.f19517b).y(24, 9, gVar3);
                com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.f4681b;
                ((p2.m) this.f19518c).b(gVar3, com.google.android.gms.internal.play_billing.v.f4708e);
                return;
            case 8:
                s5.w wVar = (s5.w) this.f19517b;
                s5.d dVar = (s5.d) this.f19518c;
                s5.b bVar2 = s5.w.f47628j0;
                o5.d dVar2 = dVar.d;
                o5.x xVar = dVar.f47588f;
                o5.d dVar3 = wVar.Q;
                d0 d0Var = wVar.S;
                if (!s5.a.d(dVar2, dVar3)) {
                    wVar.Q = dVar2;
                    d0Var.c();
                }
                double d = dVar.f47584a;
                if (!Double.isNaN(d) && Math.abs(d - wVar.f47632b0) > 1.0E-7d) {
                    wVar.f47632b0 = d;
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z15 = dVar.f47585b;
                if (z15 != wVar.Y) {
                    wVar.Y = z15;
                    z10 = true;
                }
                Double.isNaN(dVar.h);
                s5.b bVar3 = s5.w.f47628j0;
                bVar3.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(wVar.f47631a0));
                if (d0Var != null && (z10 || wVar.f47631a0)) {
                    d0Var.f();
                }
                int i11 = dVar.f47586c;
                if (i11 != wVar.f47634d0) {
                    wVar.f47634d0 = i11;
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar3.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(wVar.f47631a0));
                if (d0Var != null && (z11 || wVar.f47631a0)) {
                    d0Var.a();
                }
                int i12 = dVar.f47587e;
                if (i12 != wVar.f47635e0) {
                    wVar.f47635e0 = i12;
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar3.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(wVar.f47631a0));
                if (d0Var != null && (z12 || wVar.f47631a0)) {
                    d0Var.e();
                }
                if (!s5.a.d(wVar.f47633c0, xVar)) {
                    wVar.f47633c0 = xVar;
                }
                wVar.f47631a0 = false;
                return;
            case 9:
                s5.w wVar2 = (s5.w) this.f19517b;
                s5.b bVar4 = s5.w.f47628j0;
                String str = ((s5.c) this.f19518c).f47583a;
                if (!s5.a.d(str, wVar2.X)) {
                    wVar2.X = str;
                    z13 = true;
                } else {
                    z13 = false;
                }
                s5.w.f47628j0.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z13), Boolean.valueOf(wVar2.Z));
                d0 d0Var2 = wVar2.S;
                if (d0Var2 != null && (z13 || wVar2.Z)) {
                    d0Var2.d();
                }
                wVar2.Z = false;
                return;
            case 10:
                uh.m mVar = (uh.m) this.f19518c;
                ArrayList arrayList = (ArrayList) this.f19517b;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    mVar.B((f2.j) obj);
                }
                arrayList.clear();
                mVar.v.remove(arrayList);
                return;
            case 11:
                v5.j jVar2 = (v5.j) this.f19517b;
                IBinder iBinder = (IBinder) this.f19518c;
                synchronized (jVar2) {
                    if (iBinder == null) {
                        jVar2.a("Null service connection");
                        return;
                    }
                    try {
                        jVar2.f49418c = new oc.i(iBinder);
                        jVar2.f49416a = 2;
                        ((ScheduledExecutorService) jVar2.f49420f.f49428c).execute(new v5.h(jVar2, 0));
                        return;
                    } catch (RemoteException e10) {
                        jVar2.a(e10.getMessage());
                        return;
                    }
                }
            case 12:
                a();
                return;
            default:
                x1.a aVar = (x1.a) this.f19518c;
                Object obj2 = this.f19517b;
                if (aVar.f49982c.get()) {
                    m5.d dVar4 = aVar.f49983e;
                    if (dVar4.h == aVar) {
                        SystemClock.uptimeMillis();
                        dVar4.h = null;
                        dVar4.b();
                    }
                } else {
                    m5.d dVar5 = aVar.f49983e;
                    if (dVar5.f16871g != aVar) {
                        if (dVar5.h == aVar) {
                            SystemClock.uptimeMillis();
                            dVar5.h = null;
                            dVar5.b();
                        }
                    } else if (!dVar5.f16868c) {
                        SystemClock.uptimeMillis();
                        dVar5.f16871g = null;
                        w1.a aVar2 = dVar5.f16866a;
                        if (aVar2 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                aVar2.j(obj2);
                            } else {
                                aVar2.h(obj2);
                            }
                        }
                    }
                }
                aVar.f49981b = 3;
                return;
        }
    }

    public i(Object obj, Object obj2, boolean z10, int i10) {
        this.f19516a = i10;
        this.f19517b = obj;
        this.f19518c = obj2;
    }
}
