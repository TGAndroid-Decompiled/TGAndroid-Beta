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
    public final n4.l f16751i;
    public final na.d f16752j;
    public final n2.m f16753k;
    public final t7.t f16754l;
    public final boolean f16755m;
    public final int f16756n;
    public final p2.d f16757o;
    public final long f16758p;
    public e0 f16759q;
    public c0 f16760r;
    public k0 f16761s;

    static {
        l0.a("media3.exoplayer.hls");
    }

    public l(k0 k0Var, n4.l lVar, c cVar, na.d dVar, n2.m mVar, t7.t tVar, p2.d dVar2, long j3, boolean z10, int i10) {
        this.f16761s = k0Var;
        this.f16759q = k0Var.f3399c;
        this.f16751i = lVar;
        this.h = cVar;
        this.f16752j = dVar;
        this.f16753k = mVar;
        this.f16754l = tVar;
        this.f16757o = dVar2;
        this.f16758p = j3;
        this.f16755m = z10;
        this.f16756n = i10;
    }

    public static p2.h u(long j3, List list) {
        p2.h hVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            p2.h hVar2 = (p2.h) list.get(i10);
            long j10 = hVar2.f45109e;
            if (j10 <= j3 && hVar2.f45099w) {
                hVar = hVar2;
            } else if (j10 > j3) {
                break;
            }
        }
        return hVar;
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
        n2.j jVar = new n2.j(this.d.f16268c, 0, f0Var);
        c0 c0Var = this.f16760r;
        j2.k kVar = this.f48745g;
        e2.d.h(kVar);
        return new k(this.h, this.f16757o, this.f16751i, c0Var, this.f16753k, jVar, this.f16754l, b10, dVar, this.f16752j, this.f16755m, this.f16756n, kVar);
    }

    @Override
    public final synchronized k0 i() {
        return this.f16761s;
    }

    @Override
    public final void k() {
        p2.d dVar = this.f16757o;
        y2.l lVar = dVar.h;
        if (lVar != null) {
            lVar.a();
        }
        Uri uri = dVar.v;
        if (uri != null) {
            p2.c cVar = (p2.c) dVar.d.get(uri);
            cVar.f45047b.a();
            IOException iOException = cVar.f45053s;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final void m(c0 c0Var) {
        boolean z10;
        this.f16760r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f48745g;
        e2.d.h(kVar);
        n2.m mVar = this.f16753k;
        mVar.D(myLooper, kVar);
        mVar.b();
        a5.a b10 = b(null);
        f0 f0Var = i().f3398b;
        f0Var.getClass();
        Uri uri = f0Var.f3303a;
        p2.d dVar = this.f16757o;
        dVar.getClass();
        dVar.f45060n = e2.d0.o(null);
        dVar.f45059f = b10;
        dVar.f45061r = this;
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.o oVar = new y2.o(((g2.g) dVar.f45055a.f16325a).createDataSource(), new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, dVar.f45056b.y());
        if (dVar.h == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        y2.l lVar = new y2.l("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        dVar.h = lVar;
        lVar.f(oVar, dVar, dVar.f45057c.J(oVar.f51925c));
    }

    @Override
    public final void o(d0 d0Var) {
        q[] qVarArr;
        p[] pVarArr;
        k kVar = (k) d0Var;
        kVar.f16741b.f45058e.remove(kVar);
        for (q qVar : kVar.J) {
            if (qVar.T) {
                for (p pVar : qVar.L) {
                    pVar.k();
                    n2.g gVar = pVar.h;
                    if (gVar != null) {
                        gVar.a(pVar.f48974e);
                        pVar.h = null;
                        pVar.f48976g = null;
                    }
                }
            }
            i iVar = qVar.d;
            p2.c cVar = (p2.c) iVar.f16722g.d.get(iVar.f16720e[iVar.f16732r.l()]);
            if (cVar != null) {
                cVar.v = false;
            }
            iVar.f16728n = null;
            qVar.f16794s.e(qVar);
            qVar.H.removeCallbacksAndMessages(null);
            qVar.X = true;
            qVar.I.clear();
        }
        kVar.G = null;
    }

    @Override
    public final void q() {
        p2.d dVar = this.f16757o;
        dVar.v = null;
        dVar.f45063w = null;
        dVar.f45062s = null;
        dVar.f45065y = -9223372036854775807L;
        dVar.h.e(null);
        dVar.h = null;
        HashMap hashMap = dVar.d;
        for (p2.c cVar : hashMap.values()) {
            cVar.f45047b.e(null);
        }
        dVar.f45060n.removeCallbacksAndMessages(null);
        dVar.f45060n = null;
        hashMap.clear();
        this.f16753k.release();
    }

    @Override
    public final synchronized void t(k0 k0Var) {
        this.f16761s = k0Var;
    }

    public final void v(p2.m mVar) {
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
        boolean z13 = mVar.f45128p;
        boolean z14 = mVar.f45120g;
        i0 i0Var = mVar.f45130r;
        long j17 = mVar.f45133u;
        long j18 = mVar.f45118e;
        int i10 = mVar.d;
        long j19 = mVar.h;
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
        p2.d dVar = this.f16757o;
        dVar.f45062s.getClass();
        ?? obj = new Object();
        long j20 = 0;
        if (dVar.f45064x) {
            p2.l lVar = mVar.v;
            long j21 = j19 - dVar.f45065y;
            boolean z15 = mVar.f45127o;
            if (z15) {
                j12 = j21 + j17;
            } else {
                j12 = -9223372036854775807L;
            }
            if (mVar.f45128p) {
                z10 = z14;
                j13 = e2.d0.P(e2.d0.z(this.f16758p)) - (j19 + j17);
            } else {
                z10 = z14;
                j13 = 0;
            }
            long j22 = this.f16759q.f3286a;
            if (j22 != -9223372036854775807L) {
                j15 = e2.d0.P(j22);
            } else {
                if (j18 != -9223372036854775807L) {
                    j14 = j17 - j18;
                } else {
                    j14 = lVar.d;
                    if (j14 == -9223372036854775807L || mVar.f45126n == -9223372036854775807L) {
                        j14 = lVar.f45116c;
                        if (j14 == -9223372036854775807L) {
                            j14 = 3 * mVar.f45125m;
                        }
                    }
                }
                j15 = j14 + j13;
            }
            long j23 = j17 + j13;
            long i11 = e2.d0.i(j15, j13, j23);
            e0 e0Var = i().f3399c;
            if (e0Var.d == -3.4028235E38f && e0Var.f3289e == -3.4028235E38f && lVar.f45116c == -9223372036854775807L && lVar.d == -9223372036854775807L) {
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
                f7 = this.f16759q.d;
            }
            d0Var.d = f7;
            if (!z11) {
                f10 = this.f16759q.f3289e;
            }
            d0Var.f3265e = f10;
            e0 e0Var2 = new e0(d0Var);
            this.f16759q = e0Var2;
            if (j18 == -9223372036854775807L) {
                j18 = j23 - e2.d0.P(e0Var2.f3286a);
            }
            if (z10) {
                j20 = j18;
            } else {
                p2.h u10 = u(j18, mVar.f45131s);
                if (u10 != null) {
                    j16 = u10.f45109e;
                } else if (!i0Var.isEmpty()) {
                    p2.j jVar = (p2.j) i0Var.get(e2.d0.c(i0Var, Long.valueOf(j18), true));
                    p2.h u11 = u(j18, jVar.f45105x);
                    if (u11 != null) {
                        j16 = u11.f45109e;
                    } else {
                        j16 = jVar.f45109e;
                    }
                }
                j20 = j16;
            }
            if (i10 == 2 && mVar.f45119f) {
                z12 = true;
            } else {
                z12 = false;
            }
            g1Var = new g1(j10, j3, j12, mVar.f45133u, j21, j20, true, !z15, z12, obj, i(), this.f16759q);
        } else {
            if (j18 != -9223372036854775807L && !i0Var.isEmpty()) {
                if (!z14 && j18 != j17) {
                    j18 = ((p2.j) i0Var.get(e2.d0.c(i0Var, Long.valueOf(j18), true))).f45109e;
                }
                j11 = j18;
            } else {
                j11 = 0;
            }
            long j24 = mVar.f45133u;
            g1Var = new g1(j10, j3, j24, j24, 0L, j11, true, false, true, obj, i(), null);
        }
        n(g1Var);
    }
}
