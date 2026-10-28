package a5;

import a8.dh;
import a8.fg;
import a8.gh;
import a8.h0;
import a8.kg;
import a8.nd;
import a8.ng;
import a8.ob;
import a8.r1;
import a8.rb;
import a8.s1;
import a8.va;
import ag.g0;
import android.app.NotificationManager;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.biometric.e0;
import androidx.fragment.app.i0;
import androidx.fragment.app.r;
import androidx.lifecycle.z;
import androidx.mediarouter.app.s;
import androidx.mediarouter.app.u;
import com.google.android.gms.common.api.internal.c1;
import com.google.android.gms.common.api.internal.f0;
import com.google.android.gms.common.api.internal.l1;
import com.google.android.gms.common.api.internal.o0;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.TaskCompletionSource;
import di.g8;
import di.p9;
import di.q4;
import di.x;
import di.y9;
import fi.ta;
import h6.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import li.g1;
import m.r3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.y6;
import sg.w2;
public final class d implements Runnable {
    public final int f284a;
    public final Object f285b;

    public d(kg kgVar) {
        this.f284a = 1;
        rb rbVar = rb.UNKNOWN_EVENT;
        this.f285b = kgVar;
    }

    private final void a() {
        o oVar = (o) this.f285b;
        synchronized (o.f12644i) {
            try {
                if (!oVar.d()) {
                    return;
                }
                oVar.f(15);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        dh dhVar;
        Object obj;
        dh dhVar2 = null;
        switch (this.f284a) {
            case 0:
                m mVar = (m) this.f285b;
                mVar.setScrollState(0);
                mVar.s();
                return;
            case 1:
                kg kgVar = (kg) this.f285b;
                rb rbVar = rb.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                HashMap hashMap = kgVar.f585j;
                gh ghVar = (gh) hashMap.get(rbVar);
                if (ghVar != null) {
                    gh ghVar2 = ghVar;
                    nd ndVar = ghVar2.f466a;
                    if (ndVar == null) {
                        gh ghVar3 = ghVar2;
                        nd ndVar2 = new nd(ghVar3, ghVar3.f508c);
                        ghVar2.f466a = ndVar2;
                        ndVar = ndVar2;
                    }
                    Iterator it = ndVar.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Object obj2 = (Collection) ghVar.f508c.get(next);
                        if (obj2 == null) {
                            obj2 = new ArrayList(3);
                        }
                        List list = (List) obj2;
                        if (list instanceof RandomAccess) {
                            dhVar = new dh(ghVar, next, list, dhVar2);
                        } else {
                            dhVar = new dh(ghVar, next, list, dhVar2);
                        }
                        ArrayList arrayList = new ArrayList(dhVar);
                        Collections.sort(arrayList);
                        ?? obj3 = new Object();
                        int size = arrayList.size();
                        long j10 = 0;
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj4 = arrayList.get(i10);
                            i10++;
                            j10 = ((Long) obj4).longValue() + j10;
                        }
                        obj3.f955c = Long.valueOf((j10 / arrayList.size()) & Long.MAX_VALUE);
                        obj3.f953a = Long.valueOf(kg.a(arrayList, 100.0d) & Long.MAX_VALUE);
                        obj3.f956f = Long.valueOf(kg.a(arrayList, 75.0d) & Long.MAX_VALUE);
                        obj3.e = Long.valueOf(kg.a(arrayList, 50.0d) & Long.MAX_VALUE);
                        obj3.d = Long.valueOf(kg.a(arrayList, 25.0d) & Long.MAX_VALUE);
                        obj3.f954b = Long.valueOf(Long.MAX_VALUE & kg.a(arrayList, 0.0d));
                        va vaVar = new va(obj3);
                        int size2 = arrayList.size();
                        ?? obj5 = new Object();
                        obj5.f17845c = ob.TYPE_THIN;
                        h0 h0Var = new h0(1, false);
                        h0Var.f512c = Integer.valueOf(size2 & Integer.MAX_VALUE);
                        h0Var.f511b = (r1) next;
                        h0Var.d = vaVar;
                        obj5.h = new s1(h0Var);
                        sb.m.f48102a.execute(new fg(kgVar, new ng((r3) obj5, 0), rbVar, kgVar.c(), 0));
                        dhVar2 = null;
                    }
                    hashMap.remove(rbVar);
                    return;
                }
                return;
            case 2:
                for (Thread thread : ag.k.f1307w.keySet()) {
                    if (!thread.isAlive()) {
                        ag.k.f1307w.remove(thread);
                    }
                }
                if (!ag.k.f1307w.isEmpty()) {
                    AndroidUtilities.runOnUIThread(((ag.k) this.f285b).f1323p, 5000L);
                    return;
                } else {
                    ag.k.f1308x = false;
                    return;
                }
            case 3:
                g0 g0Var = (g0) this.f285b;
                if (g0Var.F.get()) {
                    g0Var.invalidate();
                    g0Var.H.postDelayed(this, 300L);
                    return;
                }
                return;
            case 4:
                try {
                    androidx.activity.l.n((androidx.activity.l) this.f285b);
                    return;
                } catch (IllegalStateException e) {
                    if (TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        return;
                    }
                    throw e;
                } catch (NullPointerException e10) {
                    if (!TextUtils.equals(e10.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e10;
                    }
                    return;
                }
            case 5:
                e0 e0Var = (e0) this.f285b;
                Context n10 = e0Var.n();
                if (n10 == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                }
                e0Var.C0.f(1);
                e0Var.C0.e(n10.getString(2131689607));
                return;
            case 6:
                androidx.fragment.app.o oVar = (androidx.fragment.app.o) this.f285b;
                oVar.f2687n0.onDismiss(oVar.f2695v0);
                return;
            case 7:
                r rVar = (r) this.f285b;
                if (rVar.Y != null) {
                    rVar.j().getClass();
                    return;
                }
                return;
            case 8:
                ((i0) this.f285b).A(true);
                return;
            case 9:
                synchronized (((z) this.f285b).f2831a) {
                    obj = ((z) this.f285b).f2834f;
                    ((z) this.f285b).f2834f = z.f2830k;
                }
                ((z) this.f285b).j(obj);
                return;
            case 10:
                u uVar = (u) this.f285b;
                uVar.i(true);
                uVar.U.requestLayout();
                uVar.U.getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.j(uVar, 0));
                return;
            case 11:
                u uVar2 = ((s) this.f285b).f3015b;
                if (uVar2.f3020c0 != null) {
                    uVar2.f3020c0 = null;
                    if (uVar2.f3038s0) {
                        uVar2.q(uVar2.f3039t0);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                f0 f0Var = (f0) this.f285b;
                l6.e eVar = f0Var.d;
                Context context = f0Var.f6522c;
                eVar.getClass();
                if (!l6.g.f16933a.getAndSet(true)) {
                    try {
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                        if (notificationManager != null) {
                            notificationManager.cancel(10436);
                            return;
                        }
                        return;
                    } catch (SecurityException e11) {
                        Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e11);
                        return;
                    }
                }
                return;
            case 13:
                ((o0) this.f285b).f();
                return;
            case 14:
                com.google.android.gms.common.api.c cVar = ((o0) ((rb.c) this.f285b).f47358b).f6584b;
                cVar.c(cVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 15:
                ((c1) this.f285b).f6511j.b(new l6.a(4));
                return;
            case 16:
                return;
            case 17:
                w wVar = (w) this.f285b;
                wVar.f6636o.lock();
                try {
                    w.l(wVar);
                    return;
                } finally {
                    wVar.f6636o.unlock();
                }
            case 18:
                d5.w wVar2 = (d5.w) this.f285b;
                d5.c cVar2 = wVar2.d;
                cVar2.k(0);
                d5.i iVar = d5.e0.f7962i;
                cVar2.j(24, iVar);
                wVar2.c(iVar);
                return;
            case 19:
                q4 q4Var = (q4) this.f285b;
                if (q4Var.f9050z1 && q4Var.Q0) {
                    y9 y9Var = ((p9) q4Var.F1).d;
                    y9Var.l1 = false;
                    y9Var.Q();
                    return;
                }
                return;
            case 20:
                ((x) this.f285b).L0 = false;
                return;
            case 21:
                g8 g8Var = (g8) this.f285b;
                g8Var.f8593b = false;
                g8Var.invalidate();
                return;
            case 22:
                sg.j jVar = ((ta) this.f285b).f10823y0;
                if (jVar instanceof w2) {
                    ((w2) jVar).getEditText();
                    return;
                }
                return;
            case 23:
                ((g6.h) this.f285b).g(false);
                return;
            case 24:
                a();
                return;
            case 25:
                i.e eVar2 = (i.e) this.f285b;
                eVar2.a(true);
                eVar2.invalidateSelf();
                return;
            case 26:
                if (((TaskCompletionSource) this.f285b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 27:
                ((li.f0) this.f285b).h();
                return;
            case 28:
                g1 g1Var = (g1) this.f285b;
                if (y6.g1()) {
                    g1Var.postDelayed(this, 100L);
                    return;
                } else {
                    g1Var.m();
                    return;
                }
            default:
                m.r1 r1Var = (m.r1) this.f285b;
                r1Var.f17840w = null;
                r1Var.drawableStateChanged();
                return;
        }
    }

    public d(l1 l1Var, d5.z zVar) {
        this.f284a = 16;
        this.f285b = zVar;
    }

    public d(Object obj, int i10) {
        this.f284a = i10;
        this.f285b = obj;
    }
}
