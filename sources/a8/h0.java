package a8;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.fingerprint.FingerprintManager;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessagingService;
import j$.util.DesugarCollections;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a00;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.p81;
import org.telegram.ui.Components.s81;
public final class h0 implements la.a, com.google.android.gms.common.api.internal.r, p81, z3.d, j4.a0 {
    public static h0 e;
    public final int f510a;
    public Object f511b;
    public Object f512c;
    public Object d;

    public h0(int i10, boolean z10) {
        this.f510a = i10;
    }

    public static final URL f(h0 h0Var) {
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority((String) h0Var.d).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        bb.b bVar = (bb.b) h0Var.f511b;
        Uri.Builder appendPath2 = appendPath.appendPath(bVar.f3725a).appendPath("settings");
        bb.a aVar = bVar.f3726b;
        return new URL(appendPath2.appendQueryParameter("build_version", aVar.f3722c).appendQueryParameter("display_version", aVar.f3721b).build().toString());
    }

    public static String j(String str, HashMap hashMap) {
        String str2;
        String str3;
        StringBuilder sb2 = new StringBuilder();
        Iterator it = hashMap.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb2.append((String) entry.getKey());
        sb2.append("=");
        if (entry.getValue() == null) {
            str2 = "";
        } else {
            str2 = URLEncoder.encode((String) entry.getValue(), "UTF-8");
        }
        sb2.append(str2);
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb2.append("&");
            sb2.append((String) entry2.getKey());
            sb2.append("=");
            if (entry2.getValue() == null) {
                str3 = "";
            } else {
                str3 = URLEncoder.encode((String) entry2.getValue(), "UTF-8");
            }
            sb2.append(str3);
        }
        String sb3 = sb2.toString();
        if (sb3.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                sb3 = "&".concat(sb3);
            }
            return b10.u(str, sb3);
        }
        return a1.g.D(str, "?", sb3);
    }

    @Override
    public void a(e2.x xVar) {
        long d;
        long j10;
        ((e2.k0) this.f512c).getClass();
        String str = e2.n0.f9692a;
        e2.k0 k0Var = (e2.k0) this.f512c;
        synchronized (k0Var) {
            try {
                long j11 = k0Var.f9681c;
                if (j11 != -9223372036854775807L) {
                    d = j11 + k0Var.f9680b;
                } else {
                    d = k0Var.d();
                }
                j10 = d;
            } finally {
            }
        }
        long e10 = ((e2.k0) this.f512c).e();
        if (j10 != -9223372036854775807L && e10 != -9223372036854775807L) {
            b2.x xVar2 = (b2.x) this.f511b;
            if (e10 != xVar2.f3590x) {
                b2.w a2 = xVar2.a();
                a2.f3537w = e10;
                b2.x xVar3 = new b2.x(a2);
                this.f511b = xVar3;
                ((c3.j0) this.d).b(xVar3);
            }
            int a10 = xVar.a();
            ((c3.j0) this.d).d(a10, xVar);
            ((c3.j0) this.d).c(j10, 1, a10, 0, null);
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        boolean z10;
        d6.e0 e0Var = (d6.e0) this.f511b;
        String str = (String) this.f512c;
        d6.i iVar = (d6.i) this.d;
        h6.w wVar = (h6.w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (e0Var.F == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        o6.l.j("Not connected to device", z10);
        h6.f fVar = (h6.f) wVar.u();
        Parcel N0 = fVar.N0();
        N0.writeString(str);
        com.google.android.gms.internal.cast.t.c(N0, iVar);
        fVar.S0(N0, 13);
        synchronized (e0Var.f8071r) {
            try {
                if (e0Var.f8068o != null) {
                    e0Var.i(2477);
                }
                e0Var.f8068o = taskCompletionSource;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void b(e2.k0 k0Var, c3.q qVar, j4.f0 f0Var) {
        this.f512c = k0Var;
        f0Var.b();
        f0Var.c();
        c3.j0 F1 = qVar.F1(f0Var.f15315c, 5);
        this.d = F1;
        F1.b((b2.x) this.f511b);
    }

    @Override
    public int c(long j10) {
        long[] jArr = (long[]) this.d;
        int b10 = e2.n0.b(jArr, j10, false);
        if (b10 < jArr.length) {
            return b10;
        }
        return -1;
    }

    @Override
    public la.a d(Class cls, ka.d dVar) {
        ((HashMap) this.f511b).put(cls, dVar);
        ((HashMap) this.f512c).remove(cls);
        return this;
    }

    @Override
    public long e(int i10) {
        boolean z10;
        long[] jArr = (long[]) this.d;
        boolean z11 = false;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        if (i10 < jArr.length) {
            z11 = true;
        }
        yb.g(z11);
        return jArr[i10];
    }

    @Override
    public List g(long j10) {
        List list = (List) this.f511b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            long[] jArr = (long[]) this.f512c;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                i4.c cVar = (i4.c) list.get(i10);
                d2.b bVar = cVar.f13852a;
                if (bVar.e == -3.4028235E38f) {
                    arrayList2.add(cVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new a4.d(19));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            d2.b bVar2 = ((i4.c) arrayList2.get(i12)).f13852a;
            arrayList.add(new d2.b(bVar2.f7857a, bVar2.f7858b, bVar2.f7859c, bVar2.d, (-1) - i12, 1, bVar2.f7861g, bVar2.h, bVar2.f7862i, bVar2.f7867n, bVar2.f7868o, bVar2.f7863j, bVar2.f7864k, bVar2.f7865l, bVar2.f7866m, bVar2.f7869p, bVar2.f7870q, bVar2.f7871r));
        }
        return arrayList;
    }

    public int h(int r12) {
        throw new UnsupportedOperationException("Method not decompiled: a8.h0.h(int):int");
    }

    public int i() {
        l6.h hVar = (l6.h) this.d;
        if (hVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        Context context = hVar.f16938a;
        FingerprintManager c10 = l6.h.c(context);
        if (c10 != null && c10.isHardwareDetected()) {
            FingerprintManager c11 = l6.h.c(context);
            if (c11 != null && c11.hasEnrolledFingerprints()) {
                return 0;
            }
            return 11;
        }
        return 12;
    }

    @Override
    public int k() {
        return ((long[]) this.d).length;
    }

    public ca.a l() {
        throw new UnsupportedOperationException("Method not decompiled: a8.h0.l():ca.a");
    }

    public androidx.lifecycle.p0 m(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return n(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public androidx.lifecycle.p0 n(Class cls, String key) {
        androidx.lifecycle.p0 viewModel;
        androidx.lifecycle.n0 n0Var;
        androidx.lifecycle.s0 s0Var = (androidx.lifecycle.s0) this.f512c;
        kotlin.jvm.internal.i.e(key, "key");
        androidx.lifecycle.t0 t0Var = (androidx.lifecycle.t0) this.f511b;
        t0Var.getClass();
        LinkedHashMap linkedHashMap = t0Var.f2817a;
        androidx.lifecycle.p0 p0Var = (androidx.lifecycle.p0) linkedHashMap.get(key);
        if (cls.isInstance(p0Var)) {
            if (s0Var instanceof androidx.lifecycle.n0) {
                n0Var = (androidx.lifecycle.n0) s0Var;
            } else {
                n0Var = null;
            }
            if (n0Var != null) {
                kotlin.jvm.internal.i.b(p0Var);
                androidx.lifecycle.o oVar = n0Var.d;
                if (oVar != null) {
                    m.p pVar = n0Var.e;
                    kotlin.jvm.internal.i.b(pVar);
                    androidx.lifecycle.j0.a(p0Var, pVar, oVar);
                }
            }
            kotlin.jvm.internal.i.c(p0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return p0Var;
        }
        v1.b bVar = new v1.b((b2.h) this.d);
        ((LinkedHashMap) bVar.f3212a).put(androidx.lifecycle.q0.f2815b, key);
        try {
            viewModel = s0Var.B(cls, bVar);
        } catch (AbstractMethodError unused) {
            viewModel = s0Var.a(cls);
        }
        kotlin.jvm.internal.i.e(viewModel, "viewModel");
        androidx.lifecycle.p0 p0Var2 = (androidx.lifecycle.p0) linkedHashMap.put(key, viewModel);
        if (p0Var2 != null) {
            p0Var2.b();
        }
        return viewModel;
    }

    public Object o(Bitmap bitmap) {
        ih.a aVar = (ih.a) this.f511b;
        if (aVar.a(bitmap)) {
            this.d = ((ih.b) this.f512c).a(bitmap);
            aVar.b(bitmap);
        }
        return this.d;
    }

    @Override
    public void onError(s81 s81Var, Exception exc) {
        fi.p9 p9Var = ((fi.o6) this.d).N;
        if (p9Var != null) {
            p9Var.run();
        }
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        fi.o6 o6Var = (fi.o6) this.d;
        fi.m6 m6Var = o6Var.K;
        s81 s81Var = o6Var.e;
        if (s81Var == null) {
            return;
        }
        if (s81Var.y()) {
            AndroidUtilities.runOnUIThread(m6Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(m6Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((fi.o6) this.d).i();
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        fi.o6 o6Var = (fi.o6) this.d;
        fi.w7 w7Var = (fi.w7) this.f511b;
        if (w7Var != null) {
            fi.v7 q5 = o6Var.e.q(w7Var.f11898d1);
            w7Var.f11898d1 = q5;
            h81 h81Var = o6Var.f11377n;
            if (h81Var != null) {
                h81Var.setHDRInfo(q5);
            }
        }
        int i13 = (int) (i10 * f7);
        o6Var.f11369f = i13;
        int i14 = (int) (i11 * f7);
        o6Var.h = i14;
        if (w7Var != null && (w7Var.f11911k0 != i13 || w7Var.f11913l0 != i14)) {
            w7Var.f11911k0 = i13;
            w7Var.f11913l0 = i14;
            w7Var.A();
        }
        o6Var.b();
        h81 h81Var2 = o6Var.f11377n;
        if (h81Var2 != null) {
            int i15 = o6Var.f11369f;
            int i16 = o6Var.h;
            h81Var2.d = i15;
            h81Var2.e = i16;
            e00 e00Var = h81Var2.f28860b;
            if (e00Var != null) {
                e00Var.postRunnable(new a00(e00Var, i15, i16, 0));
            }
        }
    }

    public void p(i8.f fVar) {
        try {
            j8.g gVar = (j8.g) this.f512c;
            i8.i iVar = new i8.i(fVar);
            Parcel N0 = gVar.N0();
            t7.b.c(N0, iVar);
            gVar.R0(N0, 9);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean q() {
        throw new UnsupportedOperationException("Method not decompiled: a8.h0.q():boolean");
    }

    public void r(String str, String str2) {
        ((HashMap) this.f512c).put(str, str2);
    }

    public void s(ec.i iVar, Object obj) {
        if (((EnumMap) this.d) == null) {
            this.d = new EnumMap(ec.i.class);
        }
        ((EnumMap) this.d).put((EnumMap) iVar, (ec.i) obj);
    }

    public void t(y2.a aVar) {
        j2.j jVar = (j2.j) ((HashMap) this.f511b).remove(aVar);
        jVar.getClass();
        i2.h hVar = (i2.h) ((i2.i) this.d).f13571p.get(jVar);
        if (hVar != null) {
            synchronized (hVar) {
                hVar.d--;
            }
        }
    }

    public String toString() {
        String str = "";
        switch (this.f510a) {
            case 10:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f511b);
                sb2.append('{');
                com.google.android.gms.internal.play_billing.k kVar = ((com.google.android.gms.internal.play_billing.k) this.f512c).f7257b;
                while (kVar != null) {
                    Object obj = kVar.f7256a;
                    sb2.append(str);
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    kVar = kVar.f7257b;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 16:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f511b);
                sb3.append('{');
                rf.b bVar = (rf.b) ((rf.b) this.f512c).f47333c;
                while (bVar != null) {
                    Object obj2 = bVar.f47332b;
                    sb3.append(str);
                    if (obj2 != null && obj2.getClass().isArray()) {
                        String deepToString2 = Arrays.deepToString(new Object[]{obj2});
                        sb3.append((CharSequence) deepToString2, 1, deepToString2.length() - 1);
                    } else {
                        sb3.append(obj2);
                    }
                    bVar = (rf.b) bVar.f47333c;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            case 17:
                return (String) this.f511b;
            default:
                return super.toString();
        }
    }

    public synchronized void u() {
        ((i2.i) this.d).f13561c.e();
    }

    public void v(int i10, String str, String str2) {
        ((HashMap) this.f511b).put(str, str2);
        ((HashMap) this.f512c).put(str2, str);
        ((HashMap) this.d).put(str, Integer.valueOf(i10));
    }

    public h0(Object obj, Object obj2, Object obj3, int i10) {
        this.f510a = i10;
        this.f511b = obj;
        this.f512c = obj2;
        this.d = obj3;
    }

    @Override
    public void onRenderedFirstFrame() {
        fi.w7 w7Var = (fi.w7) this.f511b;
        Runnable[] runnableArr = (Runnable[]) this.f512c;
        fi.o6 o6Var = (fi.o6) this.d;
        fi.n6 n6Var = o6Var.H;
        if (n6Var != null && n6Var.f11306g) {
            int i10 = o6Var.f11369f;
            int i11 = o6Var.h;
            n6Var.d = true;
            n6Var.e = i10;
            n6Var.f11305f = i11;
            hi.e2 e2Var = n6Var.f11304c;
            if (e2Var != null) {
                e2Var.run(Integer.valueOf(i10), Integer.valueOf(n6Var.f11305f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            o6Var.post(runnable);
            runnableArr[0] = null;
            Bitmap bitmap = o6Var.f11361a;
            if (bitmap != null) {
                bitmap.recycle();
                if (w7Var.M0 == o6Var.f11361a) {
                    w7Var.M0 = null;
                }
                o6Var.f11361a = null;
                o6Var.invalidate();
                return;
            }
            return;
        }
        h81 h81Var = o6Var.f11377n;
        if (h81Var != null) {
            if (n6Var == null || !n6Var.f11306g) {
                h81Var.animate().alpha(1.0f).setDuration(180L).withEndAction(new e2.q0(11, this, w7Var)).start();
            }
        }
    }

    public h0(int i10) {
        this.f510a = i10;
        switch (i10) {
            case 14:
                this.f511b = new HashMap();
                this.f512c = new HashMap();
                this.d = new HashMap();
                return;
            default:
                this.f511b = new HashMap();
                this.f512c = new HashMap();
                this.d = f0.f445c;
                return;
        }
    }

    public h0(CastDevice castDevice, e6.d0 d0Var) {
        this.f510a = 12;
        o6.l.i(castDevice, "CastDevice parameter cannot be null");
        this.f511b = castDevice;
        this.f512c = d0Var;
    }

    public h0(f6.h hVar) {
        this.f510a = 18;
        this.d = hVar;
        this.f512c = new AtomicLong((h6.a.f12620b.nextLong() & 65535) * 10000);
    }

    public h0(i8.d dVar, j8.g gVar) {
        this.f510a = 23;
        this.f512c = gVar;
        o6.l.h(dVar);
        this.f511b = dVar;
    }

    public h0(String str, int i10) {
        this.f510a = i10;
        switch (i10) {
            case 16:
                rf.b bVar = new rf.b(17, false);
                this.f512c = bVar;
                this.d = bVar;
                this.f511b = str;
                return;
            case 25:
                b2.w wVar = new b2.w();
                wVar.f3532q = b2.w0.n("video/mp2t");
                wVar.f3533r = b2.w0.n(str);
                this.f511b = new b2.x(wVar);
                return;
            default:
                Object obj = new Object();
                this.f512c = obj;
                this.d = obj;
                this.f511b = str;
                return;
        }
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    public h0(ih.b bVar) {
        this.f510a = 24;
        this.f511b = new ih.a();
        this.f512c = bVar;
    }

    public h0(bb.b bVar, ld.h hVar) {
        this.f510a = 15;
        this.f511b = bVar;
        this.f512c = hVar;
        this.d = "firebase-settings.crashlytics.com";
    }

    public h0(ArrayList arrayList) {
        this.f510a = 22;
        this.f511b = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.f512c = new long[arrayList.size() * 2];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            i4.c cVar = (i4.c) arrayList.get(i10);
            int i11 = i10 * 2;
            long[] jArr = (long[]) this.f512c;
            jArr[i11] = cVar.f13853b;
            jArr[i11 + 1] = cVar.f13854c;
        }
        long[] jArr2 = (long[]) this.f512c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = copyOf;
        Arrays.sort(copyOf);
    }

    public h0(String str, HashMap hashMap) {
        this.f510a = 9;
        this.d = str;
        this.f511b = hashMap;
        this.f512c = new HashMap();
    }

    public h0(String str, ec.j[] jVarArr) {
        this.f510a = 17;
        System.currentTimeMillis();
        this.f511b = str;
        this.f512c = jVarArr;
        this.d = null;
    }

    public h0(androidx.lifecycle.t0 store, androidx.lifecycle.s0 factory, b2.h defaultCreationExtras) {
        this.f510a = 7;
        kotlin.jvm.internal.i.e(store, "store");
        kotlin.jvm.internal.i.e(factory, "factory");
        kotlin.jvm.internal.i.e(defaultCreationExtras, "defaultCreationExtras");
        this.f511b = store;
        this.f512c = factory;
        this.d = defaultCreationExtras;
    }

    public h0(androidx.lifecycle.t0 store, androidx.lifecycle.s0 s0Var) {
        this(store, s0Var, v1.a.f49982b);
        this.f510a = 7;
        kotlin.jvm.internal.i.e(store, "store");
    }

    public h0(FirebaseMessagingService firebaseMessagingService, b6.i iVar, ExecutorService executorService) {
        this.f510a = 11;
        this.f511b = executorService;
        this.f512c = firebaseMessagingService;
        this.d = iVar;
    }

    public h0(Context context, LocationManager locationManager) {
        this.f510a = 20;
        this.d = new Object();
        this.f511b = context;
        this.f512c = locationManager;
    }

    public h0(androidx.biometric.v vVar) {
        this.f510a = 5;
        this.d = vVar;
    }

    public h0(androidx.fragment.app.u owner) {
        this(owner.f(), owner.c(), owner.d());
        this.f510a = 7;
        kotlin.jvm.internal.i.e(owner, "owner");
    }

    public h0(c2.o[] oVarArr) {
        this.f510a = 28;
        k2.z0 z0Var = new k2.z0();
        ?? obj = new Object();
        obj.f5989c = 1.0f;
        obj.d = 1.0f;
        c2.l lVar = c2.l.e;
        obj.e = lVar;
        obj.f5990f = lVar;
        obj.f5991g = lVar;
        obj.h = lVar;
        ByteBuffer byteBuffer = c2.o.f5959a;
        obj.f5994k = byteBuffer;
        obj.f5995l = byteBuffer;
        obj.f5988b = -1;
        c2.o[] oVarArr2 = new c2.o[oVarArr.length + 2];
        this.f511b = oVarArr2;
        System.arraycopy(oVarArr, 0, oVarArr2, 0, oVarArr.length);
        this.f512c = z0Var;
        this.d = obj;
        oVarArr2[oVarArr.length] = z0Var;
        oVarArr2[oVarArr.length + 1] = obj;
    }

    public h0(Signature signature) {
        this.f510a = 27;
        this.f511b = signature;
        this.f512c = null;
        this.d = null;
    }

    public h0(Cipher cipher) {
        this.f510a = 27;
        this.f512c = cipher;
        this.f511b = null;
        this.d = null;
    }

    public h0(Mac mac) {
        this.f510a = 27;
        this.d = mac;
        this.f512c = null;
        this.f511b = null;
    }

    public h0(View view, jh.k kVar) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        this.f510a = 26;
        bi.i6 i6Var = new bi.i6(this, 2);
        this.f511b = view;
        this.f512c = kVar;
        view.addOnAttachStateChangeListener(i6Var);
        if (!view.isAttachedToWindow() || (viewTreeObserver2 = (ViewTreeObserver) this.d) == (viewTreeObserver = view.getViewTreeObserver())) {
            return;
        }
        if (viewTreeObserver2 != null) {
            if (viewTreeObserver2.isAlive()) {
                ((ViewTreeObserver) this.d).removeOnPreDrawListener(kVar);
            }
            this.d = null;
        }
        this.d = viewTreeObserver;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(kVar);
        }
    }

    public h0(l6.h hVar) {
        this.f510a = 6;
        Context context = hVar.f16938a;
        this.f511b = hVar;
        int i10 = Build.VERSION.SDK_INT;
        this.f512c = i10 >= 29 ? androidx.biometric.q.b(context) : null;
        this.d = i10 <= 29 ? new l6.h(context, 3) : null;
    }

    public h0(fi.o6 o6Var, fi.w7 w7Var, Runnable[] runnableArr) {
        this.f510a = 19;
        this.d = o6Var;
        this.f511b = w7Var;
        this.f512c = runnableArr;
    }

    public h0(i2.i iVar, j2.j jVar) {
        this.f510a = 21;
        this.d = iVar;
        this.f511b = new HashMap();
        this.f512c = jVar;
    }
}
