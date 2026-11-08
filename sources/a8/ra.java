package a8;

import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.view.TextureView;
import c8.cd;
import c8.jg;
import c8.uf;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import org.telegram.messenger.camera.CameraView;
public final class ra implements Runnable {
    public final int f621a;
    public final Object f622b;

    public ra(uf ufVar) {
        this.f621a = 14;
        c8.fb fbVar = c8.fb.UNKNOWN_EVENT;
        this.f622b = ufVar;
    }

    private final void a() {
        j6.o oVar = (j6.o) this.f622b;
        synchronized (j6.o.f16534i) {
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
        f fVar;
        Object obj;
        f fVar2;
        int i7 = 3;
        f fVar3 = null;
        switch (this.f621a) {
            case 0:
                ta taVar = (ta) this.f622b;
                a8 a8Var = a8.AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION;
                HashMap hashMap = taVar.f671j;
                i iVar = (i) hashMap.get(a8Var);
                if (iVar != null) {
                    i iVar2 = iVar;
                    b bVar = iVar2.f459a;
                    if (bVar == null) {
                        i iVar3 = iVar2;
                        b bVar2 = new b(iVar3, iVar3.f482c);
                        iVar2.f459a = bVar2;
                        bVar = bVar2;
                    }
                    Iterator it = bVar.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Object obj2 = (Collection) iVar.f482c.get(next);
                        if (obj2 == null) {
                            obj2 = new ArrayList(3);
                        }
                        List list = (List) obj2;
                        if (list instanceof RandomAccess) {
                            fVar = new f(iVar, next, list, (f) null);
                        } else {
                            fVar = new f(iVar, next, list, (f) null);
                        }
                        ArrayList arrayList = new ArrayList(fVar);
                        Collections.sort(arrayList);
                        ?? obj3 = new Object();
                        int size = arrayList.size();
                        int i10 = 0;
                        long j3 = 0;
                        while (i10 < size) {
                            Object obj4 = arrayList.get(i10);
                            i10++;
                            j3 = ((Long) obj4).longValue() + j3;
                        }
                        obj3.f509c = Long.valueOf((j3 / arrayList.size()) & Long.MAX_VALUE);
                        obj3.f507a = Long.valueOf(ta.a(arrayList, 100.0d) & Long.MAX_VALUE);
                        obj3.f511f = Long.valueOf(ta.a(arrayList, 75.0d) & Long.MAX_VALUE);
                        obj3.f510e = Long.valueOf(ta.a(arrayList, 50.0d) & Long.MAX_VALUE);
                        obj3.d = Long.valueOf(ta.a(arrayList, 25.0d) & Long.MAX_VALUE);
                        obj3.f508b = Long.valueOf(ta.a(arrayList, 0.0d) & Long.MAX_VALUE);
                        l7 l7Var = new l7(obj3);
                        int size2 = arrayList.size();
                        ?? obj5 = new Object();
                        obj5.f337c = y7.TYPE_THIN;
                        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(2, false);
                        a0Var.f1764c = Integer.valueOf(size2 & Integer.MAX_VALUE);
                        a0Var.f1763b = (e1) next;
                        a0Var.d = l7Var;
                        obj5.f339f = new f1(a0Var);
                        pb.m.f53544a.execute(new pa(taVar, new wa((b8) obj5, 0), a8Var, taVar.b(), 0));
                    }
                    hashMap.remove(a8Var);
                    return;
                }
                return;
            case 1:
                ai.i0 i0Var = (ai.i0) this.f622b;
                CameraView cameraView = i0Var.f1241b;
                if (i0Var.f1251h0 && cameraView != null) {
                    TextureView textureView = cameraView.getTextureView();
                    int width = textureView.getWidth();
                    int height = textureView.getHeight();
                    if (width > 0 && height > 0) {
                        if (width > 720 || height > 720) {
                            float f10 = width;
                            float f11 = height;
                            float min = Math.min(720.0f / f10, 720.0f / f11);
                            width = Math.max(1, (int) (f10 * min));
                            height = Math.max(1, (int) (f11 * min));
                        }
                        Bitmap bitmap = ((ai.i0) this.f622b).f1254k0;
                        if (bitmap == null || bitmap.getWidth() != width || ((ai.i0) this.f622b).f1254k0.getHeight() != height) {
                            ((ai.i0) this.f622b).f1254k0 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                        }
                        try {
                            textureView.getBitmap(((ai.i0) this.f622b).f1254k0);
                            ai.i0 i0Var2 = (ai.i0) this.f622b;
                            q4.q f12 = ai.i0.f(i0Var2.f1254k0, i0Var2.f1252i0, i0Var2.f1253j0, i0Var2.O);
                            if (f12 != null) {
                                org.telegram.messenger.g0.h3(new a1.e(12, this, f12));
                                return;
                            }
                        } catch (Throwable th2) {
                            org.telegram.messenger.a8.g(th2, true);
                        }
                    }
                    if (((ai.i0) this.f622b).f1251h0) {
                        ((ai.i0) this.f622b).f1250g0.postDelayed(this, 150L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e10) {
                    if (TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        return;
                    }
                    throw e10;
                } catch (NullPointerException e11) {
                    if (!TextUtils.equals(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e11;
                    }
                    return;
                }
            case 3:
                androidx.biometric.g0 g0Var = (androidx.biometric.g0) this.f622b;
                Context n10 = g0Var.n();
                if (n10 == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                }
                g0Var.C0.f(1);
                g0Var.C0.e(n10.getString(2131689608));
                return;
            case 4:
                androidx.fragment.app.o oVar = (androidx.fragment.app.o) this.f622b;
                oVar.f2452n0.onDismiss(oVar.f2460v0);
                return;
            case 5:
                androidx.fragment.app.r rVar = (androidx.fragment.app.r) this.f622b;
                if (rVar.Y != null) {
                    rVar.j().getClass();
                    return;
                }
                return;
            case 6:
                ((androidx.fragment.app.i0) this.f622b).A(true);
                return;
            case 7:
                synchronized (((androidx.lifecycle.z) this.f622b).f2608a) {
                    obj = ((androidx.lifecycle.z) this.f622b).f2612f;
                    ((androidx.lifecycle.z) this.f622b).f2612f = androidx.lifecycle.z.f2607k;
                }
                ((androidx.lifecycle.z) this.f622b).j(obj);
                return;
            case 8:
                androidx.mediarouter.app.t tVar = (androidx.mediarouter.app.t) this.f622b;
                tVar.i(true);
                tVar.U.requestLayout();
                tVar.U.getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.i(tVar, 0));
                return;
            case 9:
                androidx.mediarouter.app.t tVar2 = ((androidx.mediarouter.app.r) this.f622b).f2797b;
                if (tVar2.f2802c0 != null) {
                    tVar2.f2802c0 = null;
                    if (tVar2.f2820s0) {
                        tVar2.q(tVar2.f2821t0);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((b3.m) this.f622b).d();
                return;
            case 11:
                for (Thread thread : bg.i.f3296w.keySet()) {
                    if (!thread.isAlive()) {
                        bg.i.f3296w.remove(thread);
                    }
                }
                if (!bg.i.f3296w.isEmpty()) {
                    org.telegram.messenger.g0.i3(((bg.i) this.f622b).f3313p, 5000L);
                    return;
                } else {
                    bg.i.f3297x = false;
                    return;
                }
            case 12:
                bg.b0 b0Var = (bg.b0) this.f622b;
                if (b0Var.F.get()) {
                    b0Var.invalidate();
                    b0Var.H.postDelayed(this, 300L);
                    return;
                }
                return;
            case 13:
                c5.k kVar = (c5.k) this.f622b;
                kVar.setScrollState(0);
                kVar.s();
                return;
            case 14:
                uf ufVar = (uf) this.f622b;
                c8.fb fbVar = c8.fb.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                HashMap hashMap2 = ufVar.f5899j;
                jg jgVar = (jg) hashMap2.get(fbVar);
                if (jgVar != null) {
                    jg jgVar2 = jgVar;
                    cd cdVar = jgVar2.f5723a;
                    if (cdVar == null) {
                        jg jgVar3 = jgVar2;
                        cd cdVar2 = new cd(jgVar3, jgVar3.f5738c);
                        jgVar2.f5723a = cdVar2;
                        cdVar = cdVar2;
                    }
                    Iterator it2 = cdVar.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        Object obj6 = (Collection) jgVar.f5738c.get(next2);
                        if (obj6 == null) {
                            obj6 = new ArrayList(i7);
                        }
                        List list2 = (List) obj6;
                        if (list2 instanceof RandomAccess) {
                            fVar2 = new f(jgVar, next2, list2, fVar3);
                        } else {
                            fVar2 = new f(jgVar, next2, list2, fVar3);
                        }
                        ArrayList arrayList2 = new ArrayList(fVar2);
                        Collections.sort(arrayList2);
                        ?? obj7 = new Object();
                        int size3 = arrayList2.size();
                        int i11 = 0;
                        long j10 = 0;
                        while (i11 < size3) {
                            Object obj8 = arrayList2.get(i11);
                            i11++;
                            j10 = ((Long) obj8).longValue() + j10;
                        }
                        jg jgVar4 = jgVar;
                        obj7.f509c = Long.valueOf((j10 / arrayList2.size()) & Long.MAX_VALUE);
                        obj7.f507a = Long.valueOf(uf.a(arrayList2, 100.0d) & Long.MAX_VALUE);
                        obj7.f511f = Long.valueOf(uf.a(arrayList2, 75.0d) & Long.MAX_VALUE);
                        obj7.f510e = Long.valueOf(uf.a(arrayList2, 50.0d) & Long.MAX_VALUE);
                        obj7.d = Long.valueOf(uf.a(arrayList2, 25.0d) & Long.MAX_VALUE);
                        obj7.f508b = Long.valueOf(uf.a(arrayList2, 0.0d) & Long.MAX_VALUE);
                        c8.la laVar = new c8.la(obj7);
                        int size4 = arrayList2.size();
                        ga.d dVar = new ga.d(1);
                        dVar.d = c8.db.TYPE_THIN;
                        android.support.v4.media.session.a0 a0Var2 = new android.support.v4.media.session.a0(15, false);
                        a0Var2.f1764c = Integer.valueOf(size4 & Integer.MAX_VALUE);
                        a0Var2.f1763b = (c8.h1) next2;
                        a0Var2.d = laVar;
                        dVar.f13620n = new c8.i1(a0Var2);
                        uf ufVar2 = ufVar;
                        c8.fb fbVar2 = fbVar;
                        pb.m.f53544a.execute(new pa(ufVar2, new wa(dVar, 0), fbVar2, ufVar.c(), 1));
                        fbVar = fbVar2;
                        ufVar = ufVar2;
                        jgVar = jgVar4;
                        fVar3 = null;
                        i7 = 3;
                    }
                    hashMap2.remove(fbVar);
                    return;
                }
                return;
            case 15:
                com.google.android.gms.common.api.internal.b0 b0Var2 = (com.google.android.gms.common.api.internal.b0) this.f622b;
                n6.e eVar = b0Var2.d;
                Context context = b0Var2.f6565c;
                eVar.getClass();
                if (!n6.g.f20503a.getAndSet(true)) {
                    try {
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                        if (notificationManager != null) {
                            notificationManager.cancel(10436);
                            return;
                        }
                        return;
                    } catch (SecurityException e12) {
                        Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e12);
                        return;
                    }
                }
                return;
            case 16:
                ((com.google.android.gms.common.api.internal.j0) this.f622b).a();
                return;
            case 17:
                com.google.android.gms.common.api.internal.j0 j0Var = (com.google.android.gms.common.api.internal.j0) ((d6.i) this.f622b).f8209b;
                ((q6.d) j0Var.f6646b).j(j0Var.f6646b.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 18:
                ((com.google.android.gms.common.api.internal.v0) this.f622b).f6700j.b(new n6.a(4, null, null));
                return;
            case 19:
                com.google.android.gms.common.api.internal.f1 f1Var = (com.google.android.gms.common.api.internal.f1) this.f622b;
                f1Var.f6610o.lock();
                try {
                    f1Var.j();
                    return;
                } finally {
                    f1Var.f6610o.unlock();
                }
            case 20:
                di.i4 i4Var = (di.i4) this.f622b;
                if (i4Var.f9197t1 && i4Var.K0) {
                    di.p9 p9Var = ((di.g9) i4Var.f9221z1).d;
                    p9Var.f9555k1 = false;
                    p9Var.V();
                    return;
                }
                return;
            case 21:
                ((di.w) this.f622b).L0 = false;
                return;
            case 22:
                di.y7 y7Var = (di.y7) this.f622b;
                y7Var.f9987b = false;
                y7Var.invalidate();
                return;
            case 23:
                f5.s sVar = (f5.s) this.f622b;
                f5.b bVar3 = sVar.d;
                bVar3.k(0);
                f5.f fVar4 = f5.z.f11201i;
                bVar3.j(24, fVar4);
                sVar.c(fVar4);
                return;
            case 24:
                tg.j jVar = ((fi.x9) this.f622b).f12545s0;
                if (jVar instanceof tg.k2) {
                    ((tg.k2) jVar).getEditText();
                    return;
                }
                return;
            case 25:
                i.e eVar2 = (i.e) this.f622b;
                eVar2.a(true);
                eVar2.invalidateSelf();
                return;
            case 26:
                ((i6.h) this.f622b).g(false);
                return;
            case 27:
                a();
                return;
            case 28:
                ((li.f0) this.f622b).h();
                return;
            default:
                m.s1 s1Var = (m.s1) this.f622b;
                s1Var.f19251x = null;
                s1Var.drawableStateChanged();
                return;
        }
    }

    public ra(Object obj, int i7) {
        this.f621a = i7;
        this.f622b = obj;
    }

    public ra(com.google.android.gms.common.api.internal.v0 v0Var) {
        this.f621a = 18;
        Objects.requireNonNull(v0Var);
        this.f622b = v0Var;
    }
}
