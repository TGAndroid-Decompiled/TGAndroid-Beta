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
    public final pf.b K;
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
    public int f49a0;
    public long f50b0;
    public long f51c0;
    public boolean f52d0;
    public boolean f53e0;
    public boolean f54f0;
    public x1 f55g0;
    public long f56h0;
    public int f57i0;
    public int f58j0;
    public int f59k0;
    public long f60l0;
    public i2.h m0;

    public a(long j3, Handler handler, l0 l0Var, int i10) {
        super(2);
        this.I = j3;
        this.J = i10;
        this.f51c0 = -9223372036854775807L;
        this.L = new e2.a0();
        this.M = new h2.h(0, 0);
        this.K = new pf.b(handler, l0Var);
        this.Y = 0;
        this.S = -1;
        this.f49a0 = 0;
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
        this.f59k0 = 0;
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
        lVar.a(this.f11528w);
        this.Z = false;
    }

    public final void G() {
        pf.b bVar = this.K;
        if (this.P == null) {
            n2.g gVar = this.X;
            i2.g.D(this.W, gVar);
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
                ((h2.l) C).a(this.f11528w);
                L(this.S);
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                h2.e eVar = this.P;
                eVar.getClass();
                String name = eVar.getName();
                long j3 = elapsedRealtime2 - elapsedRealtime;
                Handler handler = (Handler) bVar.f44073b;
                if (handler != null) {
                    handler.post(new g0(bVar, name, elapsedRealtime2, j3, 0));
                }
                this.m0.f11598a++;
            } catch (h2.f e7) {
                e2.a.f("DecoderVideoRenderer", "Video codec error", e7);
                Handler handler2 = (Handler) bVar.f44073b;
                if (handler2 != null) {
                    handler2.post(new a1.e(3, bVar, e7));
                }
                throw c(e7, this.N, false, 4001);
            } catch (OutOfMemoryError e10) {
                throw c(e10, this.N, false, 4001);
            }
        }
    }

    public final void H(n4.y yVar) {
        i2.i iVar;
        this.f52d0 = true;
        b2.s sVar = (b2.s) yVar.f16524c;
        sVar.getClass();
        n2.g gVar = (n2.g) yVar.f16523b;
        i2.g.D(this.X, gVar);
        this.X = gVar;
        b2.s sVar2 = this.N;
        this.N = sVar;
        h2.e eVar = this.P;
        pf.b bVar = this.K;
        if (eVar == null) {
            G();
            b2.s sVar3 = this.N;
            sVar3.getClass();
            Handler handler = (Handler) bVar.f44073b;
            if (handler != null) {
                handler.post(new k0(bVar, sVar3, null, 0));
                return;
            }
            return;
        }
        if (gVar != this.W) {
            String name = eVar.getName();
            sVar2.getClass();
            iVar = new i2.i(name, sVar2, sVar, 0, 128);
        } else {
            String name2 = eVar.getName();
            sVar2.getClass();
            iVar = new i2.i(name2, sVar2, sVar, 0, 8);
        }
        if (iVar.d == 0) {
            if (this.Z) {
                this.Y = 1;
            } else {
                I();
                G();
            }
        }
        b2.s sVar4 = this.N;
        sVar4.getClass();
        Handler handler2 = (Handler) bVar.f44073b;
        if (handler2 != null) {
            handler2.post(new k0(bVar, sVar4, iVar, 0));
        }
    }

    public final void I() {
        this.Q = null;
        this.R = null;
        this.Y = 0;
        this.Z = false;
        this.f59k0 = 0;
        h2.e eVar = this.P;
        if (eVar != null) {
            this.m0.f11599b++;
            eVar.release();
            String name = this.P.getName();
            pf.b bVar = this.K;
            Handler handler = (Handler) bVar.f44073b;
            if (handler != null) {
                handler.post(new a1.e(4, bVar, name));
            }
            this.P = null;
        }
        i2.g.D(this.W, null);
        this.W = null;
    }

    public final void J(VideoDecoderOutputBuffer videoDecoderOutputBuffer, long j3, b2.s sVar) {
        y yVar = this.V;
        if (yVar != null) {
            this.h.getClass();
            yVar.c(j3, System.nanoTime(), sVar, null);
        }
        this.f60l0 = e2.d0.Q(SystemClock.elapsedRealtime());
        if (videoDecoderOutputBuffer.mode == 1 && this.U != null) {
            int i10 = videoDecoderOutputBuffer.width;
            int i11 = videoDecoderOutputBuffer.height;
            x1 x1Var = this.f55g0;
            pf.b bVar = this.K;
            if (x1Var == null || x1Var.f2444a != i10 || x1Var.f2445b != i11) {
                x1 x1Var2 = new x1(i10, i11);
                this.f55g0 = x1Var2;
                bVar.l0(x1Var2);
            }
            Surface surface = this.U;
            surface.getClass();
            K(videoDecoderOutputBuffer, surface);
            this.f58j0 = 0;
            this.m0.f11601e++;
            if (this.f49a0 != 3) {
                this.f49a0 = 3;
                Surface surface2 = this.T;
                if (surface2 != null) {
                    bVar.g0(surface2);
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
        i2.h hVar = this.m0;
        hVar.h += i10;
        int i13 = i10 + i11;
        hVar.f11603g += i13;
        this.f57i0 += i13;
        int i14 = this.f58j0 + i13;
        this.f58j0 = i14;
        hVar.f11604i = Math.max(i14, hVar.f11604i);
        int i15 = this.J;
        if (i15 > 0 && (i12 = this.f57i0) >= i15 && i12 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.f56h0;
            int i16 = this.f57i0;
            pf.b bVar = this.K;
            Handler handler = (Handler) bVar.f44073b;
            if (handler != null) {
                handler.post(new i0(bVar, i16, j3));
            }
            this.f57i0 = 0;
            this.f56h0 = elapsedRealtime;
        }
    }

    @Override
    public final void d(int i10, Object obj) {
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
            pf.b bVar = this.K;
            if (surface2 != obj) {
                this.T = (Surface) obj;
                if (obj != null) {
                    if (this.P != null) {
                        L(this.S);
                    }
                    x1 x1Var = this.f55g0;
                    if (x1Var != null) {
                        bVar.l0(x1Var);
                    }
                    this.f49a0 = Math.min(this.f49a0, 1);
                    if (this.f11525n == 2) {
                        long j10 = this.I;
                        if (j10 > 0) {
                            j3 = SystemClock.elapsedRealtime() + j10;
                        } else {
                            j3 = -9223372036854775807L;
                        }
                        this.f51c0 = j3;
                        return;
                    }
                    return;
                }
                this.f55g0 = null;
                this.f49a0 = Math.min(this.f49a0, 1);
            } else if (obj != null) {
                x1 x1Var2 = this.f55g0;
                if (x1Var2 != null) {
                    bVar.l0(x1Var2);
                }
                if (this.f49a0 == 3 && (surface = this.T) != null) {
                    bVar.g0(surface);
                }
            }
        } else if (i10 == 7) {
            this.V = (y) obj;
        }
    }

    @Override
    public final void e() {
        if (this.f49a0 == 0) {
            this.f49a0 = 1;
        }
    }

    @Override
    public final boolean l() {
        return this.f54f0;
    }

    @Override
    public final boolean m() {
        if (this.N != null && ((n() || this.R != null) && (this.f49a0 == 3 || this.S == -1))) {
            this.f51c0 = -9223372036854775807L;
            return true;
        } else if (this.f51c0 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f51c0) {
                return true;
            }
            this.f51c0 = -9223372036854775807L;
            return false;
        }
    }

    @Override
    public final void o() {
        pf.b bVar = this.K;
        this.N = null;
        this.f55g0 = null;
        this.f49a0 = Math.min(this.f49a0, 0);
        try {
            i2.g.D(this.X, null);
            this.X = null;
            I();
        } finally {
            bVar.B(this.m0);
        }
    }

    @Override
    public final void p(boolean z10, boolean z11) {
        ?? obj = new Object();
        this.m0 = obj;
        pf.b bVar = this.K;
        Handler handler = (Handler) bVar.f44073b;
        if (handler != null) {
            handler.post(new j0(bVar, obj, 0));
        }
        this.f49a0 = z11 ? 1 : 0;
    }

    @Override
    public final void q(long j3, boolean z10) {
        this.f53e0 = false;
        this.f54f0 = false;
        this.f49a0 = Math.min(this.f49a0, 1);
        long j10 = -9223372036854775807L;
        this.f50b0 = -9223372036854775807L;
        this.f58j0 = 0;
        if (this.P != null) {
            F();
        }
        if (z10) {
            long j11 = this.I;
            if (j11 > 0) {
                j10 = SystemClock.elapsedRealtime() + j11;
            }
            this.f51c0 = j10;
        } else {
            this.f51c0 = -9223372036854775807L;
        }
        e2.a0 a0Var = this.L;
        if (a0Var.i() > 0) {
            this.f52d0 = true;
        }
        a0Var.c();
    }

    @Override
    public final void t() {
        this.f57i0 = 0;
        this.f56h0 = SystemClock.elapsedRealtime();
        this.f60l0 = e2.d0.Q(SystemClock.elapsedRealtime());
    }

    @Override
    public final void u() {
        this.f51c0 = -9223372036854775807L;
        if (this.f57i0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.f56h0;
            int i10 = this.f57i0;
            pf.b bVar = this.K;
            Handler handler = (Handler) bVar.f44073b;
            if (handler != null) {
                handler.post(new i0(bVar, i10, j3));
            }
            this.f57i0 = 0;
            this.f56h0 = elapsedRealtime;
        }
    }

    @Override
    public final void x(long j3, long j10) {
        if (!this.f54f0) {
            if (this.N == null) {
                n4.y yVar = this.f11522c;
                yVar.A();
                this.M.clear();
                int w10 = w(yVar, this.M, 2);
                if (w10 == -5) {
                    H(yVar);
                } else if (w10 == -4) {
                    e2.d.g(this.M.isEndOfStream());
                    this.f53e0 = true;
                    this.f54f0 = true;
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
                } catch (h2.f e7) {
                    e2.a.f("DecoderVideoRenderer", "Video codec error", e7);
                    pf.b bVar = this.K;
                    Handler handler = (Handler) bVar.f44073b;
                    if (handler != null) {
                        handler.post(new a1.e(3, bVar, e7));
                    }
                    throw c(e7, this.N, false, 4003);
                }
            }
        }
    }

    @Override
    public final void v(b2.s[] sVarArr, long j3, long j10, u2.f0 f0Var) {
    }
}
