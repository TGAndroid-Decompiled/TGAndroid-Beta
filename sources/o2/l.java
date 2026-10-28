package o2;

import a8.h0;
import a8.ng;
import a8.yb;
import android.net.Uri;
import android.os.Looper;
import b2.j0;
import b2.k0;
import b2.p0;
import b2.q0;
import b2.x0;
import e2.n0;
import f9.i0;
import g2.c0;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import li.e3;
import u2.e0;
import u2.g0;
import u2.j1;
public final class l extends u2.a {
    public final c h;
    public final e3 f19025i;
    public final pa.d f19026j;
    public final n2.m f19027k;
    public final u7.s f19028l;
    public final boolean f19029m;
    public final int f19030n;
    public final p2.d f19031o;
    public final long f19032p;
    public j0 f19033q;
    public c0 f19034r;
    public p0 f19035s;

    static {
        q0.a("media3.exoplayer.hls");
    }

    public l(p0 p0Var, e3 e3Var, c cVar, pa.d dVar, n2.m mVar, u7.s sVar, p2.d dVar2, long j10, boolean z10, int i10) {
        this.f19035s = p0Var;
        this.f19033q = p0Var.f3346c;
        this.f19025i = e3Var;
        this.h = cVar;
        this.f19026j = dVar;
        this.f19027k = mVar;
        this.f19028l = sVar;
        this.f19031o = dVar2;
        this.f19032p = j10;
        this.f19029m = z10;
        this.f19030n = i10;
    }

    public static p2.h u(long j10, List list) {
        p2.h hVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            p2.h hVar2 = (p2.h) list.get(i10);
            long j11 = hVar2.e;
            if (j11 <= j10 && hVar2.f46581w) {
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
        k0 k0Var = i10.f3345b;
        k0Var.getClass();
        k0 k0Var2 = p0Var.f3345b;
        if (k0Var2 != null && k0Var2.f3255a.equals(k0Var.f3255a) && k0Var2.e.equals(k0Var.e) && Objects.equals(k0Var2.f3257c, k0Var.f3257c) && i10.f3346c.equals(p0Var.f3346c)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, h0 h0Var, long j10) {
        ng b10 = b(g0Var);
        n2.j jVar = new n2.j(this.d.f18626c, 0, g0Var);
        c0 c0Var = this.f19034r;
        j2.j jVar2 = this.f49278g;
        jVar2.getClass();
        return new k(this.h, this.f19031o, this.f19025i, c0Var, this.f19027k, jVar, this.f19028l, b10, h0Var, this.f19026j, this.f19029m, this.f19030n, jVar2);
    }

    @Override
    public final synchronized p0 i() {
        return this.f19035s;
    }

    @Override
    public final void k() {
        p2.d dVar = this.f19031o;
        y2.l lVar = dVar.h;
        if (lVar != null) {
            lVar.d();
        }
        x0 x0Var = dVar.v;
        if (x0Var == null) {
            Uri uri = dVar.F;
            if (uri != null) {
                dVar.h(uri);
                return;
            }
            return;
        }
        throw x0Var;
    }

    @Override
    public final void m(c0 c0Var) {
        boolean z10;
        this.f19034r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.j jVar = this.f49278g;
        jVar.getClass();
        n2.m mVar = this.f19027k;
        mVar.f(myLooper, jVar);
        mVar.a();
        ng b10 = b(null);
        k0 k0Var = i().f3345b;
        k0Var.getClass();
        Uri uri = k0Var.f3255a;
        p2.d dVar = this.f19031o;
        dVar.getClass();
        dVar.f46538n = n0.q(null);
        dVar.f46537f = b10;
        dVar.f46539r = this;
        Map map = Collections.EMPTY_MAP;
        yb.l(uri, "The uri must be set.");
        y2.o oVar = new y2.o(((g2.g) dVar.f46534a.f17209b).createDataSource(), new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, dVar.f46535b.G());
        if (dVar.h == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.p(z10);
        y2.l lVar = new y2.l("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        dVar.h = lVar;
        lVar.f(oVar, dVar, dVar.f46536c.B0(oVar.f52027c));
    }

    @Override
    public final void o(e0 e0Var) {
        q[] qVarArr;
        p[] pVarArr;
        k kVar = (k) e0Var;
        kVar.f19016b.e.remove(kVar);
        for (q qVar : kVar.J) {
            if (qVar.T) {
                for (p pVar : qVar.L) {
                    pVar.l();
                    n2.g gVar = pVar.h;
                    if (gVar != null) {
                        gVar.a(pVar.e);
                        pVar.h = null;
                        pVar.f49301g = null;
                    }
                }
            }
            i iVar = qVar.d;
            int l4 = iVar.f19007r.l();
            p2.d dVar = iVar.f18997g;
            Uri c10 = iVar.e[l4].c();
            p2.c cVar = (p2.c) dVar.d.get(c10);
            if (cVar != null) {
                p2.b bVar = (p2.b) ic.a.h(cVar.f46532b, c10, c10);
                bVar.getClass();
                bVar.f46529w = false;
            }
            iVar.f19003n = null;
            qVar.f19067s.e(qVar);
            qVar.H.removeCallbacksAndMessages(null);
            qVar.X = true;
            qVar.I.clear();
        }
        kVar.G = null;
    }

    @Override
    public final void q() {
        p2.d dVar = this.f19031o;
        dVar.F = null;
        dVar.G = null;
        dVar.f46540s = null;
        dVar.f46541w = null;
        dVar.f46542x = null;
        dVar.f46543y = null;
        dVar.E = null;
        dVar.v = null;
        dVar.I = -9223372036854775807L;
        dVar.h.e(null);
        dVar.h = null;
        HashMap hashMap = dVar.d;
        for (p2.c cVar : hashMap.values()) {
            for (p2.b bVar : cVar.f46532b.values()) {
                bVar.f46524c.e(null);
            }
        }
        dVar.f46538n.removeCallbacksAndMessages(null);
        dVar.f46538n = null;
        hashMap.clear();
        this.f19027k.release();
    }

    @Override
    public final synchronized void t(p0 p0Var) {
        this.f19035s = p0Var;
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
        boolean z12 = mVar.f46607p;
        boolean z13 = mVar.f46599g;
        i0 i0Var = mVar.f46609r;
        long j18 = mVar.f46612u;
        long j19 = mVar.e;
        int i10 = mVar.d;
        long j20 = mVar.h;
        if (z12) {
            j10 = n0.h0(j20);
        } else {
            j10 = -9223372036854775807L;
        }
        if (i10 != 2 && i10 != 1) {
            j11 = -9223372036854775807L;
        } else {
            j11 = j10;
        }
        p2.d dVar = this.f19031o;
        dVar.f46540s.getClass();
        sb.b bVar = new sb.b(14);
        long j21 = 0;
        if (dVar.H) {
            p2.l lVar = mVar.v;
            long j22 = j20 - dVar.I;
            boolean z14 = mVar.f46606o;
            if (z14) {
                j13 = j22 + j18;
            } else {
                j13 = -9223372036854775807L;
            }
            if (mVar.f46607p) {
                j14 = n0.S(n0.C(this.f19032p)) - (j20 + j18);
            } else {
                j14 = 0;
            }
            long j23 = this.f19033q.f3239a;
            if (j23 != -9223372036854775807L) {
                j16 = n0.S(j23);
            } else {
                if (j19 != -9223372036854775807L) {
                    j15 = j18 - j19;
                } else {
                    j15 = lVar.d;
                    if (j15 == -9223372036854775807L || mVar.f46605n == -9223372036854775807L) {
                        j15 = lVar.f46597c;
                        if (j15 == -9223372036854775807L) {
                            j15 = 3 * mVar.f46604m;
                        }
                    }
                }
                j16 = j15 + j14;
            }
            long j24 = j18 + j14;
            long j25 = n0.j(j16, j14, j24);
            j0 j0Var = i().f3346c;
            if (j0Var.d == -3.4028235E38f && j0Var.e == -3.4028235E38f && lVar.f46597c == -9223372036854775807L && lVar.d == -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            b2.i0 a2 = this.f19033q.a();
            a2.f3228a = n0.h0(j25);
            float f10 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = this.f19033q.d;
            }
            a2.d = f7;
            if (!z10) {
                f10 = this.f19033q.e;
            }
            a2.e = f10;
            j0 j0Var2 = new j0(a2);
            this.f19033q = j0Var2;
            if (j19 == -9223372036854775807L) {
                j19 = j24 - n0.S(j0Var2.f3239a);
            }
            if (z13) {
                j21 = j19;
            } else {
                p2.h u10 = u(j19, mVar.f46610s);
                if (u10 != null) {
                    j17 = u10.e;
                } else if (!i0Var.isEmpty()) {
                    p2.j jVar = (p2.j) i0Var.get(n0.d(i0Var, Long.valueOf(j19), true));
                    p2.h u11 = u(j19, jVar.f46587x);
                    if (u11 != null) {
                        j17 = u11.e;
                    } else {
                        j17 = jVar.e;
                    }
                }
                j21 = j17;
            }
            if (i10 == 2 && mVar.f46598f) {
                z11 = true;
            } else {
                z11 = false;
            }
            j1Var = new j1(j11, j10, j13, mVar.f46612u, j22, j21, true, !z14, z11, bVar, i(), this.f19033q);
        } else {
            if (j19 != -9223372036854775807L && !i0Var.isEmpty()) {
                if (!z13 && j19 != j18) {
                    j19 = ((p2.j) i0Var.get(n0.d(i0Var, Long.valueOf(j19), true))).e;
                }
                j12 = j19;
            } else {
                j12 = 0;
            }
            long j26 = mVar.f46612u;
            j1Var = new j1(j11, j10, j26, j26, 0L, j12, true, false, true, bVar, i(), null);
        }
        n(j1Var);
    }
}
