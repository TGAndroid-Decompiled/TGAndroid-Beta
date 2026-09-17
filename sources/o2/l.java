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
    public final u f15417i;
    public final ob.a f15418j;
    public final n2.m f15419k;
    public final qb.b f15420l;
    public final boolean f15421m;
    public final int f15422n;
    public final p2.d f15423o;
    public final long f15424p;
    public e0 f15425q;
    public c0 f15426r;
    public k0 f15427s;

    static {
        l0.a("media3.exoplayer.hls");
    }

    public l(k0 k0Var, u uVar, c cVar, ob.a aVar, n2.m mVar, qb.b bVar, p2.d dVar, long j3, boolean z10, int i10) {
        this.f15427s = k0Var;
        this.f15425q = k0Var.f3079c;
        this.f15417i = uVar;
        this.h = cVar;
        this.f15418j = aVar;
        this.f15419k = mVar;
        this.f15420l = bVar;
        this.f15423o = dVar;
        this.f15424p = j3;
        this.f15421m = z10;
        this.f15422n = i10;
    }

    public static p2.h u(long j3, List list) {
        p2.h hVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            p2.h hVar2 = (p2.h) list.get(i10);
            long j10 = hVar2.e;
            if (j10 <= j3 && hVar2.f40470w) {
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
        f0 f0Var = i10.f3078b;
        f0Var.getClass();
        f0 f0Var2 = k0Var.f3078b;
        if (f0Var2 != null && f0Var2.f2993a.equals(f0Var.f2993a) && f0Var2.e.equals(f0Var.e) && Objects.equals(f0Var2.f2995c, f0Var.f2995c) && i10.f3079c.equals(k0Var.f3079c)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(u2.f0 f0Var, y2.d dVar, long j3) {
        a5.a b10 = b(f0Var);
        n2.j jVar = new n2.j(this.d.f14917c, 0, f0Var);
        c0 c0Var = this.f15426r;
        j2.k kVar = this.f43326g;
        e2.d.h(kVar);
        return new k(this.h, this.f15423o, this.f15417i, c0Var, this.f15419k, jVar, this.f15420l, b10, dVar, this.f15418j, this.f15421m, this.f15422n, kVar);
    }

    @Override
    public final synchronized k0 i() {
        return this.f15427s;
    }

    @Override
    public final void k() {
        p2.d dVar = this.f15423o;
        y2.m mVar = dVar.h;
        if (mVar != null) {
            mVar.a();
        }
        Uri uri = dVar.v;
        if (uri != null) {
            p2.c cVar = (p2.c) dVar.d.get(uri);
            cVar.f40422b.a();
            IOException iOException = cVar.f40427s;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final void m(c0 c0Var) {
        boolean z10;
        this.f15426r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f43326g;
        e2.d.h(kVar);
        n2.m mVar = this.f15419k;
        mVar.C(myLooper, kVar);
        mVar.b();
        a5.a b10 = b(null);
        f0 f0Var = i().f3078b;
        f0Var.getClass();
        Uri uri = f0Var.f2993a;
        p2.d dVar = this.f15423o;
        dVar.getClass();
        dVar.f40433n = e2.d0.o(null);
        dVar.f40432f = b10;
        dVar.f40434r = this;
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.p pVar = new y2.p(((g2.g) dVar.f40429a.f13385b).createDataSource(), new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, dVar.f40430b.D());
        if (dVar.h == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        y2.m mVar2 = new y2.m("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        dVar.h = mVar2;
        mVar2.f(pVar, dVar, dVar.f40431c.L3(pVar.f46323c));
    }

    @Override
    public final void o(d0 d0Var) {
        q[] qVarArr;
        p[] pVarArr;
        k kVar = (k) d0Var;
        kVar.f15408b.e.remove(kVar);
        for (q qVar : kVar.J) {
            if (qVar.T) {
                for (p pVar : qVar.L) {
                    pVar.k();
                    n2.g gVar = pVar.h;
                    if (gVar != null) {
                        gVar.a(pVar.e);
                        pVar.h = null;
                        pVar.f43339g = null;
                    }
                }
            }
            i iVar = qVar.d;
            p2.c cVar = (p2.c) iVar.f15389g.d.get(iVar.e[iVar.f15399r.l()]);
            if (cVar != null) {
                cVar.v = false;
            }
            iVar.f15395n = null;
            qVar.f15458s.e(qVar);
            qVar.H.removeCallbacksAndMessages(null);
            qVar.X = true;
            qVar.I.clear();
        }
        kVar.G = null;
    }

    @Override
    public final void q() {
        p2.d dVar = this.f15423o;
        dVar.v = null;
        dVar.f40436w = null;
        dVar.f40435s = null;
        dVar.f40438y = -9223372036854775807L;
        dVar.h.e(null);
        dVar.h = null;
        HashMap hashMap = dVar.d;
        for (p2.c cVar : hashMap.values()) {
            cVar.f40422b.e(null);
        }
        dVar.f40433n.removeCallbacksAndMessages(null);
        dVar.f40433n = null;
        hashMap.clear();
        this.f15419k.release();
    }

    @Override
    public final synchronized void t(k0 k0Var) {
        this.f15427s = k0Var;
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
        boolean z12 = mVar.f40496p;
        boolean z13 = mVar.f40488g;
        i0 i0Var = mVar.f40498r;
        long j17 = mVar.f40501u;
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
        p2.d dVar = this.f15423o;
        dVar.f40435s.getClass();
        na.d dVar2 = new na.d(16);
        long j20 = 0;
        if (dVar.f40437x) {
            p2.l lVar = mVar.v;
            long j21 = j19 - dVar.f40438y;
            boolean z14 = mVar.f40495o;
            if (z14) {
                j12 = j21 + j17;
            } else {
                j12 = -9223372036854775807L;
            }
            if (mVar.f40496p) {
                j13 = e2.d0.Q(e2.d0.A(this.f15424p)) - (j19 + j17);
            } else {
                j13 = 0;
            }
            long j22 = this.f15425q.f2978a;
            if (j22 != -9223372036854775807L) {
                j15 = e2.d0.Q(j22);
            } else {
                if (j18 != -9223372036854775807L) {
                    j14 = j17 - j18;
                } else {
                    j14 = lVar.d;
                    if (j14 == -9223372036854775807L || mVar.f40494n == -9223372036854775807L) {
                        j14 = lVar.f40486c;
                        if (j14 == -9223372036854775807L) {
                            j14 = 3 * mVar.f40493m;
                        }
                    }
                }
                j15 = j14 + j13;
            }
            long j23 = j17 + j13;
            long i11 = e2.d0.i(j15, j13, j23);
            e0 e0Var = i().f3079c;
            if (e0Var.d == -3.4028235E38f && e0Var.e == -3.4028235E38f && lVar.f40486c == -9223372036854775807L && lVar.d == -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            b2.d0 d0Var = new b2.d0();
            d0Var.f2957a = e2.d0.e0(i11);
            float f10 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = this.f15425q.d;
            }
            d0Var.d = f7;
            if (!z10) {
                f10 = this.f15425q.e;
            }
            d0Var.e = f10;
            e0 e0Var2 = new e0(d0Var);
            this.f15425q = e0Var2;
            if (j18 == -9223372036854775807L) {
                j18 = j23 - e2.d0.Q(e0Var2.f2978a);
            }
            if (z13) {
                j20 = j18;
            } else {
                p2.h u10 = u(j18, mVar.f40499s);
                if (u10 != null) {
                    j16 = u10.e;
                } else if (!i0Var.isEmpty()) {
                    p2.j jVar = (p2.j) i0Var.get(e2.d0.c(i0Var, Long.valueOf(j18), true));
                    p2.h u11 = u(j18, jVar.f40476x);
                    if (u11 != null) {
                        j16 = u11.e;
                    } else {
                        j16 = jVar.e;
                    }
                }
                j20 = j16;
            }
            if (i10 == 2 && mVar.f40487f) {
                z11 = true;
            } else {
                z11 = false;
            }
            h1Var = new h1(j10, j3, j12, mVar.f40501u, j21, j20, true, !z14, z11, dVar2, i(), this.f15425q);
        } else {
            if (j18 != -9223372036854775807L && !i0Var.isEmpty()) {
                if (!z13 && j18 != j17) {
                    j18 = ((p2.j) i0Var.get(e2.d0.c(i0Var, Long.valueOf(j18), true))).e;
                }
                j11 = j18;
            } else {
                j11 = 0;
            }
            long j24 = mVar.f40501u;
            h1Var = new h1(j10, j3, j24, j24, 0L, j11, true, false, true, dVar2, i(), null);
        }
        n(h1Var);
    }
}
