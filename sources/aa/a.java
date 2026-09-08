package aa;

import a4.e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.hardware.fingerprint.FingerprintManager;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
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
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.v;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.m;
import di.b7;
import di.c7;
import di.d7;
import di.ka;
import di.n8;
import di.o8;
import di.z6;
import e2.b0;
import e2.d0;
import e6.h;
import fi.j4;
import g6.f;
import g6.w;
import h0.k;
import j$.util.DesugarCollections;
import j4.a0;
import j4.f0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
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
import m.p3;
import n6.l;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.vz;
import org.xmlpull.v1.XmlPullParserException;
import t7.u;
import v7.u7;
import z3.d;
public final class a implements s, d71, d, a0, OnCompleteListener, n5.b {
    public static a f381e;
    public final int f382a;
    public Object f383b;
    public Object f384c;
    public Object d;

    public a(int i10) {
        this.f382a = i10;
    }

    public static final URL a(a aVar) {
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority((String) aVar.f383b).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        za.b bVar = (za.b) aVar.f384c;
        Uri.Builder appendPath2 = appendPath.appendPath(bVar.f51415a).appendPath("settings");
        za.a aVar2 = bVar.f51416b;
        return new URL(appendPath2.appendQueryParameter("build_version", aVar2.f51411c).appendQueryParameter("display_version", aVar2.f51410b).build().toString());
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
            return p6.t(str, sb3);
        }
        return a4.a.C(str, "?", sb3);
    }

    public static a y(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new a(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public void A() {
        ((TypedArray) this.f384c).recycle();
    }

    public void B(String str) {
        if (str != null) {
            this.f383b = str;
            return;
        }
        throw new NullPointerException("Null backendName");
    }

    public void C(int i10, String str, String str2) {
        ((HashMap) this.f384c).put(str, str2);
        ((HashMap) this.d).put(str2, str);
        ((HashMap) this.f383b).put(str, Integer.valueOf(i10));
    }

    @Override
    public void accept(Object obj, Object obj2) {
        boolean z10;
        e0 e0Var = (e0) this.f384c;
        String str = (String) this.f383b;
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
        v.c(O0, iVar);
        fVar.T0(O0, 13);
        synchronized (e0Var.f4524r) {
            try {
                if (e0Var.f4521o != null) {
                    e0Var.i(2477);
                }
                e0Var.f4521o = taskCompletionSource;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void b(e2.v vVar) {
        long d;
        long j3;
        e2.d.h((b0) this.f384c);
        String str = d0.f8765a;
        b0 b0Var = (b0) this.f384c;
        synchronized (b0Var) {
            try {
                long j10 = b0Var.f8758c;
                if (j10 != -9223372036854775807L) {
                    d = j10 + b0Var.f8757b;
                } else {
                    d = b0Var.d();
                }
                j3 = d;
            } finally {
            }
        }
        long e7 = ((b0) this.f384c).e();
        if (j3 != -9223372036854775807L && e7 != -9223372036854775807L) {
            b2.s sVar = (b2.s) this.f383b;
            if (e7 != sVar.f2401w) {
                r a2 = sVar.a();
                a2.v = e7;
                b2.s sVar2 = new b2.s(a2);
                this.f383b = sVar2;
                ((h0) this.d).b(sVar2);
            }
            int a10 = vVar.a();
            ((h0) this.d).d(a10, vVar);
            ((h0) this.d).c(j3, 1, a10, 0, null);
        }
    }

    @Override
    public void c(b0 b0Var, q qVar, f0 f0Var) {
        this.f384c = b0Var;
        f0Var.a();
        f0Var.b();
        h0 R1 = qVar.R1(f0Var.d, 5);
        this.d = R1;
        R1.b((b2.s) this.f383b);
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
        e2.d.b(z10);
        if (i10 < jArr.length) {
            z11 = true;
        }
        e2.d.b(z11);
        return jArr[i10];
    }

    public l5.i f() {
        String str;
        if (((String) this.f383b) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((i5.d) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new l5.i((String) this.f383b, (byte[]) this.f384c, (i5.d) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public int g(int r12) {
        throw new UnsupportedOperationException("Method not decompiled: aa.a.g(int):int");
    }

    @Override
    public Object mo28get() {
        return new l5.s(new u(23), new rb.a(23), (q5.b) ((c) this.f383b).mo28get(), (da.b) ((p3) this.f384c).mo28get(), (com.google.firebase.messaging.s) ((fg.f) this.d).mo28get());
    }

    @Override
    public List h(long j3) {
        List list = (List) this.f383b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            long[] jArr = (long[]) this.f384c;
            int i11 = i10 * 2;
            if (jArr[i11] <= j3 && j3 < jArr[i11 + 1]) {
                i4.c cVar = (i4.c) list.get(i10);
                d2.b bVar = cVar.f11856a;
                if (bVar.f6522e == -3.4028235E38f) {
                    arrayList2.add(cVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new e(18));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            d2.b bVar2 = ((i4.c) arrayList2.get(i12)).f11856a;
            arrayList.add(new d2.b(bVar2.f6519a, bVar2.f6520b, bVar2.f6521c, bVar2.d, (-1) - i12, 1, bVar2.f6524g, bVar2.h, bVar2.f6525i, bVar2.f6530n, bVar2.f6531o, bVar2.f6526j, bVar2.f6527k, bVar2.f6528l, bVar2.f6529m, bVar2.f6532p, bVar2.f6533q, bVar2.f6534r));
        }
        return arrayList;
    }

    public int i() {
        FingerprintManager g10;
        FingerprintManager g11;
        androidx.biometric.s sVar = (androidx.biometric.s) this.d;
        if (sVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        Context context = sVar.f1067a;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && (g10 = e0.b.g(context)) != null && e0.b.q(g10)) {
            if (i10 >= 23 && (g11 = e0.b.g(context)) != null && e0.b.m(g11)) {
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

    public void l(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f384c;
        la.f fVar = new la.f(byteArrayOutputStream, hashMap, (HashMap) this.d, (ia.d) this.f383b);
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

    public aa.b m() {
        throw new UnsupportedOperationException("Method not decompiled: aa.a.m():aa.b");
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
        s0 s0Var = (s0) this.f384c;
        kotlin.jvm.internal.i.e(key, "key");
        t0 t0Var = (t0) this.f383b;
        t0Var.getClass();
        LinkedHashMap linkedHashMap = t0Var.f1645a;
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
                    p pVar = n0Var.f1634e;
                    kotlin.jvm.internal.i.b(pVar);
                    j0.a(p0Var, pVar, oVar);
                }
            }
            kotlin.jvm.internal.i.c(p0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return p0Var;
        }
        v1.b bVar = new v1.b((g) this.d);
        ((LinkedHashMap) bVar.f2068a).put(q0.f1642b, key);
        try {
            viewModel = s0Var.U(cls, bVar);
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
    public void onComplete(Task task) {
        j6.a aVar = (j6.a) this.f384c;
        String str = (String) this.f383b;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d;
        synchronized (aVar.f13549a) {
            aVar.f13549a.remove(str);
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
        z6 z6Var = d7Var.K;
        g71 g71Var = d7Var.f7103e;
        if (g71Var == null) {
            return;
        }
        if (g71Var.y()) {
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
        ((d7) this.d).i();
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        d7 d7Var = (d7) this.d;
        o8 o8Var = (o8) this.f383b;
        if (o8Var != null) {
            n8 q6 = d7Var.f7103e.q(o8Var.f7778d1);
            o8Var.f7778d1 = q6;
            u61 u61Var = d7Var.f7113n;
            if (u61Var != null) {
                u61Var.setHDRInfo(q6);
            }
        }
        int i13 = (int) (i10 * f7);
        d7Var.f7105f = i13;
        int i14 = (int) (i11 * f7);
        d7Var.h = i14;
        if (o8Var != null && (o8Var.f7792k0 != i13 || o8Var.f7794l0 != i14)) {
            o8Var.f7792k0 = i13;
            o8Var.f7794l0 = i14;
            o8Var.A();
        }
        d7Var.b();
        u61 u61Var2 = d7Var.f7113n;
        if (u61Var2 != null) {
            int i15 = d7Var.f7105f;
            int i16 = d7Var.h;
            u61Var2.d = i15;
            u61Var2.f30850e = i16;
            vz vzVar = u61Var2.f30848b;
            if (vzVar != null) {
                vzVar.postRunnable(new rz(vzVar, i15, i16, 0));
            }
        }
    }

    public Object p(Bitmap bitmap) {
        hh.a aVar = (hh.a) this.f383b;
        if (aVar.a(bitmap)) {
            this.d = ((hh.b) this.f384c).a(bitmap);
            aVar.b(bitmap);
        }
        return this.d;
    }

    public ColorStateList q(int i10) {
        int resourceId;
        ColorStateList a2;
        TypedArray typedArray = (TypedArray) this.f384c;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (a2 = u7.a((Context) this.f383b, resourceId)) != null) {
            return a2;
        }
        return typedArray.getColorStateList(i10);
    }

    public Drawable r(int i10) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f384c;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0) {
            return u7.b((Context) this.f383b, resourceId);
        }
        return typedArray.getDrawable(i10);
    }

    public Drawable s(int i10) {
        int resourceId;
        Drawable f7;
        if (((TypedArray) this.f384c).hasValue(i10) && (resourceId = ((TypedArray) this.f384c).getResourceId(i10, 0)) != 0) {
            m.q a2 = m.q.a();
            Context context = (Context) this.f383b;
            synchronized (a2) {
                f7 = a2.f15668a.f(resourceId, context, true);
            }
            return f7;
        }
        return null;
    }

    public Typeface t(int i10, int i11, e2.a0 a0Var) {
        e2.a0 a0Var2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.f384c).getResourceId(i10, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.d) == null) {
                this.d = new TypedValue();
            }
            Context context = (Context) this.f383b;
            TypedValue typedValue = (TypedValue) this.d;
            ThreadLocal threadLocal = k.f10844a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence != null) {
                    String charSequence2 = charSequence.toString();
                    if (!charSequence2.startsWith("res/")) {
                        a0Var.b();
                        return null;
                    }
                    int i12 = typedValue.assetCookie;
                    a0.k kVar = i0.f.f11458b;
                    Typeface typeface = (Typeface) kVar.a(i0.f.b(resources, resourceId, charSequence2, i12, i11));
                    if (typeface != null) {
                        new Handler(Looper.getMainLooper()).post(new j4(3, a0Var, typeface));
                        return typeface;
                    }
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            h0.d g10 = h0.b.g(resources.getXml(resourceId), resources);
                            if (g10 == null) {
                                try {
                                    Log.e("ResourcesCompat", "Failed to find font-family tag");
                                    a0Var.b();
                                    return null;
                                } catch (IOException e7) {
                                    iOException = e7;
                                    a0Var2 = a0Var;
                                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                                    a0Var2.b();
                                    return null;
                                } catch (XmlPullParserException e10) {
                                    xmlPullParserException = e10;
                                    a0Var2 = a0Var;
                                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                                    a0Var2.b();
                                    return null;
                                }
                            }
                            try {
                                return i0.f.a(context, g10, resources, resourceId, charSequence2, typedValue.assetCookie, i11, a0Var);
                            } catch (IOException e11) {
                                e = e11;
                                a0Var2 = a0Var;
                                iOException = e;
                                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                                a0Var2.b();
                                return null;
                            } catch (XmlPullParserException e12) {
                                e = e12;
                                a0Var2 = a0Var;
                                xmlPullParserException = e;
                                Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                                a0Var2.b();
                                return null;
                            }
                        }
                        a0Var2 = a0Var;
                        try {
                            int i13 = typedValue.assetCookie;
                            Typeface e13 = i0.f.f11457a.e(context, resources, resourceId, charSequence2, i11);
                            if (e13 != null) {
                                kVar.b(i0.f.b(resources, resourceId, charSequence2, i13, i11), e13);
                            }
                            if (e13 != null) {
                                new Handler(Looper.getMainLooper()).post(new j4(3, a0Var2, e13));
                            } else {
                                a0Var2.b();
                            }
                            return e13;
                        } catch (IOException e14) {
                            e = e14;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            a0Var2.b();
                            return null;
                        } catch (XmlPullParserException e15) {
                            e = e15;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            a0Var2.b();
                            return null;
                        }
                    } catch (IOException e16) {
                        e = e16;
                        a0Var2 = a0Var;
                    } catch (XmlPullParserException e17) {
                        e = e17;
                        a0Var2 = a0Var;
                    }
                } else {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
            }
        }
        return null;
    }

    public String toString() {
        String str = "";
        int i10 = 0;
        switch (this.f382a) {
            case 9:
                return (String) this.f383b;
            case 10:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f383b);
                sb2.append('{');
                com.google.android.gms.internal.play_billing.k kVar = ((com.google.android.gms.internal.play_billing.k) this.f384c).f5842b;
                while (kVar != null) {
                    Object obj = kVar.f5841a;
                    sb2.append(str);
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    kVar = kVar.f5842b;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 12:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f383b);
                sb3.append('{');
                pf.b bVar = (pf.b) ((pf.b) this.f384c).f44074c;
                while (bVar != null) {
                    Object obj2 = bVar.f44073b;
                    sb3.append(str);
                    if (obj2 != null && obj2.getClass().isArray()) {
                        String deepToString2 = Arrays.deepToString(new Object[]{obj2});
                        sb3.append((CharSequence) deepToString2, 1, deepToString2.length() - 1);
                    } else {
                        sb3.append(obj2);
                    }
                    bVar = (pf.b) bVar.f44074c;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            case 22:
                StringBuilder sb4 = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.f383b;
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

    public void u(h8.f fVar) {
        try {
            i8.g gVar = (i8.g) this.f384c;
            h8.i iVar = new h8.i(fVar);
            Parcel O0 = gVar.O0();
            s7.b.c(O0, iVar);
            gVar.S0(O0, 9);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    public int v(hc.f fVar) {
        ArrayList arrayList = (ArrayList) this.f383b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            jc.f fVar2 = (jc.f) obj;
            int i12 = fVar2.d;
            hc.e eVar = fVar2.f13636a;
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

    public boolean w() {
        throw new UnsupportedOperationException("Method not decompiled: aa.a.w():boolean");
    }

    public void x(String str, String str2) {
        ((HashMap) this.d).put(str, str2);
    }

    public void z(cc.i iVar, Object obj) {
        if (((EnumMap) this.d) == null) {
            this.d = new EnumMap(cc.i.class);
        }
        ((EnumMap) this.d).put((EnumMap) iVar, (cc.i) obj);
    }

    public a(Object obj, Object obj2, Object obj3, int i10) {
        this.f382a = i10;
        this.f383b = obj3;
        this.f384c = obj;
        this.d = obj2;
    }

    @Override
    public void onRenderedFirstFrame() {
        o8 o8Var = (o8) this.f383b;
        Runnable[] runnableArr = (Runnable[]) this.f384c;
        d7 d7Var = (d7) this.d;
        c7 c7Var = d7Var.H;
        if (c7Var != null && c7Var.f7022g) {
            int i10 = d7Var.f7105f;
            int i11 = d7Var.h;
            c7Var.d = true;
            c7Var.f7020e = i10;
            c7Var.f7021f = i11;
            ii.a aVar = c7Var.f7019c;
            if (aVar != null) {
                aVar.run(Integer.valueOf(i10), Integer.valueOf(c7Var.f7021f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            d7Var.post(runnable);
            runnableArr[0] = null;
            Bitmap bitmap = d7Var.f7096a;
            if (bitmap != null) {
                bitmap.recycle();
                if (o8Var.M0 == d7Var.f7096a) {
                    o8Var.M0 = null;
                }
                d7Var.f7096a = null;
                d7Var.invalidate();
                return;
            }
            return;
        }
        u61 u61Var = d7Var.f7113n;
        if (u61Var != null) {
            if (c7Var == null || !c7Var.f7022g) {
                u61Var.animate().alpha(1.0f).setDuration(180L).withEndAction(new b7(0, this, o8Var)).start();
            }
        }
    }

    public a(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f382a = i10;
        this.f383b = obj;
        this.f384c = obj2;
        this.d = obj3;
    }

    public a(Object obj, String str, Object obj2, int i10) {
        this.f382a = i10;
        this.f384c = obj;
        this.f383b = str;
        this.d = obj2;
    }

    public a() {
        this.f382a = 8;
        this.f384c = new HashMap();
        this.d = new HashMap();
        this.f383b = new HashMap();
    }

    public a(CastDevice castDevice, d6.d0 d0Var) {
        this.f382a = 6;
        l.i(castDevice, "CastDevice parameter cannot be null");
        this.f383b = castDevice;
        this.f384c = d0Var;
    }

    public a(h hVar) {
        this.f382a = 14;
        this.d = hVar;
        this.f384c = new AtomicLong((g6.a.f10413b.nextLong() & 65535) * 10000);
    }

    public a(h8.d dVar, i8.g gVar) {
        this.f382a = 16;
        this.f384c = gVar;
        l.h(dVar);
        this.f383b = dVar;
    }

    public a(String str, int i10) {
        this.f382a = i10;
        switch (i10) {
            case 12:
                pf.b bVar = new pf.b(13, false);
                this.f384c = bVar;
                this.d = bVar;
                this.f383b = str;
                return;
            case 19:
                r rVar = new r();
                rVar.f2338p = r0.n("video/mp2t");
                rVar.f2339q = r0.n(str);
                this.f383b = new b2.s(rVar);
                return;
            default:
                Object obj = new Object();
                this.f384c = obj;
                this.d = obj;
                this.f383b = str;
                return;
        }
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    public a(hh.b bVar) {
        this.f382a = 17;
        this.f383b = new hh.a();
        this.f384c = bVar;
    }

    public a(ArrayList arrayList) {
        this.f382a = 18;
        this.f383b = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.f384c = new long[arrayList.size() * 2];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            i4.c cVar = (i4.c) arrayList.get(i10);
            int i11 = i10 * 2;
            long[] jArr = (long[]) this.f384c;
            jArr[i11] = cVar.f11857b;
            jArr[i11 + 1] = cVar.f11858c;
        }
        long[] jArr2 = (long[]) this.f384c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = copyOf;
        Arrays.sort(copyOf);
    }

    public a(za.b bVar, id.h hVar) {
        this.f382a = 5;
        this.f384c = bVar;
        this.d = hVar;
        this.f383b = "firebase-settings.crashlytics.com";
    }

    public a(String str, HashMap hashMap) {
        this.f382a = 0;
        this.f383b = str;
        this.f384c = hashMap;
        this.d = new HashMap();
    }

    public a(String str, j[] jVarArr) {
        this.f382a = 9;
        System.currentTimeMillis();
        this.f383b = str;
        this.f384c = jVarArr;
        this.d = null;
    }

    public a(t0 store, s0 factory, g defaultCreationExtras) {
        this.f382a = 3;
        kotlin.jvm.internal.i.e(store, "store");
        kotlin.jvm.internal.i.e(factory, "factory");
        kotlin.jvm.internal.i.e(defaultCreationExtras, "defaultCreationExtras");
        this.f383b = store;
        this.f384c = factory;
        this.d = defaultCreationExtras;
    }

    public a(t0 store, s0 s0Var) {
        this(store, s0Var, v1.a.f47305b);
        this.f382a = 3;
        kotlin.jvm.internal.i.e(store, "store");
    }

    public a(Context context, TypedArray typedArray) {
        this.f382a = 29;
        this.f383b = context;
        this.f384c = typedArray;
    }

    public a(Context context, LocationManager locationManager) {
        this.f382a = 15;
        this.d = new Object();
        this.f383b = context;
        this.f384c = locationManager;
    }

    public a(androidx.biometric.w wVar) {
        this.f382a = 1;
        this.d = wVar;
    }

    public a(androidx.fragment.app.u owner) {
        this(owner.f(), owner.c(), owner.d());
        this.f382a = 3;
        kotlin.jvm.internal.i.e(owner, "owner");
    }

    public a(c2.h[] hVarArr) {
        this.f382a = 24;
        k2.j0 j0Var = new k2.j0();
        ?? obj = new Object();
        obj.f4210c = 1.0f;
        obj.d = 1.0f;
        c2.f fVar = c2.f.f4179e;
        obj.f4211e = fVar;
        obj.f4212f = fVar;
        obj.f4213g = fVar;
        obj.h = fVar;
        ByteBuffer byteBuffer = c2.h.f4183a;
        obj.f4216k = byteBuffer;
        obj.f4217l = byteBuffer.asShortBuffer();
        obj.f4218m = byteBuffer;
        obj.f4209b = -1;
        c2.h[] hVarArr2 = new c2.h[hVarArr.length + 2];
        this.f383b = hVarArr2;
        System.arraycopy(hVarArr, 0, hVarArr2, 0, hVarArr.length);
        this.f384c = j0Var;
        this.d = obj;
        hVarArr2[hVarArr.length] = j0Var;
        hVarArr2[hVarArr.length + 1] = obj;
    }

    public a(Signature signature) {
        this.f382a = 23;
        this.f383b = signature;
        this.f384c = null;
        this.d = null;
    }

    public a(Cipher cipher) {
        this.f382a = 23;
        this.f384c = cipher;
        this.f383b = null;
        this.d = null;
    }

    public a(Mac mac) {
        this.f382a = 23;
        this.d = mac;
        this.f384c = null;
        this.f383b = null;
    }

    public a(androidx.biometric.s sVar) {
        this.f382a = 2;
        Context context = sVar.f1067a;
        this.f383b = sVar;
        int i10 = Build.VERSION.SDK_INT;
        this.f384c = i10 >= 29 ? androidx.biometric.q.b(context) : null;
        this.d = i10 <= 29 ? new androidx.biometric.s(context, 2) : null;
    }

    public a(m mVar, hc.f fVar, jc.e eVar) {
        hc.e eVar2;
        int i10;
        int i11;
        this.f382a = 22;
        this.d = mVar;
        this.f383b = new ArrayList();
        jc.e eVar3 = eVar;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            eVar2 = hc.e.ECI;
            if (eVar3 == null) {
                break;
            }
            int i14 = eVar3.f13633c;
            int i15 = i12 + eVar3.d;
            jc.e eVar4 = eVar3.f13634e;
            int i16 = i13;
            hc.e eVar5 = eVar3.f13631a;
            boolean z10 = (eVar5 == hc.e.BYTE && eVar4 == null && i14 != 0) || !(eVar4 == null || i14 == eVar4.f13633c);
            i10 = z10 ? 1 : i16;
            if (eVar4 == null || eVar4.f13631a != eVar5 || z10) {
                ((ArrayList) this.f383b).add(0, new jc.f(this, eVar5, eVar3.f13632b, i14, i15));
                i11 = 0;
            } else {
                i11 = i15;
            }
            if (z10) {
                ((ArrayList) this.f383b).add(0, new jc.f(this, eVar2, eVar3.f13632b, eVar3.f13633c, 0));
            }
            i13 = i10;
            eVar3 = eVar4;
            i12 = i11;
        }
        int i17 = i13;
        boolean z11 = mVar.f6398a;
        hc.c cVar = (hc.c) mVar.d;
        if (z11) {
            jc.f fVar2 = (jc.f) ((ArrayList) this.f383b).get(0);
            if (fVar2 != null && fVar2.f13636a != eVar2 && i17 != 0) {
                ((ArrayList) this.f383b).add(0, new jc.f(this, eVar2, 0, 0, 0));
            }
            ((ArrayList) this.f383b).add(((jc.f) ((ArrayList) this.f383b).get(0)).f13636a == eVar2 ? 1 : 0, new jc.f(this, hc.e.FNC1_FIRST_POSITION, 0, 0, 0));
        }
        int i18 = fVar.f10970a;
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
        int v = v(fVar);
        while (i18 < i19 && !jc.c.c(v, hc.f.c(i18), cVar)) {
            i18++;
        }
        while (i18 > i10 && jc.c.c(v, hc.f.c(i18 - 1), cVar)) {
            i18--;
        }
        this.f384c = hc.f.c(i18);
    }

    public a(d7 d7Var, o8 o8Var, Runnable[] runnableArr) {
        this.f382a = 13;
        this.d = d7Var;
        this.f383b = o8Var;
        this.f384c = runnableArr;
    }
}
