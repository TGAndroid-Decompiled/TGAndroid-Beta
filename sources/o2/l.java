package o2;

import android.net.Uri;
import android.os.Looper;
import b2.e0;
import b2.f0;
import b2.k0;
import b2.l0;
import e2.d0;
import e9.i0;
import g2.c0;
import j$.util.Objects;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import u2.g0;
import u2.j1;
public final class l extends u2.a {
    public final c h;
    public final l2.h f14190i;
    public final ob.a f14191j;
    public final n2.n f14192k;
    public final rb.a f14193l;
    public final boolean f14194m;
    public final int f14195n;
    public final p2.c f14196o;
    public final long f14197p;
    public e0 f14198q;
    public c0 f14199r;
    public k0 f14200s;

    static {
        l0.a("media3.exoplayer.hls");
    }

    public l(k0 k0Var, l2.h hVar, c cVar, ob.a aVar, n2.n nVar, rb.a aVar2, p2.c cVar2, long j3, boolean z10, int i10) {
        this.f14200s = k0Var;
        this.f14198q = k0Var.f1772c;
        this.f14190i = hVar;
        this.h = cVar;
        this.f14191j = aVar;
        this.f14192k = nVar;
        this.f14193l = aVar2;
        this.f14196o = cVar2;
        this.f14197p = j3;
        this.f14194m = z10;
        this.f14195n = i10;
    }

    public static p2.g u(long j3, List list) {
        p2.g gVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            p2.g gVar2 = (p2.g) list.get(i10);
            long j10 = gVar2.e;
            if (j10 <= j3 && gVar2.f39573w) {
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
        f0 f0Var = i10.f1771b;
        f0Var.getClass();
        f0 f0Var2 = k0Var.f1771b;
        if (f0Var2 != null && f0Var2.f1686a.equals(f0Var.f1686a) && f0Var2.e.equals(f0Var.e) && Objects.equals(f0Var2.f1688c, f0Var.f1688c) && i10.f1772c.equals(k0Var.f1772c)) {
            return true;
        }
        return false;
    }

    @Override
    public final u2.e0 c(g0 g0Var, y2.d dVar, long j3) {
        a5.a b10 = b(g0Var);
        n2.j jVar = new n2.j(this.d.f13736c, 0, g0Var);
        c0 c0Var = this.f14199r;
        j2.k kVar = this.f42270g;
        e2.d.h(kVar);
        return new k(this.h, this.f14196o, this.f14190i, c0Var, this.f14192k, jVar, this.f14193l, b10, dVar, this.f14191j, this.f14194m, this.f14195n, kVar);
    }

    @Override
    public final synchronized k0 i() {
        return this.f14200s;
    }

    @Override
    public final void k() {
        p2.c cVar = this.f14196o;
        y2.n nVar = cVar.h;
        if (nVar != null) {
            nVar.a();
        }
        Uri uri = cVar.v;
        if (uri != null) {
            p2.b bVar = (p2.b) cVar.d.get(uri);
            bVar.f39525b.a();
            IOException iOException = bVar.f39530s;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final void m(c0 c0Var) {
        boolean z10;
        this.f14199r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f42270g;
        e2.d.h(kVar);
        n2.n nVar = this.f14192k;
        nVar.C(myLooper, kVar);
        nVar.b();
        a5.a b10 = b(null);
        f0 f0Var = i().f1771b;
        f0Var.getClass();
        Uri uri = f0Var.f1686a;
        p2.c cVar = this.f14196o;
        cVar.getClass();
        cVar.f39536n = d0.o(null);
        cVar.f39535f = b10;
        cVar.f39537r = this;
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.q qVar = new y2.q(((g2.g) cVar.f39532a.f12721b).createDataSource(), new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, cVar.f39533b.J());
        if (cVar.h == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        y2.n nVar2 = new y2.n("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.h = nVar2;
        nVar2.f(qVar, cVar, cVar.f39534c.o3(qVar.f46450c));
    }

    @Override
    public final void o(u2.e0 e0Var) {
        q[] qVarArr;
        p[] pVarArr;
        k kVar = (k) e0Var;
        kVar.f14181b.e.remove(kVar);
        for (q qVar : kVar.J) {
            if (qVar.T) {
                for (p pVar : qVar.L) {
                    pVar.k();
                    n2.g gVar = pVar.h;
                    if (gVar != null) {
                        gVar.a(pVar.e);
                        pVar.h = null;
                        pVar.f42291g = null;
                    }
                }
            }
            i iVar = qVar.d;
            p2.b bVar = (p2.b) iVar.f14162g.d.get(iVar.e[iVar.f14172r.l()]);
            if (bVar != null) {
                bVar.v = false;
            }
            iVar.f14168n = null;
            qVar.f14231s.e(qVar);
            qVar.H.removeCallbacksAndMessages(null);
            qVar.X = true;
            qVar.I.clear();
        }
        kVar.G = null;
    }

    @Override
    public final void q() {
        p2.c cVar = this.f14196o;
        cVar.v = null;
        cVar.f39539w = null;
        cVar.f39538s = null;
        cVar.f39541y = -9223372036854775807L;
        cVar.h.e(null);
        cVar.h = null;
        HashMap hashMap = cVar.d;
        for (p2.b bVar : hashMap.values()) {
            bVar.f39525b.e(null);
        }
        cVar.f39536n.removeCallbacksAndMessages(null);
        cVar.f39536n = null;
        hashMap.clear();
        this.f14192k.release();
    }

    @Override
    public final synchronized void t(k0 k0Var) {
        this.f14200s = k0Var;
    }

    public final void v(p2.l lVar) {
        long j3;
        long j10;
        long j11;
        j1 j1Var;
        long j12;
        long j13;
        long j14;
        long j15;
        boolean z10;
        float f7;
        long j16;
        boolean z11;
        boolean z12 = lVar.f39599p;
        boolean z13 = lVar.f39591g;
        i0 i0Var = lVar.f39601r;
        long j17 = lVar.f39604u;
        long j18 = lVar.e;
        int i10 = lVar.d;
        long j19 = lVar.h;
        if (z12) {
            j3 = d0.e0(j19);
        } else {
            j3 = -9223372036854775807L;
        }
        if (i10 != 2 && i10 != 1) {
            j10 = -9223372036854775807L;
        } else {
            j10 = j3;
        }
        p2.c cVar = this.f14196o;
        cVar.f39538s.getClass();
        na.d dVar = new na.d(16);
        long j20 = 0;
        if (cVar.f39540x) {
            p2.k kVar = lVar.v;
            long j21 = j19 - cVar.f39541y;
            boolean z14 = lVar.f39598o;
            if (z14) {
                j12 = j21 + j17;
            } else {
                j12 = -9223372036854775807L;
            }
            if (lVar.f39599p) {
                j13 = d0.Q(d0.A(this.f14197p)) - (j19 + j17);
            } else {
                j13 = 0;
            }
            long j22 = this.f14198q.f1671a;
            if (j22 != -9223372036854775807L) {
                j15 = d0.Q(j22);
            } else {
                if (j18 != -9223372036854775807L) {
                    j14 = j17 - j18;
                } else {
                    j14 = kVar.d;
                    if (j14 == -9223372036854775807L || lVar.f39597n == -9223372036854775807L) {
                        j14 = kVar.f39589c;
                        if (j14 == -9223372036854775807L) {
                            j14 = 3 * lVar.f39596m;
                        }
                    }
                }
                j15 = j14 + j13;
            }
            long j23 = j17 + j13;
            long i11 = d0.i(j15, j13, j23);
            e0 e0Var = i().f1772c;
            if (e0Var.d == -3.4028235E38f && e0Var.e == -3.4028235E38f && kVar.f39589c == -9223372036854775807L && kVar.d == -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            b2.d0 d0Var = new b2.d0();
            d0Var.f1650a = d0.e0(i11);
            float f10 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = this.f14198q.d;
            }
            d0Var.d = f7;
            if (!z10) {
                f10 = this.f14198q.e;
            }
            d0Var.e = f10;
            e0 e0Var2 = new e0(d0Var);
            this.f14198q = e0Var2;
            if (j18 == -9223372036854775807L) {
                j18 = j23 - d0.Q(e0Var2.f1671a);
            }
            if (z13) {
                j20 = j18;
            } else {
                p2.g u10 = u(j18, lVar.f39602s);
                if (u10 != null) {
                    j16 = u10.e;
                } else if (!i0Var.isEmpty()) {
                    p2.i iVar = (p2.i) i0Var.get(d0.c(i0Var, Long.valueOf(j18), true));
                    p2.g u11 = u(j18, iVar.f39579x);
                    if (u11 != null) {
                        j16 = u11.e;
                    } else {
                        j16 = iVar.e;
                    }
                }
                j20 = j16;
            }
            if (i10 == 2 && lVar.f39590f) {
                z11 = true;
            } else {
                z11 = false;
            }
            j1Var = new j1(j10, j3, j12, lVar.f39604u, j21, j20, true, !z14, z11, dVar, i(), this.f14198q);
        } else {
            if (j18 != -9223372036854775807L && !i0Var.isEmpty()) {
                if (!z13 && j18 != j17) {
                    j18 = ((p2.i) i0Var.get(d0.c(i0Var, Long.valueOf(j18), true))).e;
                }
                j11 = j18;
            } else {
                j11 = 0;
            }
            long j24 = lVar.f39604u;
            j1Var = new j1(j10, j3, j24, j24, 0L, j11, true, false, true, dVar, i(), null);
        }
        n(j1Var);
    }
}
