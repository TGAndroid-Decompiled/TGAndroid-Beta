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
    public final n4 f17045i;
    public final ob.a f17046j;
    public final n2.n f17047k;
    public final qb.b f17048l;
    public final boolean f17049m;
    public final int f17050n;
    public final p2.c f17051o;
    public final long f17052p;
    public e0 f17053q;
    public c0 f17054r;
    public k0 f17055s;

    static {
        l0.a("media3.exoplayer.hls");
    }

    public l(k0 k0Var, n4 n4Var, c cVar, ob.a aVar, n2.n nVar, qb.b bVar, p2.c cVar2, long j3, boolean z10, int i10) {
        this.f17055s = k0Var;
        this.f17053q = k0Var.f3322c;
        this.f17045i = n4Var;
        this.h = cVar;
        this.f17046j = aVar;
        this.f17047k = nVar;
        this.f17048l = bVar;
        this.f17051o = cVar2;
        this.f17052p = j3;
        this.f17049m = z10;
        this.f17050n = i10;
    }

    public static p2.g u(long j3, List list) {
        p2.g gVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            p2.g gVar2 = (p2.g) list.get(i10);
            long j10 = gVar2.f44046e;
            if (j10 <= j3 && gVar2.f44036w) {
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
        n2.k kVar = new n2.k(this.d.f16546c, 0, f0Var);
        c0 c0Var = this.f17054r;
        j2.k kVar2 = this.f47200g;
        e2.d.h(kVar2);
        return new k(this.h, this.f17051o, this.f17045i, c0Var, this.f17047k, kVar, this.f17048l, b10, dVar, this.f17046j, this.f17049m, this.f17050n, kVar2);
    }

    @Override
    public final synchronized k0 i() {
        return this.f17055s;
    }

    @Override
    public final void k() {
        p2.c cVar = this.f17051o;
        y2.l lVar = cVar.h;
        if (lVar != null) {
            lVar.a();
        }
        Uri uri = cVar.v;
        if (uri != null) {
            p2.b bVar = (p2.b) cVar.d.get(uri);
            bVar.f43984b.a();
            IOException iOException = bVar.f43990s;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final void m(c0 c0Var) {
        boolean z10;
        this.f17054r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f47200g;
        e2.d.h(kVar);
        n2.n nVar = this.f17047k;
        nVar.C(myLooper, kVar);
        nVar.b();
        a5.a b10 = b(null);
        f0 f0Var = i().f3321b;
        f0Var.getClass();
        Uri uri = f0Var.f3226a;
        p2.c cVar = this.f17051o;
        cVar.getClass();
        cVar.f43997n = e2.d0.o(null);
        cVar.f43996f = b10;
        cVar.f43998r = this;
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.o oVar = new y2.o(((g2.g) cVar.f43992a.f12543b).createDataSource(), new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, cVar.f43993b.K());
        if (cVar.h == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        y2.l lVar = new y2.l("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.h = lVar;
        lVar.f(oVar, cVar, cVar.f43994c.L3(oVar.f50405c));
    }

    @Override
    public final void o(d0 d0Var) {
        q[] qVarArr;
        p[] pVarArr;
        k kVar = (k) d0Var;
        kVar.f17035b.f43995e.remove(kVar);
        for (q qVar : kVar.J) {
            if (qVar.T) {
                for (p pVar : qVar.L) {
                    pVar.k();
                    n2.h hVar = pVar.h;
                    if (hVar != null) {
                        hVar.a(pVar.f47218e);
                        pVar.h = null;
                        pVar.f47220g = null;
                    }
                }
            }
            i iVar = qVar.d;
            p2.b bVar = (p2.b) iVar.f17016g.d.get(iVar.f17014e[iVar.f17026r.l()]);
            if (bVar != null) {
                bVar.v = false;
            }
            iVar.f17022n = null;
            qVar.f17088s.e(qVar);
            qVar.H.removeCallbacksAndMessages(null);
            qVar.X = true;
            qVar.I.clear();
        }
        kVar.G = null;
    }

    @Override
    public final void q() {
        p2.c cVar = this.f17051o;
        cVar.v = null;
        cVar.f44000w = null;
        cVar.f43999s = null;
        cVar.f44002y = -9223372036854775807L;
        cVar.h.e(null);
        cVar.h = null;
        HashMap hashMap = cVar.d;
        for (p2.b bVar : hashMap.values()) {
            bVar.f43984b.e(null);
        }
        cVar.f43997n.removeCallbacksAndMessages(null);
        cVar.f43997n = null;
        hashMap.clear();
        this.f17047k.release();
    }

    @Override
    public final synchronized void t(k0 k0Var) {
        this.f17055s = k0Var;
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
        boolean z12 = lVar.f44065p;
        boolean z13 = lVar.f44057g;
        i0 i0Var = lVar.f44067r;
        long j17 = lVar.f44070u;
        long j18 = lVar.f44055e;
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
        p2.c cVar = this.f17051o;
        cVar.f43999s.getClass();
        na.d dVar = new na.d(16);
        long j20 = 0;
        if (cVar.f44001x) {
            p2.k kVar = lVar.v;
            long j21 = j19 - cVar.f44002y;
            boolean z14 = lVar.f44064o;
            if (z14) {
                j12 = j21 + j17;
            } else {
                j12 = -9223372036854775807L;
            }
            if (lVar.f44065p) {
                j13 = e2.d0.Q(e2.d0.A(this.f17052p)) - (j19 + j17);
            } else {
                j13 = 0;
            }
            long j22 = this.f17053q.f3209a;
            if (j22 != -9223372036854775807L) {
                j15 = e2.d0.Q(j22);
            } else {
                if (j18 != -9223372036854775807L) {
                    j14 = j17 - j18;
                } else {
                    j14 = kVar.d;
                    if (j14 == -9223372036854775807L || lVar.f44063n == -9223372036854775807L) {
                        j14 = kVar.f44053c;
                        if (j14 == -9223372036854775807L) {
                            j14 = 3 * lVar.f44062m;
                        }
                    }
                }
                j15 = j14 + j13;
            }
            long j23 = j17 + j13;
            long i11 = e2.d0.i(j15, j13, j23);
            e0 e0Var = i().f3322c;
            if (e0Var.d == -3.4028235E38f && e0Var.f3212e == -3.4028235E38f && kVar.f44053c == -9223372036854775807L && kVar.d == -9223372036854775807L) {
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
                f7 = this.f17053q.d;
            }
            d0Var.d = f7;
            if (!z10) {
                f10 = this.f17053q.f3212e;
            }
            d0Var.f3188e = f10;
            e0 e0Var2 = new e0(d0Var);
            this.f17053q = e0Var2;
            if (j18 == -9223372036854775807L) {
                j18 = j23 - e2.d0.Q(e0Var2.f3209a);
            }
            if (z13) {
                j20 = j18;
            } else {
                p2.g u10 = u(j18, lVar.f44068s);
                if (u10 != null) {
                    j16 = u10.f44046e;
                } else if (!i0Var.isEmpty()) {
                    p2.i iVar = (p2.i) i0Var.get(e2.d0.c(i0Var, Long.valueOf(j18), true));
                    p2.g u11 = u(j18, iVar.f44042x);
                    if (u11 != null) {
                        j16 = u11.f44046e;
                    } else {
                        j16 = iVar.f44046e;
                    }
                }
                j20 = j16;
            }
            if (i10 == 2 && lVar.f44056f) {
                z11 = true;
            } else {
                z11 = false;
            }
            i1Var = new i1(j10, j3, j12, lVar.f44070u, j21, j20, true, !z14, z11, dVar, i(), this.f17053q);
        } else {
            if (j18 != -9223372036854775807L && !i0Var.isEmpty()) {
                if (!z13 && j18 != j17) {
                    j18 = ((p2.i) i0Var.get(e2.d0.c(i0Var, Long.valueOf(j18), true))).f44046e;
                }
                j11 = j18;
            } else {
                j11 = 0;
            }
            long j24 = lVar.f44070u;
            i1Var = new i1(j10, j3, j24, j24, 0L, j11, true, false, true, dVar, i(), null);
        }
        n(i1Var);
    }
}
