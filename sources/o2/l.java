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
import ji.u4;
import u2.d0;
import u2.h1;
public final class l extends u2.a {
    public final c h;
    public final u4 f16886i;
    public final qb.b f16887j;
    public final n2.m f16888k;
    public final rb.a f16889l;
    public final boolean f16890m;
    public final int f16891n;
    public final p2.c f16892o;
    public final long f16893p;
    public e0 f16894q;
    public c0 f16895r;
    public k0 f16896s;

    static {
        l0.a("media3.exoplayer.hls");
    }

    public l(k0 k0Var, u4 u4Var, c cVar, qb.b bVar, n2.m mVar, rb.a aVar, p2.c cVar2, long j3, boolean z10, int i10) {
        this.f16896s = k0Var;
        this.f16894q = k0Var.f2128c;
        this.f16886i = u4Var;
        this.h = cVar;
        this.f16887j = bVar;
        this.f16888k = mVar;
        this.f16889l = aVar;
        this.f16892o = cVar2;
        this.f16893p = j3;
        this.f16890m = z10;
        this.f16891n = i10;
    }

    public static p2.g u(long j3, List list) {
        p2.g gVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            p2.g gVar2 = (p2.g) list.get(i10);
            long j10 = gVar2.f43704e;
            if (j10 <= j3 && gVar2.f43694w) {
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
        f0 f0Var = i10.f2127b;
        f0Var.getClass();
        f0 f0Var2 = k0Var.f2127b;
        if (f0Var2 != null && f0Var2.f2032a.equals(f0Var.f2032a) && f0Var2.f2035e.equals(f0Var.f2035e) && Objects.equals(f0Var2.f2034c, f0Var.f2034c) && i10.f2128c.equals(k0Var.f2128c)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(u2.f0 f0Var, y2.d dVar, long j3) {
        a5.a b10 = b(f0Var);
        n2.j jVar = new n2.j(this.d.f16402c, 0, f0Var);
        c0 c0Var = this.f16895r;
        j2.k kVar = this.f46609g;
        e2.d.h(kVar);
        return new k(this.h, this.f16892o, this.f16886i, c0Var, this.f16888k, jVar, this.f16889l, b10, dVar, this.f16887j, this.f16890m, this.f16891n, kVar);
    }

    @Override
    public final synchronized k0 i() {
        return this.f16896s;
    }

    @Override
    public final void k() {
        p2.c cVar = this.f16892o;
        y2.m mVar = cVar.h;
        if (mVar != null) {
            mVar.b();
        }
        Uri uri = cVar.v;
        if (uri != null) {
            p2.b bVar = (p2.b) cVar.d.get(uri);
            bVar.f43642b.b();
            IOException iOException = bVar.f43648s;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final void m(c0 c0Var) {
        boolean z10;
        this.f16895r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f46609g;
        e2.d.h(kVar);
        n2.m mVar = this.f16888k;
        mVar.B(myLooper, kVar);
        mVar.b();
        a5.a b10 = b(null);
        f0 f0Var = i().f2127b;
        f0Var.getClass();
        Uri uri = f0Var.f2032a;
        p2.c cVar = this.f16892o;
        cVar.getClass();
        cVar.f43655n = e2.d0.o(null);
        cVar.f43654f = b10;
        cVar.f43656r = this;
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.p pVar = new y2.p(((g2.g) cVar.f43650a.f14221b).createDataSource(), new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, cVar.f43651b.U());
        if (cVar.h == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        y2.m mVar2 = new y2.m("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.h = mVar2;
        mVar2.f(pVar, cVar, cVar.f43652c.L3(pVar.f49523c));
    }

    @Override
    public final void o(d0 d0Var) {
        q[] qVarArr;
        p[] pVarArr;
        k kVar = (k) d0Var;
        kVar.f16876b.f43653e.remove(kVar);
        for (q qVar : kVar.J) {
            if (qVar.T) {
                for (p pVar : qVar.L) {
                    pVar.k();
                    n2.g gVar = pVar.h;
                    if (gVar != null) {
                        gVar.a(pVar.f46621e);
                        pVar.h = null;
                        pVar.f46623g = null;
                    }
                }
            }
            i iVar = qVar.d;
            p2.b bVar = (p2.b) iVar.f16857g.d.get(iVar.f16855e[iVar.f16867r.l()]);
            if (bVar != null) {
                bVar.v = false;
            }
            iVar.f16863n = null;
            qVar.f16929s.e(qVar);
            qVar.H.removeCallbacksAndMessages(null);
            qVar.X = true;
            qVar.I.clear();
        }
        kVar.G = null;
    }

    @Override
    public final void q() {
        p2.c cVar = this.f16892o;
        cVar.v = null;
        cVar.f43658w = null;
        cVar.f43657s = null;
        cVar.f43660y = -9223372036854775807L;
        cVar.h.e(null);
        cVar.h = null;
        HashMap hashMap = cVar.d;
        for (p2.b bVar : hashMap.values()) {
            bVar.f43642b.e(null);
        }
        cVar.f43655n.removeCallbacksAndMessages(null);
        cVar.f43655n = null;
        hashMap.clear();
        this.f16888k.release();
    }

    @Override
    public final synchronized void t(k0 k0Var) {
        this.f16896s = k0Var;
    }

    public final void v(p2.l lVar) {
        long j3;
        long j10;
        long j11;
        h1 h1Var;
        long j12;
        boolean z10;
        long j13;
        long j14;
        long j15;
        boolean z11;
        float f7;
        long j16;
        boolean z12;
        boolean z13 = lVar.f43723p;
        boolean z14 = lVar.f43715g;
        i0 i0Var = lVar.f43725r;
        long j17 = lVar.f43728u;
        long j18 = lVar.f43713e;
        int i10 = lVar.d;
        long j19 = lVar.h;
        if (z13) {
            j3 = e2.d0.e0(j19);
        } else {
            j3 = -9223372036854775807L;
        }
        if (i10 != 2 && i10 != 1) {
            j10 = -9223372036854775807L;
        } else {
            j10 = j3;
        }
        p2.c cVar = this.f16892o;
        cVar.f43657s.getClass();
        ?? obj = new Object();
        long j20 = 0;
        if (cVar.f43659x) {
            p2.k kVar = lVar.v;
            long j21 = j19 - cVar.f43660y;
            boolean z15 = lVar.f43722o;
            if (z15) {
                j12 = j21 + j17;
            } else {
                j12 = -9223372036854775807L;
            }
            if (lVar.f43723p) {
                z10 = z14;
                j13 = e2.d0.Q(e2.d0.A(this.f16893p)) - (j19 + j17);
            } else {
                z10 = z14;
                j13 = 0;
            }
            long j22 = this.f16894q.f2015a;
            if (j22 != -9223372036854775807L) {
                j15 = e2.d0.Q(j22);
            } else {
                if (j18 != -9223372036854775807L) {
                    j14 = j17 - j18;
                } else {
                    j14 = kVar.d;
                    if (j14 == -9223372036854775807L || lVar.f43721n == -9223372036854775807L) {
                        j14 = kVar.f43711c;
                        if (j14 == -9223372036854775807L) {
                            j14 = 3 * lVar.f43720m;
                        }
                    }
                }
                j15 = j14 + j13;
            }
            long j23 = j17 + j13;
            long i11 = e2.d0.i(j15, j13, j23);
            e0 e0Var = i().f2128c;
            if (e0Var.d == -3.4028235E38f && e0Var.f2018e == -3.4028235E38f && kVar.f43711c == -9223372036854775807L && kVar.d == -9223372036854775807L) {
                z11 = true;
            } else {
                z11 = false;
            }
            b2.d0 d0Var = new b2.d0();
            d0Var.f1991a = e2.d0.e0(i11);
            float f10 = 1.0f;
            if (z11) {
                f7 = 1.0f;
            } else {
                f7 = this.f16894q.d;
            }
            d0Var.d = f7;
            if (!z11) {
                f10 = this.f16894q.f2018e;
            }
            d0Var.f1994e = f10;
            e0 e0Var2 = new e0(d0Var);
            this.f16894q = e0Var2;
            if (j18 == -9223372036854775807L) {
                j18 = j23 - e2.d0.Q(e0Var2.f2015a);
            }
            if (z10) {
                j20 = j18;
            } else {
                p2.g u10 = u(j18, lVar.f43726s);
                if (u10 != null) {
                    j16 = u10.f43704e;
                } else if (!i0Var.isEmpty()) {
                    p2.i iVar = (p2.i) i0Var.get(e2.d0.c(i0Var, Long.valueOf(j18), true));
                    p2.g u11 = u(j18, iVar.f43700x);
                    if (u11 != null) {
                        j16 = u11.f43704e;
                    } else {
                        j16 = iVar.f43704e;
                    }
                }
                j20 = j16;
            }
            if (i10 == 2 && lVar.f43714f) {
                z12 = true;
            } else {
                z12 = false;
            }
            h1Var = new h1(j10, j3, j12, lVar.f43728u, j21, j20, true, !z15, z12, obj, i(), this.f16894q);
        } else {
            if (j18 != -9223372036854775807L && !i0Var.isEmpty()) {
                if (!z14 && j18 != j17) {
                    j18 = ((p2.i) i0Var.get(e2.d0.c(i0Var, Long.valueOf(j18), true))).f43704e;
                }
                j11 = j18;
            } else {
                j11 = 0;
            }
            long j24 = lVar.f43728u;
            h1Var = new h1(j10, j3, j24, j24, 0L, j11, true, false, true, obj, i(), null);
        }
        n(h1Var);
    }
}
