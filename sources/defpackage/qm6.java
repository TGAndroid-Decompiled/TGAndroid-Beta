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
public abstract class qm6 extends vg0 {
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
    public final im6 L;
    public boolean L0;
    public final s93 M;
    public boolean M0;
    public final s93 N;
    public e64 N0;
    public final s93 O;
    public p93 O0;
    public final ah0 P;
    public pm6 P0;
    public final MediaCodec.BufferInfo Q;
    public long Q0;
    public final ArrayDeque R;
    public boolean R0;
    public final ir7 S;
    public boolean S0;
    public final AtomicInteger T;
    public boolean T0;
    public ko4 U;
    public long U0;
    public ko4 V;
    public long V0;
    public jr3 W;
    public pk2 W0;
    public jr3 X;
    public pk2 X0;
    public w64 Y;
    public bp5 Y0;
    public MediaCrypto Z;
    public float a0;
    public float b0;
    public jm6 c0;
    public ko4 d0;
    public MediaFormat e0;
    public boolean f0;
    public float g0;
    public ArrayDeque h0;
    public om6 i0;
    public nm6 j0;
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

    public qm6(Context context, int i, im6 im6Var) {
        super(i);
        this.K = context.getApplicationContext();
        this.L = im6Var;
        this.T = new AtomicInteger();
        this.M = new s93(0, 0);
        this.N = new s93(0, 0);
        this.O = new s93(2, 0);
        ?? s93Var = new s93(2, 0);
        s93Var.w = (byte) 32;
        this.P = s93Var;
        this.Q = new MediaCodec.BufferInfo();
        this.a0 = 1.0f;
        this.b0 = 1.0f;
        this.R = new ArrayDeque();
        this.P0 = pm6.i;
        s93Var.c(0);
        s93Var.c.order(ByteOrder.nativeOrder());
        ?? obj = new Object();
        obj.a = q20.a;
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
        int i2 = bp5.c;
        this.Y0 = q99.s;
        pk2 pk2Var = pk2.b;
        this.W0 = pk2Var;
        this.X0 = pk2Var;
    }

    public boolean A0(s93 s93Var) {
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
        e64 e64Var = this.N0;
        if (e64Var == null) {
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
                throw e(e, this.U, false, gcc.A(e.getErrorCode()));
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
                mm6 N = N(e2, this.j0);
                if (N.a == 1101) {
                    i = 4006;
                } else {
                    i = 4003;
                }
                throw e(N, this.U, z, i);
            }
        }
        this.N0 = null;
        throw e64Var;
    }

    public boolean B0() {
        return this.E0;
    }

    public boolean C0(nm6 nm6Var) {
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
            } catch (e64 e) {
                efd.g("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
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

    public boolean E0(ko4 ko4Var) {
        return false;
    }

    public abstract int F0(ko4 ko4Var);

    @Override
    public final int G(ko4 ko4Var) {
        try {
            return F0(ko4Var);
        } catch (tm6 e) {
            throw this.e(e, ko4Var, false, 4002);
        }
    }

    public final void G0(ko4 ko4Var) {
        if (this.c0 != null && this.D0 != 3 && this.n != 0) {
            float f = this.b0;
            ko4Var.getClass();
            ko4[] ko4VarArr = this.s;
            ko4VarArr.getClass();
            float V = V(f, ko4Var, ko4VarArr);
            float f2 = this.g0;
            if (f2 != V && V != -1.0f) {
                if (f2 != -1.0f || V > 0.0f) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", V);
                    jm6 jm6Var = this.c0;
                    jm6Var.getClass();
                    jm6Var.setParameters(bundle);
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
        jr3 jr3Var = this.X;
        jr3Var.getClass();
        or4 h = jr3Var.h();
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
        ko4 ko4Var = (ko4) this.P0.d.j(j);
        if (ko4Var == null && this.R0 && this.e0 != null) {
            ko4Var = (ko4) this.P0.d.i();
        }
        if (ko4Var != null) {
            this.V = ko4Var;
        } else if (!this.f0 || (ko4Var = this.V) == null) {
            return;
        }
        l0(ko4Var, this.e0);
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
        ah0 ah0Var;
        int i;
        int i2;
        int i3;
        byte b;
        yve.p(!this.K0);
        ah0 ah0Var2 = this.P;
        if (ah0Var2.f()) {
            ByteBuffer byteBuffer = ah0Var2.c;
            int i4 = this.u0;
            int i5 = ah0Var2.s;
            long j3 = ah0Var2.e;
            boolean c0 = c0(this.x, ah0Var2.r);
            boolean isEndOfStream = ah0Var2.isEndOfStream();
            ko4 ko4Var = this.V;
            ko4Var.getClass();
            ah0Var = ah0Var2;
            if (r0(j, j2, null, byteBuffer, i4, 0, i5, j3, c0, isEndOfStream, ko4Var)) {
                n0(ah0Var.r);
                ah0Var.clear();
            }
            return false;
        }
        ah0Var = ah0Var2;
        if (this.J0) {
            this.K0 = true;
            return false;
        }
        ?? r1 = 0;
        boolean z = this.y0;
        s93 s93Var = this.O;
        if (z) {
            yve.p(ah0Var.e(s93Var));
            this.y0 = false;
        }
        if (this.z0) {
            if (!ah0Var.f()) {
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
        yve.p(!this.J0);
        ym4 ym4Var = this.c;
        ym4Var.t();
        s93Var.clear();
        while (true) {
            s93Var.clear();
            int A = A(ym4Var, s93Var, r1);
            if (A != -5) {
                if (A != -4) {
                    if (A == -3) {
                        if (m()) {
                            Y().h = this.H0;
                        }
                    } else {
                        grb.g();
                        return r1;
                    }
                } else if (s93Var.isEndOfStream()) {
                    this.J0 = true;
                    Y().h = this.H0;
                    break;
                } else {
                    this.H0 = Math.max(this.H0, s93Var.e);
                    if (m() || this.N.isLastSample()) {
                        Y().h = this.H0;
                    }
                    byte[] bArr = null;
                    if (this.L0) {
                        ko4 ko4Var2 = this.U;
                        ko4Var2.getClass();
                        this.V = ko4Var2;
                        if (Objects.equals(ko4Var2.t, "audio/opus") && !this.V.w.isEmpty()) {
                            byte[] bArr2 = (byte[]) this.V.w.get(r1);
                            int i6 = ((bArr2[11] & 255) << 8) | (bArr2[10] & 255);
                            jo4 a = this.V.a();
                            a.Q = i6;
                            this.V = new ko4(a);
                        }
                        l0(this.V, null);
                        this.L0 = r1;
                    }
                    s93Var.d();
                    ko4 ko4Var3 = this.V;
                    if (ko4Var3 != null && Objects.equals(ko4Var3.t, "audio/opus")) {
                        if (s93Var.hasSupplementalData()) {
                            s93Var.a = this.V;
                            a0(s93Var);
                        }
                        if (this.x - s93Var.e <= 80000) {
                            List list = this.V.w;
                            s93Var.c.getClass();
                            if (s93Var.c.limit() - s93Var.c.position() != 0) {
                                ir7 ir7Var = this.S;
                                if (ir7Var.b == 2 && (list.size() == 1 || list.size() == 3)) {
                                    bArr = (byte[]) list.get(r1);
                                }
                                ByteBuffer byteBuffer2 = s93Var.c;
                                int position = byteBuffer2.position();
                                int limit = byteBuffer2.limit();
                                int i7 = limit - position;
                                int i8 = (i7 + 255) / 255;
                                int i9 = i8 + 27 + i7;
                                if (ir7Var.b == 2) {
                                    if (bArr != null) {
                                        i = bArr.length + 28;
                                    } else {
                                        i = 47;
                                    }
                                    i9 = i + 44 + i9;
                                } else {
                                    i = r1;
                                }
                                if (ir7Var.a.capacity() < i9) {
                                    ir7Var.a = ByteBuffer.allocate(i9).order(ByteOrder.LITTLE_ENDIAN);
                                } else {
                                    ir7Var.a.clear();
                                }
                                ByteBuffer byteBuffer3 = ir7Var.a;
                                if (ir7Var.b == 2) {
                                    if (bArr != null) {
                                        ir7.d(byteBuffer3, 0L, 0, 1, true);
                                        i3 = limit;
                                        byteBuffer3.put(a2f.a(bArr.length));
                                        byteBuffer3.put(bArr);
                                        i2 = position;
                                        byteBuffer3.putInt(22, gcc.p(byteBuffer3.arrayOffset(), bArr.length + 28, 0, byteBuffer3.array()));
                                        byteBuffer3.position(bArr.length + 28);
                                    } else {
                                        i2 = position;
                                        i3 = limit;
                                        byteBuffer3.put(ir7.d);
                                    }
                                    byteBuffer3.put(ir7.e);
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
                                int b3 = ir7Var.c + ((int) ((zue.b(b2, b) * 48000) / 1000000));
                                ir7Var.c = b3;
                                ir7.d(byteBuffer3, b3, ir7Var.b, i8, false);
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
                                if (ir7Var.b == 2) {
                                    byteBuffer3.putInt(i + 66, gcc.p(byteBuffer3.arrayOffset() + i + 44, byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                                } else {
                                    byteBuffer3.putInt(22, gcc.p(byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                                }
                                ir7Var.b++;
                                ir7Var.a = byteBuffer3;
                                s93Var.clear();
                                s93Var.c(ir7Var.a.remaining());
                                s93Var.c.put(ir7Var.a);
                                s93Var.d();
                            }
                        }
                    }
                    if (ah0Var.f()) {
                        long j4 = this.x;
                        if (c0(j4, ah0Var.r) != c0(j4, s93Var.e)) {
                            break;
                        }
                    }
                    if (!ah0Var.e(s93Var)) {
                        break;
                    }
                    r1 = 0;
                }
            } else {
                k0(ym4Var);
                break;
            }
        }
        this.y0 = true;
        if (ah0Var.f()) {
            ah0Var.d();
        }
        if (!ah0Var.f() && !this.J0 && !this.z0) {
            return false;
        }
        return true;
    }

    public abstract w93 M(nm6 nm6Var, ko4 ko4Var, ko4 ko4Var2, boolean z);

    public mm6 N(IllegalStateException illegalStateException, nm6 nm6Var) {
        return new mm6(illegalStateException, nm6Var);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qm6.P(long, long):boolean");
    }

    public final boolean Q() {
        long j;
        long j2;
        long j3;
        pm6 Y = Y();
        at9 at9Var = this.r;
        at9Var.getClass();
        Y.f = at9Var.a();
        jm6 jm6Var = this.c0;
        if (jm6Var != null && this.C0 != 2 && !this.J0) {
            int i = this.t0;
            s93 s93Var = this.N;
            if (i < 0) {
                int g = jm6Var.g();
                this.t0 = g;
                if (g >= 0) {
                    s93Var.c = jm6Var.getInputBuffer(g);
                    s93Var.clear();
                }
            }
            if (this.C0 == 1) {
                if (!this.p0) {
                    this.F0 = true;
                    jm6Var.b(this.t0, 0, 4, 0L);
                    this.t0 = -1;
                    s93Var.c = null;
                }
                this.C0 = (byte) 2;
                return false;
            } else if (this.n0) {
                this.n0 = false;
                ByteBuffer byteBuffer = s93Var.c;
                byteBuffer.getClass();
                byteBuffer.put(Z0);
                jm6Var.b(this.t0, 38, 0, 0L);
                this.t0 = -1;
                s93Var.c = null;
                this.E0 = true;
                return true;
            } else {
                if (this.B0 == 1) {
                    int i2 = 0;
                    while (true) {
                        ko4 ko4Var = this.d0;
                        ko4Var.getClass();
                        if (i2 >= ko4Var.w.size()) {
                            break;
                        }
                        ByteBuffer byteBuffer2 = s93Var.c;
                        byteBuffer2.getClass();
                        byteBuffer2.put((byte[]) this.d0.w.get(i2));
                        i2++;
                    }
                    this.B0 = (byte) 2;
                }
                ByteBuffer byteBuffer3 = s93Var.c;
                byteBuffer3.getClass();
                int position = byteBuffer3.position();
                ym4 ym4Var = this.c;
                ym4Var.t();
                try {
                    jm6Var.i(new u34(this, ym4Var, (byte) 29));
                    int i3 = this.T.get();
                    if (i3 == -3) {
                        if (m()) {
                            pm6 Y2 = Y();
                            pm6 Y3 = Y();
                            pm6 pm6Var = pm6.i;
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
                            s93Var.clear();
                            this.B0 = (byte) 1;
                        }
                        k0(ym4Var);
                        return true;
                    } else if (s93Var.isEndOfStream()) {
                        pm6 Y4 = Y();
                        pm6 Y5 = Y();
                        pm6 pm6Var2 = pm6.i;
                        if ((Y5.f & 1) != 0) {
                            j2 = this.I0;
                        } else {
                            j2 = this.H0;
                        }
                        Y4.h = j2;
                        if (this.B0 == 2) {
                            s93Var.clear();
                            this.B0 = (byte) 1;
                        }
                        this.J0 = true;
                        if (!this.E0) {
                            q0();
                            return false;
                        } else if (!this.p0) {
                            this.F0 = true;
                            jm6Var.b(this.t0, 0, 4, 0L);
                            this.t0 = -1;
                            s93Var.c = null;
                            return false;
                        }
                    } else {
                        if (!this.E0 && !s93Var.isKeyFrame()) {
                            s93Var.clear();
                            this.O0.d++;
                            if (this.B0 == 2) {
                                this.B0 = (byte) 1;
                                return true;
                            }
                        } else {
                            long j4 = s93Var.e;
                            if (!A0(s93Var)) {
                                boolean flag = s93Var.getFlag(1073741824);
                                if (flag) {
                                    g43 g43Var = s93Var.b;
                                    if (position == 0) {
                                        g43Var.getClass();
                                    } else {
                                        int[] iArr = g43Var.d;
                                        if (iArr == null) {
                                            iArr = new int[1];
                                            g43Var.d = iArr;
                                            g43Var.i.numBytesOfClearData = iArr;
                                        }
                                        iArr[0] = iArr[0] + position;
                                    }
                                }
                                if (this.L0) {
                                    pm6 Y6 = Y();
                                    jq jqVar = Y6.d;
                                    ko4 ko4Var2 = this.U;
                                    ko4Var2.getClass();
                                    jqVar.a(j4, ko4Var2);
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
                                if (m() || s93Var.isLastSample()) {
                                    pm6 Y7 = Y();
                                    pm6 Y8 = Y();
                                    pm6 pm6Var3 = pm6.i;
                                    if ((Y8.f & 1) != 0) {
                                        j = this.I0;
                                    } else {
                                        j = this.H0;
                                    }
                                    Y7.h = j;
                                }
                                s93Var.d();
                                if (s93Var.hasSupplementalData()) {
                                    a0(s93Var);
                                }
                                p0(s93Var);
                                int U = U(s93Var);
                                long j8 = j4 + this.U0;
                                int i4 = this.t0;
                                if (flag) {
                                    jm6Var.a(i4, s93Var.b, j8, U);
                                } else {
                                    ByteBuffer byteBuffer4 = s93Var.c;
                                    byteBuffer4.getClass();
                                    jm6Var.b(i4, byteBuffer4.limit(), U, j8);
                                }
                                this.t0 = -1;
                                s93Var.c = null;
                                this.E0 = true;
                                this.B0 = (byte) 0;
                                this.O0.c++;
                                return true;
                            }
                        }
                        return true;
                    }
                } catch (r93 e) {
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
            jm6 jm6Var = this.c0;
            jm6Var.getClass();
            jm6Var.flush();
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
        ko4 ko4Var = this.U;
        ko4Var.getClass();
        ArrayList W = W(ko4Var, z);
        if (W.isEmpty() && z) {
            ArrayList W2 = W(ko4Var, false);
            if (!W2.isEmpty()) {
                efd.f("MediaCodecRenderer", "Drm session requires secure decoder for " + ko4Var.t + ", but no secure decoder available. Trying to proceed with " + W2 + ".");
            }
            return W2;
        }
        return W;
    }

    public int U(s93 s93Var) {
        return 0;
    }

    public float V(float f, ko4 ko4Var, ko4[] ko4VarArr) {
        MediaFormat mediaFormat;
        int i = -1;
        for (ko4 ko4Var2 : ko4VarArr) {
            int i2 = ko4Var2.P;
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

    public abstract ArrayList W(ko4 ko4Var, boolean z);

    public long X(long j, long j2, boolean z) {
        return super.j(j, j2);
    }

    public final pm6 Y() {
        ArrayDeque arrayDeque = this.R;
        if (!arrayDeque.isEmpty()) {
            return (pm6) arrayDeque.getLast();
        }
        return this.P0;
    }

    public abstract fp Z(nm6 nm6Var, ko4 ko4Var, MediaCrypto mediaCrypto, float f);

    public abstract void a0(s93 s93Var);

    public final void b0(defpackage.nm6 r13, android.media.MediaCrypto r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qm6.b0(nm6, android.media.MediaCrypto):void");
    }

    public final boolean c0(long j, long j2) {
        if (j2 < j) {
            ko4 ko4Var = this.V;
            if (ko4Var == null || !Objects.equals(ko4Var.t, "audio/opus") || j - j2 > 80000) {
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
                    bp5 bp5Var = (bp5) obj;
                    if (!this.Y0.equals(bp5Var)) {
                        if (i2 >= 31) {
                            HashSet hashSet = new HashSet(bp5Var);
                            HashSet hashSet2 = new HashSet();
                            v9c n = this.Y0.n();
                            while (n.hasNext()) {
                                String str = (String) n.next();
                                if (!hashSet.remove(str)) {
                                    hashSet2.add(str);
                                }
                            }
                            jm6 jm6Var = this.c0;
                            if (jm6Var != null) {
                                if (!hashSet2.isEmpty()) {
                                    jm6Var.n(new ArrayList(hashSet2));
                                }
                                if (!hashSet.isEmpty()) {
                                    jm6Var.l(new ArrayList(hashSet));
                                }
                            }
                        }
                        this.Y0 = bp5Var;
                        return;
                    }
                    return;
                }
                return;
            } else if (Build.VERSION.SDK_INT >= 29) {
                obj.getClass();
                pk2 pk2Var = (pk2) obj;
                this.W0 = pk2Var;
                jm6 jm6Var2 = this.c0;
                if (jm6Var2 != null) {
                    Bundle bundle = new Bundle();
                    for (Map.Entry entry : pk2Var.a.entrySet()) {
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
                    jm6Var2.setParameters(bundle);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        w64 w64Var = (w64) obj;
        w64Var.getClass();
        this.Y = w64Var;
    }

    public final void d0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qm6.d0():void");
    }

    public final void e0(MediaCrypto mediaCrypto, boolean z) {
        String str;
        ko4 ko4Var = this.U;
        ko4Var.getClass();
        if (this.h0 == null) {
            try {
                List T = T(z);
                this.h0 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) T;
                if (!arrayList.isEmpty()) {
                    this.h0.add((nm6) arrayList.get(0));
                }
                this.i0 = null;
            } catch (tm6 e) {
                throw new om6(ko4Var, e, z, -49998);
            }
        }
        if (!this.h0.isEmpty()) {
            ArrayDeque arrayDeque = this.h0;
            arrayDeque.getClass();
            while (this.c0 == null) {
                nm6 nm6Var = (nm6) arrayDeque.peekFirst();
                nm6Var.getClass();
                if (!f0(ko4Var) || !C0(nm6Var)) {
                    return;
                }
                try {
                    b0(nm6Var, mediaCrypto);
                } catch (Exception e2) {
                    efd.g("MediaCodecRenderer", "Failed to initialize decoder: " + nm6Var, e2);
                    arrayDeque.removeFirst();
                    String str2 = "Decoder init failed: " + nm6Var.a + ", " + ko4Var;
                    String str3 = ko4Var.t;
                    if (e2 instanceof MediaCodec.CodecException) {
                        str = ((MediaCodec.CodecException) e2).getDiagnosticInfo();
                    } else {
                        str = null;
                    }
                    om6 om6Var = new om6(str2, e2, str3, z, nm6Var, str);
                    g0(om6Var);
                    om6 om6Var2 = this.i0;
                    if (om6Var2 == null) {
                        this.i0 = om6Var;
                    } else {
                        this.i0 = new om6(om6Var2.getMessage(), om6Var2.getCause(), om6Var2.a, om6Var2.b, om6Var2.c, om6Var2.d);
                    }
                    if (arrayDeque.isEmpty()) {
                        throw this.i0;
                    }
                }
            }
            this.h0 = null;
            return;
        }
        throw new om6(ko4Var, null, z, -49999);
    }

    public boolean f0(ko4 ko4Var) {
        return true;
    }

    public abstract void g0(Exception exc);

    public abstract void h0(long j, long j2, String str);

    public abstract void i0(pk2 pk2Var);

    @Override
    public final long j(long j, long j2) {
        return X(j, j2, this.r0);
    }

    public abstract void j0(String str);

    public defpackage.w93 k0(defpackage.ym4 r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qm6.k0(ym4):w93");
    }

    public abstract void l0(ko4 ko4Var, MediaFormat mediaFormat);

    public void n0(long j) {
        this.Q0 = Math.max(j, this.Q0);
        while (true) {
            ArrayDeque arrayDeque = this.R;
            if (!arrayDeque.isEmpty() && j >= ((pm6) arrayDeque.peek()).a) {
                pm6 pm6Var = (pm6) arrayDeque.poll();
                pm6Var.getClass();
                z0(pm6Var);
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
        z0(pm6.i);
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

    public abstract boolean r0(long j, long j2, jm6 jm6Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, ko4 ko4Var);

    @Override
    public void s(long j, boolean z, boolean z2) {
        ArrayDeque arrayDeque = this.R;
        if (!arrayDeque.isEmpty()) {
            this.P0 = (pm6) arrayDeque.getLast();
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
        ym4 ym4Var = this.c;
        ym4Var.t();
        s93 s93Var = this.M;
        s93Var.clear();
        int A = A(ym4Var, s93Var, i | 4);
        if (A == -5) {
            k0(ym4Var);
            return true;
        } else if (A == -4 && s93Var.isEndOfStream()) {
            this.J0 = true;
            q0();
            return false;
        } else {
            return false;
        }
    }

    public final void t0() {
        try {
            jm6 jm6Var = this.c0;
            if (jm6Var != null) {
                jm6Var.release();
                this.O0.b++;
                nm6 nm6Var = this.j0;
                nm6Var.getClass();
                j0(nm6Var.a);
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
        ByteBuffer byteBuffer = q20.a;
        ir7 ir7Var = this.S;
        ir7Var.a = byteBuffer;
        ir7Var.c = 0;
        ir7Var.b = 2;
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
    public void y(defpackage.ko4[] r13, long r14, long r16, defpackage.vz6 r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qm6.y(ko4[], long, long, vz6):void");
    }

    public final void y0(jr3 jr3Var) {
        bs2.C(this.W, jr3Var);
        this.W = jr3Var;
    }

    @Override
    public final void z() {
        Y().e = this.I;
    }

    public final void z0(pm6 pm6Var) {
        this.P0 = pm6Var;
        long j = pm6Var.c;
        if (j != -9223372036854775807L) {
            this.R0 = true;
            m0(j);
        }
    }

    public void m0(long j) {
    }

    public void p0(s93 s93Var) {
    }
}
