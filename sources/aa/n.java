package aa;

import a8.ia;
import a8.ra;
import android.content.Intent;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.i0;
import bi.q7;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.f1;
import com.google.android.gms.common.api.internal.o0;
import com.google.android.gms.common.api.internal.p0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import di.k4;
import di.l3;
import di.l9;
import di.m9;
import fi.m0;
import fi.va;
import fi.w5;
import fi.x9;
import fi.y5;
import gb.y0;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import m.j1;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.lc;
import org.telegram.ui.Components.et0;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.cv0;
import org.telegram.ui.n00;
import org.telegram.ui.o11;
import org.telegram.ui.wv0;
import q7.l1;
import q7.m1;
import tg.r1;
public final class n implements androidx.lifecycle.a0, androidx.activity.result.b, et0, lc, o11, o0, l9, WebMessageListenerBoundaryInterface, com.google.android.gms.common.api.internal.p, og.n, tg.c, q51, j1, OnCompleteListener, ib.b {
    public final int f824a;
    public final Object f825b;

    public n(d6.i iVar) {
        this.f824a = 18;
        this.f825b = (com.google.android.gms.internal.play_billing.r) iVar.f8209b;
    }

    public static int A(long j3) {
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

    public static void y(CharSequence charSequence, ByteBuffer byteBuffer) {
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

    @Override
    public void F(boolean z9) {
        switch (this.f824a) {
            case 6:
                te.a aVar = ((bi.z) this.f825b).f5132s;
                if (aVar != null) {
                    aVar.a(z9, true);
                    return;
                }
                return;
            default:
                gi.f fVar = (gi.f) this.f825b;
                te.a aVar2 = fVar.Y;
                if (aVar2 != null) {
                    aVar2.a(z9, true);
                }
                n00 n00Var = fVar.f48198s;
                if (n00Var != null) {
                    n00Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void X(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        androidx.biometric.g0 g0Var = (androidx.biometric.g0) this.f825b;
        Handler handler = g0Var.A0;
        ra raVar = g0Var.B0;
        handler.removeCallbacks(raVar);
        TextView textView = g0Var.G0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(raVar, 2000L);
    }

    @Override
    public float Y0() {
        int d;
        switch (this.f824a) {
            case 6:
                d = oi.a.d(bi.z.f0((bi.z) this.f825b).f15118b);
                break;
            default:
                d = oi.a.d(((gi.f) this.f825b).f13985b0);
                break;
        }
        return jg.g.e(9.66f, d, 0);
    }

    public void a(f3.j jVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f825b;
        long[] jArr = jVar.f11041e;
        if (jArr.length > 0 && !linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            linkedHashMap.put(Long.valueOf(jVar.f11041e[0]), jVar);
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        e7.b bVar = new e7.b(0, (TaskCompletionSource) obj2);
        m1 m1Var = (m1) ((l1) obj).n();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(m1Var.f53912b);
        int i7 = q7.j.f53895a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        ((f7.v) this.f825b).writeToParcel(obtain, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            m1Var.f53911a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    public void c(StringBuilder sb2, Iterator it) {
        g9.l lVar = (g9.l) this.f825b;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(g9.l.f(entry.getKey()));
            sb2.append("=");
            sb2.append(g9.l.f(entry.getValue()));
            while (it.hasNext()) {
                sb2.append((CharSequence) lVar.f13591a);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb2.append(g9.l.f(entry2.getKey()));
                sb2.append("=");
                sb2.append(g9.l.f(entry2.getValue()));
            }
        }
    }

    @Override
    public void d(n6.a aVar) {
        f1 f1Var = (f1) this.f825b;
        f1Var.f6610o.lock();
        try {
            f1Var.f6607l = aVar;
            f1Var.j();
        } finally {
            f1Var.f6610o.unlock();
        }
    }

    @Override
    public void e(long j3, int i7, l3 l3Var) {
        int i10 = ProfileStoriesView.f41975s0;
        ((cv0) this.f825b).f(true, false);
        l3Var.run();
    }

    @Override
    public int e1() {
        switch (this.f824a) {
            case 6:
                return bi.z.g0((bi.z) this.f825b).d;
            default:
                return ((gi.f) this.f825b).f13986c0;
        }
    }

    @Override
    public void f(Object obj) {
        Bundle extras;
        switch (this.f824a) {
            case 4:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                i0 i0Var = (i0) this.f825b;
                androidx.fragment.app.e0 e0Var = (androidx.fragment.app.e0) i0Var.F.pollFirst();
                if (e0Var == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                String str = e0Var.f2384a;
                int i7 = e0Var.f2385b;
                androidx.fragment.app.r o4 = i0Var.f2398c.o(str);
                if (o4 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                    return;
                }
                o4.x(i7, aVar.f1858a, aVar.f1859b);
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f825b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.f1859b;
                int i10 = aVar2.f1858a;
                if (intent == null) {
                    extras = null;
                } else {
                    extras = intent.getExtras();
                }
                if (i10 != -1) {
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i10);
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                    extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i10);
                }
                int i11 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).f11151a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.O;
                if (resultReceiver != null) {
                    resultReceiver.send(i11, extras);
                } else {
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                }
                if (i11 != 0) {
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    @Override
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        zg0 B;
        boolean[] zArr = (boolean[]) this.f825b;
        if (z9 && (B = imageReceiver.B()) != null && !zArr[0]) {
            B.N(0, false, false);
            org.telegram.messenger.g0.h3(new org.telegram.ui.Cells.o0(B, 0));
            zArr[0] = true;
        }
    }

    @Override
    public void g() {
        x9 x9Var = (x9) this.f825b;
        x9Var.A0(null, true);
        if (x9Var.f12551v0) {
            va vaVar = x9Var.f13102j2;
            vaVar.f12944c1.f12365f.d();
            vaVar.k0(-1, false, true);
            x9Var.f12551v0 = false;
        }
        x9Var.L0(false);
    }

    @Override
    public Object mo24get() {
        return new y0((gb.f1) ((ib.c) this.f825b).mo24get());
    }

    @Override
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    public android.support.v4.media.session.a0 h(wf.b r42) {
        throw new UnsupportedOperationException("Method not decompiled: aa.n.h(wf.b):android.support.v4.media.session.a0");
    }

    @Override
    public void i(int i7) {
        n6.a aVar;
        f1 f1Var = (f1) this.f825b;
        Lock lock = f1Var.f6610o;
        Lock lock2 = f1Var.f6610o;
        lock.lock();
        try {
            if (!f1Var.f6609n && (aVar = f1Var.f6608m) != null && aVar.c()) {
                f1Var.f6609n = true;
                f1Var.f6602e.onConnectionSuspended(i7);
                return;
            }
            f1Var.f6609n = false;
            f1Var.f6600b.i(i7);
            f1Var.f6608m = null;
            f1Var.f6607l = null;
        } finally {
            lock2.unlock();
        }
    }

    public boolean j() {
        p0 p0Var = ((com.google.android.gms.common.api.internal.d0) this.f825b).d;
        if (p0Var != null && p0Var.g()) {
            return true;
        }
        return false;
    }

    @Override
    public void k(Bundle bundle) {
        f1 f1Var = (f1) this.f825b;
        f1Var.f6610o.lock();
        try {
            Bundle bundle2 = f1Var.f6606k;
            if (bundle2 == null) {
                f1Var.f6606k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            f1Var.f6607l = n6.a.f20484f;
            f1Var.j();
        } finally {
            f1Var.f6610o.unlock();
        }
    }

    @Override
    public tg.j l() {
        return ((x9) this.f825b).f12545s0;
    }

    public f3.j m() {
        boolean z9;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (f3.j jVar : ((LinkedHashMap) this.f825b).values()) {
            arrayList.add(jVar.f11039b);
            arrayList2.add(jVar.f11040c);
            arrayList3.add(jVar.d);
            arrayList4.add(jVar.f11041e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()]);
        long j3 = 0;
        for (int[] iArr2 : iArr) {
            j3 += iArr2.length;
        }
        int i7 = (int) j3;
        if (j3 == i7) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.d(j3, "the total number of elements (%s) in the arrays must fit in an int", z9);
        int[] iArr3 = new int[i7];
        int i10 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i10, iArr4.length);
            i10 += iArr4.length;
        }
        return new f3.j(iArr3, c8.f1.a((long[][]) arrayList2.toArray(new long[arrayList2.size()])), c8.f1.a((long[][]) arrayList3.toArray(new long[arrayList3.size()])), c8.f1.a((long[][]) arrayList4.toArray(new long[arrayList4.size()])));
    }

    public void n() {
        ((androidx.fragment.app.t) this.f825b).d.R();
    }

    @Override
    public boolean o(long j3, int i7, int i10, int i11, m9 m9Var) {
        ImageReceiver imageReceiver;
        k4 k4Var;
        k4 k4Var2;
        k4 k4Var3;
        k4 k4Var4;
        m9Var.f9363b = null;
        m9Var.f9364c = null;
        cv0 cv0Var = (cv0) this.f825b;
        wv0 wv0Var = cv0Var.h;
        ArrayList arrayList = cv0Var.f42002x;
        if (cv0Var.N < 0.2f) {
            m9Var.f9363b = wv0Var.getImageReceiver();
            m9Var.f9364c = null;
            m9Var.f9362a = wv0Var;
            m9Var.h = 0.0f;
            m9Var.f9368i = org.telegram.messenger.g0.f22544q.y;
            m9Var.f9367g = (View) cv0Var.getParent();
            m9Var.d = cv0Var.D;
            m9Var.f9373n = true;
            return true;
        }
        int i12 = 0;
        while (true) {
            if (i12 < arrayList.size()) {
                k4 k4Var5 = (k4) arrayList.get(i12);
                if (k4Var5.f9289e >= 1.0f && k4Var5.f9286a == i10) {
                    int i13 = i12 - 1;
                    if (i13 >= 0) {
                        k4Var3 = (k4) arrayList.get(i13);
                    } else {
                        k4Var3 = null;
                    }
                    int i14 = i12 - 2;
                    if (i14 >= 0) {
                        k4Var4 = (k4) arrayList.get(i14);
                    } else {
                        k4Var4 = null;
                    }
                    k4 d = ProfileStoriesView.d(k4Var3, k4Var4, k4Var5);
                    imageReceiver = k4Var5.f9287b;
                    k4Var2 = d;
                    k4Var = k4Var5;
                } else {
                    i12++;
                }
            } else {
                imageReceiver = null;
                k4Var = null;
                k4Var2 = null;
                break;
            }
        }
        if (imageReceiver == null) {
            return false;
        }
        m9Var.f9364c = imageReceiver;
        m9Var.f9363b = null;
        m9Var.f9362a = cv0Var;
        m9Var.h = 0.0f;
        m9Var.f9368i = org.telegram.messenger.g0.f22544q.y;
        m9Var.f9367g = (View) cv0Var.getParent();
        if (k4Var != null && k4Var2 != null) {
            m9Var.f9366f = new q7(this, new RectF(k4Var.f9296m), k4Var, new RectF(k4Var2.f9296m), k4Var2);
            return true;
        }
        m9Var.f9366f = null;
        return true;
    }

    @Override
    public void onComplete(Task task) {
        g6.c.h((g6.c) ((g6.j) this.f825b).f13564c, "launchApplication", task);
    }

    @Override
    public void onPostMessage(android.webkit.WebView r8, java.lang.reflect.InvocationHandler r9, android.net.Uri r10, boolean r11, java.lang.reflect.InvocationHandler r12) {
        throw new UnsupportedOperationException("Method not decompiled: aa.n.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z9, int i7) {
        y5 y5Var = (y5) this.f825b;
        w5 w5Var = y5Var.M;
        t51 t51Var = y5Var.f13195y;
        if (t51Var == null) {
            return;
        }
        if (t51Var.d0()) {
            org.telegram.messenger.g0.h3(w5Var);
        } else {
            org.telegram.messenger.g0.r(w5Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        r1 r1Var = ((y5) this.f825b).f13193x;
        if (r1Var != null) {
            float f11 = i7 / i10;
            if (Math.abs(r1Var.f55843y0 - f11) >= 1.0E-4f) {
                r1Var.f55843y0 = f11;
                r1Var.requestLayout();
            }
        }
    }

    public void p(ia.c cVar, Thread thread, Throwable th2) {
        q qVar = (q) this.f825b;
        synchronized (qVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            c8.a0.a();
            try {
                g0.a(qVar.f837e.f3135a.b(new o(qVar, System.currentTimeMillis(), th2, thread, cVar)));
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e10);
            }
        }
    }

    public void r(int i7, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f825b;
        x(i7, 2);
        try {
            int C = C(str.length());
            if (C == C(str.length() * 3)) {
                int position = byteBuffer.position();
                if (byteBuffer.remaining() >= C) {
                    byteBuffer.position(position + C);
                    y(str, byteBuffer);
                    int position2 = byteBuffer.position();
                    byteBuffer.position(position);
                    u((position2 - position) - C);
                    byteBuffer.position(position2);
                    return;
                }
                throw new androidx.datastore.preferences.protobuf.l(position + C, byteBuffer.limit());
            }
            u(q(str));
            y(str, byteBuffer);
        } catch (BufferOverflowException e10) {
            androidx.datastore.preferences.protobuf.l lVar = new androidx.datastore.preferences.protobuf.l(byteBuffer.position(), byteBuffer.limit());
            lVar.initCause(e10);
            throw lVar;
        }
    }

    public void s(int i7, byte[] bArr) {
        x(i7, 2);
        u(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.f825b;
        if (byteBuffer.remaining() >= length) {
            byteBuffer.put(bArr, 0, length);
            return;
        }
        throw new androidx.datastore.preferences.protobuf.l(byteBuffer.position(), byteBuffer.limit());
    }

    public void t(int i7) {
        byte b10 = (byte) i7;
        ByteBuffer byteBuffer = (ByteBuffer) this.f825b;
        if (byteBuffer.hasRemaining()) {
            byteBuffer.put(b10);
            return;
        }
        throw new androidx.datastore.preferences.protobuf.l(byteBuffer.position(), byteBuffer.limit());
    }

    public void u(int i7) {
        while ((i7 & (-128)) != 0) {
            t((i7 & 127) | 128);
            i7 >>>= 7;
        }
        t(i7);
    }

    @Override
    public void w() {
        ((m0) this.f825b).f12395e.invalidate();
    }

    public void x(int i7, int i10) {
        u((i7 << 3) | i10);
    }

    public void z(long j3) {
        while (((-128) & j3) != 0) {
            t((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        t((int) j3);
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public n(e7.a aVar, f7.v vVar) {
        this.f824a = 16;
        this.f825b = vVar;
    }

    public n(Object obj, int i7) {
        this.f824a = i7;
        this.f825b = obj;
    }

    public n(byte[] bArr, int i7) {
        this.f824a = 12;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i7);
        this.f825b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public n(int i7) {
        this.f824a = i7;
        switch (i7) {
            case 8:
                this.f825b = new q4.q[cg.b.values().length];
                return;
            case 17:
                this.f825b = new LinkedHashMap();
                return;
            case 20:
                this.f825b = new g6.d0(2);
                return;
            default:
                this.f825b = new CopyOnWriteArrayList();
                return;
        }
    }

    @Override
    public void c0() {
    }

    @Override
    public void H(boolean z9) {
    }

    @Override
    public void O(ImageReceiver imageReceiver) {
    }

    @Override
    public void Z(boolean z9) {
    }

    @Override
    public void b(boolean z9) {
    }

    @Override
    public void onSeekFinished(m2.a aVar) {
    }

    @Override
    public void onSeekStarted(m2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void onError(t51 t51Var, Exception exc) {
    }

    @Override
    public void t0(int i7, Drawable drawable) {
    }
}
