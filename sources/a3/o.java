package a3;

import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.media.session.a0;
import android.text.TextUtils;
import android.util.Log;
import android.view.TextureView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.g0;
import androidx.fragment.app.j0;
import androidx.lifecycle.z;
import b8.ah;
import b8.cg;
import b8.dh;
import b8.hg;
import b8.kd;
import b8.kg;
import b8.lb;
import b8.ob;
import b8.p1;
import b8.q1;
import b8.ta;
import com.google.android.gms.common.api.internal.b0;
import com.google.android.gms.common.api.internal.g1;
import com.google.android.gms.common.api.internal.w0;
import com.google.android.gms.tasks.TaskCompletionSource;
import ei.i9;
import ei.j4;
import ei.r9;
import ei.x;
import ei.y7;
import gi.x9;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import m.r1;
import org.telegram.messenger.a8;
import org.telegram.messenger.camera.CameraView;
import ug.l2;
public final class o implements Runnable {
    public final int f103a;
    public final Object f104b;

    public o(hg hgVar) {
        this.f103a = 10;
        ob obVar = ob.UNKNOWN_EVENT;
        this.f104b = hgVar;
    }

    private final void a() {
        i6.o oVar = (i6.o) this.f104b;
        synchronized (i6.o.f14646i) {
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
        Object obj;
        ah ahVar;
        m.h hVar;
        int i3 = 0;
        switch (this.f103a) {
            case 0:
                ((n) this.f104b).b();
                return;
            case 1:
                try {
                    androidx.activity.l.n((androidx.activity.l) this.f104b);
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
            case 2:
                g0 g0Var = (g0) this.f104b;
                Context n4 = g0Var.n();
                if (n4 == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                }
                g0Var.D0.f(1);
                g0Var.D0.e(n4.getString(2131689608));
                return;
            case 3:
                androidx.fragment.app.p pVar = (androidx.fragment.app.p) this.f104b;
                pVar.f1882o0.onDismiss(pVar.f1890w0);
                return;
            case 4:
                androidx.fragment.app.s sVar = (androidx.fragment.app.s) this.f104b;
                if (sVar.Z != null) {
                    sVar.j().getClass();
                    return;
                }
                return;
            case 5:
                ((j0) this.f104b).A(true);
                return;
            case 6:
                synchronized (((z) this.f104b).f2035a) {
                    obj = ((z) this.f104b).f2039f;
                    ((z) this.f104b).f2039f = z.f2034k;
                }
                ((z) this.f104b).j(obj);
                return;
            case 7:
                androidx.mediarouter.app.t tVar = (androidx.mediarouter.app.t) this.f104b;
                tVar.i(true);
                tVar.V.requestLayout();
                tVar.V.getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.i(tVar, 0));
                return;
            case 8:
                androidx.mediarouter.app.t tVar2 = ((androidx.mediarouter.app.r) this.f104b).f2230b;
                if (tVar2.f2236d0 != null) {
                    tVar2.f2236d0 = null;
                    if (tVar2.f2254t0) {
                        tVar2.q(tVar2.f2255u0);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                b5.l lVar = (b5.l) this.f104b;
                lVar.setScrollState(0);
                lVar.s();
                return;
            case 10:
                hg hgVar = (hg) this.f104b;
                ob obVar = ob.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                HashMap hashMap = hgVar.f2665j;
                dh dhVar = (dh) hashMap.get(obVar);
                if (dhVar != null) {
                    dh dhVar2 = dhVar;
                    kd kdVar = dhVar2.f2526a;
                    if (kdVar == null) {
                        dh dhVar3 = dhVar2;
                        kd kdVar2 = new kd(dhVar3, dhVar3.f2554c);
                        dhVar2.f2526a = kdVar2;
                        kdVar = kdVar2;
                    }
                    Iterator it = kdVar.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Object obj2 = (Collection) dhVar.f2554c.get(next);
                        if (obj2 == null) {
                            obj2 = new ArrayList(3);
                        }
                        List list = (List) obj2;
                        if (list instanceof RandomAccess) {
                            ahVar = new ah(dhVar, next, list, (ah) null);
                        } else {
                            ahVar = new ah(dhVar, next, list, (ah) null);
                        }
                        ArrayList arrayList = new ArrayList(ahVar);
                        Collections.sort(arrayList);
                        ?? obj3 = new Object();
                        int size = arrayList.size();
                        long j10 = 0;
                        int i10 = i3;
                        while (i10 < size) {
                            Object obj4 = arrayList.get(i10);
                            i10++;
                            j10 = ((Long) obj4).longValue() + j10;
                        }
                        obj3.f3062c = Long.valueOf((j10 / arrayList.size()) & Long.MAX_VALUE);
                        obj3.f3060a = Long.valueOf(hg.a(arrayList, 100.0d) & Long.MAX_VALUE);
                        obj3.f3064f = Long.valueOf(hg.a(arrayList, 75.0d) & Long.MAX_VALUE);
                        obj3.f3063e = Long.valueOf(hg.a(arrayList, 50.0d) & Long.MAX_VALUE);
                        obj3.d = Long.valueOf(hg.a(arrayList, 25.0d) & Long.MAX_VALUE);
                        obj3.f3061b = Long.valueOf(Long.MAX_VALUE & hg.a(arrayList, 0.0d));
                        ta taVar = new ta(obj3);
                        int size2 = arrayList.size();
                        fa.f fVar = new fa.f(1);
                        fVar.d = lb.TYPE_THIN;
                        a0 a0Var = new a0(7, false);
                        a0Var.f1187c = Integer.valueOf(size2 & Integer.MAX_VALUE);
                        a0Var.f1186b = (p1) next;
                        a0Var.d = taVar;
                        fVar.f11543n = new q1(a0Var);
                        mb.m.f19245a.execute(new cg(hgVar, new kg(fVar, 0), obVar, hgVar.c(), 0));
                        i3 = 0;
                    }
                    hashMap.remove(obVar);
                    return;
                }
                return;
            case 11:
                bi.a0 a0Var2 = (bi.a0) this.f104b;
                CameraView cameraView = a0Var2.f3359b;
                if (a0Var2.f3370i0 && cameraView != null) {
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
                        Bitmap bitmap = ((bi.a0) this.f104b).f3373l0;
                        if (bitmap == null || bitmap.getWidth() != width || ((bi.a0) this.f104b).f3373l0.getHeight() != height) {
                            ((bi.a0) this.f104b).f3373l0 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                        }
                        try {
                            textureView.getBitmap(((bi.a0) this.f104b).f3373l0);
                            bi.a0 a0Var3 = (bi.a0) this.f104b;
                            p4.q f12 = bi.a0.f(a0Var3.f3373l0, a0Var3.f3371j0, a0Var3.f3372k0, a0Var3.P);
                            if (f12 != null) {
                                org.telegram.messenger.g0.h3(new a1.f(14, this, f12));
                                return;
                            }
                        } catch (Throwable th2) {
                            a8.g(th2, true);
                        }
                    }
                    if (((bi.a0) this.f104b).f3370i0) {
                        ((bi.a0) this.f104b).f3369h0.postDelayed(this, 150L);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                for (Thread thread : cg.h.f4661w.keySet()) {
                    if (!thread.isAlive()) {
                        cg.h.f4661w.remove(thread);
                    }
                }
                if (!cg.h.f4661w.isEmpty()) {
                    org.telegram.messenger.g0.i3(((cg.h) this.f104b).f4678p, 5000L);
                    return;
                } else {
                    cg.h.f4662x = false;
                    return;
                }
            case 13:
                cg.a0 a0Var4 = (cg.a0) this.f104b;
                if (a0Var4.G.get()) {
                    a0Var4.invalidate();
                    a0Var4.I.postDelayed(this, 300L);
                    return;
                }
                return;
            case 14:
                b0 b0Var = (b0) this.f104b;
                m6.e eVar = b0Var.d;
                Context context = b0Var.f6616c;
                eVar.getClass();
                if (!m6.g.f19191a.getAndSet(true)) {
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
            case 15:
                ((com.google.android.gms.common.api.internal.j0) this.f104b).a();
                return;
            case 16:
                com.google.android.gms.common.api.internal.j0 j0Var = (com.google.android.gms.common.api.internal.j0) ((android.support.v4.media.c) this.f104b).f1155b;
                ((p6.d) j0Var.f6697b).h(j0Var.f6697b.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 17:
                ((w0) this.f104b).f6761j.b(new m6.a(4, null, null));
                return;
            case 18:
                g1 g1Var = (g1) this.f104b;
                g1Var.f6687o.lock();
                try {
                    g1Var.j();
                    return;
                } finally {
                    g1Var.f6687o.unlock();
                }
            case 19:
                e5.s sVar2 = (e5.s) this.f104b;
                e5.b bVar = sVar2.d;
                bVar.k(0);
                e5.f fVar2 = e5.z.f9644i;
                bVar.j(24, fVar2);
                sVar2.c(fVar2);
                return;
            case 20:
                j4 j4Var = (j4) this.f104b;
                if (j4Var.f10511u1 && j4Var.L0) {
                    r9 r9Var = ((i9) j4Var.A1).d;
                    r9Var.m1 = false;
                    r9Var.d0();
                    return;
                }
                return;
            case 21:
                ((x) this.f104b).M0 = false;
                return;
            case 22:
                y7 y7Var = (y7) this.f104b;
                y7Var.f11246b = false;
                y7Var.invalidate();
                return;
            case 23:
                ug.j jVar = ((x9) this.f104b).f13229t0;
                if (jVar instanceof l2) {
                    ((l2) jVar).getEditText();
                    return;
                }
                return;
            case 24:
                ((h6.h) this.f104b).g(false);
                return;
            case 25:
                i.e eVar2 = (i.e) this.f104b;
                eVar2.a(true);
                eVar2.invalidateSelf();
                return;
            case 26:
                a();
                return;
            case 27:
                if (((TaskCompletionSource) this.f104b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 28:
                r1 r1Var = (r1) this.f104b;
                r1Var.f18719x = null;
                r1Var.drawableStateChanged();
                return;
            default:
                ActionMenuView actionMenuView = ((Toolbar) this.f104b).f1396a;
                if (actionMenuView != null && (hVar = actionMenuView.K) != null) {
                    hVar.l();
                    return;
                }
                return;
        }
    }

    public o(Object obj, int i3) {
        this.f103a = i3;
        this.f104b = obj;
    }

    public o(w0 w0Var) {
        this.f103a = 17;
        Objects.requireNonNull(w0Var);
        this.f104b = w0Var;
    }
}
