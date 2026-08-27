package o4;

import android.net.Uri;
import android.os.Looper;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.t0;
import com.google.android.exoplayer2.upstream.y0;
import h3.b1;
import h3.c1;
import h3.f1;
import h3.r0;
import j4.c0;
import j4.g0;
import j4.h1;
import j4.z;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class m extends j4.a {
    public final j h;

    public final c1 f19237i;

    public final m5.o f19238j;

    public final za.b f19239k;

    public final l3.j f19240l;

    public final ab.a f19241m;

    public final boolean f19242n;

    public final int f19243o;

    public final p4.c f19244p;

    public final long f19245q;

    public final f1 f19246r;

    public b1 f19247s;

    public y0 f19248t;

    static {
        r0.a("goog.exo.hls");
    }

    public m(f1 f1Var, m5.o oVar, c cVar, za.b bVar, l3.j jVar, ab.a aVar, p4.c cVar2, long j10, boolean z10, int i10) {
        c1 c1Var = f1Var.f7830b;
        c1Var.getClass();
        this.f19237i = c1Var;
        this.f19246r = f1Var;
        this.f19247s = f1Var.f7831c;
        this.f19238j = oVar;
        this.h = cVar;
        this.f19239k = bVar;
        this.f19240l = jVar;
        this.f19241m = aVar;
        this.f19244p = cVar2;
        this.f19245q = j10;
        this.f19242n = z10;
        this.f19243o = i10;
    }

    public static p4.e s(long j10, List list) {
        p4.e eVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            p4.e eVar2 = (p4.e) list.get(i10);
            long j11 = eVar2.f45390e;
            if (j11 > j10 || !eVar2.f45380w) {
                if (j11 > j10) {
                    break;
                }
            } else {
                eVar = eVar2;
            }
        }
        return eVar;
    }

    @Override
    public final z b(c0 c0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        g0 g0VarA = a(c0Var);
        b6.a aVar = new b6.a((CopyOnWriteArrayList) this.d.d, 0, c0Var, 14);
        y0 y0Var = this.f19248t;
        i3.k kVar = this.f12502g;
        d5.a.j(kVar);
        return new l(this.h, this.f19244p, this.f19238j, y0Var, this.f19240l, aVar, this.f19241m, g0VarA, rVar, this.f19239k, this.f19242n, this.f19243o, kVar);
    }

    @Override
    public final f1 h() {
        return this.f19246r;
    }

    @Override
    public final void j() throws IOException {
        p4.c cVar = this.f19244p;
        q0 q0Var = cVar.h;
        if (q0Var != null) {
            q0Var.a();
        }
        Uri uri = cVar.v;
        if (uri != null) {
            p4.b bVar = (p4.b) cVar.d.get(uri);
            bVar.f45362b.a();
            IOException iOException = bVar.f45368s;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final void l(y0 y0Var) {
        this.f19248t = y0Var;
        l3.j jVar = this.f19240l;
        jVar.a();
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        i3.k kVar = this.f12502g;
        d5.a.j(kVar);
        jVar.w(looperMyLooper, kVar);
        g0 g0VarA = a(null);
        Uri uri = this.f19237i.f7795a;
        p4.c cVar = this.f19244p;
        cVar.getClass();
        cVar.f45374n = d5.g0.k(null);
        cVar.f45373f = g0VarA;
        cVar.f45375r = this;
        t0 t0Var = new t0(((com.google.android.exoplayer2.upstream.l) cVar.f45369a.f17823b).createDataSource(), uri, 4, cVar.f45370b.U1());
        d5.a.i(cVar.h == null);
        q0 q0Var = new q0("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.h = q0Var;
        ab.a aVar = cVar.f45371c;
        int i10 = t0Var.f3045c;
        q0Var.f(t0Var, cVar, aVar.z3(i10));
        g0VarA.k(new j4.p(t0Var.f3044b), i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final void n(z zVar) {
        l lVar = (l) zVar;
        lVar.f19227b.f45372e.remove(lVar);
        for (r rVar : lVar.F) {
            if (rVar.P) {
                for (q qVar : rVar.H) {
                    qVar.i();
                    l3.f fVar = qVar.h;
                    if (fVar != null) {
                        fVar.h(qVar.f12510e);
                        qVar.h = null;
                        qVar.f12512g = null;
                    }
                }
            }
            rVar.f19278s.e(rVar);
            rVar.D.removeCallbacksAndMessages(null);
            rVar.T = true;
            rVar.E.clear();
        }
        lVar.C = null;
    }

    @Override
    public final void p() {
        p4.c cVar = this.f19244p;
        cVar.v = null;
        cVar.f45377w = null;
        cVar.f45376s = null;
        cVar.f45379y = -9223372036854775807L;
        cVar.h.e(null);
        cVar.h = null;
        HashMap map = cVar.d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((p4.b) it.next()).f45362b.e(null);
        }
        cVar.f45374n.removeCallbacksAndMessages(null);
        cVar.f45374n = null;
        map.clear();
        this.f19240l.release();
    }

    public final void t(p4.j jVar) {
        long j10;
        h1 h1Var;
        long j11;
        long jH;
        long j12;
        boolean z10 = jVar.f45409p;
        boolean z11 = jVar.f45401g;
        p8.z zVar = jVar.f45411r;
        long j13 = jVar.f45414u;
        long jH2 = jVar.f45399e;
        int i10 = jVar.d;
        long j14 = jVar.h;
        long jS = z10 ? d5.g0.S(j14) : -9223372036854775807L;
        long j15 = (i10 == 2 || i10 == 1) ? jS : -9223372036854775807L;
        p4.c cVar = this.f19244p;
        p4.m mVar = cVar.f45376s;
        mVar.getClass();
        c cVar2 = new c();
        new p4.d(mVar.f45432a, mVar.f45433b, mVar.f45424e, mVar.f45425f, mVar.f45426g, mVar.h, mVar.f45427i, mVar.f45428j, mVar.f45429k, mVar.f45434c, mVar.f45430l, mVar.f45431m);
        if (cVar.f45378x) {
            p4.i iVar = jVar.v;
            long j16 = j14 - cVar.f45379y;
            boolean z12 = jVar.f45408o;
            long j17 = z12 ? j16 + j13 : -9223372036854775807L;
            long jH3 = jVar.f45409p ? d5.g0.H(d5.g0.t(this.f19245q)) - (j14 + j13) : 0L;
            long j18 = this.f19247s.f7782a;
            if (j18 != -9223372036854775807L) {
                jH = d5.g0.H(j18);
            } else {
                if (jH2 != -9223372036854775807L) {
                    j11 = j13 - jH2;
                } else {
                    j11 = iVar.d;
                    if (j11 == -9223372036854775807L || jVar.f45407n == -9223372036854775807L) {
                        j11 = iVar.f45397c;
                        if (j11 == -9223372036854775807L) {
                            j11 = 3 * jVar.f45406m;
                        }
                    }
                }
                jH = j11 + jH3;
            }
            long j19 = j13 + jH3;
            long jI = d5.g0.i(jH, jH3, j19);
            b1 b1Var = this.f19246r.f7831c;
            boolean z13 = b1Var.d == -3.4028235E38f && b1Var.f7785e == -3.4028235E38f && iVar.f45397c == -9223372036854775807L && iVar.d == -9223372036854775807L;
            long jS2 = d5.g0.S(jI);
            this.f19247s = new b1(jS2, -9223372036854775807L, -9223372036854775807L, z13 ? 1.0f : this.f19247s.d, z13 ? 1.0f : this.f19247s.f7785e);
            if (jH2 == -9223372036854775807L) {
                jH2 = j19 - d5.g0.H(jS2);
            }
            if (z11) {
                j12 = jH2;
            } else {
                p4.e eVarS = s(jH2, jVar.f45412s);
                if (eVarS != null) {
                    j12 = eVarS.f45390e;
                } else if (zVar.isEmpty()) {
                    j12 = 0;
                } else {
                    p4.g gVar = (p4.g) zVar.get(d5.g0.c(zVar, Long.valueOf(jH2), true));
                    p4.e eVarS2 = s(jH2, gVar.f45386x);
                    j12 = eVarS2 != null ? eVarS2.f45390e : gVar.f45390e;
                }
            }
            h1Var = new h1(j15, jS, j17, jVar.f45414u, j16, j12, true, !z12, i10 == 2 && jVar.f45400f, cVar2, this.f19246r, this.f19247s);
        } else {
            if (jH2 == -9223372036854775807L || zVar.isEmpty()) {
                j10 = 0;
            } else {
                if (!z11 && jH2 != j13) {
                    jH2 = ((p4.g) zVar.get(d5.g0.c(zVar, Long.valueOf(jH2), true))).f45390e;
                }
                j10 = jH2;
            }
            long j20 = jVar.f45414u;
            h1Var = new h1(j15, jS, j20, j20, 0L, j10, true, false, true, cVar2, this.f19246r, null);
        }
        m(h1Var);
    }
}
