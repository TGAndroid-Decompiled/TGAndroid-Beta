package cb;

import a8.sa;
import aa.p;
import ai.r0;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Log;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.biometric.g0;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.fragment.app.s;
import androidx.lifecycle.a0;
import bi.n3;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.h1;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.q0;
import com.google.android.gms.internal.cast.t;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d9.o;
import di.pb;
import e5.n;
import f5.g;
import f6.d0;
import f6.e0;
import fi.z3;
import g6.j;
import gb.d1;
import gb.l;
import gb.w0;
import h6.m;
import j$.util.DesugarCollections;
import j6.f;
import j6.x;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import m.i1;
import m.o3;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.qo0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.q11;
import org.telegram.ui.r00;
public final class c implements SuccessContinuation, r0, a0, androidx.activity.result.b, h71, q11, q0, qt0, n, q, qo0, i1, OnCompleteListener, ib.b {
    public static volatile c f5181c;
    public final int f5182a;
    public Object f5183b;

    public c(Object obj, int i7) {
        this.f5182a = i7;
        this.f5183b = obj;
    }

    public static int B(int i7) {
        return C(i7 << 3);
    }

    public static int C(int i7) {
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

    public static int q(CharSequence charSequence) {
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

    public static int v(int i7, String str) {
        int B = B(i7);
        int q10 = q(str);
        return C(q10) + q10 + B;
    }

    public static void x(CharSequence charSequence, ByteBuffer byteBuffer) {
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

    public static int z(long j3) {
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

    @Override
    public void A(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        g0 g0Var = (g0) this.f5183b;
        Handler handler = g0Var.B0;
        sa saVar = g0Var.C0;
        handler.removeCallbacks(saVar);
        TextView textView = g0Var.H0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(saVar, 2000L);
    }

    @Override
    public void D0() {
        z3.h0((z3) this.f5183b);
    }

    @Override
    public void G(boolean z10) {
        pb pbVar = (pb) this.f5183b;
        te.a aVar = pbVar.Z;
        if (aVar != null) {
            aVar.a(z10, true);
        }
        r00 r00Var = pbVar.f51808s;
        if (r00Var != null) {
            r00Var.invalidate();
        }
    }

    @Override
    public float U0() {
        return i5.c.d(9.66f, ri.a.d(((pb) this.f5183b).f9568c0), 0);
    }

    @Override
    public void a(int i7, boolean z10) {
        n3 n3Var = (n3) this.f5183b;
        if (n3Var.f3933m2 == i7) {
            return;
        }
        n3Var.f3933m2 = i7;
        n3Var.f3925e2.g();
        n3Var.U1.O(true);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        x xVar = (x) obj;
        f fVar = (f) xVar.n();
        d0 d0Var = ((e0) this.f5183b).f11413l;
        Parcel p12 = fVar.p1();
        t.d(p12, d0Var);
        fVar.u1(p12, 18);
        f fVar2 = (f) xVar.n();
        fVar2.u1(fVar2.p1(), 17);
        ((TaskCompletionSource) obj2).setResult(null);
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) af.b.b(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f5183b).createWebView(webView));
    }

    @Override
    public String[] d() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f5183b).getSupportedFeatures();
    }

    public void e(StringBuilder sb2, Iterator it) {
        g gVar = (g) this.f5183b;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(g.f(entry.getKey()));
            sb2.append("=");
            sb2.append(g.f(entry.getValue()));
            while (it.hasNext()) {
                sb2.append((CharSequence) gVar.f11318a);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb2.append(g.f(entry2.getKey()));
                sb2.append("=");
                sb2.append(g.f(entry2.getValue()));
            }
        }
    }

    @Override
    public void f(Object obj) {
        Bundle extras;
        switch (this.f5182a) {
            case 7:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                j0 j0Var = (j0) this.f5183b;
                f0 f0Var = (f0) j0Var.F.pollFirst();
                if (f0Var == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                String str = f0Var.f2353a;
                int i7 = f0Var.f2354b;
                s o4 = j0Var.f2367c.o(str);
                if (o4 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                    return;
                }
                o4.x(i7, aVar.f1819a, aVar.f1820b);
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f5183b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.f1820b;
                int i10 = u.e("ProxyBillingActivityV2", intent).f11315a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.O;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i10, extras);
                }
                int i11 = aVar2.f1819a;
                if (i11 != -1 || i10 != 0) {
                    u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    @Override
    public Object mo24get() {
        switch (this.f5182a) {
            case 27:
                return new l((ua.b) ((o) this.f5183b).f7954a);
            default:
                return new w0((d1) ((ib.c) this.f5183b).mo24get());
        }
    }

    @Override
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) af.b.b(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f5183b).getStatics());
    }

    @Override
    public boolean h(int i7) {
        return false;
    }

    @Override
    public void i(n6.a aVar) {
        h1 h1Var = (h1) this.f5183b;
        h1Var.f6324o.lock();
        try {
            h1Var.f6321l = aVar;
            h1Var.j();
        } finally {
            h1Var.f6324o.unlock();
        }
    }

    @Override
    public void j(int i7) {
        n6.a aVar;
        h1 h1Var = (h1) this.f5183b;
        Lock lock = h1Var.f6324o;
        Lock lock2 = h1Var.f6324o;
        lock.lock();
        try {
            if (!h1Var.f6323n && (aVar = h1Var.f6322m) != null && aVar.c()) {
                h1Var.f6323n = true;
                h1Var.f6316e.onConnectionSuspended(i7);
                return;
            }
            h1Var.f6323n = false;
            h1Var.f6314b.j(i7);
            h1Var.f6322m = null;
            h1Var.f6321l = null;
        } finally {
            lock2.unlock();
        }
    }

    @Override
    public int j1() {
        return ((pb) this.f5183b).f9569d0;
    }

    public Set l() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.f5183b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.f5183b);
        }
        return unmodifiableSet;
    }

    @Override
    public void m(Bundle bundle) {
        h1 h1Var = (h1) this.f5183b;
        h1Var.f6324o.lock();
        try {
            Bundle bundle2 = h1Var.f6320k;
            if (bundle2 == null) {
                h1Var.f6320k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            h1Var.f6321l = n6.a.f21448f;
            h1Var.j();
        } finally {
            h1Var.f6324o.unlock();
        }
    }

    public void n() {
        ((androidx.fragment.app.u) this.f5183b).d.R();
    }

    @Override
    public void onComplete(Task task) {
        g6.c.h((g6.c) ((j) this.f5183b).f13259c, "launchApplication", task);
    }

    public void p(m mVar) {
        o3 o3Var = (o3) this.f5183b;
        o3Var.f20190b = mVar;
        Iterator it = ((LinkedList) o3Var.f20191c).iterator();
        while (it.hasNext()) {
            ((a7.c) it.next()).b();
        }
        ((LinkedList) o3Var.f20191c).clear();
    }

    public void r(int i7, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f5183b;
        w(i7, 2);
        try {
            int C = C(str.length());
            if (C == C(str.length() * 3)) {
                int position = byteBuffer.position();
                if (byteBuffer.remaining() >= C) {
                    byteBuffer.position(position + C);
                    x(str, byteBuffer);
                    int position2 = byteBuffer.position();
                    byteBuffer.position(position);
                    u((position2 - position) - C);
                    byteBuffer.position(position2);
                    return;
                }
                throw new androidx.datastore.preferences.protobuf.l(position + C, byteBuffer.limit());
            }
            u(q(str));
            x(str, byteBuffer);
        } catch (BufferOverflowException e10) {
            androidx.datastore.preferences.protobuf.l lVar = new androidx.datastore.preferences.protobuf.l(byteBuffer.position(), byteBuffer.limit());
            lVar.initCause(e10);
            throw lVar;
        }
    }

    public void s(int i7, byte[] bArr) {
        w(i7, 2);
        u(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.f5183b;
        if (byteBuffer.remaining() >= length) {
            byteBuffer.put(bArr, 0, length);
            return;
        }
        throw new androidx.datastore.preferences.protobuf.l(byteBuffer.position(), byteBuffer.limit());
    }

    public void t(int i7) {
        byte b10 = (byte) i7;
        ByteBuffer byteBuffer = (ByteBuffer) this.f5183b;
        if (byteBuffer.hasRemaining()) {
            byteBuffer.put(b10);
            return;
        }
        throw new androidx.datastore.preferences.protobuf.l(byteBuffer.position(), byteBuffer.limit());
    }

    @Override
    public Task then(Object obj) {
        ia.b bVar = (ia.b) obj;
        p pVar = ((aa.n) this.f5183b).f825e;
        if (bVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return Tasks.forResult(null);
        }
        return Tasks.whenAll(p.b(pVar), pVar.f840m.h(null, pVar.f833e.f3107a));
    }

    public void u(int i7) {
        while ((i7 & (-128)) != 0) {
            t((i7 & 127) | 128);
            i7 >>>= 7;
        }
        t(i7);
    }

    public void w(int i7, int i10) {
        u((i7 << 3) | i10);
    }

    public void y(long j3) {
        while (((-128) & j3) != 0) {
            t((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        t((int) j3);
    }

    public c(byte[] bArr, int i7) {
        this.f5182a = 14;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i7);
        this.f5183b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public c(int i7) {
        this.f5182a = i7;
        switch (i7) {
            case 8:
                this.f5183b = new CopyOnWriteArrayList();
                return;
            case 10:
                this.f5183b = new q4.q[cg.b.values().length];
                return;
            case 19:
                return;
            default:
                this.f5183b = new HashSet();
                return;
        }
    }

    public c(aa.n nVar, String str) {
        this.f5182a = 2;
        this.f5183b = nVar;
    }

    @Override
    public void Q() {
    }

    @Override
    public void c() {
    }

    @Override
    public void o() {
    }

    @Override
    public void g(float f10) {
    }

    @Override
    public void k(ArrayList arrayList) {
    }
}
