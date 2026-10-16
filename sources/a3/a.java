package a3;

import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import b2.b2;
import v7.u6;
public abstract class a extends i2.b {
    public final long I;
    public final int J;
    public final n4.s K;
    public final e2.j0 L;
    public final h2.h M;
    public b2.x N;
    public b2.x O;
    public h2.e P;
    public h2.h Q;
    public VideoDecoderOutputBuffer R;
    public int S;
    public Surface T;
    public Surface U;
    public y V;
    public n2.g W;
    public n2.g X;
    public int Y;
    public boolean Z;
    public int f44a0;
    public long f45b0;
    public long f46c0;
    public boolean f47d0;
    public boolean f48e0;
    public boolean f49f0;
    public b2 f50g0;
    public long f51h0;
    public int f52i0;
    public int f53j0;
    public int f54k0;
    public long f55l0;
    public i2.e m0;

    public a(long j10, Handler handler, m0 m0Var, int i10) {
        super(2);
        this.I = j10;
        this.J = i10;
        this.f46c0 = -9223372036854775807L;
        this.L = new e2.j0(0, (byte) 0);
        this.M = new h2.h(0, 0);
        this.K = new n4.s(handler, m0Var);
        this.Y = 0;
        this.S = -1;
        this.f44a0 = 0;
        this.m0 = new Object();
    }

    public abstract h2.e F(b2.x xVar);

    public final boolean G(long j10) {
        boolean z10;
        boolean z11;
        boolean z12;
        long j11;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        if (this.R == null) {
            h2.e eVar = this.P;
            eVar.getClass();
            VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) ((h2.l) eVar).c();
            this.R = videoDecoderOutputBuffer;
            if (videoDecoderOutputBuffer == null) {
                return false;
            }
            i2.e eVar2 = this.m0;
            int i10 = eVar2.f10947f;
            int i11 = videoDecoderOutputBuffer.skippedOutputBufferCount;
            eVar2.f10947f = i10 + i11;
            this.f54k0 -= i11;
        }
        if (this.R.isEndOfStream()) {
            if (this.Y == 2) {
                L();
                J();
                return false;
            }
            this.R.release();
            this.R = null;
            this.f49f0 = true;
            return false;
        }
        if (this.f45b0 == -9223372036854775807L) {
            this.f45b0 = j10;
        }
        VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.R;
        videoDecoderOutputBuffer2.getClass();
        long j12 = videoDecoderOutputBuffer2.timeUs;
        long j13 = j12 - j10;
        if (this.S != -1) {
            e2.j0 j0Var = this.L;
            b2.x xVar = (b2.x) j0Var.i(j12);
            if (xVar != null) {
                this.O = xVar;
            } else if (this.O == null) {
                this.O = (b2.x) j0Var.h();
            }
            long j14 = j12 - this.v;
            if (this.f10923n == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            int i12 = this.f44a0;
            if (i12 != 0) {
                if (i12 != 1) {
                    j11 = -30000;
                    if (i12 == 3) {
                        long S = e2.m0.S(SystemClock.elapsedRealtime()) - this.f55l0;
                        if (!z12 || j13 >= -30000 || S <= 100000) {
                            z12 = false;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    j11 = -30000;
                }
                z12 = true;
            } else {
                j11 = -30000;
            }
            if (z12) {
                b2.x xVar2 = this.O;
                xVar2.getClass();
                M(videoDecoderOutputBuffer2, j14, xVar2);
            } else {
                if (this.f10923n == 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13 || j10 == this.f45b0) {
                    z10 = false;
                } else {
                    if (j13 < -500000) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        int B = B(j10);
                        if (B == 0) {
                            z16 = false;
                        } else {
                            this.m0.f10950j++;
                            P(B, this.f54k0);
                            I();
                            z16 = true;
                        }
                        if (z16) {
                            z11 = false;
                        }
                    }
                    if (j13 < j11) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        P(0, 1);
                        videoDecoderOutputBuffer2.release();
                    } else {
                        z10 = false;
                        if (j13 < 30000) {
                            b2.x xVar3 = this.O;
                            xVar3.getClass();
                            M(videoDecoderOutputBuffer2, j14, xVar3);
                        }
                    }
                }
                z11 = z10;
            }
            z11 = true;
        } else {
            z10 = false;
            if (j13 < -30000) {
                this.m0.f10947f++;
                videoDecoderOutputBuffer2.release();
                z11 = true;
            }
            z11 = z10;
        }
        if (z11) {
            this.R.getClass();
            this.f54k0--;
            this.R = null;
        }
        return z11;
    }

    public final boolean H() {
        throw new UnsupportedOperationException("Method not decompiled: a3.a.H():boolean");
    }

    public final void I() {
        this.f54k0 = 0;
        if (this.Y != 0) {
            L();
            J();
            return;
        }
        this.Q = null;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.R;
        if (videoDecoderOutputBuffer != null) {
            videoDecoderOutputBuffer.release();
            this.R = null;
        }
        h2.e eVar = this.P;
        eVar.getClass();
        h2.l lVar = (h2.l) eVar;
        lVar.flush();
        lVar.a(this.f10926w);
        this.Z = false;
    }

    public final void J() {
        n4.s sVar = this.K;
        if (this.P == null) {
            n2.g gVar = this.X;
            i2.d.D(this.W, gVar);
            this.W = gVar;
            if (gVar != null && gVar.h() == null && this.W.g() == null) {
                return;
            }
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                b2.x xVar = this.N;
                xVar.getClass();
                h2.e F = F(xVar);
                this.P = F;
                ((h2.l) F).a(this.f10926w);
                O(this.S);
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                h2.e eVar = this.P;
                eVar.getClass();
                String name = eVar.getName();
                long j10 = elapsedRealtime2 - elapsedRealtime;
                Handler handler = (Handler) sVar.f15745b;
                if (handler != null) {
                    handler.post(new h0(sVar, name, elapsedRealtime2, j10, 0));
                }
                this.m0.f10944a++;
            } catch (h2.f e) {
                e2.a.d("DecoderVideoRenderer", "Video codec error", e);
                Handler handler2 = (Handler) sVar.f15745b;
                if (handler2 != null) {
                    handler2.post(new a1.f(5, sVar, e));
                }
                throw d(e, this.N, false, 4001);
            } catch (OutOfMemoryError e7) {
                throw d(e7, this.N, false, 4001);
            }
        }
    }

    public final void K(qf.b bVar) {
        i2.f fVar;
        this.f47d0 = true;
        b2.x xVar = (b2.x) bVar.f43098c;
        xVar.getClass();
        n2.g gVar = (n2.g) bVar.f43097b;
        i2.d.D(this.X, gVar);
        this.X = gVar;
        b2.x xVar2 = this.N;
        this.N = xVar;
        h2.e eVar = this.P;
        n4.s sVar = this.K;
        if (eVar == null) {
            J();
            b2.x xVar3 = this.N;
            xVar3.getClass();
            Handler handler = (Handler) sVar.f15745b;
            if (handler != null) {
                handler.post(new l0(sVar, xVar3, null, 0));
                return;
            }
            return;
        }
        if (gVar != this.W) {
            String name = eVar.getName();
            xVar2.getClass();
            fVar = new i2.f(name, xVar2, xVar, 0, 128);
        } else {
            String name2 = eVar.getName();
            xVar2.getClass();
            fVar = new i2.f(name2, xVar2, xVar, 0, 8);
        }
        if (fVar.d == 0) {
            if (this.Z) {
                this.Y = 1;
            } else {
                L();
                J();
            }
        }
        b2.x xVar4 = this.N;
        xVar4.getClass();
        Handler handler2 = (Handler) sVar.f15745b;
        if (handler2 != null) {
            handler2.post(new l0(sVar, xVar4, fVar, 0));
        }
    }

    public final void L() {
        this.Q = null;
        this.R = null;
        this.Y = 0;
        this.Z = false;
        this.f54k0 = 0;
        h2.e eVar = this.P;
        if (eVar != null) {
            this.m0.f10945b++;
            eVar.release();
            String name = this.P.getName();
            n4.s sVar = this.K;
            Handler handler = (Handler) sVar.f15745b;
            if (handler != null) {
                handler.post(new a1.f(6, sVar, name));
            }
            this.P = null;
        }
        i2.d.D(this.W, null);
        this.W = null;
    }

    public final void M(VideoDecoderOutputBuffer videoDecoderOutputBuffer, long j10, b2.x xVar) {
        y yVar = this.V;
        if (yVar != null) {
            this.h.getClass();
            yVar.a(j10, System.nanoTime(), xVar, null);
        }
        this.f55l0 = e2.m0.S(SystemClock.elapsedRealtime());
        if (videoDecoderOutputBuffer.mode == 1 && this.U != null) {
            int i10 = videoDecoderOutputBuffer.width;
            int i11 = videoDecoderOutputBuffer.height;
            b2 b2Var = this.f50g0;
            n4.s sVar = this.K;
            if (b2Var == null || b2Var.f2087a != i10 || b2Var.f2088b != i11) {
                b2 b2Var2 = new b2(i10, i11);
                this.f50g0 = b2Var2;
                sVar.H(b2Var2);
            }
            Surface surface = this.U;
            surface.getClass();
            N(videoDecoderOutputBuffer, surface);
            this.f53j0 = 0;
            this.m0.e++;
            if (this.f44a0 != 3) {
                this.f44a0 = 3;
                Surface surface2 = this.T;
                if (surface2 != null) {
                    sVar.w(surface2);
                    return;
                }
                return;
            }
            return;
        }
        P(0, 1);
        videoDecoderOutputBuffer.release();
    }

    public abstract void N(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface);

    public abstract void O(int i10);

    public final void P(int i10, int i11) {
        int i12;
        i2.e eVar = this.m0;
        eVar.h += i10;
        int i13 = i10 + i11;
        eVar.f10948g += i13;
        this.f52i0 += i13;
        int i14 = this.f53j0 + i13;
        this.f53j0 = i14;
        eVar.f10949i = Math.max(i14, eVar.f10949i);
        int i15 = this.J;
        if (i15 > 0 && (i12 = this.f52i0) >= i15 && i12 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f51h0;
            int i16 = this.f52i0;
            n4.s sVar = this.K;
            Handler handler = (Handler) sVar.f15745b;
            if (handler != null) {
                handler.post(new j0(sVar, i16, j10));
            }
            this.f52i0 = 0;
            this.f51h0 = elapsedRealtime;
        }
    }

    @Override
    public final void c(int i10, Object obj) {
        Surface surface;
        long j10;
        if (i10 == 1) {
            if (obj instanceof Surface) {
                this.U = (Surface) obj;
                this.S = 1;
            } else {
                this.U = null;
                this.S = -1;
                obj = null;
            }
            Surface surface2 = this.T;
            n4.s sVar = this.K;
            if (surface2 != obj) {
                this.T = (Surface) obj;
                if (obj != null) {
                    if (this.P != null) {
                        O(this.S);
                    }
                    b2 b2Var = this.f50g0;
                    if (b2Var != null) {
                        sVar.H(b2Var);
                    }
                    this.f44a0 = Math.min(this.f44a0, 1);
                    if (this.f10923n == 2) {
                        long j11 = this.I;
                        if (j11 > 0) {
                            j10 = SystemClock.elapsedRealtime() + j11;
                        } else {
                            j10 = -9223372036854775807L;
                        }
                        this.f46c0 = j10;
                        return;
                    }
                    return;
                }
                this.f50g0 = null;
                this.f44a0 = Math.min(this.f44a0, 1);
            } else if (obj != null) {
                b2 b2Var2 = this.f50g0;
                if (b2Var2 != null) {
                    sVar.H(b2Var2);
                }
                if (this.f44a0 == 3 && (surface = this.T) != null) {
                    sVar.w(surface);
                }
            }
        } else if (i10 == 7) {
            this.V = (y) obj;
        }
    }

    @Override
    public final void e() {
        if (this.f44a0 == 0) {
            this.f44a0 = 1;
        }
    }

    @Override
    public final boolean l() {
        return this.f49f0;
    }

    @Override
    public final boolean m() {
        throw new UnsupportedOperationException("Method not decompiled: a3.a.m():boolean");
    }

    @Override
    public final void n() {
        n4.s sVar = this.K;
        this.N = null;
        this.f50g0 = null;
        this.f44a0 = Math.min(this.f44a0, 0);
        try {
            i2.d.D(this.X, null);
            this.X = null;
            L();
        } finally {
            sVar.j(this.m0);
        }
    }

    @Override
    public final void o(boolean z10, boolean z11) {
        ?? obj = new Object();
        this.m0 = obj;
        n4.s sVar = this.K;
        Handler handler = (Handler) sVar.f15745b;
        if (handler != null) {
            handler.post(new k0(sVar, obj, 0));
        }
        this.f44a0 = z11 ? 1 : 0;
    }

    @Override
    public final void p(long j10, boolean z10, boolean z11) {
        this.f48e0 = false;
        this.f49f0 = false;
        this.f44a0 = Math.min(this.f44a0, 1);
        long j11 = -9223372036854775807L;
        this.f45b0 = -9223372036854775807L;
        this.f53j0 = 0;
        if (this.P != null) {
            I();
        }
        if (z10) {
            long j12 = this.I;
            if (j12 > 0) {
                j11 = SystemClock.elapsedRealtime() + j12;
            }
            this.f46c0 = j11;
        } else {
            this.f46c0 = -9223372036854775807L;
        }
        e2.j0 j0Var = this.L;
        if (j0Var.m() > 0) {
            this.f47d0 = true;
        }
        j0Var.c();
    }

    @Override
    public final void s() {
        this.f52i0 = 0;
        this.f51h0 = SystemClock.elapsedRealtime();
        this.f55l0 = e2.m0.S(SystemClock.elapsedRealtime());
    }

    @Override
    public final void t() {
        this.f46c0 = -9223372036854775807L;
        if (this.f52i0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f51h0;
            int i10 = this.f52i0;
            n4.s sVar = this.K;
            Handler handler = (Handler) sVar.f15745b;
            if (handler != null) {
                handler.post(new j0(sVar, i10, j10));
            }
            this.f52i0 = 0;
            this.f51h0 = elapsedRealtime;
        }
    }

    @Override
    public final void x(long j10, long j11) {
        if (!this.f49f0) {
            if (this.N == null) {
                qf.b bVar = this.f10921c;
                bVar.x();
                this.M.clear();
                int w9 = w(bVar, this.M, 2);
                if (w9 == -5) {
                    K(bVar);
                } else if (w9 == -4) {
                    u6.p(this.M.isEndOfStream());
                    this.f48e0 = true;
                    this.f49f0 = true;
                    return;
                } else {
                    return;
                }
            }
            J();
            if (this.P != null) {
                try {
                    Trace.beginSection("drainAndFeed");
                    while (G(j10)) {
                    }
                    while (H()) {
                    }
                    Trace.endSection();
                    synchronized (this.m0) {
                    }
                } catch (h2.f e) {
                    e2.a.d("DecoderVideoRenderer", "Video codec error", e);
                    n4.s sVar = this.K;
                    Handler handler = (Handler) sVar.f15745b;
                    if (handler != null) {
                        handler.post(new a1.f(5, sVar, e));
                    }
                    throw d(e, this.N, false, 4003);
                }
            }
        }
    }

    @Override
    public final void u(b2.x[] xVarArr, long j10, long j11, u2.g0 g0Var) {
    }
}
