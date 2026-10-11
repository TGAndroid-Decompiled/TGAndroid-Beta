package a3;

import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import b2.x1;
import u2.a1;
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
    public int f51a0;
    public long f52b0;
    public long f53c0;
    public boolean f54d0;
    public boolean f55e0;
    public boolean f56f0;
    public x1 f57g0;
    public long f58h0;
    public int f59i0;
    public int f60j0;
    public int f61k0;
    public long f62l0;
    public i2.g m0;

    public a(long j3, Handler handler, l0 l0Var, int i10) {
        super(2);
        this.I = j3;
        this.J = i10;
        this.f53c0 = -9223372036854775807L;
        this.L = new e2.a0(0, (byte) 0);
        this.M = new h2.h(0, 0);
        this.K = new pf.b(handler, l0Var);
        this.Y = 0;
        this.S = -1;
        this.f51a0 = 0;
        this.m0 = new Object();
    }

    public abstract h2.e C(b2.s sVar);

    public final boolean D(long j3) {
        boolean z10;
        boolean z11;
        boolean z12;
        long j10;
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
            i2.g gVar = this.m0;
            int i10 = gVar.f11697f;
            int i11 = videoDecoderOutputBuffer.skippedOutputBufferCount;
            gVar.f11697f = i10 + i11;
            this.f61k0 -= i11;
        }
        if (this.R.isEndOfStream()) {
            if (this.Y == 2) {
                I();
                G();
                return false;
            }
            this.R.release();
            this.R = null;
            this.f56f0 = true;
            return false;
        }
        if (this.f52b0 == -9223372036854775807L) {
            this.f52b0 = j3;
        }
        VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.R;
        videoDecoderOutputBuffer2.getClass();
        long j11 = videoDecoderOutputBuffer2.timeUs;
        long j12 = j11 - j3;
        if (this.S != -1) {
            e2.a0 a0Var = this.L;
            b2.s sVar = (b2.s) a0Var.i(j11);
            if (sVar != null) {
                this.O = sVar;
            } else if (this.O == null) {
                this.O = (b2.s) a0Var.h();
            }
            long j13 = j11 - this.v;
            if (this.f11648n == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            int i12 = this.f51a0;
            if (i12 != 0) {
                if (i12 != 1) {
                    j10 = -30000;
                    if (i12 == 3) {
                        long P = e2.d0.P(SystemClock.elapsedRealtime()) - this.f62l0;
                        if (!z12 || j12 >= -30000 || P <= 100000) {
                            z12 = false;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    j10 = -30000;
                }
                z12 = true;
            } else {
                j10 = -30000;
            }
            if (z12) {
                b2.s sVar2 = this.O;
                sVar2.getClass();
                J(videoDecoderOutputBuffer2, j13, sVar2);
            } else {
                if (this.f11648n == 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13 || j3 == this.f52b0) {
                    z10 = false;
                } else {
                    if (j12 < -500000) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        a1 a1Var = this.f11649r;
                        a1Var.getClass();
                        int j14 = a1Var.j(j3 - this.v);
                        if (j14 == 0) {
                            z16 = false;
                        } else {
                            this.m0.f11700j++;
                            M(j14, this.f61k0);
                            F();
                            z16 = true;
                        }
                        if (z16) {
                            z11 = false;
                        }
                    }
                    if (j12 < j10) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        M(0, 1);
                        videoDecoderOutputBuffer2.release();
                    } else {
                        z10 = false;
                        if (j12 < 30000) {
                            b2.s sVar3 = this.O;
                            sVar3.getClass();
                            J(videoDecoderOutputBuffer2, j13, sVar3);
                        }
                    }
                }
                z11 = z10;
            }
            z11 = true;
        } else {
            z10 = false;
            if (j12 < -30000) {
                this.m0.f11697f++;
                videoDecoderOutputBuffer2.release();
                z11 = true;
            }
            z11 = z10;
        }
        if (z11) {
            this.R.getClass();
            this.f61k0--;
            this.R = null;
        }
        return z11;
    }

    public final boolean E() {
        throw new UnsupportedOperationException("Method not decompiled: a3.a.E():boolean");
    }

    public final void F() {
        this.f61k0 = 0;
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
        lVar.a(this.f11651w);
        this.Z = false;
    }

    public final void G() {
        pf.b bVar = this.K;
        if (this.P == null) {
            n2.g gVar = this.X;
            hg.c.A(this.W, gVar);
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
                ((h2.l) C).a(this.f11651w);
                L(this.S);
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                h2.e eVar = this.P;
                eVar.getClass();
                String name = eVar.getName();
                long j3 = elapsedRealtime2 - elapsedRealtime;
                Handler handler = (Handler) bVar.f45592b;
                if (handler != null) {
                    handler.post(new g0(bVar, name, elapsedRealtime2, j3, 0));
                }
                this.m0.f11693a++;
            } catch (h2.f e7) {
                e2.a.f("DecoderVideoRenderer", "Video codec error", e7);
                Handler handler2 = (Handler) bVar.f45592b;
                if (handler2 != null) {
                    handler2.post(new a1.f(3, bVar, e7));
                }
                throw d(e7, this.N, false, 4001);
            } catch (OutOfMemoryError e10) {
                throw d(e10, this.N, false, 4001);
            }
        }
    }

    public final void H(n4.x xVar) {
        i2.h hVar;
        this.f54d0 = true;
        b2.s sVar = (b2.s) xVar.f16659c;
        sVar.getClass();
        n2.g gVar = (n2.g) xVar.f16658b;
        hg.c.A(this.X, gVar);
        this.X = gVar;
        b2.s sVar2 = this.N;
        this.N = sVar;
        h2.e eVar = this.P;
        pf.b bVar = this.K;
        if (eVar == null) {
            G();
            b2.s sVar3 = this.N;
            sVar3.getClass();
            Handler handler = (Handler) bVar.f45592b;
            if (handler != null) {
                handler.post(new k0(bVar, sVar3, null, 0));
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
        Handler handler2 = (Handler) bVar.f45592b;
        if (handler2 != null) {
            handler2.post(new k0(bVar, sVar4, hVar, 0));
        }
    }

    public final void I() {
        this.Q = null;
        this.R = null;
        this.Y = 0;
        this.Z = false;
        this.f61k0 = 0;
        h2.e eVar = this.P;
        if (eVar != null) {
            this.m0.f11694b++;
            eVar.release();
            String name = this.P.getName();
            pf.b bVar = this.K;
            Handler handler = (Handler) bVar.f45592b;
            if (handler != null) {
                handler.post(new a1.f(4, bVar, name));
            }
            this.P = null;
        }
        hg.c.A(this.W, null);
        this.W = null;
    }

    public final void J(VideoDecoderOutputBuffer videoDecoderOutputBuffer, long j3, b2.s sVar) {
        y yVar = this.V;
        if (yVar != null) {
            this.h.getClass();
            yVar.a(j3, System.nanoTime(), sVar, null);
        }
        this.f62l0 = e2.d0.P(SystemClock.elapsedRealtime());
        if (videoDecoderOutputBuffer.mode == 1 && this.U != null) {
            int i10 = videoDecoderOutputBuffer.width;
            int i11 = videoDecoderOutputBuffer.height;
            x1 x1Var = this.f57g0;
            pf.b bVar = this.K;
            if (x1Var == null || x1Var.f3690a != i10 || x1Var.f3691b != i11) {
                x1 x1Var2 = new x1(i10, i11);
                this.f57g0 = x1Var2;
                bVar.Z(x1Var2);
            }
            Surface surface = this.U;
            surface.getClass();
            K(videoDecoderOutputBuffer, surface);
            this.f60j0 = 0;
            this.m0.f11696e++;
            if (this.f51a0 != 3) {
                this.f51a0 = 3;
                Surface surface2 = this.T;
                if (surface2 != null) {
                    bVar.V(surface2);
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
        gVar.f11698g += i13;
        this.f59i0 += i13;
        int i14 = this.f60j0 + i13;
        this.f60j0 = i14;
        gVar.f11699i = Math.max(i14, gVar.f11699i);
        int i15 = this.J;
        if (i15 > 0 && (i12 = this.f59i0) >= i15 && i12 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.f58h0;
            int i16 = this.f59i0;
            pf.b bVar = this.K;
            Handler handler = (Handler) bVar.f45592b;
            if (handler != null) {
                handler.post(new i0(bVar, i16, j3));
            }
            this.f59i0 = 0;
            this.f58h0 = elapsedRealtime;
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
            pf.b bVar = this.K;
            if (surface2 != obj) {
                this.T = (Surface) obj;
                if (obj != null) {
                    if (this.P != null) {
                        L(this.S);
                    }
                    x1 x1Var = this.f57g0;
                    if (x1Var != null) {
                        bVar.Z(x1Var);
                    }
                    this.f51a0 = Math.min(this.f51a0, 1);
                    if (this.f11648n == 2) {
                        long j10 = this.I;
                        if (j10 > 0) {
                            j3 = SystemClock.elapsedRealtime() + j10;
                        } else {
                            j3 = -9223372036854775807L;
                        }
                        this.f53c0 = j3;
                        return;
                    }
                    return;
                }
                this.f57g0 = null;
                this.f51a0 = Math.min(this.f51a0, 1);
            } else if (obj != null) {
                x1 x1Var2 = this.f57g0;
                if (x1Var2 != null) {
                    bVar.Z(x1Var2);
                }
                if (this.f51a0 == 3 && (surface = this.T) != null) {
                    bVar.V(surface);
                }
            }
        } else if (i10 == 7) {
            this.V = (y) obj;
        }
    }

    @Override
    public final void e() {
        if (this.f51a0 == 0) {
            this.f51a0 = 1;
        }
    }

    @Override
    public final boolean l() {
        return this.f56f0;
    }

    @Override
    public final boolean m() {
        if (this.N != null && ((n() || this.R != null) && (this.f51a0 == 3 || this.S == -1))) {
            this.f53c0 = -9223372036854775807L;
            return true;
        } else if (this.f53c0 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f53c0) {
                return true;
            }
            this.f53c0 = -9223372036854775807L;
            return false;
        }
    }

    @Override
    public final void o() {
        pf.b bVar = this.K;
        this.N = null;
        this.f57g0 = null;
        this.f51a0 = Math.min(this.f51a0, 0);
        try {
            hg.c.A(this.X, null);
            this.X = null;
            I();
        } finally {
            bVar.K(this.m0);
        }
    }

    @Override
    public final void p(boolean z10, boolean z11) {
        ?? obj = new Object();
        this.m0 = obj;
        pf.b bVar = this.K;
        Handler handler = (Handler) bVar.f45592b;
        if (handler != null) {
            handler.post(new j0(bVar, obj, 0));
        }
        this.f51a0 = z11 ? 1 : 0;
    }

    @Override
    public final void q(long j3, boolean z10) {
        this.f55e0 = false;
        this.f56f0 = false;
        this.f51a0 = Math.min(this.f51a0, 1);
        long j10 = -9223372036854775807L;
        this.f52b0 = -9223372036854775807L;
        this.f60j0 = 0;
        if (this.P != null) {
            F();
        }
        if (z10) {
            long j11 = this.I;
            if (j11 > 0) {
                j10 = SystemClock.elapsedRealtime() + j11;
            }
            this.f53c0 = j10;
        } else {
            this.f53c0 = -9223372036854775807L;
        }
        e2.a0 a0Var = this.L;
        if (a0Var.m() > 0) {
            this.f54d0 = true;
        }
        a0Var.c();
    }

    @Override
    public final void t() {
        this.f59i0 = 0;
        this.f58h0 = SystemClock.elapsedRealtime();
        this.f62l0 = e2.d0.P(SystemClock.elapsedRealtime());
    }

    @Override
    public final void u() {
        this.f53c0 = -9223372036854775807L;
        if (this.f59i0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.f58h0;
            int i10 = this.f59i0;
            pf.b bVar = this.K;
            Handler handler = (Handler) bVar.f45592b;
            if (handler != null) {
                handler.post(new i0(bVar, i10, j3));
            }
            this.f59i0 = 0;
            this.f58h0 = elapsedRealtime;
        }
    }

    @Override
    public final void x(long j3, long j10) {
        if (!this.f56f0) {
            if (this.N == null) {
                n4.x xVar = this.f11645c;
                xVar.e();
                this.M.clear();
                int w10 = w(xVar, this.M, 2);
                if (w10 == -5) {
                    H(xVar);
                } else if (w10 == -4) {
                    e2.d.g(this.M.isEndOfStream());
                    this.f55e0 = true;
                    this.f56f0 = true;
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
                    Handler handler = (Handler) bVar.f45592b;
                    if (handler != null) {
                        handler.post(new a1.f(3, bVar, e7));
                    }
                    throw d(e7, this.N, false, 4003);
                }
            }
        }
    }

    @Override
    public final void v(b2.s[] sVarArr, long j3, long j10, u2.f0 f0Var) {
    }
}
