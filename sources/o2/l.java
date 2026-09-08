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
    public final u4 f16913i;
    public final qb.b f16914j;
    public final n2.m f16915k;
    public final rb.a f16916l;
    public final boolean f16917m;
    public final int f16918n;
    public final p2.c f16919o;
    public final long f16920p;
    public e0 f16921q;
    public c0 f16922r;
    public k0 f16923s;

    static {
        l0.a("media3.exoplayer.hls");
    }

    public l(k0 k0Var, u4 u4Var, c cVar, qb.b bVar, n2.m mVar, rb.a aVar, p2.c cVar2, long j3, boolean z10, int i10) {
        this.f16923s = k0Var;
        this.f16921q = k0Var.f2155c;
        this.f16913i = u4Var;
        this.h = cVar;
        this.f16914j = bVar;
        this.f16915k = mVar;
        this.f16916l = aVar;
        this.f16919o = cVar2;
        this.f16920p = j3;
        this.f16917m = z10;
        this.f16918n = i10;
    }

    public static p2.g u(long j3, List list) {
        p2.g gVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            p2.g gVar2 = (p2.g) list.get(i10);
            long j10 = gVar2.f43731e;
            if (j10 <= j3 && gVar2.f43721w) {
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
        f0 f0Var = i10.f2154b;
        f0Var.getClass();
        f0 f0Var2 = k0Var.f2154b;
        if (f0Var2 != null && f0Var2.f2059a.equals(f0Var.f2059a) && f0Var2.f2062e.equals(f0Var.f2062e) && Objects.equals(f0Var2.f2061c, f0Var.f2061c) && i10.f2155c.equals(k0Var.f2155c)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(u2.f0 f0Var, y2.d dVar, long j3) {
        a5.a b10 = b(f0Var);
        n2.j jVar = new n2.j(this.d.f16429c, 0, f0Var);
        c0 c0Var = this.f16922r;
        j2.k kVar = this.f46637g;
        e2.d.h(kVar);
        return new k(this.h, this.f16919o, this.f16913i, c0Var, this.f16915k, jVar, this.f16916l, b10, dVar, this.f16914j, this.f16917m, this.f16918n, kVar);
    }

    @Override
    public final synchronized k0 i() {
        return this.f16923s;
    }

    @Override
    public final void k() {
        p2.c cVar = this.f16919o;
        y2.m mVar = cVar.h;
        if (mVar != null) {
            mVar.b();
        }
        Uri uri = cVar.v;
        if (uri != null) {
            p2.b bVar = (p2.b) cVar.d.get(uri);
            bVar.f43669b.b();
            IOException iOException = bVar.f43675s;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final void m(c0 c0Var) {
        boolean z10;
        this.f16922r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f46637g;
        e2.d.h(kVar);
        n2.m mVar = this.f16915k;
        mVar.B(myLooper, kVar);
        mVar.b();
        a5.a b10 = b(null);
        f0 f0Var = i().f2154b;
        f0Var.getClass();
        Uri uri = f0Var.f2059a;
        p2.c cVar = this.f16919o;
        cVar.getClass();
        cVar.f43682n = e2.d0.o(null);
        cVar.f43681f = b10;
        cVar.f43683r = this;
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.p pVar = new y2.p(((g2.g) cVar.f43677a.f14247b).createDataSource(), new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, cVar.f43678b.U());
        if (cVar.h == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        y2.m mVar2 = new y2.m("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.h = mVar2;
        mVar2.f(pVar, cVar, cVar.f43679c.L3(pVar.f49552c));
    }

    @Override
    public final void o(d0 d0Var) {
        q[] qVarArr;
        p[] pVarArr;
        k kVar = (k) d0Var;
        kVar.f16903b.f43680e.remove(kVar);
        for (q qVar : kVar.J) {
            if (qVar.T) {
                for (p pVar : qVar.L) {
                    pVar.k();
                    n2.g gVar = pVar.h;
                    if (gVar != null) {
                        gVar.a(pVar.f46649e);
                        pVar.h = null;
                        pVar.f46651g = null;
                    }
                }
            }
            i iVar = qVar.d;
            p2.b bVar = (p2.b) iVar.f16884g.d.get(iVar.f16882e[iVar.f16894r.l()]);
            if (bVar != null) {
                bVar.v = false;
            }
            iVar.f16890n = null;
            qVar.f16956s.e(qVar);
            qVar.H.removeCallbacksAndMessages(null);
            qVar.X = true;
            qVar.I.clear();
        }
        kVar.G = null;
    }

    @Override
    public final void q() {
        p2.c cVar = this.f16919o;
        cVar.v = null;
        cVar.f43685w = null;
        cVar.f43684s = null;
        cVar.f43687y = -9223372036854775807L;
        cVar.h.e(null);
        cVar.h = null;
        HashMap hashMap = cVar.d;
        for (p2.b bVar : hashMap.values()) {
            bVar.f43669b.e(null);
        }
        cVar.f43682n.removeCallbacksAndMessages(null);
        cVar.f43682n = null;
        hashMap.clear();
        this.f16915k.release();
    }

    @Override
    public final synchronized void t(k0 k0Var) {
        this.f16923s = k0Var;
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
        boolean z13 = lVar.f43750p;
        boolean z14 = lVar.f43742g;
        i0 i0Var = lVar.f43752r;
        long j17 = lVar.f43755u;
        long j18 = lVar.f43740e;
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
        p2.c cVar = this.f16919o;
        cVar.f43684s.getClass();
        ?? obj = new Object();
        long j20 = 0;
        if (cVar.f43686x) {
            p2.k kVar = lVar.v;
            long j21 = j19 - cVar.f43687y;
            boolean z15 = lVar.f43749o;
            if (z15) {
                j12 = j21 + j17;
            } else {
                j12 = -9223372036854775807L;
            }
            if (lVar.f43750p) {
                z10 = z14;
                j13 = e2.d0.Q(e2.d0.A(this.f16920p)) - (j19 + j17);
            } else {
                z10 = z14;
                j13 = 0;
            }
            long j22 = this.f16921q.f2042a;
            if (j22 != -9223372036854775807L) {
                j15 = e2.d0.Q(j22);
            } else {
                if (j18 != -9223372036854775807L) {
                    j14 = j17 - j18;
                } else {
                    j14 = kVar.d;
                    if (j14 == -9223372036854775807L || lVar.f43748n == -9223372036854775807L) {
                        j14 = kVar.f43738c;
                        if (j14 == -9223372036854775807L) {
                            j14 = 3 * lVar.f43747m;
                        }
                    }
                }
                j15 = j14 + j13;
            }
            long j23 = j17 + j13;
            long i11 = e2.d0.i(j15, j13, j23);
            e0 e0Var = i().f2155c;
            if (e0Var.d == -3.4028235E38f && e0Var.f2045e == -3.4028235E38f && kVar.f43738c == -9223372036854775807L && kVar.d == -9223372036854775807L) {
                z11 = true;
            } else {
                z11 = false;
            }
            b2.d0 d0Var = new b2.d0();
            d0Var.f2018a = e2.d0.e0(i11);
            float f10 = 1.0f;
            if (z11) {
                f7 = 1.0f;
            } else {
                f7 = this.f16921q.d;
            }
            d0Var.d = f7;
            if (!z11) {
                f10 = this.f16921q.f2045e;
            }
            d0Var.f2021e = f10;
            e0 e0Var2 = new e0(d0Var);
            this.f16921q = e0Var2;
            if (j18 == -9223372036854775807L) {
                j18 = j23 - e2.d0.Q(e0Var2.f2042a);
            }
            if (z10) {
                j20 = j18;
            } else {
                p2.g u10 = u(j18, lVar.f43753s);
                if (u10 != null) {
                    j16 = u10.f43731e;
                } else if (!i0Var.isEmpty()) {
                    p2.i iVar = (p2.i) i0Var.get(e2.d0.c(i0Var, Long.valueOf(j18), true));
                    p2.g u11 = u(j18, iVar.f43727x);
                    if (u11 != null) {
                        j16 = u11.f43731e;
                    } else {
                        j16 = iVar.f43731e;
                    }
                }
                j20 = j16;
            }
            if (i10 == 2 && lVar.f43741f) {
                z12 = true;
            } else {
                z12 = false;
            }
            h1Var = new h1(j10, j3, j12, lVar.f43755u, j21, j20, true, !z15, z12, obj, i(), this.f16921q);
        } else {
            if (j18 != -9223372036854775807L && !i0Var.isEmpty()) {
                if (!z14 && j18 != j17) {
                    j18 = ((p2.i) i0Var.get(e2.d0.c(i0Var, Long.valueOf(j18), true))).f43731e;
                }
                j11 = j18;
            } else {
                j11 = 0;
            }
            long j24 = lVar.f43755u;
            h1Var = new h1(j10, j3, j24, j24, 0L, j11, true, false, true, obj, i(), null);
        }
        n(h1Var);
    }
}
