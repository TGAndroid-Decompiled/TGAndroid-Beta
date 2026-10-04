package o2;

import android.net.Uri;
import android.os.Looper;
import b2.e0;
import b2.f0;
import b2.k0;
import b2.l0;
import e9.i0;
import g2.c0;
import ii.n4;
import j$.util.Objects;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import u2.d0;
import u2.i1;
public final class l extends u2.a {
    public final c h;
    public final n4 f17044i;
    public final ob.a f17045j;
    public final n2.n f17046k;
    public final qb.b f17047l;
    public final boolean f17048m;
    public final int f17049n;
    public final p2.c f17050o;
    public final long f17051p;
    public e0 f17052q;
    public c0 f17053r;
    public k0 f17054s;

    static {
        l0.a("media3.exoplayer.hls");
    }

    public l(k0 k0Var, n4 n4Var, c cVar, ob.a aVar, n2.n nVar, qb.b bVar, p2.c cVar2, long j3, boolean z10, int i10) {
        this.f17054s = k0Var;
        this.f17052q = k0Var.f3322c;
        this.f17044i = n4Var;
        this.h = cVar;
        this.f17045j = aVar;
        this.f17046k = nVar;
        this.f17047l = bVar;
        this.f17050o = cVar2;
        this.f17051p = j3;
        this.f17048m = z10;
        this.f17049n = i10;
    }

    public static p2.g u(long j3, List list) {
        p2.g gVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            p2.g gVar2 = (p2.g) list.get(i10);
            long j10 = gVar2.f44045e;
            if (j10 <= j3 && gVar2.f44035w) {
                gVar = gVar2;
            } else if (j10 > j3) {
                break;
            }
        }
        return gVar;
    }

    @Override
    public final boolean a(k0 k0Var) {
        k0 i10 = i();
        f0 f0Var = i10.f3321b;
        f0Var.getClass();
        f0 f0Var2 = k0Var.f3321b;
        if (f0Var2 != null && f0Var2.f3226a.equals(f0Var.f3226a) && f0Var2.f3229e.equals(f0Var.f3229e) && Objects.equals(f0Var2.f3228c, f0Var.f3228c) && i10.f3322c.equals(k0Var.f3322c)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(u2.f0 f0Var, y2.d dVar, long j3) {
        a5.a b10 = b(f0Var);
        n2.k kVar = new n2.k(this.d.f16545c, 0, f0Var);
        c0 c0Var = this.f17053r;
        j2.k kVar2 = this.f47199g;
        e2.d.h(kVar2);
        return new k(this.h, this.f17050o, this.f17044i, c0Var, this.f17046k, kVar, this.f17047l, b10, dVar, this.f17045j, this.f17048m, this.f17049n, kVar2);
    }

    @Override
    public final synchronized k0 i() {
        return this.f17054s;
    }

    @Override
    public final void k() {
        p2.c cVar = this.f17050o;
        y2.l lVar = cVar.h;
        if (lVar != null) {
            lVar.a();
        }
        Uri uri = cVar.v;
        if (uri != null) {
            p2.b bVar = (p2.b) cVar.d.get(uri);
            bVar.f43983b.a();
            IOException iOException = bVar.f43989s;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final void m(c0 c0Var) {
        boolean z10;
        this.f17053r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f47199g;
        e2.d.h(kVar);
        n2.n nVar = this.f17046k;
        nVar.C(myLooper, kVar);
        nVar.b();
        a5.a b10 = b(null);
        f0 f0Var = i().f3321b;
        f0Var.getClass();
        Uri uri = f0Var.f3226a;
        p2.c cVar = this.f17050o;
        cVar.getClass();
        cVar.f43996n = e2.d0.o(null);
        cVar.f43995f = b10;
        cVar.f43997r = this;
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.o oVar = new y2.o(((g2.g) cVar.f43991a.f12543b).createDataSource(), new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, cVar.f43992b.K());
        if (cVar.h == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        y2.l lVar = new y2.l("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.h = lVar;
        lVar.f(oVar, cVar, cVar.f43993c.L3(oVar.f50404c));
    }

    @Override
    public final void o(d0 d0Var) {
        q[] qVarArr;
        p[] pVarArr;
        k kVar = (k) d0Var;
        kVar.f17034b.f43994e.remove(kVar);
        for (q qVar : kVar.J) {
            if (qVar.T) {
                for (p pVar : qVar.L) {
                    pVar.k();
                    n2.h hVar = pVar.h;
                    if (hVar != null) {
                        hVar.a(pVar.f47217e);
                        pVar.h = null;
                        pVar.f47219g = null;
                    }
                }
            }
            i iVar = qVar.d;
            p2.b bVar = (p2.b) iVar.f17015g.d.get(iVar.f17013e[iVar.f17025r.l()]);
            if (bVar != null) {
                bVar.v = false;
            }
            iVar.f17021n = null;
            qVar.f17087s.e(qVar);
            qVar.H.removeCallbacksAndMessages(null);
            qVar.X = true;
            qVar.I.clear();
        }
        kVar.G = null;
    }

    @Override
    public final void q() {
        p2.c cVar = this.f17050o;
        cVar.v = null;
        cVar.f43999w = null;
        cVar.f43998s = null;
        cVar.f44001y = -9223372036854775807L;
        cVar.h.e(null);
        cVar.h = null;
        HashMap hashMap = cVar.d;
        for (p2.b bVar : hashMap.values()) {
            bVar.f43983b.e(null);
        }
        cVar.f43996n.removeCallbacksAndMessages(null);
        cVar.f43996n = null;
        hashMap.clear();
        this.f17046k.release();
    }

    @Override
    public final synchronized void t(k0 k0Var) {
        this.f17054s = k0Var;
    }

    public final void v(p2.l lVar) {
        long j3;
        long j10;
        long j11;
        i1 i1Var;
        long j12;
        long j13;
        long j14;
        long j15;
        boolean z10;
        float f7;
        long j16;
        boolean z11;
        boolean z12 = lVar.f44064p;
        boolean z13 = lVar.f44056g;
        i0 i0Var = lVar.f44066r;
        long j17 = lVar.f44069u;
        long j18 = lVar.f44054e;
        int i10 = lVar.d;
        long j19 = lVar.h;
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
        p2.c cVar = this.f17050o;
        cVar.f43998s.getClass();
        na.d dVar = new na.d(16);
        long j20 = 0;
        if (cVar.f44000x) {
            p2.k kVar = lVar.v;
            long j21 = j19 - cVar.f44001y;
            boolean z14 = lVar.f44063o;
            if (z14) {
                j12 = j21 + j17;
            } else {
                j12 = -9223372036854775807L;
            }
            if (lVar.f44064p) {
                j13 = e2.d0.Q(e2.d0.A(this.f17051p)) - (j19 + j17);
            } else {
                j13 = 0;
            }
            long j22 = this.f17052q.f3209a;
            if (j22 != -9223372036854775807L) {
                j15 = e2.d0.Q(j22);
            } else {
                if (j18 != -9223372036854775807L) {
                    j14 = j17 - j18;
                } else {
                    j14 = kVar.d;
                    if (j14 == -9223372036854775807L || lVar.f44062n == -9223372036854775807L) {
                        j14 = kVar.f44052c;
                        if (j14 == -9223372036854775807L) {
                            j14 = 3 * lVar.f44061m;
                        }
                    }
                }
                j15 = j14 + j13;
            }
            long j23 = j17 + j13;
            long i11 = e2.d0.i(j15, j13, j23);
            e0 e0Var = i().f3322c;
            if (e0Var.d == -3.4028235E38f && e0Var.f3212e == -3.4028235E38f && kVar.f44052c == -9223372036854775807L && kVar.d == -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            b2.d0 d0Var = new b2.d0();
            d0Var.f3185a = e2.d0.e0(i11);
            float f10 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = this.f17052q.d;
            }
            d0Var.d = f7;
            if (!z10) {
                f10 = this.f17052q.f3212e;
            }
            d0Var.f3188e = f10;
            e0 e0Var2 = new e0(d0Var);
            this.f17052q = e0Var2;
            if (j18 == -9223372036854775807L) {
                j18 = j23 - e2.d0.Q(e0Var2.f3209a);
            }
            if (z13) {
                j20 = j18;
            } else {
                p2.g u10 = u(j18, lVar.f44067s);
                if (u10 != null) {
                    j16 = u10.f44045e;
                } else if (!i0Var.isEmpty()) {
                    p2.i iVar = (p2.i) i0Var.get(e2.d0.c(i0Var, Long.valueOf(j18), true));
                    p2.g u11 = u(j18, iVar.f44041x);
                    if (u11 != null) {
                        j16 = u11.f44045e;
                    } else {
                        j16 = iVar.f44045e;
                    }
                }
                j20 = j16;
            }
            if (i10 == 2 && lVar.f44055f) {
                z11 = true;
            } else {
                z11 = false;
            }
            i1Var = new i1(j10, j3, j12, lVar.f44069u, j21, j20, true, !z14, z11, dVar, i(), this.f17052q);
        } else {
            if (j18 != -9223372036854775807L && !i0Var.isEmpty()) {
                if (!z13 && j18 != j17) {
                    j18 = ((p2.i) i0Var.get(e2.d0.c(i0Var, Long.valueOf(j18), true))).f44045e;
                }
                j11 = j18;
            } else {
                j11 = 0;
            }
            long j24 = lVar.f44069u;
            i1Var = new i1(j10, j3, j24, j24, 0L, j11, true, false, true, dVar, i(), null);
        }
        n(i1Var);
    }
}
