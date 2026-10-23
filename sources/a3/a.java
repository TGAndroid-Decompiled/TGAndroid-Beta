package a3;

import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import b2.a2;
import v7.u6;
public abstract class a extends i2.b {
    public final long I;
    public final int J;
    public final n4.s K;
    public final e2.j0 L;
    public final h2.h M;
    public b2.w N;
    public b2.w O;
    public h2.e P;
    public h2.h Q;
    public VideoDecoderOutputBuffer R;
    public int S;
    public Surface T;
    public Surface U;
    public y V;
    public n2.h W;
    public n2.h X;
    public int Y;
    public boolean Z;
    public int f44a0;
    public long f45b0;
    public long f46c0;
    public boolean f47d0;
    public boolean f48e0;
    public boolean f49f0;
    public a2 f50g0;
    public long f51h0;
    public int f52i0;
    public int f53j0;
    public int f54k0;
    public long f55l0;
    public i2.f m0;

    public a(long j10, Handler handler, m0 m0Var, int i10) {
        super(2);
        this.I = j10;
        this.J = i10;
        this.f46c0 = -9223372036854775807L;
        this.L = new e2.j0();
        this.M = new h2.h(0, 0);
        this.K = new n4.s(handler, m0Var);
        this.Y = 0;
        this.S = -1;
        this.f44a0 = 0;
        this.m0 = new Object();
    }

    public abstract h2.e F(b2.w wVar);

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
            i2.f fVar = this.m0;
            int i10 = fVar.f12345f;
            int i11 = videoDecoderOutputBuffer.skippedOutputBufferCount;
            fVar.f12345f = i10 + i11;
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
            b2.w wVar = (b2.w) j0Var.g(j12);
            if (wVar != null) {
                this.O = wVar;
            } else if (this.O == null) {
                this.O = (b2.w) j0Var.f();
            }
            long j14 = j12 - this.v;
            if (this.f12315n == 2) {
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
                b2.w wVar2 = this.O;
                wVar2.getClass();
                M(videoDecoderOutputBuffer2, j14, wVar2);
            } else {
                if (this.f12315n == 2) {
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
                            this.m0.f12348j++;
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
                            b2.w wVar3 = this.O;
                            wVar3.getClass();
                            M(videoDecoderOutputBuffer2, j14, wVar3);
                        }
                    }
                }
                z11 = z10;
            }
            z11 = true;
        } else {
            z10 = false;
            if (j13 < -30000) {
                this.m0.f12345f++;
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
        lVar.a(this.f12318w);
        this.Z = false;
    }

    public final void J() {
        n4.s sVar = this.K;
        if (this.P == null) {
            n2.h hVar = this.X;
            i2.e.D(this.W, hVar);
            this.W = hVar;
            if (hVar != null && hVar.h() == null && this.W.g() == null) {
                return;
            }
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                b2.w wVar = this.N;
                wVar.getClass();
                h2.e F = F(wVar);
                this.P = F;
                ((h2.l) F).a(this.f12318w);
                O(this.S);
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                h2.e eVar = this.P;
                eVar.getClass();
                String name = eVar.getName();
                long j10 = elapsedRealtime2 - elapsedRealtime;
                Handler handler = (Handler) sVar.f17125b;
                if (handler != null) {
                    handler.post(new h0(sVar, name, elapsedRealtime2, j10, 0));
                }
                this.m0.f12342a++;
            } catch (h2.f e) {
                e2.a.d("DecoderVideoRenderer", "Video codec error", e);
                Handler handler2 = (Handler) sVar.f17125b;
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
        i2.g gVar;
        this.f47d0 = true;
        b2.w wVar = (b2.w) bVar.f44452c;
        wVar.getClass();
        n2.h hVar = (n2.h) bVar.f44451b;
        i2.e.D(this.X, hVar);
        this.X = hVar;
        b2.w wVar2 = this.N;
        this.N = wVar;
        h2.e eVar = this.P;
        n4.s sVar = this.K;
        if (eVar == null) {
            J();
            b2.w wVar3 = this.N;
            wVar3.getClass();
            Handler handler = (Handler) sVar.f17125b;
            if (handler != null) {
                handler.post(new l0(sVar, wVar3, null, 0));
                return;
            }
            return;
        }
        if (hVar != this.W) {
            String name = eVar.getName();
            wVar2.getClass();
            gVar = new i2.g(name, wVar2, wVar, 0, 128);
        } else {
            String name2 = eVar.getName();
            wVar2.getClass();
            gVar = new i2.g(name2, wVar2, wVar, 0, 8);
        }
        if (gVar.d == 0) {
            if (this.Z) {
                this.Y = 1;
            } else {
                L();
                J();
            }
        }
        b2.w wVar4 = this.N;
        wVar4.getClass();
        Handler handler2 = (Handler) sVar.f17125b;
        if (handler2 != null) {
            handler2.post(new l0(sVar, wVar4, gVar, 0));
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
            this.m0.f12343b++;
            eVar.release();
            String name = this.P.getName();
            n4.s sVar = this.K;
            Handler handler = (Handler) sVar.f17125b;
            if (handler != null) {
                handler.post(new a1.f(6, sVar, name));
            }
            this.P = null;
        }
        i2.e.D(this.W, null);
        this.W = null;
    }

    public final void M(VideoDecoderOutputBuffer videoDecoderOutputBuffer, long j10, b2.w wVar) {
        y yVar = this.V;
        if (yVar != null) {
            this.h.getClass();
            yVar.b(j10, System.nanoTime(), wVar, null);
        }
        this.f55l0 = e2.m0.S(SystemClock.elapsedRealtime());
        if (videoDecoderOutputBuffer.mode == 1 && this.U != null) {
            int i10 = videoDecoderOutputBuffer.width;
            int i11 = videoDecoderOutputBuffer.height;
            a2 a2Var = this.f50g0;
            n4.s sVar = this.K;
            if (a2Var == null || a2Var.f3693a != i10 || a2Var.f3694b != i11) {
                a2 a2Var2 = new a2(i10, i11);
                this.f50g0 = a2Var2;
                sVar.I(a2Var2);
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
                    sVar.D(surface2);
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
        i2.f fVar = this.m0;
        fVar.h += i10;
        int i13 = i10 + i11;
        fVar.f12346g += i13;
        this.f52i0 += i13;
        int i14 = this.f53j0 + i13;
        this.f53j0 = i14;
        fVar.f12347i = Math.max(i14, fVar.f12347i);
        int i15 = this.J;
        if (i15 > 0 && (i12 = this.f52i0) >= i15 && i12 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f51h0;
            int i16 = this.f52i0;
            n4.s sVar = this.K;
            Handler handler = (Handler) sVar.f17125b;
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
                    a2 a2Var = this.f50g0;
                    if (a2Var != null) {
                        sVar.I(a2Var);
                    }
                    this.f44a0 = Math.min(this.f44a0, 1);
                    if (this.f12315n == 2) {
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
                a2 a2Var2 = this.f50g0;
                if (a2Var2 != null) {
                    sVar.I(a2Var2);
                }
                if (this.f44a0 == 3 && (surface = this.T) != null) {
                    sVar.D(surface);
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
            i2.e.D(this.X, null);
            this.X = null;
            L();
        } finally {
            sVar.s(this.m0);
        }
    }

    @Override
    public final void o(boolean z10, boolean z11) {
        ?? obj = new Object();
        this.m0 = obj;
        n4.s sVar = this.K;
        Handler handler = (Handler) sVar.f17125b;
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
        if (j0Var.j() > 0) {
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
            Handler handler = (Handler) sVar.f17125b;
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
                qf.b bVar = this.f12313c;
                bVar.A();
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
                    Handler handler = (Handler) sVar.f17125b;
                    if (handler != null) {
                        handler.post(new a1.f(5, sVar, e));
                    }
                    throw d(e, this.N, false, 4003);
                }
            }
        }
    }

    @Override
    public final void u(b2.w[] wVarArr, long j10, long j11, u2.g0 g0Var) {
    }
}
