package c3;

import ai.k3;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import b8.zb;
import d2.a2;
import g2.n0;
import org.telegram.ui.Cells.f1;
public abstract class a extends k2.b {
    public final long J;
    public final int K;
    public final tf.b L;
    public final g2.k0 M;
    public final j2.h N;
    public d2.v O;
    public d2.v P;
    public j2.e Q;
    public j2.h R;
    public VideoDecoderOutputBuffer S;
    public int T;
    public Surface U;
    public Surface V;
    public w W;
    public p2.g X;
    public p2.g Y;
    public int Z;
    public boolean f3970a0;
    public int f3971b0;
    public long f3972c0;
    public long f3973d0;
    public boolean f3974e0;
    public boolean f3975f0;
    public boolean f3976g0;
    public a2 f3977h0;
    public long f3978i0;
    public int f3979j0;
    public int f3980k0;
    public int f3981l0;
    public long m0;
    public k2.d f3982n0;

    public a(long j10, Handler handler, i0 i0Var, int i3) {
        super(2);
        this.J = j10;
        this.K = i3;
        this.f3973d0 = -9223372036854775807L;
        this.M = new g2.k0();
        this.N = new j2.h(0, 0);
        this.L = new tf.b(handler, i0Var);
        this.Z = 0;
        this.T = -1;
        this.f3971b0 = 0;
        this.f3982n0 = new Object();
    }

    public abstract j2.e F(d2.v vVar);

    public final boolean G(long j10) {
        boolean z10;
        boolean z11;
        boolean z12;
        long j11;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        if (this.S == null) {
            j2.e eVar = this.Q;
            eVar.getClass();
            VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) ((j2.l) eVar).c();
            this.S = videoDecoderOutputBuffer;
            if (videoDecoderOutputBuffer == null) {
                return false;
            }
            k2.d dVar = this.f3982n0;
            int i3 = dVar.f16467f;
            int i10 = videoDecoderOutputBuffer.skippedOutputBufferCount;
            dVar.f16467f = i3 + i10;
            this.f3981l0 -= i10;
        }
        if (this.S.isEndOfStream()) {
            if (this.Z == 2) {
                L();
                J();
                return false;
            }
            this.S.release();
            this.S = null;
            this.f3976g0 = true;
            return false;
        }
        if (this.f3972c0 == -9223372036854775807L) {
            this.f3972c0 = j10;
        }
        VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.S;
        videoDecoderOutputBuffer2.getClass();
        long j12 = videoDecoderOutputBuffer2.timeUs;
        long j13 = j12 - j10;
        if (this.T != -1) {
            g2.k0 k0Var = this.M;
            d2.v vVar = (d2.v) k0Var.j(j12);
            if (vVar != null) {
                this.P = vVar;
            } else if (this.P == null) {
                this.P = (d2.v) k0Var.i();
            }
            long j14 = j12 - this.f16451w;
            if (this.f16448n == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            int i11 = this.f3971b0;
            if (i11 != 0) {
                if (i11 != 1) {
                    j11 = -30000;
                    if (i11 == 3) {
                        long S = n0.S(SystemClock.elapsedRealtime()) - this.m0;
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
                d2.v vVar2 = this.P;
                vVar2.getClass();
                M(videoDecoderOutputBuffer2, j14, vVar2);
            } else {
                if (this.f16448n == 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13 || j10 == this.f3972c0) {
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
                            this.f3982n0.f16470j++;
                            P(B, this.f3981l0);
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
                            d2.v vVar3 = this.P;
                            vVar3.getClass();
                            M(videoDecoderOutputBuffer2, j14, vVar3);
                        }
                    }
                }
                z11 = z10;
            }
            z11 = true;
        } else {
            z10 = false;
            if (j13 < -30000) {
                this.f3982n0.f16467f++;
                videoDecoderOutputBuffer2.release();
                z11 = true;
            }
            z11 = z10;
        }
        if (z11) {
            this.S.getClass();
            this.f3981l0--;
            this.S = null;
        }
        return z11;
    }

    public final boolean H() {
        throw new UnsupportedOperationException("Method not decompiled: c3.a.H():boolean");
    }

    public final void I() {
        this.f3981l0 = 0;
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
        j2.e eVar = this.Q;
        eVar.getClass();
        j2.l lVar = (j2.l) eVar;
        lVar.flush();
        lVar.a(this.f16452x);
        this.f3970a0 = false;
    }

    public final void J() {
        tf.b bVar = this.L;
        if (this.Q == null) {
            p2.g gVar = this.Y;
            f1.E(this.X, gVar);
            this.X = gVar;
            if (gVar != null && gVar.h() == null && this.X.g() == null) {
                return;
            }
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                d2.v vVar = this.O;
                vVar.getClass();
                j2.e F = F(vVar);
                this.Q = F;
                ((j2.l) F).a(this.f16452x);
                O(this.T);
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                j2.e eVar = this.Q;
                eVar.getClass();
                String name = eVar.getName();
                long j10 = elapsedRealtime2 - elapsedRealtime;
                Handler handler = (Handler) bVar.f55094a;
                if (handler != null) {
                    handler.post(new f0(bVar, name, elapsedRealtime2, j10, 0));
                }
                this.f3982n0.f16463a++;
            } catch (j2.f e10) {
                g2.a.d("DecoderVideoRenderer", "Video codec error", e10);
                Handler handler2 = (Handler) bVar.f55094a;
                if (handler2 != null) {
                    handler2.post(new a1.f(28, bVar, e10));
                }
                throw e(e10, this.O, false, 4001);
            } catch (OutOfMemoryError e11) {
                throw e(e11, this.O, false, 4001);
            }
        }
    }

    public final void K(tf.b bVar) {
        k2.e eVar;
        this.f3974e0 = true;
        d2.v vVar = (d2.v) bVar.f55095b;
        vVar.getClass();
        p2.g gVar = (p2.g) bVar.f55094a;
        f1.E(this.Y, gVar);
        this.Y = gVar;
        d2.v vVar2 = this.O;
        this.O = vVar;
        j2.e eVar2 = this.Q;
        tf.b bVar2 = this.L;
        if (eVar2 == null) {
            J();
            d2.v vVar3 = this.O;
            vVar3.getClass();
            Handler handler = (Handler) bVar2.f55094a;
            if (handler != null) {
                handler.post(new k3(bVar2, vVar3, (Object) null, 9));
                return;
            }
            return;
        }
        if (gVar != this.X) {
            String name = eVar2.getName();
            vVar2.getClass();
            eVar = new k2.e(name, vVar2, vVar, 0, 128);
        } else {
            String name2 = eVar2.getName();
            vVar2.getClass();
            eVar = new k2.e(name2, vVar2, vVar, 0, 8);
        }
        if (eVar.d == 0) {
            if (this.f3970a0) {
                this.Z = 1;
            } else {
                L();
                J();
            }
        }
        d2.v vVar4 = this.O;
        vVar4.getClass();
        Handler handler2 = (Handler) bVar2.f55094a;
        if (handler2 != null) {
            handler2.post(new k3(bVar2, vVar4, eVar, 9));
        }
    }

    public final void L() {
        this.R = null;
        this.S = null;
        this.Z = 0;
        this.f3970a0 = false;
        this.f3981l0 = 0;
        j2.e eVar = this.Q;
        if (eVar != null) {
            this.f3982n0.f16464b++;
            eVar.release();
            String name = this.Q.getName();
            tf.b bVar = this.L;
            Handler handler = (Handler) bVar.f55094a;
            if (handler != null) {
                handler.post(new a1.f(29, bVar, name));
            }
            this.Q = null;
        }
        f1.E(this.X, null);
        this.X = null;
    }

    public final void M(VideoDecoderOutputBuffer videoDecoderOutputBuffer, long j10, d2.v vVar) {
        w wVar = this.W;
        if (wVar != null) {
            this.h.getClass();
            wVar.a(j10, System.nanoTime(), vVar, null);
        }
        this.m0 = n0.S(SystemClock.elapsedRealtime());
        if (videoDecoderOutputBuffer.mode == 1 && this.V != null) {
            int i3 = videoDecoderOutputBuffer.width;
            int i10 = videoDecoderOutputBuffer.height;
            a2 a2Var = this.f3977h0;
            tf.b bVar = this.L;
            if (a2Var == null || a2Var.f8030a != i3 || a2Var.f8031b != i10) {
                a2 a2Var2 = new a2(i3, i10);
                this.f3977h0 = a2Var2;
                bVar.E(a2Var2);
            }
            Surface surface = this.V;
            surface.getClass();
            N(videoDecoderOutputBuffer, surface);
            this.f3980k0 = 0;
            this.f3982n0.f16466e++;
            if (this.f3971b0 != 3) {
                this.f3971b0 = 3;
                Surface surface2 = this.U;
                if (surface2 != null) {
                    bVar.y(surface2);
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

    public abstract void O(int i3);

    public final void P(int i3, int i10) {
        int i11;
        k2.d dVar = this.f3982n0;
        dVar.h += i3;
        int i12 = i3 + i10;
        dVar.f16468g += i12;
        this.f3979j0 += i12;
        int i13 = this.f3980k0 + i12;
        this.f3980k0 = i13;
        dVar.f16469i = Math.max(i13, dVar.f16469i);
        int i14 = this.K;
        if (i14 > 0 && (i11 = this.f3979j0) >= i14 && i11 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f3978i0;
            int i15 = this.f3979j0;
            tf.b bVar = this.L;
            Handler handler = (Handler) bVar.f55094a;
            if (handler != null) {
                handler.post(new g0(bVar, i15, j10));
            }
            this.f3979j0 = 0;
            this.f3978i0 = elapsedRealtime;
        }
    }

    @Override
    public final void d(int i3, Object obj) {
        Surface surface;
        long j10;
        if (i3 == 1) {
            if (obj instanceof Surface) {
                this.V = (Surface) obj;
                this.T = 1;
            } else {
                this.V = null;
                this.T = -1;
                obj = null;
            }
            Surface surface2 = this.U;
            tf.b bVar = this.L;
            if (surface2 != obj) {
                this.U = (Surface) obj;
                if (obj != null) {
                    if (this.Q != null) {
                        O(this.T);
                    }
                    a2 a2Var = this.f3977h0;
                    if (a2Var != null) {
                        bVar.E(a2Var);
                    }
                    this.f3971b0 = Math.min(this.f3971b0, 1);
                    if (this.f16448n == 2) {
                        long j11 = this.J;
                        if (j11 > 0) {
                            j10 = SystemClock.elapsedRealtime() + j11;
                        } else {
                            j10 = -9223372036854775807L;
                        }
                        this.f3973d0 = j10;
                        return;
                    }
                    return;
                }
                this.f3977h0 = null;
                this.f3971b0 = Math.min(this.f3971b0, 1);
            } else if (obj != null) {
                a2 a2Var2 = this.f3977h0;
                if (a2Var2 != null) {
                    bVar.E(a2Var2);
                }
                if (this.f3971b0 == 3 && (surface = this.U) != null) {
                    bVar.y(surface);
                }
            }
        } else if (i3 == 7) {
            this.W = (w) obj;
        }
    }

    @Override
    public final void f() {
        if (this.f3971b0 == 0) {
            this.f3971b0 = 1;
        }
    }

    @Override
    public final boolean l() {
        return this.f3976g0;
    }

    @Override
    public final boolean m() {
        throw new UnsupportedOperationException("Method not decompiled: c3.a.m():boolean");
    }

    @Override
    public final void n() {
        tf.b bVar = this.L;
        this.O = null;
        this.f3977h0 = null;
        this.f3971b0 = Math.min(this.f3971b0, 0);
        try {
            f1.E(this.Y, null);
            this.Y = null;
            L();
        } finally {
            bVar.s(this.f3982n0);
        }
    }

    @Override
    public final void o(boolean z10, boolean z11) {
        ?? obj = new Object();
        this.f3982n0 = obj;
        tf.b bVar = this.L;
        Handler handler = (Handler) bVar.f55094a;
        if (handler != null) {
            handler.post(new h0(bVar, obj, 0));
        }
        this.f3971b0 = z11 ? 1 : 0;
    }

    @Override
    public final void p(long j10, boolean z10, boolean z11) {
        this.f3975f0 = false;
        this.f3976g0 = false;
        this.f3971b0 = Math.min(this.f3971b0, 1);
        long j11 = -9223372036854775807L;
        this.f3972c0 = -9223372036854775807L;
        this.f3980k0 = 0;
        if (this.Q != null) {
            I();
        }
        if (z10) {
            long j12 = this.J;
            if (j12 > 0) {
                j11 = SystemClock.elapsedRealtime() + j12;
            }
            this.f3973d0 = j11;
        } else {
            this.f3973d0 = -9223372036854775807L;
        }
        g2.k0 k0Var = this.M;
        if (k0Var.p() > 0) {
            this.f3974e0 = true;
        }
        k0Var.c();
    }

    @Override
    public final void s() {
        this.f3979j0 = 0;
        this.f3978i0 = SystemClock.elapsedRealtime();
        this.m0 = n0.S(SystemClock.elapsedRealtime());
    }

    @Override
    public final void t() {
        this.f3973d0 = -9223372036854775807L;
        if (this.f3979j0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f3978i0;
            int i3 = this.f3979j0;
            tf.b bVar = this.L;
            Handler handler = (Handler) bVar.f55094a;
            if (handler != null) {
                handler.post(new g0(bVar, i3, j10));
            }
            this.f3979j0 = 0;
            this.f3978i0 = elapsedRealtime;
        }
    }

    @Override
    public final void x(long j10, long j11) {
        if (!this.f3976g0) {
            if (this.O == null) {
                tf.b bVar = this.f16445c;
                bVar.q();
                this.N.clear();
                int w10 = w(bVar, this.N, 2);
                if (w10 == -5) {
                    K(bVar);
                } else if (w10 == -4) {
                    zb.p(this.N.isEndOfStream());
                    this.f3975f0 = true;
                    this.f3976g0 = true;
                    return;
                } else {
                    return;
                }
            }
            J();
            if (this.Q != null) {
                try {
                    Trace.beginSection("drainAndFeed");
                    while (G(j10)) {
                    }
                    while (H()) {
                    }
                    Trace.endSection();
                    synchronized (this.f3982n0) {
                    }
                } catch (j2.f e10) {
                    g2.a.d("DecoderVideoRenderer", "Video codec error", e10);
                    tf.b bVar2 = this.L;
                    Handler handler = (Handler) bVar2.f55094a;
                    if (handler != null) {
                        handler.post(new a1.f(28, bVar2, e10));
                    }
                    throw e(e10, this.O, false, 4003);
                }
            }
        }
    }

    @Override
    public final void u(d2.v[] vVarArr, long j10, long j11, w2.g0 g0Var) {
    }
}
