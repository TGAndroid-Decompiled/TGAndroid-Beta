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
    public final n4 f17049i;
    public final ob.a f17050j;
    public final n2.n f17051k;
    public final qb.b f17052l;
    public final boolean f17053m;
    public final int f17054n;
    public final p2.c f17055o;
    public final long f17056p;
    public e0 f17057q;
    public c0 f17058r;
    public k0 f17059s;

    static {
        l0.a("media3.exoplayer.hls");
    }

    public l(k0 k0Var, n4 n4Var, c cVar, ob.a aVar, n2.n nVar, qb.b bVar, p2.c cVar2, long j3, boolean z10, int i10) {
        this.f17059s = k0Var;
        this.f17057q = k0Var.f3322c;
        this.f17049i = n4Var;
        this.h = cVar;
        this.f17050j = aVar;
        this.f17051k = nVar;
        this.f17052l = bVar;
        this.f17055o = cVar2;
        this.f17056p = j3;
        this.f17053m = z10;
        this.f17054n = i10;
    }

    public static p2.g u(long j3, List list) {
        p2.g gVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            p2.g gVar2 = (p2.g) list.get(i10);
            long j10 = gVar2.f44053e;
            if (j10 <= j3 && gVar2.f44043w) {
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
        n2.k kVar = new n2.k(this.d.f16550c, 0, f0Var);
        c0 c0Var = this.f17058r;
        j2.k kVar2 = this.f47208g;
        e2.d.h(kVar2);
        return new k(this.h, this.f17055o, this.f17049i, c0Var, this.f17051k, kVar, this.f17052l, b10, dVar, this.f17050j, this.f17053m, this.f17054n, kVar2);
    }

    @Override
    public final synchronized k0 i() {
        return this.f17059s;
    }

    @Override
    public final void k() {
        p2.c cVar = this.f17055o;
        y2.l lVar = cVar.h;
        if (lVar != null) {
            lVar.a();
        }
        Uri uri = cVar.v;
        if (uri != null) {
            p2.b bVar = (p2.b) cVar.d.get(uri);
            bVar.f43991b.a();
            IOException iOException = bVar.f43997s;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final void m(c0 c0Var) {
        boolean z10;
        this.f17058r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f47208g;
        e2.d.h(kVar);
        n2.n nVar = this.f17051k;
        nVar.C(myLooper, kVar);
        nVar.b();
        a5.a b10 = b(null);
        f0 f0Var = i().f3321b;
        f0Var.getClass();
        Uri uri = f0Var.f3226a;
        p2.c cVar = this.f17055o;
        cVar.getClass();
        cVar.f44004n = e2.d0.o(null);
        cVar.f44003f = b10;
        cVar.f44005r = this;
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.o oVar = new y2.o(((g2.g) cVar.f43999a.f12544b).createDataSource(), new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, cVar.f44000b.K());
        if (cVar.h == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        y2.l lVar = new y2.l("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.h = lVar;
        lVar.f(oVar, cVar, cVar.f44001c.L3(oVar.f50413c));
    }

    @Override
    public final void o(d0 d0Var) {
        q[] qVarArr;
        p[] pVarArr;
        k kVar = (k) d0Var;
        kVar.f17039b.f44002e.remove(kVar);
        for (q qVar : kVar.J) {
            if (qVar.T) {
                for (p pVar : qVar.L) {
                    pVar.k();
                    n2.h hVar = pVar.h;
                    if (hVar != null) {
                        hVar.a(pVar.f47226e);
                        pVar.h = null;
                        pVar.f47228g = null;
                    }
                }
            }
            i iVar = qVar.d;
            p2.b bVar = (p2.b) iVar.f17020g.d.get(iVar.f17018e[iVar.f17030r.l()]);
            if (bVar != null) {
                bVar.v = false;
            }
            iVar.f17026n = null;
            qVar.f17092s.e(qVar);
            qVar.H.removeCallbacksAndMessages(null);
            qVar.X = true;
            qVar.I.clear();
        }
        kVar.G = null;
    }

    @Override
    public final void q() {
        p2.c cVar = this.f17055o;
        cVar.v = null;
        cVar.f44007w = null;
        cVar.f44006s = null;
        cVar.f44009y = -9223372036854775807L;
        cVar.h.e(null);
        cVar.h = null;
        HashMap hashMap = cVar.d;
        for (p2.b bVar : hashMap.values()) {
            bVar.f43991b.e(null);
        }
        cVar.f44004n.removeCallbacksAndMessages(null);
        cVar.f44004n = null;
        hashMap.clear();
        this.f17051k.release();
    }

    @Override
    public final synchronized void t(k0 k0Var) {
        this.f17059s = k0Var;
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
        boolean z12 = lVar.f44072p;
        boolean z13 = lVar.f44064g;
        i0 i0Var = lVar.f44074r;
        long j17 = lVar.f44077u;
        long j18 = lVar.f44062e;
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
        p2.c cVar = this.f17055o;
        cVar.f44006s.getClass();
        na.d dVar = new na.d(16);
        long j20 = 0;
        if (cVar.f44008x) {
            p2.k kVar = lVar.v;
            long j21 = j19 - cVar.f44009y;
            boolean z14 = lVar.f44071o;
            if (z14) {
                j12 = j21 + j17;
            } else {
                j12 = -9223372036854775807L;
            }
            if (lVar.f44072p) {
                j13 = e2.d0.Q(e2.d0.A(this.f17056p)) - (j19 + j17);
            } else {
                j13 = 0;
            }
            long j22 = this.f17057q.f3209a;
            if (j22 != -9223372036854775807L) {
                j15 = e2.d0.Q(j22);
            } else {
                if (j18 != -9223372036854775807L) {
                    j14 = j17 - j18;
                } else {
                    j14 = kVar.d;
                    if (j14 == -9223372036854775807L || lVar.f44070n == -9223372036854775807L) {
                        j14 = kVar.f44060c;
                        if (j14 == -9223372036854775807L) {
                            j14 = 3 * lVar.f44069m;
                        }
                    }
                }
                j15 = j14 + j13;
            }
            long j23 = j17 + j13;
            long i11 = e2.d0.i(j15, j13, j23);
            e0 e0Var = i().f3322c;
            if (e0Var.d == -3.4028235E38f && e0Var.f3212e == -3.4028235E38f && kVar.f44060c == -9223372036854775807L && kVar.d == -9223372036854775807L) {
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
                f7 = this.f17057q.d;
            }
            d0Var.d = f7;
            if (!z10) {
                f10 = this.f17057q.f3212e;
            }
            d0Var.f3188e = f10;
            e0 e0Var2 = new e0(d0Var);
            this.f17057q = e0Var2;
            if (j18 == -9223372036854775807L) {
                j18 = j23 - e2.d0.Q(e0Var2.f3209a);
            }
            if (z13) {
                j20 = j18;
            } else {
                p2.g u10 = u(j18, lVar.f44075s);
                if (u10 != null) {
                    j16 = u10.f44053e;
                } else if (!i0Var.isEmpty()) {
                    p2.i iVar = (p2.i) i0Var.get(e2.d0.c(i0Var, Long.valueOf(j18), true));
                    p2.g u11 = u(j18, iVar.f44049x);
                    if (u11 != null) {
                        j16 = u11.f44053e;
                    } else {
                        j16 = iVar.f44053e;
                    }
                }
                j20 = j16;
            }
            if (i10 == 2 && lVar.f44063f) {
                z11 = true;
            } else {
                z11 = false;
            }
            i1Var = new i1(j10, j3, j12, lVar.f44077u, j21, j20, true, !z14, z11, dVar, i(), this.f17057q);
        } else {
            if (j18 != -9223372036854775807L && !i0Var.isEmpty()) {
                if (!z13 && j18 != j17) {
                    j18 = ((p2.i) i0Var.get(e2.d0.c(i0Var, Long.valueOf(j18), true))).f44053e;
                }
                j11 = j18;
            } else {
                j11 = 0;
            }
            long j24 = lVar.f44077u;
            i1Var = new i1(j10, j3, j24, j24, 0L, j11, true, false, true, dVar, i(), null);
        }
        n(i1Var);
    }
}
