package l2;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.a0;
import android.util.SparseArray;
import b2.j0;
import b2.k0;
import b2.p0;
import b2.q0;
import e2.l0;
import g2.c0;
import g2.d0;
import j$.util.Objects;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k2.m0;
import r2.y;
import u2.e0;
import u2.g0;
import u2.u;
import v7.t6;
public final class h extends u2.a {
    public y2.l A;
    public d0 B;
    public IOException C;
    public Handler D;
    public Uri E;
    public final Uri F;
    public m2.c G;
    public boolean H;
    public long I;
    public long J;
    public long K;
    public int L;
    public long M;
    public int N;
    public p0 O;
    public j0 P;
    public final boolean h;
    public final g2.g f11589i;
    public final a5.a f11590j;
    public final kb.a f11591k;
    public final n2.m f11592l;
    public final hb.a f11593m;
    public final xa.n f11594n;
    public final long f11595o;
    public final long f11596p;
    public final a5.a f11597q;
    public final y2.n f11598r;
    public final a4.l f11599s;
    public final Object f11600t;
    public final SparseArray f11601u;
    public final c v;
    public final c f11602w;
    public final f f11603x;
    public final y2.m f11604y;
    public g2.h f11605z;

    static {
        q0.a("media3.exoplayer.dash");
    }

    public h(p0 p0Var, g2.g gVar, y2.n nVar, a5.a aVar, kb.a aVar2, n2.m mVar, hb.a aVar3, long j10, long j11) {
        this.O = p0Var;
        this.P = p0Var.f2183c;
        k0 k0Var = p0Var.f2182b;
        k0Var.getClass();
        Uri uri = k0Var.f2091a;
        this.E = uri;
        this.F = uri;
        this.G = null;
        this.f11589i = gVar;
        this.f11598r = nVar;
        this.f11590j = aVar;
        this.f11592l = mVar;
        this.f11593m = aVar3;
        this.f11595o = j10;
        this.f11596p = j11;
        this.f11591k = aVar2;
        this.f11594n = new xa.n(5);
        this.h = false;
        this.f11597q = b(null);
        this.f11600t = new Object();
        this.f11601u = new SparseArray();
        this.f11603x = new f(this, 0);
        this.M = -9223372036854775807L;
        this.K = -9223372036854775807L;
        this.f11599s = new a4.l(this, 25);
        this.f11604y = new m0(this);
        this.v = new Runnable(this) {
            public final h f11576b;

            {
                this.f11576b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f11576b.C();
                        return;
                    default:
                        h hVar = this.f11576b;
                        hVar.getClass();
                        try {
                            hVar.z(false);
                            return;
                        } catch (Exception e) {
                            hVar.C = new IOException(e);
                            return;
                        }
                }
            }
        };
        this.f11602w = new Runnable(this) {
            public final h f11576b;

            {
                this.f11576b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f11576b.C();
                        return;
                    default:
                        h hVar = this.f11576b;
                        hVar.getClass();
                        try {
                            hVar.z(false);
                            return;
                        } catch (Exception e) {
                            hVar.C = new IOException(e);
                            return;
                        }
                }
            }
        };
    }

    public static boolean v(m2.h hVar) {
        List list = hVar.f12657c;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = ((m2.a) list.get(i10)).f12624b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    public final void A(c5.a aVar, y2.n nVar) {
        g2.h hVar = this.f11605z;
        Uri parse = Uri.parse(aVar.f3732c);
        Map map = Collections.EMPTY_MAP;
        t6.l(parse, "The uri must be set.");
        this.A.f(new y2.o(hVar, new g2.n(parse, 1, null, map, 0L, -1L, null, 1), 5, nVar), new d(this), 1);
    }

    public final synchronized void B(j0 j0Var) {
        this.P = j0Var;
    }

    public final void C() {
        Uri uri;
        this.D.removeCallbacks(this.v);
        if (this.A.c()) {
            return;
        }
        if (this.A.d()) {
            this.H = true;
            return;
        }
        synchronized (this.f11600t) {
            uri = this.E;
        }
        this.H = false;
        Map map = Collections.EMPTY_MAP;
        t6.l(uri, "The uri must be set.");
        y2.o oVar = new y2.o(this.f11605z, new g2.n(uri, 1, null, map, 0L, -1L, null, 1), 4, this.f11598r);
        a4.l lVar = this.f11599s;
        this.f11593m.getClass();
        this.A.f(oVar, lVar, 3);
    }

    @Override
    public final boolean a(p0 p0Var) {
        k0 k0Var = i().f2182b;
        k0Var.getClass();
        k0 k0Var2 = p0Var.f2182b;
        if (k0Var2 != null && k0Var2.f2091a.equals(k0Var.f2091a) && k0Var2.e.equals(k0Var.e) && Objects.equals(k0Var2.f2093c, k0Var.f2093c)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, a0 a0Var, long j10) {
        int intValue = ((Integer) g0Var.f49875a).intValue() - this.N;
        a5.a b10 = b(g0Var);
        n2.j jVar = new n2.j(this.d.f13463c, 0, g0Var);
        int i10 = this.N + intValue;
        m2.c cVar = this.G;
        d0 d0Var = this.B;
        long j11 = this.K;
        j2.l lVar = this.f49821g;
        lVar.getClass();
        b bVar = new b(i10, cVar, this.f11594n, intValue, this.f11590j, d0Var, this.f11592l, jVar, this.f11593m, b10, j11, this.f11604y, a0Var, this.f11591k, this.f11603x, lVar);
        this.f11601u.put(i10, bVar);
        return bVar;
    }

    @Override
    public final synchronized p0 i() {
        return this.O;
    }

    @Override
    public final void k() {
        this.f11604y.a();
    }

    @Override
    public final void m(d0 d0Var) {
        this.B = d0Var;
        Looper myLooper = Looper.myLooper();
        j2.l lVar = this.f49821g;
        lVar.getClass();
        n2.m mVar = this.f11592l;
        mVar.g(myLooper, lVar);
        mVar.a();
        if (this.h) {
            z(false);
            return;
        }
        this.f11605z = this.f11589i.createDataSource();
        this.A = new y2.l("DashMediaSource");
        this.D = l0.q(null);
        C();
    }

    @Override
    public final void o(e0 e0Var) {
        b bVar = (b) e0Var;
        p pVar = bVar.f11574y;
        pVar.f11636r = true;
        pVar.d.removeCallbacksAndMessages(null);
        for (v2.i iVar : bVar.H) {
            iVar.C(bVar);
        }
        bVar.G = null;
        this.f11601u.remove(bVar.f11565a);
    }

    @Override
    public final void q() {
        this.H = false;
        this.f11605z = null;
        y2.l lVar = this.A;
        if (lVar != null) {
            lVar.e(null);
            this.A = null;
        }
        j0 j0Var = i().f2183c;
        synchronized (this) {
            this.P = j0Var;
        }
        this.I = 0L;
        this.J = 0L;
        this.E = this.F;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.K = -9223372036854775807L;
        this.L = 0;
        this.M = -9223372036854775807L;
        this.f11601u.clear();
        xa.n nVar = this.f11594n;
        ((HashMap) nVar.f53554a).clear();
        ((HashMap) nVar.f53555b).clear();
        ((HashMap) nVar.f53556c).clear();
        this.f11592l.release();
    }

    @Override
    public final synchronized void t(p0 p0Var) {
        this.O = p0Var;
        this.P = p0Var.f2183c;
    }

    public final synchronized j0 u() {
        return this.P;
    }

    public final void w() {
        boolean z10;
        y2.l lVar = this.A;
        d dVar = new d(this);
        synchronized (z2.b.f54546b) {
            z10 = z2.b.f54547c;
        }
        if (z10) {
            dVar.a();
            return;
        }
        if (lVar == null) {
            lVar = new y2.l("SntpClient");
        }
        lVar.f(new jb.b(28), new y(dVar, 19), 1);
    }

    public final void x(y2.o oVar, long j10, long j11) {
        long j12 = oVar.f54167a;
        g2.n nVar = oVar.f54168b;
        c0 c0Var = oVar.d;
        u uVar = new u(nVar, c0Var.f7284c, c0Var.d, j10, j11, c0Var.f7283b);
        this.f11593m.getClass();
        this.f11597q.p(uVar, oVar.f54169c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void y(IOException iOException) {
        e2.a.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.K = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        z(true);
    }

    public final void z(boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: l2.h.z(boolean):void");
    }
}
