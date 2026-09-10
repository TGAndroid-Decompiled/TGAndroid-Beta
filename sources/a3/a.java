package a3;

import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import b2.x1;
public abstract class a extends i2.f {
    public final long I;
    public final int J;
    public final of.b K;
    public final e2.a0 L;
    public final h2.h M;
    public b2.s N;
    public b2.s O;
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
    public int f45a0;
    public long f46b0;
    public long f47c0;
    public boolean f48d0;
    public boolean f49e0;
    public boolean f50f0;
    public x1 f51g0;
    public long f52h0;
    public int f53i0;
    public int f54j0;
    public int f55k0;
    public long f56l0;
    public i2.g m0;

    public a(long j3, Handler handler, l0 l0Var, int i10) {
        super(2);
        this.I = j3;
        this.J = i10;
        this.f47c0 = -9223372036854775807L;
        this.L = new e2.a0();
        this.M = new h2.h(0, 0);
        this.K = new of.b(handler, l0Var);
        this.Y = 0;
        this.S = -1;
        this.f45a0 = 0;
        this.m0 = new Object();
    }

    public abstract h2.e C(b2.s sVar);

    public final boolean D(long r19) {
        throw new UnsupportedOperationException("Method not decompiled: a3.a.D(long):boolean");
    }

    public final boolean E() {
        throw new UnsupportedOperationException("Method not decompiled: a3.a.E():boolean");
    }

    public final void F() {
        this.f55k0 = 0;
        if (this.Y != 0) {
            I();
            G();
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
        lVar.a(this.f10180w);
        this.Z = false;
    }

    public final void G() {
        of.b bVar = this.K;
        if (this.P == null) {
            n2.g gVar = this.X;
            hc.b.D(this.W, gVar);
            this.W = gVar;
            if (gVar != null && gVar.h() == null && this.W.g() == null) {
                return;
            }
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                b2.s sVar = this.N;
                sVar.getClass();
                h2.e C = C(sVar);
                this.P = C;
                ((h2.l) C).a(this.f10180w);
                L(this.S);
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                h2.e eVar = this.P;
                eVar.getClass();
                String name = eVar.getName();
                long j3 = elapsedRealtime2 - elapsedRealtime;
                Handler handler = (Handler) bVar.f14294b;
                if (handler != null) {
                    handler.post(new g0(bVar, name, elapsedRealtime2, j3, 0));
                }
                this.m0.f10204a++;
            } catch (h2.f e) {
                e2.a.f("DecoderVideoRenderer", "Video codec error", e);
                Handler handler2 = (Handler) bVar.f14294b;
                if (handler2 != null) {
                    handler2.post(new a1.e(3, bVar, e));
                }
                throw d(e, this.N, false, 4001);
            } catch (OutOfMemoryError e7) {
                throw d(e7, this.N, false, 4001);
            }
        }
    }

    public final void H(of.b bVar) {
        i2.h hVar;
        this.f48d0 = true;
        b2.s sVar = (b2.s) bVar.f14295c;
        sVar.getClass();
        n2.g gVar = (n2.g) bVar.f14294b;
        hc.b.D(this.X, gVar);
        this.X = gVar;
        b2.s sVar2 = this.N;
        this.N = sVar;
        h2.e eVar = this.P;
        of.b bVar2 = this.K;
        if (eVar == null) {
            G();
            b2.s sVar3 = this.N;
            sVar3.getClass();
            Handler handler = (Handler) bVar2.f14294b;
            if (handler != null) {
                handler.post(new k0(bVar2, sVar3, null, 0));
                return;
            }
            return;
        }
        if (gVar != this.W) {
            String name = eVar.getName();
            sVar2.getClass();
            hVar = new i2.h(name, sVar2, sVar, 0, 128);
        } else {
            String name2 = eVar.getName();
            sVar2.getClass();
            hVar = new i2.h(name2, sVar2, sVar, 0, 8);
        }
        if (hVar.d == 0) {
            if (this.Z) {
                this.Y = 1;
            } else {
                I();
                G();
            }
        }
        b2.s sVar4 = this.N;
        sVar4.getClass();
        Handler handler2 = (Handler) bVar2.f14294b;
        if (handler2 != null) {
            handler2.post(new k0(bVar2, sVar4, hVar, 0));
        }
    }

    public final void I() {
        this.Q = null;
        this.R = null;
        this.Y = 0;
        this.Z = false;
        this.f55k0 = 0;
        h2.e eVar = this.P;
        if (eVar != null) {
            this.m0.f10205b++;
            eVar.release();
            String name = this.P.getName();
            of.b bVar = this.K;
            Handler handler = (Handler) bVar.f14294b;
            if (handler != null) {
                handler.post(new a1.e(4, bVar, name));
            }
            this.P = null;
        }
        hc.b.D(this.W, null);
        this.W = null;
    }

    public final void J(VideoDecoderOutputBuffer videoDecoderOutputBuffer, long j3, b2.s sVar) {
        y yVar = this.V;
        if (yVar != null) {
            this.h.getClass();
            yVar.a(j3, System.nanoTime(), sVar, null);
        }
        this.f56l0 = e2.d0.Q(SystemClock.elapsedRealtime());
        if (videoDecoderOutputBuffer.mode == 1 && this.U != null) {
            int i10 = videoDecoderOutputBuffer.width;
            int i11 = videoDecoderOutputBuffer.height;
            x1 x1Var = this.f51g0;
            of.b bVar = this.K;
            if (x1Var == null || x1Var.f2045a != i10 || x1Var.f2046b != i11) {
                x1 x1Var2 = new x1(i10, i11);
                this.f51g0 = x1Var2;
                bVar.r0(x1Var2);
            }
            Surface surface = this.U;
            surface.getClass();
            K(videoDecoderOutputBuffer, surface);
            this.f54j0 = 0;
            this.m0.e++;
            if (this.f45a0 != 3) {
                this.f45a0 = 3;
                Surface surface2 = this.T;
                if (surface2 != null) {
                    bVar.n0(surface2);
                    return;
                }
                return;
            }
            return;
        }
        M(0, 1);
        videoDecoderOutputBuffer.release();
    }

    public abstract void K(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface);

    public abstract void L(int i10);

    public final void M(int i10, int i11) {
        int i12;
        i2.g gVar = this.m0;
        gVar.h += i10;
        int i13 = i10 + i11;
        gVar.f10208g += i13;
        this.f53i0 += i13;
        int i14 = this.f54j0 + i13;
        this.f54j0 = i14;
        gVar.f10209i = Math.max(i14, gVar.f10209i);
        int i15 = this.J;
        if (i15 > 0 && (i12 = this.f53i0) >= i15 && i12 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.f52h0;
            int i16 = this.f53i0;
            of.b bVar = this.K;
            Handler handler = (Handler) bVar.f14294b;
            if (handler != null) {
                handler.post(new i0(bVar, i16, j3));
            }
            this.f53i0 = 0;
            this.f52h0 = elapsedRealtime;
        }
    }

    @Override
    public final void c(int i10, Object obj) {
        Surface surface;
        long j3;
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
            of.b bVar = this.K;
            if (surface2 != obj) {
                this.T = (Surface) obj;
                if (obj != null) {
                    if (this.P != null) {
                        L(this.S);
                    }
                    x1 x1Var = this.f51g0;
                    if (x1Var != null) {
                        bVar.r0(x1Var);
                    }
                    this.f45a0 = Math.min(this.f45a0, 1);
                    if (this.f10177n == 2) {
                        long j10 = this.I;
                        if (j10 > 0) {
                            j3 = SystemClock.elapsedRealtime() + j10;
                        } else {
                            j3 = -9223372036854775807L;
                        }
                        this.f47c0 = j3;
                        return;
                    }
                    return;
                }
                this.f51g0 = null;
                this.f45a0 = Math.min(this.f45a0, 1);
            } else if (obj != null) {
                x1 x1Var2 = this.f51g0;
                if (x1Var2 != null) {
                    bVar.r0(x1Var2);
                }
                if (this.f45a0 == 3 && (surface = this.T) != null) {
                    bVar.n0(surface);
                }
            }
        } else if (i10 == 7) {
            this.V = (y) obj;
        }
    }

    @Override
    public final void e() {
        if (this.f45a0 == 0) {
            this.f45a0 = 1;
        }
    }

    @Override
    public final boolean l() {
        return this.f50f0;
    }

    @Override
    public final boolean m() {
        if (this.N != null && ((n() || this.R != null) && (this.f45a0 == 3 || this.S == -1))) {
            this.f47c0 = -9223372036854775807L;
            return true;
        } else if (this.f47c0 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f47c0) {
                return true;
            }
            this.f47c0 = -9223372036854775807L;
            return false;
        }
    }

    @Override
    public final void o() {
        of.b bVar = this.K;
        this.N = null;
        this.f51g0 = null;
        this.f45a0 = Math.min(this.f45a0, 0);
        try {
            hc.b.D(this.X, null);
            this.X = null;
            I();
        } finally {
            bVar.J(this.m0);
        }
    }

    @Override
    public final void p(boolean z10, boolean z11) {
        ?? obj = new Object();
        this.m0 = obj;
        of.b bVar = this.K;
        Handler handler = (Handler) bVar.f14294b;
        if (handler != null) {
            handler.post(new j0(bVar, obj, 0));
        }
        this.f45a0 = z11 ? 1 : 0;
    }

    @Override
    public final void q(long j3, boolean z10) {
        this.f49e0 = false;
        this.f50f0 = false;
        this.f45a0 = Math.min(this.f45a0, 1);
        long j10 = -9223372036854775807L;
        this.f46b0 = -9223372036854775807L;
        this.f54j0 = 0;
        if (this.P != null) {
            F();
        }
        if (z10) {
            long j11 = this.I;
            if (j11 > 0) {
                j10 = SystemClock.elapsedRealtime() + j11;
            }
            this.f47c0 = j10;
        } else {
            this.f47c0 = -9223372036854775807L;
        }
        e2.a0 a0Var = this.L;
        if (a0Var.i() > 0) {
            this.f48d0 = true;
        }
        a0Var.c();
    }

    @Override
    public final void t() {
        this.f53i0 = 0;
        this.f52h0 = SystemClock.elapsedRealtime();
        this.f56l0 = e2.d0.Q(SystemClock.elapsedRealtime());
    }

    @Override
    public final void u() {
        this.f47c0 = -9223372036854775807L;
        if (this.f53i0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.f52h0;
            int i10 = this.f53i0;
            of.b bVar = this.K;
            Handler handler = (Handler) bVar.f14294b;
            if (handler != null) {
                handler.post(new i0(bVar, i10, j3));
            }
            this.f53i0 = 0;
            this.f52h0 = elapsedRealtime;
        }
    }

    @Override
    public final void x(long j3, long j10) {
        if (!this.f50f0) {
            if (this.N == null) {
                of.b bVar = this.f10175c;
                bVar.F();
                this.M.clear();
                int w10 = w(bVar, this.M, 2);
                if (w10 == -5) {
                    H(bVar);
                } else if (w10 == -4) {
                    e2.d.g(this.M.isEndOfStream());
                    this.f49e0 = true;
                    this.f50f0 = true;
                    return;
                } else {
                    return;
                }
            }
            G();
            if (this.P != null) {
                try {
                    Trace.beginSection("drainAndFeed");
                    while (D(j3)) {
                    }
                    while (E()) {
                    }
                    Trace.endSection();
                    synchronized (this.m0) {
                    }
                } catch (h2.f e) {
                    e2.a.f("DecoderVideoRenderer", "Video codec error", e);
                    of.b bVar2 = this.K;
                    Handler handler = (Handler) bVar2.f14294b;
                    if (handler != null) {
                        handler.post(new a1.e(3, bVar2, e));
                    }
                    throw d(e, this.N, false, 4003);
                }
            }
        }
    }

    @Override
    public final void v(b2.s[] sVarArr, long j3, long j10, u2.g0 g0Var) {
    }
}
