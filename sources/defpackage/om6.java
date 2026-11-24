package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
public abstract class om6 extends uh0 {
    public static final byte[] Z0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public boolean A0;
    public byte B0;
    public byte C0;
    public byte D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public long H0;
    public long I0;
    public boolean J0;
    public final Context K;
    public boolean K0;
    public final gm6 L;
    public boolean L0;
    public final la3 M;
    public boolean M0;
    public final la3 N;
    public u64 N0;
    public final la3 O;
    public ia3 O0;
    public final zh0 P;
    public nm6 P0;
    public final MediaCodec.BufferInfo Q;
    public long Q0;
    public final ArrayDeque R;
    public boolean R0;
    public final lq7 S;
    public boolean S0;
    public final AtomicInteger T;
    public boolean T0;
    public go4 U;
    public long U0;
    public go4 V;
    public long V0;
    public cs3 W;
    public hl2 W0;
    public cs3 X;
    public hl2 X0;
    public l74 Y;
    public yo5 Y0;
    public MediaCrypto Z;
    public float a0;
    public float b0;
    public hm6 c0;
    public go4 d0;
    public MediaFormat e0;
    public boolean f0;
    public float g0;
    public ArrayDeque h0;
    public mm6 i0;
    public lm6 j0;
    public byte k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public long q0;
    public boolean r0;
    public long s0;
    public int t0;
    public int u0;
    public ByteBuffer v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    public om6(Context context, int i, gm6 gm6Var) {
        super(i);
        this.K = context.getApplicationContext();
        this.L = gm6Var;
        this.T = new AtomicInteger();
        this.M = new la3(0, 0);
        this.N = new la3(0, 0);
        this.O = new la3(2, 0);
        ?? la3Var = new la3(2, 0);
        la3Var.w = (byte) 32;
        this.P = la3Var;
        this.Q = new MediaCodec.BufferInfo();
        this.a0 = 1.0f;
        this.b0 = 1.0f;
        this.R = new ArrayDeque();
        this.P0 = nm6.i;
        la3Var.c(0);
        la3Var.c.order(ByteOrder.nativeOrder());
        ?? obj = new Object();
        obj.a = p30.a;
        obj.c = 0;
        obj.b = 2;
        this.S = obj;
        this.g0 = -1.0f;
        this.k0 = (byte) 0;
        this.B0 = (byte) 0;
        this.t0 = -1;
        this.u0 = -1;
        this.s0 = -9223372036854775807L;
        this.H0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        this.q0 = -9223372036854775807L;
        this.C0 = (byte) 0;
        this.D0 = (byte) 0;
        this.O0 = new Object();
        this.T0 = false;
        this.U0 = 0L;
        this.V0 = -9223372036854775807L;
        int i2 = yo5.c;
        this.Y0 = f89.s;
        hl2 hl2Var = hl2.b;
        this.W0 = hl2Var;
        this.X0 = hl2Var;
    }

    public boolean A0(la3 la3Var) {
        return false;
    }

    @Override
    public void B(long j, long j2) {
        int i;
        boolean z = false;
        if (this.M0) {
            this.M0 = false;
            q0();
        }
        u64 u64Var = this.N0;
        if (u64Var == null) {
            try {
                if (this.K0) {
                    u0();
                    return;
                } else if (this.U == null && !s0(2)) {
                    return;
                } else {
                    d0();
                    if (this.x0) {
                        Trace.beginSection("bypassRender");
                        do {
                        } while (L(j, j2));
                        Trace.endSection();
                    } else if (this.c0 != null) {
                        this.h.getClass();
                        SystemClock.elapsedRealtime();
                        Trace.beginSection("drainAndFeed");
                        do {
                        } while (P(j, j2));
                        do {
                        } while (Q());
                        Trace.endSection();
                    } else {
                        this.O0.d += F(j);
                        s0(1);
                    }
                    synchronized (this.O0) {
                    }
                    return;
                }
            } catch (MediaCodec.CryptoException e) {
                throw e(e, this.U, false, hac.A(e.getErrorCode()));
            } catch (IllegalStateException e2) {
                boolean z2 = e2 instanceof MediaCodec.CodecException;
                if (!z2) {
                    StackTraceElement[] stackTrace = e2.getStackTrace();
                    if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                        throw e2;
                    }
                }
                g0(e2);
                if (z2 && ((MediaCodec.CodecException) e2).isRecoverable()) {
                    z = true;
                }
                if (z) {
                    t0();
                }
                km6 N = N(e2, this.j0);
                if (N.a == 1101) {
                    i = 4006;
                } else {
                    i = 4003;
                }
                throw e(N, this.U, z, i);
            }
        }
        this.N0 = null;
        throw u64Var;
    }

    public boolean B0() {
        return this.E0;
    }

    public boolean C0(lm6 lm6Var) {
        return true;
    }

    public boolean D0() {
        byte b = this.D0;
        if (b == 3 || ((this.l0 && !this.G0) || (this.m0 && (this.F0 || this.C0 == 1)))) {
            return true;
        }
        if (b == 2) {
            try {
                H0();
                return false;
            } catch (u64 e) {
                ncd.g("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                return true;
            }
        }
        return false;
    }

    @Override
    public void E(float f, float f2) {
        this.a0 = f;
        this.b0 = f2;
        G0(this.d0);
    }

    public boolean E0(go4 go4Var) {
        return false;
    }

    public abstract int F0(go4 go4Var);

    @Override
    public final int G(go4 go4Var) {
        try {
            return F0(go4Var);
        } catch (qm6 e) {
            throw this.e(e, go4Var, false, 4002);
        }
    }

    public final void G0(go4 go4Var) {
        if (this.c0 != null && this.D0 != 3 && this.n != 0) {
            float f = this.b0;
            go4Var.getClass();
            go4[] go4VarArr = this.s;
            go4VarArr.getClass();
            float V = V(f, go4Var, go4VarArr);
            float f2 = this.g0;
            if (f2 != V && V != -1.0f) {
                if (f2 != -1.0f || V > 0.0f) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", V);
                    hm6 hm6Var = this.c0;
                    hm6Var.getClass();
                    hm6Var.setParameters(bundle);
                    this.g0 = V;
                }
            }
        }
    }

    @Override
    public final int H() {
        return 8;
    }

    public final void H0() {
        cs3 cs3Var = this.X;
        cs3Var.getClass();
        lr4 h = cs3Var.h();
        if (h != null) {
            try {
                MediaCrypto mediaCrypto = this.Z;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(h.b);
            } catch (MediaCryptoException e) {
                throw e(e, this.U, false, 6006);
            }
        }
        y0(this.X);
        this.C0 = (byte) 0;
        this.D0 = (byte) 0;
    }

    public final void I0(long j) {
        go4 go4Var = (go4) this.P0.d.j(j);
        if (go4Var == null && this.R0 && this.e0 != null) {
            go4Var = (go4) this.P0.d.i();
        }
        if (go4Var != null) {
            this.V = go4Var;
        } else if (!this.f0 || (go4Var = this.V) == null) {
            return;
        }
        l0(go4Var, this.e0);
        this.f0 = false;
        this.R0 = false;
    }

    public final void K(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            for (Map.Entry entry : this.W0.a.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    mediaFormat.setString(str, null);
                } else if (value instanceof Integer) {
                    mediaFormat.setInteger(str, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    mediaFormat.setLong(str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    mediaFormat.setFloat(str, ((Float) value).floatValue());
                } else if (value instanceof String) {
                    mediaFormat.setString(str, (String) value);
                } else if (value instanceof ByteBuffer) {
                    mediaFormat.setByteBuffer(str, (ByteBuffer) value);
                }
            }
        }
    }

    public final boolean L(long j, long j2) {
        zh0 zh0Var;
        int i;
        int i2;
        int i3;
        byte b;
        jte.p(!this.K0);
        zh0 zh0Var2 = this.P;
        if (zh0Var2.f()) {
            ByteBuffer byteBuffer = zh0Var2.c;
            int i4 = this.u0;
            int i5 = zh0Var2.s;
            long j3 = zh0Var2.e;
            boolean c0 = c0(this.x, zh0Var2.r);
            boolean isEndOfStream = zh0Var2.isEndOfStream();
            go4 go4Var = this.V;
            go4Var.getClass();
            zh0Var = zh0Var2;
            if (r0(j, j2, null, byteBuffer, i4, 0, i5, j3, c0, isEndOfStream, go4Var)) {
                n0(zh0Var.r);
                zh0Var.clear();
            }
            return false;
        }
        zh0Var = zh0Var2;
        if (this.J0) {
            this.K0 = true;
            return false;
        }
        ?? r1 = 0;
        boolean z = this.y0;
        la3 la3Var = this.O;
        if (z) {
            jte.p(zh0Var.e(la3Var));
            this.y0 = false;
        }
        if (this.z0) {
            if (!zh0Var.f()) {
                this.x0 = false;
                v0();
                this.z0 = false;
                d0();
                if (!this.x0) {
                    return false;
                }
            } else {
                return true;
            }
        }
        jte.p(!this.J0);
        mj4 mj4Var = this.c;
        mj4Var.i();
        la3Var.clear();
        while (true) {
            la3Var.clear();
            int A = A(mj4Var, la3Var, r1);
            if (A != -5) {
                if (A != -4) {
                    if (A == -3) {
                        if (m()) {
                            Y().h = this.H0;
                        }
                    } else {
                        rjb.h();
                        return r1;
                    }
                } else if (la3Var.isEndOfStream()) {
                    this.J0 = true;
                    Y().h = this.H0;
                    break;
                } else {
                    this.H0 = Math.max(this.H0, la3Var.e);
                    if (m() || this.N.isLastSample()) {
                        Y().h = this.H0;
                    }
                    byte[] bArr = null;
                    if (this.L0) {
                        go4 go4Var2 = this.U;
                        go4Var2.getClass();
                        this.V = go4Var2;
                        if (Objects.equals(go4Var2.t, "audio/opus") && !this.V.w.isEmpty()) {
                            byte[] bArr2 = (byte[]) this.V.w.get(r1);
                            int i6 = ((bArr2[11] & 255) << 8) | (bArr2[10] & 255);
                            fo4 a = this.V.a();
                            a.Q = i6;
                            this.V = new go4(a);
                        }
                        l0(this.V, null);
                        this.L0 = r1;
                    }
                    la3Var.d();
                    go4 go4Var3 = this.V;
                    if (go4Var3 != null && Objects.equals(go4Var3.t, "audio/opus")) {
                        if (la3Var.hasSupplementalData()) {
                            la3Var.a = this.V;
                            a0(la3Var);
                        }
                        if (this.x - la3Var.e <= 80000) {
                            List list = this.V.w;
                            la3Var.c.getClass();
                            if (la3Var.c.limit() - la3Var.c.position() != 0) {
                                lq7 lq7Var = this.S;
                                if (lq7Var.b == 2 && (list.size() == 1 || list.size() == 3)) {
                                    bArr = (byte[]) list.get(r1);
                                }
                                ByteBuffer byteBuffer2 = la3Var.c;
                                int position = byteBuffer2.position();
                                int limit = byteBuffer2.limit();
                                int i7 = limit - position;
                                int i8 = (i7 + 255) / 255;
                                int i9 = i8 + 27 + i7;
                                if (lq7Var.b == 2) {
                                    if (bArr != null) {
                                        i = bArr.length + 28;
                                    } else {
                                        i = 47;
                                    }
                                    i9 = i + 44 + i9;
                                } else {
                                    i = r1;
                                }
                                if (lq7Var.a.capacity() < i9) {
                                    lq7Var.a = ByteBuffer.allocate(i9).order(ByteOrder.LITTLE_ENDIAN);
                                } else {
                                    lq7Var.a.clear();
                                }
                                ByteBuffer byteBuffer3 = lq7Var.a;
                                if (lq7Var.b == 2) {
                                    if (bArr != null) {
                                        lq7.d(byteBuffer3, 0L, 0, 1, true);
                                        i3 = limit;
                                        byteBuffer3.put(ize.a(bArr.length));
                                        byteBuffer3.put(bArr);
                                        i2 = position;
                                        byteBuffer3.putInt(22, hac.p(byteBuffer3.arrayOffset(), bArr.length + 28, 0, byteBuffer3.array()));
                                        byteBuffer3.position(bArr.length + 28);
                                    } else {
                                        i2 = position;
                                        i3 = limit;
                                        byteBuffer3.put(lq7.d);
                                    }
                                    byteBuffer3.put(lq7.e);
                                } else {
                                    i2 = position;
                                    i3 = limit;
                                }
                                byte b2 = byteBuffer2.get(0);
                                if (byteBuffer2.limit() > 1) {
                                    b = byteBuffer2.get(1);
                                } else {
                                    b = 0;
                                }
                                int b3 = lq7Var.c + ((int) ((jse.b(b2, b) * 48000) / 1000000));
                                lq7Var.c = b3;
                                lq7.d(byteBuffer3, b3, lq7Var.b, i8, false);
                                for (int i10 = 0; i10 < i8; i10++) {
                                    if (i7 >= 255) {
                                        byteBuffer3.put((byte) -1);
                                        i7 -= 255;
                                    } else {
                                        byteBuffer3.put((byte) i7);
                                        i7 = 0;
                                    }
                                }
                                int i11 = i3;
                                for (int i12 = i2; i12 < i11; i12++) {
                                    byteBuffer3.put(byteBuffer2.get(i12));
                                }
                                byteBuffer2.position(byteBuffer2.limit());
                                byteBuffer3.flip();
                                if (lq7Var.b == 2) {
                                    byteBuffer3.putInt(i + 66, hac.p(byteBuffer3.arrayOffset() + i + 44, byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                                } else {
                                    byteBuffer3.putInt(22, hac.p(byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                                }
                                lq7Var.b++;
                                lq7Var.a = byteBuffer3;
                                la3Var.clear();
                                la3Var.c(lq7Var.a.remaining());
                                la3Var.c.put(lq7Var.a);
                                la3Var.d();
                            }
                        }
                    }
                    if (zh0Var.f()) {
                        long j4 = this.x;
                        if (c0(j4, zh0Var.r) != c0(j4, la3Var.e)) {
                            break;
                        }
                    }
                    if (!zh0Var.e(la3Var)) {
                        break;
                    }
                    r1 = 0;
                }
            } else {
                k0(mj4Var);
                break;
            }
        }
        this.y0 = true;
        if (zh0Var.f()) {
            zh0Var.d();
        }
        if (!zh0Var.f() && !this.J0 && !this.z0) {
            return false;
        }
        return true;
    }

    public abstract pa3 M(lm6 lm6Var, go4 go4Var, go4 go4Var2, boolean z);

    public km6 N(IllegalStateException illegalStateException, lm6 lm6Var) {
        return new km6(illegalStateException, lm6Var);
    }

    public final boolean O() {
        if (this.E0) {
            this.C0 = (byte) 1;
            if (D0()) {
                this.D0 = (byte) 3;
                return false;
            }
            this.D0 = (byte) 2;
            return true;
        }
        H0();
        return true;
    }

    public final boolean P(long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.om6.P(long, long):boolean");
    }

    public final boolean Q() {
        long j;
        long j2;
        long j3;
        nm6 Y = Y();
        jr9 jr9Var = this.r;
        jr9Var.getClass();
        Y.f = jr9Var.a();
        hm6 hm6Var = this.c0;
        if (hm6Var != null && this.C0 != 2 && !this.J0) {
            int i = this.t0;
            la3 la3Var = this.N;
            if (i < 0) {
                int f = hm6Var.f();
                this.t0 = f;
                if (f >= 0) {
                    la3Var.c = hm6Var.getInputBuffer(f);
                    la3Var.clear();
                }
            }
            if (this.C0 == 1) {
                if (!this.p0) {
                    this.F0 = true;
                    hm6Var.b(this.t0, 0, 4, 0L);
                    this.t0 = -1;
                    la3Var.c = null;
                }
                this.C0 = (byte) 2;
                return false;
            } else if (this.n0) {
                this.n0 = false;
                ByteBuffer byteBuffer = la3Var.c;
                byteBuffer.getClass();
                byteBuffer.put(Z0);
                hm6Var.b(this.t0, 38, 0, 0L);
                this.t0 = -1;
                la3Var.c = null;
                this.E0 = true;
                return true;
            } else {
                if (this.B0 == 1) {
                    int i2 = 0;
                    while (true) {
                        go4 go4Var = this.d0;
                        go4Var.getClass();
                        if (i2 >= go4Var.w.size()) {
                            break;
                        }
                        ByteBuffer byteBuffer2 = la3Var.c;
                        byteBuffer2.getClass();
                        byteBuffer2.put((byte[]) this.d0.w.get(i2));
                        i2++;
                    }
                    this.B0 = (byte) 2;
                }
                ByteBuffer byteBuffer3 = la3Var.c;
                byteBuffer3.getClass();
                int position = byteBuffer3.position();
                mj4 mj4Var = this.c;
                mj4Var.i();
                try {
                    hm6Var.i(new nv4(this, mj4Var, (byte) 25));
                    int i3 = this.T.get();
                    if (i3 == -3) {
                        if (m()) {
                            nm6 Y2 = Y();
                            nm6 Y3 = Y();
                            nm6 nm6Var = nm6.i;
                            if ((Y3.f & 1) != 0) {
                                j3 = this.I0;
                            } else {
                                j3 = this.H0;
                            }
                            Y2.h = j3;
                            return false;
                        }
                    } else if (i3 == -5) {
                        if (this.B0 == 2) {
                            la3Var.clear();
                            this.B0 = (byte) 1;
                        }
                        k0(mj4Var);
                        return true;
                    } else if (la3Var.isEndOfStream()) {
                        nm6 Y4 = Y();
                        nm6 Y5 = Y();
                        nm6 nm6Var2 = nm6.i;
                        if ((Y5.f & 1) != 0) {
                            j2 = this.I0;
                        } else {
                            j2 = this.H0;
                        }
                        Y4.h = j2;
                        if (this.B0 == 2) {
                            la3Var.clear();
                            this.B0 = (byte) 1;
                        }
                        this.J0 = true;
                        if (!this.E0) {
                            q0();
                            return false;
                        } else if (!this.p0) {
                            this.F0 = true;
                            hm6Var.b(this.t0, 0, 4, 0L);
                            this.t0 = -1;
                            la3Var.c = null;
                            return false;
                        }
                    } else {
                        if (!this.E0 && !la3Var.isKeyFrame()) {
                            la3Var.clear();
                            this.O0.d++;
                            if (this.B0 == 2) {
                                this.B0 = (byte) 1;
                                return true;
                            }
                        } else {
                            long j4 = la3Var.e;
                            if (!A0(la3Var)) {
                                boolean flag = la3Var.getFlag(1073741824);
                                if (flag) {
                                    z43 z43Var = la3Var.b;
                                    if (position == 0) {
                                        z43Var.getClass();
                                    } else {
                                        int[] iArr = z43Var.d;
                                        if (iArr == null) {
                                            iArr = new int[1];
                                            z43Var.d = iArr;
                                            z43Var.i.numBytesOfClearData = iArr;
                                        }
                                        iArr[0] = iArr[0] + position;
                                    }
                                }
                                if (this.L0) {
                                    nm6 Y6 = Y();
                                    ir irVar = Y6.d;
                                    go4 go4Var2 = this.U;
                                    go4Var2.getClass();
                                    irVar.a(go4Var2, j4);
                                    Y6.g = true;
                                    this.L0 = false;
                                }
                                if (this.T0) {
                                    long j5 = this.H0;
                                    long j6 = this.U0;
                                    this.V0 = j5 + j6;
                                    if (j4 <= j5) {
                                        this.U0 = (j5 - j4) + 1 + j6;
                                    }
                                    this.H0 = j4;
                                    this.I0 = j4;
                                    this.T0 = false;
                                }
                                this.H0 = Math.max(this.H0, j4);
                                long j7 = this.I;
                                if (j7 == -9223372036854775807L || j4 - Y().c < j7) {
                                    this.I0 = Math.max(this.I0, j4);
                                }
                                if (m() || la3Var.isLastSample()) {
                                    nm6 Y7 = Y();
                                    nm6 Y8 = Y();
                                    nm6 nm6Var3 = nm6.i;
                                    if ((Y8.f & 1) != 0) {
                                        j = this.I0;
                                    } else {
                                        j = this.H0;
                                    }
                                    Y7.h = j;
                                }
                                la3Var.d();
                                if (la3Var.hasSupplementalData()) {
                                    a0(la3Var);
                                }
                                p0(la3Var);
                                int U = U(la3Var);
                                long j8 = j4 + this.U0;
                                int i4 = this.t0;
                                if (flag) {
                                    hm6Var.a(i4, la3Var.b, j8, U);
                                } else {
                                    ByteBuffer byteBuffer4 = la3Var.c;
                                    byteBuffer4.getClass();
                                    hm6Var.b(i4, byteBuffer4.limit(), U, j8);
                                }
                                this.t0 = -1;
                                la3Var.c = null;
                                this.E0 = true;
                                this.B0 = (byte) 0;
                                this.O0.c++;
                                return true;
                            }
                        }
                        return true;
                    }
                } catch (ka3 e) {
                    g0(e);
                    s0(0);
                    R();
                    return true;
                }
            }
        }
        return false;
    }

    public final void R() {
        try {
            hm6 hm6Var = this.c0;
            hm6Var.getClass();
            hm6Var.flush();
        } finally {
            w0();
        }
    }

    public final boolean S() {
        if (this.c0 != null) {
            if (D0()) {
                t0();
                return true;
            } else if (B0()) {
                R();
                return false;
            } else if (this.E0) {
                this.T0 = true;
            }
        }
        return false;
    }

    public final List T(boolean z) {
        go4 go4Var = this.U;
        go4Var.getClass();
        ArrayList W = W(go4Var, z);
        if (W.isEmpty() && z) {
            ArrayList W2 = W(go4Var, false);
            if (!W2.isEmpty()) {
                ncd.f("MediaCodecRenderer", "Drm session requires secure decoder for " + go4Var.t + ", but no secure decoder available. Trying to proceed with " + W2 + ".");
            }
            return W2;
        }
        return W;
    }

    public int U(la3 la3Var) {
        return 0;
    }

    public float V(float f, go4 go4Var, go4[] go4VarArr) {
        MediaFormat mediaFormat;
        int i = -1;
        for (go4 go4Var2 : go4VarArr) {
            int i2 = go4Var2.P;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1 && (mediaFormat = this.e0) != null && mediaFormat.containsKey("sample-rate")) {
            i = mediaFormat.getInteger("sample-rate");
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    public abstract ArrayList W(go4 go4Var, boolean z);

    public long X(long j, long j2, boolean z) {
        return super.j(j, j2);
    }

    public final nm6 Y() {
        ArrayDeque arrayDeque = this.R;
        if (!arrayDeque.isEmpty()) {
            return (nm6) arrayDeque.getLast();
        }
        return this.P0;
    }

    public abstract eq Z(lm6 lm6Var, go4 go4Var, MediaCrypto mediaCrypto, float f);

    public abstract void a0(la3 la3Var);

    public final void b0(defpackage.lm6 r13, android.media.MediaCrypto r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.om6.b0(lm6, android.media.MediaCrypto):void");
    }

    public final boolean c0(long j, long j2) {
        if (j2 < j) {
            go4 go4Var = this.V;
            if (go4Var == null || !Objects.equals(go4Var.t, "audio/opus") || j - j2 > 80000) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void d(int i, Object obj) {
        int i2;
        if (i != 11) {
            if (i != 21) {
                if (i == 22 && (i2 = Build.VERSION.SDK_INT) >= 29) {
                    obj.getClass();
                    yo5 yo5Var = (yo5) obj;
                    if (!this.Y0.equals(yo5Var)) {
                        if (i2 >= 31) {
                            HashSet hashSet = new HashSet(yo5Var);
                            HashSet hashSet2 = new HashSet();
                            v7c n = this.Y0.n();
                            while (n.hasNext()) {
                                String str = (String) n.next();
                                if (!hashSet.remove(str)) {
                                    hashSet2.add(str);
                                }
                            }
                            hm6 hm6Var = this.c0;
                            if (hm6Var != null) {
                                if (!hashSet2.isEmpty()) {
                                    hm6Var.n(new ArrayList(hashSet2));
                                }
                                if (!hashSet.isEmpty()) {
                                    hm6Var.l(new ArrayList(hashSet));
                                }
                            }
                        }
                        this.Y0 = yo5Var;
                        return;
                    }
                    return;
                }
                return;
            } else if (Build.VERSION.SDK_INT >= 29) {
                obj.getClass();
                hl2 hl2Var = (hl2) obj;
                this.W0 = hl2Var;
                hm6 hm6Var2 = this.c0;
                if (hm6Var2 != null) {
                    Bundle bundle = new Bundle();
                    for (Map.Entry entry : hl2Var.a.entrySet()) {
                        String str2 = (String) entry.getKey();
                        Object value = entry.getValue();
                        if (value != null) {
                            if (value instanceof Integer) {
                                bundle.putInt(str2, ((Integer) value).intValue());
                            } else if (value instanceof Long) {
                                bundle.putLong(str2, ((Long) value).longValue());
                            } else if (value instanceof Float) {
                                bundle.putFloat(str2, ((Float) value).floatValue());
                            } else if (value instanceof String) {
                                bundle.putString(str2, (String) value);
                            } else if (value instanceof ByteBuffer) {
                                ByteBuffer byteBuffer = (ByteBuffer) value;
                                byte[] bArr = new byte[byteBuffer.remaining()];
                                byteBuffer.duplicate().get(bArr);
                                bundle.putByteArray(str2, bArr);
                            }
                        }
                    }
                    hm6Var2.setParameters(bundle);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        l74 l74Var = (l74) obj;
        l74Var.getClass();
        this.Y = l74Var;
    }

    public final void d0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.om6.d0():void");
    }

    public final void e0(MediaCrypto mediaCrypto, boolean z) {
        String str;
        go4 go4Var = this.U;
        go4Var.getClass();
        if (this.h0 == null) {
            try {
                List T = T(z);
                this.h0 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) T;
                if (!arrayList.isEmpty()) {
                    this.h0.add((lm6) arrayList.get(0));
                }
                this.i0 = null;
            } catch (qm6 e) {
                throw new mm6(go4Var, e, z, -49998);
            }
        }
        if (!this.h0.isEmpty()) {
            ArrayDeque arrayDeque = this.h0;
            arrayDeque.getClass();
            while (this.c0 == null) {
                lm6 lm6Var = (lm6) arrayDeque.peekFirst();
                lm6Var.getClass();
                if (!f0(go4Var) || !C0(lm6Var)) {
                    return;
                }
                try {
                    b0(lm6Var, mediaCrypto);
                } catch (Exception e2) {
                    ncd.g("MediaCodecRenderer", "Failed to initialize decoder: " + lm6Var, e2);
                    arrayDeque.removeFirst();
                    String str2 = "Decoder init failed: " + lm6Var.a + ", " + go4Var;
                    String str3 = go4Var.t;
                    if (e2 instanceof MediaCodec.CodecException) {
                        str = ((MediaCodec.CodecException) e2).getDiagnosticInfo();
                    } else {
                        str = null;
                    }
                    mm6 mm6Var = new mm6(str2, e2, str3, z, lm6Var, str);
                    g0(mm6Var);
                    mm6 mm6Var2 = this.i0;
                    if (mm6Var2 == null) {
                        this.i0 = mm6Var;
                    } else {
                        this.i0 = new mm6(mm6Var2.getMessage(), mm6Var2.getCause(), mm6Var2.a, mm6Var2.b, mm6Var2.c, mm6Var2.d);
                    }
                    if (arrayDeque.isEmpty()) {
                        throw this.i0;
                    }
                }
            }
            this.h0 = null;
            return;
        }
        throw new mm6(go4Var, null, z, -49999);
    }

    public boolean f0(go4 go4Var) {
        return true;
    }

    public abstract void g0(Exception exc);

    public abstract void h0(long j, String str, long j2);

    public abstract void i0(hl2 hl2Var);

    @Override
    public final long j(long j, long j2) {
        return X(j, j2, this.r0);
    }

    public abstract void j0(String str);

    public defpackage.pa3 k0(defpackage.mj4 r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.om6.k0(mj4):pa3");
    }

    public abstract void l0(go4 go4Var, MediaFormat mediaFormat);

    public void n0(long j) {
        this.Q0 = Math.max(j, this.Q0);
        while (true) {
            ArrayDeque arrayDeque = this.R;
            if (!arrayDeque.isEmpty() && j >= ((nm6) arrayDeque.peek()).a) {
                nm6 nm6Var = (nm6) arrayDeque.poll();
                nm6Var.getClass();
                z0(nm6Var);
                o0();
            } else {
                return;
            }
        }
    }

    public abstract void o0();

    @Override
    public void q() {
        this.U = null;
        z0(nm6.i);
        this.R.clear();
        if (this.x0) {
            this.x0 = false;
            v0();
            return;
        }
        S();
    }

    public final void q0() {
        byte b = this.D0;
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    this.K0 = true;
                    u0();
                    return;
                }
                t0();
                d0();
                return;
            }
            R();
            H0();
            return;
        }
        R();
    }

    public abstract boolean r0(long j, long j2, hm6 hm6Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, go4 go4Var);

    @Override
    public void s(long j, boolean z, boolean z2) {
        ArrayDeque arrayDeque = this.R;
        if (!arrayDeque.isEmpty()) {
            this.P0 = (nm6) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (!z2) {
            return;
        }
        this.J0 = false;
        this.K0 = false;
        this.M0 = false;
        if (this.x0) {
            v0();
        } else if (S()) {
            d0();
        }
        if (this.P0.d.p() > 0) {
            this.L0 = true;
        }
        this.P0.d.c();
        this.P0.g = false;
    }

    public final boolean s0(int i) {
        mj4 mj4Var = this.c;
        mj4Var.i();
        la3 la3Var = this.M;
        la3Var.clear();
        int A = A(mj4Var, la3Var, i | 4);
        if (A == -5) {
            k0(mj4Var);
            return true;
        } else if (A == -4 && la3Var.isEndOfStream()) {
            this.J0 = true;
            q0();
            return false;
        } else {
            return false;
        }
    }

    public final void t0() {
        try {
            hm6 hm6Var = this.c0;
            if (hm6Var != null) {
                hm6Var.release();
                this.O0.b++;
                lm6 lm6Var = this.j0;
                lm6Var.getClass();
                j0(lm6Var.a);
            }
            this.c0 = null;
            MediaCrypto mediaCrypto = this.Z;
            if (mediaCrypto != null) {
                mediaCrypto.release();
            }
        } finally {
            this.Z = null;
            y0(null);
            x0();
        }
    }

    public abstract void u0();

    public final void v0() {
        this.H0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        Y().h = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        this.z0 = false;
        this.P.clear();
        this.O.clear();
        this.y0 = false;
        ByteBuffer byteBuffer = p30.a;
        lq7 lq7Var = this.S;
        lq7Var.a = byteBuffer;
        lq7Var.c = 0;
        lq7Var.b = 2;
    }

    public void w0() {
        this.t0 = -1;
        this.N.c = null;
        this.u0 = -1;
        this.v0 = null;
        this.H0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        Y().h = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        this.s0 = -9223372036854775807L;
        this.F0 = false;
        this.q0 = -9223372036854775807L;
        this.E0 = false;
        this.n0 = false;
        this.o0 = false;
        this.w0 = false;
        this.C0 = (byte) 0;
        this.D0 = (byte) 0;
        this.B0 = this.A0 ? (byte) 1 : (byte) 0;
        this.T0 = false;
        this.U0 = 0L;
        this.V0 = -9223372036854775807L;
    }

    public final void x0() {
        w0();
        this.N0 = null;
        this.h0 = null;
        this.j0 = null;
        this.d0 = null;
        this.e0 = null;
        this.f0 = false;
        this.G0 = false;
        this.g0 = -1.0f;
        this.k0 = (byte) 0;
        this.l0 = false;
        this.m0 = false;
        this.p0 = false;
        this.r0 = false;
        this.A0 = false;
        this.B0 = (byte) 0;
    }

    @Override
    public void y(defpackage.go4[] r13, long r14, long r16, defpackage.rz6 r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.om6.y(go4[], long, long, rz6):void");
    }

    public final void y0(cs3 cs3Var) {
        ts2.B(this.W, cs3Var);
        this.W = cs3Var;
    }

    @Override
    public final void z() {
        Y().e = this.I;
    }

    public final void z0(nm6 nm6Var) {
        this.P0 = nm6Var;
        long j = nm6Var.c;
        if (j != -9223372036854775807L) {
            this.R0 = true;
            m0(j);
        }
    }

    public void m0(long j) {
    }

    public void p0(la3 la3Var) {
    }
}
