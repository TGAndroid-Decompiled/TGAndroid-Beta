package o2;

import android.net.Uri;
import android.os.Looper;
import b2.i0;
import b2.j0;
import b2.k0;
import b2.p0;
import b2.q0;
import b2.x0;
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
import u2.j1;
import v7.u6;
public final class l extends u2.a {
    public final c h;
    public final m.h f16218i;
    public final oa.d f16219j;
    public final n2.m f16220k;
    public final oa.d f16221l;
    public final boolean f16222m;
    public final int f16223n;
    public final p2.d f16224o;
    public final long f16225p;
    public j0 f16226q;
    public c0 f16227r;
    public p0 f16228s;

    static {
        q0.a("media3.exoplayer.hls");
    }

    public l(p0 p0Var, m.h hVar, c cVar, oa.d dVar, n2.m mVar, oa.d dVar2, p2.d dVar3, long j10, boolean z10, int i10) {
        this.f16228s = p0Var;
        this.f16226q = p0Var.f2283c;
        this.f16218i = hVar;
        this.h = cVar;
        this.f16219j = dVar;
        this.f16220k = mVar;
        this.f16221l = dVar2;
        this.f16224o = dVar3;
        this.f16225p = j10;
        this.f16222m = z10;
        this.f16223n = i10;
    }

    public static p2.h u(long j10, List list) {
        p2.h hVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            p2.h hVar2 = (p2.h) list.get(i10);
            long j11 = hVar2.e;
            if (j11 <= j10 && hVar2.f42593w) {
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
        k0 k0Var = i10.f2282b;
        k0Var.getClass();
        k0 k0Var2 = p0Var.f2282b;
        if (k0Var2 != null && k0Var2.f2192a.equals(k0Var.f2192a) && k0Var2.e.equals(k0Var.e) && Objects.equals(k0Var2.f2194c, k0Var.f2194c) && i10.f2283c.equals(p0Var.f2283c)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, androidx.biometric.e eVar, long j10) {
        a5.a b10 = b(g0Var);
        n2.j jVar = new n2.j(this.d.f15676c, 0, g0Var);
        c0 c0Var = this.f16227r;
        j2.k kVar = this.f45863g;
        kVar.getClass();
        return new k(this.h, this.f16224o, this.f16218i, c0Var, this.f16220k, jVar, this.f16221l, b10, eVar, this.f16219j, this.f16222m, this.f16223n, kVar);
    }

    @Override
    public final synchronized p0 i() {
        return this.f16228s;
    }

    @Override
    public final void k() {
        p2.d dVar = this.f16224o;
        y2.l lVar = dVar.h;
        if (lVar != null) {
            lVar.b();
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
        this.f16227r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f45863g;
        kVar.getClass();
        n2.m mVar = this.f16220k;
        mVar.F(myLooper, kVar);
        mVar.b();
        a5.a b10 = b(null);
        k0 k0Var = i().f2282b;
        k0Var.getClass();
        Uri uri = k0Var.f2192a;
        p2.d dVar = this.f16224o;
        dVar.getClass();
        dVar.f42550n = m0.q(null);
        dVar.f42549f = b10;
        dVar.f42551r = this;
        Map map = Collections.EMPTY_MAP;
        u6.l(uri, "The uri must be set.");
        y2.o oVar = new y2.o(((g2.g) dVar.f42546a.f14848b).createDataSource(), new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, dVar.f42547b.U());
        if (dVar.h == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        y2.l lVar = new y2.l("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        dVar.h = lVar;
        lVar.f(oVar, dVar, dVar.f42548c.y3(oVar.f48547c));
    }

    @Override
    public final void o(e0 e0Var) {
        q[] qVarArr;
        p[] pVarArr;
        k kVar = (k) e0Var;
        kVar.f16209b.e.remove(kVar);
        for (q qVar : kVar.J) {
            if (qVar.T) {
                for (p pVar : qVar.L) {
                    pVar.l();
                    n2.g gVar = pVar.h;
                    if (gVar != null) {
                        gVar.a(pVar.e);
                        pVar.h = null;
                        pVar.f45886g = null;
                    }
                }
            }
            i iVar = qVar.d;
            int l4 = iVar.f16200r.l();
            p2.d dVar = iVar.f16190g;
            Uri c10 = iVar.e[l4].c();
            p2.c cVar = (p2.c) dVar.d.get(c10);
            if (cVar != null) {
                p2.b bVar = (p2.b) i2.d.i(cVar.f42544b, c10, c10);
                bVar.getClass();
                bVar.f42541w = false;
            }
            iVar.f16196n = null;
            qVar.f16260s.e(qVar);
            qVar.H.removeCallbacksAndMessages(null);
            qVar.X = true;
            qVar.I.clear();
        }
        kVar.G = null;
    }

    @Override
    public final void q() {
        p2.d dVar = this.f16224o;
        dVar.F = null;
        dVar.G = null;
        dVar.f42552s = null;
        dVar.f42553w = null;
        dVar.f42554x = null;
        dVar.f42555y = null;
        dVar.E = null;
        dVar.v = null;
        dVar.I = -9223372036854775807L;
        dVar.h.e(null);
        dVar.h = null;
        HashMap hashMap = dVar.d;
        for (p2.c cVar : hashMap.values()) {
            for (p2.b bVar : cVar.f42544b.values()) {
                bVar.f42536c.e(null);
            }
        }
        dVar.f42550n.removeCallbacksAndMessages(null);
        dVar.f42550n = null;
        hashMap.clear();
        this.f16220k.release();
    }

    @Override
    public final synchronized void t(p0 p0Var) {
        this.f16228s = p0Var;
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
        boolean z12 = mVar.f42619p;
        boolean z13 = mVar.f42611g;
        n0 n0Var = mVar.f42621r;
        long j18 = mVar.f42624u;
        long j19 = mVar.e;
        int i10 = mVar.d;
        long j20 = mVar.h;
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
        p2.d dVar = this.f16224o;
        dVar.f42552s.getClass();
        u uVar = new u(14);
        long j21 = 0;
        if (dVar.H) {
            p2.l lVar = mVar.v;
            long j22 = j20 - dVar.I;
            boolean z14 = mVar.f42618o;
            if (z14) {
                j13 = j22 + j18;
            } else {
                j13 = -9223372036854775807L;
            }
            if (mVar.f42619p) {
                j14 = m0.S(m0.C(this.f16225p)) - (j20 + j18);
            } else {
                j14 = 0;
            }
            long j23 = this.f16226q.f2176a;
            if (j23 != -9223372036854775807L) {
                j16 = m0.S(j23);
            } else {
                if (j19 != -9223372036854775807L) {
                    j15 = j18 - j19;
                } else {
                    j15 = lVar.d;
                    if (j15 == -9223372036854775807L || mVar.f42617n == -9223372036854775807L) {
                        j15 = lVar.f42609c;
                        if (j15 == -9223372036854775807L) {
                            j15 = 3 * mVar.f42616m;
                        }
                    }
                }
                j16 = j15 + j14;
            }
            long j24 = j18 + j14;
            long j25 = m0.j(j16, j14, j24);
            j0 j0Var = i().f2283c;
            if (j0Var.d == -3.4028235E38f && j0Var.e == -3.4028235E38f && lVar.f42609c == -9223372036854775807L && lVar.d == -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            i0 a2 = this.f16226q.a();
            a2.f2165a = m0.h0(j25);
            float f10 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = this.f16226q.d;
            }
            a2.d = f7;
            if (!z10) {
                f10 = this.f16226q.e;
            }
            a2.e = f10;
            j0 j0Var2 = new j0(a2);
            this.f16226q = j0Var2;
            if (j19 == -9223372036854775807L) {
                j19 = j24 - m0.S(j0Var2.f2176a);
            }
            if (z13) {
                j21 = j19;
            } else {
                p2.h u10 = u(j19, mVar.f42622s);
                if (u10 != null) {
                    j17 = u10.e;
                } else if (!n0Var.isEmpty()) {
                    p2.j jVar = (p2.j) n0Var.get(m0.d(n0Var, Long.valueOf(j19), true));
                    p2.h u11 = u(j19, jVar.f42599x);
                    if (u11 != null) {
                        j17 = u11.e;
                    } else {
                        j17 = jVar.e;
                    }
                }
                j21 = j17;
            }
            if (i10 == 2 && mVar.f42610f) {
                z11 = true;
            } else {
                z11 = false;
            }
            j1Var = new j1(j11, j10, j13, mVar.f42624u, j22, j21, true, !z14, z11, uVar, i(), this.f16226q);
        } else {
            if (j19 != -9223372036854775807L && !n0Var.isEmpty()) {
                if (!z13 && j19 != j18) {
                    j19 = ((p2.j) n0Var.get(m0.d(n0Var, Long.valueOf(j19), true))).e;
                }
                j12 = j19;
            } else {
                j12 = 0;
            }
            long j26 = mVar.f42624u;
            j1Var = new j1(j11, j10, j26, j26, 0L, j12, true, false, true, uVar, i(), null);
        }
        n(j1Var);
    }
}
