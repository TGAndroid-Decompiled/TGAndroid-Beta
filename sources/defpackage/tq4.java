package defpackage;

import android.app.Application;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.WearAuthListenerService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class tq4 implements Runnable {
    public final byte a;
    public Object b;
    public final Object c;

    public tq4(uh0 uh0Var, ts2 ts2Var, ss2 ss2Var) {
        this.a = (byte) 17;
        this.b = uh0Var;
        this.c = ts2Var;
    }

    private final void a() {
        IBinder iBinder = (IBinder) this.c;
        l7f l7fVar = (l7f) this.b;
        synchronized (l7fVar) {
            if (iBinder == null) {
                l7fVar.b("Null service connection");
                return;
            }
            try {
                l7fVar.c = new aec(iBinder);
                l7fVar.a = (byte) 2;
                ((ScheduledExecutorService) l7fVar.f.c).execute(new tme(l7fVar, (byte) 1));
            } catch (RemoteException e) {
                l7fVar.b(e.getMessage());
            }
        }
    }

    private final void b() {
        l7f l7fVar = (l7f) this.b;
        int i = ((ebf) this.c).a;
        synchronized (l7fVar) {
            SparseArray sparseArray = l7fVar.e;
            ebf ebfVar = (ebf) sparseArray.get(i);
            if (ebfVar != 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                sb.append("Timing out request: ");
                sb.append(i);
                Log.w("MessengerIpcClient", sb.toString());
                sparseArray.remove(i);
                ebfVar.c(new Exception("Timed out waiting for response", null));
                l7fVar.d();
            }
        }
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tq4.c():void");
    }

    @Override
    public final void run() {
        wz6 wz6Var;
        boolean z;
        boolean z2 = true;
        Throwable th = null;
        int i = 0;
        switch (this.a) {
            case 0:
                sq4 sq4Var = (sq4) this.c;
                t56 t56Var = (t56) this.b;
                if (t56Var instanceof t2) {
                    t2 t2Var = (t2) t56Var;
                    if (t2Var instanceof o2) {
                        Object obj = t2Var.a;
                        if (obj instanceof j2) {
                            th = ((j2) obj).a;
                        }
                    }
                    if (th != null) {
                        sq4Var.k(th);
                        return;
                    }
                }
                try {
                    sq4Var.onSuccess(jie.a(t56Var));
                    return;
                } catch (ExecutionException e) {
                    sq4Var.k(e.getCause());
                    return;
                } catch (Throwable th2) {
                    sq4Var.k(th2);
                    return;
                }
            case 1:
                y8 y8Var = (y8) this.b;
                b9 b9Var = (b9) this.c;
                yz6 yz6Var = b9Var.c;
                if (yz6Var != null && (wz6Var = yz6Var.e) != null) {
                    wz6Var.o1(yz6Var);
                }
                View view = (View) b9Var.n;
                if (view != null && view.getWindowToken() != null) {
                    if (!y8Var.b()) {
                        if (y8Var.e != null) {
                            y8Var.d(0, 0, false, false);
                        }
                    }
                    b9Var.J = y8Var;
                }
                b9Var.L = null;
                return;
            case 2:
                ((Application) this.b).unregisterActivityLifecycleCallbacks((o9) this.c);
                return;
            case 3:
                lj0 lj0Var = ((aj0) this.c).m0;
                aod aodVar = lj0Var.c;
                aod aodVar2 = aodVar;
                if (aodVar == null) {
                    ?? obj2 = new Object();
                    lj0Var.c = obj2;
                    aodVar2 = obj2;
                }
                aodVar2.c((fj0) this.b);
                return;
            case 4:
                mu1 mu1Var = ((xs1) this.c).b;
                if (this == mu1Var.b6) {
                    mu1Var.jb((CharSequence) this.b, false);
                    mu1Var.b6 = null;
                    return;
                }
                return;
            case 5:
                zgb zgbVar = (zgb) this.b;
                boolean z3 = zgbVar.d.h;
                zgbVar.setChecked(!z3);
                kf2 kf2Var = ((gf2) this.c).d;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = kf2Var.E;
                tL_chatBannedRights.send_media = z3;
                tL_chatBannedRights.send_gifs = z3;
                tL_chatBannedRights.send_inline = z3;
                tL_chatBannedRights.send_games = z3;
                tL_chatBannedRights.send_photos = z3;
                tL_chatBannedRights.send_videos = z3;
                tL_chatBannedRights.send_stickers = z3;
                tL_chatBannedRights.send_audios = z3;
                tL_chatBannedRights.send_docs = z3;
                tL_chatBannedRights.send_voices = z3;
                tL_chatBannedRights.send_roundvideos = z3;
                tL_chatBannedRights.embed_links = z3;
                tL_chatBannedRights.send_polls = z3;
                tL_chatBannedRights.send_reactions = z3;
                gl.V3(kf2Var.c);
                ef2 z0 = kf2Var.z0();
                kf2Var.E0();
                kf2Var.C0(z0);
                return;
            case 6:
                gb3 gb3Var = (gb3) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    eb3 eb3Var = (eb3) obj3;
                    gb3Var.B(eb3Var);
                    gb3Var.x.add(eb3Var);
                }
                arrayList.clear();
                gb3Var.v.remove(arrayList);
                return;
            case 7:
                ((m21) this.b).j();
                ((zu3) this.c).F = null;
                return;
            case 8:
                es5 es5Var = (es5) this.b;
                s49 s49Var = es5Var.e;
                is5 is5Var = (is5) this.c;
                RecyclerView recyclerView = is5Var.I;
                if (recyclerView != null && recyclerView.H && !es5Var.w && s49Var.b() != -1) {
                    b49 itemAnimator = is5Var.I.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.k()) {
                        ArrayList arrayList2 = is5Var.G;
                        int size2 = arrayList2.size();
                        while (i < size2) {
                            if (((es5) arrayList2.get(i)).x) {
                                i++;
                            }
                        }
                        is5Var.y.r(s49Var);
                        return;
                    }
                    is5Var.I.post(this);
                    return;
                }
                return;
            case 9:
                ArrayList arrayList3 = (ArrayList) this.b;
                for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                    if (arrayList3.get(i2) != null && ((wd2) arrayList3.get(i2)).a != null) {
                        ((wd2) arrayList3.get(i2)).a.m(0);
                    }
                }
                gl.c3(new oh6(this, arrayList3, (byte) 12));
                return;
            case 10:
                ((tl4) this.b).accept(this.c);
                return;
            case 11:
                try {
                    c();
                    return;
                } catch (Error e2) {
                    synchronized (((v4a) this.c).b) {
                        ((v4a) this.c).c = 1;
                        throw e2;
                    }
                }
            case 12:
                ea9 ea9Var = (ea9) this.c;
                try {
                    ((ea9) this.b).get();
                    ea9Var.k(null);
                    return;
                } catch (Exception e3) {
                    ea9Var.l(e3);
                    return;
                }
            case 13:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.c;
                shortcutInfoCompatSaverImpl.b.clear();
                ps psVar = shortcutInfoCompatSaverImpl.c;
                Iterator it = ((js) psVar.values()).iterator();
                while (it.hasNext()) {
                    ((t56) it.next()).cancel(false);
                }
                psVar.clear();
                shortcutInfoCompatSaverImpl.h((ea9) this.b);
                return;
            case 14:
                if (!(((ea9) this.b).a instanceof t3)) {
                    try {
                        ((Runnable) this.c).run();
                        ((ea9) this.b).k(null);
                        return;
                    } catch (Exception e4) {
                        ((ea9) this.b).l(e4);
                        return;
                    }
                }
                return;
            case 15:
                v56 v56Var = (v56) this.c;
                u56 u56Var = ((w56) this.b).b;
                if (u56Var != null) {
                    v56Var.H(u56Var.a);
                    return;
                }
                return;
            case 16:
                uh0 uh0Var = (uh0) this.b;
                fi0 fi0Var = (fi0) this.c;
                ci0 ci0Var = (ci0) uh0Var.f.c;
                ei0 ei0Var = uh0Var.f;
                if (ci0Var != null) {
                    ((ci0) ei0Var.c).m(fi0Var, null, null);
                    return;
                } else {
                    xgd.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 17:
                fi0 fi0Var2 = qjd.i;
                ((uh0) this.b).x(24, 4, fi0Var2);
                ((ts2) this.c).d(fi0Var2);
                return;
            case 18:
                fi0 fi0Var3 = qjd.i;
                ((uh0) this.b).x(24, 9, fi0Var3);
                sed sedVar = efd.b;
                ((wu8) this.c).a(fi0Var3, nhd.e);
                return;
            case 19:
                ((ocd) this.b).V((yt6) this.c);
                return;
            case 20:
                afd afdVar = ((ted) this.b).c;
                dc6 dc6Var = afd.H;
                String str = ((a5d) this.c).a;
                if (!id1.d(str, afdVar.v)) {
                    afdVar.v = str;
                    z = true;
                } else {
                    z = false;
                }
                afd.H.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(afdVar.o));
                uhf uhfVar = afdVar.E;
                if (uhfVar != null && (z || afdVar.o)) {
                    uhfVar.d();
                }
                afdVar.o = false;
                return;
            case 21:
                a();
                return;
            case 22:
                b();
                return;
            case 23:
                WearAuthListenerService wearAuthListenerService = ((e5d) this.c).c;
                h5e h5eVar = (h5e) this.b;
                String str2 = h5eVar.b;
                String str3 = h5eVar.d;
                byte[] bArr = h5eVar.c;
                if ("/tg-wear-auth/offer".equals(str2)) {
                    try {
                        Intent intent = new Intent(wearAuthListenerService, LaunchActivity.class);
                        intent.addFlags(268566528);
                        wearAuthListenerService.startActivity(intent);
                    } catch (Exception e5) {
                        fa4.e("wear-auth: failed to pop LaunchActivity", e5);
                    }
                }
                gl.c3(new wbc(str2, str3, bArr, (byte) 20));
                return;
            case 24:
                xf4 xf4Var = (xf4) this.b;
                AtomicReference atomicReference = (AtomicReference) xf4Var.d;
                if (((Thread) atomicReference.getAndSet(Thread.currentThread())) != null) {
                    z2 = false;
                }
                fre.k(z2);
                try {
                    ((Runnable) this.c).run();
                    atomicReference.set(null);
                    xf4Var.N();
                    return;
                } catch (Throwable th3) {
                    try {
                        atomicReference.set(null);
                        xf4Var.N();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            default:
                tcd tcdVar = (tcd) this.b;
                WearAuthListenerService wearAuthListenerService2 = ((e5d) this.c).c;
                tcdVar.b(wearAuthListenerService2);
                tcdVar.b(wearAuthListenerService2.n);
                return;
        }
    }

    public final String toString() {
        String str;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                xl3 xl3Var = new xl3(tq4.class.getSimpleName(), (byte) 22);
                wk4 wk4Var = new wk4((byte) 12);
                ((wk4) xl3Var.d).c = wk4Var;
                xl3Var.d = wk4Var;
                wk4Var.b = (sq4) obj;
                return xl3Var.toString();
            case 11:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((v4a) obj).c;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
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
                sb.append(str);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public tq4(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public tq4(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public tq4(v4a v4aVar) {
        this.a = (byte) 11;
        this.c = v4aVar;
    }

    public tq4(is5 is5Var, es5 es5Var, int i) {
        this.a = (byte) 8;
        this.c = is5Var;
        this.b = es5Var;
    }
}
