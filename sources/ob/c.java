package ob;

import a0.h;
import aa.p;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Log;
import android.util.SparseIntArray;
import android.webkit.WebView;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.fragment.app.s;
import androidx.lifecycle.a0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.h1;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.q0;
import com.google.android.gms.internal.cast.t;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d9.o;
import di.lb;
import e5.n;
import f5.g;
import f6.d0;
import f6.e0;
import fi.b4;
import g6.j;
import g9.k;
import gb.d1;
import gb.l;
import gb.w0;
import h9.g1;
import j6.f;
import j6.x;
import java.io.File;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import m.i1;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.ft0;
import org.telegram.ui.l11;
import org.telegram.ui.o00;
public final class c implements a0, androidx.activity.result.b, l11, q0, ft0, n, q, fo0, i1, OnCompleteListener, ib.b, j6.n, g1 {
    public final int f21416a;
    public Object f21417b;

    public c(Object obj, int i7) {
        this.f21416a = i7;
        this.f21417b = obj;
    }

    public static int m(CharSequence charSequence) {
        int length = charSequence.length();
        int i7 = 0;
        int i10 = 0;
        while (i10 < length && charSequence.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
                i10++;
            } else {
                int length2 = charSequence.length();
                while (i10 < length2) {
                    char charAt2 = charSequence.charAt(i10);
                    if (charAt2 < 2048) {
                        i7 += (127 - charAt2) >>> 31;
                    } else {
                        i7 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i10) >= 65536) {
                                i10++;
                            } else {
                                StringBuilder sb2 = new StringBuilder(39);
                                sb2.append("Unpaired surrogate at index ");
                                sb2.append(i10);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                        }
                    }
                    i10++;
                }
                i11 += i7;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        StringBuilder sb3 = new StringBuilder(54);
        sb3.append("UTF-8 length does not fit in int: ");
        sb3.append(i11 + 4294967296L);
        throw new IllegalArgumentException(sb3.toString());
    }

    public static int s(int i7, String str) {
        int x10 = x(i7);
        int m10 = m(str);
        return y(m10) + m10 + x10;
    }

    public static void u(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i7;
        char charAt;
        if (!byteBuffer.isReadOnly()) {
            char c10 = 57343;
            int i10 = 0;
            if (byteBuffer.hasArray()) {
                try {
                    byte[] array = byteBuffer.array();
                    int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    int remaining = byteBuffer.remaining();
                    int length = charSequence.length();
                    int i11 = remaining + arrayOffset;
                    while (i10 < length) {
                        int i12 = i10 + arrayOffset;
                        if (i12 >= i11 || (charAt = charSequence.charAt(i10)) >= 128) {
                            break;
                        }
                        array[i12] = (byte) charAt;
                        i10++;
                    }
                    if (i10 == length) {
                        i7 = arrayOffset + length;
                    } else {
                        i7 = arrayOffset + i10;
                        while (i10 < length) {
                            char charAt2 = charSequence.charAt(i10);
                            if (charAt2 < 128 && i7 < i11) {
                                array[i7] = (byte) charAt2;
                                i7++;
                            } else if (charAt2 < 2048 && i7 <= i11 - 2) {
                                int i13 = i7 + 1;
                                array[i7] = (byte) ((charAt2 >>> 6) | 960);
                                i7 += 2;
                                array[i13] = (byte) ((charAt2 & '?') | 128);
                            } else if ((charAt2 < 55296 || c10 < charAt2) && i7 <= i11 - 3) {
                                array[i7] = (byte) ((charAt2 >>> '\f') | 480);
                                int i14 = i7 + 2;
                                array[i7 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                                i7 += 3;
                                array[i14] = (byte) ((charAt2 & '?') | 128);
                            } else if (i7 <= i11 - 4) {
                                int i15 = i10 + 1;
                                if (i15 != charSequence.length()) {
                                    char charAt3 = charSequence.charAt(i15);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        array[i7] = (byte) ((codePoint >>> 18) | 240);
                                        array[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i16 = i7 + 3;
                                        array[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i7 += 4;
                                        array[i16] = (byte) ((codePoint & 63) | 128);
                                        i10 = i15;
                                    } else {
                                        i10 = i15;
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder(39);
                                sb2.append("Unpaired surrogate at index ");
                                sb2.append(i10 - 1);
                                throw new IllegalArgumentException(sb2.toString());
                            } else {
                                StringBuilder sb3 = new StringBuilder(37);
                                sb3.append("Failed writing ");
                                sb3.append(charAt2);
                                sb3.append(" at index ");
                                sb3.append(i7);
                                throw new ArrayIndexOutOfBoundsException(sb3.toString());
                            }
                            i10++;
                            c10 = 57343;
                        }
                    }
                    byteBuffer.position(i7 - byteBuffer.arrayOffset());
                    return;
                } catch (ArrayIndexOutOfBoundsException e10) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e10);
                    throw bufferOverflowException;
                }
            }
            int length2 = charSequence.length();
            while (i10 < length2) {
                char charAt4 = charSequence.charAt(i10);
                char c11 = charAt4;
                if (charAt4 >= 128) {
                    if (charAt4 < 2048) {
                        byteBuffer.put((byte) ((charAt4 >>> 6) | 960));
                        c11 = (charAt4 & '?') | 128;
                    } else {
                        if (charAt4 >= 55296 && 57343 >= charAt4) {
                            int i17 = i10 + 1;
                            if (i17 != charSequence.length()) {
                                char charAt5 = charSequence.charAt(i17);
                                if (Character.isSurrogatePair(charAt4, charAt5)) {
                                    int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                    byteBuffer.put((byte) ((codePoint2 >>> 18) | 240));
                                    byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                                    byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                                    byteBuffer.put((byte) ((codePoint2 & 63) | 128));
                                    i10 = i17;
                                } else {
                                    i10 = i17;
                                }
                            }
                            StringBuilder sb4 = new StringBuilder(39);
                            sb4.append("Unpaired surrogate at index ");
                            sb4.append(i10 - 1);
                            throw new IllegalArgumentException(sb4.toString());
                        }
                        byteBuffer.put((byte) ((charAt4 >>> '\f') | 480));
                        byteBuffer.put((byte) (((charAt4 >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((charAt4 & '?') | 128));
                        i10++;
                    }
                }
                byteBuffer.put((byte) c11);
                i10++;
            }
            return;
        }
        throw new ReadOnlyBufferException();
    }

    public static int w(long j3) {
        if (((-128) & j3) == 0) {
            return 1;
        }
        if (((-16384) & j3) == 0) {
            return 2;
        }
        if (((-2097152) & j3) == 0) {
            return 3;
        }
        if (((-268435456) & j3) == 0) {
            return 4;
        }
        if (((-34359738368L) & j3) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j3) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j3) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j3) == 0) {
            return 8;
        }
        if ((j3 & Long.MIN_VALUE) == 0) {
            return 9;
        }
        return 10;
    }

    public static int x(int i7) {
        return y(i7 << 3);
    }

    public static int y(int i7) {
        if ((i7 & (-128)) == 0) {
            return 1;
        }
        if ((i7 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i7) == 0) {
            return 3;
        }
        if ((i7 & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    @Override
    public void F(boolean z10) {
        lb lbVar = (lb) this.f21417b;
        te.a aVar = lbVar.Z;
        if (aVar != null) {
            aVar.a(z10, true);
        }
        o00 o00Var = lbVar.f50080s;
        if (o00Var != null) {
            o00Var.invalidate();
        }
    }

    @Override
    public float U0() {
        return i5.c.d(9.66f, ri.a.d(((lb) this.f21417b).f9017c0), 0);
    }

    @Override
    public Object a(Object obj, Object obj2) {
        return ((k) this.f21417b).apply(obj2);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        x xVar = (x) obj;
        f fVar = (f) xVar.n();
        d0 d0Var = ((e0) this.f21417b).f11064l;
        Parcel p12 = fVar.p1();
        t.d(p12, d0Var);
        fVar.u1(p12, 18);
        f fVar2 = (f) xVar.n();
        fVar2.u1(fVar2.p1(), 17);
        ((TaskCompletionSource) obj2).setResult(null);
    }

    @Override
    public String[] b() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f21417b).getSupportedFeatures();
    }

    @Override
    public int b1() {
        return ((lb) this.f21417b).f9018d0;
    }

    public void c(StringBuilder sb2, Iterator it) {
        g gVar = (g) this.f21417b;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(g.f(entry.getKey()));
            sb2.append("=");
            sb2.append(g.f(entry.getValue()));
            while (it.hasNext()) {
                sb2.append((CharSequence) gVar.f10981a);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb2.append(g.f(entry2.getKey()));
                sb2.append("=");
                sb2.append(g.f(entry2.getValue()));
            }
        }
    }

    @Override
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) af.b.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f21417b).createWebView(webView));
    }

    public synchronized void d() {
        ((SharedPreferences) this.f21417b).edit().clear().commit();
    }

    public SparseIntArray e(long j3) {
        return (SparseIntArray) ((h) this.f21417b).f(j3);
    }

    @Override
    public void f(Object obj) {
        Bundle extras;
        switch (this.f21416a) {
            case 6:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                j0 j0Var = (j0) this.f21417b;
                f0 f0Var = (f0) j0Var.F.pollLast();
                if (f0Var == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    return;
                }
                String str = f0Var.f2342a;
                int i7 = f0Var.f2343b;
                s o4 = j0Var.f2356c.o(str);
                if (o4 == null) {
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                    return;
                }
                o4.x(i7, aVar.f1808a, aVar.f1809b);
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f21417b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.f1809b;
                int i10 = u.e("ProxyBillingActivityV2", intent).f10978a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.O;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i10, extras);
                }
                int i11 = aVar2.f1808a;
                if (i11 != -1 || i10 != 0) {
                    u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    @Override
    public void g(n6.a aVar) {
        h1 h1Var = (h1) this.f21417b;
        h1Var.f6012o.lock();
        try {
            h1Var.f6009l = aVar;
            h1Var.j();
        } finally {
            h1Var.f6012o.unlock();
        }
    }

    @Override
    public Object mo24get() {
        switch (this.f21416a) {
            case 26:
                return new l((ua.b) ((o) this.f21417b).f7643b);
            default:
                return new w0((d1) ((ib.c) this.f21417b).mo24get());
        }
    }

    @Override
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) af.b.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f21417b).getStatics());
    }

    @Override
    public void h(String str, long j3, long j10, long j11) {
        h6.o oVar = (h6.o) this.f21417b;
        try {
            oVar.a(new h6.n(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e10) {
            j6.b bVar = h6.h.f13606k;
            Log.e(bVar.f16859a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e10);
        }
        Iterator it = oVar.f13630q.f13613i.iterator();
        while (it.hasNext()) {
            ((h6.g) it.next()).h(str, j3, 2103, j10, j11);
        }
    }

    @Override
    public void i(int i7) {
        n6.a aVar;
        h1 h1Var = (h1) this.f21417b;
        Lock lock = h1Var.f6012o;
        Lock lock2 = h1Var.f6012o;
        lock.lock();
        try {
            if (!h1Var.f6011n && (aVar = h1Var.f6010m) != null && aVar.c()) {
                h1Var.f6011n = true;
                h1Var.f6004e.onConnectionSuspended(i7);
                return;
            }
            h1Var.f6011n = false;
            h1Var.f6002b.i(i7);
            h1Var.f6010m = null;
            h1Var.f6009l = null;
        } finally {
            lock2.unlock();
        }
    }

    @Override
    public void j(Bundle bundle) {
        h1 h1Var = (h1) this.f21417b;
        h1Var.f6012o.lock();
        try {
            Bundle bundle2 = h1Var.f6008k;
            if (bundle2 == null) {
                h1Var.f6008k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            h1Var.f6009l = n6.a.f21056f;
            h1Var.j();
        } finally {
            h1Var.f6012o.unlock();
        }
    }

    @Override
    public void k(java.lang.String r14, long r15, int r17, java.lang.Object r18, long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: ob.c.k(java.lang.String, long, int, java.lang.Object, long, long):void");
    }

    public void l(ia.c cVar, Thread thread, Throwable th2) {
        p pVar = (p) this.f21417b;
        synchronized (pVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            c8.a0.a();
            try {
                aa.f0.a(pVar.f834e.f3093a.b(new aa.n(pVar, System.currentTimeMillis(), th2, thread, cVar)));
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e10);
            }
        }
    }

    public void n(int i7, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f21417b;
        t(i7, 2);
        try {
            int y10 = y(str.length());
            if (y10 == y(str.length() * 3)) {
                int position = byteBuffer.position();
                if (byteBuffer.remaining() >= y10) {
                    byteBuffer.position(position + y10);
                    u(str, byteBuffer);
                    int position2 = byteBuffer.position();
                    byteBuffer.position(position);
                    r((position2 - position) - y10);
                    byteBuffer.position(position2);
                    return;
                }
                throw new androidx.datastore.preferences.protobuf.l(position + y10, byteBuffer.limit());
            }
            r(m(str));
            u(str, byteBuffer);
        } catch (BufferOverflowException e10) {
            androidx.datastore.preferences.protobuf.l lVar = new androidx.datastore.preferences.protobuf.l(byteBuffer.position(), byteBuffer.limit());
            lVar.initCause(e10);
            throw lVar;
        }
    }

    @Override
    public void o(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: ob.c.o(java.lang.Object):void");
    }

    @Override
    public void onComplete(Task task) {
        g6.c.h((g6.c) ((j) this.f21417b).f12913c, "launchApplication", task);
    }

    public void p(int i7, byte[] bArr) {
        t(i7, 2);
        r(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.f21417b;
        if (byteBuffer.remaining() >= length) {
            byteBuffer.put(bArr, 0, length);
            return;
        }
        throw new androidx.datastore.preferences.protobuf.l(byteBuffer.position(), byteBuffer.limit());
    }

    public void q(int i7) {
        byte b10 = (byte) i7;
        ByteBuffer byteBuffer = (ByteBuffer) this.f21417b;
        if (byteBuffer.hasRemaining()) {
            byteBuffer.put(b10);
            return;
        }
        throw new androidx.datastore.preferences.protobuf.l(byteBuffer.position(), byteBuffer.limit());
    }

    public void r(int i7) {
        while ((i7 & (-128)) != 0) {
            q((i7 & 127) | 128);
            i7 >>>= 7;
        }
        q(i7);
    }

    public void t(int i7, int i10) {
        r((i7 << 3) | i10);
    }

    public void v(long j3) {
        while (((-128) & j3) != 0) {
            q((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        q((int) j3);
    }

    @Override
    public void x0() {
        b4.h0((b4) this.f21417b);
    }

    public c(byte[] bArr, int i7) {
        this.f21416a = 13;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i7);
        this.f21417b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public c(Set set) {
        this.f21416a = 0;
        this.f21417b = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            ((HashMap) this.f21417b).put(a.class, bVar.f21415a);
        }
    }

    public c(int i7) {
        this.f21416a = i7;
        switch (i7) {
            case 8:
                this.f21417b = new h();
                return;
            case 9:
                this.f21417b = new q4.q[cg.b.values().length];
                return;
            case 18:
                return;
            default:
                this.f21417b = new LinkedHashMap(0, 0.75f, true);
                return;
        }
    }

    public c(Context context) {
        boolean isEmpty;
        this.f21416a = 2;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f21417b = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                d();
            }
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e10.getMessage());
            }
        }
    }

    @Override
    public void W() {
    }
}
