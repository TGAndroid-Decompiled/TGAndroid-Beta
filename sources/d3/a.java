package d3;

import a8.ia;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import bi.a4;
import bi.h4;
import e2.x1;
import h2.m0;
import org.telegram.ui.Cells.f1;
public abstract class a extends l2.b {
    public final long I;
    public final int J;
    public final wf.b K;
    public final h2.j0 L;
    public final k2.h M;
    public e2.u N;
    public e2.u O;
    public k2.e P;
    public k2.h Q;
    public VideoDecoderOutputBuffer R;
    public int S;
    public Surface T;
    public Surface U;
    public w V;
    public q2.g W;
    public q2.g X;
    public int Y;
    public boolean Z;
    public int f7947a0;
    public long f7948b0;
    public long f7949c0;
    public boolean f7950d0;
    public boolean f7951e0;
    public boolean f7952f0;
    public x1 f7953g0;
    public long f7954h0;
    public int f7955i0;
    public int f7956j0;
    public int f7957k0;
    public long f7958l0;
    public l2.d m0;

    public a(long j3, Handler handler, h0 h0Var, int i7) {
        super(2);
        this.I = j3;
        this.J = i7;
        this.f7949c0 = -9223372036854775807L;
        this.L = new h2.j0();
        this.M = new k2.h(0, 0);
        this.K = new wf.b(handler, h0Var);
        this.Y = 0;
        this.S = -1;
        this.f7947a0 = 0;
        this.m0 = new Object();
    }

    public abstract k2.e F(e2.u uVar);

    public final boolean G(long j3) {
        boolean z9;
        boolean z10;
        boolean z11;
        long j10;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        if (this.R == null) {
            k2.e eVar = this.P;
            eVar.getClass();
            VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) ((k2.l) eVar).c();
            this.R = videoDecoderOutputBuffer;
            if (videoDecoderOutputBuffer == null) {
                return false;
            }
            l2.d dVar = this.m0;
            int i7 = dVar.f17778f;
            int i10 = videoDecoderOutputBuffer.skippedOutputBufferCount;
            dVar.f17778f = i7 + i10;
            this.f7957k0 -= i10;
        }
        if (this.R.isEndOfStream()) {
            if (this.Y == 2) {
                L();
                J();
                return false;
            }
            this.R.release();
            this.R = null;
            this.f7952f0 = true;
            return false;
        }
        if (this.f7948b0 == -9223372036854775807L) {
            this.f7948b0 = j3;
        }
        VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.R;
        videoDecoderOutputBuffer2.getClass();
        long j11 = videoDecoderOutputBuffer2.timeUs;
        long j12 = j11 - j3;
        if (this.S != -1) {
            h2.j0 j0Var = this.L;
            e2.u uVar = (e2.u) j0Var.j(j11);
            if (uVar != null) {
                this.O = uVar;
            } else if (this.O == null) {
                this.O = (e2.u) j0Var.i();
            }
            long j13 = j11 - this.f17765w;
            if (this.f17762n == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i11 = this.f7947a0;
            if (i11 != 0) {
                if (i11 != 1) {
                    j10 = -30000;
                    if (i11 == 3) {
                        long S = m0.S(SystemClock.elapsedRealtime()) - this.f7958l0;
                        if (!z11 || j12 >= -30000 || S <= 100000) {
                            z11 = false;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    j10 = -30000;
                }
                z11 = true;
            } else {
                j10 = -30000;
            }
            if (z11) {
                e2.u uVar2 = this.O;
                uVar2.getClass();
                M(videoDecoderOutputBuffer2, j13, uVar2);
            } else {
                if (this.f17762n == 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12 || j3 == this.f7948b0) {
                    z9 = false;
                } else {
                    if (j12 < -500000) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        int B = B(j3);
                        if (B == 0) {
                            z15 = false;
                        } else {
                            this.m0.f17781j++;
                            P(B, this.f7957k0);
                            I();
                            z15 = true;
                        }
                        if (z15) {
                            z10 = false;
                        }
                    }
                    if (j12 < j10) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        P(0, 1);
                        videoDecoderOutputBuffer2.release();
                    } else {
                        z9 = false;
                        if (j12 < 30000) {
                            e2.u uVar3 = this.O;
                            uVar3.getClass();
                            M(videoDecoderOutputBuffer2, j13, uVar3);
                        }
                    }
                }
                z10 = z9;
            }
            z10 = true;
        } else {
            z9 = false;
            if (j12 < -30000) {
                this.m0.f17778f++;
                videoDecoderOutputBuffer2.release();
                z10 = true;
            }
            z10 = z9;
        }
        if (z10) {
            this.R.getClass();
            this.f7957k0--;
            this.R = null;
        }
        return z10;
    }

    public final boolean H() {
        throw new UnsupportedOperationException("Method not decompiled: d3.a.H():boolean");
    }

    public final void I() {
        this.f7957k0 = 0;
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
        k2.e eVar = this.P;
        eVar.getClass();
        k2.l lVar = (k2.l) eVar;
        lVar.flush();
        lVar.a(this.f17766x);
        this.Z = false;
    }

    public final void J() {
        wf.b bVar = this.K;
        if (this.P == null) {
            q2.g gVar = this.X;
            f1.B(this.W, gVar);
            this.W = gVar;
            if (gVar != null && gVar.h() == null && this.W.g() == null) {
                return;
            }
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                e2.u uVar = this.N;
                uVar.getClass();
                k2.e F = F(uVar);
                this.P = F;
                ((k2.l) F).a(this.f17766x);
                O(this.S);
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                k2.e eVar = this.P;
                eVar.getClass();
                String name = eVar.getName();
                long j3 = elapsedRealtime2 - elapsedRealtime;
                Handler handler = (Handler) bVar.f57667b;
                if (handler != null) {
                    handler.post(new h4(bVar, name, elapsedRealtime2, j3, 1));
                }
                this.m0.f17774a++;
            } catch (OutOfMemoryError e10) {
                throw d(e10, this.N, false, 4001);
            } catch (k2.f e11) {
                h2.a.d("DecoderVideoRenderer", "Video codec error", e11);
                Handler handler2 = (Handler) bVar.f57667b;
                if (handler2 != null) {
                    handler2.post(new a4(25, bVar, e11));
                }
                throw d(e11, this.N, false, 4001);
            }
        }
    }

    public final void K(wf.b bVar) {
        l2.e eVar;
        this.f7950d0 = true;
        e2.u uVar = (e2.u) bVar.f57668c;
        uVar.getClass();
        q2.g gVar = (q2.g) bVar.f57667b;
        f1.B(this.X, gVar);
        this.X = gVar;
        e2.u uVar2 = this.N;
        this.N = uVar;
        k2.e eVar2 = this.P;
        wf.b bVar2 = this.K;
        if (eVar2 == null) {
            J();
            e2.u uVar3 = this.N;
            uVar3.getClass();
            Handler handler = (Handler) bVar2.f57667b;
            if (handler != null) {
                handler.post(new aa.s(bVar2, uVar3, (Object) null, 21));
                return;
            }
            return;
        }
        if (gVar != this.W) {
            String name = eVar2.getName();
            uVar2.getClass();
            eVar = new l2.e(name, uVar2, uVar, 0, 128);
        } else {
            String name2 = eVar2.getName();
            uVar2.getClass();
            eVar = new l2.e(name2, uVar2, uVar, 0, 8);
        }
        if (eVar.d == 0) {
            if (this.Z) {
                this.Y = 1;
            } else {
                L();
                J();
            }
        }
        e2.u uVar4 = this.N;
        uVar4.getClass();
        Handler handler2 = (Handler) bVar2.f57667b;
        if (handler2 != null) {
            handler2.post(new aa.s(bVar2, uVar4, eVar, 21));
        }
    }

    public final void L() {
        this.Q = null;
        this.R = null;
        this.Y = 0;
        this.Z = false;
        this.f7957k0 = 0;
        k2.e eVar = this.P;
        if (eVar != null) {
            this.m0.f17775b++;
            eVar.release();
            String name = this.P.getName();
            wf.b bVar = this.K;
            Handler handler = (Handler) bVar.f57667b;
            if (handler != null) {
                handler.post(new a4(26, bVar, name));
            }
            this.P = null;
        }
        f1.B(this.W, null);
        this.W = null;
    }

    public final void M(VideoDecoderOutputBuffer videoDecoderOutputBuffer, long j3, e2.u uVar) {
        w wVar = this.V;
        if (wVar != null) {
            this.h.getClass();
            wVar.b(j3, System.nanoTime(), uVar, null);
        }
        this.f7958l0 = m0.S(SystemClock.elapsedRealtime());
        if (videoDecoderOutputBuffer.mode == 1 && this.U != null) {
            int i7 = videoDecoderOutputBuffer.width;
            int i10 = videoDecoderOutputBuffer.height;
            x1 x1Var = this.f7953g0;
            wf.b bVar = this.K;
            if (x1Var == null || x1Var.f10649a != i7 || x1Var.f10650b != i10) {
                x1 x1Var2 = new x1(i7, i10);
                this.f7953g0 = x1Var2;
                bVar.m0(x1Var2);
            }
            Surface surface = this.U;
            surface.getClass();
            N(videoDecoderOutputBuffer, surface);
            this.f7956j0 = 0;
            this.m0.f17777e++;
            if (this.f7947a0 != 3) {
                this.f7947a0 = 3;
                Surface surface2 = this.T;
                if (surface2 != null) {
                    bVar.g0(surface2);
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

    public abstract void O(int i7);

    public final void P(int i7, int i10) {
        int i11;
        l2.d dVar = this.m0;
        dVar.h += i7;
        int i12 = i7 + i10;
        dVar.f17779g += i12;
        this.f7955i0 += i12;
        int i13 = this.f7956j0 + i12;
        this.f7956j0 = i13;
        dVar.f17780i = Math.max(i13, dVar.f17780i);
        int i14 = this.J;
        if (i14 > 0 && (i11 = this.f7955i0) >= i14 && i11 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.f7954h0;
            int i15 = this.f7955i0;
            wf.b bVar = this.K;
            Handler handler = (Handler) bVar.f57667b;
            if (handler != null) {
                handler.post(new f0(bVar, i15, j3));
            }
            this.f7955i0 = 0;
            this.f7954h0 = elapsedRealtime;
        }
    }

    @Override
    public final void c(int i7, Object obj) {
        Surface surface;
        long j3;
        if (i7 == 1) {
            if (obj instanceof Surface) {
                this.U = (Surface) obj;
                this.S = 1;
            } else {
                this.U = null;
                this.S = -1;
                obj = null;
            }
            Surface surface2 = this.T;
            wf.b bVar = this.K;
            if (surface2 != obj) {
                this.T = (Surface) obj;
                if (obj != null) {
                    if (this.P != null) {
                        O(this.S);
                    }
                    x1 x1Var = this.f7953g0;
                    if (x1Var != null) {
                        bVar.m0(x1Var);
                    }
                    this.f7947a0 = Math.min(this.f7947a0, 1);
                    if (this.f17762n == 2) {
                        long j10 = this.I;
                        if (j10 > 0) {
                            j3 = SystemClock.elapsedRealtime() + j10;
                        } else {
                            j3 = -9223372036854775807L;
                        }
                        this.f7949c0 = j3;
                        return;
                    }
                    return;
                }
                this.f7953g0 = null;
                this.f7947a0 = Math.min(this.f7947a0, 1);
            } else if (obj != null) {
                x1 x1Var2 = this.f7953g0;
                if (x1Var2 != null) {
                    bVar.m0(x1Var2);
                }
                if (this.f7947a0 == 3 && (surface = this.T) != null) {
                    bVar.g0(surface);
                }
            }
        } else if (i7 == 7) {
            this.V = (w) obj;
        }
    }

    @Override
    public final void f() {
        if (this.f7947a0 == 0) {
            this.f7947a0 = 1;
        }
    }

    @Override
    public final boolean l() {
        return this.f7952f0;
    }

    @Override
    public final boolean m() {
        throw new UnsupportedOperationException("Method not decompiled: d3.a.m():boolean");
    }

    @Override
    public final void n() {
        wf.b bVar = this.K;
        this.N = null;
        this.f7953g0 = null;
        this.f7947a0 = Math.min(this.f7947a0, 0);
        try {
            f1.B(this.X, null);
            this.X = null;
            L();
        } finally {
            bVar.F(this.m0);
        }
    }

    @Override
    public final void o(boolean z9, boolean z10) {
        ?? obj = new Object();
        this.m0 = obj;
        wf.b bVar = this.K;
        Handler handler = (Handler) bVar.f57667b;
        if (handler != null) {
            handler.post(new g0(bVar, obj, 0));
        }
        this.f7947a0 = z10 ? 1 : 0;
    }

    @Override
    public final void p(long j3, boolean z9, boolean z10) {
        this.f7951e0 = false;
        this.f7952f0 = false;
        this.f7947a0 = Math.min(this.f7947a0, 1);
        long j10 = -9223372036854775807L;
        this.f7948b0 = -9223372036854775807L;
        this.f7956j0 = 0;
        if (this.P != null) {
            I();
        }
        if (z9) {
            long j11 = this.I;
            if (j11 > 0) {
                j10 = SystemClock.elapsedRealtime() + j11;
            }
            this.f7949c0 = j10;
        } else {
            this.f7949c0 = -9223372036854775807L;
        }
        h2.j0 j0Var = this.L;
        if (j0Var.p() > 0) {
            this.f7950d0 = true;
        }
        j0Var.c();
    }

    @Override
    public final void s() {
        this.f7955i0 = 0;
        this.f7954h0 = SystemClock.elapsedRealtime();
        this.f7958l0 = m0.S(SystemClock.elapsedRealtime());
    }

    @Override
    public final void t() {
        this.f7949c0 = -9223372036854775807L;
        if (this.f7955i0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.f7954h0;
            int i7 = this.f7955i0;
            wf.b bVar = this.K;
            Handler handler = (Handler) bVar.f57667b;
            if (handler != null) {
                handler.post(new f0(bVar, i7, j3));
            }
            this.f7955i0 = 0;
            this.f7954h0 = elapsedRealtime;
        }
    }

    @Override
    public final void x(long j3, long j10) {
        if (!this.f7952f0) {
            if (this.N == null) {
                wf.b bVar = this.f17759c;
                bVar.A();
                this.M.clear();
                int w10 = w(bVar, this.M, 2);
                if (w10 == -5) {
                    K(bVar);
                } else if (w10 == -4) {
                    ia.p(this.M.isEndOfStream());
                    this.f7951e0 = true;
                    this.f7952f0 = true;
                    return;
                } else {
                    return;
                }
            }
            J();
            if (this.P != null) {
                try {
                    Trace.beginSection("drainAndFeed");
                    while (G(j3)) {
                    }
                    while (H()) {
                    }
                    Trace.endSection();
                    synchronized (this.m0) {
                    }
                } catch (k2.f e10) {
                    h2.a.d("DecoderVideoRenderer", "Video codec error", e10);
                    wf.b bVar2 = this.K;
                    Handler handler = (Handler) bVar2.f57667b;
                    if (handler != null) {
                        handler.post(new a4(25, bVar2, e10));
                    }
                    throw d(e10, this.N, false, 4003);
                }
            }
        }
    }

    @Override
    public final void u(e2.u[] uVarArr, long j3, long j10, x2.g0 g0Var) {
    }
}
