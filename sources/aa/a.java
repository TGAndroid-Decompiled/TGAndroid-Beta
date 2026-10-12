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
import java.io.ByteArrayOutputStream;
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
import l5.t;
import m.p;
import m.r3;
import n4.y;
import n6.m;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.n81;
import org.telegram.ui.Components.o00;
import org.telegram.ui.Components.q81;
import sc.v;
import z3.d;
public final class a implements s, n81, d, a0, OnCompleteListener, n5.b {
    public static a f384e;
    public final int f385a;
    public Object f386b;
    public Object f387c;
    public Object d;

    public a(int i10) {
        this.f385a = i10;
    }

    public static final URL a(a aVar) {
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority((String) aVar.f386b).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        za.b bVar = (za.b) aVar.f387c;
        Uri.Builder appendPath2 = appendPath.appendPath(bVar.f54415a).appendPath("settings");
        za.a aVar2 = bVar.f54416b;
        return new URL(appendPath2.appendQueryParameter("build_version", aVar2.f54410c).appendQueryParameter("display_version", aVar2.f54409b).build().toString());
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
    public int B() {
        return ((long[]) this.d).length;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        boolean z10;
        e0 e0Var = (e0) this.f387c;
        String str = (String) this.f386b;
        i iVar = (i) this.d;
        w wVar = (w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (e0Var.F == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        m.j("Not connected to device", z10);
        f fVar = (f) wVar.u();
        Parcel N0 = fVar.N0();
        N0.writeString(str);
        com.google.android.gms.internal.cast.v.c(N0, iVar);
        fVar.S0(N0, 13);
        synchronized (e0Var.f4352r) {
            try {
                if (e0Var.f4349o != null) {
                    e0Var.i(2477);
                }
                e0Var.f4349o = taskCompletionSource;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void b(e2.v vVar) {
        long d;
        long j3;
        e2.d.h((b0) this.f387c);
        String str = d0.f8529a;
        b0 b0Var = (b0) this.f387c;
        synchronized (b0Var) {
            try {
                long j10 = b0Var.f8522c;
                if (j10 != -9223372036854775807L) {
                    d = j10 + b0Var.f8521b;
                } else {
                    d = b0Var.d();
                }
                j3 = d;
            } finally {
            }
        }
        long e7 = ((b0) this.f387c).e();
        if (j3 != -9223372036854775807L && e7 != -9223372036854775807L) {
            b2.s sVar = (b2.s) this.f386b;
            if (e7 != sVar.f3645w) {
                r a2 = sVar.a();
                a2.v = e7;
                b2.s sVar2 = new b2.s(a2);
                this.f386b = sVar2;
                ((h0) this.d).b(sVar2);
            }
            int a10 = vVar.a();
            ((h0) this.d).d(a10, vVar);
            ((h0) this.d).c(j3, 1, a10, 0, null);
        }
    }

    @Override
    public void c(b0 b0Var, q qVar, f0 f0Var) {
        this.f387c = b0Var;
        f0Var.b();
        f0Var.c();
        h0 f22 = qVar.f2(f0Var.f13805c, 5);
        this.d = f22;
        f22.b((b2.s) this.f386b);
    }

    @Override
    public int d(long j3) {
        long[] jArr = (long[]) this.d;
        int a2 = d0.a(jArr, j3, false);
        if (a2 < jArr.length) {
            return a2;
        }
        return -1;
    }

    public l5.i e() {
        String str;
        if (((String) this.f386b) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((i5.d) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new l5.i((String) this.f386b, (byte[]) this.f387c, (i5.d) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public int f(int r12) {
        throw new UnsupportedOperationException("Method not decompiled: aa.a.f(int):int");
    }

    public int g() {
        a6.i iVar = (a6.i) this.d;
        if (iVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        Context context = (Context) iVar.f326b;
        FingerprintManager Q = a6.i.Q(context);
        if (Q != null && Q.isHardwareDetected()) {
            FingerprintManager Q2 = a6.i.Q(context);
            if (Q2 != null && Q2.hasEnrolledFingerprints()) {
                return 0;
            }
            return 11;
        }
        return 12;
    }

    @Override
    public Object mo27get() {
        return new t(new qb.b(24), new ob.a(24), (q5.b) ((u5) this.f386b).mo27get(), (c) ((r3) this.f387c).mo27get(), (com.google.firebase.messaging.s) ((oi.f) this.d).mo27get());
    }

    public void i(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f387c;
        la.f fVar = new la.f(byteArrayOutputStream, hashMap, (HashMap) this.d, (ia.d) this.f386b);
        if (obj == null) {
            return;
        }
        ia.d dVar = (ia.d) hashMap.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
            return;
        }
        throw new RuntimeException("No encoder for " + obj.getClass());
    }

    public aa.b j() {
        throw new UnsupportedOperationException("Method not decompiled: aa.a.j():aa.b");
    }

    public p0 k(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return l(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public p0 l(Class cls, String key) {
        p0 viewModel;
        n0 n0Var;
        s0 s0Var = (s0) this.f387c;
        kotlin.jvm.internal.i.e(key, "key");
        t0 t0Var = (t0) this.f386b;
        t0Var.getClass();
        LinkedHashMap linkedHashMap = t0Var.f2889a;
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
                    p pVar = n0Var.f2878e;
                    kotlin.jvm.internal.i.b(pVar);
                    j0.a(p0Var, pVar, oVar);
                }
            }
            kotlin.jvm.internal.i.c(p0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return p0Var;
        }
        v1.b bVar = new v1.b((b2.g) this.d);
        ((LinkedHashMap) bVar.f3312a).put(q0.f2886b, key);
        try {
            viewModel = s0Var.f1(cls, bVar);
        } catch (AbstractMethodError unused) {
            viewModel = s0Var.c(cls);
        }
        kotlin.jvm.internal.i.e(viewModel, "viewModel");
        p0 p0Var2 = (p0) linkedHashMap.put(key, viewModel);
        if (p0Var2 != null) {
            p0Var2.b();
        }
        return viewModel;
    }

    @Override
    public long m(int i10) {
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

    public Object n(Bitmap bitmap) {
        gh.a aVar = (gh.a) this.f386b;
        if (aVar.a(bitmap)) {
            this.d = ((gh.b) this.f387c).a(bitmap);
            aVar.b(bitmap);
        }
        return this.d;
    }

    public void o(h8.f fVar) {
        try {
            i8.g gVar = (i8.g) this.f387c;
            h8.i iVar = new h8.i(fVar);
            Parcel N0 = gVar.N0();
            s7.b.c(N0, iVar);
            gVar.R0(N0, 9);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override
    public void onComplete(Task task) {
        j6.a aVar = (j6.a) this.f387c;
        String str = (String) this.f386b;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d;
        synchronized (aVar.f14031a) {
            aVar.f14031a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override
    public void onError(q81 q81Var, Exception exc) {
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
        q81 q81Var = b7Var.f4761e;
        if (q81Var == null) {
            return;
        }
        if (q81Var.y()) {
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
        l8 l8Var = (l8) this.f386b;
        if (l8Var != null) {
            k8 q6 = b7Var.f4761e.q(l8Var.f5402d1);
            l8Var.f5402d1 = q6;
            f81 f81Var = b7Var.f4771n;
            if (f81Var != null) {
                f81Var.setHDRInfo(q6);
            }
        }
        int i13 = (int) (i10 * f7);
        b7Var.f4763f = i13;
        int i14 = (int) (i11 * f7);
        b7Var.h = i14;
        if (l8Var != null && (l8Var.f5416k0 != i13 || l8Var.f5418l0 != i14)) {
            l8Var.f5416k0 = i13;
            l8Var.f5418l0 = i14;
            l8Var.A();
        }
        b7Var.b();
        f81 f81Var2 = b7Var.f4771n;
        if (f81Var2 != null) {
            int i15 = b7Var.f4763f;
            int i16 = b7Var.h;
            f81Var2.d = i15;
            f81Var2.f25966e = i16;
            o00 o00Var = f81Var2.f25964b;
            if (o00Var != null) {
                o00Var.postRunnable(new k00(o00Var, i15, i16, 0));
            }
        }
    }

    public int p(hc.f fVar) {
        ArrayList arrayList = (ArrayList) this.f386b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            jc.f fVar2 = (jc.f) obj;
            int i12 = fVar2.d;
            e eVar = fVar2.f14118a;
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
            this.f386b = str;
            return;
        }
        throw new NullPointerException("Null backendName");
    }

    public String toString() {
        String str = "";
        int i10 = 0;
        switch (this.f385a) {
            case 9:
                return (String) this.f386b;
            case 11:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f386b);
                sb2.append('{');
                k kVar = ((k) this.f387c).f7391b;
                while (kVar != null) {
                    Object obj = kVar.f7390a;
                    sb2.append(str);
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    kVar = kVar.f7391b;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 13:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f386b);
                sb3.append('{');
                y yVar = (y) ((y) this.f387c).f16363c;
                while (yVar != null) {
                    Object obj2 = yVar.f16362b;
                    sb3.append(str);
                    if (obj2 != null && obj2.getClass().isArray()) {
                        String deepToString2 = Arrays.deepToString(new Object[]{obj2});
                        sb3.append((CharSequence) deepToString2, 1, deepToString2.length() - 1);
                    } else {
                        sb3.append(obj2);
                    }
                    yVar = (y) yVar.f16363c;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            case 23:
                StringBuilder sb4 = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.f386b;
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
        ((HashMap) this.f387c).put(str, str2);
        ((HashMap) this.d).put(str2, str);
        ((HashMap) this.f386b).put(str, Integer.valueOf(i10));
    }

    @Override
    public List v(long j3) {
        List list = (List) this.f386b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            long[] jArr = (long[]) this.f387c;
            int i11 = i10 * 2;
            if (jArr[i11] <= j3 && j3 < jArr[i11 + 1]) {
                i4.c cVar = (i4.c) list.get(i10);
                d2.b bVar = cVar.f11983a;
                if (bVar.f8071e == -3.4028235E38f) {
                    arrayList2.add(cVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new a4.d(18));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            d2.b bVar2 = ((i4.c) arrayList2.get(i12)).f11983a;
            arrayList.add(new d2.b(bVar2.f8068a, bVar2.f8069b, bVar2.f8070c, bVar2.d, (-1) - i12, 1, bVar2.f8073g, bVar2.h, bVar2.f8074i, bVar2.f8079n, bVar2.f8080o, bVar2.f8075j, bVar2.f8076k, bVar2.f8077l, bVar2.f8078m, bVar2.f8081p, bVar2.f8082q, bVar2.f8083r));
        }
        return arrayList;
    }

    public a(int i10, Object obj, Object obj2, String str) {
        this.f385a = i10;
        this.f387c = obj;
        this.f386b = str;
        this.d = obj2;
    }

    @Override
    public void onRenderedFirstFrame() {
        l8 l8Var = (l8) this.f386b;
        Runnable[] runnableArr = (Runnable[]) this.f387c;
        b7 b7Var = (b7) this.d;
        a7 a7Var = b7Var.H;
        if (a7Var != null && a7Var.f4725g) {
            int i10 = b7Var.f4763f;
            int i11 = b7Var.h;
            a7Var.d = true;
            a7Var.f4723e = i10;
            a7Var.f4724f = i11;
            hi.a aVar = a7Var.f4722c;
            if (aVar != null) {
                aVar.run(Integer.valueOf(i10), Integer.valueOf(a7Var.f4724f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            b7Var.post(runnable);
            runnableArr[0] = null;
            Bitmap bitmap = b7Var.f4754a;
            if (bitmap != null) {
                bitmap.recycle();
                if (l8Var.M0 == b7Var.f4754a) {
                    l8Var.M0 = null;
                }
                b7Var.f4754a = null;
                b7Var.invalidate();
                return;
            }
            return;
        }
        f81 f81Var = b7Var.f4771n;
        if (f81Var != null) {
            if (a7Var == null || !a7Var.f4725g) {
                f81Var.animate().alpha(1.0f).setDuration(180L).withEndAction(new ca(21, this, l8Var)).start();
            }
        }
    }

    public a(Object obj, Object obj2, Object obj3, int i10) {
        this.f385a = i10;
        this.f386b = obj3;
        this.f387c = obj;
        this.d = obj2;
    }

    public a(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f385a = i10;
        this.f386b = obj;
        this.f387c = obj2;
        this.d = obj3;
    }

    public a() {
        this.f385a = 8;
        this.f387c = new HashMap();
        this.d = new HashMap();
        this.f386b = new HashMap();
    }

    public a(CastDevice castDevice, d6.d0 d0Var) {
        this.f385a = 6;
        m.i(castDevice, "CastDevice parameter cannot be null");
        this.f386b = castDevice;
        this.f387c = d0Var;
    }

    public a(h hVar) {
        this.f385a = 14;
        this.d = hVar;
        this.f387c = new AtomicLong((g6.a.f10320b.nextLong() & 65535) * 10000);
    }

    public a(h8.d dVar, i8.g gVar) {
        this.f385a = 17;
        this.f387c = gVar;
        m.h(dVar);
        this.f386b = dVar;
    }

    public a(String str, int i10) {
        this.f385a = i10;
        switch (i10) {
            case 13:
                y yVar = new y(11, false);
                this.f387c = yVar;
                this.d = yVar;
                this.f386b = str;
                return;
            case 20:
                r rVar = new r();
                rVar.f3582p = r0.n("video/mp2t");
                rVar.f3583q = r0.n(str);
                this.f386b = new b2.s(rVar);
                return;
            default:
                Object obj = new Object();
                this.f387c = obj;
                this.d = obj;
                this.f386b = str;
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
        this.f385a = 16;
        this.f386b = new gh.a();
        this.f387c = bVar;
    }

    public a(ArrayList arrayList) {
        this.f385a = 19;
        this.f386b = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.f387c = new long[arrayList.size() * 2];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            i4.c cVar = (i4.c) arrayList.get(i10);
            int i11 = i10 * 2;
            long[] jArr = (long[]) this.f387c;
            jArr[i11] = cVar.f11984b;
            jArr[i11 + 1] = cVar.f11985c;
        }
        long[] jArr2 = (long[]) this.f387c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = copyOf;
        Arrays.sort(copyOf);
    }

    public a(za.b bVar, jd.h hVar) {
        this.f385a = 5;
        this.f387c = bVar;
        this.d = hVar;
        this.f386b = "firebase-settings.crashlytics.com";
    }

    public a(String str, HashMap hashMap) {
        this.f385a = 0;
        this.f386b = str;
        this.f387c = hashMap;
        this.d = new HashMap();
    }

    public a(String str, j[] jVarArr) {
        this.f385a = 9;
        System.currentTimeMillis();
        this.f386b = str;
        this.f387c = jVarArr;
        this.d = null;
    }

    public a(t0 store, s0 factory, b2.g defaultCreationExtras) {
        this.f385a = 3;
        kotlin.jvm.internal.i.e(store, "store");
        kotlin.jvm.internal.i.e(factory, "factory");
        kotlin.jvm.internal.i.e(defaultCreationExtras, "defaultCreationExtras");
        this.f386b = store;
        this.f387c = factory;
        this.d = defaultCreationExtras;
    }

    public a(t0 store, s0 s0Var) {
        this(store, s0Var, v1.a.f49257b);
        this.f385a = 3;
        kotlin.jvm.internal.i.e(store, "store");
    }

    public a(Context context, LocationManager locationManager) {
        this.f385a = 15;
        this.d = new Object();
        this.f386b = context;
        this.f387c = locationManager;
    }

    public a(androidx.biometric.v vVar) {
        this.f385a = 1;
        this.d = vVar;
    }

    public a(androidx.fragment.app.v owner) {
        this(owner.f(), owner.c(), owner.d());
        this.f385a = 3;
        kotlin.jvm.internal.i.e(owner, "owner");
    }

    public a(c2.h[] hVarArr) {
        this.f385a = 26;
        k2.j0 j0Var = new k2.j0();
        ?? obj = new Object();
        obj.f4037c = 1.0f;
        obj.d = 1.0f;
        c2.f fVar = c2.f.f4006e;
        obj.f4038e = fVar;
        obj.f4039f = fVar;
        obj.f4040g = fVar;
        obj.h = fVar;
        ByteBuffer byteBuffer = c2.h.f4010a;
        obj.f4043k = byteBuffer;
        obj.f4044l = byteBuffer.asShortBuffer();
        obj.f4045m = byteBuffer;
        obj.f4036b = -1;
        c2.h[] hVarArr2 = new c2.h[hVarArr.length + 2];
        this.f386b = hVarArr2;
        System.arraycopy(hVarArr, 0, hVarArr2, 0, hVarArr.length);
        this.f387c = j0Var;
        this.d = obj;
        hVarArr2[hVarArr.length] = j0Var;
        hVarArr2[hVarArr.length + 1] = obj;
    }

    public a(Signature signature) {
        this.f385a = 25;
        this.f386b = signature;
        this.f387c = null;
        this.d = null;
    }

    public a(Cipher cipher) {
        this.f385a = 25;
        this.f387c = cipher;
        this.f386b = null;
        this.d = null;
    }

    public a(Mac mac) {
        this.f385a = 25;
        this.d = mac;
        this.f387c = null;
        this.f386b = null;
    }

    public a(View view, hh.j jVar) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        this.f385a = 18;
        v2 v2Var = new v2(this, 1);
        this.f386b = view;
        this.f387c = jVar;
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
        this.f385a = 2;
        Context context = hVar.f14710a;
        this.f386b = hVar;
        int i10 = Build.VERSION.SDK_INT;
        this.f387c = i10 >= 29 ? androidx.biometric.q.b(context) : null;
        this.d = i10 <= 29 ? new a6.i(context, 29) : null;
    }

    public a(com.google.firebase.messaging.m mVar, hc.f fVar, jc.e eVar) {
        e eVar2;
        int i10;
        int i11;
        this.f385a = 23;
        this.d = mVar;
        this.f386b = new ArrayList();
        jc.e eVar3 = eVar;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            eVar2 = e.ECI;
            if (eVar3 == null) {
                break;
            }
            int i14 = eVar3.f14115c;
            int i15 = i12 + eVar3.d;
            jc.e eVar4 = eVar3.f14116e;
            int i16 = i13;
            e eVar5 = eVar3.f14113a;
            boolean z10 = (eVar5 == e.BYTE && eVar4 == null && i14 != 0) || !(eVar4 == null || i14 == eVar4.f14115c);
            i10 = z10 ? 1 : i16;
            if (eVar4 == null || eVar4.f14113a != eVar5 || z10) {
                ((ArrayList) this.f386b).add(0, new jc.f(this, eVar5, eVar3.f14114b, i14, i15));
                i11 = 0;
            } else {
                i11 = i15;
            }
            if (z10) {
                ((ArrayList) this.f386b).add(0, new jc.f(this, eVar2, eVar3.f14114b, eVar3.f14115c, 0));
            }
            i13 = i10;
            eVar3 = eVar4;
            i12 = i11;
        }
        int i17 = i13;
        boolean z11 = mVar.f7947a;
        hc.c cVar = (hc.c) mVar.d;
        if (z11) {
            jc.f fVar2 = (jc.f) ((ArrayList) this.f386b).get(0);
            if (fVar2 != null && fVar2.f14118a != eVar2 && i17 != 0) {
                ((ArrayList) this.f386b).add(0, new jc.f(this, eVar2, 0, 0, 0));
            }
            ((ArrayList) this.f386b).add(((jc.f) ((ArrayList) this.f386b).get(0)).f14118a == eVar2 ? 1 : 0, new jc.f(this, e.FNC1_FIRST_POSITION, 0, 0, 0));
        }
        int i18 = fVar.f11077a;
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
        int p5 = p(fVar);
        while (i18 < i19 && !jc.c.c(p5, hc.f.c(i18), cVar)) {
            i18++;
        }
        while (i18 > i10 && jc.c.c(p5, hc.f.c(i18 - 1), cVar)) {
            i18--;
        }
        this.f387c = hc.f.c(i18);
    }

    public a(b7 b7Var, l8 l8Var, Runnable[] runnableArr) {
        this.f385a = 10;
        this.d = b7Var;
        this.f386b = l8Var;
        this.f387c = runnableArr;
    }
}
