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
    public final m2.t f16999i;
    public final t7.t f17000j;
    public final n2.m f17001k;
    public final rb.a f17002l;
    public final boolean f17003m;
    public final int f17004n;
    public final p2.c f17005o;
    public final long f17006p;
    public e0 f17007q;
    public c0 f17008r;
    public k0 f17009s;

    static {
        l0.a("media3.exoplayer.hls");
    }

    public l(k0 k0Var, m2.t tVar, c cVar, t7.t tVar2, n2.m mVar, rb.a aVar, p2.c cVar2, long j3, boolean z10, int i10) {
        this.f17009s = k0Var;
        this.f17007q = k0Var.f3401c;
        this.f16999i = tVar;
        this.h = cVar;
        this.f17000j = tVar2;
        this.f17001k = mVar;
        this.f17002l = aVar;
        this.f17005o = cVar2;
        this.f17006p = j3;
        this.f17003m = z10;
        this.f17004n = i10;
    }

    public static p2.g u(long j3, List list) {
        p2.g gVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            p2.g gVar2 = (p2.g) list.get(i10);
            long j10 = gVar2.f45226e;
            if (j10 <= j3 && gVar2.f45216w) {
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
        f0 f0Var = i10.f3400b;
        f0Var.getClass();
        f0 f0Var2 = k0Var.f3400b;
        if (f0Var2 != null && f0Var2.f3305a.equals(f0Var.f3305a) && f0Var2.f3308e.equals(f0Var.f3308e) && Objects.equals(f0Var2.f3307c, f0Var.f3307c) && i10.f3401c.equals(k0Var.f3401c)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(u2.f0 f0Var, y2.d dVar, long j3) {
        a5.a b10 = b(f0Var);
        n2.j jVar = new n2.j(this.d.f16520c, 0, f0Var);
        c0 c0Var = this.f17008r;
        j2.k kVar = this.f48514g;
        e2.d.h(kVar);
        return new k(this.h, this.f17005o, this.f16999i, c0Var, this.f17001k, jVar, this.f17002l, b10, dVar, this.f17000j, this.f17003m, this.f17004n, kVar);
    }

    @Override
    public final synchronized k0 i() {
        return this.f17009s;
    }

    @Override
    public final void k() {
        p2.c cVar = this.f17005o;
        y2.l lVar = cVar.h;
        if (lVar != null) {
            lVar.a();
        }
        Uri uri = cVar.v;
        if (uri != null) {
            p2.b bVar = (p2.b) cVar.d.get(uri);
            bVar.f45164b.a();
            IOException iOException = bVar.f45170s;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final void m(c0 c0Var) {
        boolean z10;
        this.f17008r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f48514g;
        e2.d.h(kVar);
        n2.m mVar = this.f17001k;
        mVar.F(myLooper, kVar);
        mVar.b();
        a5.a b10 = b(null);
        f0 f0Var = i().f3400b;
        f0Var.getClass();
        Uri uri = f0Var.f3305a;
        p2.c cVar = this.f17005o;
        cVar.getClass();
        cVar.f45177n = e2.d0.o(null);
        cVar.f45176f = b10;
        cVar.f45178r = this;
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.o oVar = new y2.o(((g2.g) cVar.f45172a.f15972b).createDataSource(), new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, cVar.f45173b.x());
        if (cVar.h == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        y2.l lVar = new y2.l("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.h = lVar;
        lVar.f(oVar, cVar, cVar.f45174c.m3(oVar.f51701c));
    }

    @Override
    public final void o(d0 d0Var) {
        q[] qVarArr;
        p[] pVarArr;
        k kVar = (k) d0Var;
        kVar.f16989b.f45175e.remove(kVar);
        for (q qVar : kVar.J) {
            if (qVar.T) {
                for (p pVar : qVar.L) {
                    pVar.k();
                    n2.g gVar = pVar.h;
                    if (gVar != null) {
                        gVar.a(pVar.f48526e);
                        pVar.h = null;
                        pVar.f48528g = null;
                    }
                }
            }
            i iVar = qVar.d;
            p2.b bVar = (p2.b) iVar.f16970g.d.get(iVar.f16968e[iVar.f16980r.l()]);
            if (bVar != null) {
                bVar.v = false;
            }
            iVar.f16976n = null;
            qVar.f17042s.e(qVar);
            qVar.H.removeCallbacksAndMessages(null);
            qVar.X = true;
            qVar.I.clear();
        }
        kVar.G = null;
    }

    @Override
    public final void q() {
        p2.c cVar = this.f17005o;
        cVar.v = null;
        cVar.f45180w = null;
        cVar.f45179s = null;
        cVar.f45182y = -9223372036854775807L;
        cVar.h.e(null);
        cVar.h = null;
        HashMap hashMap = cVar.d;
        for (p2.b bVar : hashMap.values()) {
            bVar.f45164b.e(null);
        }
        cVar.f45177n.removeCallbacksAndMessages(null);
        cVar.f45177n = null;
        hashMap.clear();
        this.f17001k.release();
    }

    @Override
    public final synchronized void t(k0 k0Var) {
        this.f17009s = k0Var;
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
        boolean z13 = lVar.f45245p;
        boolean z14 = lVar.f45237g;
        i0 i0Var = lVar.f45247r;
        long j17 = lVar.f45250u;
        long j18 = lVar.f45235e;
        int i10 = lVar.d;
        long j19 = lVar.h;
        if (z13) {
            j3 = e2.d0.d0(j19);
        } else {
            j3 = -9223372036854775807L;
        }
        if (i10 != 2 && i10 != 1) {
            j10 = -9223372036854775807L;
        } else {
            j10 = j3;
        }
        p2.c cVar = this.f17005o;
        cVar.f45179s.getClass();
        ?? obj = new Object();
        long j20 = 0;
        if (cVar.f45181x) {
            p2.k kVar = lVar.v;
            long j21 = j19 - cVar.f45182y;
            boolean z15 = lVar.f45244o;
            if (z15) {
                j12 = j21 + j17;
            } else {
                j12 = -9223372036854775807L;
            }
            if (lVar.f45245p) {
                z10 = z14;
                j13 = e2.d0.P(e2.d0.z(this.f17006p)) - (j19 + j17);
            } else {
                z10 = z14;
                j13 = 0;
            }
            long j22 = this.f17007q.f3288a;
            if (j22 != -9223372036854775807L) {
                j15 = e2.d0.P(j22);
            } else {
                if (j18 != -9223372036854775807L) {
                    j14 = j17 - j18;
                } else {
                    j14 = kVar.d;
                    if (j14 == -9223372036854775807L || lVar.f45243n == -9223372036854775807L) {
                        j14 = kVar.f45233c;
                        if (j14 == -9223372036854775807L) {
                            j14 = 3 * lVar.f45242m;
                        }
                    }
                }
                j15 = j14 + j13;
            }
            long j23 = j17 + j13;
            long i11 = e2.d0.i(j15, j13, j23);
            e0 e0Var = i().f3401c;
            if (e0Var.d == -3.4028235E38f && e0Var.f3291e == -3.4028235E38f && kVar.f45233c == -9223372036854775807L && kVar.d == -9223372036854775807L) {
                z11 = true;
            } else {
                z11 = false;
            }
            b2.d0 d0Var = new b2.d0();
            d0Var.f3264a = e2.d0.d0(i11);
            float f10 = 1.0f;
            if (z11) {
                f7 = 1.0f;
            } else {
                f7 = this.f17007q.d;
            }
            d0Var.d = f7;
            if (!z11) {
                f10 = this.f17007q.f3291e;
            }
            d0Var.f3267e = f10;
            e0 e0Var2 = new e0(d0Var);
            this.f17007q = e0Var2;
            if (j18 == -9223372036854775807L) {
                j18 = j23 - e2.d0.P(e0Var2.f3288a);
            }
            if (z10) {
                j20 = j18;
            } else {
                p2.g u10 = u(j18, lVar.f45248s);
                if (u10 != null) {
                    j16 = u10.f45226e;
                } else if (!i0Var.isEmpty()) {
                    p2.i iVar = (p2.i) i0Var.get(e2.d0.c(i0Var, Long.valueOf(j18), true));
                    p2.g u11 = u(j18, iVar.f45222x);
                    if (u11 != null) {
                        j16 = u11.f45226e;
                    } else {
                        j16 = iVar.f45226e;
                    }
                }
                j20 = j16;
            }
            if (i10 == 2 && lVar.f45236f) {
                z12 = true;
            } else {
                z12 = false;
            }
            h1Var = new h1(j10, j3, j12, lVar.f45250u, j21, j20, true, !z15, z12, obj, i(), this.f17007q);
        } else {
            if (j18 != -9223372036854775807L && !i0Var.isEmpty()) {
                if (!z14 && j18 != j17) {
                    j18 = ((p2.i) i0Var.get(e2.d0.c(i0Var, Long.valueOf(j18), true))).f45226e;
                }
                j11 = j18;
            } else {
                j11 = 0;
            }
            long j24 = lVar.f45250u;
            h1Var = new h1(j10, j3, j24, j24, 0L, j11, true, false, true, obj, i(), null);
        }
        n(h1Var);
    }
}
