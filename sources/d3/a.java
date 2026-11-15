package d3;

import a8.ja;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import e2.x1;
import h2.l0;
import org.telegram.ui.Cells.y0;
public abstract class a extends l2.b {
    public final long J;
    public final int K;
    public final wf.b L;
    public final h2.j0 M;
    public final k2.h N;
    public e2.u O;
    public e2.u P;
    public k2.e Q;
    public k2.h R;
    public VideoDecoderOutputBuffer S;
    public int T;
    public Surface U;
    public Surface V;
    public v W;
    public q2.h X;
    public q2.h Y;
    public int Z;
    public boolean f7339a0;
    public int f7340b0;
    public long f7341c0;
    public long f7342d0;
    public boolean f7343e0;
    public boolean f7344f0;
    public boolean f7345g0;
    public x1 f7346h0;
    public long f7347i0;
    public int f7348j0;
    public int f7349k0;
    public int f7350l0;
    public long m0;
    public l2.d f7351n0;

    public a(long j3, Handler handler, h0 h0Var, int i7) {
        super(2);
        this.J = j3;
        this.K = i7;
        this.f7342d0 = -9223372036854775807L;
        this.M = new h2.j0();
        this.N = new k2.h(0, 0);
        this.L = new wf.b(handler, h0Var);
        this.Z = 0;
        this.T = -1;
        this.f7340b0 = 0;
        this.f7351n0 = new Object();
    }

    public abstract k2.e F(e2.u uVar);

    public final boolean G(long j3) {
        boolean z10;
        boolean z11;
        boolean z12;
        long j10;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        if (this.S == null) {
            k2.e eVar = this.Q;
            eVar.getClass();
            VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) ((k2.l) eVar).c();
            this.S = videoDecoderOutputBuffer;
            if (videoDecoderOutputBuffer == null) {
                return false;
            }
            l2.d dVar = this.f7351n0;
            int i7 = dVar.f18914f;
            int i10 = videoDecoderOutputBuffer.skippedOutputBufferCount;
            dVar.f18914f = i7 + i10;
            this.f7350l0 -= i10;
        }
        if (this.S.isEndOfStream()) {
            if (this.Z == 2) {
                L();
                J();
                return false;
            }
            this.S.release();
            this.S = null;
            this.f7345g0 = true;
            return false;
        }
        if (this.f7341c0 == -9223372036854775807L) {
            this.f7341c0 = j3;
        }
        VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.S;
        videoDecoderOutputBuffer2.getClass();
        long j11 = videoDecoderOutputBuffer2.timeUs;
        long j12 = j11 - j3;
        if (this.T != -1) {
            h2.j0 j0Var = this.M;
            e2.u uVar = (e2.u) j0Var.j(j11);
            if (uVar != null) {
                this.P = uVar;
            } else if (this.P == null) {
                this.P = (e2.u) j0Var.i();
            }
            long j13 = j11 - this.f18896w;
            if (this.f18893n == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            int i11 = this.f7340b0;
            if (i11 != 0) {
                if (i11 != 1) {
                    j10 = -30000;
                    if (i11 == 3) {
                        long S = l0.S(SystemClock.elapsedRealtime()) - this.m0;
                        if (!z12 || j12 >= -30000 || S <= 100000) {
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
                e2.u uVar2 = this.P;
                uVar2.getClass();
                M(videoDecoderOutputBuffer2, j13, uVar2);
            } else {
                if (this.f18893n == 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13 || j3 == this.f7341c0) {
                    z10 = false;
                } else {
                    if (j12 < -500000) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        int B = B(j3);
                        if (B == 0) {
                            z16 = false;
                        } else {
                            this.f7351n0.f18917j++;
                            P(B, this.f7350l0);
                            I();
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
                        P(0, 1);
                        videoDecoderOutputBuffer2.release();
                    } else {
                        z10 = false;
                        if (j12 < 30000) {
                            e2.u uVar3 = this.P;
                            uVar3.getClass();
                            M(videoDecoderOutputBuffer2, j13, uVar3);
                        }
                    }
                }
                z11 = z10;
            }
            z11 = true;
        } else {
            z10 = false;
            if (j12 < -30000) {
                this.f7351n0.f18914f++;
                videoDecoderOutputBuffer2.release();
                z11 = true;
            }
            z11 = z10;
        }
        if (z11) {
            this.S.getClass();
            this.f7350l0--;
            this.S = null;
        }
        return z11;
    }

    public final boolean H() {
        throw new UnsupportedOperationException("Method not decompiled: d3.a.H():boolean");
    }

    public final void I() {
        this.f7350l0 = 0;
        if (this.Z != 0) {
            L();
            J();
            return;
        }
        this.R = null;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.S;
        if (videoDecoderOutputBuffer != null) {
            videoDecoderOutputBuffer.release();
            this.S = null;
        }
        k2.e eVar = this.Q;
        eVar.getClass();
        k2.l lVar = (k2.l) eVar;
        lVar.flush();
        lVar.a(this.f18897x);
        this.f7339a0 = false;
    }

    public final void J() {
        wf.b bVar = this.L;
        if (this.Q == null) {
            q2.h hVar = this.Y;
            y0.C(this.X, hVar);
            this.X = hVar;
            if (hVar != null && hVar.h() == null && this.X.g() == null) {
                return;
            }
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                e2.u uVar = this.O;
                uVar.getClass();
                k2.e F = F(uVar);
                this.Q = F;
                ((k2.l) F).a(this.f18897x);
                O(this.T);
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                k2.e eVar = this.Q;
                eVar.getClass();
                String name = eVar.getName();
                long j3 = elapsedRealtime2 - elapsedRealtime;
                Handler handler = (Handler) bVar.f59107b;
                if (handler != null) {
                    handler.post(new e0(bVar, name, elapsedRealtime2, j3, 0));
                }
                this.f7351n0.f18910a++;
            } catch (OutOfMemoryError e10) {
                throw d(e10, this.O, false, 4001);
            } catch (k2.f e11) {
                h2.a.d("DecoderVideoRenderer", "Video codec error", e11);
                Handler handler2 = (Handler) bVar.f59107b;
                if (handler2 != null) {
                    handler2.post(new c1.c(23, bVar, e11));
                }
                throw d(e11, this.O, false, 4001);
            }
        }
    }

    public final void K(k8.a aVar) {
        l2.e eVar;
        this.f7343e0 = true;
        e2.u uVar = (e2.u) aVar.f17789c;
        uVar.getClass();
        q2.h hVar = (q2.h) aVar.f17788b;
        y0.C(this.Y, hVar);
        this.Y = hVar;
        e2.u uVar2 = this.O;
        this.O = uVar;
        k2.e eVar2 = this.Q;
        wf.b bVar = this.L;
        if (eVar2 == null) {
            J();
            e2.u uVar3 = this.O;
            uVar3.getClass();
            Handler handler = (Handler) bVar.f59107b;
            if (handler != null) {
                handler.post(new aa.r(bVar, uVar3, (Object) null, 12));
                return;
            }
            return;
        }
        if (hVar != this.X) {
            String name = eVar2.getName();
            uVar2.getClass();
            eVar = new l2.e(name, uVar2, uVar, 0, 128);
        } else {
            String name2 = eVar2.getName();
            uVar2.getClass();
            eVar = new l2.e(name2, uVar2, uVar, 0, 8);
        }
        if (eVar.d == 0) {
            if (this.f7339a0) {
                this.Z = 1;
            } else {
                L();
                J();
            }
        }
        e2.u uVar4 = this.O;
        uVar4.getClass();
        Handler handler2 = (Handler) bVar.f59107b;
        if (handler2 != null) {
            handler2.post(new aa.r(bVar, uVar4, eVar, 12));
        }
    }

    public final void L() {
        this.R = null;
        this.S = null;
        this.Z = 0;
        this.f7339a0 = false;
        this.f7350l0 = 0;
        k2.e eVar = this.Q;
        if (eVar != null) {
            this.f7351n0.f18911b++;
            eVar.release();
            String name = this.Q.getName();
            wf.b bVar = this.L;
            Handler handler = (Handler) bVar.f59107b;
            if (handler != null) {
                handler.post(new c1.c(24, bVar, name));
            }
            this.Q = null;
        }
        y0.C(this.X, null);
        this.X = null;
    }

    public final void M(VideoDecoderOutputBuffer videoDecoderOutputBuffer, long j3, e2.u uVar) {
        v vVar = this.W;
        if (vVar != null) {
            this.h.getClass();
            vVar.a(j3, System.nanoTime(), uVar, null);
        }
        this.m0 = l0.S(SystemClock.elapsedRealtime());
        if (videoDecoderOutputBuffer.mode == 1 && this.V != null) {
            int i7 = videoDecoderOutputBuffer.width;
            int i10 = videoDecoderOutputBuffer.height;
            x1 x1Var = this.f7346h0;
            wf.b bVar = this.L;
            if (x1Var == null || x1Var.f10485a != i7 || x1Var.f10486b != i10) {
                x1 x1Var2 = new x1(i7, i10);
                this.f7346h0 = x1Var2;
                bVar.V(x1Var2);
            }
            Surface surface = this.V;
            surface.getClass();
            N(videoDecoderOutputBuffer, surface);
            this.f7349k0 = 0;
            this.f7351n0.f18913e++;
            if (this.f7340b0 != 3) {
                this.f7340b0 = 3;
                Surface surface2 = this.U;
                if (surface2 != null) {
                    bVar.O(surface2);
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
        l2.d dVar = this.f7351n0;
        dVar.h += i7;
        int i12 = i7 + i10;
        dVar.f18915g += i12;
        this.f7348j0 += i12;
        int i13 = this.f7349k0 + i12;
        this.f7349k0 = i13;
        dVar.f18916i = Math.max(i13, dVar.f18916i);
        int i14 = this.K;
        if (i14 > 0 && (i11 = this.f7348j0) >= i14 && i11 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.f7347i0;
            int i15 = this.f7348j0;
            wf.b bVar = this.L;
            Handler handler = (Handler) bVar.f59107b;
            if (handler != null) {
                handler.post(new f0(bVar, i15, j3));
            }
            this.f7348j0 = 0;
            this.f7347i0 = elapsedRealtime;
        }
    }

    @Override
    public final void c(int i7, Object obj) {
        Surface surface;
        long j3;
        if (i7 == 1) {
            if (obj instanceof Surface) {
                this.V = (Surface) obj;
                this.T = 1;
            } else {
                this.V = null;
                this.T = -1;
                obj = null;
            }
            Surface surface2 = this.U;
            wf.b bVar = this.L;
            if (surface2 != obj) {
                this.U = (Surface) obj;
                if (obj != null) {
                    if (this.Q != null) {
                        O(this.T);
                    }
                    x1 x1Var = this.f7346h0;
                    if (x1Var != null) {
                        bVar.V(x1Var);
                    }
                    this.f7340b0 = Math.min(this.f7340b0, 1);
                    if (this.f18893n == 2) {
                        long j10 = this.J;
                        if (j10 > 0) {
                            j3 = SystemClock.elapsedRealtime() + j10;
                        } else {
                            j3 = -9223372036854775807L;
                        }
                        this.f7342d0 = j3;
                        return;
                    }
                    return;
                }
                this.f7346h0 = null;
                this.f7340b0 = Math.min(this.f7340b0, 1);
            } else if (obj != null) {
                x1 x1Var2 = this.f7346h0;
                if (x1Var2 != null) {
                    bVar.V(x1Var2);
                }
                if (this.f7340b0 == 3 && (surface = this.U) != null) {
                    bVar.O(surface);
                }
            }
        } else if (i7 == 7) {
            this.W = (v) obj;
        }
    }

    @Override
    public final void f() {
        if (this.f7340b0 == 0) {
            this.f7340b0 = 1;
        }
    }

    @Override
    public final boolean l() {
        return this.f7345g0;
    }

    @Override
    public final boolean m() {
        throw new UnsupportedOperationException("Method not decompiled: d3.a.m():boolean");
    }

    @Override
    public final void n() {
        wf.b bVar = this.L;
        this.O = null;
        this.f7346h0 = null;
        this.f7340b0 = Math.min(this.f7340b0, 0);
        try {
            y0.C(this.Y, null);
            this.Y = null;
            L();
        } finally {
            bVar.t(this.f7351n0);
        }
    }

    @Override
    public final void o(boolean z10, boolean z11) {
        ?? obj = new Object();
        this.f7351n0 = obj;
        wf.b bVar = this.L;
        Handler handler = (Handler) bVar.f59107b;
        if (handler != null) {
            handler.post(new g0(bVar, obj, 0));
        }
        this.f7340b0 = z11 ? 1 : 0;
    }

    @Override
    public final void p(long j3, boolean z10, boolean z11) {
        this.f7344f0 = false;
        this.f7345g0 = false;
        this.f7340b0 = Math.min(this.f7340b0, 1);
        long j10 = -9223372036854775807L;
        this.f7341c0 = -9223372036854775807L;
        this.f7349k0 = 0;
        if (this.Q != null) {
            I();
        }
        if (z10) {
            long j11 = this.J;
            if (j11 > 0) {
                j10 = SystemClock.elapsedRealtime() + j11;
            }
            this.f7342d0 = j10;
        } else {
            this.f7342d0 = -9223372036854775807L;
        }
        h2.j0 j0Var = this.M;
        if (j0Var.p() > 0) {
            this.f7343e0 = true;
        }
        j0Var.c();
    }

    @Override
    public final void s() {
        this.f7348j0 = 0;
        this.f7347i0 = SystemClock.elapsedRealtime();
        this.m0 = l0.S(SystemClock.elapsedRealtime());
    }

    @Override
    public final void t() {
        this.f7342d0 = -9223372036854775807L;
        if (this.f7348j0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.f7347i0;
            int i7 = this.f7348j0;
            wf.b bVar = this.L;
            Handler handler = (Handler) bVar.f59107b;
            if (handler != null) {
                handler.post(new f0(bVar, i7, j3));
            }
            this.f7348j0 = 0;
            this.f7347i0 = elapsedRealtime;
        }
    }

    @Override
    public final void x(long j3, long j10) {
        if (!this.f7345g0) {
            if (this.O == null) {
                k8.a aVar = this.f18890c;
                aVar.x0();
                this.N.clear();
                int w10 = w(aVar, this.N, 2);
                if (w10 == -5) {
                    K(aVar);
                } else if (w10 == -4) {
                    ja.p(this.N.isEndOfStream());
                    this.f7344f0 = true;
                    this.f7345g0 = true;
                    return;
                } else {
                    return;
                }
            }
            J();
            if (this.Q != null) {
                try {
                    Trace.beginSection("drainAndFeed");
                    while (G(j3)) {
                    }
                    while (H()) {
                    }
                    Trace.endSection();
                    synchronized (this.f7351n0) {
                    }
                } catch (k2.f e10) {
                    h2.a.d("DecoderVideoRenderer", "Video codec error", e10);
                    wf.b bVar = this.L;
                    Handler handler = (Handler) bVar.f59107b;
                    if (handler != null) {
                        handler.post(new c1.c(23, bVar, e10));
                    }
                    throw d(e10, this.O, false, 4003);
                }
            }
        }
    }

    @Override
    public final void u(e2.u[] uVarArr, long j3, long j10, x2.f0 f0Var) {
    }
}
