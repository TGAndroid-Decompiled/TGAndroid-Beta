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
import u2.g1;
public final class l extends u2.a {
    public final c h;
    public final m2.t f17085i;
    public final t7.t f17086j;
    public final n2.m f17087k;
    public final rb.a f17088l;
    public final boolean f17089m;
    public final int f17090n;
    public final p2.c f17091o;
    public final long f17092p;
    public e0 f17093q;
    public c0 f17094r;
    public k0 f17095s;

    static {
        l0.a("media3.exoplayer.hls");
    }

    public l(k0 k0Var, m2.t tVar, c cVar, t7.t tVar2, n2.m mVar, rb.a aVar, p2.c cVar2, long j3, boolean z10, int i10) {
        this.f17095s = k0Var;
        this.f17093q = k0Var.f3401c;
        this.f17085i = tVar;
        this.h = cVar;
        this.f17086j = tVar2;
        this.f17087k = mVar;
        this.f17088l = aVar;
        this.f17091o = cVar2;
        this.f17092p = j3;
        this.f17089m = z10;
        this.f17090n = i10;
    }

    public static p2.g u(long j3, List list) {
        p2.g gVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            p2.g gVar2 = (p2.g) list.get(i10);
            long j10 = gVar2.f45294e;
            if (j10 <= j3 && gVar2.f45284w) {
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
        n2.j jVar = new n2.j(this.d.f16602c, 0, f0Var);
        c0 c0Var = this.f17094r;
        j2.k kVar = this.f48638g;
        e2.d.h(kVar);
        return new k(this.h, this.f17091o, this.f17085i, c0Var, this.f17087k, jVar, this.f17088l, b10, dVar, this.f17086j, this.f17089m, this.f17090n, kVar);
    }

    @Override
    public final synchronized k0 i() {
        return this.f17095s;
    }

    @Override
    public final void k() {
        p2.c cVar = this.f17091o;
        y2.l lVar = cVar.h;
        if (lVar != null) {
            lVar.a();
        }
        Uri uri = cVar.v;
        if (uri != null) {
            p2.b bVar = (p2.b) cVar.d.get(uri);
            bVar.f45232b.a();
            IOException iOException = bVar.f45238s;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final void m(c0 c0Var) {
        boolean z10;
        this.f17094r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f48638g;
        e2.d.h(kVar);
        n2.m mVar = this.f17087k;
        mVar.F(myLooper, kVar);
        mVar.b();
        a5.a b10 = b(null);
        f0 f0Var = i().f3400b;
        f0Var.getClass();
        Uri uri = f0Var.f3305a;
        p2.c cVar = this.f17091o;
        cVar.getClass();
        cVar.f45245n = e2.d0.o(null);
        cVar.f45244f = b10;
        cVar.f45246r = this;
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.o oVar = new y2.o(((g2.g) cVar.f45240a.f16033b).createDataSource(), new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, cVar.f45241b.x());
        if (cVar.h == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        y2.l lVar = new y2.l("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.h = lVar;
        lVar.f(oVar, cVar, cVar.f45242c.m3(oVar.f51822c));
    }

    @Override
    public final void o(d0 d0Var) {
        q[] qVarArr;
        p[] pVarArr;
        k kVar = (k) d0Var;
        kVar.f17075b.f45243e.remove(kVar);
        for (q qVar : kVar.J) {
            if (qVar.T) {
                for (p pVar : qVar.L) {
                    pVar.k();
                    n2.g gVar = pVar.h;
                    if (gVar != null) {
                        gVar.a(pVar.f48867e);
                        pVar.h = null;
                        pVar.f48869g = null;
                    }
                }
            }
            i iVar = qVar.d;
            p2.b bVar = (p2.b) iVar.f17056g.d.get(iVar.f17054e[iVar.f17066r.l()]);
            if (bVar != null) {
                bVar.v = false;
            }
            iVar.f17062n = null;
            qVar.f17128s.e(qVar);
            qVar.H.removeCallbacksAndMessages(null);
            qVar.X = true;
            qVar.I.clear();
        }
        kVar.G = null;
    }

    @Override
    public final void q() {
        p2.c cVar = this.f17091o;
        cVar.v = null;
        cVar.f45248w = null;
        cVar.f45247s = null;
        cVar.f45250y = -9223372036854775807L;
        cVar.h.e(null);
        cVar.h = null;
        HashMap hashMap = cVar.d;
        for (p2.b bVar : hashMap.values()) {
            bVar.f45232b.e(null);
        }
        cVar.f45245n.removeCallbacksAndMessages(null);
        cVar.f45245n = null;
        hashMap.clear();
        this.f17087k.release();
    }

    @Override
    public final synchronized void t(k0 k0Var) {
        this.f17095s = k0Var;
    }

    public final void v(p2.l lVar) {
        long j3;
        long j10;
        long j11;
        g1 g1Var;
        long j12;
        boolean z10;
        long j13;
        long j14;
        long j15;
        boolean z11;
        float f7;
        long j16;
        boolean z12;
        boolean z13 = lVar.f45313p;
        boolean z14 = lVar.f45305g;
        i0 i0Var = lVar.f45315r;
        long j17 = lVar.f45318u;
        long j18 = lVar.f45303e;
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
        p2.c cVar = this.f17091o;
        cVar.f45247s.getClass();
        ?? obj = new Object();
        long j20 = 0;
        if (cVar.f45249x) {
            p2.k kVar = lVar.v;
            long j21 = j19 - cVar.f45250y;
            boolean z15 = lVar.f45312o;
            if (z15) {
                j12 = j21 + j17;
            } else {
                j12 = -9223372036854775807L;
            }
            if (lVar.f45313p) {
                z10 = z14;
                j13 = e2.d0.P(e2.d0.z(this.f17092p)) - (j19 + j17);
            } else {
                z10 = z14;
                j13 = 0;
            }
            long j22 = this.f17093q.f3288a;
            if (j22 != -9223372036854775807L) {
                j15 = e2.d0.P(j22);
            } else {
                if (j18 != -9223372036854775807L) {
                    j14 = j17 - j18;
                } else {
                    j14 = kVar.d;
                    if (j14 == -9223372036854775807L || lVar.f45311n == -9223372036854775807L) {
                        j14 = kVar.f45301c;
                        if (j14 == -9223372036854775807L) {
                            j14 = 3 * lVar.f45310m;
                        }
                    }
                }
                j15 = j14 + j13;
            }
            long j23 = j17 + j13;
            long i11 = e2.d0.i(j15, j13, j23);
            e0 e0Var = i().f3401c;
            if (e0Var.d == -3.4028235E38f && e0Var.f3291e == -3.4028235E38f && kVar.f45301c == -9223372036854775807L && kVar.d == -9223372036854775807L) {
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
                f7 = this.f17093q.d;
            }
            d0Var.d = f7;
            if (!z11) {
                f10 = this.f17093q.f3291e;
            }
            d0Var.f3267e = f10;
            e0 e0Var2 = new e0(d0Var);
            this.f17093q = e0Var2;
            if (j18 == -9223372036854775807L) {
                j18 = j23 - e2.d0.P(e0Var2.f3288a);
            }
            if (z10) {
                j20 = j18;
            } else {
                p2.g u10 = u(j18, lVar.f45316s);
                if (u10 != null) {
                    j16 = u10.f45294e;
                } else if (!i0Var.isEmpty()) {
                    p2.i iVar = (p2.i) i0Var.get(e2.d0.c(i0Var, Long.valueOf(j18), true));
                    p2.g u11 = u(j18, iVar.f45290x);
                    if (u11 != null) {
                        j16 = u11.f45294e;
                    } else {
                        j16 = iVar.f45294e;
                    }
                }
                j20 = j16;
            }
            if (i10 == 2 && lVar.f45304f) {
                z12 = true;
            } else {
                z12 = false;
            }
            g1Var = new g1(j10, j3, j12, lVar.f45318u, j21, j20, true, !z15, z12, obj, i(), this.f17093q);
        } else {
            if (j18 != -9223372036854775807L && !i0Var.isEmpty()) {
                if (!z14 && j18 != j17) {
                    j18 = ((p2.i) i0Var.get(e2.d0.c(i0Var, Long.valueOf(j18), true))).f45294e;
                }
                j11 = j18;
            } else {
                j11 = 0;
            }
            long j24 = lVar.f45318u;
            g1Var = new g1(j10, j3, j24, j24, 0L, j11, true, false, true, obj, i(), null);
        }
        n(g1Var);
    }
}
