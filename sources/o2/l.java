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
    public final n4.l f16752i;
    public final na.d f16753j;
    public final n2.m f16754k;
    public final t7.t f16755l;
    public final boolean f16756m;
    public final int f16757n;
    public final p2.c f16758o;
    public final long f16759p;
    public e0 f16760q;
    public c0 f16761r;
    public k0 f16762s;

    static {
        l0.a("media3.exoplayer.hls");
    }

    public l(k0 k0Var, n4.l lVar, c cVar, na.d dVar, n2.m mVar, t7.t tVar, p2.c cVar2, long j3, boolean z10, int i10) {
        this.f16762s = k0Var;
        this.f16760q = k0Var.f3399c;
        this.f16752i = lVar;
        this.h = cVar;
        this.f16753j = dVar;
        this.f16754k = mVar;
        this.f16755l = tVar;
        this.f16758o = cVar2;
        this.f16759p = j3;
        this.f16756m = z10;
        this.f16757n = i10;
    }

    public static p2.g u(long j3, List list) {
        p2.g gVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            p2.g gVar2 = (p2.g) list.get(i10);
            long j10 = gVar2.f45114e;
            if (j10 <= j3 && gVar2.f45104w) {
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
        f0 f0Var = i10.f3398b;
        f0Var.getClass();
        f0 f0Var2 = k0Var.f3398b;
        if (f0Var2 != null && f0Var2.f3303a.equals(f0Var.f3303a) && f0Var2.f3306e.equals(f0Var.f3306e) && Objects.equals(f0Var2.f3305c, f0Var.f3305c) && i10.f3399c.equals(k0Var.f3399c)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(u2.f0 f0Var, y2.d dVar, long j3) {
        a5.a b10 = b(f0Var);
        n2.j jVar = new n2.j(this.d.f16269c, 0, f0Var);
        c0 c0Var = this.f16761r;
        j2.k kVar = this.f48753g;
        e2.d.h(kVar);
        return new k(this.h, this.f16758o, this.f16752i, c0Var, this.f16754k, jVar, this.f16755l, b10, dVar, this.f16753j, this.f16756m, this.f16757n, kVar);
    }

    @Override
    public final synchronized k0 i() {
        return this.f16762s;
    }

    @Override
    public final void k() {
        p2.c cVar = this.f16758o;
        y2.l lVar = cVar.h;
        if (lVar != null) {
            lVar.a();
        }
        Uri uri = cVar.v;
        if (uri != null) {
            p2.b bVar = (p2.b) cVar.d.get(uri);
            bVar.f45052b.a();
            IOException iOException = bVar.f45058s;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final void m(c0 c0Var) {
        boolean z10;
        this.f16761r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f48753g;
        e2.d.h(kVar);
        n2.m mVar = this.f16754k;
        mVar.D(myLooper, kVar);
        mVar.b();
        a5.a b10 = b(null);
        f0 f0Var = i().f3398b;
        f0Var.getClass();
        Uri uri = f0Var.f3303a;
        p2.c cVar = this.f16758o;
        cVar.getClass();
        cVar.f45065n = e2.d0.o(null);
        cVar.f45064f = b10;
        cVar.f45066r = this;
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.o oVar = new y2.o(((g2.g) cVar.f45060a.f16326a).createDataSource(), new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, cVar.f45061b.y());
        if (cVar.h == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        y2.l lVar = new y2.l("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.h = lVar;
        lVar.f(oVar, cVar, cVar.f45062c.J(oVar.f51933c));
    }

    @Override
    public final void o(d0 d0Var) {
        q[] qVarArr;
        p[] pVarArr;
        k kVar = (k) d0Var;
        kVar.f16742b.f45063e.remove(kVar);
        for (q qVar : kVar.J) {
            if (qVar.T) {
                for (p pVar : qVar.L) {
                    pVar.k();
                    n2.g gVar = pVar.h;
                    if (gVar != null) {
                        gVar.a(pVar.f48982e);
                        pVar.h = null;
                        pVar.f48984g = null;
                    }
                }
            }
            i iVar = qVar.d;
            p2.b bVar = (p2.b) iVar.f16723g.d.get(iVar.f16721e[iVar.f16733r.l()]);
            if (bVar != null) {
                bVar.v = false;
            }
            iVar.f16729n = null;
            qVar.f16795s.e(qVar);
            qVar.H.removeCallbacksAndMessages(null);
            qVar.X = true;
            qVar.I.clear();
        }
        kVar.G = null;
    }

    @Override
    public final void q() {
        p2.c cVar = this.f16758o;
        cVar.v = null;
        cVar.f45068w = null;
        cVar.f45067s = null;
        cVar.f45070y = -9223372036854775807L;
        cVar.h.e(null);
        cVar.h = null;
        HashMap hashMap = cVar.d;
        for (p2.b bVar : hashMap.values()) {
            bVar.f45052b.e(null);
        }
        cVar.f45065n.removeCallbacksAndMessages(null);
        cVar.f45065n = null;
        hashMap.clear();
        this.f16754k.release();
    }

    @Override
    public final synchronized void t(k0 k0Var) {
        this.f16762s = k0Var;
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
        boolean z13 = lVar.f45133p;
        boolean z14 = lVar.f45125g;
        i0 i0Var = lVar.f45135r;
        long j17 = lVar.f45138u;
        long j18 = lVar.f45123e;
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
        p2.c cVar = this.f16758o;
        cVar.f45067s.getClass();
        ?? obj = new Object();
        long j20 = 0;
        if (cVar.f45069x) {
            p2.k kVar = lVar.v;
            long j21 = j19 - cVar.f45070y;
            boolean z15 = lVar.f45132o;
            if (z15) {
                j12 = j21 + j17;
            } else {
                j12 = -9223372036854775807L;
            }
            if (lVar.f45133p) {
                z10 = z14;
                j13 = e2.d0.P(e2.d0.z(this.f16759p)) - (j19 + j17);
            } else {
                z10 = z14;
                j13 = 0;
            }
            long j22 = this.f16760q.f3286a;
            if (j22 != -9223372036854775807L) {
                j15 = e2.d0.P(j22);
            } else {
                if (j18 != -9223372036854775807L) {
                    j14 = j17 - j18;
                } else {
                    j14 = kVar.d;
                    if (j14 == -9223372036854775807L || lVar.f45131n == -9223372036854775807L) {
                        j14 = kVar.f45121c;
                        if (j14 == -9223372036854775807L) {
                            j14 = 3 * lVar.f45130m;
                        }
                    }
                }
                j15 = j14 + j13;
            }
            long j23 = j17 + j13;
            long i11 = e2.d0.i(j15, j13, j23);
            e0 e0Var = i().f3399c;
            if (e0Var.d == -3.4028235E38f && e0Var.f3289e == -3.4028235E38f && kVar.f45121c == -9223372036854775807L && kVar.d == -9223372036854775807L) {
                z11 = true;
            } else {
                z11 = false;
            }
            b2.d0 d0Var = new b2.d0();
            d0Var.f3262a = e2.d0.d0(i11);
            float f10 = 1.0f;
            if (z11) {
                f7 = 1.0f;
            } else {
                f7 = this.f16760q.d;
            }
            d0Var.d = f7;
            if (!z11) {
                f10 = this.f16760q.f3289e;
            }
            d0Var.f3265e = f10;
            e0 e0Var2 = new e0(d0Var);
            this.f16760q = e0Var2;
            if (j18 == -9223372036854775807L) {
                j18 = j23 - e2.d0.P(e0Var2.f3286a);
            }
            if (z10) {
                j20 = j18;
            } else {
                p2.g u10 = u(j18, lVar.f45136s);
                if (u10 != null) {
                    j16 = u10.f45114e;
                } else if (!i0Var.isEmpty()) {
                    p2.i iVar = (p2.i) i0Var.get(e2.d0.c(i0Var, Long.valueOf(j18), true));
                    p2.g u11 = u(j18, iVar.f45110x);
                    if (u11 != null) {
                        j16 = u11.f45114e;
                    } else {
                        j16 = iVar.f45114e;
                    }
                }
                j20 = j16;
            }
            if (i10 == 2 && lVar.f45124f) {
                z12 = true;
            } else {
                z12 = false;
            }
            g1Var = new g1(j10, j3, j12, lVar.f45138u, j21, j20, true, !z15, z12, obj, i(), this.f16760q);
        } else {
            if (j18 != -9223372036854775807L && !i0Var.isEmpty()) {
                if (!z14 && j18 != j17) {
                    j18 = ((p2.i) i0Var.get(e2.d0.c(i0Var, Long.valueOf(j18), true))).f45114e;
                }
                j11 = j18;
            } else {
                j11 = 0;
            }
            long j24 = lVar.f45138u;
            g1Var = new g1(j10, j3, j24, j24, 0L, j11, true, false, true, obj, i(), null);
        }
        n(g1Var);
    }
}
