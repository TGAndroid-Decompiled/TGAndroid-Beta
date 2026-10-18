package o2;

import android.net.Uri;
import android.os.Looper;
import b2.h0;
import b2.i0;
import b2.j0;
import b2.o0;
import b2.p0;
import b2.w0;
import e2.m0;
import e9.n0;
import g2.c0;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import t7.u;
import u2.d0;
import u2.f0;
import u2.i1;
import v7.u6;
public final class l extends u2.a {
    public final c h;
    public final l2.f f17619i;
    public final oa.d f17620j;
    public final n2.n f17621k;
    public final oa.d f17622l;
    public final boolean f17623m;
    public final int f17624n;
    public final p2.e f17625o;
    public final long f17626p;
    public i0 f17627q;
    public c0 f17628r;
    public o0 f17629s;

    static {
        p0.a("media3.exoplayer.hls");
    }

    public l(o0 o0Var, l2.f fVar, c cVar, oa.d dVar, n2.n nVar, oa.d dVar2, p2.e eVar, long j10, boolean z10, int i10) {
        this.f17629s = o0Var;
        this.f17627q = o0Var.f3892c;
        this.f17619i = fVar;
        this.h = cVar;
        this.f17620j = dVar;
        this.f17621k = nVar;
        this.f17622l = dVar2;
        this.f17625o = eVar;
        this.f17626p = j10;
        this.f17623m = z10;
        this.f17624n = i10;
    }

    public static p2.i u(long j10, List list) {
        p2.i iVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            p2.i iVar2 = (p2.i) list.get(i10);
            long j11 = iVar2.e;
            if (j11 <= j10 && iVar2.f44023w) {
                iVar = iVar2;
            } else if (j11 > j10) {
                break;
            }
        }
        return iVar;
    }

    @Override
    public final boolean a(o0 o0Var) {
        o0 i10 = i();
        j0 j0Var = i10.f3891b;
        j0Var.getClass();
        j0 j0Var2 = o0Var.f3891b;
        if (j0Var2 != null && j0Var2.f3801a.equals(j0Var.f3801a) && j0Var2.e.equals(j0Var.e) && Objects.equals(j0Var2.f3803c, j0Var.f3803c) && i10.f3892c.equals(o0Var.f3892c)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, androidx.biometric.e eVar, long j10) {
        a5.a b10 = b(f0Var);
        n2.k kVar = new n2.k(this.d.f17062c, 0, f0Var);
        c0 c0Var = this.f17628r;
        j2.k kVar2 = this.f47295g;
        kVar2.getClass();
        return new k(this.h, this.f17625o, this.f17619i, c0Var, this.f17621k, kVar, this.f17622l, b10, eVar, this.f17620j, this.f17623m, this.f17624n, kVar2);
    }

    @Override
    public final synchronized o0 i() {
        return this.f17629s;
    }

    @Override
    public final void k() {
        p2.e eVar = this.f17625o;
        y2.l lVar = eVar.h;
        if (lVar != null) {
            lVar.a();
        }
        w0 w0Var = eVar.v;
        if (w0Var == null) {
            Uri uri = eVar.F;
            if (uri != null) {
                eVar.h(uri);
                return;
            }
            return;
        }
        throw w0Var;
    }

    @Override
    public final void m(c0 c0Var) {
        boolean z10;
        this.f17628r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f47295g;
        kVar.getClass();
        n2.n nVar = this.f17621k;
        nVar.E(myLooper, kVar);
        nVar.b();
        a5.a b10 = b(null);
        j0 j0Var = i().f3891b;
        j0Var.getClass();
        Uri uri = j0Var.f3801a;
        p2.e eVar = this.f17625o;
        eVar.getClass();
        eVar.f43980n = m0.q(null);
        eVar.f43979f = b10;
        eVar.f43981r = this;
        Map map = Collections.EMPTY_MAP;
        u6.l(uri, "The uri must be set.");
        y2.o oVar = new y2.o(((g2.g) eVar.f43976a.f15844b).createDataSource(), new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, eVar.f43977b.J());
        if (eVar.h == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        y2.l lVar = new y2.l("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        eVar.h = lVar;
        lVar.f(oVar, eVar, eVar.f43978c.y3(oVar.f49977c));
    }

    @Override
    public final void o(d0 d0Var) {
        q[] qVarArr;
        p[] pVarArr;
        k kVar = (k) d0Var;
        kVar.f17610b.e.remove(kVar);
        for (q qVar : kVar.J) {
            if (qVar.T) {
                for (p pVar : qVar.L) {
                    pVar.l();
                    n2.h hVar = pVar.h;
                    if (hVar != null) {
                        hVar.a(pVar.e);
                        pVar.h = null;
                        pVar.f47313g = null;
                    }
                }
            }
            i iVar = qVar.d;
            int l4 = iVar.f17601r.l();
            p2.e eVar = iVar.f17591g;
            Uri c10 = iVar.e[l4].c();
            p2.d dVar = (p2.d) eVar.d.get(c10);
            if (dVar != null) {
                p2.c cVar = (p2.c) i2.d.i(dVar.f43974b, c10, c10);
                cVar.getClass();
                cVar.f43971w = false;
            }
            iVar.f17597n = null;
            qVar.f17661s.e(qVar);
            qVar.H.removeCallbacksAndMessages(null);
            qVar.X = true;
            qVar.I.clear();
        }
        kVar.G = null;
    }

    @Override
    public final void q() {
        p2.e eVar = this.f17625o;
        eVar.F = null;
        eVar.G = null;
        eVar.f43982s = null;
        eVar.f43983w = null;
        eVar.f43984x = null;
        eVar.f43985y = null;
        eVar.E = null;
        eVar.v = null;
        eVar.I = -9223372036854775807L;
        eVar.h.e(null);
        eVar.h = null;
        HashMap hashMap = eVar.d;
        for (p2.d dVar : hashMap.values()) {
            for (p2.c cVar : dVar.f43974b.values()) {
                cVar.f43966c.e(null);
            }
        }
        eVar.f43980n.removeCallbacksAndMessages(null);
        eVar.f43980n = null;
        hashMap.clear();
        this.f17621k.release();
    }

    @Override
    public final synchronized void t(o0 o0Var) {
        this.f17629s = o0Var;
    }

    public final void v(p2.n nVar) {
        long j10;
        long j11;
        long j12;
        i1 i1Var;
        long j13;
        long j14;
        long j15;
        long j16;
        boolean z10;
        float f7;
        long j17;
        boolean z11;
        boolean z12 = nVar.f44049p;
        boolean z13 = nVar.f44041g;
        n0 n0Var = nVar.f44051r;
        long j18 = nVar.f44054u;
        long j19 = nVar.e;
        int i10 = nVar.d;
        long j20 = nVar.h;
        if (z12) {
            j10 = m0.h0(j20);
        } else {
            j10 = -9223372036854775807L;
        }
        if (i10 != 2 && i10 != 1) {
            j11 = -9223372036854775807L;
        } else {
            j11 = j10;
        }
        p2.e eVar = this.f17625o;
        eVar.f43982s.getClass();
        u uVar = new u(14);
        long j21 = 0;
        if (eVar.H) {
            p2.m mVar = nVar.v;
            long j22 = j20 - eVar.I;
            boolean z14 = nVar.f44048o;
            if (z14) {
                j13 = j22 + j18;
            } else {
                j13 = -9223372036854775807L;
            }
            if (nVar.f44049p) {
                j14 = m0.S(m0.C(this.f17626p)) - (j20 + j18);
            } else {
                j14 = 0;
            }
            long j23 = this.f17627q.f3785a;
            if (j23 != -9223372036854775807L) {
                j16 = m0.S(j23);
            } else {
                if (j19 != -9223372036854775807L) {
                    j15 = j18 - j19;
                } else {
                    j15 = mVar.d;
                    if (j15 == -9223372036854775807L || nVar.f44047n == -9223372036854775807L) {
                        j15 = mVar.f44039c;
                        if (j15 == -9223372036854775807L) {
                            j15 = 3 * nVar.f44046m;
                        }
                    }
                }
                j16 = j15 + j14;
            }
            long j24 = j18 + j14;
            long j25 = m0.j(j16, j14, j24);
            i0 i0Var = i().f3892c;
            if (i0Var.d == -3.4028235E38f && i0Var.e == -3.4028235E38f && mVar.f44039c == -9223372036854775807L && mVar.d == -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            h0 a2 = this.f17627q.a();
            a2.f3774a = m0.h0(j25);
            float f10 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = this.f17627q.d;
            }
            a2.d = f7;
            if (!z10) {
                f10 = this.f17627q.e;
            }
            a2.e = f10;
            i0 i0Var2 = new i0(a2);
            this.f17627q = i0Var2;
            if (j19 == -9223372036854775807L) {
                j19 = j24 - m0.S(i0Var2.f3785a);
            }
            if (z13) {
                j21 = j19;
            } else {
                p2.i u10 = u(j19, nVar.f44052s);
                if (u10 != null) {
                    j17 = u10.e;
                } else if (!n0Var.isEmpty()) {
                    p2.k kVar = (p2.k) n0Var.get(m0.d(n0Var, Long.valueOf(j19), true));
                    p2.i u11 = u(j19, kVar.f44029x);
                    if (u11 != null) {
                        j17 = u11.e;
                    } else {
                        j17 = kVar.e;
                    }
                }
                j21 = j17;
            }
            if (i10 == 2 && nVar.f44040f) {
                z11 = true;
            } else {
                z11 = false;
            }
            i1Var = new i1(j11, j10, j13, nVar.f44054u, j22, j21, true, !z14, z11, uVar, i(), this.f17627q);
        } else {
            if (j19 != -9223372036854775807L && !n0Var.isEmpty()) {
                if (!z13 && j19 != j18) {
                    j19 = ((p2.k) n0Var.get(m0.d(n0Var, Long.valueOf(j19), true))).e;
                }
                j12 = j19;
            } else {
                j12 = 0;
            }
            long j26 = nVar.f44054u;
            i1Var = new i1(j11, j10, j26, j26, 0L, j12, true, false, true, uVar, i(), null);
        }
        n(i1Var);
    }
}
