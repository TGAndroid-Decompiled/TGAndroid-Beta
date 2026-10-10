package aa;

import a1.g;
import ai.ca;
import ai.v2;
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
import androidx.lifecycle.j0;
import androidx.lifecycle.n0;
import androidx.lifecycle.o;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import b2.r;
import b2.r0;
import c3.h0;
import c3.q;
import c6.e0;
import c6.i;
import cc.j;
import ci.a7;
import ci.b7;
import ci.ha;
import ci.k8;
import ci.l8;
import ci.u5;
import ci.z6;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.play_billing.k;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.m;
import da.c;
import e2.b0;
import e2.d0;
import e6.h;
import g6.f;
import g6.w;
import hc.e;
import j$.util.DesugarCollections;
import j4.a0;
import j4.f0;
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
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import m.p;
import m.q3;
import n4.x;
import n6.l;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.i00;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.m00;
import sc.v;
import z3.d;
public final class a implements s, i81, d, a0, OnCompleteListener, n5.b {
    public static a f382e;
    public final int f383a;
    public Object f384b;
    public Object f385c;
    public Object d;

    public a(int i10) {
        this.f383a = i10;
    }

    public static final URL c(a aVar) {
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority((String) aVar.f384b).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        za.b bVar = (za.b) aVar.f385c;
        Uri.Builder appendPath2 = appendPath.appendPath(bVar.f54235a).appendPath("settings");
        za.a aVar2 = bVar.f54236b;
        return new URL(appendPath2.appendQueryParameter("build_version", aVar2.f54228c).appendQueryParameter("display_version", aVar2.f54227b).build().toString());
    }

    public static String h(String str, HashMap hashMap) {
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
            return v.v(str, sb3);
        }
        return g.D(str, "?", sb3);
    }

    @Override
    public void a(e2.v vVar) {
        long d;
        long j3;
        e2.d.h((b0) this.f385c);
        String str = d0.f8532a;
        b0 b0Var = (b0) this.f385c;
        synchronized (b0Var) {
            try {
                long j10 = b0Var.f8525c;
                if (j10 != -9223372036854775807L) {
                    d = j10 + b0Var.f8524b;
                } else {
                    d = b0Var.d();
                }
                j3 = d;
            } finally {
            }
        }
        long e7 = ((b0) this.f385c).e();
        if (j3 != -9223372036854775807L && e7 != -9223372036854775807L) {
            b2.s sVar = (b2.s) this.f384b;
            if (e7 != sVar.f3647w) {
                r a2 = sVar.a();
                a2.v = e7;
                b2.s sVar2 = new b2.s(a2);
                this.f384b = sVar2;
                ((h0) this.d).b(sVar2);
            }
            int a10 = vVar.a();
            ((h0) this.d).d(a10, vVar);
            ((h0) this.d).c(j3, 1, a10, 0, null);
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        boolean z10;
        e0 e0Var = (e0) this.f385c;
        String str = (String) this.f384b;
        i iVar = (i) this.d;
        w wVar = (w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (e0Var.F == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        l.j("Not connected to device", z10);
        f fVar = (f) wVar.u();
        Parcel N0 = fVar.N0();
        N0.writeString(str);
        com.google.android.gms.internal.cast.v.c(N0, iVar);
        fVar.S0(N0, 13);
        synchronized (e0Var.f4354r) {
            try {
                if (e0Var.f4351o != null) {
                    e0Var.i(2477);
                }
                e0Var.f4351o = taskCompletionSource;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void b(b0 b0Var, q qVar, f0 f0Var) {
        this.f385c = b0Var;
        f0Var.b();
        f0Var.c();
        h0 f22 = qVar.f2(f0Var.f13808c, 5);
        this.d = f22;
        f22.b((b2.s) this.f384b);
    }

    public l5.i d() {
        String str;
        if (((String) this.f384b) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((i5.d) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new l5.i((String) this.f384b, (byte[]) this.f385c, (i5.d) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override
    public int e(long j3) {
        long[] jArr = (long[]) this.d;
        int a2 = d0.a(jArr, j3, false);
        if (a2 < jArr.length) {
            return a2;
        }
        return -1;
    }

    public int f(int r12) {
        throw new UnsupportedOperationException("Method not decompiled: aa.a.f(int):int");
    }

    public int g() {
        k0.b bVar = (k0.b) this.d;
        if (bVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        Context context = bVar.f14320a;
        FingerprintManager b10 = k0.b.b(context);
        if (b10 != null && b10.isHardwareDetected()) {
            FingerprintManager b11 = k0.b.b(context);
            if (b11 != null && b11.hasEnrolledFingerprints()) {
                return 0;
            }
            return 11;
        }
        return 12;
    }

    @Override
    public Object mo27get() {
        return new l5.s(new ob.a(24), new na.d(24), (q5.b) ((u5) this.f384b).mo27get(), (c) ((q3) this.f385c).mo27get(), (com.google.firebase.messaging.s) ((oi.f) this.d).mo27get());
    }

    public aa.b i() {
        throw new UnsupportedOperationException("Method not decompiled: aa.a.i():aa.b");
    }

    public p0 j(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return k(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public p0 k(Class cls, String key) {
        p0 viewModel;
        n0 n0Var;
        s0 s0Var = (s0) this.f385c;
        kotlin.jvm.internal.i.e(key, "key");
        t0 t0Var = (t0) this.f384b;
        t0Var.getClass();
        LinkedHashMap linkedHashMap = t0Var.f2891a;
        p0 p0Var = (p0) linkedHashMap.get(key);
        if (cls.isInstance(p0Var)) {
            if (s0Var instanceof n0) {
                n0Var = (n0) s0Var;
            } else {
                n0Var = null;
            }
            if (n0Var != null) {
                kotlin.jvm.internal.i.b(p0Var);
                o oVar = n0Var.d;
                if (oVar != null) {
                    p pVar = n0Var.f2880e;
                    kotlin.jvm.internal.i.b(pVar);
                    j0.a(p0Var, pVar, oVar);
                }
            }
            kotlin.jvm.internal.i.c(p0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return p0Var;
        }
        v1.b bVar = new v1.b((b2.g) this.d);
        ((LinkedHashMap) bVar.f3314a).put(q0.f2888b, key);
        try {
            viewModel = s0Var.h(cls, bVar);
        } catch (AbstractMethodError unused) {
            viewModel = s0Var.a(cls);
        }
        kotlin.jvm.internal.i.e(viewModel, "viewModel");
        p0 p0Var2 = (p0) linkedHashMap.put(key, viewModel);
        if (p0Var2 != null) {
            p0Var2.b();
        }
        return viewModel;
    }

    @Override
    public long l(int i10) {
        boolean z10;
        long[] jArr = (long[]) this.d;
        boolean z11 = false;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        if (i10 < jArr.length) {
            z11 = true;
        }
        e2.d.b(z11);
        return jArr[i10];
    }

    public Object m(Bitmap bitmap) {
        gh.a aVar = (gh.a) this.f384b;
        if (aVar.a(bitmap)) {
            this.d = ((gh.b) this.f385c).a(bitmap);
            aVar.b(bitmap);
        }
        return this.d;
    }

    public void n(h8.f fVar) {
        try {
            i8.g gVar = (i8.g) this.f385c;
            h8.i iVar = new h8.i(fVar);
            Parcel N0 = gVar.N0();
            s7.b.c(N0, iVar);
            gVar.R0(N0, 9);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    public int o(hc.f fVar) {
        ArrayList arrayList = (ArrayList) this.f384b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            jc.f fVar2 = (jc.f) obj;
            int i12 = fVar2.d;
            e eVar = fVar2.f14121a;
            int a2 = eVar.a(fVar);
            int i13 = a2 + 4;
            int ordinal = eVar.ordinal();
            int i14 = 4;
            if (ordinal != 1) {
                int i15 = 6;
                if (ordinal != 2) {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            if (ordinal == 6) {
                                i13 += i12 * 13;
                            }
                        } else {
                            i13 = a2 + 12;
                        }
                    } else {
                        i13 += fVar2.a() * 8;
                    }
                } else {
                    int i16 = ((i12 / 2) * 11) + i13;
                    if (i12 % 2 != 1) {
                        i15 = 0;
                    }
                    i13 = i16 + i15;
                }
            } else {
                int i17 = ((i12 / 3) * 10) + i13;
                int i18 = i12 % 3;
                if (i18 != 1) {
                    if (i18 == 2) {
                        i14 = 7;
                    } else {
                        i14 = 0;
                    }
                }
                i13 = i17 + i14;
            }
            i10 += i13;
        }
        return i10;
    }

    @Override
    public void onComplete(Task task) {
        j6.a aVar = (j6.a) this.f385c;
        String str = (String) this.f384b;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d;
        synchronized (aVar.f14034a) {
            aVar.f14034a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override
    public void onError(l81 l81Var, Exception exc) {
        ha haVar = ((b7) this.d).N;
        if (haVar != null) {
            haVar.run();
        }
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        b7 b7Var = (b7) this.d;
        z6 z6Var = b7Var.K;
        l81 l81Var = b7Var.f4763e;
        if (l81Var == null) {
            return;
        }
        if (l81Var.y()) {
            AndroidUtilities.runOnUIThread(z6Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(z6Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((b7) this.d).i();
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        b7 b7Var = (b7) this.d;
        l8 l8Var = (l8) this.f384b;
        if (l8Var != null) {
            k8 q6 = b7Var.f4763e.q(l8Var.f5404d1);
            l8Var.f5404d1 = q6;
            a81 a81Var = b7Var.f4773n;
            if (a81Var != null) {
                a81Var.setHDRInfo(q6);
            }
        }
        int i13 = (int) (i10 * f7);
        b7Var.f4765f = i13;
        int i14 = (int) (i11 * f7);
        b7Var.h = i14;
        if (l8Var != null && (l8Var.f5418k0 != i13 || l8Var.f5420l0 != i14)) {
            l8Var.f5418k0 = i13;
            l8Var.f5420l0 = i14;
            l8Var.A();
        }
        b7Var.b();
        a81 a81Var2 = b7Var.f4773n;
        if (a81Var2 != null) {
            int i15 = b7Var.f4765f;
            int i16 = b7Var.h;
            a81Var2.d = i15;
            a81Var2.f24511e = i16;
            m00 m00Var = a81Var2.f24509b;
            if (m00Var != null) {
                m00Var.postRunnable(new i00(m00Var, i15, i16, 0));
            }
        }
    }

    @Override
    public List p(long j3) {
        List list = (List) this.f384b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            long[] jArr = (long[]) this.f385c;
            int i11 = i10 * 2;
            if (jArr[i11] <= j3 && j3 < jArr[i11 + 1]) {
                i4.c cVar = (i4.c) list.get(i10);
                d2.b bVar = cVar.f11985a;
                if (bVar.f8074e == -3.4028235E38f) {
                    arrayList2.add(cVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new a4.d(18));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            d2.b bVar2 = ((i4.c) arrayList2.get(i12)).f11985a;
            arrayList.add(new d2.b(bVar2.f8071a, bVar2.f8072b, bVar2.f8073c, bVar2.d, (-1) - i12, 1, bVar2.f8076g, bVar2.h, bVar2.f8077i, bVar2.f8082n, bVar2.f8083o, bVar2.f8078j, bVar2.f8079k, bVar2.f8080l, bVar2.f8081m, bVar2.f8084p, bVar2.f8085q, bVar2.f8086r));
        }
        return arrayList;
    }

    public boolean q() {
        throw new UnsupportedOperationException("Method not decompiled: aa.a.q():boolean");
    }

    public void r(String str, String str2) {
        ((HashMap) this.d).put(str, str2);
    }

    public void s(cc.i iVar, Object obj) {
        if (((EnumMap) this.d) == null) {
            this.d = new EnumMap(cc.i.class);
        }
        ((EnumMap) this.d).put((EnumMap) iVar, (cc.i) obj);
    }

    public void t(String str) {
        if (str != null) {
            this.f384b = str;
            return;
        }
        throw new NullPointerException("Null backendName");
    }

    public String toString() {
        String str = "";
        int i10 = 0;
        switch (this.f383a) {
            case 9:
                return (String) this.f384b;
            case 11:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f384b);
                sb2.append('{');
                k kVar = ((k) this.f385c).f7393b;
                while (kVar != null) {
                    Object obj = kVar.f7392a;
                    sb2.append(str);
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    kVar = kVar.f7393b;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 13:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f384b);
                sb3.append('{');
                x xVar = (x) ((x) this.f385c).f16617c;
                while (xVar != null) {
                    Object obj2 = xVar.f16616b;
                    sb3.append(str);
                    if (obj2 != null && obj2.getClass().isArray()) {
                        String deepToString2 = Arrays.deepToString(new Object[]{obj2});
                        sb3.append((CharSequence) deepToString2, 1, deepToString2.length() - 1);
                    } else {
                        sb3.append(obj2);
                    }
                    xVar = (x) xVar.f16617c;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            case 23:
                StringBuilder sb4 = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.f384b;
                int size = arrayList.size();
                jc.f fVar = null;
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    jc.f fVar2 = (jc.f) obj3;
                    if (fVar != null) {
                        sb4.append(",");
                    }
                    sb4.append(fVar2.toString());
                    fVar = fVar2;
                }
                return sb4.toString();
            default:
                return super.toString();
        }
    }

    public void u(int i10, String str, String str2) {
        ((HashMap) this.f385c).put(str, str2);
        ((HashMap) this.d).put(str2, str);
        ((HashMap) this.f384b).put(str, Integer.valueOf(i10));
    }

    @Override
    public int w() {
        return ((long[]) this.d).length;
    }

    public a(int i10, Object obj, Object obj2, String str) {
        this.f383a = i10;
        this.f385c = obj;
        this.f384b = str;
        this.d = obj2;
    }

    @Override
    public void onRenderedFirstFrame() {
        l8 l8Var = (l8) this.f384b;
        Runnable[] runnableArr = (Runnable[]) this.f385c;
        b7 b7Var = (b7) this.d;
        a7 a7Var = b7Var.H;
        if (a7Var != null && a7Var.f4727g) {
            int i10 = b7Var.f4765f;
            int i11 = b7Var.h;
            a7Var.d = true;
            a7Var.f4725e = i10;
            a7Var.f4726f = i11;
            hi.a aVar = a7Var.f4724c;
            if (aVar != null) {
                aVar.run(Integer.valueOf(i10), Integer.valueOf(a7Var.f4726f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            b7Var.post(runnable);
            runnableArr[0] = null;
            Bitmap bitmap = b7Var.f4756a;
            if (bitmap != null) {
                bitmap.recycle();
                if (l8Var.M0 == b7Var.f4756a) {
                    l8Var.M0 = null;
                }
                b7Var.f4756a = null;
                b7Var.invalidate();
                return;
            }
            return;
        }
        a81 a81Var = b7Var.f4773n;
        if (a81Var != null) {
            if (a7Var == null || !a7Var.f4727g) {
                a81Var.animate().alpha(1.0f).setDuration(180L).withEndAction(new ca(21, this, l8Var)).start();
            }
        }
    }

    public a(Object obj, Object obj2, Object obj3, int i10) {
        this.f383a = i10;
        this.f384b = obj3;
        this.f385c = obj;
        this.d = obj2;
    }

    public a(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f383a = i10;
        this.f384b = obj;
        this.f385c = obj2;
        this.d = obj3;
    }

    public a() {
        this.f383a = 8;
        this.f385c = new HashMap();
        this.d = new HashMap();
        this.f384b = new HashMap();
    }

    public a(CastDevice castDevice, d6.d0 d0Var) {
        this.f383a = 6;
        l.i(castDevice, "CastDevice parameter cannot be null");
        this.f384b = castDevice;
        this.f385c = d0Var;
    }

    public a(h hVar) {
        this.f383a = 14;
        this.d = hVar;
        this.f385c = new AtomicLong((g6.a.f10322b.nextLong() & 65535) * 10000);
    }

    public a(h8.d dVar, i8.g gVar) {
        this.f383a = 17;
        this.f385c = gVar;
        l.h(dVar);
        this.f384b = dVar;
    }

    public a(String str, int i10) {
        this.f383a = i10;
        switch (i10) {
            case 13:
                x xVar = new x(11, false);
                this.f385c = xVar;
                this.d = xVar;
                this.f384b = str;
                return;
            case 20:
                r rVar = new r();
                rVar.f3584p = r0.n("video/mp2t");
                rVar.f3585q = r0.n(str);
                this.f384b = new b2.s(rVar);
                return;
            default:
                Object obj = new Object();
                this.f385c = obj;
                this.d = obj;
                this.f384b = str;
                return;
        }
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    public a(gh.b bVar) {
        this.f383a = 16;
        this.f384b = new gh.a();
        this.f385c = bVar;
    }

    public a(ArrayList arrayList) {
        this.f383a = 19;
        this.f384b = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.f385c = new long[arrayList.size() * 2];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            i4.c cVar = (i4.c) arrayList.get(i10);
            int i11 = i10 * 2;
            long[] jArr = (long[]) this.f385c;
            jArr[i11] = cVar.f11986b;
            jArr[i11 + 1] = cVar.f11987c;
        }
        long[] jArr2 = (long[]) this.f385c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = copyOf;
        Arrays.sort(copyOf);
    }

    public a(za.b bVar, jd.h hVar) {
        this.f383a = 5;
        this.f385c = bVar;
        this.d = hVar;
        this.f384b = "firebase-settings.crashlytics.com";
    }

    public a(String str, HashMap hashMap) {
        this.f383a = 0;
        this.f384b = str;
        this.f385c = hashMap;
        this.d = new HashMap();
    }

    public a(String str, j[] jVarArr) {
        this.f383a = 9;
        System.currentTimeMillis();
        this.f384b = str;
        this.f385c = jVarArr;
        this.d = null;
    }

    public a(t0 store, s0 factory, b2.g defaultCreationExtras) {
        this.f383a = 3;
        kotlin.jvm.internal.i.e(store, "store");
        kotlin.jvm.internal.i.e(factory, "factory");
        kotlin.jvm.internal.i.e(defaultCreationExtras, "defaultCreationExtras");
        this.f384b = store;
        this.f385c = factory;
        this.d = defaultCreationExtras;
    }

    public a(t0 store, s0 s0Var) {
        this(store, s0Var, v1.a.f49073b);
        this.f383a = 3;
        kotlin.jvm.internal.i.e(store, "store");
    }

    public a(Context context, LocationManager locationManager) {
        this.f383a = 15;
        this.d = new Object();
        this.f384b = context;
        this.f385c = locationManager;
    }

    public a(androidx.biometric.v vVar) {
        this.f383a = 1;
        this.d = vVar;
    }

    public a(androidx.fragment.app.v owner) {
        this(owner.f(), owner.c(), owner.d());
        this.f383a = 3;
        kotlin.jvm.internal.i.e(owner, "owner");
    }

    public a(c2.h[] hVarArr) {
        this.f383a = 26;
        k2.j0 j0Var = new k2.j0();
        ?? obj = new Object();
        obj.f4038c = 1.0f;
        obj.d = 1.0f;
        c2.f fVar = c2.f.f4007e;
        obj.f4039e = fVar;
        obj.f4040f = fVar;
        obj.f4041g = fVar;
        obj.h = fVar;
        ByteBuffer byteBuffer = c2.h.f4011a;
        obj.f4044k = byteBuffer;
        obj.f4045l = byteBuffer.asShortBuffer();
        obj.f4046m = byteBuffer;
        obj.f4037b = -1;
        c2.h[] hVarArr2 = new c2.h[hVarArr.length + 2];
        this.f384b = hVarArr2;
        System.arraycopy(hVarArr, 0, hVarArr2, 0, hVarArr.length);
        this.f385c = j0Var;
        this.d = obj;
        hVarArr2[hVarArr.length] = j0Var;
        hVarArr2[hVarArr.length + 1] = obj;
    }

    public a(Signature signature) {
        this.f383a = 25;
        this.f384b = signature;
        this.f385c = null;
        this.d = null;
    }

    public a(Cipher cipher) {
        this.f383a = 25;
        this.f385c = cipher;
        this.f384b = null;
        this.d = null;
    }

    public a(Mac mac) {
        this.f383a = 25;
        this.d = mac;
        this.f385c = null;
        this.f384b = null;
    }

    public a(View view, hh.j jVar) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        this.f383a = 18;
        v2 v2Var = new v2(this, 1);
        this.f384b = view;
        this.f385c = jVar;
        view.addOnAttachStateChangeListener(v2Var);
        if (!view.isAttachedToWindow() || (viewTreeObserver2 = (ViewTreeObserver) this.d) == (viewTreeObserver = view.getViewTreeObserver())) {
            return;
        }
        if (viewTreeObserver2 != null) {
            if (viewTreeObserver2.isAlive()) {
                ((ViewTreeObserver) this.d).removeOnPreDrawListener(jVar);
            }
            this.d = null;
        }
        this.d = viewTreeObserver;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(jVar);
        }
    }

    public a(k6.h hVar) {
        this.f383a = 2;
        Context context = hVar.f14714a;
        this.f384b = hVar;
        int i10 = Build.VERSION.SDK_INT;
        this.f385c = i10 >= 29 ? androidx.biometric.q.b(context) : null;
        this.d = i10 <= 29 ? new k0.b(context) : null;
    }

    public a(m mVar, hc.f fVar, jc.e eVar) {
        e eVar2;
        int i10;
        int i11;
        this.f383a = 23;
        this.d = mVar;
        this.f384b = new ArrayList();
        jc.e eVar3 = eVar;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            eVar2 = e.ECI;
            if (eVar3 == null) {
                break;
            }
            int i14 = eVar3.f14118c;
            int i15 = i12 + eVar3.d;
            jc.e eVar4 = eVar3.f14119e;
            int i16 = i13;
            e eVar5 = eVar3.f14116a;
            boolean z10 = (eVar5 == e.BYTE && eVar4 == null && i14 != 0) || !(eVar4 == null || i14 == eVar4.f14118c);
            i10 = z10 ? 1 : i16;
            if (eVar4 == null || eVar4.f14116a != eVar5 || z10) {
                ((ArrayList) this.f384b).add(0, new jc.f(this, eVar5, eVar3.f14117b, i14, i15));
                i11 = 0;
            } else {
                i11 = i15;
            }
            if (z10) {
                ((ArrayList) this.f384b).add(0, new jc.f(this, eVar2, eVar3.f14117b, eVar3.f14118c, 0));
            }
            i13 = i10;
            eVar3 = eVar4;
            i12 = i11;
        }
        int i17 = i13;
        boolean z11 = mVar.f7951a;
        hc.c cVar = (hc.c) mVar.d;
        if (z11) {
            jc.f fVar2 = (jc.f) ((ArrayList) this.f384b).get(0);
            if (fVar2 != null && fVar2.f14121a != eVar2 && i17 != 0) {
                ((ArrayList) this.f384b).add(0, new jc.f(this, eVar2, 0, 0, 0));
            }
            ((ArrayList) this.f384b).add(((jc.f) ((ArrayList) this.f384b).get(0)).f14121a == eVar2 ? 1 : 0, new jc.f(this, e.FNC1_FIRST_POSITION, 0, 0, 0));
        }
        int i18 = fVar.f11079a;
        int i19 = 26;
        int c10 = m1.j.c(i18 <= 9 ? 1 : i18 <= 26 ? 2 : 3);
        if (c10 == 0) {
            i19 = 9;
        } else if (c10 != 1) {
            i10 = 27;
            i19 = 40;
        } else {
            i10 = 10;
        }
        int o9 = o(fVar);
        while (i18 < i19 && !jc.c.c(o9, hc.f.c(i18), cVar)) {
            i18++;
        }
        while (i18 > i10 && jc.c.c(o9, hc.f.c(i18 - 1), cVar)) {
            i18--;
        }
        this.f385c = hc.f.c(i18);
    }

    public a(b7 b7Var, l8 l8Var, Runnable[] runnableArr) {
        this.f383a = 10;
        this.d = b7Var;
        this.f384b = l8Var;
        this.f385c = runnableArr;
    }
}
