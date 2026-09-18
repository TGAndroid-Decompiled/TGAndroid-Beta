package aa;

import ai.ba;
import ai.u2;
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
import b2.g;
import b2.r;
import b2.r0;
import c3.h0;
import c3.q;
import c6.e0;
import c6.i;
import cc.j;
import cf.c;
import ci.a7;
import ci.c7;
import ci.d7;
import ci.ka;
import ci.n8;
import ci.o8;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.play_billing.k;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.m;
import com.google.firebase.messaging.t;
import e2.b0;
import e2.d0;
import e2.v;
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
import k2.k0;
import k6.h;
import m.p;
import m.p3;
import n6.l;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.u71;
import org.telegram.ui.Components.vz;
import z3.d;
public final class a implements s, r71, d, a0, OnCompleteListener, n5.b {
    public static a e;
    public final int f358a;
    public Object f359b;
    public Object f360c;
    public Object d;

    public a(int i10) {
        this.f358a = i10;
    }

    public static final URL c(a aVar) {
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority((String) aVar.f359b).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        za.b bVar = (za.b) aVar.f360c;
        Uri.Builder appendPath2 = appendPath.appendPath(bVar.f48999a).appendPath("settings");
        za.a aVar2 = bVar.f49000b;
        return new URL(appendPath2.appendQueryParameter("build_version", aVar2.f48996c).appendQueryParameter("display_version", aVar2.f48995b).build().toString());
    }

    public static String i(String str, HashMap hashMap) {
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
            return t8.b.v(str, sb3);
        }
        return a4.a.C(str, "?", sb3);
    }

    @Override
    public void a(v vVar) {
        long d;
        long j3;
        e2.d.h((b0) this.f360c);
        String str = d0.f7887a;
        b0 b0Var = (b0) this.f360c;
        synchronized (b0Var) {
            try {
                long j10 = b0Var.f7881c;
                if (j10 != -9223372036854775807L) {
                    d = j10 + b0Var.f7880b;
                } else {
                    d = b0Var.d();
                }
                j3 = d;
            } finally {
            }
        }
        long e7 = ((b0) this.f360c).e();
        if (j3 != -9223372036854775807L && e7 != -9223372036854775807L) {
            b2.s sVar = (b2.s) this.f359b;
            if (e7 != sVar.f3313w) {
                r a2 = sVar.a();
                a2.v = e7;
                b2.s sVar2 = new b2.s(a2);
                this.f359b = sVar2;
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
        e0 e0Var = (e0) this.f360c;
        String str = (String) this.f359b;
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
        Parcel O0 = fVar.O0();
        O0.writeString(str);
        com.google.android.gms.internal.cast.v.c(O0, iVar);
        fVar.T0(O0, 13);
        synchronized (e0Var.f3987r) {
            try {
                if (e0Var.f3984o != null) {
                    e0Var.i(2477);
                }
                e0Var.f3984o = taskCompletionSource;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void b(b0 b0Var, q qVar, f0 f0Var) {
        this.f360c = b0Var;
        f0Var.a();
        f0Var.b();
        h0 Z1 = qVar.Z1(f0Var.d, 5);
        this.d = Z1;
        Z1.b((b2.s) this.f359b);
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
        if (((String) this.f359b) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((i5.d) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new l5.i((String) this.f359b, (byte[]) this.f360c, (i5.d) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public int f(int r12) {
        throw new UnsupportedOperationException("Method not decompiled: aa.a.f(int):int");
    }

    @Override
    public long g(int i10) {
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

    @Override
    public Object mo28get() {
        return new l5.s(new rb.a(23), new qb.b(23), (q5.b) ((c) this.f359b).mo28get(), (da.b) ((p3) this.f360c).mo28get(), (t) ((oi.f) this.d).mo28get());
    }

    public int h() {
        FingerprintManager g10;
        FingerprintManager g11;
        h hVar = (h) this.d;
        if (hVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        Context context = hVar.f13516a;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && (g10 = e0.b.g(context)) != null && e0.b.q(g10)) {
            if (i10 >= 23 && (g11 = e0.b.g(context)) != null && e0.b.m(g11)) {
                return 0;
            }
            return 11;
        }
        return 12;
    }

    public void j(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f360c;
        la.f fVar = new la.f(byteArrayOutputStream, hashMap, (HashMap) this.d, (ia.d) this.f359b);
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

    public aa.b k() {
        throw new UnsupportedOperationException("Method not decompiled: aa.a.k():aa.b");
    }

    public p0 l(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public p0 m(Class cls, String key) {
        p0 viewModel;
        n0 n0Var;
        s0 s0Var = (s0) this.f360c;
        kotlin.jvm.internal.i.e(key, "key");
        t0 t0Var = (t0) this.f359b;
        t0Var.getClass();
        LinkedHashMap linkedHashMap = t0Var.f2603a;
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
                    p pVar = n0Var.e;
                    kotlin.jvm.internal.i.b(pVar);
                    j0.a(p0Var, pVar, oVar);
                }
            }
            kotlin.jvm.internal.i.c(p0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return p0Var;
        }
        v1.b bVar = new v1.b((g) this.d);
        ((LinkedHashMap) bVar.f3000a).put(q0.f2601b, key);
        try {
            viewModel = s0Var.H(cls, bVar);
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

    public Object n(Bitmap bitmap) {
        gh.a aVar = (gh.a) this.f359b;
        if (aVar.a(bitmap)) {
            this.d = ((gh.b) this.f360c).a(bitmap);
            aVar.b(bitmap);
        }
        return this.d;
    }

    public void o(h8.f fVar) {
        try {
            i8.g gVar = (i8.g) this.f360c;
            h8.i iVar = new h8.i(fVar);
            Parcel O0 = gVar.O0();
            s7.b.c(O0, iVar);
            gVar.S0(O0, 9);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override
    public void onComplete(Task task) {
        j6.a aVar = (j6.a) this.f360c;
        String str = (String) this.f359b;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d;
        synchronized (aVar.f12888a) {
            aVar.f12888a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override
    public void onError(u71 u71Var, Exception exc) {
        ka kaVar = ((d7) this.d).N;
        if (kaVar != null) {
            kaVar.run();
        }
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        d7 d7Var = (d7) this.d;
        a7 a7Var = d7Var.K;
        u71 u71Var = d7Var.e;
        if (u71Var == null) {
            return;
        }
        if (u71Var.y()) {
            AndroidUtilities.runOnUIThread(a7Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(a7Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((d7) this.d).i();
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        d7 d7Var = (d7) this.d;
        o8 o8Var = (o8) this.f359b;
        if (o8Var != null) {
            n8 q6 = d7Var.e.q(o8Var.f5152d1);
            o8Var.f5152d1 = q6;
            j71 j71Var = d7Var.f4520n;
            if (j71Var != null) {
                j71Var.setHDRInfo(q6);
            }
        }
        int i13 = (int) (i10 * f7);
        d7Var.f4512f = i13;
        int i14 = (int) (i11 * f7);
        d7Var.h = i14;
        if (o8Var != null && (o8Var.f5165k0 != i13 || o8Var.f5167l0 != i14)) {
            o8Var.f5165k0 = i13;
            o8Var.f5167l0 = i14;
            o8Var.A();
        }
        d7Var.b();
        j71 j71Var2 = d7Var.f4520n;
        if (j71Var2 != null) {
            int i15 = d7Var.f4512f;
            int i16 = d7Var.h;
            j71Var2.d = i15;
            j71Var2.e = i16;
            vz vzVar = j71Var2.f25194b;
            if (vzVar != null) {
                vzVar.postRunnable(new rz(vzVar, i15, i16, 0));
            }
        }
    }

    public int p(hc.f fVar) {
        ArrayList arrayList = (ArrayList) this.f359b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            jc.f fVar2 = (jc.f) obj;
            int i12 = fVar2.d;
            e eVar = fVar2.f12967a;
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

    @Override
    public List s(long j3) {
        List list = (List) this.f359b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            long[] jArr = (long[]) this.f360c;
            int i11 = i10 * 2;
            if (jArr[i11] <= j3 && j3 < jArr[i11 + 1]) {
                i4.c cVar = (i4.c) list.get(i10);
                d2.b bVar = cVar.f10968a;
                if (bVar.e == -3.4028235E38f) {
                    arrayList2.add(cVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new a4.e(18));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            d2.b bVar2 = ((i4.c) arrayList2.get(i12)).f10968a;
            arrayList.add(new d2.b(bVar2.f7434a, bVar2.f7435b, bVar2.f7436c, bVar2.d, (-1) - i12, 1, bVar2.f7438g, bVar2.h, bVar2.f7439i, bVar2.f7444n, bVar2.f7445o, bVar2.f7440j, bVar2.f7441k, bVar2.f7442l, bVar2.f7443m, bVar2.f7446p, bVar2.f7447q, bVar2.f7448r));
        }
        return arrayList;
    }

    public void t(cc.i iVar, Object obj) {
        if (((EnumMap) this.d) == null) {
            this.d = new EnumMap(cc.i.class);
        }
        ((EnumMap) this.d).put((EnumMap) iVar, (cc.i) obj);
    }

    public String toString() {
        String str = "";
        int i10 = 0;
        switch (this.f358a) {
            case 9:
                return (String) this.f359b;
            case 11:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f359b);
                sb2.append('{');
                k kVar = ((k) this.f360c).f6822b;
                while (kVar != null) {
                    Object obj = kVar.f6821a;
                    sb2.append(str);
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    kVar = kVar.f6822b;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 13:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f359b);
                sb3.append('{');
                of.b bVar = (of.b) ((of.b) this.f360c).f15651c;
                while (bVar != null) {
                    Object obj2 = bVar.f15650b;
                    sb3.append(str);
                    if (obj2 != null && obj2.getClass().isArray()) {
                        String deepToString2 = Arrays.deepToString(new Object[]{obj2});
                        sb3.append((CharSequence) deepToString2, 1, deepToString2.length() - 1);
                    } else {
                        sb3.append(obj2);
                    }
                    bVar = (of.b) bVar.f15651c;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            case 23:
                StringBuilder sb4 = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.f359b;
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

    public void u(String str) {
        if (str != null) {
            this.f359b = str;
            return;
        }
        throw new NullPointerException("Null backendName");
    }

    @Override
    public int v() {
        return ((long[]) this.d).length;
    }

    public void w(int i10, String str, String str2) {
        ((HashMap) this.f360c).put(str, str2);
        ((HashMap) this.d).put(str2, str);
        ((HashMap) this.f359b).put(str, Integer.valueOf(i10));
    }

    public a(Object obj, Object obj2, Object obj3, int i10) {
        this.f358a = i10;
        this.f359b = obj3;
        this.f360c = obj;
        this.d = obj2;
    }

    @Override
    public void onRenderedFirstFrame() {
        o8 o8Var = (o8) this.f359b;
        Runnable[] runnableArr = (Runnable[]) this.f360c;
        d7 d7Var = (d7) this.d;
        c7 c7Var = d7Var.H;
        if (c7Var != null && c7Var.f4434g) {
            int i10 = d7Var.f4512f;
            int i11 = d7Var.h;
            c7Var.d = true;
            c7Var.e = i10;
            c7Var.f4433f = i11;
            hi.a aVar = c7Var.f4432c;
            if (aVar != null) {
                aVar.run(Integer.valueOf(i10), Integer.valueOf(c7Var.f4433f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            d7Var.post(runnable);
            runnableArr[0] = null;
            Bitmap bitmap = d7Var.f4504a;
            if (bitmap != null) {
                bitmap.recycle();
                if (o8Var.M0 == d7Var.f4504a) {
                    o8Var.M0 = null;
                }
                d7Var.f4504a = null;
                d7Var.invalidate();
                return;
            }
            return;
        }
        j71 j71Var = d7Var.f4520n;
        if (j71Var != null) {
            if (c7Var == null || !c7Var.f4434g) {
                j71Var.animate().alpha(1.0f).setDuration(180L).withEndAction(new ba(21, this, o8Var)).start();
            }
        }
    }

    public a(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f358a = i10;
        this.f359b = obj;
        this.f360c = obj2;
        this.d = obj3;
    }

    public a(Object obj, String str, Object obj2, int i10) {
        this.f358a = i10;
        this.f360c = obj;
        this.f359b = str;
        this.d = obj2;
    }

    public a() {
        this.f358a = 8;
        this.f360c = new HashMap();
        this.d = new HashMap();
        this.f359b = new HashMap();
    }

    public a(CastDevice castDevice, d6.d0 d0Var) {
        this.f358a = 6;
        l.i(castDevice, "CastDevice parameter cannot be null");
        this.f359b = castDevice;
        this.f360c = d0Var;
    }

    public a(e6.h hVar) {
        this.f358a = 14;
        this.d = hVar;
        this.f360c = new AtomicLong((g6.a.f9428b.nextLong() & 65535) * 10000);
    }

    public a(h8.d dVar, i8.g gVar) {
        this.f358a = 17;
        this.f360c = gVar;
        l.h(dVar);
        this.f359b = dVar;
    }

    public a(String str, int i10) {
        this.f358a = i10;
        switch (i10) {
            case 13:
                of.b bVar = new of.b(13, false);
                this.f360c = bVar;
                this.d = bVar;
                this.f359b = str;
                return;
            case 20:
                r rVar = new r();
                rVar.f3252p = r0.n("video/mp2t");
                rVar.f3253q = r0.n(str);
                this.f359b = new b2.s(rVar);
                return;
            default:
                Object obj = new Object();
                this.f360c = obj;
                this.d = obj;
                this.f359b = str;
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
        this.f358a = 16;
        this.f359b = new gh.a();
        this.f360c = bVar;
    }

    public a(ArrayList arrayList) {
        this.f358a = 19;
        this.f359b = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.f360c = new long[arrayList.size() * 2];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            i4.c cVar = (i4.c) arrayList.get(i10);
            int i11 = i10 * 2;
            long[] jArr = (long[]) this.f360c;
            jArr[i11] = cVar.f10969b;
            jArr[i11 + 1] = cVar.f10970c;
        }
        long[] jArr2 = (long[]) this.f360c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = copyOf;
        Arrays.sort(copyOf);
    }

    public a(za.b bVar, id.h hVar) {
        this.f358a = 5;
        this.f360c = bVar;
        this.d = hVar;
        this.f359b = "firebase-settings.crashlytics.com";
    }

    public a(String str, HashMap hashMap) {
        this.f358a = 0;
        this.f359b = str;
        this.f360c = hashMap;
        this.d = new HashMap();
    }

    public a(String str, j[] jVarArr) {
        this.f358a = 9;
        System.currentTimeMillis();
        this.f359b = str;
        this.f360c = jVarArr;
        this.d = null;
    }

    public a(t0 store, s0 factory, g defaultCreationExtras) {
        this.f358a = 3;
        kotlin.jvm.internal.i.e(store, "store");
        kotlin.jvm.internal.i.e(factory, "factory");
        kotlin.jvm.internal.i.e(defaultCreationExtras, "defaultCreationExtras");
        this.f359b = store;
        this.f360c = factory;
        this.d = defaultCreationExtras;
    }

    public a(t0 store, s0 s0Var) {
        this(store, s0Var, v1.a.f44077b);
        this.f358a = 3;
        kotlin.jvm.internal.i.e(store, "store");
    }

    public a(Context context, LocationManager locationManager) {
        this.f358a = 15;
        this.d = new Object();
        this.f359b = context;
        this.f360c = locationManager;
    }

    public a(androidx.biometric.v vVar) {
        this.f358a = 1;
        this.d = vVar;
    }

    public a(androidx.fragment.app.v owner) {
        this(owner.f(), owner.c(), owner.d());
        this.f358a = 3;
        kotlin.jvm.internal.i.e(owner, "owner");
    }

    public a(c2.h[] hVarArr) {
        this.f358a = 26;
        k0 k0Var = new k0();
        ?? obj = new Object();
        obj.f3697c = 1.0f;
        obj.d = 1.0f;
        c2.f fVar = c2.f.e;
        obj.e = fVar;
        obj.f3698f = fVar;
        obj.f3699g = fVar;
        obj.h = fVar;
        ByteBuffer byteBuffer = c2.h.f3672a;
        obj.f3702k = byteBuffer;
        obj.f3703l = byteBuffer.asShortBuffer();
        obj.f3704m = byteBuffer;
        obj.f3696b = -1;
        c2.h[] hVarArr2 = new c2.h[hVarArr.length + 2];
        this.f359b = hVarArr2;
        System.arraycopy(hVarArr, 0, hVarArr2, 0, hVarArr.length);
        this.f360c = k0Var;
        this.d = obj;
        hVarArr2[hVarArr.length] = k0Var;
        hVarArr2[hVarArr.length + 1] = obj;
    }

    public a(Signature signature) {
        this.f358a = 25;
        this.f359b = signature;
        this.f360c = null;
        this.d = null;
    }

    public a(Cipher cipher) {
        this.f358a = 25;
        this.f360c = cipher;
        this.f359b = null;
        this.d = null;
    }

    public a(Mac mac) {
        this.f358a = 25;
        this.d = mac;
        this.f360c = null;
        this.f359b = null;
    }

    public a(View view, hh.k kVar) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        this.f358a = 18;
        u2 u2Var = new u2(this, 1);
        this.f359b = view;
        this.f360c = kVar;
        view.addOnAttachStateChangeListener(u2Var);
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

    public a(h hVar) {
        this.f358a = 2;
        Context context = hVar.f13516a;
        this.f359b = hVar;
        int i10 = Build.VERSION.SDK_INT;
        this.f360c = i10 >= 29 ? androidx.biometric.q.b(context) : null;
        this.d = i10 <= 29 ? new h(context, (short) 0) : null;
    }

    public a(m mVar, hc.f fVar, jc.e eVar) {
        e eVar2;
        int i10;
        int i11;
        this.f358a = 23;
        this.d = mVar;
        this.f359b = new ArrayList();
        jc.e eVar3 = eVar;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            eVar2 = e.ECI;
            if (eVar3 == null) {
                break;
            }
            int i14 = eVar3.f12965c;
            int i15 = i12 + eVar3.d;
            jc.e eVar4 = eVar3.e;
            int i16 = i13;
            e eVar5 = eVar3.f12963a;
            boolean z10 = (eVar5 == e.BYTE && eVar4 == null && i14 != 0) || !(eVar4 == null || i14 == eVar4.f12965c);
            i10 = z10 ? 1 : i16;
            if (eVar4 == null || eVar4.f12963a != eVar5 || z10) {
                ((ArrayList) this.f359b).add(0, new jc.f(this, eVar5, eVar3.f12964b, i14, i15));
                i11 = 0;
            } else {
                i11 = i15;
            }
            if (z10) {
                ((ArrayList) this.f359b).add(0, new jc.f(this, eVar2, eVar3.f12964b, eVar3.f12965c, 0));
            }
            i13 = i10;
            eVar3 = eVar4;
            i12 = i11;
        }
        int i17 = i13;
        boolean z11 = mVar.f7326a;
        hc.c cVar = (hc.c) mVar.d;
        if (z11) {
            jc.f fVar2 = (jc.f) ((ArrayList) this.f359b).get(0);
            if (fVar2 != null && fVar2.f12967a != eVar2 && i17 != 0) {
                ((ArrayList) this.f359b).add(0, new jc.f(this, eVar2, 0, 0, 0));
            }
            ((ArrayList) this.f359b).add(((jc.f) ((ArrayList) this.f359b).get(0)).f12967a == eVar2 ? 1 : 0, new jc.f(this, e.FNC1_FIRST_POSITION, 0, 0, 0));
        }
        int i18 = fVar.f10182a;
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
        this.f360c = hc.f.c(i18);
    }

    public a(d7 d7Var, o8 o8Var, Runnable[] runnableArr) {
        this.f358a = 10;
        this.d = d7Var;
        this.f359b = o8Var;
        this.f360c = runnableArr;
    }
}
