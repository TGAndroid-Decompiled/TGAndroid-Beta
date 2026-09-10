package aa;

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
import b2.r;
import b2.r0;
import bi.b8;
import bi.d8;
import bi.e8;
import bi.q9;
import bi.r9;
import bi.tb;
import bi.u6;
import c3.h0;
import c3.q;
import c6.e0;
import c6.i;
import cc.j;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.play_billing.k;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.m;
import e2.d0;
import e2.v;
import e6.h;
import g6.f;
import g6.w;
import i4.c;
import j$.util.DesugarCollections;
import j4.b0;
import j4.g0;
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
import l2.g;
import lf.e;
import m.p;
import m.r3;
import n4.y;
import n6.l;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.yz;
import z3.d;
public final class a implements q71, s, d, b0, OnCompleteListener, n5.b {
    public static a e;
    public final int f354a;
    public Object f355b;
    public Object f356c;
    public Object d;

    public a(int i10) {
        this.f354a = i10;
    }

    public static final URL b(a aVar) {
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority((String) aVar.f355b).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        za.b bVar = (za.b) aVar.f356c;
        Uri.Builder appendPath2 = appendPath.appendPath(bVar.f47863a).appendPath("settings");
        za.a aVar2 = bVar.f47864b;
        return new URL(appendPath2.appendQueryParameter("build_version", aVar2.f47859c).appendQueryParameter("display_version", aVar2.f47858b).build().toString());
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
            return r6.t(str, sb3);
        }
        return a4.a.C(str, "?", sb3);
    }

    @Override
    public void a(v vVar) {
        long d;
        long j3;
        e2.d.h((e2.b0) this.f356c);
        String str = d0.f7188a;
        e2.b0 b0Var = (e2.b0) this.f356c;
        synchronized (b0Var) {
            try {
                long j10 = b0Var.f7182c;
                if (j10 != -9223372036854775807L) {
                    d = j10 + b0Var.f7181b;
                } else {
                    d = b0Var.d();
                }
                j3 = d;
            } finally {
            }
        }
        long e7 = ((e2.b0) this.f356c).e();
        if (j3 != -9223372036854775807L && e7 != -9223372036854775807L) {
            b2.s sVar = (b2.s) this.f355b;
            if (e7 != sVar.f2006w) {
                r a2 = sVar.a();
                a2.v = e7;
                b2.s sVar2 = new b2.s(a2);
                this.f355b = sVar2;
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
        e0 e0Var = (e0) this.f356c;
        String str = (String) this.f355b;
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
        synchronized (e0Var.f4401r) {
            try {
                if (e0Var.f4398o != null) {
                    e0Var.i(2477);
                }
                e0Var.f4398o = taskCompletionSource;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void c(e2.b0 b0Var, q qVar, g0 g0Var) {
        this.f356c = b0Var;
        g0Var.a();
        g0Var.b();
        h0 I = qVar.I(g0Var.d, 5);
        this.d = I;
        I.b((b2.s) this.f355b);
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
        if (((String) this.f355b) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((i5.d) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new l5.i((String) this.f355b, (byte[]) this.f356c, (i5.d) this.d);
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
        return new l5.s(new rb.a(23), new qb.b(23), (q5.b) ((u6) this.f355b).mo28get(), (da.b) ((r3) this.f356c).mo28get(), (com.google.firebase.messaging.s) ((ki.f) this.d).mo28get());
    }

    public int h() {
        FingerprintManager g10;
        FingerprintManager g11;
        k0.b bVar = (k0.b) this.d;
        if (bVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        Context context = bVar.f11992a;
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
        HashMap hashMap = (HashMap) this.f356c;
        la.f fVar = new la.f(byteArrayOutputStream, hashMap, (HashMap) this.d, (ia.d) this.f355b);
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

    public e l(lf.f fVar) {
        InflaterInputStream inflaterInputStream;
        int i10 = fVar.f12909c;
        InputStream inputStream = (mf.a) this.f355b;
        if (fVar.d) {
            g gVar = (g) this.d;
            gVar.getClass();
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = ((com.google.firebase.messaging.d) gVar.f12719b).read(bArr, i11, i10 - i11);
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
        if (!fVar.f12910f) {
            if (fVar.e) {
                i10 = fVar.f12911g;
                inflaterInputStream = new InflaterInputStream(inputStream);
            } else {
                inflaterInputStream = inputStream;
            }
            return new e(inflaterInputStream, fVar.f12908b, i10, (lf.i) this.f356c, fVar);
        }
        throw new Exception("Frame encryption is not supported");
    }

    public p0 m(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return n(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public p0 n(Class cls, String key) {
        p0 viewModel;
        n0 n0Var;
        s0 s0Var = (s0) this.f356c;
        kotlin.jvm.internal.i.e(key, "key");
        t0 t0Var = (t0) this.f355b;
        t0Var.getClass();
        LinkedHashMap linkedHashMap = t0Var.f1295a;
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
        v1.b bVar = new v1.b((b2.g) this.d);
        ((LinkedHashMap) bVar.f1693a).put(q0.f1293b, key);
        try {
            viewModel = s0Var.C(cls, bVar);
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

    public Object o(Bitmap bitmap) {
        fh.a aVar = (fh.a) this.f355b;
        if (aVar.a(bitmap)) {
            this.d = ((fh.b) this.f356c).a(bitmap);
            aVar.b(bitmap);
        }
        return this.d;
    }

    @Override
    public void onComplete(Task task) {
        j6.a aVar = (j6.a) this.f356c;
        String str = (String) this.f355b;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d;
        synchronized (aVar.f11779a) {
            aVar.f11779a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override
    public void onError(t71 t71Var, Exception exc) {
        tb tbVar = ((e8) this.d).N;
        if (tbVar != null) {
            tbVar.run();
        }
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        e8 e8Var = (e8) this.d;
        b8 b8Var = e8Var.K;
        t71 t71Var = e8Var.e;
        if (t71Var == null) {
            return;
        }
        if (t71Var.y()) {
            AndroidUtilities.runOnUIThread(b8Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(b8Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((e8) this.d).i();
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        e8 e8Var = (e8) this.d;
        r9 r9Var = (r9) this.f355b;
        if (r9Var != null) {
            q9 q6 = e8Var.e.q(r9Var.f3569d1);
            r9Var.f3569d1 = q6;
            h71 h71Var = e8Var.f2647n;
            if (h71Var != null) {
                h71Var.setHDRInfo(q6);
            }
        }
        int i13 = (int) (i10 * f7);
        e8Var.f2639f = i13;
        int i14 = (int) (i11 * f7);
        e8Var.h = i14;
        if (r9Var != null && (r9Var.f3582k0 != i13 || r9Var.f3584l0 != i14)) {
            r9Var.f3582k0 = i13;
            r9Var.f3584l0 = i14;
            r9Var.A();
        }
        e8Var.b();
        h71 h71Var2 = e8Var.f2647n;
        if (h71Var2 != null) {
            int i15 = e8Var.f2639f;
            int i16 = e8Var.h;
            h71Var2.d = i15;
            h71Var2.e = i16;
            c00 c00Var = h71Var2.f23538b;
            if (c00Var != null) {
                c00Var.postRunnable(new yz(c00Var, i15, i16, 0));
            }
        }
    }

    public void p(h8.f fVar) {
        try {
            i8.g gVar = (i8.g) this.f356c;
            h8.i iVar = new h8.i(fVar);
            Parcel O0 = gVar.O0();
            s7.b.c(O0, iVar);
            gVar.S0(O0, 9);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override
    public List q(long j3) {
        List list = (List) this.f355b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            long[] jArr = (long[]) this.f356c;
            int i11 = i10 * 2;
            if (jArr[i11] <= j3 && j3 < jArr[i11 + 1]) {
                c cVar = (c) list.get(i10);
                d2.b bVar = cVar.f10449a;
                if (bVar.e == -3.4028235E38f) {
                    arrayList2.add(cVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new a4.e(11));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            d2.b bVar2 = ((c) arrayList2.get(i12)).f10449a;
            arrayList.add(new d2.b(bVar2.f6208a, bVar2.f6209b, bVar2.f6210c, bVar2.d, (-1) - i12, 1, bVar2.f6212g, bVar2.h, bVar2.f6213i, bVar2.f6218n, bVar2.f6219o, bVar2.f6214j, bVar2.f6215k, bVar2.f6216l, bVar2.f6217m, bVar2.f6220p, bVar2.f6221q, bVar2.f6222r));
        }
        return arrayList;
    }

    public int r(hc.g gVar) {
        ArrayList arrayList = (ArrayList) this.f355b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            jc.f fVar = (jc.f) obj;
            int i12 = fVar.d;
            hc.f fVar2 = fVar.f11858a;
            int a2 = fVar2.a(gVar);
            int i13 = a2 + 4;
            int ordinal = fVar2.ordinal();
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
                        i13 += fVar.a() * 8;
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
        switch (this.f354a) {
            case 10:
                return (String) this.f355b;
            case 11:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f355b);
                sb2.append('{');
                k kVar = ((k) this.f356c).f5596b;
                while (kVar != null) {
                    Object obj = kVar.f5595a;
                    sb2.append(str);
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    kVar = kVar.f5596b;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 13:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f355b);
                sb3.append('{');
                y yVar = (y) ((y) this.f356c).f13825c;
                while (yVar != null) {
                    Object obj2 = yVar.f13824b;
                    sb3.append(str);
                    if (obj2 != null && obj2.getClass().isArray()) {
                        String deepToString2 = Arrays.deepToString(new Object[]{obj2});
                        sb3.append((CharSequence) deepToString2, 1, deepToString2.length() - 1);
                    } else {
                        sb3.append(obj2);
                    }
                    yVar = (y) yVar.f13825c;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            case 23:
                StringBuilder sb4 = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.f355b;
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
                mf.a aVar = (mf.a) this.f355b;
                sb5.append(aVar.f6077b);
                sb5.append(", ");
                sb5.append(aVar.e());
                sb5.append(" left]");
                return sb5.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public int u() {
        return ((long[]) this.d).length;
    }

    public void v(cc.i iVar, Object obj) {
        if (((EnumMap) this.d) == null) {
            this.d = new EnumMap(cc.i.class);
        }
        ((EnumMap) this.d).put((EnumMap) iVar, (cc.i) obj);
    }

    public void w(String str) {
        if (str != null) {
            this.f355b = str;
            return;
        }
        throw new NullPointerException("Null backendName");
    }

    public void x(int i10, String str, String str2) {
        ((HashMap) this.f356c).put(str, str2);
        ((HashMap) this.d).put(str2, str);
        ((HashMap) this.f355b).put(str, Integer.valueOf(i10));
    }

    public a(Object obj, Object obj2, Object obj3, int i10) {
        this.f354a = i10;
        this.f355b = obj3;
        this.f356c = obj;
        this.d = obj2;
    }

    @Override
    public void onRenderedFirstFrame() {
        r9 r9Var = (r9) this.f355b;
        Runnable[] runnableArr = (Runnable[]) this.f356c;
        e8 e8Var = (e8) this.d;
        d8 d8Var = e8Var.H;
        if (d8Var != null && d8Var.f2555g) {
            int i10 = e8Var.f2639f;
            int i11 = e8Var.h;
            d8Var.d = true;
            d8Var.e = i10;
            d8Var.f2554f = i11;
            gi.a aVar = d8Var.f2553c;
            if (aVar != null) {
                aVar.run(Integer.valueOf(i10), Integer.valueOf(d8Var.f2554f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            e8Var.post(runnable);
            runnableArr[0] = null;
            Bitmap bitmap = e8Var.f2631a;
            if (bitmap != null) {
                bitmap.recycle();
                if (r9Var.M0 == e8Var.f2631a) {
                    r9Var.M0 = null;
                }
                e8Var.f2631a = null;
                e8Var.invalidate();
                return;
            }
            return;
        }
        h71 h71Var = e8Var.f2647n;
        if (h71Var != null) {
            if (d8Var == null || !d8Var.f2555g) {
                h71Var.animate().alpha(1.0f).setDuration(180L).withEndAction(new a1.e(17, this, r9Var)).start();
            }
        }
    }

    public a(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f354a = i10;
        this.f355b = obj;
        this.f356c = obj2;
        this.d = obj3;
    }

    public a(Object obj, String str, Object obj2, int i10) {
        this.f354a = i10;
        this.f356c = obj;
        this.f355b = str;
        this.d = obj2;
    }

    public a() {
        this.f354a = 9;
        this.f356c = new HashMap();
        this.d = new HashMap();
        this.f355b = new HashMap();
    }

    public a(CastDevice castDevice, d6.d0 d0Var) {
        this.f354a = 7;
        l.i(castDevice, "CastDevice parameter cannot be null");
        this.f355b = castDevice;
        this.f356c = d0Var;
    }

    public a(h hVar) {
        this.f354a = 14;
        this.d = hVar;
        this.f356c = new AtomicLong((g6.a.f8557b.nextLong() & 65535) * 10000);
    }

    public a(h8.d dVar, i8.g gVar) {
        this.f354a = 17;
        this.f356c = gVar;
        l.h(dVar);
        this.f355b = dVar;
    }

    public a(String str, int i10) {
        this.f354a = i10;
        switch (i10) {
            case 13:
                y yVar = new y(13, false);
                this.f356c = yVar;
                this.d = yVar;
                this.f355b = str;
                return;
            case 20:
                r rVar = new r();
                rVar.f1945p = r0.n("video/mp2t");
                rVar.f1946q = r0.n(str);
                this.f355b = new b2.s(rVar);
                return;
            default:
                Object obj = new Object();
                this.f356c = obj;
                this.d = obj;
                this.f355b = str;
                return;
        }
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    public a(fh.b bVar) {
        this.f354a = 15;
        this.f355b = new fh.a();
        this.f356c = bVar;
    }

    public a(InputStream inputStream, long j3, int i10, lf.i iVar) {
        this.f354a = 29;
        mf.a aVar = new mf.a(inputStream, j3, i10);
        this.f355b = aVar;
        this.d = new g(aVar, 1);
        this.f356c = iVar;
    }

    public a(ArrayList arrayList) {
        this.f354a = 18;
        this.f355b = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.f356c = new long[arrayList.size() * 2];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c cVar = (c) arrayList.get(i10);
            int i11 = i10 * 2;
            long[] jArr = (long[]) this.f356c;
            jArr[i11] = cVar.f10450b;
            jArr[i11 + 1] = cVar.f10451c;
        }
        long[] jArr2 = (long[]) this.f356c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = copyOf;
        Arrays.sort(copyOf);
    }

    public a(za.b bVar, id.h hVar) {
        this.f354a = 5;
        this.f356c = bVar;
        this.d = hVar;
        this.f355b = "firebase-settings.crashlytics.com";
    }

    public a(String str, HashMap hashMap) {
        this.f354a = 0;
        this.f355b = str;
        this.f356c = hashMap;
        this.d = new HashMap();
    }

    public a(String str, j[] jVarArr) {
        this.f354a = 10;
        System.currentTimeMillis();
        this.f355b = str;
        this.f356c = jVarArr;
        this.d = null;
    }

    public a(t0 store, s0 factory, b2.g defaultCreationExtras) {
        this.f354a = 3;
        kotlin.jvm.internal.i.e(store, "store");
        kotlin.jvm.internal.i.e(factory, "factory");
        kotlin.jvm.internal.i.e(defaultCreationExtras, "defaultCreationExtras");
        this.f355b = store;
        this.f356c = factory;
        this.d = defaultCreationExtras;
    }

    public a(t0 store, s0 s0Var) {
        this(store, s0Var, v1.a.f42843b);
        this.f354a = 3;
        kotlin.jvm.internal.i.e(store, "store");
    }

    public a(Context context, LocationManager locationManager) {
        this.f354a = 16;
        this.d = new Object();
        this.f355b = context;
        this.f356c = locationManager;
    }

    public a(androidx.biometric.w wVar) {
        this.f354a = 1;
        this.d = wVar;
    }

    public a(androidx.fragment.app.v owner) {
        this(owner.f(), owner.c(), owner.d());
        this.f354a = 3;
        kotlin.jvm.internal.i.e(owner, "owner");
    }

    public a(c2.h[] hVarArr) {
        this.f354a = 25;
        k2.j0 j0Var = new k2.j0();
        ?? obj = new Object();
        obj.f4111c = 1.0f;
        obj.d = 1.0f;
        c2.f fVar = c2.f.e;
        obj.e = fVar;
        obj.f4112f = fVar;
        obj.f4113g = fVar;
        obj.h = fVar;
        ByteBuffer byteBuffer = c2.h.f4086a;
        obj.f4116k = byteBuffer;
        obj.f4117l = byteBuffer.asShortBuffer();
        obj.f4118m = byteBuffer;
        obj.f4110b = -1;
        c2.h[] hVarArr2 = new c2.h[hVarArr.length + 2];
        this.f355b = hVarArr2;
        System.arraycopy(hVarArr, 0, hVarArr2, 0, hVarArr.length);
        this.f356c = j0Var;
        this.d = obj;
        hVarArr2[hVarArr.length] = j0Var;
        hVarArr2[hVarArr.length + 1] = obj;
    }

    public a(Signature signature) {
        this.f354a = 24;
        this.f355b = signature;
        this.f356c = null;
        this.d = null;
    }

    public a(Cipher cipher) {
        this.f354a = 24;
        this.f356c = cipher;
        this.f355b = null;
        this.d = null;
    }

    public a(Mac mac) {
        this.f354a = 24;
        this.d = mac;
        this.f356c = null;
        this.f355b = null;
    }

    public a(androidx.biometric.s sVar) {
        this.f354a = 2;
        Context context = sVar.f754a;
        this.f355b = sVar;
        int i10 = Build.VERSION.SDK_INT;
        this.f356c = i10 >= 29 ? androidx.biometric.q.b(context) : null;
        this.d = i10 <= 29 ? new k0.b(context, false) : null;
    }

    public a(m mVar, hc.g gVar, jc.e eVar) {
        hc.f fVar;
        int i10;
        int i11;
        this.f354a = 23;
        this.d = mVar;
        this.f355b = new ArrayList();
        jc.e eVar2 = eVar;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            fVar = hc.f.ECI;
            if (eVar2 == null) {
                break;
            }
            int i14 = eVar2.f11856c;
            int i15 = i12 + eVar2.d;
            jc.e eVar3 = eVar2.e;
            int i16 = i13;
            hc.f fVar2 = eVar2.f11854a;
            boolean z10 = (fVar2 == hc.f.BYTE && eVar3 == null && i14 != 0) || !(eVar3 == null || i14 == eVar3.f11856c);
            i10 = z10 ? 1 : i16;
            if (eVar3 == null || eVar3.f11854a != fVar2 || z10) {
                ((ArrayList) this.f355b).add(0, new jc.f(this, fVar2, eVar2.f11855b, i14, i15));
                i11 = 0;
            } else {
                i11 = i15;
            }
            if (z10) {
                ((ArrayList) this.f355b).add(0, new jc.f(this, fVar, eVar2.f11855b, eVar2.f11856c, 0));
            }
            i13 = i10;
            eVar2 = eVar3;
            i12 = i11;
        }
        int i17 = i13;
        boolean z11 = mVar.f6100a;
        hc.d dVar = (hc.d) mVar.d;
        if (z11) {
            jc.f fVar3 = (jc.f) ((ArrayList) this.f355b).get(0);
            if (fVar3 != null && fVar3.f11858a != fVar && i17 != 0) {
                ((ArrayList) this.f355b).add(0, new jc.f(this, fVar, 0, 0, 0));
            }
            ((ArrayList) this.f355b).add(((jc.f) ((ArrayList) this.f355b).get(0)).f11858a == fVar ? 1 : 0, new jc.f(this, hc.f.FNC1_FIRST_POSITION, 0, 0, 0));
        }
        int i18 = gVar.f9296a;
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
        int r10 = r(gVar);
        while (i18 < i19 && !jc.c.c(r10, hc.g.c(i18), dVar)) {
            i18++;
        }
        while (i18 > i10 && jc.c.c(r10, hc.g.c(i18 - 1), dVar)) {
            i18--;
        }
        this.f356c = hc.g.c(i18);
    }

    public a(e8 e8Var, r9 r9Var, Runnable[] runnableArr) {
        this.f354a = 6;
        this.d = e8Var;
        this.f355b = r9Var;
        this.f356c = runnableArr;
    }
}
