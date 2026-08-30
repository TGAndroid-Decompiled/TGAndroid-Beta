package d4;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import h5.b0;
import h5.d0;
import j3.n0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import k7.b7;
import kh.a2;
import l3.p0;
import o4.l0;
public abstract class r extends j3.e {
    public static final byte[] Q0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public int A0;
    public final j B;
    public int B0;
    public final s C;
    public boolean C0;
    public final float D;
    public boolean D0;
    public final n3.i E;
    public boolean E0;
    public final n3.i F;
    public long F0;
    public final n3.i G;
    public long G0;
    public final g H;
    public boolean H0;
    public final ArrayList I;
    public boolean I0;
    public final MediaCodec.BufferInfo J;
    public boolean J0;
    public final ArrayDeque K;
    public boolean K0;
    public final p0 L;
    public j3.n L0;
    public n0 M;
    public n3.f M0;
    public n0 N;
    public q N0;
    public o3.i O;
    public long O0;
    public o3.i P;
    public boolean P0;
    public MediaCrypto Q;
    public boolean R;
    public final long S;
    public float T;
    public float U;
    public k V;
    public n0 W;
    public MediaFormat X;
    public boolean Y;
    public float Z;
    public ArrayDeque f4175a0;
    public p f4176b0;
    public n f4177c0;
    public int f4178d0;
    public boolean f4179e0;
    public boolean f4180f0;
    public boolean f4181g0;
    public boolean f4182h0;
    public boolean f4183i0;
    public boolean f4184j0;
    public boolean f4185k0;
    public boolean f4186l0;
    public boolean m0;
    public boolean f4187n0;
    public h f4188o0;
    public long f4189p0;
    public int f4190q0;
    public int f4191r0;
    public ByteBuffer f4192s0;
    public boolean f4193t0;
    public boolean f4194u0;
    public boolean f4195v0;
    public boolean f4196w0;
    public boolean f4197x0;
    public boolean f4198y0;
    public int f4199z0;

    public r(int i10, j jVar, float f10) {
        super(i10);
        this.B = jVar;
        this.C = s.f4200b;
        this.D = f10;
        this.E = new n3.i(0, 0);
        this.F = new n3.i(0, 0);
        this.G = new n3.i(2, 0);
        ?? iVar = new n3.i(2, 0);
        iVar.f4156w = 32;
        this.H = iVar;
        this.I = new ArrayList();
        this.J = new MediaCodec.BufferInfo();
        this.T = 1.0f;
        this.U = 1.0f;
        this.S = -9223372036854775807L;
        this.K = new ArrayDeque();
        j0(q.d);
        iVar.k(0);
        iVar.d.order(ByteOrder.nativeOrder());
        ?? obj = new Object();
        obj.f11215c = l3.n.f11198a;
        obj.f11214b = 0;
        obj.f11213a = 2;
        this.L = obj;
        this.Z = -1.0f;
        this.f4178d0 = 0;
        this.f4199z0 = 0;
        this.f4190q0 = -1;
        this.f4191r0 = -1;
        this.f4189p0 = -9223372036854775807L;
        this.F0 = -9223372036854775807L;
        this.G0 = -9223372036854775807L;
        this.O0 = -9223372036854775807L;
        this.A0 = 0;
        this.B0 = 0;
    }

    public abstract n3.k A(n nVar, n0 n0Var, n0 n0Var2);

    public l B(IllegalStateException illegalStateException, n nVar) {
        return new l(illegalStateException, nVar);
    }

    public final void C() {
        this.f4197x0 = false;
        this.H.c();
        this.G.c();
        this.f4196w0 = false;
        this.f4195v0 = false;
        p0 p0Var = this.L;
        p0Var.getClass();
        p0Var.f11215c = l3.n.f11198a;
        p0Var.f11214b = 0;
        p0Var.f11213a = 2;
    }

    public final boolean D() {
        if (this.C0) {
            this.A0 = 1;
            if (!this.f4180f0 && !this.f4182h0) {
                this.B0 = 2;
                return true;
            }
            this.B0 = 3;
            return false;
        }
        o0();
        return true;
    }

    public final boolean E(long j10, long j11) {
        MediaCodec.BufferInfo bufferInfo;
        boolean z4;
        boolean z10;
        boolean c02;
        boolean z11;
        int f10;
        boolean z12;
        boolean z13;
        int i10 = this.f4191r0;
        MediaCodec.BufferInfo bufferInfo2 = this.J;
        if (i10 < 0) {
            if (this.f4183i0 && this.D0) {
                try {
                    f10 = this.V.f(bufferInfo2);
                } catch (IllegalStateException unused) {
                    b0();
                    if (this.I0) {
                        e0();
                    }
                }
            } else {
                f10 = this.V.f(bufferInfo2);
            }
            if (f10 < 0) {
                if (f10 == -2) {
                    this.E0 = true;
                    MediaFormat outputFormat = this.V.getOutputFormat();
                    if (this.f4178d0 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                        this.m0 = true;
                        return true;
                    }
                    if (this.f4185k0) {
                        outputFormat.setInteger("channel-count", 1);
                    }
                    this.X = outputFormat;
                    this.Y = true;
                    return true;
                }
                if (this.f4187n0 && (this.H0 || this.A0 == 2)) {
                    b0();
                    return false;
                }
                return false;
            } else if (this.m0) {
                this.m0 = false;
                this.V.releaseOutputBuffer(f10, false);
                return true;
            } else if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                b0();
                return false;
            } else {
                this.f4191r0 = f10;
                ByteBuffer outputBuffer = this.V.getOutputBuffer(f10);
                this.f4192s0 = outputBuffer;
                if (outputBuffer != null) {
                    outputBuffer.position(bufferInfo2.offset);
                    this.f4192s0.limit(bufferInfo2.offset + bufferInfo2.size);
                }
                if (this.f4184j0 && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                    long j12 = this.F0;
                    if (j12 != -9223372036854775807L) {
                        bufferInfo2.presentationTimeUs = j12;
                    }
                }
                long j13 = bufferInfo2.presentationTimeUs;
                ArrayList arrayList = this.I;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        if (((Long) arrayList.get(i11)).longValue() == j13) {
                            arrayList.remove(i11);
                            z12 = true;
                            break;
                        }
                        i11++;
                    } else {
                        z12 = false;
                        break;
                    }
                }
                this.f4193t0 = z12;
                long j14 = this.G0;
                long j15 = bufferInfo2.presentationTimeUs;
                if (j14 == j15) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.f4194u0 = z13;
                p0(j15);
            }
        }
        if (this.f4183i0 && this.D0) {
            try {
                bufferInfo = bufferInfo2;
                z4 = false;
                z10 = true;
                try {
                    c02 = c0(j10, j11, this.V, this.f4192s0, this.f4191r0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f4193t0, this.f4194u0, this.N);
                } catch (IllegalStateException unused2) {
                    b0();
                    if (this.I0) {
                        e0();
                        return z4;
                    }
                    return z4;
                }
            } catch (IllegalStateException unused3) {
                z4 = false;
            }
        } else {
            bufferInfo = bufferInfo2;
            z4 = false;
            z10 = true;
            c02 = c0(j10, j11, this.V, this.f4192s0, this.f4191r0, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.f4193t0, this.f4194u0, this.N);
        }
        if (c02) {
            X(bufferInfo.presentationTimeUs);
            if ((bufferInfo.flags & 4) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f4191r0 = -1;
            this.f4192s0 = null;
            if (!z11) {
                return z10;
            }
            b0();
            return z4;
        }
        return z4;
    }

    public final boolean F() {
        boolean z4;
        k kVar = this.V;
        if (kVar == null || this.A0 == 2 || this.H0) {
            return false;
        }
        int i10 = this.f4190q0;
        n3.i iVar = this.F;
        if (i10 < 0) {
            int d = kVar.d();
            this.f4190q0 = d;
            if (d < 0) {
                return false;
            }
            iVar.d = this.V.getInputBuffer(d);
            iVar.c();
        }
        if (this.A0 == 1) {
            if (!this.f4187n0) {
                this.D0 = true;
                this.V.a(0L, this.f4190q0, 0, 4);
                this.f4190q0 = -1;
                iVar.d = null;
            }
            this.A0 = 2;
            return false;
        } else if (this.f4186l0) {
            this.f4186l0 = false;
            iVar.d.put(Q0);
            this.V.a(0L, this.f4190q0, 38, 0);
            this.f4190q0 = -1;
            iVar.d = null;
            this.C0 = true;
            return true;
        } else {
            if (this.f4199z0 == 1) {
                for (int i11 = 0; i11 < this.W.E.size(); i11++) {
                    iVar.d.put((byte[]) this.W.E.get(i11));
                }
                this.f4199z0 = 2;
            }
            ByteBuffer byteBuffer = iVar.d;
            n3.d dVar = iVar.f14241c;
            int position = byteBuffer.position();
            f7.b bVar = this.f8490c;
            bVar.l();
            try {
                int s6 = s(bVar, iVar, 0);
                if (h() || iVar.e(536870912)) {
                    this.G0 = this.F0;
                }
                if (s6 == -3) {
                    return false;
                }
                if (s6 == -5) {
                    if (this.f4199z0 == 2) {
                        iVar.c();
                        this.f4199z0 = 1;
                    }
                    U(bVar);
                    return true;
                } else if (iVar.e(4)) {
                    if (this.f4199z0 == 2) {
                        iVar.c();
                        this.f4199z0 = 1;
                    }
                    this.H0 = true;
                    if (!this.C0) {
                        b0();
                        return false;
                    }
                    try {
                        if (this.f4187n0) {
                            return false;
                        }
                        this.D0 = true;
                        this.V.a(0L, this.f4190q0, 0, 4);
                        this.f4190q0 = -1;
                        iVar.d = null;
                        return false;
                    } catch (MediaCodec.CryptoException e) {
                        throw a(e, this.M, false, d0.r(e.getErrorCode()));
                    }
                } else {
                    if (!this.C0 && !iVar.e(1)) {
                        iVar.c();
                        if (this.f4199z0 == 2) {
                            this.f4199z0 = 1;
                            return true;
                        }
                    } else {
                        boolean e6 = iVar.e(1073741824);
                        if (e6) {
                            if (position == 0) {
                                dVar.getClass();
                            } else {
                                if (dVar.d == null) {
                                    int[] iArr = new int[1];
                                    dVar.d = iArr;
                                    dVar.f14230i.numBytesOfClearData = iArr;
                                }
                                int[] iArr2 = dVar.d;
                                iArr2[0] = iArr2[0] + position;
                            }
                        }
                        if (this.f4179e0 && !e6) {
                            ByteBuffer byteBuffer2 = iVar.d;
                            int position2 = byteBuffer2.position();
                            int i12 = 0;
                            int i13 = 0;
                            while (true) {
                                int i14 = i12 + 1;
                                if (i14 < position2) {
                                    int i15 = byteBuffer2.get(i12) & 255;
                                    if (i13 == 3) {
                                        if (i15 == 1 && (byteBuffer2.get(i14) & 31) == 7) {
                                            ByteBuffer duplicate = byteBuffer2.duplicate();
                                            duplicate.position(i12 - 3);
                                            duplicate.limit(position2);
                                            byteBuffer2.position(0);
                                            byteBuffer2.put(duplicate);
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
                                    byteBuffer2.clear();
                                    break;
                                }
                            }
                            if (iVar.d.position() != 0) {
                                this.f4179e0 = false;
                            }
                        }
                        long j10 = iVar.f14242f;
                        h hVar = this.f4188o0;
                        if (hVar != null) {
                            n0 n0Var = this.M;
                            if (hVar.f4158b == 0) {
                                hVar.f4157a = j10;
                            }
                            if (!hVar.f4159c) {
                                ByteBuffer byteBuffer3 = iVar.d;
                                byteBuffer3.getClass();
                                int i16 = 0;
                                for (int i17 = 0; i17 < 4; i17++) {
                                    i16 = (i16 << 8) | (byteBuffer3.get(i17) & 255);
                                }
                                int i18 = l3.a.i(i16);
                                if (i18 == -1) {
                                    hVar.f4159c = true;
                                    hVar.f4158b = 0L;
                                    hVar.f4157a = iVar.f14242f;
                                    h5.a.K("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                                    j10 = iVar.f14242f;
                                } else {
                                    j10 = Math.max(0L, ((hVar.f4158b - 529) * 1000000) / n0Var.Q) + hVar.f4157a;
                                    hVar.f4158b += i18;
                                }
                            }
                            long j11 = this.F0;
                            h hVar2 = this.f4188o0;
                            n0 n0Var2 = this.M;
                            hVar2.getClass();
                            long j12 = n0Var2.Q;
                            z4 = e6;
                            this.F0 = Math.max(j11, Math.max(0L, ((hVar2.f4158b - 529) * 1000000) / j12) + hVar2.f4157a);
                        } else {
                            z4 = e6;
                        }
                        if (iVar.e(Integer.MIN_VALUE)) {
                            this.I.add(Long.valueOf(j10));
                        }
                        if (this.J0) {
                            ArrayDeque arrayDeque = this.K;
                            if (!arrayDeque.isEmpty()) {
                                ((q) arrayDeque.peekLast()).f4174c.a(this.M, j10);
                            } else {
                                this.N0.f4174c.a(this.M, j10);
                            }
                            this.J0 = false;
                        }
                        this.F0 = Math.max(this.F0, j10);
                        iVar.l();
                        if (iVar.e(268435456)) {
                            N(iVar);
                        }
                        Z(iVar);
                        try {
                            if (z4) {
                                this.V.c(this.f4190q0, dVar, j10);
                            } else {
                                this.V.a(j10, this.f4190q0, iVar.d.limit(), 0);
                            }
                            this.f4190q0 = -1;
                            iVar.d = null;
                            this.C0 = true;
                            this.f4199z0 = 0;
                            this.M0.f14234c++;
                            return true;
                        } catch (MediaCodec.CryptoException e10) {
                            throw a(e10, this.M, false, d0.r(e10.getErrorCode()));
                        }
                    }
                    return true;
                }
            } catch (n3.h e11) {
                R(e11);
                d0(0);
                G();
                return true;
            }
        }
    }

    public final void G() {
        try {
            this.V.flush();
        } finally {
            g0();
        }
    }

    public final boolean H() {
        boolean z4;
        if (this.V == null) {
            return false;
        }
        int i10 = this.B0;
        if (i10 != 3 && !this.f4180f0 && ((!this.f4181g0 || this.E0) && (!this.f4182h0 || !this.D0))) {
            if (i10 == 2) {
                int i11 = d0.f6937a;
                if (i11 >= 23) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                h5.a.i(z4);
                if (i11 >= 23) {
                    try {
                        o0();
                    } catch (j3.n e) {
                        h5.a.L("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                        e0();
                        return true;
                    }
                }
            }
            G();
            return false;
        }
        e0();
        return true;
    }

    public final List I(boolean z4) {
        n0 n0Var = this.M;
        s sVar = this.C;
        ArrayList L = L(sVar, n0Var, z4);
        if (L.isEmpty() && z4) {
            ArrayList L2 = L(sVar, this.M, false);
            if (!L2.isEmpty()) {
                h5.a.K("MediaCodecRenderer", "Drm session requires secure decoder for " + this.M.C + ", but no secure decoder available. Trying to proceed with " + L2 + ".");
            }
            return L2;
        }
        return L;
    }

    public boolean J() {
        return false;
    }

    public abstract float K(float f10, n0[] n0VarArr);

    public abstract ArrayList L(s sVar, n0 n0Var, boolean z4);

    public abstract i M(n nVar, n0 n0Var, MediaCrypto mediaCrypto, float f10);

    public final void O(d4.n r29, android.media.MediaCrypto r30) {
        throw new UnsupportedOperationException("Method not decompiled: d4.r.O(d4.n, android.media.MediaCrypto):void");
    }

    public final void P() {
        n0 n0Var;
        boolean z4;
        if (this.V == null && !this.f4195v0 && (n0Var = this.M) != null) {
            if (this.P == null && l0(n0Var)) {
                n0 n0Var2 = this.M;
                C();
                String str = n0Var2.C;
                boolean equals = "audio/mp4a-latm".equals(str);
                g gVar = this.H;
                if (!equals && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
                    gVar.getClass();
                    gVar.f4156w = 1;
                } else {
                    gVar.getClass();
                    gVar.f4156w = 32;
                }
                this.f4195v0 = true;
                return;
            }
            i0(this.P);
            String str2 = this.M.C;
            o3.i iVar = this.O;
            if (iVar != null) {
                n3.b h = iVar.h();
                if (this.Q == null) {
                    if (h == null) {
                        if (this.O.g() == null) {
                            return;
                        }
                    } else if (h instanceof o3.w) {
                        o3.w wVar = (o3.w) h;
                        try {
                            MediaCrypto mediaCrypto = new MediaCrypto(wVar.f16279a, wVar.f16280b);
                            this.Q = mediaCrypto;
                            if (!wVar.f16281c && mediaCrypto.requiresSecureDecoderComponent(str2)) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            this.R = z4;
                        } catch (MediaCryptoException e) {
                            throw a(e, this.M, false, 6006);
                        }
                    }
                }
                if (o3.w.d && (h instanceof o3.w)) {
                    int e6 = this.O.e();
                    if (e6 != 1) {
                        if (e6 != 4) {
                            return;
                        }
                    } else {
                        o3.h g10 = this.O.g();
                        g10.getClass();
                        throw a(g10, this.M, false, g10.f16263a);
                    }
                }
            }
            try {
                Q(this.Q, this.R);
            } catch (p e10) {
                throw a(e10, this.M, false, 4001);
            }
        }
    }

    public final void Q(android.media.MediaCrypto r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: d4.r.Q(android.media.MediaCrypto, boolean):void");
    }

    public abstract void R(Exception exc);

    public abstract void S(long j10, long j11, String str);

    public abstract void T(String str);

    public n3.k U(f7.b r14) {
        throw new UnsupportedOperationException("Method not decompiled: d4.r.U(f7.b):n3.k");
    }

    public abstract void V(n0 n0Var, MediaFormat mediaFormat);

    public void X(long j10) {
        this.O0 = j10;
        while (true) {
            ArrayDeque arrayDeque = this.K;
            if (!arrayDeque.isEmpty() && j10 >= ((q) arrayDeque.peek()).f4172a) {
                j0((q) arrayDeque.poll());
                Y();
            } else {
                return;
            }
        }
    }

    public abstract void Y();

    public abstract void Z(n3.i iVar);

    public final void b0() {
        int i10 = this.B0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    this.I0 = true;
                    f0();
                    return;
                }
                e0();
                P();
                return;
            }
            G();
            o0();
            return;
        }
        G();
    }

    public abstract boolean c0(long j10, long j11, k kVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z4, boolean z10, n0 n0Var);

    public final boolean d0(int i10) {
        f7.b bVar = this.f8490c;
        bVar.l();
        n3.i iVar = this.E;
        iVar.c();
        int s6 = s(bVar, iVar, i10 | 4);
        if (s6 == -5) {
            U(bVar);
            return true;
        } else if (s6 == -4 && iVar.e(4)) {
            this.H0 = true;
            b0();
            return false;
        } else {
            return false;
        }
    }

    public final void e0() {
        try {
            k kVar = this.V;
            if (kVar != null) {
                kVar.release();
                this.M0.f14233b++;
                T(this.f4177c0.f4164a);
            }
            this.V = null;
            try {
                MediaCrypto mediaCrypto = this.Q;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.V = null;
            try {
                MediaCrypto mediaCrypto2 = this.Q;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    public void g0() {
        this.f4190q0 = -1;
        this.F.d = null;
        this.f4191r0 = -1;
        this.f4192s0 = null;
        this.f4189p0 = -9223372036854775807L;
        this.D0 = false;
        this.C0 = false;
        this.f4186l0 = false;
        this.m0 = false;
        this.f4193t0 = false;
        this.f4194u0 = false;
        this.I.clear();
        this.F0 = -9223372036854775807L;
        this.G0 = -9223372036854775807L;
        this.O0 = -9223372036854775807L;
        h hVar = this.f4188o0;
        if (hVar != null) {
            hVar.f4157a = 0L;
            hVar.f4158b = 0L;
            hVar.f4159c = false;
        }
        this.A0 = 0;
        this.B0 = 0;
        this.f4199z0 = this.f4198y0 ? 1 : 0;
    }

    public final void h0() {
        g0();
        this.L0 = null;
        this.f4188o0 = null;
        this.f4175a0 = null;
        this.f4177c0 = null;
        this.W = null;
        this.X = null;
        this.Y = false;
        this.E0 = false;
        this.Z = -1.0f;
        this.f4178d0 = 0;
        this.f4179e0 = false;
        this.f4180f0 = false;
        this.f4181g0 = false;
        this.f4182h0 = false;
        this.f4183i0 = false;
        this.f4184j0 = false;
        this.f4185k0 = false;
        this.f4187n0 = false;
        this.f4198y0 = false;
        this.f4199z0 = 0;
        this.R = false;
    }

    public final void i0(o3.i iVar) {
        a2.D(this.O, iVar);
        this.O = iVar;
    }

    @Override
    public boolean j() {
        boolean d;
        boolean z4;
        if (this.M != null) {
            if (h()) {
                d = this.f8495w;
            } else {
                l0 l0Var = this.f8492n;
                l0Var.getClass();
                d = l0Var.d();
            }
            if (!d) {
                if (this.f4191r0 >= 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 || (this.f4189p0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f4189p0)) {
                }
            }
            return true;
        }
        return false;
    }

    public final void j0(q qVar) {
        this.N0 = qVar;
        if (qVar.f4173b != -9223372036854775807L) {
            this.P0 = true;
            W();
        }
    }

    @Override
    public void k() {
        this.M = null;
        j0(q.d);
        this.K.clear();
        H();
    }

    public boolean k0(n nVar) {
        return true;
    }

    public boolean l0(n0 n0Var) {
        return false;
    }

    @Override
    public void m(long j10, boolean z4) {
        int i10;
        this.H0 = false;
        this.I0 = false;
        this.K0 = false;
        if (this.f4195v0) {
            this.H.c();
            this.G.c();
            this.f4196w0 = false;
            p0 p0Var = this.L;
            p0Var.getClass();
            p0Var.f11215c = l3.n.f11198a;
            p0Var.f11214b = 0;
            p0Var.f11213a = 2;
        } else if (H()) {
            P();
        }
        b0 b0Var = this.N0.f4174c;
        synchronized (b0Var) {
            i10 = b0Var.f6931b;
        }
        if (i10 > 0) {
            this.J0 = true;
        }
        this.N0.f4174c.c();
        this.K.clear();
    }

    public abstract int m0(s sVar, n0 n0Var);

    public final boolean n0(n0 n0Var) {
        if (d0.f6937a >= 23 && this.V != null && this.B0 != 3 && this.h != 0) {
            float f10 = this.U;
            n0[] n0VarArr = this.f8493r;
            n0VarArr.getClass();
            float K = K(f10, n0VarArr);
            float f11 = this.Z;
            if (f11 != K) {
                if (K == -1.0f) {
                    if (this.C0) {
                        this.A0 = 1;
                        this.B0 = 3;
                        return false;
                    }
                    e0();
                    P();
                    return false;
                } else if (f11 != -1.0f || K > this.D) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", K);
                    this.V.setParameters(bundle);
                    this.Z = K;
                }
            }
        }
        return true;
    }

    public final void o0() {
        n3.b h = this.P.h();
        if (h instanceof o3.w) {
            try {
                this.Q.setMediaDrmSession(((o3.w) h).f16280b);
            } catch (MediaCryptoException e) {
                throw a(e, this.M, false, 6006);
            }
        }
        i0(this.P);
        this.A0 = 0;
        this.B0 = 0;
    }

    public final void p0(long j10) {
        Object obj;
        b0 b0Var = this.N0.f4174c;
        synchronized (b0Var) {
            obj = null;
            while (b0Var.f6931b > 0 && j10 - ((long[]) b0Var.f6932c)[b0Var.f6930a] >= 0) {
                obj = b0Var.g();
            }
        }
        n0 n0Var = (n0) obj;
        if (n0Var == null && this.P0 && this.X != null) {
            n0Var = (n0) this.N0.f4174c.f();
        }
        if (n0Var != null) {
            this.N = n0Var;
        } else if (!this.Y || this.N == null) {
            return;
        }
        V(this.N, this.X);
        this.Y = false;
        this.P0 = false;
    }

    @Override
    public final void r(j3.n0[] r6, long r7, long r9) {
        throw new UnsupportedOperationException("Method not decompiled: d4.r.r(j3.n0[], long, long):void");
    }

    @Override
    public void t(long r12, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: d4.r.t(long, long):void");
    }

    @Override
    public void w(float f10, float f11) {
        this.T = f10;
        this.U = f11;
        n0(this.W);
    }

    @Override
    public final int x(n0 n0Var) {
        try {
            return m0(this.C, n0Var);
        } catch (v e) {
            throw a(e, n0Var, false, 4002);
        }
    }

    @Override
    public final int y() {
        return 8;
    }

    public final boolean z(long j10, long j11) {
        g gVar;
        String str;
        int i10;
        g gVar2;
        ByteBuffer byteBuffer;
        byte b10;
        boolean z4;
        h5.a.i(!this.I0);
        g gVar3 = this.H;
        int i11 = gVar3.v;
        if (i11 > 0) {
            gVar = gVar3;
            if (c0(j10, j11, null, gVar3.d, this.f4191r0, 0, i11, gVar3.f14242f, gVar3.e(Integer.MIN_VALUE), gVar3.e(4), this.N)) {
                X(gVar.f4155s);
                gVar.c();
            } else {
                return false;
            }
        } else {
            gVar = gVar3;
        }
        if (this.H0) {
            this.I0 = true;
            return false;
        }
        ?? r12 = 0;
        boolean z10 = this.f4196w0;
        n3.i iVar = this.G;
        if (z10) {
            h5.a.i(gVar.n(iVar));
            this.f4196w0 = false;
        }
        if (this.f4197x0) {
            if (gVar.v > 0) {
                return true;
            }
            C();
            this.f4197x0 = false;
            P();
            if (!this.f4195v0) {
                return false;
            }
        }
        h5.a.i(!this.H0);
        f7.b bVar = this.f8490c;
        bVar.l();
        iVar.c();
        while (true) {
            iVar.c();
            int s6 = s(bVar, iVar, r12);
            if (s6 != -5) {
                if (s6 != -4) {
                    if (s6 != -3) {
                        throw new IllegalStateException();
                    }
                } else if (iVar.e(4)) {
                    this.H0 = true;
                    break;
                } else {
                    byte[] bArr = null;
                    if (this.J0) {
                        n0 n0Var = this.M;
                        n0Var.getClass();
                        this.N = n0Var;
                        V(n0Var, null);
                        this.J0 = r12;
                    }
                    iVar.l();
                    n0 n0Var2 = this.M;
                    if (n0Var2 != null && (str = n0Var2.C) != null && str.equals("audio/opus")) {
                        List list = this.M.E;
                        p0 p0Var = this.L;
                        p0Var.getClass();
                        iVar.d.getClass();
                        if (iVar.d.limit() - iVar.d.position() == 0) {
                            gVar2 = gVar;
                        } else {
                            if (p0Var.f11213a == 2 && (list.size() == 1 || list.size() == 3)) {
                                bArr = (byte[]) list.get(r12);
                            }
                            ByteBuffer byteBuffer2 = iVar.d;
                            int position = byteBuffer2.position();
                            int limit = byteBuffer2.limit();
                            int i12 = limit - position;
                            int i13 = (i12 + 255) / 255;
                            int i14 = i13 + 27 + i12;
                            if (p0Var.f11213a == 2) {
                                if (bArr != null) {
                                    i10 = bArr.length + 28;
                                } else {
                                    i10 = 47;
                                }
                                i14 = i10 + 44 + i14;
                            } else {
                                i10 = 0;
                            }
                            if (((ByteBuffer) p0Var.f11215c).capacity() < i14) {
                                p0Var.f11215c = ByteBuffer.allocate(i14).order(ByteOrder.LITTLE_ENDIAN);
                            } else {
                                ((ByteBuffer) p0Var.f11215c).clear();
                            }
                            ByteBuffer byteBuffer3 = (ByteBuffer) p0Var.f11215c;
                            if (p0Var.f11213a == 2) {
                                if (bArr != null) {
                                    p0.a(byteBuffer3, 0L, 0, 1, true);
                                    byteBuffer = byteBuffer3;
                                    gVar2 = gVar;
                                    long length = bArr.length;
                                    if ((length >> 8) == 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    b7.b(length, "out of range: %s", z4);
                                    byteBuffer.put((byte) length);
                                    byteBuffer.put(bArr);
                                    byteBuffer.putInt(22, d0.k(byteBuffer.arrayOffset(), bArr.length + 28, 0, byteBuffer.array()));
                                    byteBuffer.position(bArr.length + 28);
                                } else {
                                    gVar2 = gVar;
                                    byteBuffer = byteBuffer3;
                                    byteBuffer.put(p0.d);
                                }
                                byteBuffer.put(p0.e);
                            } else {
                                gVar2 = gVar;
                                byteBuffer = byteBuffer3;
                            }
                            byte b11 = byteBuffer2.get(0);
                            if (byteBuffer2.limit() > 1) {
                                b10 = byteBuffer2.get(1);
                            } else {
                                b10 = 0;
                            }
                            int e = p0Var.f11214b + ((int) ((l3.a.e(b11, b10) * 48000) / 1000000));
                            p0Var.f11214b = e;
                            p0.a(byteBuffer, e, p0Var.f11213a, i13, false);
                            for (int i15 = 0; i15 < i13; i15++) {
                                if (i12 >= 255) {
                                    byteBuffer.put((byte) -1);
                                    i12 -= 255;
                                } else {
                                    byteBuffer.put((byte) i12);
                                    i12 = 0;
                                }
                            }
                            while (position < limit) {
                                byteBuffer.put(byteBuffer2.get(position));
                                position++;
                            }
                            byteBuffer2.position(byteBuffer2.limit());
                            byteBuffer.flip();
                            if (p0Var.f11213a == 2) {
                                byteBuffer.putInt(i10 + 66, d0.k(byteBuffer.arrayOffset() + i10 + 44, byteBuffer.limit() - byteBuffer.position(), 0, byteBuffer.array()));
                            } else {
                                byteBuffer.putInt(22, d0.k(byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position(), 0, byteBuffer.array()));
                            }
                            p0Var.f11213a++;
                            p0Var.f11215c = byteBuffer;
                            iVar.c();
                            iVar.k(((ByteBuffer) p0Var.f11215c).remaining());
                            iVar.d.put((ByteBuffer) p0Var.f11215c);
                            iVar.l();
                        }
                        gVar = gVar2;
                    }
                    if (!gVar.n(iVar)) {
                        this.f4196w0 = true;
                        break;
                    }
                    r12 = 0;
                }
            } else {
                U(bVar);
                break;
            }
        }
        if (gVar.v > 0) {
            gVar.l();
        }
        if (gVar.v <= 0 && !this.H0 && !this.f4197x0) {
            return false;
        }
        return true;
    }

    public void W() {
    }

    public void f0() {
    }

    public void N(n3.i iVar) {
    }

    public void a0(n0 n0Var) {
    }
}
