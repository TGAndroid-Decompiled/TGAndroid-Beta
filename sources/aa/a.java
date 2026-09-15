package aa;

import a4.e;
import ai.ba;
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
import e2.b0;
import e2.d0;
import e2.v;
import g6.f;
import g6.w;
import j$.util.DesugarCollections;
import j4.a0;
import j4.f0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.InputStream;
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
import java.util.zip.InflaterInputStream;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import k2.c0;
import k2.l0;
import k6.h;
import l5.t;
import m.p;
import m.q3;
import n6.l;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.vz;
import z3.d;
public final class a implements s, d71, d, a0, OnCompleteListener, n5.b {
    public static a e;
    public final int f356a;
    public Object f357b;
    public Object f358c;
    public Object d;

    public a(int i10) {
        this.f356a = i10;
    }

    public static final URL c(a aVar) {
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority((String) aVar.f357b).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        za.b bVar = (za.b) aVar.f358c;
        Uri.Builder appendPath2 = appendPath.appendPath(bVar.f48745a).appendPath("settings");
        za.a aVar2 = bVar.f48746b;
        return new URL(appendPath2.appendQueryParameter("build_version", aVar2.f48742c).appendQueryParameter("display_version", aVar2.f48741b).build().toString());
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
            return p6.t(str, sb3);
        }
        return a4.a.C(str, "?", sb3);
    }

    @Override
    public int A() {
        return ((long[]) this.d).length;
    }

    @Override
    public void a(v vVar) {
        long d;
        long j3;
        e2.d.h((b0) this.f358c);
        String str = d0.f7883a;
        b0 b0Var = (b0) this.f358c;
        synchronized (b0Var) {
            try {
                long j10 = b0Var.f7877c;
                if (j10 != -9223372036854775807L) {
                    d = j10 + b0Var.f7876b;
                } else {
                    d = b0Var.d();
                }
                j3 = d;
            } finally {
            }
        }
        long e7 = ((b0) this.f358c).e();
        if (j3 != -9223372036854775807L && e7 != -9223372036854775807L) {
            b2.s sVar = (b2.s) this.f357b;
            if (e7 != sVar.f3308w) {
                r a2 = sVar.a();
                a2.v = e7;
                b2.s sVar2 = new b2.s(a2);
                this.f357b = sVar2;
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
        e0 e0Var = (e0) this.f358c;
        String str = (String) this.f357b;
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
        synchronized (e0Var.f3982r) {
            try {
                if (e0Var.f3979o != null) {
                    e0Var.i(2477);
                }
                e0Var.f3979o = taskCompletionSource;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void b(b0 b0Var, q qVar, f0 f0Var) {
        this.f358c = b0Var;
        f0Var.a();
        f0Var.b();
        h0 Z1 = qVar.Z1(f0Var.d, 5);
        this.d = Z1;
        Z1.b((b2.s) this.f357b);
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
        if (((String) this.f357b) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((i5.d) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new l5.i((String) this.f357b, (byte[]) this.f358c, (i5.d) this.d);
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
        return new t(new rb.a(23), new qb.b(23), (q5.b) ((c) this.f357b).mo28get(), (da.b) ((q3) this.f358c).mo28get(), (com.google.firebase.messaging.t) ((ni.f) this.d).mo28get());
    }

    public int h() {
        FingerprintManager g10;
        FingerprintManager g11;
        h hVar = (h) this.d;
        if (hVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        Context context = hVar.f13515a;
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
        HashMap hashMap = (HashMap) this.f358c;
        la.f fVar = new la.f(byteArrayOutputStream, hashMap, (HashMap) this.d, (ia.d) this.f357b);
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

    @Override
    public List l(long j3) {
        List list = (List) this.f357b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            long[] jArr = (long[]) this.f358c;
            int i11 = i10 * 2;
            if (jArr[i11] <= j3 && j3 < jArr[i11 + 1]) {
                i4.c cVar = (i4.c) list.get(i10);
                d2.b bVar = cVar.f10965a;
                if (bVar.e == -3.4028235E38f) {
                    arrayList2.add(cVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new e(18));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            d2.b bVar2 = ((i4.c) arrayList2.get(i12)).f10965a;
            arrayList.add(new d2.b(bVar2.f7430a, bVar2.f7431b, bVar2.f7432c, bVar2.d, (-1) - i12, 1, bVar2.f7434g, bVar2.h, bVar2.f7435i, bVar2.f7440n, bVar2.f7441o, bVar2.f7436j, bVar2.f7437k, bVar2.f7438l, bVar2.f7439m, bVar2.f7442p, bVar2.f7443q, bVar2.f7444r));
        }
        return arrayList;
    }

    public lf.e m(lf.f fVar) {
        InflaterInputStream inflaterInputStream;
        int i10 = fVar.f14014c;
        InputStream inputStream = (mf.a) this.f357b;
        if (fVar.d) {
            c0 c0Var = (c0) this.d;
            c0Var.getClass();
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = ((com.google.firebase.messaging.d) c0Var.f13234b).read(bArr, i11, i10 - i11);
                if (read > 0) {
                    i11 += read;
                } else {
                    throw new EOFException();
                }
            }
            int i12 = 0;
            boolean z10 = false;
            for (int i13 = 0; i13 < i10; i13++) {
                byte b10 = bArr[i13];
                if (!z10 || b10 != 0) {
                    bArr[i12] = b10;
                    i12++;
                }
                if (b10 == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            inputStream = new ByteArrayInputStream(bArr, 0, i12);
            i10 = i12;
        }
        if (!fVar.f14015f) {
            if (fVar.e) {
                i10 = fVar.f14016g;
                inflaterInputStream = new InflaterInputStream(inputStream);
            } else {
                inflaterInputStream = inputStream;
            }
            return new lf.e(inflaterInputStream, fVar.f14013b, i10, (lf.i) this.f358c, fVar);
        }
        throw new Exception("Frame encryption is not supported");
    }

    public p0 n(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return o(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public p0 o(Class cls, String key) {
        p0 viewModel;
        n0 n0Var;
        s0 s0Var = (s0) this.f358c;
        kotlin.jvm.internal.i.e(key, "key");
        t0 t0Var = (t0) this.f357b;
        t0Var.getClass();
        LinkedHashMap linkedHashMap = t0Var.f2598a;
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
        ((LinkedHashMap) bVar.f2995a).put(q0.f2596b, key);
        try {
            viewModel = s0Var.H(cls, bVar);
        } catch (AbstractMethodError unused) {
            viewModel = s0Var.b(cls);
        }
        kotlin.jvm.internal.i.e(viewModel, "viewModel");
        p0 p0Var2 = (p0) linkedHashMap.put(key, viewModel);
        if (p0Var2 != null) {
            p0Var2.b();
        }
        return viewModel;
    }

    @Override
    public void onComplete(Task task) {
        j6.a aVar = (j6.a) this.f358c;
        String str = (String) this.f357b;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d;
        synchronized (aVar.f12885a) {
            aVar.f12885a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override
    public void onError(g71 g71Var, Exception exc) {
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
        g71 g71Var = d7Var.e;
        if (g71Var == null) {
            return;
        }
        if (g71Var.y()) {
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
        o8 o8Var = (o8) this.f357b;
        if (o8Var != null) {
            n8 q6 = d7Var.e.q(o8Var.f5147d1);
            o8Var.f5147d1 = q6;
            u61 u61Var = d7Var.f4515n;
            if (u61Var != null) {
                u61Var.setHDRInfo(q6);
            }
        }
        int i13 = (int) (i10 * f7);
        d7Var.f4507f = i13;
        int i14 = (int) (i11 * f7);
        d7Var.h = i14;
        if (o8Var != null && (o8Var.f5160k0 != i13 || o8Var.f5162l0 != i14)) {
            o8Var.f5160k0 = i13;
            o8Var.f5162l0 = i14;
            o8Var.A();
        }
        d7Var.b();
        u61 u61Var2 = d7Var.f4515n;
        if (u61Var2 != null) {
            int i15 = d7Var.f4507f;
            int i16 = d7Var.h;
            u61Var2.d = i15;
            u61Var2.e = i16;
            vz vzVar = u61Var2.f28300b;
            if (vzVar != null) {
                vzVar.postRunnable(new rz(vzVar, i15, i16, 0));
            }
        }
    }

    public Object p(Bitmap bitmap) {
        gh.a aVar = (gh.a) this.f357b;
        if (aVar.a(bitmap)) {
            this.d = ((gh.b) this.f358c).a(bitmap);
            aVar.b(bitmap);
        }
        return this.d;
    }

    public void q(h8.f fVar) {
        try {
            i8.g gVar = (i8.g) this.f358c;
            h8.i iVar = new h8.i(fVar);
            Parcel O0 = gVar.O0();
            s7.b.c(O0, iVar);
            gVar.S0(O0, 9);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    public int r(hc.f fVar) {
        ArrayList arrayList = (ArrayList) this.f357b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            jc.f fVar2 = (jc.f) obj;
            int i12 = fVar2.d;
            hc.e eVar = fVar2.f12964a;
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

    public boolean s() {
        throw new UnsupportedOperationException("Method not decompiled: aa.a.s():boolean");
    }

    public void t(String str, String str2) {
        ((HashMap) this.d).put(str, str2);
    }

    public String toString() {
        String str = "";
        int i10 = 0;
        switch (this.f356a) {
            case 9:
                return (String) this.f357b;
            case 11:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f357b);
                sb2.append('{');
                k kVar = ((k) this.f358c).f6817b;
                while (kVar != null) {
                    Object obj = kVar.f6816a;
                    sb2.append(str);
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    kVar = kVar.f6817b;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 13:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f357b);
                sb3.append('{');
                of.b bVar = (of.b) ((of.b) this.f358c).f15512c;
                while (bVar != null) {
                    Object obj2 = bVar.f15511b;
                    sb3.append(str);
                    if (obj2 != null && obj2.getClass().isArray()) {
                        String deepToString2 = Arrays.deepToString(new Object[]{obj2});
                        sb3.append((CharSequence) deepToString2, 1, deepToString2.length() - 1);
                    } else {
                        sb3.append(obj2);
                    }
                    bVar = (of.b) bVar.f15512c;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            case 22:
                StringBuilder sb4 = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.f357b;
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
            case 29:
                StringBuilder sb5 = new StringBuilder("id3v2tag[pos=");
                mf.a aVar = (mf.a) this.f357b;
                sb5.append(aVar.f7302b);
                sb5.append(", ");
                sb5.append(aVar.e());
                sb5.append(" left]");
                return sb5.toString();
            default:
                return super.toString();
        }
    }

    public void u(cc.i iVar, Object obj) {
        if (((EnumMap) this.d) == null) {
            this.d = new EnumMap(cc.i.class);
        }
        ((EnumMap) this.d).put((EnumMap) iVar, (cc.i) obj);
    }

    public void v(String str) {
        if (str != null) {
            this.f357b = str;
            return;
        }
        throw new NullPointerException("Null backendName");
    }

    public void w(int i10, String str, String str2) {
        ((HashMap) this.f358c).put(str, str2);
        ((HashMap) this.d).put(str2, str);
        ((HashMap) this.f357b).put(str, Integer.valueOf(i10));
    }

    public a(Object obj, Object obj2, Object obj3, int i10) {
        this.f356a = i10;
        this.f357b = obj3;
        this.f358c = obj;
        this.d = obj2;
    }

    @Override
    public void onRenderedFirstFrame() {
        o8 o8Var = (o8) this.f357b;
        Runnable[] runnableArr = (Runnable[]) this.f358c;
        d7 d7Var = (d7) this.d;
        c7 c7Var = d7Var.H;
        if (c7Var != null && c7Var.f4429g) {
            int i10 = d7Var.f4507f;
            int i11 = d7Var.h;
            c7Var.d = true;
            c7Var.e = i10;
            c7Var.f4428f = i11;
            hi.a aVar = c7Var.f4427c;
            if (aVar != null) {
                aVar.run(Integer.valueOf(i10), Integer.valueOf(c7Var.f4428f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            d7Var.post(runnable);
            runnableArr[0] = null;
            Bitmap bitmap = d7Var.f4499a;
            if (bitmap != null) {
                bitmap.recycle();
                if (o8Var.M0 == d7Var.f4499a) {
                    o8Var.M0 = null;
                }
                d7Var.f4499a = null;
                d7Var.invalidate();
                return;
            }
            return;
        }
        u61 u61Var = d7Var.f4515n;
        if (u61Var != null) {
            if (c7Var == null || !c7Var.f4429g) {
                u61Var.animate().alpha(1.0f).setDuration(180L).withEndAction(new ba(21, this, o8Var)).start();
            }
        }
    }

    public a(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f356a = i10;
        this.f357b = obj;
        this.f358c = obj2;
        this.d = obj3;
    }

    public a(Object obj, String str, Object obj2, int i10) {
        this.f356a = i10;
        this.f358c = obj;
        this.f357b = str;
        this.d = obj2;
    }

    public a() {
        this.f356a = 8;
        this.f358c = new HashMap();
        this.d = new HashMap();
        this.f357b = new HashMap();
    }

    public a(CastDevice castDevice, d6.d0 d0Var) {
        this.f356a = 6;
        l.i(castDevice, "CastDevice parameter cannot be null");
        this.f357b = castDevice;
        this.f358c = d0Var;
    }

    public a(e6.h hVar) {
        this.f356a = 14;
        this.d = hVar;
        this.f358c = new AtomicLong((g6.a.f9424b.nextLong() & 65535) * 10000);
    }

    public a(h8.d dVar, i8.g gVar) {
        this.f356a = 17;
        this.f358c = gVar;
        l.h(dVar);
        this.f357b = dVar;
    }

    public a(String str, int i10) {
        this.f356a = i10;
        switch (i10) {
            case 13:
                of.b bVar = new of.b(13, false);
                this.f358c = bVar;
                this.d = bVar;
                this.f357b = str;
                return;
            case 19:
                r rVar = new r();
                rVar.f3247p = r0.n("video/mp2t");
                rVar.f3248q = r0.n(str);
                this.f357b = new b2.s(rVar);
                return;
            default:
                Object obj = new Object();
                this.f358c = obj;
                this.d = obj;
                this.f357b = str;
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
        this.f356a = 16;
        this.f357b = new gh.a();
        this.f358c = bVar;
    }

    public a(InputStream inputStream, long j3, int i10, lf.i iVar) {
        this.f356a = 29;
        mf.a aVar = new mf.a(inputStream, j3, i10);
        this.f357b = aVar;
        this.d = new c0(aVar, 3);
        this.f358c = iVar;
    }

    public a(ArrayList arrayList) {
        this.f356a = 18;
        this.f357b = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.f358c = new long[arrayList.size() * 2];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            i4.c cVar = (i4.c) arrayList.get(i10);
            int i11 = i10 * 2;
            long[] jArr = (long[]) this.f358c;
            jArr[i11] = cVar.f10966b;
            jArr[i11 + 1] = cVar.f10967c;
        }
        long[] jArr2 = (long[]) this.f358c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = copyOf;
        Arrays.sort(copyOf);
    }

    public a(za.b bVar, id.h hVar) {
        this.f356a = 5;
        this.f358c = bVar;
        this.d = hVar;
        this.f357b = "firebase-settings.crashlytics.com";
    }

    public a(String str, HashMap hashMap) {
        this.f356a = 0;
        this.f357b = str;
        this.f358c = hashMap;
        this.d = new HashMap();
    }

    public a(String str, j[] jVarArr) {
        this.f356a = 9;
        System.currentTimeMillis();
        this.f357b = str;
        this.f358c = jVarArr;
        this.d = null;
    }

    public a(t0 store, s0 factory, g defaultCreationExtras) {
        this.f356a = 3;
        kotlin.jvm.internal.i.e(store, "store");
        kotlin.jvm.internal.i.e(factory, "factory");
        kotlin.jvm.internal.i.e(defaultCreationExtras, "defaultCreationExtras");
        this.f357b = store;
        this.f358c = factory;
        this.d = defaultCreationExtras;
    }

    public a(t0 store, s0 s0Var) {
        this(store, s0Var, v1.a.f43823b);
        this.f356a = 3;
        kotlin.jvm.internal.i.e(store, "store");
    }

    public a(Context context, LocationManager locationManager) {
        this.f356a = 15;
        this.d = new Object();
        this.f357b = context;
        this.f358c = locationManager;
    }

    public a(androidx.biometric.v vVar) {
        this.f356a = 1;
        this.d = vVar;
    }

    public a(androidx.fragment.app.v owner) {
        this(owner.f(), owner.c(), owner.d());
        this.f356a = 3;
        kotlin.jvm.internal.i.e(owner, "owner");
    }

    public a(c2.h[] hVarArr) {
        this.f356a = 25;
        l0 l0Var = new l0();
        ?? obj = new Object();
        obj.f3692c = 1.0f;
        obj.d = 1.0f;
        c2.f fVar = c2.f.e;
        obj.e = fVar;
        obj.f3693f = fVar;
        obj.f3694g = fVar;
        obj.h = fVar;
        ByteBuffer byteBuffer = c2.h.f3667a;
        obj.f3697k = byteBuffer;
        obj.f3698l = byteBuffer.asShortBuffer();
        obj.f3699m = byteBuffer;
        obj.f3691b = -1;
        c2.h[] hVarArr2 = new c2.h[hVarArr.length + 2];
        this.f357b = hVarArr2;
        System.arraycopy(hVarArr, 0, hVarArr2, 0, hVarArr.length);
        this.f358c = l0Var;
        this.d = obj;
        hVarArr2[hVarArr.length] = l0Var;
        hVarArr2[hVarArr.length + 1] = obj;
    }

    public a(Signature signature) {
        this.f356a = 24;
        this.f357b = signature;
        this.f358c = null;
        this.d = null;
    }

    public a(Cipher cipher) {
        this.f356a = 24;
        this.f358c = cipher;
        this.f357b = null;
        this.d = null;
    }

    public a(Mac mac) {
        this.f356a = 24;
        this.d = mac;
        this.f358c = null;
        this.f357b = null;
    }

    public a(h hVar) {
        this.f356a = 2;
        Context context = hVar.f13515a;
        this.f357b = hVar;
        int i10 = Build.VERSION.SDK_INT;
        this.f358c = i10 >= 29 ? androidx.biometric.q.b(context) : null;
        this.d = i10 <= 29 ? new h(context, 3) : null;
    }

    public a(m mVar, hc.f fVar, jc.e eVar) {
        hc.e eVar2;
        int i10;
        int i11;
        this.f356a = 22;
        this.d = mVar;
        this.f357b = new ArrayList();
        jc.e eVar3 = eVar;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            eVar2 = hc.e.ECI;
            if (eVar3 == null) {
                break;
            }
            int i14 = eVar3.f12962c;
            int i15 = i12 + eVar3.d;
            jc.e eVar4 = eVar3.e;
            int i16 = i13;
            hc.e eVar5 = eVar3.f12960a;
            boolean z10 = (eVar5 == hc.e.BYTE && eVar4 == null && i14 != 0) || !(eVar4 == null || i14 == eVar4.f12962c);
            i10 = z10 ? 1 : i16;
            if (eVar4 == null || eVar4.f12960a != eVar5 || z10) {
                ((ArrayList) this.f357b).add(0, new jc.f(this, eVar5, eVar3.f12961b, i14, i15));
                i11 = 0;
            } else {
                i11 = i15;
            }
            if (z10) {
                ((ArrayList) this.f357b).add(0, new jc.f(this, eVar2, eVar3.f12961b, eVar3.f12962c, 0));
            }
            i13 = i10;
            eVar3 = eVar4;
            i12 = i11;
        }
        int i17 = i13;
        boolean z11 = mVar.f7328a;
        hc.c cVar = (hc.c) mVar.d;
        if (z11) {
            jc.f fVar2 = (jc.f) ((ArrayList) this.f357b).get(0);
            if (fVar2 != null && fVar2.f12964a != eVar2 && i17 != 0) {
                ((ArrayList) this.f357b).add(0, new jc.f(this, eVar2, 0, 0, 0));
            }
            ((ArrayList) this.f357b).add(((jc.f) ((ArrayList) this.f357b).get(0)).f12964a == eVar2 ? 1 : 0, new jc.f(this, hc.e.FNC1_FIRST_POSITION, 0, 0, 0));
        }
        int i18 = fVar.f10178a;
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
        int r10 = r(fVar);
        while (i18 < i19 && !jc.c.c(r10, hc.f.c(i18), cVar)) {
            i18++;
        }
        while (i18 > i10 && jc.c.c(r10, hc.f.c(i18 - 1), cVar)) {
            i18--;
        }
        this.f358c = hc.f.c(i18);
    }

    public a(d7 d7Var, o8 o8Var, Runnable[] runnableArr) {
        this.f356a = 10;
        this.d = d7Var;
        this.f357b = o8Var;
        this.f358c = runnableArr;
    }
}
