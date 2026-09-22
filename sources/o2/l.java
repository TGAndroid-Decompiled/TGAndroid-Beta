package o2;

import android.net.Uri;
import android.os.Looper;
import b2.e0;
import b2.f0;
import b2.k0;
import b2.l0;
import e9.i0;
import g2.c0;
import j$.util.Objects;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k2.u;
import u2.d0;
import u2.h1;
public final class l extends u2.a {
    public final c h;
    public final u f15405i;
    public final ob.a f15406j;
    public final n2.m f15407k;
    public final qb.b f15408l;
    public final boolean f15409m;
    public final int f15410n;
    public final p2.d f15411o;
    public final long f15412p;
    public e0 f15413q;
    public c0 f15414r;
    public k0 f15415s;

    static {
        l0.a("media3.exoplayer.hls");
    }

    public l(k0 k0Var, u uVar, c cVar, ob.a aVar, n2.m mVar, qb.b bVar, p2.d dVar, long j3, boolean z10, int i10) {
        this.f15415s = k0Var;
        this.f15413q = k0Var.f3076c;
        this.f15405i = uVar;
        this.h = cVar;
        this.f15406j = aVar;
        this.f15407k = mVar;
        this.f15408l = bVar;
        this.f15411o = dVar;
        this.f15412p = j3;
        this.f15409m = z10;
        this.f15410n = i10;
    }

    public static p2.h u(long j3, List list) {
        p2.h hVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            p2.h hVar2 = (p2.h) list.get(i10);
            long j10 = hVar2.e;
            if (j10 <= j3 && hVar2.f40444w) {
                hVar = hVar2;
            } else if (j10 > j3) {
                break;
            }
        }
        return hVar;
    }

    @Override
    public final boolean a(k0 k0Var) {
        k0 i10 = i();
        f0 f0Var = i10.f3075b;
        f0Var.getClass();
        f0 f0Var2 = k0Var.f3075b;
        if (f0Var2 != null && f0Var2.f2990a.equals(f0Var.f2990a) && f0Var2.e.equals(f0Var.e) && Objects.equals(f0Var2.f2992c, f0Var.f2992c) && i10.f3076c.equals(k0Var.f3076c)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(u2.f0 f0Var, y2.d dVar, long j3) {
        a5.a b10 = b(f0Var);
        n2.j jVar = new n2.j(this.d.f14905c, 0, f0Var);
        c0 c0Var = this.f15414r;
        j2.k kVar = this.f43299g;
        e2.d.h(kVar);
        return new k(this.h, this.f15411o, this.f15405i, c0Var, this.f15407k, jVar, this.f15408l, b10, dVar, this.f15406j, this.f15409m, this.f15410n, kVar);
    }

    @Override
    public final synchronized k0 i() {
        return this.f15415s;
    }

    @Override
    public final void k() {
        p2.d dVar = this.f15411o;
        y2.m mVar = dVar.h;
        if (mVar != null) {
            mVar.a();
        }
        Uri uri = dVar.v;
        if (uri != null) {
            p2.c cVar = (p2.c) dVar.d.get(uri);
            cVar.f40396b.a();
            IOException iOException = cVar.f40401s;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final void m(c0 c0Var) {
        boolean z10;
        this.f15414r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f43299g;
        e2.d.h(kVar);
        n2.m mVar = this.f15407k;
        mVar.C(myLooper, kVar);
        mVar.b();
        a5.a b10 = b(null);
        f0 f0Var = i().f3075b;
        f0Var.getClass();
        Uri uri = f0Var.f2990a;
        p2.d dVar = this.f15411o;
        dVar.getClass();
        dVar.f40407n = e2.d0.o(null);
        dVar.f40406f = b10;
        dVar.f40408r = this;
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.p pVar = new y2.p(((g2.g) dVar.f40403a.f13384b).createDataSource(), new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, dVar.f40404b.D());
        if (dVar.h == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        y2.m mVar2 = new y2.m("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        dVar.h = mVar2;
        mVar2.f(pVar, dVar, dVar.f40405c.L3(pVar.f46296c));
    }

    @Override
    public final void o(d0 d0Var) {
        q[] qVarArr;
        p[] pVarArr;
        k kVar = (k) d0Var;
        kVar.f15396b.e.remove(kVar);
        for (q qVar : kVar.J) {
            if (qVar.T) {
                for (p pVar : qVar.L) {
                    pVar.k();
                    n2.g gVar = pVar.h;
                    if (gVar != null) {
                        gVar.a(pVar.e);
                        pVar.h = null;
                        pVar.f43312g = null;
                    }
                }
            }
            i iVar = qVar.d;
            p2.c cVar = (p2.c) iVar.f15377g.d.get(iVar.e[iVar.f15387r.l()]);
            if (cVar != null) {
                cVar.v = false;
            }
            iVar.f15383n = null;
            qVar.f15446s.e(qVar);
            qVar.H.removeCallbacksAndMessages(null);
            qVar.X = true;
            qVar.I.clear();
        }
        kVar.G = null;
    }

    @Override
    public final void q() {
        p2.d dVar = this.f15411o;
        dVar.v = null;
        dVar.f40410w = null;
        dVar.f40409s = null;
        dVar.f40412y = -9223372036854775807L;
        dVar.h.e(null);
        dVar.h = null;
        HashMap hashMap = dVar.d;
        for (p2.c cVar : hashMap.values()) {
            cVar.f40396b.e(null);
        }
        dVar.f40407n.removeCallbacksAndMessages(null);
        dVar.f40407n = null;
        hashMap.clear();
        this.f15407k.release();
    }

    @Override
    public final synchronized void t(k0 k0Var) {
        this.f15415s = k0Var;
    }

    public final void v(p2.m mVar) {
        long j3;
        long j10;
        long j11;
        h1 h1Var;
        long j12;
        long j13;
        long j14;
        long j15;
        boolean z10;
        float f7;
        long j16;
        boolean z11;
        boolean z12 = mVar.f40470p;
        boolean z13 = mVar.f40462g;
        i0 i0Var = mVar.f40472r;
        long j17 = mVar.f40475u;
        long j18 = mVar.e;
        int i10 = mVar.d;
        long j19 = mVar.h;
        if (z12) {
            j3 = e2.d0.e0(j19);
        } else {
            j3 = -9223372036854775807L;
        }
        if (i10 != 2 && i10 != 1) {
            j10 = -9223372036854775807L;
        } else {
            j10 = j3;
        }
        p2.d dVar = this.f15411o;
        dVar.f40409s.getClass();
        na.d dVar2 = new na.d(16);
        long j20 = 0;
        if (dVar.f40411x) {
            p2.l lVar = mVar.v;
            long j21 = j19 - dVar.f40412y;
            boolean z14 = mVar.f40469o;
            if (z14) {
                j12 = j21 + j17;
            } else {
                j12 = -9223372036854775807L;
            }
            if (mVar.f40470p) {
                j13 = e2.d0.Q(e2.d0.A(this.f15412p)) - (j19 + j17);
            } else {
                j13 = 0;
            }
            long j22 = this.f15413q.f2975a;
            if (j22 != -9223372036854775807L) {
                j15 = e2.d0.Q(j22);
            } else {
                if (j18 != -9223372036854775807L) {
                    j14 = j17 - j18;
                } else {
                    j14 = lVar.d;
                    if (j14 == -9223372036854775807L || mVar.f40468n == -9223372036854775807L) {
                        j14 = lVar.f40460c;
                        if (j14 == -9223372036854775807L) {
                            j14 = 3 * mVar.f40467m;
                        }
                    }
                }
                j15 = j14 + j13;
            }
            long j23 = j17 + j13;
            long i11 = e2.d0.i(j15, j13, j23);
            e0 e0Var = i().f3076c;
            if (e0Var.d == -3.4028235E38f && e0Var.e == -3.4028235E38f && lVar.f40460c == -9223372036854775807L && lVar.d == -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            b2.d0 d0Var = new b2.d0();
            d0Var.f2954a = e2.d0.e0(i11);
            float f10 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = this.f15413q.d;
            }
            d0Var.d = f7;
            if (!z10) {
                f10 = this.f15413q.e;
            }
            d0Var.e = f10;
            e0 e0Var2 = new e0(d0Var);
            this.f15413q = e0Var2;
            if (j18 == -9223372036854775807L) {
                j18 = j23 - e2.d0.Q(e0Var2.f2975a);
            }
            if (z13) {
                j20 = j18;
            } else {
                p2.h u10 = u(j18, mVar.f40473s);
                if (u10 != null) {
                    j16 = u10.e;
                } else if (!i0Var.isEmpty()) {
                    p2.j jVar = (p2.j) i0Var.get(e2.d0.c(i0Var, Long.valueOf(j18), true));
                    p2.h u11 = u(j18, jVar.f40450x);
                    if (u11 != null) {
                        j16 = u11.e;
                    } else {
                        j16 = jVar.e;
                    }
                }
                j20 = j16;
            }
            if (i10 == 2 && mVar.f40461f) {
                z11 = true;
            } else {
                z11 = false;
            }
            h1Var = new h1(j10, j3, j12, mVar.f40475u, j21, j20, true, !z14, z11, dVar2, i(), this.f15413q);
        } else {
            if (j18 != -9223372036854775807L && !i0Var.isEmpty()) {
                if (!z13 && j18 != j17) {
                    j18 = ((p2.j) i0Var.get(e2.d0.c(i0Var, Long.valueOf(j18), true))).e;
                }
                j11 = j18;
            } else {
                j11 = 0;
            }
            long j24 = mVar.f40475u;
            h1Var = new h1(j10, j3, j24, j24, 0L, j11, true, false, true, dVar2, i(), null);
        }
        n(h1Var);
    }
}
