package hf;

import a3.i0;
import a3.k0;
import ad.j;
import android.content.Context;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.a0;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import androidx.emoji2.text.v;
import androidx.fragment.app.j0;
import androidx.mediarouter.app.q;
import b2.b2;
import b2.u;
import bi.j4;
import bi.m0;
import bi.m1;
import bi.n0;
import bi.n1;
import c5.b0;
import c5.m;
import c6.e0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.c1;
import com.google.android.gms.internal.cast.c2;
import com.google.android.gms.internal.cast.t;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.t3;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.h;
import e2.x;
import fe.g;
import fe.l;
import g2.o;
import g2.p;
import g6.n;
import g6.w;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j4.c0;
import j4.g0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import jg.r0;
import k2.r;
import kotlin.jvm.internal.i;
import org.telegram.messenger.cd;
import org.telegram.messenger.ef;
import org.telegram.messenger.f8;
import org.telegram.messenger.w0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.mg;
import org.telegram.ui.PhotoViewer;
import p4.y;
import p4.z;
public class b implements h, wd.b, m1, b0, s, OnCompleteListener, com.google.android.gms.internal.clearcut.h, g, g2.g, n, fe.e, j4.b0, Continuation, ai {
    public static volatile b d;
    public final int f7656a;
    public Object f7657b;
    public Object f7658c;

    public b(int i10, Object obj, Object obj2) {
        this.f7656a = i10;
        this.f7657b = obj;
        this.f7658c = obj2;
    }

    public static void J(b bVar, boolean z10, boolean z11) {
        synchronized (bVar) {
            boolean z12 = false;
            if (z10) {
                if (((PowerManager.WakeLock) bVar.f7658c) == null) {
                    if (((Context) bVar.f7657b).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        e2.a.l("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) ((Context) bVar.f7657b).getSystemService("power");
                    if (powerManager == null) {
                        e2.a.l("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    }
                    PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    bVar.f7658c = newWakeLock;
                    newWakeLock.setReferenceCounted(false);
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) bVar.f7658c;
            if (wakeLock == null) {
                return;
            }
            if (z10 && z11) {
                z12 = true;
            }
            if (z12) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public static boolean O(Editable editable, KeyEvent keyEvent, boolean z10) {
        v[] vVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (vVarArr = (v[]) editable.getSpans(selectionStart, selectionEnd, v.class)) != null && vVarArr.length > 0) {
                for (v vVar : vVarArr) {
                    int spanStart = editable.getSpanStart(vVar);
                    int spanEnd = editable.getSpanEnd(vVar);
                    if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final void Q(i2.d dVar) {
        synchronized (dVar) {
        }
        Handler handler = (Handler) this.f7657b;
        if (handler != null) {
            handler.post(new k0(this, dVar, 1));
        }
    }

    public static b e0() {
        b bVar;
        b bVar2 = d;
        if (bVar2 == null) {
            synchronized (b.class) {
                try {
                    bVar = d;
                    if (bVar == null) {
                        bVar = new b(0);
                        d = bVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return bVar;
        }
        return bVar2;
    }

    @Override
    public void A(d6.f fVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((d6.c) fVar).a());
    }

    public void A0(g3 g3Var, p3 p3Var) {
        if (g3Var == null) {
            return;
        }
        try {
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.n((x3) t10.f5214b, g3Var);
            ((u) this.f7658c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void B(Editable editable) {
        ((n0) this.f7658c).i();
        ((m0) this.f7657b).W();
    }

    public void B0(i3 i3Var, p3 p3Var) {
        try {
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.o((x3) t10.f5214b, i3Var);
            ((u) this.f7658c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void C(mg mgVar) {
        mgVar.run();
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public void E(float r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: hf.b.E(float, int):void");
    }

    @Override
    public void F(d6.f fVar, String str) {
        d6.c cVar = (d6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarted " + cVar.a() + " " + str);
        o0(cVar);
    }

    @Override
    public void G(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((d6.c) fVar).a() + " " + i10);
    }

    @Override
    public boolean H(boolean z10) {
        return false;
    }

    @Override
    public void H0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        bi biVar = (bi) this.f7657b;
        try {
            HashMap<Object, Object> selectedPhotos = biVar.a2.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                ef efVar = (ef) selectedPhotos.values().iterator().next();
                String str = efVar.h;
                if (str == null) {
                    str = efVar.I;
                }
                r0 r0Var = (r0) this.f7658c;
                r0Var.d0(r0Var.f0(str, true));
                biVar.dismiss();
            }
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
    }

    @Override
    public boolean I(n1 n1Var) {
        return false;
    }

    public c5.d K() {
        if (((m) this.f7657b) != null) {
            return new c5.d(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    public void L() {
        this.f7657b = null;
        this.f7658c = null;
    }

    public boolean M(int i10) {
        return ((b2.v) this.f7657b).f2347a.get(i10);
    }

    public void P(i2.d dVar) {
        switch (this.f7656a) {
            case 2:
                Q(dVar);
                return;
            default:
                synchronized (dVar) {
                }
                Handler handler = (Handler) this.f7657b;
                if (handler != null) {
                    handler.post(new r(this, dVar, 0));
                    return;
                }
                return;
        }
    }

    public void R(androidx.fragment.app.s f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.f7657b).f1496y;
        if (sVar != null) {
            sVar.p().f1487o.R(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7658c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void S(androidx.fragment.app.s f7, boolean z10) {
        i.e(f7, "f");
        j0 j0Var = (j0) this.f7657b;
        androidx.fragment.app.v vVar = j0Var.f1494w.f1583b;
        androidx.fragment.app.s sVar = j0Var.f1496y;
        if (sVar != null) {
            sVar.p().f1487o.S(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7658c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void T(androidx.fragment.app.s f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.f7657b).f1496y;
        if (sVar != null) {
            sVar.p().f1487o.T(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7658c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void U(androidx.fragment.app.s f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.f7657b).f1496y;
        if (sVar != null) {
            sVar.p().f1487o.U(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7658c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void V(androidx.fragment.app.s f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.f7657b).f1496y;
        if (sVar != null) {
            sVar.p().f1487o.V(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7658c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void W(androidx.fragment.app.s f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.f7657b).f1496y;
        if (sVar != null) {
            sVar.p().f1487o.W(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7658c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void X(androidx.fragment.app.s f7, boolean z10) {
        i.e(f7, "f");
        j0 j0Var = (j0) this.f7657b;
        androidx.fragment.app.v vVar = j0Var.f1494w.f1583b;
        androidx.fragment.app.s sVar = j0Var.f1496y;
        if (sVar != null) {
            sVar.p().f1487o.X(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7658c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void Y(androidx.fragment.app.s f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.f7657b).f1496y;
        if (sVar != null) {
            sVar.p().f1487o.Y(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7658c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void Z(androidx.fragment.app.s f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.f7657b).f1496y;
        if (sVar != null) {
            sVar.p().f1487o.Z(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7658c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    @Override
    public void a() {
        ((l) this.f7657b).a();
    }

    public void a0(androidx.fragment.app.s f7, Bundle bundle, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.f7657b).f1496y;
        if (sVar != null) {
            sVar.p().f1487o.a0(f7, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7658c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    @Override
    public boolean a1() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        boolean z10;
        e0 e0Var = (e0) this.f7657b;
        String str = (String) this.f7658c;
        w wVar = (w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (e0Var.F == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        n6.l.i("Not connected to device", z10);
        g6.f fVar = (g6.f) wVar.v();
        Parcel P0 = fVar.P0();
        P0.writeString(str);
        fVar.U0(P0, 5);
        synchronized (e0Var.f3875s) {
            try {
                if (e0Var.f3872p != null) {
                    taskCompletionSource.setException(n6.l.l(new Status(2001, null, null, null)));
                } else {
                    e0Var.f3872p = taskCompletionSource;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void b(n1 n1Var) {
        ((m0) this.f7657b).b(n1Var);
    }

    public void b0(androidx.fragment.app.s f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.f7657b).f1496y;
        if (sVar != null) {
            sVar.p().f1487o.b0(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7658c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    @Override
    public void c(x xVar) {
        j4.e0 e0Var = (j4.e0) this.f7658c;
        SparseArray sparseArray = e0Var.h;
        a4.g gVar = (a4.g) this.f7657b;
        if (xVar.A() == 0 && (xVar.A() & 128) != 0) {
            xVar.O(6);
            int a2 = xVar.a() / 4;
            for (int i10 = 0; i10 < a2; i10++) {
                xVar.k(0, 4, (byte[]) gVar.f260b);
                gVar.d0(0);
                int i11 = gVar.i(16);
                gVar.f0(3);
                if (i11 == 0) {
                    gVar.f0(13);
                } else {
                    int i12 = gVar.i(13);
                    if (sparseArray.get(i12) == null) {
                        sparseArray.put(i12, new c0(new cc.f(e0Var, i12)));
                        e0Var.f9464n++;
                    }
                }
            }
            if (e0Var.f9454a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    public void c0(androidx.fragment.app.s f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.f7657b).f1496y;
        if (sVar != null) {
            sVar.p().f1487o.c0(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7658c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    @Override
    public g2.h createDataSource() {
        return new o((Context) this.f7657b, ((p) this.f7658c).createDataSource());
    }

    public void d0(androidx.fragment.app.s f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.f7657b).f1496y;
        if (sVar != null) {
            sVar.p().f1487o.d0(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7658c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    @Override
    public void e(n1 n1Var) {
        ((m0) this.f7657b).j();
    }

    @Override
    public boolean f() {
        return ((m0) this.f7657b).O();
    }

    public android.support.v4.media.session.m f0() {
        MediaController.TransportControls transportControls = ((android.support.v4.media.session.h) this.f7657b).f888a.getTransportControls();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            return new android.support.v4.media.session.l(transportControls);
        }
        if (i10 >= 24) {
            return new android.support.v4.media.session.l(transportControls);
        }
        return new android.support.v4.media.session.l(transportControls);
    }

    public boolean g0(CharSequence charSequence, int i10, int i11, androidx.emoji2.text.o oVar) {
        int i12;
        if (oVar.f1400c == 0) {
            androidx.emoji2.text.h hVar = (androidx.emoji2.text.h) this.f7658c;
            p1.a b10 = oVar.b();
            int a2 = b10.a(8);
            if (a2 != 0) {
                ((ByteBuffer) b10.d).getShort(a2 + b10.f44530a);
            }
            androidx.emoji2.text.d dVar = (androidx.emoji2.text.d) hVar;
            dVar.getClass();
            ThreadLocal threadLocal = androidx.emoji2.text.d.f1376b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i10 < i11) {
                sb2.append(charSequence.charAt(i10));
                i10++;
            }
            TextPaint textPaint = dVar.f1377a;
            String sb3 = sb2.toString();
            int i13 = i0.d.f7768a;
            if (textPaint.hasGlyph(sb3)) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            oVar.f1400c = i12;
        }
        if (oVar.f1400c != 2) {
            return false;
        }
        return true;
    }

    @Override
    public void h(int i10, int i11) {
        ((m0) this.f7657b).R(i10, i11);
    }

    public boolean h0() {
        if (((a) ((a0) this.f7657b).d) != null) {
            return true;
        }
        return false;
    }

    @Override
    public void i(n1 n1Var, int i10, int i11) {
        k9 y3;
        m0 m0Var = (m0) this.f7657b;
        if (!((n0) this.f7658c).d && i10 != i11 && (y3 = m0Var.y()) != null) {
            if (!y3.x() || y3.W != m0Var.J()) {
                n1Var.post(new bi.k0(this, n1Var, i11, y3, m0Var, i10));
            }
        }
    }

    public void i0(q qVar) {
        if (qVar != null) {
            if (!((Set) this.f7658c).add(qVar)) {
                Log.w("MediaControllerCompat", "the callback has already been registered");
                return;
            }
            Handler handler = new Handler();
            qVar.f(handler);
            android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.f7657b;
            hVar.f888a.registerCallback(qVar.f1846a, handler);
            synchronized (hVar.f889b) {
                if (hVar.e.a() != null) {
                    android.support.v4.media.session.g gVar = new android.support.v4.media.session.g(qVar);
                    hVar.d.put(qVar, gVar);
                    qVar.f1848c = gVar;
                    try {
                        hVar.e.a().p(gVar);
                        qVar.e(13, null, null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                } else {
                    qVar.f1848c = null;
                    hVar.f890c.add(qVar);
                }
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    @Override
    public void j(d6.f fVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((d6.c) fVar).a() + " " + str);
    }

    @Override
    public void k(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((d6.c) fVar).a() + " " + i10);
    }

    public void k0(Object obj) {
        Handler handler = (Handler) this.f7657b;
        if (handler != null) {
            handler.post(new i0(this, obj, SystemClock.elapsedRealtime(), 0));
        }
    }

    @Override
    public boolean l() {
        return false;
    }

    public void l0(j4 j4Var) {
        d dVar;
        j4 j4Var2;
        Log.d("CAST_CONTROLLER", "set current media");
        a0 a0Var = (a0) this.f7657b;
        j4 j4Var3 = (j4) a0Var.f876c;
        if (b5.d.u()) {
            if (j4Var3 != null || j4Var != null) {
                if (j4Var3 != null) {
                    ArrayList arrayList = j4Var3.f3120a;
                    if (j4Var != null && arrayList.size() == j4Var.f3120a.size()) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            f c10 = j4Var3.c(i10);
                            f c11 = j4Var.c(i10);
                            if ((c10 == null && c11 == null) || (c10 != null && c11 != null && Objects.equals(c10.f7674a, c11.f7674a) && Objects.equals(c10.f7675b, c11.f7675b) && Objects.equals(c10.f7676c, c11.f7676c) && Objects.equals(c10.d, c11.d) && c10.e == c11.e && c10.f7677f == c11.f7677f)) {
                            }
                        }
                        return;
                    }
                }
            } else {
                return;
            }
        }
        if (((a) a0Var.d) != null && j4Var != null) {
            a0Var.e(j4Var);
        }
        if (((a) a0Var.d) != null && (j4Var2 = (j4) a0Var.f876c) != null) {
            a0Var.w(j4Var2);
        }
        if (j4Var != null && j4Var.f3120a.size() > 0 && !j4Var.c(0).f7674a.startsWith("audio/") && (dVar = (d) a0Var.f875b) != null) {
            dVar.l(null, null);
        }
        a aVar = (a) a0Var.d;
        if (aVar != null && j4Var != null) {
            aVar.d = j4Var;
            aVar.f7655g = 0;
            aVar.h = 0;
            aVar.p();
        }
        a0Var.f876c = j4Var;
    }

    @Override
    public boolean m(float f7) {
        return false;
    }

    public void m0(m mVar) {
        this.f7657b = mVar;
        if (mVar.a() != null) {
            mVar.a().getClass();
            String str = mVar.a().d;
            if (str != null) {
                this.f7658c = str;
            }
        }
    }

    @Override
    public void o(d6.f fVar, boolean z10) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((d6.c) fVar).a() + " " + z10);
    }

    public void o0(d6.c cVar) {
        String str;
        String L0;
        a0 a0Var = (a0) this.f7657b;
        if (cVar != null) {
            n6.l.d("Must be called from the main thread.");
            e6.h hVar = cVar.f5768j;
            String a2 = cVar.a();
            if (!TextUtils.isEmpty(a2) && hVar != null) {
                a aVar = (a) a0Var.d;
                if (aVar == null || !TextUtils.equals(aVar.f7653c.a(), a2)) {
                    a0Var.A(new a(cVar, (d6.g) this.f7658c, hVar));
                    n6.l.d("Must be called from the main thread.");
                    CastDevice castDevice = cVar.f5769k;
                    if (castDevice != null) {
                        str = castDevice.d;
                    } else {
                        str = null;
                    }
                    PhotoViewer v12 = PhotoViewer.v1();
                    d.i();
                    if (v12.E != null && v12.f33470e0 != null && v12.U1()) {
                        cc ccVar = new cc(v12.f33470e0, new th.b());
                        if (!TextUtils.isEmpty(str)) {
                            L0 = cd.a0(null, null, 2131752102, str);
                        } else {
                            L0 = cd.L0(2131752103, null);
                        }
                        ccVar.Q(2131624027, 36, L0).j();
                    }
                }
            }
        }
    }

    @Override
    public void onComplete(Task task) {
        boolean z10;
        boolean z11;
        d6.b bVar;
        boolean z12;
        String str;
        com.google.android.gms.internal.cast.q qVar = (com.google.android.gms.internal.cast.q) this.f7657b;
        d6.b bVar2 = (d6.b) this.f7658c;
        y yVar = qVar.f4740c;
        g6.b bVar3 = com.google.android.gms.internal.cast.q.f4739j;
        if (task.isSuccessful()) {
            Bundle bundle = (Bundle) task.getResult();
            if (bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED")) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (true != z12) {
                str = "not existed";
            } else {
                str = "existed";
            }
            bVar3.b("The module-to-client output switcher flag %s", str);
            if (z12) {
                z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                Log.i(bVar3.f7367a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f5761y)));
                if (!z10 && bVar2.f5761y) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (yVar == null && (bVar = qVar.d) != null) {
                    boolean z13 = bVar.f5759w;
                    boolean z14 = bVar.f5758s;
                    z zVar = new z();
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        zVar.f44846b = z11;
                    }
                    if (i10 >= 30) {
                        zVar.d = z13;
                    }
                    if (i10 >= 30) {
                        zVar.f44847c = z14;
                    }
                    y.i(new p4.a0(zVar));
                    Log.i(bVar3.f7367a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(qVar.f4742i), Boolean.valueOf(z11), Boolean.valueOf(z13), Boolean.valueOf(z14)));
                    if (z13) {
                        t tVar = qVar.f4741f;
                        n6.l.g(tVar);
                        com.google.android.gms.internal.cast.p pVar = new com.google.android.gms.internal.cast.p(tVar);
                        y.b();
                        y.c().f44713f = pVar;
                        c2.a(c1.CAST_TRANSFER_TO_LOCAL_ENABLED);
                        return;
                    }
                    return;
                }
            }
        }
        z10 = true;
        Log.i(bVar3.f7367a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f5761y)));
        if (!z10) {
        }
        z11 = false;
        if (yVar == null) {
        }
    }

    @Override
    public Object p(wd.c cVar, ed.c cVar2) {
        Object p5 = ((u9.b) this.f7657b).p(new bb.a0(cVar, (bb.c0) this.f7658c), cVar2);
        if (p5 == dd.a.f5864a) {
            return p5;
        }
        return j.f401a;
    }

    public void p0(q qVar) {
        if (qVar != null) {
            if (!((Set) this.f7658c).remove(qVar)) {
                Log.w("MediaControllerCompat", "the callback has never been registered");
                return;
            }
            try {
                ((android.support.v4.media.session.h) this.f7657b).b(qVar);
                return;
            } finally {
                qVar.f(null);
            }
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    @Override
    public void q(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((d6.c) fVar).a() + " " + i10);
        ((a0) this.f7657b).A(null);
    }

    public void q0(ArrayList arrayList) {
        f2.t tVar;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((f2.s) arrayList.get(i10)).f6786a == 1) {
                try {
                    tVar = new f2.t((f2.s) arrayList.get(i10));
                } catch (f2.r unused) {
                    tVar = null;
                }
                this.f7658c = tVar;
            }
        }
    }

    public void r0(b2 b2Var) {
        Handler handler = (Handler) this.f7657b;
        if (handler != null) {
            handler.post(new a1.f(4, this, b2Var));
        }
    }

    @Override
    public void s(String str, long j10, long j11, long j12) {
        n nVar = (n) this.f7657b;
        if (nVar != null) {
            nVar.s(str, j10, j11, j12);
        }
    }

    public void s0(g3 g3Var) {
        try {
            A0(g3Var, (p3) this.f7657b);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void t(d6.f fVar) {
        d6.c cVar = (d6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarting " + cVar.a());
        o0(cVar);
    }

    public void t0(g3 g3Var, int i10, long j10) {
        try {
            o3 o3Var = (o3) ((p3) this.f7657b).g();
            o3Var.c();
            p3.p((p3) o3Var.f5214b, i10);
            p3 p3Var = (p3) o3Var.a();
            this.f7657b = p3Var;
            if (j10 != 0) {
                o3 o3Var2 = (o3) p3Var.g();
                o3Var2.c();
                p3.r((p3) o3Var2.f5214b, j10);
                p3Var = (p3) o3Var2.a();
            }
            A0(g3Var, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public Object then(Task task) {
        j6.a aVar = (j6.a) this.f7657b;
        Bundle bundle = (Bundle) this.f7658c;
        aVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        if (bundle2 != null && bundle2.containsKey("google.messenger")) {
            return aVar.a(bundle).onSuccessTask(j6.n.f9701a, j6.b.f9682b);
        }
        return task;
    }

    @Override
    public void u(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((d6.c) fVar).a() + " " + i10);
    }

    public void u0(g3 g3Var, long j10, boolean z10) {
        p3 p3Var;
        try {
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.f5214b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f5214b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j10 == 0) {
                p3Var = (p3) this.f7657b;
            } else {
                o3 o3Var = (o3) ((p3) this.f7657b).g();
                o3Var.c();
                p3.r((p3) o3Var.f5214b, j10);
                p3Var = (p3) o3Var.a();
            }
            A0(g3Var2, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void v(int i10, float f7, float f10, fe.f fVar) {
        hh.i iVar = (hh.i) this.f7658c;
        iVar.f7697c.a(f7);
        iVar.d.a(f7);
        iVar.f7696b.a(f7);
        ((Runnable) this.f7657b).run();
    }

    @Override
    public void w(CharSequence charSequence) {
        ((m0) this.f7657b).F(charSequence);
    }

    public void w0(g3 g3Var, int i10, long j10, boolean z10) {
        p3 p3Var;
        try {
            o3 o3Var = (o3) ((p3) this.f7657b).g();
            o3Var.c();
            p3.p((p3) o3Var.f5214b, i10);
            this.f7657b = (p3) o3Var.a();
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.f5214b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f5214b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j10 == 0) {
                p3Var = (p3) this.f7657b;
            } else {
                o3 o3Var2 = (o3) ((p3) this.f7657b).g();
                o3Var2.c();
                p3.r((p3) o3Var2.f5214b, j10);
                p3Var = (p3) o3Var2.a();
            }
            A0(g3Var2, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public boolean x(n1 n1Var) {
        return false;
    }

    public void x0(l3 l3Var) {
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.f7657b);
            t10.c();
            x3.p((x3) t10.f5214b, l3Var);
            ((u) this.f7658c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void y(String str, long j10, int i10, Object obj, long j11, long j12) {
        ((g6.m) this.f7658c).f7377g = null;
        n nVar = (n) this.f7657b;
        if (nVar != null) {
            nVar.y(str, j10, i10, obj, j11, j12);
        }
    }

    public void y0(a4 a4Var) {
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.f7657b);
            t10.c();
            x3.r((x3) t10.f5214b, a4Var);
            ((u) this.f7658c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void z() {
        ((l) this.f7657b).b((fe.m) this.f7658c);
    }

    public void z0(b4 b4Var) {
        if (b4Var == null) {
            return;
        }
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.f7657b);
            t10.c();
            x3.s((x3) t10.f5214b, b4Var);
            ((u) this.f7658c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public Object zzp() {
        boolean z10;
        Map map;
        com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) this.f7657b;
        com.google.android.gms.internal.clearcut.b bVar = (com.google.android.gms.internal.clearcut.b) this.f7658c;
        bVar.getClass();
        if (com.google.android.gms.internal.clearcut.d.e()) {
            z10 = ((Boolean) com.google.android.gms.internal.clearcut.d.c(new com.google.android.gms.internal.clearcut.e("gms:phenotype:phenotype_flag:debug_disable_caching", 0))).booleanValue();
        } else {
            z10 = false;
        }
        if (z10) {
            map = bVar.b();
        } else {
            map = bVar.e;
        }
        if (map == null) {
            synchronized (bVar.d) {
                try {
                    Map map2 = bVar.e;
                    map = map2;
                    if (map2 == null) {
                        HashMap b10 = bVar.b();
                        bVar.e = b10;
                        map = b10;
                    }
                } finally {
                }
            }
        }
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        return (String) map.get(dVar.f4902b);
    }

    public b(int i10, boolean z10) {
        this.f7656a = i10;
    }

    public b(Object obj, int i10) {
        this.f7656a = i10;
        this.f7657b = obj;
    }

    public b(Object obj, Object obj2, boolean z10, int i10) {
        this.f7656a = i10;
        this.f7658c = obj;
        this.f7657b = obj2;
    }

    public b(Context context, p3 p3Var) {
        this.f7656a = 10;
        u uVar = new u(1);
        try {
            l5.s.b(context);
            uVar.f2301c = l5.s.a().c(j5.a.e).a("PLAY_BILLING_LIBRARY", new i5.c("proto"), new t7.u(4));
        } catch (Throwable unused) {
            uVar.f2300b = true;
        }
        this.f7658c = uVar;
        this.f7657b = p3Var;
    }

    public b(m6.a aVar) {
        this.f7656a = 17;
        this.f7657b = aVar == null ? null : aVar.f13016b;
    }

    public b(j0 j0Var) {
        this.f7656a = 5;
        this.f7657b = j0Var;
        this.f7658c = new CopyOnWriteArrayList();
    }

    public b(int i10) {
        this.f7656a = i10;
        switch (i10) {
            case 1:
                this.f7657b = ByteBuffer.allocateDirect(500);
                return;
            default:
                d6.a c10 = d6.a.c(w0.f19025b);
                d2.c cVar = new d2.c(12);
                c10.getClass();
                n6.l.d("Must be called from the main thread.");
                d6.g gVar = c10.f5745c;
                gVar.getClass();
                try {
                    d6.y yVar = gVar.f5777a;
                    d6.j jVar = new d6.j(cVar);
                    Parcel P0 = yVar.P0();
                    com.google.android.gms.internal.cast.u.d(P0, jVar);
                    yVar.T0(P0, 4);
                } catch (RemoteException e) {
                    d6.g.f5776c.a(e, "Unable to call %s on %s.", "addCastStateListener", d6.y.class.getSimpleName());
                }
                this.f7657b = new a0(19);
                d6.g b10 = c10.b();
                this.f7658c = b10;
                b10.a(this);
                o0(b10.c());
                return;
        }
    }

    @Override
    public void N() {
    }

    @Override
    public void j0() {
    }

    @Override
    public void n() {
    }

    @Override
    public void r() {
    }

    @Override
    public void g(boolean z10) {
    }

    @Override
    public void n0(Object obj) {
    }

    @Override
    public void v0(TLRPC.User user) {
    }

    public b(Context context) {
        this.f7656a = 19;
        p pVar = new p();
        this.f7657b = context.getApplicationContext();
        this.f7658c = pVar;
    }

    public b(b2.v vVar, SparseArray sparseArray) {
        this.f7656a = 25;
        this.f7657b = vVar;
        SparseBooleanArray sparseBooleanArray = vVar.f2347a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            int a2 = vVar.a(i10);
            j2.a aVar = (j2.a) sparseArray.get(a2);
            aVar.getClass();
            sparseArray2.append(a2, aVar);
        }
        this.f7658c = sparseArray2;
    }

    public b(ji.f fVar, hb.a aVar, androidx.emoji2.text.d dVar) {
        this.f7656a = 4;
        this.f7657b = fVar;
        this.f7658c = dVar;
    }

    public b(Handler handler, a3.m0 m0Var) {
        this.f7656a = 2;
        if (m0Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f7657b = handler;
        this.f7658c = m0Var;
    }

    public b(Handler handler, k2.w wVar) {
        this.f7656a = 29;
        if (wVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f7657b = handler;
        this.f7658c = wVar;
    }

    public b(ArrayList arrayList, ArrayList arrayList2) {
        this.f7656a = 21;
        int size = arrayList.size();
        this.f7657b = new int[size];
        this.f7658c = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.f7657b)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.f7658c)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    public b(int i10, int i11) {
        this.f7656a = 21;
        this.f7657b = new int[]{i10, i11};
        this.f7658c = new float[]{0.0f, 1.0f};
    }

    @Override
    public void d(e2.k0 k0Var, c3.q qVar, g0 g0Var) {
    }

    public b(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f7656a = 3;
        if (mediaSessionCompat$Token != null) {
            this.f7658c = DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.f7657b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            } else {
                this.f7657b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public b(int i10, int i11, int i12) {
        this.f7656a = 21;
        this.f7657b = new int[]{i10, i11, i12};
        this.f7658c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public b(j4.e0 e0Var) {
        this.f7656a = 26;
        this.f7658c = e0Var;
        this.f7657b = new a4.g(new byte[4], 4);
    }

    @Override
    public void b1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
