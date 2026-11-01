package o2;

import android.net.Uri;
import android.os.Looper;
import android.support.v4.media.session.a0;
import b2.i0;
import b2.j0;
import b2.k0;
import b2.p0;
import b2.q0;
import b2.w0;
import e2.l0;
import e9.n0;
import g2.d0;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import u2.e0;
import u2.g0;
import u2.j1;
import v7.t6;
public final class l extends u2.a {
    public final c h;
    public final l2.f f14017i;
    public final kb.a f14018j;
    public final n2.m f14019k;
    public final hb.a f14020l;
    public final boolean f14021m;
    public final int f14022n;
    public final p2.d f14023o;
    public final long f14024p;
    public j0 f14025q;
    public d0 f14026r;
    public p0 f14027s;

    static {
        q0.a("media3.exoplayer.hls");
    }

    public l(p0 p0Var, l2.f fVar, c cVar, kb.a aVar, n2.m mVar, hb.a aVar2, p2.d dVar, long j10, boolean z10, int i10) {
        this.f14027s = p0Var;
        this.f14025q = p0Var.f2183c;
        this.f14017i = fVar;
        this.h = cVar;
        this.f14018j = aVar;
        this.f14019k = mVar;
        this.f14020l = aVar2;
        this.f14023o = dVar;
        this.f14024p = j10;
        this.f14021m = z10;
        this.f14022n = i10;
    }

    public static p2.h u(long j10, List list) {
        p2.h hVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            p2.h hVar2 = (p2.h) list.get(i10);
            long j11 = hVar2.e;
            if (j11 <= j10 && hVar2.f44605x) {
                hVar = hVar2;
            } else if (j11 > j10) {
                break;
            }
        }
        return hVar;
    }

    @Override
    public final boolean a(p0 p0Var) {
        p0 i10 = i();
        k0 k0Var = i10.f2182b;
        k0Var.getClass();
        k0 k0Var2 = p0Var.f2182b;
        if (k0Var2 != null && k0Var2.f2091a.equals(k0Var.f2091a) && k0Var2.e.equals(k0Var.e) && Objects.equals(k0Var2.f2093c, k0Var.f2093c) && i10.f2183c.equals(p0Var.f2183c)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, a0 a0Var, long j10) {
        a5.a b10 = b(g0Var);
        n2.j jVar = new n2.j(this.d.f13464c, 0, g0Var);
        d0 d0Var = this.f14026r;
        j2.l lVar = this.f49835g;
        lVar.getClass();
        return new k(this.h, this.f14023o, this.f14017i, d0Var, this.f14019k, jVar, this.f14020l, b10, a0Var, this.f14018j, this.f14021m, this.f14022n, lVar);
    }

    @Override
    public final synchronized p0 i() {
        return this.f14027s;
    }

    @Override
    public final void k() {
        p2.d dVar = this.f14023o;
        y2.l lVar = dVar.h;
        if (lVar != null) {
            lVar.a();
        }
        w0 w0Var = dVar.f44565w;
        if (w0Var == null) {
            Uri uri = dVar.F;
            if (uri != null) {
                dVar.h(uri);
                return;
            }
            return;
        }
        throw w0Var;
    }

    @Override
    public final void m(d0 d0Var) {
        boolean z10;
        this.f14026r = d0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.l lVar = this.f49835g;
        lVar.getClass();
        n2.m mVar = this.f14019k;
        mVar.g(myLooper, lVar);
        mVar.a();
        a5.a b10 = b(null);
        k0 k0Var = i().f2182b;
        k0Var.getClass();
        Uri uri = k0Var.f2091a;
        p2.d dVar = this.f14023o;
        dVar.getClass();
        dVar.f44562n = l0.q(null);
        dVar.f44561f = b10;
        dVar.f44563r = this;
        Map map = Collections.EMPTY_MAP;
        t6.l(uri, "The uri must be set.");
        y2.o oVar = new y2.o(((g2.g) dVar.f44558a.f11588b).createDataSource(), new g2.n(uri, 1, null, map, 0L, -1L, null, 1), 4, dVar.f44559b.M1());
        if (dVar.h == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.p(z10);
        y2.l lVar2 = new y2.l("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        dVar.h = lVar2;
        lVar2.f(oVar, dVar, dVar.f44560c.q0(oVar.f54190c));
    }

    @Override
    public final void o(e0 e0Var) {
        q[] qVarArr;
        p[] pVarArr;
        k kVar = (k) e0Var;
        kVar.f14008b.e.remove(kVar);
        for (q qVar : kVar.J) {
            if (qVar.T) {
                for (p pVar : qVar.L) {
                    pVar.l();
                    n2.g gVar = pVar.h;
                    if (gVar != null) {
                        gVar.a(pVar.e);
                        pVar.h = null;
                        pVar.f49858g = null;
                    }
                }
            }
            i iVar = qVar.d;
            int l4 = iVar.f13999r.l();
            p2.d dVar = iVar.f13989g;
            Uri c10 = iVar.e[l4].c();
            p2.c cVar = (p2.c) dVar.d.get(c10);
            if (cVar != null) {
                p2.b bVar = (p2.b) i0.a.h(cVar.f44556b, c10, c10);
                bVar.getClass();
                bVar.f44553x = false;
            }
            iVar.f13995n = null;
            qVar.f14059s.e(qVar);
            qVar.H.removeCallbacksAndMessages(null);
            qVar.X = true;
            qVar.I.clear();
        }
        kVar.G = null;
    }

    @Override
    public final void q() {
        p2.d dVar = this.f14023o;
        dVar.F = null;
        dVar.G = null;
        dVar.f44564s = null;
        dVar.f44566x = null;
        dVar.f44567y = null;
        dVar.D = null;
        dVar.E = null;
        dVar.f44565w = null;
        dVar.I = -9223372036854775807L;
        dVar.h.e(null);
        dVar.h = null;
        HashMap hashMap = dVar.d;
        for (p2.c cVar : hashMap.values()) {
            for (p2.b bVar : cVar.f44556b.values()) {
                bVar.f44547c.e(null);
            }
        }
        dVar.f44562n.removeCallbacksAndMessages(null);
        dVar.f44562n = null;
        hashMap.clear();
        this.f14019k.release();
    }

    @Override
    public final synchronized void t(p0 p0Var) {
        this.f14027s = p0Var;
    }

    public final void v(p2.m mVar) {
        long j10;
        long j11;
        long j12;
        j1 j1Var;
        long j13;
        long j14;
        long j15;
        long j16;
        boolean z10;
        float f7;
        long j17;
        boolean z11;
        boolean z12 = mVar.f44632p;
        boolean z13 = mVar.f44624g;
        n0 n0Var = mVar.f44634r;
        long j18 = mVar.f44637u;
        long j19 = mVar.e;
        int i10 = mVar.d;
        long j20 = mVar.h;
        if (z12) {
            j10 = l0.h0(j20);
        } else {
            j10 = -9223372036854775807L;
        }
        if (i10 != 2 && i10 != 1) {
            j11 = -9223372036854775807L;
        } else {
            j11 = j10;
        }
        p2.d dVar = this.f14023o;
        dVar.f44564s.getClass();
        kb.a aVar = new kb.a(13);
        long j21 = 0;
        if (dVar.H) {
            p2.l lVar = mVar.v;
            long j22 = j20 - dVar.I;
            boolean z14 = mVar.f44631o;
            if (z14) {
                j13 = j22 + j18;
            } else {
                j13 = -9223372036854775807L;
            }
            if (mVar.f44632p) {
                j14 = l0.S(l0.C(this.f14024p)) - (j20 + j18);
            } else {
                j14 = 0;
            }
            long j23 = this.f14025q.f2077a;
            if (j23 != -9223372036854775807L) {
                j16 = l0.S(j23);
            } else {
                if (j19 != -9223372036854775807L) {
                    j15 = j18 - j19;
                } else {
                    j15 = lVar.d;
                    if (j15 == -9223372036854775807L || mVar.f44630n == -9223372036854775807L) {
                        j15 = lVar.f44622c;
                        if (j15 == -9223372036854775807L) {
                            j15 = 3 * mVar.f44629m;
                        }
                    }
                }
                j16 = j15 + j14;
            }
            long j24 = j18 + j14;
            long j25 = l0.j(j16, j14, j24);
            j0 j0Var = i().f2183c;
            if (j0Var.d == -3.4028235E38f && j0Var.e == -3.4028235E38f && lVar.f44622c == -9223372036854775807L && lVar.d == -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            i0 a2 = this.f14025q.a();
            a2.f2064a = l0.h0(j25);
            float f10 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = this.f14025q.d;
            }
            a2.d = f7;
            if (!z10) {
                f10 = this.f14025q.e;
            }
            a2.e = f10;
            j0 j0Var2 = new j0(a2);
            this.f14025q = j0Var2;
            if (j19 == -9223372036854775807L) {
                j19 = j24 - l0.S(j0Var2.f2077a);
            }
            if (z13) {
                j21 = j19;
            } else {
                p2.h u10 = u(j19, mVar.f44635s);
                if (u10 != null) {
                    j17 = u10.e;
                } else if (!n0Var.isEmpty()) {
                    p2.j jVar = (p2.j) n0Var.get(l0.d(n0Var, Long.valueOf(j19), true));
                    p2.h u11 = u(j19, jVar.f44611y);
                    if (u11 != null) {
                        j17 = u11.e;
                    } else {
                        j17 = jVar.e;
                    }
                }
                j21 = j17;
            }
            if (i10 == 2 && mVar.f44623f) {
                z11 = true;
            } else {
                z11 = false;
            }
            j1Var = new j1(j11, j10, j13, mVar.f44637u, j22, j21, true, !z14, z11, aVar, i(), this.f14025q);
        } else {
            if (j19 != -9223372036854775807L && !n0Var.isEmpty()) {
                if (!z13 && j19 != j18) {
                    j19 = ((p2.j) n0Var.get(l0.d(n0Var, Long.valueOf(j19), true))).e;
                }
                j12 = j19;
            } else {
                j12 = 0;
            }
            long j26 = mVar.f44637u;
            j1Var = new j1(j11, j10, j26, j26, 0L, j12, true, false, true, aVar, i(), null);
        }
        n(j1Var);
    }
}
