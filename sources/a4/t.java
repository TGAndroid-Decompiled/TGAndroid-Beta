package a4;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import f5.d0;
import j3.t0;
import j3.u0;
import j7.l1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
public abstract class t extends j3.e {
    public static final byte[] D0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public t0 A;
    public long A0;
    public n3.e B;
    public long B0;
    public n3.e C;
    public int C0;
    public MediaCrypto D;
    public boolean E;
    public final long F;
    public float G;
    public float H;
    public n I;
    public t0 J;
    public MediaFormat K;
    public boolean L;
    public float M;
    public ArrayDeque N;
    public s O;
    public q P;
    public int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final m f113a;
    public boolean f114a0;
    public final u f115b;
    public j f116b0;
    public final float f117c;
    public long f118c0;
    public final m3.i d;
    public int f119d0;
    public final m3.i f120e;
    public int f121e0;
    public final m3.i f122f;
    public ByteBuffer f123f0;
    public boolean f124g0;
    public final i h;
    public boolean f125h0;
    public boolean f126i0;
    public boolean f127j0;
    public boolean f128k0;
    public boolean f129l0;
    public int m0;
    public final f5.b0 f130n;
    public int f131n0;
    public int f132o0;
    public boolean f133p0;
    public boolean f134q0;
    public final ArrayList f135r;
    public boolean f136r0;
    public final MediaCodec.BufferInfo f137s;
    public long f138s0;
    public long f139t0;
    public boolean f140u0;
    public final long[] v;
    public boolean f141v0;
    public final long[] f142w;
    public boolean f143w0;
    public final long[] f144x;
    public boolean f145x0;
    public t0 f146y;
    public j3.n f147y0;
    public m3.f f148z0;

    public t(int i10, m mVar, float f9) {
        super(i10);
        this.f113a = mVar;
        this.f115b = u.f149b;
        this.f117c = f9;
        this.d = new m3.i(0, 0);
        this.f120e = new m3.i(0, 0);
        this.f122f = new m3.i(2, 0);
        ?? iVar = new m3.i(2, 0);
        iVar.f91s = 32;
        this.h = iVar;
        ?? obj = new Object();
        obj.f6574c = new long[10];
        obj.d = new Object[10];
        this.f130n = obj;
        this.f135r = new ArrayList();
        this.f137s = new MediaCodec.BufferInfo();
        this.G = 1.0f;
        this.H = 1.0f;
        this.F = -9223372036854775807L;
        this.v = new long[10];
        this.f142w = new long[10];
        this.f144x = new long[10];
        this.A0 = -9223372036854775807L;
        J(-9223372036854775807L);
        iVar.b(0);
        iVar.f16828b.order(ByteOrder.nativeOrder());
        this.M = -1.0f;
        this.Q = 0;
        this.m0 = 0;
        this.f119d0 = -1;
        this.f121e0 = -1;
        this.f118c0 = -9223372036854775807L;
        this.f138s0 = -9223372036854775807L;
        this.f139t0 = -9223372036854775807L;
        this.f131n0 = 0;
        this.f132o0 = 0;
    }

    public abstract void A();

    public final void B() {
        int i10 = this.f132o0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    this.f141v0 = true;
                    F();
                    return;
                }
                E();
                r();
                return;
            }
            h();
            O();
            return;
        }
        h();
    }

    public abstract boolean C(long j10, long j11, n nVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, t0 t0Var);

    public final boolean D(int i10) {
        u0 formatHolder = getFormatHolder();
        m3.i iVar = this.d;
        iVar.clear();
        int readSource = readSource(formatHolder, iVar, i10 | 4);
        if (readSource == -5) {
            w(formatHolder);
            return true;
        } else if (readSource == -4 && iVar.isEndOfStream()) {
            this.f140u0 = true;
            B();
            return false;
        } else {
            return false;
        }
    }

    public final void E() {
        try {
            n nVar = this.I;
            if (nVar != null) {
                nVar.release();
                this.f148z0.f16818b++;
                v(this.P.f104a);
            }
            this.I = null;
            try {
                MediaCrypto mediaCrypto = this.D;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.I = null;
            try {
                MediaCrypto mediaCrypto2 = this.D;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    public void G() {
        this.f119d0 = -1;
        this.f120e.f16828b = null;
        this.f121e0 = -1;
        this.f123f0 = null;
        this.f118c0 = -9223372036854775807L;
        this.f134q0 = false;
        this.f133p0 = false;
        this.Y = false;
        this.Z = false;
        this.f124g0 = false;
        this.f125h0 = false;
        this.f135r.clear();
        this.f138s0 = -9223372036854775807L;
        this.f139t0 = -9223372036854775807L;
        j jVar = this.f116b0;
        if (jVar != null) {
            jVar.f92a = 0L;
            jVar.f93b = 0L;
            jVar.f94c = false;
        }
        this.f131n0 = 0;
        this.f132o0 = 0;
        this.m0 = this.f129l0 ? 1 : 0;
    }

    public final void H() {
        G();
        this.f147y0 = null;
        this.f116b0 = null;
        this.N = null;
        this.P = null;
        this.J = null;
        this.K = null;
        this.L = false;
        this.f136r0 = false;
        this.M = -1.0f;
        this.Q = 0;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.f114a0 = false;
        this.f129l0 = false;
        this.m0 = 0;
        this.E = false;
    }

    public final void I(n3.e eVar) {
        l1.D(this.B, eVar);
        this.B = eVar;
    }

    public final void J(long j10) {
        this.B0 = j10;
        if (j10 != -9223372036854775807L) {
            y();
        }
    }

    public boolean K(q qVar) {
        return true;
    }

    public boolean L(t0 t0Var) {
        return false;
    }

    public abstract int M(u uVar, t0 t0Var);

    public final boolean N(t0 t0Var) {
        if (d0.f6579a >= 23 && this.I != null && this.f132o0 != 3 && getState() != 0) {
            float l10 = l(this.H, getStreamFormats());
            float f9 = this.M;
            if (f9 != l10) {
                if (l10 == -1.0f) {
                    if (this.f133p0) {
                        this.f131n0 = 1;
                        this.f132o0 = 3;
                        return false;
                    }
                    E();
                    r();
                    return false;
                } else if (f9 != -1.0f || l10 > this.f117c) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", l10);
                    this.I.setParameters(bundle);
                    this.M = l10;
                }
            }
        }
        return true;
    }

    public final void O() {
        try {
            MediaCrypto mediaCrypto = this.D;
            n(this.C).getClass();
            mediaCrypto.setMediaDrmSession(null);
            I(this.C);
            this.f131n0 = 0;
            this.f132o0 = 0;
        } catch (MediaCryptoException e10) {
            throw createRendererException(e10, this.f146y, 6006);
        }
    }

    public final void P(long j10) {
        Object obj;
        f5.b0 b0Var = this.f130n;
        synchronized (b0Var) {
            obj = null;
            while (b0Var.f6573b > 0 && j10 - ((long[]) b0Var.f6574c)[b0Var.f6572a] >= 0) {
                obj = b0Var.f();
            }
        }
        t0 t0Var = (t0) obj;
        if (t0Var == null && this.L) {
            t0Var = (t0) this.f130n.e();
        }
        if (t0Var != null) {
            this.A = t0Var;
        } else if (!this.L || this.A == null) {
            return;
        }
        x(this.A, this.K);
        this.L = false;
    }

    public final boolean a(long j10, long j11) {
        i iVar;
        f5.a.i(!this.f141v0);
        i iVar2 = this.h;
        int i10 = iVar2.f90r;
        if (i10 > 0) {
            iVar = iVar2;
            if (C(j10, j11, null, iVar2.f16828b, this.f121e0, 0, i10, iVar2.d, iVar2.isDecodeOnly(), iVar2.isEndOfStream(), this.A)) {
                z(iVar.f89n);
                iVar.clear();
            } else {
                return false;
            }
        } else {
            iVar = iVar2;
        }
        if (this.f140u0) {
            this.f141v0 = true;
            return false;
        }
        boolean z10 = this.f127j0;
        m3.i iVar3 = this.f122f;
        if (z10) {
            f5.a.i(iVar.d(iVar3));
            this.f127j0 = false;
        }
        if (this.f128k0) {
            if (iVar.f90r > 0) {
                return true;
            }
            d();
            this.f128k0 = false;
            r();
            if (!this.f126i0) {
                return false;
            }
        }
        f5.a.i(!this.f140u0);
        u0 formatHolder = getFormatHolder();
        iVar3.clear();
        while (true) {
            iVar3.clear();
            int readSource = readSource(formatHolder, iVar3, 0);
            if (readSource != -5) {
                if (readSource != -4) {
                    if (readSource != -3) {
                        throw new IllegalStateException();
                    }
                } else if (iVar3.isEndOfStream()) {
                    this.f140u0 = true;
                    break;
                } else {
                    if (this.f143w0) {
                        t0 t0Var = this.f146y;
                        t0Var.getClass();
                        this.A = t0Var;
                        x(t0Var, null);
                        this.f143w0 = false;
                    }
                    iVar3.c();
                    if (!iVar.d(iVar3)) {
                        this.f127j0 = true;
                        break;
                    }
                }
            } else {
                w(formatHolder);
                break;
            }
        }
        if (iVar.f90r > 0) {
            iVar.c();
        }
        if (iVar.f90r <= 0 && !this.f140u0 && !this.f128k0) {
            return false;
        }
        return true;
    }

    public abstract m3.l b(q qVar, t0 t0Var, t0 t0Var2);

    public o c(IllegalStateException illegalStateException, q qVar) {
        return new o(illegalStateException, qVar);
    }

    public final void d() {
        this.f128k0 = false;
        this.h.clear();
        this.f122f.clear();
        this.f127j0 = false;
        this.f126i0 = false;
    }

    public final boolean e() {
        if (this.f133p0) {
            this.f131n0 = 1;
            if (!this.S && !this.U) {
                this.f132o0 = 2;
                return true;
            }
            this.f132o0 = 3;
            return false;
        }
        O();
        return true;
    }

    public final boolean f(long j10, long j11) {
        MediaCodec.BufferInfo bufferInfo;
        boolean z10;
        boolean z11;
        boolean C;
        boolean z12;
        int f9;
        boolean z13;
        boolean z14;
        int i10 = this.f121e0;
        MediaCodec.BufferInfo bufferInfo2 = this.f137s;
        if (i10 < 0) {
            if (this.V && this.f134q0) {
                try {
                    f9 = this.I.f(bufferInfo2);
                } catch (IllegalStateException unused) {
                    B();
                    if (this.f141v0) {
                        E();
                    }
                }
            } else {
                f9 = this.I.f(bufferInfo2);
            }
            if (f9 < 0) {
                if (f9 == -2) {
                    this.f136r0 = true;
                    MediaFormat outputFormat = this.I.getOutputFormat();
                    if (this.Q != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                        this.Z = true;
                        return true;
                    }
                    if (this.X) {
                        outputFormat.setInteger("channel-count", 1);
                    }
                    this.K = outputFormat;
                    this.L = true;
                    return true;
                }
                if (this.f114a0 && (this.f140u0 || this.f131n0 == 2)) {
                    B();
                    return false;
                }
                return false;
            } else if (this.Z) {
                this.Z = false;
                this.I.releaseOutputBuffer(f9, false);
                return true;
            } else if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                B();
                return false;
            } else {
                this.f121e0 = f9;
                ByteBuffer outputBuffer = this.I.getOutputBuffer(f9);
                this.f123f0 = outputBuffer;
                if (outputBuffer != null) {
                    outputBuffer.position(bufferInfo2.offset);
                    this.f123f0.limit(bufferInfo2.offset + bufferInfo2.size);
                }
                if (this.W && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                    long j12 = this.f138s0;
                    if (j12 != -9223372036854775807L) {
                        bufferInfo2.presentationTimeUs = j12;
                    }
                }
                long j13 = bufferInfo2.presentationTimeUs;
                ArrayList arrayList = this.f135r;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        if (((Long) arrayList.get(i11)).longValue() == j13) {
                            arrayList.remove(i11);
                            z13 = true;
                            break;
                        }
                        i11++;
                    } else {
                        z13 = false;
                        break;
                    }
                }
                this.f124g0 = z13;
                long j14 = this.f139t0;
                long j15 = bufferInfo2.presentationTimeUs;
                if (j14 == j15) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                this.f125h0 = z14;
                P(j15);
            }
        }
        if (this.V && this.f134q0) {
            try {
                bufferInfo = bufferInfo2;
                z10 = false;
                z11 = true;
                try {
                    C = C(j10, j11, this.I, this.f123f0, this.f121e0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f124g0, this.f125h0, this.A);
                } catch (IllegalStateException unused2) {
                    B();
                    if (this.f141v0) {
                        E();
                        return z10;
                    }
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            bufferInfo = bufferInfo2;
            z10 = false;
            z11 = true;
            C = C(j10, j11, this.I, this.f123f0, this.f121e0, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.f124g0, this.f125h0, this.A);
        }
        if (C) {
            z(bufferInfo.presentationTimeUs);
            if ((bufferInfo.flags & 4) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f121e0 = -1;
            this.f123f0 = null;
            if (!z12) {
                return z11;
            }
            B();
            return z10;
        }
        return z10;
    }

    public final boolean g() {
        t tVar;
        boolean z10;
        long j10;
        int i10;
        n nVar = this.I;
        if (nVar != null && this.f131n0 != 2 && !this.f140u0) {
            if (this.f119d0 < 0) {
                int e10 = nVar.e();
                this.f119d0 = e10;
                if (e10 >= 0) {
                    this.f120e.f16828b = this.I.getInputBuffer(e10);
                    this.f120e.clear();
                }
            }
            if (this.f131n0 == 1) {
                if (!this.f114a0) {
                    this.f134q0 = true;
                    this.I.c(0L, this.f119d0, 0, 4);
                    this.f119d0 = -1;
                    this.f120e.f16828b = null;
                }
                this.f131n0 = 2;
                return false;
            } else if (this.Y) {
                this.Y = false;
                this.f120e.f16828b.put(D0);
                this.I.c(0L, this.f119d0, 38, 0);
                this.f119d0 = -1;
                this.f120e.f16828b = null;
                this.f133p0 = true;
                return true;
            } else {
                if (this.m0 == 1) {
                    for (int i11 = 0; i11 < this.J.D.size(); i11++) {
                        this.f120e.f16828b.put((byte[]) this.J.D.get(i11));
                    }
                    this.m0 = 2;
                }
                int position = this.f120e.f16828b.position();
                u0 formatHolder = getFormatHolder();
                try {
                    int readSource = readSource(formatHolder, this.f120e, 0);
                    if (hasReadStreamToEnd()) {
                        this.f139t0 = this.f138s0;
                    }
                    if (readSource != -3) {
                        if (readSource == -5) {
                            if (this.m0 == 2) {
                                this.f120e.clear();
                                this.m0 = 1;
                            }
                            w(formatHolder);
                            return true;
                        } else if (this.f120e.isEndOfStream()) {
                            if (this.m0 == 2) {
                                this.f120e.clear();
                                this.m0 = 1;
                            }
                            this.f140u0 = true;
                            if (!this.f133p0) {
                                B();
                                return false;
                            }
                            try {
                                if (!this.f114a0) {
                                    this.f134q0 = true;
                                    this.I.c(0L, this.f119d0, 0, 4);
                                    this.f119d0 = -1;
                                    this.f120e.f16828b = null;
                                    return false;
                                }
                            } catch (MediaCodec.CryptoException e11) {
                                throw createRendererException(e11, this.f146y, d0.q(e11.getErrorCode()));
                            }
                        } else {
                            if (!this.f133p0 && !this.f120e.isKeyFrame()) {
                                this.f120e.clear();
                                if (this.m0 == 2) {
                                    this.m0 = 1;
                                    return true;
                                }
                            } else {
                                boolean flag = this.f120e.getFlag(1073741824);
                                if (flag) {
                                    m3.d dVar = this.f120e.f16827a;
                                    if (position == 0) {
                                        dVar.getClass();
                                    } else {
                                        if (dVar.d == null) {
                                            int[] iArr = new int[1];
                                            dVar.d = iArr;
                                            dVar.f16815i.numBytesOfClearData = iArr;
                                        }
                                        int[] iArr2 = dVar.d;
                                        iArr2[0] = iArr2[0] + position;
                                    }
                                }
                                if (this.R && !flag) {
                                    ByteBuffer byteBuffer = this.f120e.f16828b;
                                    int position2 = byteBuffer.position();
                                    int i12 = 0;
                                    int i13 = 0;
                                    while (true) {
                                        int i14 = i12 + 1;
                                        if (i14 < position2) {
                                            int i15 = byteBuffer.get(i12) & 255;
                                            if (i13 == 3) {
                                                if (i15 == 1 && (byteBuffer.get(i14) & 31) == 7) {
                                                    ByteBuffer duplicate = byteBuffer.duplicate();
                                                    duplicate.position(i12 - 3);
                                                    duplicate.limit(position2);
                                                    byteBuffer.position(0);
                                                    byteBuffer.put(duplicate);
                                                    break;
                                                }
                                            } else if (i15 == 0) {
                                                i13++;
                                            }
                                            if (i15 != 0) {
                                                i13 = 0;
                                            }
                                            i12 = i14;
                                        } else {
                                            byteBuffer.clear();
                                            break;
                                        }
                                    }
                                    if (this.f120e.f16828b.position() != 0) {
                                        this.R = false;
                                    }
                                }
                                m3.i iVar = this.f120e;
                                long j11 = iVar.d;
                                j jVar = this.f116b0;
                                if (jVar != null) {
                                    t0 t0Var = this.f146y;
                                    if (jVar.f93b == 0) {
                                        jVar.f92a = j11;
                                    }
                                    if (!jVar.f94c) {
                                        ByteBuffer byteBuffer2 = iVar.f16828b;
                                        byteBuffer2.getClass();
                                        int i16 = 0;
                                        for (int i17 = 0; i17 < 4; i17++) {
                                            i16 = (i16 << 8) | (byteBuffer2.get(i17) & 255);
                                        }
                                        int i18 = l3.b.i(i16);
                                        if (i18 == -1) {
                                            jVar.f94c = true;
                                            jVar.f93b = 0L;
                                            jVar.f92a = iVar.d;
                                            f5.a.K("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                                            j11 = iVar.d;
                                        } else {
                                            z10 = flag;
                                            long max = jVar.f92a + Math.max(0L, ((jVar.f93b - 529) * 1000000) / t0Var.P);
                                            jVar.f93b += i18;
                                            j11 = max;
                                            long j12 = this.f138s0;
                                            j jVar2 = this.f116b0;
                                            t0 t0Var2 = this.f146y;
                                            jVar2.getClass();
                                            long max2 = Math.max(j12, Math.max(0L, ((jVar2.f93b - 529) * 1000000) / t0Var2.P) + jVar2.f92a);
                                            tVar = this;
                                            tVar.f138s0 = max2;
                                            j10 = j11;
                                        }
                                    }
                                    z10 = flag;
                                    long j122 = this.f138s0;
                                    j jVar22 = this.f116b0;
                                    t0 t0Var22 = this.f146y;
                                    jVar22.getClass();
                                    long max22 = Math.max(j122, Math.max(0L, ((jVar22.f93b - 529) * 1000000) / t0Var22.P) + jVar22.f92a);
                                    tVar = this;
                                    tVar.f138s0 = max22;
                                    j10 = j11;
                                } else {
                                    tVar = this;
                                    z10 = flag;
                                    j10 = j11;
                                }
                                if (tVar.f120e.isDecodeOnly()) {
                                    tVar.f135r.add(Long.valueOf(j10));
                                }
                                if (tVar.f143w0) {
                                    f5.b0 b0Var = tVar.f130n;
                                    t0 t0Var3 = tVar.f146y;
                                    synchronized (b0Var) {
                                        if (b0Var.f6573b > 0) {
                                            if (j10 <= ((long[]) b0Var.f6574c)[((b0Var.f6572a + i10) - 1) % ((Object[]) b0Var.d).length]) {
                                                b0Var.b();
                                            }
                                        }
                                        b0Var.c();
                                        int i19 = b0Var.f6572a;
                                        int i20 = b0Var.f6573b;
                                        Object[] objArr = (Object[]) b0Var.d;
                                        int length = (i19 + i20) % objArr.length;
                                        ((long[]) b0Var.f6574c)[length] = j10;
                                        objArr[length] = t0Var3;
                                        b0Var.f6573b = i20 + 1;
                                    }
                                    tVar.f143w0 = false;
                                }
                                tVar.f138s0 = Math.max(tVar.f138s0, j10);
                                tVar.f120e.c();
                                if (tVar.f120e.hasSupplementalData()) {
                                    tVar.p(tVar.f120e);
                                }
                                tVar.onQueueInputBuffer(tVar.f120e);
                                try {
                                    if (z10) {
                                        tVar.I.b(tVar.f119d0, tVar.f120e.f16827a, j10);
                                    } else {
                                        tVar.I.c(j10, tVar.f119d0, tVar.f120e.f16828b.limit(), 0);
                                    }
                                    tVar.f119d0 = -1;
                                    tVar.f120e.f16828b = null;
                                    tVar.f133p0 = true;
                                    tVar.m0 = 0;
                                    tVar.f148z0.f16819c++;
                                    return true;
                                } catch (MediaCodec.CryptoException e12) {
                                    throw tVar.createRendererException(e12, tVar.f146y, d0.q(e12.getErrorCode()));
                                }
                            }
                            return true;
                        }
                    }
                } catch (m3.h e13) {
                    t(e13);
                    D(0);
                    h();
                    return true;
                }
            }
        }
        return false;
    }

    public final void h() {
        try {
            this.I.flush();
        } finally {
            G();
        }
    }

    public final boolean i() {
        boolean z10;
        if (this.I == null) {
            return false;
        }
        int i10 = this.f132o0;
        if (i10 != 3 && !this.S && ((!this.T || this.f136r0) && (!this.U || !this.f134q0))) {
            if (i10 == 2) {
                int i11 = d0.f6579a;
                if (i11 >= 23) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f5.a.i(z10);
                if (i11 >= 23) {
                    try {
                        O();
                    } catch (j3.n e10) {
                        f5.a.L("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                        E();
                        return true;
                    }
                }
            }
            h();
            return false;
        }
        E();
        return true;
    }

    @Override
    public boolean isEnded() {
        return this.f141v0;
    }

    @Override
    public boolean isReady() {
        if (this.f146y != null) {
            if (!isSourceReady() && this.f121e0 < 0) {
                if (this.f118c0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f118c0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final List j(boolean z10) {
        t0 t0Var = this.f146y;
        u uVar = this.f115b;
        ArrayList m10 = m(uVar, t0Var, z10);
        if (m10.isEmpty() && z10) {
            ArrayList m11 = m(uVar, this.f146y, false);
            if (!m11.isEmpty()) {
                f5.a.K("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f146y.B + ", but no secure decoder available. Trying to proceed with " + m11 + ".");
            }
            return m11;
        }
        return m10;
    }

    public boolean k() {
        return false;
    }

    public abstract float l(float f9, t0[] t0VarArr);

    public abstract ArrayList m(u uVar, t0 t0Var, boolean z10);

    public final n3.j n(n3.e eVar) {
        m3.b E = eVar.E();
        if (E != null && !(E instanceof n3.j)) {
            throw createRendererException(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + E), this.f146y, 6001);
        }
        return (n3.j) E;
    }

    public abstract l o(q qVar, t0 t0Var, MediaCrypto mediaCrypto, float f9);

    @Override
    public void onDisabled() {
        this.f146y = null;
        this.A0 = -9223372036854775807L;
        J(-9223372036854775807L);
        this.C0 = 0;
        i();
    }

    @Override
    public void onPositionReset(long j10, boolean z10) {
        int i10;
        this.f140u0 = false;
        this.f141v0 = false;
        this.f145x0 = false;
        if (this.f126i0) {
            this.h.clear();
            this.f122f.clear();
            this.f127j0 = false;
        } else if (i()) {
            r();
        }
        f5.b0 b0Var = this.f130n;
        synchronized (b0Var) {
            i10 = b0Var.f6573b;
        }
        if (i10 > 0) {
            this.f143w0 = true;
        }
        this.f130n.b();
        int i11 = this.C0;
        if (i11 != 0) {
            J(this.f142w[i11 - 1]);
            this.A0 = this.v[this.C0 - 1];
            this.C0 = 0;
        }
    }

    public abstract void onQueueInputBuffer(m3.i iVar);

    @Override
    public void onReset() {
        try {
            d();
            E();
        } finally {
            l1.D(this.C, null);
            this.C = null;
        }
    }

    @Override
    public final void onStreamChanged(t0[] t0VarArr, long j10, long j11) {
        boolean z10 = true;
        if (this.B0 == -9223372036854775807L) {
            if (this.A0 != -9223372036854775807L) {
                z10 = false;
            }
            f5.a.i(z10);
            this.A0 = j10;
            J(j11);
            return;
        }
        int i10 = this.C0;
        long[] jArr = this.f142w;
        if (i10 == jArr.length) {
            f5.a.K("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + jArr[this.C0 - 1]);
        } else {
            this.C0 = i10 + 1;
        }
        int i11 = this.C0;
        this.v[i11 - 1] = j10;
        jArr[i11 - 1] = j11;
        long j12 = this.f138s0;
        this.f144x[i11 - 1] = j12;
    }

    public final void q(a4.q r27, android.media.MediaCrypto r28) {
        throw new UnsupportedOperationException("Method not decompiled: a4.t.q(a4.q, android.media.MediaCrypto):void");
    }

    public final void r() {
        t0 t0Var;
        if (this.I == null && !this.f126i0 && (t0Var = this.f146y) != null) {
            if (this.C == null && L(t0Var)) {
                t0 t0Var2 = this.f146y;
                d();
                String str = t0Var2.B;
                boolean equals = "audio/mp4a-latm".equals(str);
                i iVar = this.h;
                if (!equals && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
                    iVar.getClass();
                    iVar.f91s = 1;
                } else {
                    iVar.getClass();
                    iVar.f91s = 32;
                }
                this.f126i0 = true;
                return;
            }
            I(this.C);
            String str2 = this.f146y.B;
            n3.e eVar = this.B;
            if (eVar != null) {
                if (this.D == null) {
                    n(eVar);
                    if (this.B.D() == null) {
                        return;
                    }
                }
                if (n3.j.f17107a) {
                    int t10 = this.B.t();
                    if (t10 != 1) {
                        if (t10 != 4) {
                            return;
                        }
                    } else {
                        n3.d D = this.B.D();
                        D.getClass();
                        throw createRendererException(D, this.f146y, D.f17103a);
                    }
                }
            }
            try {
                s(this.D, this.E);
            } catch (s e10) {
                throw createRendererException(e10, this.f146y, 4001);
            }
        }
    }

    @Override
    public final void render(long r12, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: a4.t.render(long, long):void");
    }

    public final void s(android.media.MediaCrypto r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: a4.t.s(android.media.MediaCrypto, boolean):void");
    }

    @Override
    public void setPlaybackSpeed(float f9, float f10) {
        this.G = f9;
        this.H = f10;
        N(this.J);
    }

    @Override
    public final int supportsFormat(t0 t0Var) {
        try {
            return M(this.f115b, t0Var);
        } catch (y e10) {
            throw createRendererException(e10, t0Var, 4002);
        }
    }

    @Override
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    public abstract void t(Exception exc);

    public abstract void u(long j10, long j11, String str);

    public abstract void v(String str);

    public m3.l w(j3.u0 r13) {
        throw new UnsupportedOperationException("Method not decompiled: a4.t.w(j3.u0):m3.l");
    }

    public abstract void x(t0 t0Var, MediaFormat mediaFormat);

    public void z(long j10) {
        while (this.C0 != 0) {
            long[] jArr = this.f144x;
            if (j10 >= jArr[0]) {
                long[] jArr2 = this.v;
                this.A0 = jArr2[0];
                long[] jArr3 = this.f142w;
                J(jArr3[0]);
                int i10 = this.C0 - 1;
                this.C0 = i10;
                System.arraycopy(jArr2, 1, jArr2, 0, i10);
                System.arraycopy(jArr3, 1, jArr3, 0, this.C0);
                System.arraycopy(jArr, 1, jArr, 0, this.C0);
                A();
            } else {
                return;
            }
        }
    }

    public void F() {
    }

    public void y() {
    }

    public void p(m3.i iVar) {
    }
}
