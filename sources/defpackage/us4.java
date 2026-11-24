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
public final class us4 implements Runnable {
    public final byte a;
    public Object b;
    public final Object c;

    public us4(ui0 ui0Var, eu2 eu2Var, du2 du2Var) {
        this.a = (byte) 17;
        this.b = ui0Var;
        this.c = eu2Var;
    }

    private final void a() {
        IBinder iBinder = (IBinder) this.c;
        n9f n9fVar = (n9f) this.b;
        synchronized (n9fVar) {
            if (iBinder == null) {
                n9fVar.b("Null service connection");
                return;
            }
            try {
                n9fVar.c = new rhb(iBinder);
                n9fVar.a = (byte) 2;
                ((ScheduledExecutorService) n9fVar.f.c).execute(new woe(n9fVar, (byte) 1));
            } catch (RemoteException e) {
                n9fVar.b(e.getMessage());
            }
        }
    }

    private final void b() {
        n9f n9fVar = (n9f) this.b;
        int i = ((fdf) this.c).a;
        synchronized (n9fVar) {
            SparseArray sparseArray = n9fVar.e;
            fdf fdfVar = (fdf) sparseArray.get(i);
            if (fdfVar != 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                sb.append("Timing out request: ");
                sb.append(i);
                Log.w("MessengerIpcClient", sb.toString());
                sparseArray.remove(i);
                fdfVar.c(new Exception("Timed out waiting for response", null));
                n9fVar.d();
            }
        }
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.us4.c():void");
    }

    @Override
    public final void run() {
        w17 w17Var;
        boolean z;
        boolean z2 = true;
        Throwable th = null;
        int i = 0;
        switch (this.a) {
            case 0:
                ts4 ts4Var = (ts4) this.c;
                t76 t76Var = (t76) this.b;
                if (t76Var instanceof t2) {
                    t2 t2Var = (t2) t76Var;
                    if (t2Var instanceof o2) {
                        Object obj = t2Var.a;
                        if (obj instanceof j2) {
                            th = ((j2) obj).a;
                        }
                    }
                    if (th != null) {
                        ts4Var.j(th);
                        return;
                    }
                }
                try {
                    ts4Var.onSuccess(kke.a(t76Var));
                    return;
                } catch (ExecutionException e) {
                    ts4Var.j(e.getCause());
                    return;
                } catch (Throwable th2) {
                    ts4Var.j(th2);
                    return;
                }
            case 1:
                y8 y8Var = (y8) this.b;
                b9 b9Var = (b9) this.c;
                y17 y17Var = b9Var.c;
                if (y17Var != null && (w17Var = y17Var.e) != null) {
                    w17Var.T1(y17Var);
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
                lk0 lk0Var = ((ak0) this.c).m0;
                dqd dqdVar = lk0Var.c;
                dqd dqdVar2 = dqdVar;
                if (dqdVar == null) {
                    ?? obj2 = new Object();
                    lk0Var.c = obj2;
                    dqdVar2 = obj2;
                }
                dqdVar2.c((fk0) this.b);
                return;
            case 4:
                yv1 yv1Var = ((ju1) this.c).b;
                if (this == yv1Var.b6) {
                    yv1Var.tb((CharSequence) this.b, false);
                    yv1Var.b6 = null;
                    return;
                }
                return;
            case 5:
                ajb ajbVar = (ajb) this.b;
                boolean z3 = ajbVar.d.h;
                ajbVar.setChecked(!z3);
                wg2 wg2Var = ((sg2) this.c).d;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = wg2Var.E;
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
                gm.V3(wg2Var.c);
                qg2 A0 = wg2Var.A0();
                wg2Var.F0();
                wg2Var.D0(A0);
                return;
            case 6:
                sc3 sc3Var = (sc3) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    qc3 qc3Var = (qc3) obj3;
                    sc3Var.B(qc3Var);
                    sc3Var.x.add(qc3Var);
                }
                arrayList.clear();
                sc3Var.v.remove(arrayList);
                return;
            case 7:
                ((u31) this.b).j();
                ((kw3) this.c).F = null;
                return;
            case 8:
                du5 du5Var = (du5) this.b;
                u69 u69Var = du5Var.e;
                hu5 hu5Var = (hu5) this.c;
                RecyclerView recyclerView = hu5Var.I;
                if (recyclerView != null && recyclerView.H && !du5Var.w && u69Var.b() != -1) {
                    d69 itemAnimator = hu5Var.I.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.k()) {
                        ArrayList arrayList2 = hu5Var.G;
                        int size2 = arrayList2.size();
                        while (i < size2) {
                            if (((du5) arrayList2.get(i)).x) {
                                i++;
                            }
                        }
                        hu5Var.y.r(u69Var);
                        return;
                    }
                    hu5Var.I.post(this);
                    return;
                }
                return;
            case 9:
                ArrayList arrayList3 = (ArrayList) this.b;
                for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                    if (arrayList3.get(i2) != null && ((hf2) arrayList3.get(i2)).a != null) {
                        ((hf2) arrayList3.get(i2)).a.m(0);
                    }
                }
                gm.c3(new lj6(this, arrayList3, (byte) 13));
                return;
            case 10:
                ((un4) this.b).accept(this.c);
                return;
            case 11:
                try {
                    c();
                    return;
                } catch (Error e2) {
                    synchronized (((x6a) this.c).b) {
                        ((x6a) this.c).c = 1;
                        throw e2;
                    }
                }
            case 12:
                ec9 ec9Var = (ec9) this.c;
                try {
                    ((ec9) this.b).get();
                    ec9Var.k(null);
                    return;
                } catch (Exception e3) {
                    ec9Var.l(e3);
                    return;
                }
            case 13:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.c;
                shortcutInfoCompatSaverImpl.b.clear();
                qt qtVar = shortcutInfoCompatSaverImpl.c;
                Iterator it = ((kt) qtVar.values()).iterator();
                while (it.hasNext()) {
                    ((t76) it.next()).cancel(false);
                }
                qtVar.clear();
                shortcutInfoCompatSaverImpl.h((ec9) this.b);
                return;
            case 14:
                if (!(((ec9) this.b).a instanceof t3)) {
                    try {
                        ((Runnable) this.c).run();
                        ((ec9) this.b).k(null);
                        return;
                    } catch (Exception e4) {
                        ((ec9) this.b).l(e4);
                        return;
                    }
                }
                return;
            case 15:
                v76 v76Var = (v76) this.c;
                u76 u76Var = ((w76) this.b).b;
                if (u76Var != null) {
                    v76Var.c(u76Var.a);
                    return;
                }
                return;
            case 16:
                ui0 ui0Var = (ui0) this.b;
                fj0 fj0Var = (fj0) this.c;
                cj0 cj0Var = (cj0) ui0Var.f.c;
                ej0 ej0Var = ui0Var.f;
                if (cj0Var != null) {
                    ((cj0) ej0Var.c).m(fj0Var, null, null);
                    return;
                } else {
                    yid.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 17:
                fj0 fj0Var2 = sld.i;
                ((ui0) this.b).x(24, 4, fj0Var2);
                ((eu2) this.c).e(fj0Var2);
                return;
            case 18:
                fj0 fj0Var3 = sld.i;
                ((ui0) this.b).x(24, 9, fj0Var3);
                tgd tgdVar = fhd.b;
                ((xw8) this.c).a(fj0Var3, ojd.e);
                return;
            case 19:
                ((qed) this.b).V((yv6) this.c);
                return;
            case 20:
                bhd bhdVar = ((ugd) this.b).c;
                ce6 ce6Var = bhd.H;
                String str = ((c7d) this.c).a;
                if (!qe1.d(str, bhdVar.v)) {
                    bhdVar.v = str;
                    z = true;
                } else {
                    z = false;
                }
                bhd.H.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(bhdVar.o));
                vjf vjfVar = bhdVar.E;
                if (vjfVar != null && (z || bhdVar.o)) {
                    vjfVar.d();
                }
                bhdVar.o = false;
                return;
            case 21:
                a();
                return;
            case 22:
                b();
                return;
            case 23:
                WearAuthListenerService wearAuthListenerService = ((g7d) this.c).c;
                k7e k7eVar = (k7e) this.b;
                String str2 = k7eVar.b;
                String str3 = k7eVar.d;
                byte[] bArr = k7eVar.c;
                if ("/tg-wear-auth/offer".equals(str2)) {
                    try {
                        Intent intent = new Intent(wearAuthListenerService, LaunchActivity.class);
                        intent.addFlags(268566528);
                        wearAuthListenerService.startActivity(intent);
                    } catch (Exception e5) {
                        fc4.e("wear-auth: failed to pop LaunchActivity", e5);
                    }
                }
                gm.c3(new gcc(str2, str3, bArr, (byte) 23));
                return;
            case 24:
                yh4 yh4Var = (yh4) this.b;
                AtomicReference atomicReference = (AtomicReference) yh4Var.d;
                if (((Thread) atomicReference.getAndSet(Thread.currentThread())) != null) {
                    z2 = false;
                }
                ite.k(z2);
                try {
                    ((Runnable) this.c).run();
                    atomicReference.set(null);
                    yh4Var.N();
                    return;
                } catch (Throwable th3) {
                    try {
                        atomicReference.set(null);
                        yh4Var.N();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            default:
                ved vedVar = (ved) this.b;
                WearAuthListenerService wearAuthListenerService2 = ((g7d) this.c).c;
                vedVar.b(wearAuthListenerService2);
                vedVar.b(wearAuthListenerService2.n);
                return;
        }
    }

    public final String toString() {
        String str;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                in3 in3Var = new in3(us4.class.getSimpleName(), (byte) 22);
                wm4 wm4Var = new wm4((byte) 12);
                ((wm4) in3Var.d).c = wm4Var;
                in3Var.d = wm4Var;
                wm4Var.b = (ts4) obj;
                return in3Var.toString();
            case 11:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((x6a) obj).c;
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

    public us4(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public us4(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public us4(x6a x6aVar) {
        this.a = (byte) 11;
        this.c = x6aVar;
    }

    public us4(hu5 hu5Var, du5 du5Var, int i) {
        this.a = (byte) 8;
        this.c = hu5Var;
        this.b = du5Var;
    }
}
