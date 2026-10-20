package o2;

import android.net.Uri;
import android.os.Looper;
import b2.h0;
import b2.i0;
import b2.j0;
import b2.o0;
import b2.p0;
import b2.w0;
import e2.m0;
import e9.n0;
import g2.c0;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import t7.u;
import u2.e0;
import u2.g0;
import u2.k1;
import v7.u6;
public final class l extends u2.a {
    public final c h;
    public final l2.f f17616i;
    public final oa.d f17617j;
    public final n2.n f17618k;
    public final oa.d f17619l;
    public final boolean f17620m;
    public final int f17621n;
    public final p2.e f17622o;
    public final long f17623p;
    public i0 f17624q;
    public c0 f17625r;
    public o0 f17626s;

    static {
        p0.a("media3.exoplayer.hls");
    }

    public l(o0 o0Var, l2.f fVar, c cVar, oa.d dVar, n2.n nVar, oa.d dVar2, p2.e eVar, long j10, boolean z10, int i10) {
        this.f17626s = o0Var;
        this.f17624q = o0Var.f3888c;
        this.f17616i = fVar;
        this.h = cVar;
        this.f17617j = dVar;
        this.f17618k = nVar;
        this.f17619l = dVar2;
        this.f17622o = eVar;
        this.f17623p = j10;
        this.f17620m = z10;
        this.f17621n = i10;
    }

    public static p2.i u(long j10, List list) {
        p2.i iVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            p2.i iVar2 = (p2.i) list.get(i10);
            long j11 = iVar2.e;
            if (j11 <= j10 && iVar2.f43985w) {
                iVar = iVar2;
            } else if (j11 > j10) {
                break;
            }
        }
        return iVar;
    }

    @Override
    public final boolean a(o0 o0Var) {
        o0 i10 = i();
        j0 j0Var = i10.f3887b;
        j0Var.getClass();
        j0 j0Var2 = o0Var.f3887b;
        if (j0Var2 != null && j0Var2.f3797a.equals(j0Var.f3797a) && j0Var2.e.equals(j0Var.e) && Objects.equals(j0Var2.f3799c, j0Var.f3799c) && i10.f3888c.equals(o0Var.f3888c)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, androidx.biometric.e eVar, long j10) {
        a5.a b10 = b(g0Var);
        n2.k kVar = new n2.k(this.d.f17059c, 0, g0Var);
        c0 c0Var = this.f17625r;
        j2.k kVar2 = this.f47254g;
        kVar2.getClass();
        return new k(this.h, this.f17622o, this.f17616i, c0Var, this.f17618k, kVar, this.f17619l, b10, eVar, this.f17617j, this.f17620m, this.f17621n, kVar2);
    }

    @Override
    public final synchronized o0 i() {
        return this.f17626s;
    }

    @Override
    public final void k() {
        p2.e eVar = this.f17622o;
        y2.l lVar = eVar.h;
        if (lVar != null) {
            lVar.a();
        }
        w0 w0Var = eVar.v;
        if (w0Var == null) {
            Uri uri = eVar.F;
            if (uri != null) {
                eVar.j(uri);
                return;
            }
            return;
        }
        throw w0Var;
    }

    @Override
    public final void m(c0 c0Var) {
        boolean z10;
        this.f17625r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f47254g;
        kVar.getClass();
        n2.n nVar = this.f17618k;
        nVar.E(myLooper, kVar);
        nVar.b();
        a5.a b10 = b(null);
        j0 j0Var = i().f3887b;
        j0Var.getClass();
        Uri uri = j0Var.f3797a;
        p2.e eVar = this.f17622o;
        eVar.getClass();
        eVar.f43942n = m0.q(null);
        eVar.f43941f = b10;
        eVar.f43943r = this;
        Map map = Collections.EMPTY_MAP;
        u6.l(uri, "The uri must be set.");
        y2.o oVar = new y2.o(((g2.g) eVar.f43938a.f15843b).createDataSource(), new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, eVar.f43939b.J());
        if (eVar.h == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        y2.l lVar = new y2.l("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        eVar.h = lVar;
        lVar.f(oVar, eVar, eVar.f43940c.y3(oVar.f49936c));
    }

    @Override
    public final void o(e0 e0Var) {
        q[] qVarArr;
        p[] pVarArr;
        k kVar = (k) e0Var;
        kVar.f17607b.e.remove(kVar);
        for (q qVar : kVar.J) {
            if (qVar.T) {
                for (p pVar : qVar.L) {
                    pVar.l();
                    n2.h hVar = pVar.h;
                    if (hVar != null) {
                        hVar.a(pVar.e);
                        pVar.h = null;
                        pVar.f47283g = null;
                    }
                }
            }
            i iVar = qVar.d;
            int l4 = iVar.f17598r.l();
            p2.e eVar = iVar.f17588g;
            Uri c10 = iVar.e[l4].c();
            p2.d dVar = (p2.d) eVar.d.get(c10);
            if (dVar != null) {
                p2.c cVar = (p2.c) i2.e.i(dVar.f43936b, c10, c10);
                cVar.getClass();
                cVar.f43933w = false;
            }
            iVar.f17594n = null;
            qVar.f17658s.e(qVar);
            qVar.H.removeCallbacksAndMessages(null);
            qVar.X = true;
            qVar.I.clear();
        }
        kVar.G = null;
    }

    @Override
    public final void q() {
        p2.e eVar = this.f17622o;
        eVar.F = null;
        eVar.G = null;
        eVar.f43944s = null;
        eVar.f43945w = null;
        eVar.f43946x = null;
        eVar.f43947y = null;
        eVar.E = null;
        eVar.v = null;
        eVar.I = -9223372036854775807L;
        eVar.h.e(null);
        eVar.h = null;
        HashMap hashMap = eVar.d;
        for (p2.d dVar : hashMap.values()) {
            for (p2.c cVar : dVar.f43936b.values()) {
                cVar.f43928c.e(null);
            }
        }
        eVar.f43942n.removeCallbacksAndMessages(null);
        eVar.f43942n = null;
        hashMap.clear();
        this.f17618k.release();
    }

    @Override
    public final synchronized void t(o0 o0Var) {
        this.f17626s = o0Var;
    }

    public final void v(p2.n nVar) {
        long j10;
        long j11;
        long j12;
        k1 k1Var;
        long j13;
        long j14;
        long j15;
        long j16;
        boolean z10;
        float f7;
        long j17;
        boolean z11;
        boolean z12 = nVar.f44011p;
        boolean z13 = nVar.f44003g;
        n0 n0Var = nVar.f44013r;
        long j18 = nVar.f44016u;
        long j19 = nVar.e;
        int i10 = nVar.d;
        long j20 = nVar.h;
        if (z12) {
            j10 = m0.h0(j20);
        } else {
            j10 = -9223372036854775807L;
        }
        if (i10 != 2 && i10 != 1) {
            j11 = -9223372036854775807L;
        } else {
            j11 = j10;
        }
        p2.e eVar = this.f17622o;
        eVar.f43944s.getClass();
        u uVar = new u(14);
        long j21 = 0;
        if (eVar.H) {
            p2.m mVar = nVar.v;
            long j22 = j20 - eVar.I;
            boolean z14 = nVar.f44010o;
            if (z14) {
                j13 = j22 + j18;
            } else {
                j13 = -9223372036854775807L;
            }
            if (nVar.f44011p) {
                j14 = m0.S(m0.C(this.f17623p)) - (j20 + j18);
            } else {
                j14 = 0;
            }
            long j23 = this.f17624q.f3781a;
            if (j23 != -9223372036854775807L) {
                j16 = m0.S(j23);
            } else {
                if (j19 != -9223372036854775807L) {
                    j15 = j18 - j19;
                } else {
                    j15 = mVar.d;
                    if (j15 == -9223372036854775807L || nVar.f44009n == -9223372036854775807L) {
                        j15 = mVar.f44001c;
                        if (j15 == -9223372036854775807L) {
                            j15 = 3 * nVar.f44008m;
                        }
                    }
                }
                j16 = j15 + j14;
            }
            long j24 = j18 + j14;
            long j25 = m0.j(j16, j14, j24);
            i0 i0Var = i().f3888c;
            if (i0Var.d == -3.4028235E38f && i0Var.e == -3.4028235E38f && mVar.f44001c == -9223372036854775807L && mVar.d == -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            h0 a2 = this.f17624q.a();
            a2.f3770a = m0.h0(j25);
            float f10 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = this.f17624q.d;
            }
            a2.d = f7;
            if (!z10) {
                f10 = this.f17624q.e;
            }
            a2.e = f10;
            i0 i0Var2 = new i0(a2);
            this.f17624q = i0Var2;
            if (j19 == -9223372036854775807L) {
                j19 = j24 - m0.S(i0Var2.f3781a);
            }
            if (z13) {
                j21 = j19;
            } else {
                p2.i u10 = u(j19, nVar.f44014s);
                if (u10 != null) {
                    j17 = u10.e;
                } else if (!n0Var.isEmpty()) {
                    p2.k kVar = (p2.k) n0Var.get(m0.d(n0Var, Long.valueOf(j19), true));
                    p2.i u11 = u(j19, kVar.f43991x);
                    if (u11 != null) {
                        j17 = u11.e;
                    } else {
                        j17 = kVar.e;
                    }
                }
                j21 = j17;
            }
            if (i10 == 2 && nVar.f44002f) {
                z11 = true;
            } else {
                z11 = false;
            }
            k1Var = new k1(j11, j10, j13, nVar.f44016u, j22, j21, true, !z14, z11, uVar, i(), this.f17624q);
        } else {
            if (j19 != -9223372036854775807L && !n0Var.isEmpty()) {
                if (!z13 && j19 != j18) {
                    j19 = ((p2.k) n0Var.get(m0.d(n0Var, Long.valueOf(j19), true))).e;
                }
                j12 = j19;
            } else {
                j12 = 0;
            }
            long j26 = nVar.f44016u;
            k1Var = new k1(j11, j10, j26, j26, 0L, j12, true, false, true, uVar, i(), null);
        }
        n(k1Var);
    }
}
