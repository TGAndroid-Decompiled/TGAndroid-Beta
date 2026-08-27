package a8;

import a5.n;
import ag.c3;
import ag.w1;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.biometric.f0;
import androidx.fragment.app.j0;
import androidx.fragment.app.p;
import androidx.fragment.app.s;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.RecyclerView;
import c2.z0;
import cg.i2;
import cg.y2;
import com.google.android.exoplayer2.upstream.o0;
import com.google.android.gms.common.api.internal.d1;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.m1;
import com.google.android.gms.common.api.internal.p0;
import com.google.android.gms.common.api.internal.x;
import com.google.firebase.messaging.m;
import com.google.firebase.messaging.t;
import f2.c0;
import f2.o1;
import f2.x0;
import gf.b0;
import gf.h;
import i7.e;
import i7.e7;
import i7.f7;
import i7.ka;
import i7.r7;
import i7.t7;
import i7.w0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import java.util.WeakHashMap;
import jh.e4;
import jh.i9;
import jh.y8;
import jh.z8;
import k5.i;
import k7.de;
import k7.ed;
import k7.fb;
import k7.hb;
import k7.i1;
import k7.j1;
import k7.lg;
import k7.ma;
import k7.wf;
import lh.va;
import m.s1;
import m.t3;
import n2.v;
import org.telegram.messenger.AndroidUtilities;
import v5.g;
import zf.j;
import zf.v2;

public final class b implements Runnable {

    public final int f153a;

    public final Object f154b;

    public b(m1 m1Var, v vVar) {
        this.f153a = 16;
        this.f154b = vVar;
    }

    private final void a() {
        Object obj;
        synchronized (((z) this.f154b).f1650a) {
            obj = ((z) this.f154b).f1654f;
            ((z) this.f154b).f1654f = z.f1649k;
        }
        ((z) this.f154b).j(obj);
    }

    @Override
    public final void run() {
        int iR;
        int i10;
        int i11;
        int height;
        double d = 75.0d;
        int i12 = 3;
        e eVar = null;
        switch (this.f153a) {
            case 0:
                a aVar = (a) this.f154b;
                synchronized (aVar.f142a) {
                    try {
                        if (aVar.b()) {
                            Log.e("WakeLock", String.valueOf(aVar.f149j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            aVar.d();
                            if (aVar.b()) {
                                aVar.f144c = 1;
                                aVar.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 1:
                w1 w1Var = (w1) this.f154b;
                ArrayList arrayList = w1Var.f336c3;
                if (w1Var.f343j3) {
                    if (!arrayList.isEmpty() && (iR = RecyclerView.R((c3) i0.a.i(1, arrayList))) >= 0) {
                        View viewM = w1Var.U2.m(iR + 1);
                        if (viewM != null) {
                            w1Var.Z2 = false;
                            w1Var.w1(viewM, true);
                            w1Var.v0(0, viewM.getTop() - ((w1Var.getMeasuredHeight() - viewM.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                        }
                    }
                    w1Var.x1();
                    return;
                }
                return;
            case 2:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e9) {
                    if (!TextUtils.equals(e9.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e9;
                    }
                    return;
                } catch (NullPointerException e10) {
                    if (!TextUtils.equals(e10.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e10;
                    }
                    return;
                }
            case 3:
                f0 f0Var = (f0) this.f154b;
                Context contextN = f0Var.n();
                if (contextN == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                } else {
                    f0Var.f1049y0.f(1);
                    f0Var.f1049y0.e(contextN.getString(2131701343));
                    return;
                }
            case 4:
                p pVar = (p) this.f154b;
                pVar.f1502j0.onDismiss(pVar.f1509r0);
                return;
            case 5:
                s sVar = (s) this.f154b;
                if (sVar.U != null) {
                    sVar.j().getClass();
                    return;
                }
                return;
            case 6:
                ((j0) this.f154b).A(true);
                return;
            case 7:
                a();
                return;
            case 8:
                ((z0) this.f154b).c();
                return;
            case 9:
                i2 i2Var = (i2) this.f154b;
                String str = i2Var.f2718j0;
                if (str != null) {
                    i2Var.T(i2Var.f2721n0, str, false);
                    return;
                }
                return;
            case 10:
                y2 y2Var = (y2) this.f154b;
                String str2 = y2Var.f2878k0;
                if (str2 != null) {
                    y2.U(y2Var, str2);
                    return;
                }
                return;
            case 11:
                ((o0) this.f154b).c();
                return;
            case 12:
                g0 g0Var = (g0) this.f154b;
                v5.e eVar2 = g0Var.d;
                Context context = g0Var.f3249c;
                eVar2.getClass();
                if (g.f48797a.getAndSet(true)) {
                    return;
                }
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
            case 13:
                ((p0) this.f154b).f();
                return;
            case 14:
                com.google.android.gms.common.api.c cVar = ((p0) ((i) this.f154b).f14480b).f3320b;
                cVar.c(cVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 15:
                ((d1) this.f154b).f3241j.b(new v5.a(4));
                return;
            case 16:
                return;
            case 17:
                x xVar = (x) this.f154b;
                xVar.f3374o.lock();
                try {
                    x.l(xVar);
                    return;
                } finally {
                    xVar.f3374o.unlock();
                }
            case 18:
                f2.f0 f0Var2 = (f2.f0) this.f154b;
                c0 c0Var = f0Var2.f5665x;
                if (f0Var2.f5658c != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j10 = f0Var2.N;
                    long j11 = j10 == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j10;
                    x0 layoutManager = f0Var2.D.getLayoutManager();
                    if (f0Var2.M == null) {
                        f0Var2.M = new Rect();
                    }
                    layoutManager.c(f0Var2.f5658c.f5789a, f0Var2.M);
                    if (layoutManager.d()) {
                        int i13 = (int) (f0Var2.f5663s + f0Var2.f5661n);
                        int paddingLeft = (i13 - f0Var2.M.left) - f0Var2.D.getPaddingLeft();
                        float f10 = f0Var2.f5661n;
                        if (f10 < 0.0f && paddingLeft < 0) {
                            i10 = paddingLeft;
                        } else if (f10 <= 0.0f || (i10 = ((f0Var2.f5658c.f5789a.getWidth() + i13) + f0Var2.M.right) - (f0Var2.D.getWidth() - f0Var2.D.getPaddingRight())) <= 0) {
                            i10 = 0;
                        }
                    } else {
                        i10 = 0;
                    }
                    if (layoutManager.e()) {
                        int i14 = (int) (f0Var2.v + f0Var2.f5662r);
                        int paddingTop = (i14 - f0Var2.M.top) - f0Var2.D.getPaddingTop();
                        float f11 = f0Var2.f5662r;
                        if (f11 < 0.0f && paddingTop < 0) {
                            i11 = paddingTop;
                        } else if (f11 <= 0.0f || (height = ((f0Var2.f5658c.f5789a.getHeight() + i14) + f0Var2.M.bottom) - (f0Var2.D.getHeight() - f0Var2.D.getPaddingBottom())) <= 0) {
                            i11 = 0;
                        } else {
                            i11 = height;
                        }
                    } else {
                        i11 = 0;
                    }
                    if (i10 != 0) {
                        int width = f0Var2.f5658c.f5789a.getWidth();
                        f0Var2.D.getWidth();
                        i10 = c0Var.i(width, i10, j11);
                    }
                    if (i11 != 0) {
                        int height2 = f0Var2.f5658c.f5789a.getHeight();
                        f0Var2.D.getHeight();
                        i11 = c0Var.i(height2, i11, j11);
                    }
                    if (i10 == 0 && i11 == 0) {
                        f0Var2.N = Long.MIN_VALUE;
                        return;
                    }
                    if (f0Var2.N == Long.MIN_VALUE) {
                        f0Var2.N = jCurrentTimeMillis;
                    }
                    f0Var2.D.scrollBy(i10, i11);
                    o1 o1Var = f0Var2.f5658c;
                    if (o1Var != null) {
                        f0Var2.n(o1Var);
                    }
                    f0Var2.D.removeCallbacks(f0Var2.E);
                    RecyclerView recyclerView = f0Var2.D;
                    WeakHashMap weakHashMap = r0.j0.f46605a;
                    recyclerView.postOnAnimation(this);
                    return;
                }
                return;
            case 19:
                ((ThreadLocal) ((t) this.f154b).f4621e).set(Boolean.TRUE);
                return;
            case 20:
                for (Thread thread : h.f6976w.keySet()) {
                    if (!thread.isAlive()) {
                        h.f6976w.remove(thread);
                    }
                }
                if (h.f6976w.isEmpty()) {
                    h.f6977x = false;
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(((h) this.f154b).f6993p, 5000L);
                    return;
                }
            case 21:
                b0 b0Var = (b0) this.f154b;
                if (b0Var.B.get()) {
                    b0Var.invalidate();
                    b0Var.D.postDelayed(this, 300L);
                    return;
                }
                return;
            case 22:
                i.e eVar3 = (i.e) this.f154b;
                eVar3.a(true);
                eVar3.invalidateSelf();
                return;
            case 23:
                ka kaVar = (ka) this.f154b;
                t7 t7Var = t7.AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION;
                HashMap map = kaVar.f10715j;
                i7.h hVar = (i7.h) map.get(t7Var);
                if (hVar != null) {
                    i7.h hVar2 = hVar;
                    i7.a aVar2 = hVar2.f10642a;
                    if (aVar2 == null) {
                        i7.h hVar3 = hVar2;
                        i7.a aVar3 = new i7.a(hVar3, hVar3.f10651c);
                        hVar2.f10642a = aVar3;
                        aVar2 = aVar3;
                    }
                    for (Object obj : aVar2) {
                        Object arrayList2 = (Collection) hVar.f10651c.get(obj);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList(3);
                        }
                        List list = (List) arrayList2;
                        ArrayList arrayList3 = new ArrayList(list instanceof RandomAccess ? new i7.b(hVar, obj, list, null) : new e(hVar, obj, list, (e) null));
                        Collections.sort(arrayList3);
                        e7 e7Var = new e7();
                        int size = arrayList3.size();
                        int i15 = 0;
                        long jLongValue = 0;
                        while (i15 < size) {
                            Object obj2 = arrayList3.get(i15);
                            i15++;
                            jLongValue = ((Long) obj2).longValue() + jLongValue;
                        }
                        e7Var.f10628c = Long.valueOf((jLongValue / ((long) arrayList3.size())) & Long.MAX_VALUE);
                        e7Var.f10626a = Long.valueOf(ka.a(arrayList3, 100.0d) & Long.MAX_VALUE);
                        e7Var.f10630f = Long.valueOf(ka.a(arrayList3, d) & Long.MAX_VALUE);
                        e7Var.f10629e = Long.valueOf(ka.a(arrayList3, 50.0d) & Long.MAX_VALUE);
                        e7Var.d = Long.valueOf(ka.a(arrayList3, 25.0d) & Long.MAX_VALUE);
                        e7Var.f10627b = Long.valueOf(ka.a(arrayList3, 0.0d) & Long.MAX_VALUE);
                        f7 f7Var = new f7(e7Var);
                        int size2 = arrayList3.size();
                        m mVar = new m();
                        mVar.f4604c = r7.TYPE_THIN;
                        n nVar = new n(22, false);
                        nVar.f101c = Integer.valueOf(size2 & Integer.MAX_VALUE);
                        nVar.f100b = (w0) obj;
                        nVar.d = f7Var;
                        mVar.f4606f = new i7.x0(nVar);
                        za.m.f50301a.execute(new bf.e(kaVar, new b6.a(mVar, 0), t7Var, kaVar.b(), false, 5));
                        d = 75.0d;
                    }
                    map.remove(t7Var);
                    return;
                }
                return;
            case 24:
                e4 e4Var = (e4) this.f154b;
                if (e4Var.G1 && e4Var.X0) {
                    i9 i9Var = ((z8) e4Var.M1).d;
                    i9Var.f13484h1 = false;
                    i9Var.P();
                    return;
                }
                return;
            case 25:
                ((y8) this.f154b).H0 = false;
                return;
            case 26:
                jh.r7 r7Var = (jh.r7) this.f154b;
                r7Var.f13917b = false;
                r7Var.invalidate();
                return;
            case 27:
                wf wfVar = (wf) this.f154b;
                hb hbVar = hb.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                HashMap map2 = wfVar.f15027j;
                lg lgVar = (lg) map2.get(hbVar);
                if (lgVar != null) {
                    lg lgVar2 = lgVar;
                    ed edVar = lgVar2.f14862a;
                    if (edVar == null) {
                        lg lgVar3 = lgVar2;
                        ed edVar2 = new ed(lgVar3, lgVar3.f14872c);
                        lgVar2.f14862a = edVar2;
                        edVar = edVar2;
                    }
                    for (Object obj3 : edVar) {
                        Object arrayList4 = (Collection) lgVar.f14872c.get(obj3);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList(i12);
                        }
                        List list2 = (List) arrayList4;
                        ArrayList arrayList5 = new ArrayList(list2 instanceof RandomAccess ? new de(lgVar, obj3, list2, eVar) : new e(lgVar, obj3, list2, eVar));
                        Collections.sort(arrayList5);
                        e7 e7Var2 = new e7();
                        int size3 = arrayList5.size();
                        int i16 = 0;
                        long jLongValue2 = 0;
                        while (i16 < size3) {
                            Object obj4 = arrayList5.get(i16);
                            i16++;
                            jLongValue2 = ((Long) obj4).longValue() + jLongValue2;
                        }
                        lg lgVar4 = lgVar;
                        e7Var2.f10628c = Long.valueOf((jLongValue2 / ((long) arrayList5.size())) & Long.MAX_VALUE);
                        e7Var2.f10626a = Long.valueOf(wf.a(arrayList5, 100.0d) & Long.MAX_VALUE);
                        e7Var2.f10630f = Long.valueOf(wf.a(arrayList5, 75.0d) & Long.MAX_VALUE);
                        e7Var2.f10629e = Long.valueOf(wf.a(arrayList5, 50.0d) & Long.MAX_VALUE);
                        e7Var2.d = Long.valueOf(wf.a(arrayList5, 25.0d) & Long.MAX_VALUE);
                        e7Var2.f10627b = Long.valueOf(wf.a(arrayList5, 0.0d) & Long.MAX_VALUE);
                        ma maVar = new ma(e7Var2);
                        int size4 = arrayList5.size();
                        t3 t3Var = new t3();
                        t3Var.f17475c = fb.TYPE_THIN;
                        j9.a aVar4 = new j9.a(3, false);
                        aVar4.f12864c = Integer.valueOf(size4 & Integer.MAX_VALUE);
                        aVar4.f12863b = (i1) obj3;
                        aVar4.d = maVar;
                        t3Var.h = new j1(aVar4);
                        wf wfVar2 = wfVar;
                        hb hbVar2 = hbVar;
                        za.m.f50301a.execute(new bf.e(wfVar2, new b6.a(t3Var, 0), hbVar2, wfVar.c(), false, 6));
                        hbVar = hbVar2;
                        wfVar = wfVar2;
                        lgVar = lgVar4;
                        i12 = 3;
                        eVar = null;
                    }
                    map2.remove(hbVar);
                    return;
                }
                return;
            case 28:
                j jVar = ((va) this.f154b).F0;
                if (jVar instanceof v2) {
                    ((v2) jVar).getEditText();
                    return;
                }
                return;
            default:
                s1 s1Var = (s1) this.f154b;
                s1Var.f17454w = null;
                s1Var.drawableStateChanged();
                return;
        }
    }

    public b(Object obj, int i10) {
        this.f153a = i10;
        this.f154b = obj;
    }

    public b(wf wfVar) {
        this.f153a = 27;
        hb hbVar = hb.UNKNOWN_EVENT;
        this.f154b = wfVar;
    }
}
