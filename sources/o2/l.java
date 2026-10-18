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
    public final l2.f f17615i;
    public final oa.d f17616j;
    public final n2.n f17617k;
    public final oa.d f17618l;
    public final boolean f17619m;
    public final int f17620n;
    public final p2.d f17621o;
    public final long f17622p;
    public i0 f17623q;
    public c0 f17624r;
    public o0 f17625s;

    static {
        p0.a("media3.exoplayer.hls");
    }

    public l(o0 o0Var, l2.f fVar, c cVar, oa.d dVar, n2.n nVar, oa.d dVar2, p2.d dVar3, long j10, boolean z10, int i10) {
        this.f17625s = o0Var;
        this.f17623q = o0Var.f3892c;
        this.f17615i = fVar;
        this.h = cVar;
        this.f17616j = dVar;
        this.f17617k = nVar;
        this.f17618l = dVar2;
        this.f17621o = dVar3;
        this.f17622p = j10;
        this.f17619m = z10;
        this.f17620n = i10;
    }

    public static p2.h u(long j10, List list) {
        p2.h hVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            p2.h hVar2 = (p2.h) list.get(i10);
            long j11 = hVar2.e;
            if (j11 <= j10 && hVar2.f43980w) {
                hVar = hVar2;
            } else if (j11 > j10) {
                break;
            }
        }
        return hVar;
    }

    @Override
    public final boolean a(o0 o0Var) {
        o0 i10 = i();
        j0 j0Var = i10.f3891b;
        j0Var.getClass();
        j0 j0Var2 = o0Var.f3891b;
        if (j0Var2 != null && j0Var2.f3801a.equals(j0Var.f3801a) && j0Var2.e.equals(j0Var.e) && Objects.equals(j0Var2.f3803c, j0Var.f3803c) && i10.f3892c.equals(o0Var.f3892c)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, androidx.biometric.e eVar, long j10) {
        a5.a b10 = b(g0Var);
        n2.k kVar = new n2.k(this.d.f17058c, 0, g0Var);
        c0 c0Var = this.f17624r;
        j2.k kVar2 = this.f47245g;
        kVar2.getClass();
        return new k(this.h, this.f17621o, this.f17615i, c0Var, this.f17617k, kVar, this.f17618l, b10, eVar, this.f17616j, this.f17619m, this.f17620n, kVar2);
    }

    @Override
    public final synchronized o0 i() {
        return this.f17625s;
    }

    @Override
    public final void k() {
        p2.d dVar = this.f17621o;
        y2.l lVar = dVar.h;
        if (lVar != null) {
            lVar.a();
        }
        w0 w0Var = dVar.v;
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
    public final void m(c0 c0Var) {
        boolean z10;
        this.f17624r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f47245g;
        kVar.getClass();
        n2.n nVar = this.f17617k;
        nVar.E(myLooper, kVar);
        nVar.b();
        a5.a b10 = b(null);
        j0 j0Var = i().f3891b;
        j0Var.getClass();
        Uri uri = j0Var.f3801a;
        p2.d dVar = this.f17621o;
        dVar.getClass();
        dVar.f43937n = m0.q(null);
        dVar.f43936f = b10;
        dVar.f43938r = this;
        Map map = Collections.EMPTY_MAP;
        u6.l(uri, "The uri must be set.");
        y2.o oVar = new y2.o(((g2.g) dVar.f43933a.f15842b).createDataSource(), new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, dVar.f43934b.J());
        if (dVar.h == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        y2.l lVar = new y2.l("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        dVar.h = lVar;
        lVar.f(oVar, dVar, dVar.f43935c.y3(oVar.f49930c));
    }

    @Override
    public final void o(e0 e0Var) {
        q[] qVarArr;
        p[] pVarArr;
        k kVar = (k) e0Var;
        kVar.f17606b.e.remove(kVar);
        for (q qVar : kVar.J) {
            if (qVar.T) {
                for (p pVar : qVar.L) {
                    pVar.l();
                    n2.h hVar = pVar.h;
                    if (hVar != null) {
                        hVar.a(pVar.e);
                        pVar.h = null;
                        pVar.f47274g = null;
                    }
                }
            }
            i iVar = qVar.d;
            int l4 = iVar.f17597r.l();
            p2.d dVar = iVar.f17587g;
            Uri c10 = iVar.e[l4].c();
            p2.c cVar = (p2.c) dVar.d.get(c10);
            if (cVar != null) {
                p2.b bVar = (p2.b) i2.d.i(cVar.f43931b, c10, c10);
                bVar.getClass();
                bVar.f43928w = false;
            }
            iVar.f17593n = null;
            qVar.f17657s.e(qVar);
            qVar.H.removeCallbacksAndMessages(null);
            qVar.X = true;
            qVar.I.clear();
        }
        kVar.G = null;
    }

    @Override
    public final void q() {
        p2.d dVar = this.f17621o;
        dVar.F = null;
        dVar.G = null;
        dVar.f43939s = null;
        dVar.f43940w = null;
        dVar.f43941x = null;
        dVar.f43942y = null;
        dVar.E = null;
        dVar.v = null;
        dVar.I = -9223372036854775807L;
        dVar.h.e(null);
        dVar.h = null;
        HashMap hashMap = dVar.d;
        for (p2.c cVar : hashMap.values()) {
            for (p2.b bVar : cVar.f43931b.values()) {
                bVar.f43923c.e(null);
            }
        }
        dVar.f43937n.removeCallbacksAndMessages(null);
        dVar.f43937n = null;
        hashMap.clear();
        this.f17617k.release();
    }

    @Override
    public final synchronized void t(o0 o0Var) {
        this.f17625s = o0Var;
    }

    public final void v(p2.m mVar) {
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
        boolean z12 = mVar.f44006p;
        boolean z13 = mVar.f43998g;
        n0 n0Var = mVar.f44008r;
        long j18 = mVar.f44011u;
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
        p2.d dVar = this.f17621o;
        dVar.f43939s.getClass();
        u uVar = new u(14);
        long j21 = 0;
        if (dVar.H) {
            p2.l lVar = mVar.v;
            long j22 = j20 - dVar.I;
            boolean z14 = mVar.f44005o;
            if (z14) {
                j13 = j22 + j18;
            } else {
                j13 = -9223372036854775807L;
            }
            if (mVar.f44006p) {
                j14 = m0.S(m0.C(this.f17622p)) - (j20 + j18);
            } else {
                j14 = 0;
            }
            long j23 = this.f17623q.f3785a;
            if (j23 != -9223372036854775807L) {
                j16 = m0.S(j23);
            } else {
                if (j19 != -9223372036854775807L) {
                    j15 = j18 - j19;
                } else {
                    j15 = lVar.d;
                    if (j15 == -9223372036854775807L || mVar.f44004n == -9223372036854775807L) {
                        j15 = lVar.f43996c;
                        if (j15 == -9223372036854775807L) {
                            j15 = 3 * mVar.f44003m;
                        }
                    }
                }
                j16 = j15 + j14;
            }
            long j24 = j18 + j14;
            long j25 = m0.j(j16, j14, j24);
            i0 i0Var = i().f3892c;
            if (i0Var.d == -3.4028235E38f && i0Var.e == -3.4028235E38f && lVar.f43996c == -9223372036854775807L && lVar.d == -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            h0 a2 = this.f17623q.a();
            a2.f3774a = m0.h0(j25);
            float f10 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = this.f17623q.d;
            }
            a2.d = f7;
            if (!z10) {
                f10 = this.f17623q.e;
            }
            a2.e = f10;
            i0 i0Var2 = new i0(a2);
            this.f17623q = i0Var2;
            if (j19 == -9223372036854775807L) {
                j19 = j24 - m0.S(i0Var2.f3785a);
            }
            if (z13) {
                j21 = j19;
            } else {
                p2.h u10 = u(j19, mVar.f44009s);
                if (u10 != null) {
                    j17 = u10.e;
                } else if (!n0Var.isEmpty()) {
                    p2.j jVar = (p2.j) n0Var.get(m0.d(n0Var, Long.valueOf(j19), true));
                    p2.h u11 = u(j19, jVar.f43986x);
                    if (u11 != null) {
                        j17 = u11.e;
                    } else {
                        j17 = jVar.e;
                    }
                }
                j21 = j17;
            }
            if (i10 == 2 && mVar.f43997f) {
                z11 = true;
            } else {
                z11 = false;
            }
            k1Var = new k1(j11, j10, j13, mVar.f44011u, j22, j21, true, !z14, z11, uVar, i(), this.f17623q);
        } else {
            if (j19 != -9223372036854775807L && !n0Var.isEmpty()) {
                if (!z13 && j19 != j18) {
                    j19 = ((p2.j) n0Var.get(m0.d(n0Var, Long.valueOf(j19), true))).e;
                }
                j12 = j19;
            } else {
                j12 = 0;
            }
            long j26 = mVar.f44011u;
            k1Var = new k1(j11, j10, j26, j26, 0L, j12, true, false, true, uVar, i(), null);
        }
        n(k1Var);
    }
}
