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
public abstract class lk6 extends ug0 {
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
    public final dk6 L;
    public boolean L0;
    public final z83 M;
    public boolean M0;
    public final z83 N;
    public j54 N0;
    public final z83 O;
    public w83 O0;
    public final zg0 P;
    public kk6 P0;
    public final MediaCodec.BufferInfo Q;
    public long Q0;
    public final ArrayDeque R;
    public boolean R0;
    public final io7 S;
    public boolean S0;
    public final AtomicInteger T;
    public boolean T0;
    public fm4 U;
    public long U0;
    public fm4 V;
    public long V0;
    public sq3 W;
    public uj2 W0;
    public sq3 X;
    public uj2 X0;
    public c64 Y;
    public ym5 Y0;
    public MediaCrypto Z;
    public float a0;
    public float b0;
    public ek6 c0;
    public fm4 d0;
    public MediaFormat e0;
    public boolean f0;
    public float g0;
    public ArrayDeque h0;
    public jk6 i0;
    public ik6 j0;
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

    public lk6(Context context, int i, dk6 dk6Var) {
        super(i);
        this.K = context.getApplicationContext();
        this.L = dk6Var;
        this.T = new AtomicInteger();
        this.M = new z83(0, 0);
        this.N = new z83(0, 0);
        this.O = new z83(2, 0);
        ?? z83Var = new z83(2, 0);
        z83Var.w = (byte) 32;
        this.P = z83Var;
        this.Q = new MediaCodec.BufferInfo();
        this.a0 = 1.0f;
        this.b0 = 1.0f;
        this.R = new ArrayDeque();
        this.P0 = kk6.i;
        z83Var.c(0);
        z83Var.c.order(ByteOrder.nativeOrder());
        ?? obj = new Object();
        obj.a = p20.a;
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
        int i2 = ym5.c;
        this.Y0 = d69.s;
        uj2 uj2Var = uj2.b;
        this.W0 = uj2Var;
        this.X0 = uj2Var;
    }

    public boolean A0(z83 z83Var) {
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
        j54 j54Var = this.N0;
        if (j54Var == null) {
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
                throw e(e, this.U, false, g8c.A(e.getErrorCode()));
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
                hk6 N = N(e2, this.j0);
                if (N.a == 1101) {
                    i = 4006;
                } else {
                    i = 4003;
                }
                throw e(N, this.U, z, i);
            }
        }
        this.N0 = null;
        throw j54Var;
    }

    public boolean B0() {
        return this.E0;
    }

    public boolean C0(ik6 ik6Var) {
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
            } catch (j54 e) {
                lad.g("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
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

    public boolean E0(fm4 fm4Var) {
        return false;
    }

    public abstract int F0(fm4 fm4Var);

    @Override
    public final int G(fm4 fm4Var) {
        try {
            return F0(fm4Var);
        } catch (nk6 e) {
            throw this.e(e, fm4Var, false, 4002);
        }
    }

    public final void G0(fm4 fm4Var) {
        if (this.c0 != null && this.D0 != 3 && this.n != 0) {
            float f = this.b0;
            fm4Var.getClass();
            fm4[] fm4VarArr = this.s;
            fm4VarArr.getClass();
            float V = V(f, fm4Var, fm4VarArr);
            float f2 = this.g0;
            if (f2 != V && V != -1.0f) {
                if (f2 != -1.0f || V > 0.0f) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", V);
                    ek6 ek6Var = this.c0;
                    ek6Var.getClass();
                    ek6Var.setParameters(bundle);
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
        sq3 sq3Var = this.X;
        sq3Var.getClass();
        kp4 h = sq3Var.h();
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
        fm4 fm4Var = (fm4) this.P0.d.j(j);
        if (fm4Var == null && this.R0 && this.e0 != null) {
            fm4Var = (fm4) this.P0.d.i();
        }
        if (fm4Var != null) {
            this.V = fm4Var;
        } else if (!this.f0 || (fm4Var = this.V) == null) {
            return;
        }
        l0(fm4Var, this.e0);
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
        zg0 zg0Var;
        int i;
        int i2;
        int i3;
        byte b;
        gre.p(!this.K0);
        zg0 zg0Var2 = this.P;
        if (zg0Var2.f()) {
            ByteBuffer byteBuffer = zg0Var2.c;
            int i4 = this.u0;
            int i5 = zg0Var2.s;
            long j3 = zg0Var2.e;
            boolean c0 = c0(this.x, zg0Var2.r);
            boolean isEndOfStream = zg0Var2.isEndOfStream();
            fm4 fm4Var = this.V;
            fm4Var.getClass();
            zg0Var = zg0Var2;
            if (r0(j, j2, null, byteBuffer, i4, 0, i5, j3, c0, isEndOfStream, fm4Var)) {
                n0(zg0Var.r);
                zg0Var.clear();
            }
            return false;
        }
        zg0Var = zg0Var2;
        if (this.J0) {
            this.K0 = true;
            return false;
        }
        ?? r1 = 0;
        boolean z = this.y0;
        z83 z83Var = this.O;
        if (z) {
            gre.p(zg0Var.e(z83Var));
            this.y0 = false;
        }
        if (this.z0) {
            if (!zg0Var.f()) {
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
        gre.p(!this.J0);
        sk4 sk4Var = this.c;
        sk4Var.m();
        z83Var.clear();
        while (true) {
            z83Var.clear();
            int A = A(sk4Var, z83Var, r1);
            if (A != -5) {
                if (A != -4) {
                    if (A == -3) {
                        if (m()) {
                            Y().h = this.H0;
                        }
                    } else {
                        sdb.a();
                        return r1;
                    }
                } else if (z83Var.isEndOfStream()) {
                    this.J0 = true;
                    Y().h = this.H0;
                    break;
                } else {
                    this.H0 = Math.max(this.H0, z83Var.e);
                    if (m() || this.N.isLastSample()) {
                        Y().h = this.H0;
                    }
                    byte[] bArr = null;
                    if (this.L0) {
                        fm4 fm4Var2 = this.U;
                        fm4Var2.getClass();
                        this.V = fm4Var2;
                        if (Objects.equals(fm4Var2.t, "audio/opus") && !this.V.w.isEmpty()) {
                            byte[] bArr2 = (byte[]) this.V.w.get(r1);
                            int i6 = ((bArr2[11] & 255) << 8) | (bArr2[10] & 255);
                            em4 a = this.V.a();
                            a.Q = i6;
                            this.V = new fm4(a);
                        }
                        l0(this.V, null);
                        this.L0 = r1;
                    }
                    z83Var.d();
                    fm4 fm4Var3 = this.V;
                    if (fm4Var3 != null && Objects.equals(fm4Var3.t, "audio/opus")) {
                        if (z83Var.hasSupplementalData()) {
                            z83Var.a = this.V;
                            a0(z83Var);
                        }
                        if (this.x - z83Var.e <= 80000) {
                            List list = this.V.w;
                            z83Var.c.getClass();
                            if (z83Var.c.limit() - z83Var.c.position() != 0) {
                                io7 io7Var = this.S;
                                if (io7Var.b == 2 && (list.size() == 1 || list.size() == 3)) {
                                    bArr = (byte[]) list.get(r1);
                                }
                                ByteBuffer byteBuffer2 = z83Var.c;
                                int position = byteBuffer2.position();
                                int limit = byteBuffer2.limit();
                                int i7 = limit - position;
                                int i8 = (i7 + 255) / 255;
                                int i9 = i8 + 27 + i7;
                                if (io7Var.b == 2) {
                                    if (bArr != null) {
                                        i = bArr.length + 28;
                                    } else {
                                        i = 47;
                                    }
                                    i9 = i + 44 + i9;
                                } else {
                                    i = r1;
                                }
                                if (io7Var.a.capacity() < i9) {
                                    io7Var.a = ByteBuffer.allocate(i9).order(ByteOrder.LITTLE_ENDIAN);
                                } else {
                                    io7Var.a.clear();
                                }
                                ByteBuffer byteBuffer3 = io7Var.a;
                                if (io7Var.b == 2) {
                                    if (bArr != null) {
                                        io7.d(byteBuffer3, 0L, 0, 1, true);
                                        i3 = limit;
                                        byteBuffer3.put(gxe.a(bArr.length));
                                        byteBuffer3.put(bArr);
                                        i2 = position;
                                        byteBuffer3.putInt(22, g8c.p(byteBuffer3.arrayOffset(), bArr.length + 28, 0, byteBuffer3.array()));
                                        byteBuffer3.position(bArr.length + 28);
                                    } else {
                                        i2 = position;
                                        i3 = limit;
                                        byteBuffer3.put(io7.d);
                                    }
                                    byteBuffer3.put(io7.e);
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
                                int b3 = io7Var.c + ((int) ((gqe.b(b2, b) * 48000) / 1000000));
                                io7Var.c = b3;
                                io7.d(byteBuffer3, b3, io7Var.b, i8, false);
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
                                if (io7Var.b == 2) {
                                    byteBuffer3.putInt(i + 66, g8c.p(byteBuffer3.arrayOffset() + i + 44, byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                                } else {
                                    byteBuffer3.putInt(22, g8c.p(byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                                }
                                io7Var.b++;
                                io7Var.a = byteBuffer3;
                                z83Var.clear();
                                z83Var.c(io7Var.a.remaining());
                                z83Var.c.put(io7Var.a);
                                z83Var.d();
                            }
                        }
                    }
                    if (zg0Var.f()) {
                        long j4 = this.x;
                        if (c0(j4, zg0Var.r) != c0(j4, z83Var.e)) {
                            break;
                        }
                    }
                    if (!zg0Var.e(z83Var)) {
                        break;
                    }
                    r1 = 0;
                }
            } else {
                k0(sk4Var);
                break;
            }
        }
        this.y0 = true;
        if (zg0Var.f()) {
            zg0Var.d();
        }
        if (!zg0Var.f() && !this.J0 && !this.z0) {
            return false;
        }
        return true;
    }

    public abstract d93 M(ik6 ik6Var, fm4 fm4Var, fm4 fm4Var2, boolean z);

    public hk6 N(IllegalStateException illegalStateException, ik6 ik6Var) {
        return new hk6(illegalStateException, ik6Var);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk6.P(long, long):boolean");
    }

    public final boolean Q() {
        long j;
        long j2;
        long j3;
        kk6 Y = Y();
        ip9 ip9Var = this.r;
        ip9Var.getClass();
        Y.f = ip9Var.a();
        ek6 ek6Var = this.c0;
        if (ek6Var != null && this.C0 != 2 && !this.J0) {
            int i = this.t0;
            z83 z83Var = this.N;
            if (i < 0) {
                int g = ek6Var.g();
                this.t0 = g;
                if (g >= 0) {
                    z83Var.c = ek6Var.getInputBuffer(g);
                    z83Var.clear();
                }
            }
            if (this.C0 == 1) {
                if (!this.p0) {
                    this.F0 = true;
                    ek6Var.b(this.t0, 0, 4, 0L);
                    this.t0 = -1;
                    z83Var.c = null;
                }
                this.C0 = (byte) 2;
                return false;
            } else if (this.n0) {
                this.n0 = false;
                ByteBuffer byteBuffer = z83Var.c;
                byteBuffer.getClass();
                byteBuffer.put(Z0);
                ek6Var.b(this.t0, 38, 0, 0L);
                this.t0 = -1;
                z83Var.c = null;
                this.E0 = true;
                return true;
            } else {
                if (this.B0 == 1) {
                    int i2 = 0;
                    while (true) {
                        fm4 fm4Var = this.d0;
                        fm4Var.getClass();
                        if (i2 >= fm4Var.w.size()) {
                            break;
                        }
                        ByteBuffer byteBuffer2 = z83Var.c;
                        byteBuffer2.getClass();
                        byteBuffer2.put((byte[]) this.d0.w.get(i2));
                        i2++;
                    }
                    this.B0 = (byte) 2;
                }
                ByteBuffer byteBuffer3 = z83Var.c;
                byteBuffer3.getClass();
                int position = byteBuffer3.position();
                sk4 sk4Var = this.c;
                sk4Var.m();
                try {
                    ek6Var.i(new h45(this, sk4Var, (byte) 24));
                    int i3 = this.T.get();
                    if (i3 == -3) {
                        if (m()) {
                            kk6 Y2 = Y();
                            kk6 Y3 = Y();
                            kk6 kk6Var = kk6.i;
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
                            z83Var.clear();
                            this.B0 = (byte) 1;
                        }
                        k0(sk4Var);
                        return true;
                    } else if (z83Var.isEndOfStream()) {
                        kk6 Y4 = Y();
                        kk6 Y5 = Y();
                        kk6 kk6Var2 = kk6.i;
                        if ((Y5.f & 1) != 0) {
                            j2 = this.I0;
                        } else {
                            j2 = this.H0;
                        }
                        Y4.h = j2;
                        if (this.B0 == 2) {
                            z83Var.clear();
                            this.B0 = (byte) 1;
                        }
                        this.J0 = true;
                        if (!this.E0) {
                            q0();
                            return false;
                        } else if (!this.p0) {
                            this.F0 = true;
                            ek6Var.b(this.t0, 0, 4, 0L);
                            this.t0 = -1;
                            z83Var.c = null;
                            return false;
                        }
                    } else {
                        if (!this.E0 && !z83Var.isKeyFrame()) {
                            z83Var.clear();
                            this.O0.d++;
                            if (this.B0 == 2) {
                                this.B0 = (byte) 1;
                                return true;
                            }
                        } else {
                            long j4 = z83Var.e;
                            if (!A0(z83Var)) {
                                boolean flag = z83Var.getFlag(1073741824);
                                if (flag) {
                                    o33 o33Var = z83Var.b;
                                    if (position == 0) {
                                        o33Var.getClass();
                                    } else {
                                        int[] iArr = o33Var.d;
                                        if (iArr == null) {
                                            iArr = new int[1];
                                            o33Var.d = iArr;
                                            o33Var.i.numBytesOfClearData = iArr;
                                        }
                                        iArr[0] = iArr[0] + position;
                                    }
                                }
                                if (this.L0) {
                                    kk6 Y6 = Y();
                                    iq iqVar = Y6.d;
                                    fm4 fm4Var2 = this.U;
                                    fm4Var2.getClass();
                                    iqVar.a(fm4Var2, j4);
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
                                if (m() || z83Var.isLastSample()) {
                                    kk6 Y7 = Y();
                                    kk6 Y8 = Y();
                                    kk6 kk6Var3 = kk6.i;
                                    if ((Y8.f & 1) != 0) {
                                        j = this.I0;
                                    } else {
                                        j = this.H0;
                                    }
                                    Y7.h = j;
                                }
                                z83Var.d();
                                if (z83Var.hasSupplementalData()) {
                                    a0(z83Var);
                                }
                                p0(z83Var);
                                int U = U(z83Var);
                                long j8 = j4 + this.U0;
                                int i4 = this.t0;
                                if (flag) {
                                    ek6Var.a(i4, z83Var.b, j8, U);
                                } else {
                                    ByteBuffer byteBuffer4 = z83Var.c;
                                    byteBuffer4.getClass();
                                    ek6Var.b(i4, byteBuffer4.limit(), U, j8);
                                }
                                this.t0 = -1;
                                z83Var.c = null;
                                this.E0 = true;
                                this.B0 = (byte) 0;
                                this.O0.c++;
                                return true;
                            }
                        }
                        return true;
                    }
                } catch (y83 e) {
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
            ek6 ek6Var = this.c0;
            ek6Var.getClass();
            ek6Var.flush();
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
        fm4 fm4Var = this.U;
        fm4Var.getClass();
        ArrayList W = W(fm4Var, z);
        if (W.isEmpty() && z) {
            ArrayList W2 = W(fm4Var, false);
            if (!W2.isEmpty()) {
                lad.f("MediaCodecRenderer", "Drm session requires secure decoder for " + fm4Var.t + ", but no secure decoder available. Trying to proceed with " + W2 + ".");
            }
            return W2;
        }
        return W;
    }

    public int U(z83 z83Var) {
        return 0;
    }

    public float V(float f, fm4 fm4Var, fm4[] fm4VarArr) {
        MediaFormat mediaFormat;
        int i = -1;
        for (fm4 fm4Var2 : fm4VarArr) {
            int i2 = fm4Var2.P;
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

    public abstract ArrayList W(fm4 fm4Var, boolean z);

    public long X(long j, long j2, boolean z) {
        return super.j(j, j2);
    }

    public final kk6 Y() {
        ArrayDeque arrayDeque = this.R;
        if (!arrayDeque.isEmpty()) {
            return (kk6) arrayDeque.getLast();
        }
        return this.P0;
    }

    public abstract ep Z(ik6 ik6Var, fm4 fm4Var, MediaCrypto mediaCrypto, float f);

    public abstract void a0(z83 z83Var);

    public final void b0(defpackage.ik6 r13, android.media.MediaCrypto r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk6.b0(ik6, android.media.MediaCrypto):void");
    }

    public final boolean c0(long j, long j2) {
        if (j2 < j) {
            fm4 fm4Var = this.V;
            if (fm4Var == null || !Objects.equals(fm4Var.t, "audio/opus") || j - j2 > 80000) {
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
                    ym5 ym5Var = (ym5) obj;
                    if (!this.Y0.equals(ym5Var)) {
                        if (i2 >= 31) {
                            HashSet hashSet = new HashSet(ym5Var);
                            HashSet hashSet2 = new HashSet();
                            v5c n = this.Y0.n();
                            while (n.hasNext()) {
                                String str = (String) n.next();
                                if (!hashSet.remove(str)) {
                                    hashSet2.add(str);
                                }
                            }
                            ek6 ek6Var = this.c0;
                            if (ek6Var != null) {
                                if (!hashSet2.isEmpty()) {
                                    ek6Var.n(new ArrayList(hashSet2));
                                }
                                if (!hashSet.isEmpty()) {
                                    ek6Var.l(new ArrayList(hashSet));
                                }
                            }
                        }
                        this.Y0 = ym5Var;
                        return;
                    }
                    return;
                }
                return;
            } else if (Build.VERSION.SDK_INT >= 29) {
                obj.getClass();
                uj2 uj2Var = (uj2) obj;
                this.W0 = uj2Var;
                ek6 ek6Var2 = this.c0;
                if (ek6Var2 != null) {
                    Bundle bundle = new Bundle();
                    for (Map.Entry entry : uj2Var.a.entrySet()) {
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
                    ek6Var2.setParameters(bundle);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        c64 c64Var = (c64) obj;
        c64Var.getClass();
        this.Y = c64Var;
    }

    public final void d0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk6.d0():void");
    }

    public final void e0(MediaCrypto mediaCrypto, boolean z) {
        String str;
        fm4 fm4Var = this.U;
        fm4Var.getClass();
        if (this.h0 == null) {
            try {
                List T = T(z);
                this.h0 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) T;
                if (!arrayList.isEmpty()) {
                    this.h0.add((ik6) arrayList.get(0));
                }
                this.i0 = null;
            } catch (nk6 e) {
                throw new jk6(fm4Var, e, z, -49998);
            }
        }
        if (!this.h0.isEmpty()) {
            ArrayDeque arrayDeque = this.h0;
            arrayDeque.getClass();
            while (this.c0 == null) {
                ik6 ik6Var = (ik6) arrayDeque.peekFirst();
                ik6Var.getClass();
                if (!f0(fm4Var) || !C0(ik6Var)) {
                    return;
                }
                try {
                    b0(ik6Var, mediaCrypto);
                } catch (Exception e2) {
                    lad.g("MediaCodecRenderer", "Failed to initialize decoder: " + ik6Var, e2);
                    arrayDeque.removeFirst();
                    String str2 = "Decoder init failed: " + ik6Var.a + ", " + fm4Var;
                    String str3 = fm4Var.t;
                    if (e2 instanceof MediaCodec.CodecException) {
                        str = ((MediaCodec.CodecException) e2).getDiagnosticInfo();
                    } else {
                        str = null;
                    }
                    jk6 jk6Var = new jk6(str2, e2, str3, z, ik6Var, str);
                    g0(jk6Var);
                    jk6 jk6Var2 = this.i0;
                    if (jk6Var2 == null) {
                        this.i0 = jk6Var;
                    } else {
                        this.i0 = new jk6(jk6Var2.getMessage(), jk6Var2.getCause(), jk6Var2.a, jk6Var2.b, jk6Var2.c, jk6Var2.d);
                    }
                    if (arrayDeque.isEmpty()) {
                        throw this.i0;
                    }
                }
            }
            this.h0 = null;
            return;
        }
        throw new jk6(fm4Var, null, z, -49999);
    }

    public boolean f0(fm4 fm4Var) {
        return true;
    }

    public abstract void g0(Exception exc);

    public abstract void h0(long j, String str, long j2);

    public abstract void i0(uj2 uj2Var);

    @Override
    public final long j(long j, long j2) {
        return X(j, j2, this.r0);
    }

    public abstract void j0(String str);

    public defpackage.d93 k0(defpackage.sk4 r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk6.k0(sk4):d93");
    }

    public abstract void l0(fm4 fm4Var, MediaFormat mediaFormat);

    public void n0(long j) {
        this.Q0 = Math.max(j, this.Q0);
        while (true) {
            ArrayDeque arrayDeque = this.R;
            if (!arrayDeque.isEmpty() && j >= ((kk6) arrayDeque.peek()).a) {
                kk6 kk6Var = (kk6) arrayDeque.poll();
                kk6Var.getClass();
                z0(kk6Var);
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
        z0(kk6.i);
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

    public abstract boolean r0(long j, long j2, ek6 ek6Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, fm4 fm4Var);

    @Override
    public void s(long j, boolean z, boolean z2) {
        ArrayDeque arrayDeque = this.R;
        if (!arrayDeque.isEmpty()) {
            this.P0 = (kk6) arrayDeque.getLast();
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
        sk4 sk4Var = this.c;
        sk4Var.m();
        z83 z83Var = this.M;
        z83Var.clear();
        int A = A(sk4Var, z83Var, i | 4);
        if (A == -5) {
            k0(sk4Var);
            return true;
        } else if (A == -4 && z83Var.isEndOfStream()) {
            this.J0 = true;
            q0();
            return false;
        } else {
            return false;
        }
    }

    public final void t0() {
        try {
            ek6 ek6Var = this.c0;
            if (ek6Var != null) {
                ek6Var.release();
                this.O0.b++;
                ik6 ik6Var = this.j0;
                ik6Var.getClass();
                j0(ik6Var.a);
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
        ByteBuffer byteBuffer = p20.a;
        io7 io7Var = this.S;
        io7Var.a = byteBuffer;
        io7Var.c = 0;
        io7Var.b = 2;
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
    public void y(defpackage.fm4[] r13, long r14, long r16, defpackage.rx6 r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk6.y(fm4[], long, long, rx6):void");
    }

    public final void y0(sq3 sq3Var) {
        ir2.C(this.W, sq3Var);
        this.W = sq3Var;
    }

    @Override
    public final void z() {
        Y().e = this.I;
    }

    public final void z0(kk6 kk6Var) {
        this.P0 = kk6Var;
        long j = kk6Var.c;
        if (j != -9223372036854775807L) {
            this.R0 = true;
            m0(j);
        }
    }

    public void m0(long j) {
    }

    public void p0(z83 z83Var) {
    }
}
