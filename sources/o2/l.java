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
import u2.d0;
import u2.h1;
public final class l extends u2.a {
    public final c h;
    public final l.d f15589i;
    public final ob.a f15590j;
    public final n2.n f15591k;
    public final qb.b f15592l;
    public final boolean f15593m;
    public final int f15594n;
    public final p2.c f15595o;
    public final long f15596p;
    public e0 f15597q;
    public c0 f15598r;
    public k0 f15599s;

    static {
        l0.a("media3.exoplayer.hls");
    }

    public l(k0 k0Var, l.d dVar, c cVar, ob.a aVar, n2.n nVar, qb.b bVar, p2.c cVar2, long j3, boolean z10, int i10) {
        this.f15599s = k0Var;
        this.f15597q = k0Var.f3071c;
        this.f15589i = dVar;
        this.h = cVar;
        this.f15590j = aVar;
        this.f15591k = nVar;
        this.f15592l = bVar;
        this.f15595o = cVar2;
        this.f15596p = j3;
        this.f15593m = z10;
        this.f15594n = i10;
    }

    public static p2.g u(long j3, List list) {
        p2.g gVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            p2.g gVar2 = (p2.g) list.get(i10);
            long j10 = gVar2.e;
            if (j10 <= j3 && gVar2.f40715w) {
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
        f0 f0Var = i10.f3070b;
        f0Var.getClass();
        f0 f0Var2 = k0Var.f3070b;
        if (f0Var2 != null && f0Var2.f2985a.equals(f0Var.f2985a) && f0Var2.e.equals(f0Var.e) && Objects.equals(f0Var2.f2987c, f0Var.f2987c) && i10.f3071c.equals(k0Var.f3071c)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(u2.f0 f0Var, y2.d dVar, long j3) {
        a5.a b10 = b(f0Var);
        n2.k kVar = new n2.k(this.d.f15135c, 0, f0Var);
        c0 c0Var = this.f15598r;
        j2.k kVar2 = this.f43587g;
        e2.d.h(kVar2);
        return new k(this.h, this.f15595o, this.f15589i, c0Var, this.f15591k, kVar, this.f15592l, b10, dVar, this.f15590j, this.f15593m, this.f15594n, kVar2);
    }

    @Override
    public final synchronized k0 i() {
        return this.f15599s;
    }

    @Override
    public final void k() {
        p2.c cVar = this.f15595o;
        y2.l lVar = cVar.h;
        if (lVar != null) {
            lVar.a();
        }
        Uri uri = cVar.v;
        if (uri != null) {
            p2.b bVar = (p2.b) cVar.d.get(uri);
            bVar.f40667b.a();
            IOException iOException = bVar.f40672s;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final void m(c0 c0Var) {
        boolean z10;
        this.f15598r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f43587g;
        e2.d.h(kVar);
        n2.n nVar = this.f15591k;
        nVar.C(myLooper, kVar);
        nVar.b();
        a5.a b10 = b(null);
        f0 f0Var = i().f3070b;
        f0Var.getClass();
        Uri uri = f0Var.f2985a;
        p2.c cVar = this.f15595o;
        cVar.getClass();
        cVar.f40678n = e2.d0.o(null);
        cVar.f40677f = b10;
        cVar.f40679r = this;
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.o oVar = new y2.o(((g2.g) cVar.f40674a.f13924a).createDataSource(), new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, cVar.f40675b.H());
        if (cVar.h == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        y2.l lVar = new y2.l("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.h = lVar;
        lVar.f(oVar, cVar, cVar.f40676c.L3(oVar.f46579c));
    }

    @Override
    public final void o(d0 d0Var) {
        q[] qVarArr;
        p[] pVarArr;
        k kVar = (k) d0Var;
        kVar.f15580b.e.remove(kVar);
        for (q qVar : kVar.J) {
            if (qVar.T) {
                for (p pVar : qVar.L) {
                    pVar.k();
                    n2.h hVar = pVar.h;
                    if (hVar != null) {
                        hVar.a(pVar.e);
                        pVar.h = null;
                        pVar.f43600g = null;
                    }
                }
            }
            i iVar = qVar.d;
            p2.b bVar = (p2.b) iVar.f15561g.d.get(iVar.e[iVar.f15571r.l()]);
            if (bVar != null) {
                bVar.v = false;
            }
            iVar.f15567n = null;
            qVar.f15630s.e(qVar);
            qVar.H.removeCallbacksAndMessages(null);
            qVar.X = true;
            qVar.I.clear();
        }
        kVar.G = null;
    }

    @Override
    public final void q() {
        p2.c cVar = this.f15595o;
        cVar.v = null;
        cVar.f40681w = null;
        cVar.f40680s = null;
        cVar.f40683y = -9223372036854775807L;
        cVar.h.e(null);
        cVar.h = null;
        HashMap hashMap = cVar.d;
        for (p2.b bVar : hashMap.values()) {
            bVar.f40667b.e(null);
        }
        cVar.f40678n.removeCallbacksAndMessages(null);
        cVar.f40678n = null;
        hashMap.clear();
        this.f15591k.release();
    }

    @Override
    public final synchronized void t(k0 k0Var) {
        this.f15599s = k0Var;
    }

    public final void v(p2.l lVar) {
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
        boolean z12 = lVar.f40741p;
        boolean z13 = lVar.f40733g;
        i0 i0Var = lVar.f40743r;
        long j17 = lVar.f40746u;
        long j18 = lVar.e;
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
        p2.c cVar = this.f15595o;
        cVar.f40680s.getClass();
        na.d dVar = new na.d(16);
        long j20 = 0;
        if (cVar.f40682x) {
            p2.k kVar = lVar.v;
            long j21 = j19 - cVar.f40683y;
            boolean z14 = lVar.f40740o;
            if (z14) {
                j12 = j21 + j17;
            } else {
                j12 = -9223372036854775807L;
            }
            if (lVar.f40741p) {
                j13 = e2.d0.Q(e2.d0.A(this.f15596p)) - (j19 + j17);
            } else {
                j13 = 0;
            }
            long j22 = this.f15597q.f2970a;
            if (j22 != -9223372036854775807L) {
                j15 = e2.d0.Q(j22);
            } else {
                if (j18 != -9223372036854775807L) {
                    j14 = j17 - j18;
                } else {
                    j14 = kVar.d;
                    if (j14 == -9223372036854775807L || lVar.f40739n == -9223372036854775807L) {
                        j14 = kVar.f40731c;
                        if (j14 == -9223372036854775807L) {
                            j14 = 3 * lVar.f40738m;
                        }
                    }
                }
                j15 = j14 + j13;
            }
            long j23 = j17 + j13;
            long i11 = e2.d0.i(j15, j13, j23);
            e0 e0Var = i().f3071c;
            if (e0Var.d == -3.4028235E38f && e0Var.e == -3.4028235E38f && kVar.f40731c == -9223372036854775807L && kVar.d == -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            b2.d0 d0Var = new b2.d0();
            d0Var.f2949a = e2.d0.e0(i11);
            float f10 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = this.f15597q.d;
            }
            d0Var.d = f7;
            if (!z10) {
                f10 = this.f15597q.e;
            }
            d0Var.e = f10;
            e0 e0Var2 = new e0(d0Var);
            this.f15597q = e0Var2;
            if (j18 == -9223372036854775807L) {
                j18 = j23 - e2.d0.Q(e0Var2.f2970a);
            }
            if (z13) {
                j20 = j18;
            } else {
                p2.g u10 = u(j18, lVar.f40744s);
                if (u10 != null) {
                    j16 = u10.e;
                } else if (!i0Var.isEmpty()) {
                    p2.i iVar = (p2.i) i0Var.get(e2.d0.c(i0Var, Long.valueOf(j18), true));
                    p2.g u11 = u(j18, iVar.f40721x);
                    if (u11 != null) {
                        j16 = u11.e;
                    } else {
                        j16 = iVar.e;
                    }
                }
                j20 = j16;
            }
            if (i10 == 2 && lVar.f40732f) {
                z11 = true;
            } else {
                z11 = false;
            }
            h1Var = new h1(j10, j3, j12, lVar.f40746u, j21, j20, true, !z14, z11, dVar, i(), this.f15597q);
        } else {
            if (j18 != -9223372036854775807L && !i0Var.isEmpty()) {
                if (!z13 && j18 != j17) {
                    j18 = ((p2.i) i0Var.get(e2.d0.c(i0Var, Long.valueOf(j18), true))).e;
                }
                j11 = j18;
            } else {
                j11 = 0;
            }
            long j24 = lVar.f40746u;
            h1Var = new h1(j10, j3, j24, j24, 0L, j11, true, false, true, dVar, i(), null);
        }
        n(h1Var);
    }
}
