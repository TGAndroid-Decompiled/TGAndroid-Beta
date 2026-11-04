package bb;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.fragment.app.s;
import androidx.lifecycle.a0;
import b8.z9;
import ci.v;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.d0;
import com.google.android.gms.common.api.internal.g1;
import com.google.android.gms.common.api.internal.p0;
import com.google.android.gms.common.api.internal.q0;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import db.x0;
import e6.o;
import ei.j4;
import f9.k;
import g2.y;
import g9.e1;
import gi.m0;
import gi.va;
import gi.x9;
import j$.util.DesugarCollections;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import k2.p1;
import m.i1;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ec;
import org.telegram.messenger.g0;
import org.telegram.ui.Cells.o0;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.dt0;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.e11;
import pg.l;
import ug.j;
public final class c implements a0, androidx.activity.result.b, dt0, ec, p0, fb.b, e11, eo0, OnSuccessListener, i1, k, l, ug.c {
    public static volatile c f3209c;
    public final int f3210a;
    public Object f3211b;

    public c(Object obj, int i3) {
        this.f3210a = i3;
        this.f3211b = obj;
    }

    public static int i(CharSequence charSequence) {
        int length = charSequence.length();
        int i3 = 0;
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
                        i3 += (127 - charAt2) >>> 31;
                    } else {
                        i3 += 2;
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
                i11 += i3;
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

    public static int n(int i3, String str) {
        int w10 = w(i3);
        int i10 = i(str);
        return x(i10) + i10 + w10;
    }

    public static void r(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i3;
        char charAt;
        if (!byteBuffer.isReadOnly()) {
            char c2 = 57343;
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
                        i3 = arrayOffset + length;
                    } else {
                        i3 = arrayOffset + i10;
                        while (i10 < length) {
                            char charAt2 = charSequence.charAt(i10);
                            if (charAt2 < 128 && i3 < i11) {
                                array[i3] = (byte) charAt2;
                                i3++;
                            } else if (charAt2 < 2048 && i3 <= i11 - 2) {
                                int i13 = i3 + 1;
                                array[i3] = (byte) ((charAt2 >>> 6) | 960);
                                i3 += 2;
                                array[i13] = (byte) ((charAt2 & '?') | 128);
                            } else if ((charAt2 < 55296 || c2 < charAt2) && i3 <= i11 - 3) {
                                array[i3] = (byte) ((charAt2 >>> '\f') | 480);
                                int i14 = i3 + 2;
                                array[i3 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                                i3 += 3;
                                array[i14] = (byte) ((charAt2 & '?') | 128);
                            } else if (i3 <= i11 - 4) {
                                int i15 = i10 + 1;
                                if (i15 != charSequence.length()) {
                                    char charAt3 = charSequence.charAt(i15);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        array[i3] = (byte) ((codePoint >>> 18) | 240);
                                        array[i3 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i16 = i3 + 3;
                                        array[i3 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i3 += 4;
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
                                sb3.append(i3);
                                throw new ArrayIndexOutOfBoundsException(sb3.toString());
                            }
                            i10++;
                            c2 = 57343;
                        }
                    }
                    byteBuffer.position(i3 - byteBuffer.arrayOffset());
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
                char c10 = charAt4;
                if (charAt4 >= 128) {
                    if (charAt4 < 2048) {
                        byteBuffer.put((byte) ((charAt4 >>> 6) | 960));
                        c10 = (charAt4 & '?') | 128;
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
                byteBuffer.put((byte) c10);
                i10++;
            }
            return;
        }
        throw new ReadOnlyBufferException();
    }

    public static int t(long j10) {
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (((-16384) & j10) == 0) {
            return 2;
        }
        if (((-2097152) & j10) == 0) {
            return 3;
        }
        if (((-268435456) & j10) == 0) {
            return 4;
        }
        if (((-34359738368L) & j10) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j10) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j10) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j10) == 0) {
            return 8;
        }
        if ((j10 & Long.MIN_VALUE) == 0) {
            return 9;
        }
        return 10;
    }

    public static int w(int i3) {
        return x(i3 << 3);
    }

    public static int x(int i3) {
        if ((i3 & (-128)) == 0) {
            return 1;
        }
        if ((i3 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i3) == 0) {
            return 3;
        }
        if ((i3 & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    @Override
    public void C0() {
        j4.h0((j4) this.f3211b);
    }

    @Override
    public void F(boolean z10) {
        qe.a aVar = ((v) this.f3211b).f6154s;
        if (aVar != null) {
            aVar.a(z10, true);
        }
    }

    @Override
    public void a(m6.a aVar) {
        g1 g1Var = (g1) this.f3211b;
        g1Var.f6687o.lock();
        try {
            g1Var.f6684l = aVar;
            g1Var.j();
        } finally {
            g1Var.f6687o.unlock();
        }
    }

    @Override
    public Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        g9.g1 g1Var = (g9.g1) this.f3211b;
        g1Var.getClass();
        entry.getClass();
        return new e1(entry, g1Var);
    }

    public o b() {
        o oVar = (o) this.f3211b;
        if (oVar.f9744a != null) {
            if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
                throw new IllegalArgumentException("startTime cannot be negative or NaN.");
            }
            if (!Double.isNaN(oVar.f9747e)) {
                if (!Double.isNaN(oVar.f9748f) && oVar.f9748f >= 0.0d) {
                    return oVar;
                }
                throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
            }
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public Set c() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.f3211b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.f3211b);
        }
        return unmodifiableSet;
    }

    @Override
    public void d(int i3) {
        m6.a aVar;
        g1 g1Var = (g1) this.f3211b;
        Lock lock = g1Var.f6687o;
        Lock lock2 = g1Var.f6687o;
        lock.lock();
        try {
            if (!g1Var.f6686n && (aVar = g1Var.f6685m) != null && aVar.c()) {
                g1Var.f6686n = true;
                g1Var.f6679e.onConnectionSuspended(i3);
                return;
            }
            g1Var.f6686n = false;
            g1Var.f6677b.d(i3);
            g1Var.f6685m = null;
            g1Var.f6684l = null;
        } finally {
            lock2.unlock();
        }
    }

    public boolean e() {
        q0 q0Var = ((d0) this.f3211b).d;
        if (q0Var != null && q0Var.f()) {
            return true;
        }
        return false;
    }

    @Override
    public void f() {
        x9 x9Var = (x9) this.f3211b;
        x9Var.A0(null, true);
        if (x9Var.f13235w0) {
            va vaVar = x9Var.f13872k2;
            vaVar.f13710d1.f13144f.d();
            vaVar.k0(-1, false, true);
            x9Var.f13235w0 = false;
        }
        x9Var.L0(false);
    }

    @Override
    public void g(Object obj) {
        Bundle extras;
        switch (this.f3210a) {
            case 5:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                j0 j0Var = (j0) this.f3211b;
                f0 f0Var = (f0) j0Var.F.pollLast();
                if (f0Var == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    return;
                }
                String str = f0Var.f1814a;
                int i3 = f0Var.f1815b;
                s n4 = j0Var.f1828c.n(str);
                if (n4 == null) {
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                    return;
                }
                n4.x(i3, aVar.f1281a, aVar.f1282b);
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f3211b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.f1282b;
                int i10 = u.e("ProxyBillingActivityV2", intent).f9593a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.N;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i10, extras);
                }
                int i11 = aVar2.f1281a;
                if (i11 != -1 || i10 != 0) {
                    u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i11 + " and billing's responseCode: " + i10);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    @Override
    public Object mo5get() {
        switch (this.f3210a) {
            case 15:
                return new db.l((ta.b) ((e.a) this.f3211b).f9205a);
            default:
                return new x0((db.e1) ((fb.c) this.f3211b).mo5get());
        }
    }

    public d2.s0 h(e3.p r12, s3.g r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: bb.c.h(e3.p, s3.g, int):d2.s0");
    }

    @Override
    public float h1() {
        return p1.d(9.66f, pi.a.d(v.f0((v) this.f3211b).f14496b), 0);
    }

    public void j(int i3, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f3211b;
        q(i3, 2);
        try {
            int x10 = x(str.length());
            if (x10 == x(str.length() * 3)) {
                int position = byteBuffer.position();
                if (byteBuffer.remaining() >= x10) {
                    byteBuffer.position(position + x10);
                    r(str, byteBuffer);
                    int position2 = byteBuffer.position();
                    byteBuffer.position(position);
                    m((position2 - position) - x10);
                    byteBuffer.position(position2);
                    return;
                }
                throw new androidx.datastore.preferences.protobuf.l(position + x10, byteBuffer.limit());
            }
            m(i(str));
            r(str, byteBuffer);
        } catch (BufferOverflowException e10) {
            androidx.datastore.preferences.protobuf.l lVar = new androidx.datastore.preferences.protobuf.l(byteBuffer.position(), byteBuffer.limit());
            lVar.initCause(e10);
            throw lVar;
        }
    }

    public void k(int i3, byte[] bArr) {
        q(i3, 2);
        m(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.f3211b;
        if (byteBuffer.remaining() >= length) {
            byteBuffer.put(bArr, 0, length);
            return;
        }
        throw new androidx.datastore.preferences.protobuf.l(byteBuffer.position(), byteBuffer.limit());
    }

    public void l(int i3) {
        byte b10 = (byte) i3;
        ByteBuffer byteBuffer = (ByteBuffer) this.f3211b;
        if (byteBuffer.hasRemaining()) {
            byteBuffer.put(b10);
            return;
        }
        throw new androidx.datastore.preferences.protobuf.l(byteBuffer.position(), byteBuffer.limit());
    }

    @Override
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ch0 B;
        boolean[] zArr = (boolean[]) this.f3211b;
        if (z10 && (B = imageReceiver.B()) != null && !zArr[0]) {
            B.N(0, false, false);
            g0.h3(new o0(B, 0));
            zArr[0] = true;
        }
    }

    public void m(int i3) {
        while ((i3 & (-128)) != 0) {
            l((i3 & 127) | 128);
            i3 >>>= 7;
        }
        l(i3);
    }

    @Override
    public int m1() {
        return v.g0((v) this.f3211b).d;
    }

    @Override
    public void o(Bundle bundle) {
        g1 g1Var = (g1) this.f3211b;
        g1Var.f6687o.lock();
        try {
            Bundle bundle2 = g1Var.f6683k;
            if (bundle2 == null) {
                g1Var.f6683k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            g1Var.f6684l = m6.a.f19175f;
            g1Var.j();
        } finally {
            g1Var.f6687o.unlock();
        }
    }

    @Override
    public void onSuccess(Object obj) {
        ((f6.a) this.f3211b).getClass();
        z9.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override
    public j p() {
        return ((x9) this.f3211b).f13229t0;
    }

    public void q(int i3, int i10) {
        m((i3 << 3) | i10);
    }

    public void s(long j10) {
        while (((-128) & j10) != 0) {
            l((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        l((int) j10);
    }

    @Override
    public void u() {
        ((m0) this.f3211b).f13174e.invalidate();
    }

    @Override
    public void v(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: bb.c.v(java.lang.Object):void");
    }

    public c(byte[] bArr, int i3) {
        this.f3210a = 13;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i3);
        this.f3211b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public c(MediaInfo mediaInfo) {
        this.f3210a = 21;
        o oVar = new o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.f3211b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public c(JSONObject jSONObject) {
        this.f3210a = 21;
        this.f3211b = new o(jSONObject);
    }

    public c(int i3) {
        this.f3210a = i3;
        switch (i3) {
            case 1:
                this.f3211b = new CopyOnWriteArrayList();
                return;
            case 6:
                this.f3211b = new LinkedHashMap(0, 0.75f, true);
                return;
            case 14:
                return;
            case 17:
                this.f3211b = new tf.b[dg.b.values().length];
                return;
            case 19:
                this.f3211b = new y(10);
                return;
            default:
                this.f3211b = new HashSet();
                return;
        }
    }

    @Override
    public void S() {
    }

    @Override
    public void W() {
    }

    @Override
    public void A(boolean z10) {
    }

    @Override
    public void D(ImageReceiver imageReceiver) {
    }

    @Override
    public void Q(boolean z10) {
    }

    @Override
    public void F0(int i3, Drawable drawable) {
    }
}
