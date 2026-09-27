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
    public final u f15628i;
    public final ob.a f15629j;
    public final n2.m f15630k;
    public final qb.b f15631l;
    public final boolean f15632m;
    public final int f15633n;
    public final p2.c f15634o;
    public final long f15635p;
    public e0 f15636q;
    public c0 f15637r;
    public k0 f15638s;

    static {
        l0.a("media3.exoplayer.hls");
    }

    public l(k0 k0Var, u uVar, c cVar, ob.a aVar, n2.m mVar, qb.b bVar, p2.c cVar2, long j3, boolean z10, int i10) {
        this.f15638s = k0Var;
        this.f15636q = k0Var.f3073c;
        this.f15628i = uVar;
        this.h = cVar;
        this.f15629j = aVar;
        this.f15630k = mVar;
        this.f15631l = bVar;
        this.f15634o = cVar2;
        this.f15635p = j3;
        this.f15632m = z10;
        this.f15633n = i10;
    }

    public static p2.g u(long j3, List list) {
        p2.g gVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            p2.g gVar2 = (p2.g) list.get(i10);
            long j10 = gVar2.e;
            if (j10 <= j3 && gVar2.f40713w) {
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
        f0 f0Var = i10.f3072b;
        f0Var.getClass();
        f0 f0Var2 = k0Var.f3072b;
        if (f0Var2 != null && f0Var2.f2987a.equals(f0Var.f2987a) && f0Var2.e.equals(f0Var.e) && Objects.equals(f0Var2.f2989c, f0Var.f2989c) && i10.f3073c.equals(k0Var.f3073c)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(u2.f0 f0Var, y2.d dVar, long j3) {
        a5.a b10 = b(f0Var);
        n2.j jVar = new n2.j(this.d.f15170c, 0, f0Var);
        c0 c0Var = this.f15637r;
        j2.k kVar = this.f43633g;
        e2.d.h(kVar);
        return new k(this.h, this.f15634o, this.f15628i, c0Var, this.f15630k, jVar, this.f15631l, b10, dVar, this.f15629j, this.f15632m, this.f15633n, kVar);
    }

    @Override
    public final synchronized k0 i() {
        return this.f15638s;
    }

    @Override
    public final void k() {
        p2.c cVar = this.f15634o;
        y2.l lVar = cVar.h;
        if (lVar != null) {
            lVar.a();
        }
        Uri uri = cVar.v;
        if (uri != null) {
            p2.b bVar = (p2.b) cVar.d.get(uri);
            bVar.f40665b.a();
            IOException iOException = bVar.f40670s;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final void m(c0 c0Var) {
        boolean z10;
        this.f15637r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f43633g;
        e2.d.h(kVar);
        n2.m mVar = this.f15630k;
        mVar.C(myLooper, kVar);
        mVar.b();
        a5.a b10 = b(null);
        f0 f0Var = i().f3072b;
        f0Var.getClass();
        Uri uri = f0Var.f2987a;
        p2.c cVar = this.f15634o;
        cVar.getClass();
        cVar.f40676n = e2.d0.o(null);
        cVar.f40675f = b10;
        cVar.f40677r = this;
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.o oVar = new y2.o(((g2.g) cVar.f40672a.f13371a).createDataSource(), new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, cVar.f40673b.H());
        if (cVar.h == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        y2.l lVar = new y2.l("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.h = lVar;
        lVar.f(oVar, cVar, cVar.f40674c.L3(oVar.f46624c));
    }

    @Override
    public final void o(d0 d0Var) {
        q[] qVarArr;
        p[] pVarArr;
        k kVar = (k) d0Var;
        kVar.f15619b.e.remove(kVar);
        for (q qVar : kVar.J) {
            if (qVar.T) {
                for (p pVar : qVar.L) {
                    pVar.k();
                    n2.g gVar = pVar.h;
                    if (gVar != null) {
                        gVar.a(pVar.e);
                        pVar.h = null;
                        pVar.f43646g = null;
                    }
                }
            }
            i iVar = qVar.d;
            p2.b bVar = (p2.b) iVar.f15600g.d.get(iVar.e[iVar.f15610r.l()]);
            if (bVar != null) {
                bVar.v = false;
            }
            iVar.f15606n = null;
            qVar.f15669s.e(qVar);
            qVar.H.removeCallbacksAndMessages(null);
            qVar.X = true;
            qVar.I.clear();
        }
        kVar.G = null;
    }

    @Override
    public final void q() {
        p2.c cVar = this.f15634o;
        cVar.v = null;
        cVar.f40679w = null;
        cVar.f40678s = null;
        cVar.f40681y = -9223372036854775807L;
        cVar.h.e(null);
        cVar.h = null;
        HashMap hashMap = cVar.d;
        for (p2.b bVar : hashMap.values()) {
            bVar.f40665b.e(null);
        }
        cVar.f40676n.removeCallbacksAndMessages(null);
        cVar.f40676n = null;
        hashMap.clear();
        this.f15630k.release();
    }

    @Override
    public final synchronized void t(k0 k0Var) {
        this.f15638s = k0Var;
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
        boolean z12 = lVar.f40739p;
        boolean z13 = lVar.f40731g;
        i0 i0Var = lVar.f40741r;
        long j17 = lVar.f40744u;
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
        p2.c cVar = this.f15634o;
        cVar.f40678s.getClass();
        na.d dVar = new na.d(16);
        long j20 = 0;
        if (cVar.f40680x) {
            p2.k kVar = lVar.v;
            long j21 = j19 - cVar.f40681y;
            boolean z14 = lVar.f40738o;
            if (z14) {
                j12 = j21 + j17;
            } else {
                j12 = -9223372036854775807L;
            }
            if (lVar.f40739p) {
                j13 = e2.d0.Q(e2.d0.A(this.f15635p)) - (j19 + j17);
            } else {
                j13 = 0;
            }
            long j22 = this.f15636q.f2972a;
            if (j22 != -9223372036854775807L) {
                j15 = e2.d0.Q(j22);
            } else {
                if (j18 != -9223372036854775807L) {
                    j14 = j17 - j18;
                } else {
                    j14 = kVar.d;
                    if (j14 == -9223372036854775807L || lVar.f40737n == -9223372036854775807L) {
                        j14 = kVar.f40729c;
                        if (j14 == -9223372036854775807L) {
                            j14 = 3 * lVar.f40736m;
                        }
                    }
                }
                j15 = j14 + j13;
            }
            long j23 = j17 + j13;
            long i11 = e2.d0.i(j15, j13, j23);
            e0 e0Var = i().f3073c;
            if (e0Var.d == -3.4028235E38f && e0Var.e == -3.4028235E38f && kVar.f40729c == -9223372036854775807L && kVar.d == -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            b2.d0 d0Var = new b2.d0();
            d0Var.f2951a = e2.d0.e0(i11);
            float f10 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = this.f15636q.d;
            }
            d0Var.d = f7;
            if (!z10) {
                f10 = this.f15636q.e;
            }
            d0Var.e = f10;
            e0 e0Var2 = new e0(d0Var);
            this.f15636q = e0Var2;
            if (j18 == -9223372036854775807L) {
                j18 = j23 - e2.d0.Q(e0Var2.f2972a);
            }
            if (z13) {
                j20 = j18;
            } else {
                p2.g u10 = u(j18, lVar.f40742s);
                if (u10 != null) {
                    j16 = u10.e;
                } else if (!i0Var.isEmpty()) {
                    p2.i iVar = (p2.i) i0Var.get(e2.d0.c(i0Var, Long.valueOf(j18), true));
                    p2.g u11 = u(j18, iVar.f40719x);
                    if (u11 != null) {
                        j16 = u11.e;
                    } else {
                        j16 = iVar.e;
                    }
                }
                j20 = j16;
            }
            if (i10 == 2 && lVar.f40730f) {
                z11 = true;
            } else {
                z11 = false;
            }
            h1Var = new h1(j10, j3, j12, lVar.f40744u, j21, j20, true, !z14, z11, dVar, i(), this.f15636q);
        } else {
            if (j18 != -9223372036854775807L && !i0Var.isEmpty()) {
                if (!z13 && j18 != j17) {
                    j18 = ((p2.i) i0Var.get(e2.d0.c(i0Var, Long.valueOf(j18), true))).e;
                }
                j11 = j18;
            } else {
                j11 = 0;
            }
            long j24 = lVar.f40744u;
            h1Var = new h1(j10, j3, j24, j24, 0L, j11, true, false, true, dVar, i(), null);
        }
        n(h1Var);
    }
}
