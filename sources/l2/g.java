package l2;

import a8.h0;
import a8.ng;
import a8.yb;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import b2.j0;
import b2.k0;
import b2.p0;
import b2.q0;
import e2.n0;
import g2.b0;
import g2.c0;
import j$.util.Objects;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jg.s0;
import li.e3;
import m2.t;
import u2.e0;
import u2.g0;
import u2.u;
import u7.s;
public final class g extends u2.a {
    public y2.l A;
    public c0 B;
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
    public final g2.g f16809i;
    public final ng f16810j;
    public final pa.d f16811k;
    public final n2.m f16812l;
    public final s f16813m;
    public final ti.e f16814n;
    public final long f16815o;
    public final long f16816p;
    public final ng f16817q;
    public final y2.n f16818r;
    public final jg.i f16819s;
    public final Object f16820t;
    public final SparseArray f16821u;
    public final c v;
    public final c f16822w;
    public final a4.l f16823x;
    public final y2.m f16824y;
    public g2.h f16825z;

    static {
        q0.a("media3.exoplayer.dash");
    }

    public g(p0 p0Var, g2.g gVar, y2.n nVar, ng ngVar, pa.d dVar, n2.m mVar, s sVar, long j10, long j11) {
        this.O = p0Var;
        this.P = p0Var.f3346c;
        k0 k0Var = p0Var.f3345b;
        k0Var.getClass();
        Uri uri = k0Var.f3255a;
        this.E = uri;
        this.F = uri;
        this.G = null;
        this.f16809i = gVar;
        this.f16818r = nVar;
        this.f16810j = ngVar;
        this.f16812l = mVar;
        this.f16813m = sVar;
        this.f16815o = j10;
        this.f16816p = j11;
        this.f16811k = dVar;
        this.f16814n = new ti.e(7);
        this.h = false;
        this.f16817q = b(null);
        this.f16820t = new Object();
        this.f16821u = new SparseArray();
        this.f16823x = new a4.l(this, 27);
        this.M = -9223372036854775807L;
        this.K = -9223372036854775807L;
        this.f16819s = new jg.i(this);
        this.f16824y = new s0(this, 4);
        this.v = new Runnable(this) {
            public final g f16798b;

            {
                this.f16798b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f16798b.C();
                        return;
                    default:
                        g gVar2 = this.f16798b;
                        gVar2.getClass();
                        try {
                            gVar2.z(false);
                            return;
                        } catch (Exception e) {
                            gVar2.C = new IOException(e);
                            return;
                        }
                }
            }
        };
        this.f16822w = new Runnable(this) {
            public final g f16798b;

            {
                this.f16798b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f16798b.C();
                        return;
                    default:
                        g gVar2 = this.f16798b;
                        gVar2.getClass();
                        try {
                            gVar2.z(false);
                            return;
                        } catch (Exception e) {
                            gVar2.C = new IOException(e);
                            return;
                        }
                }
            }
        };
    }

    public static boolean v(m2.h hVar) {
        List list = hVar.f17962c;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = ((m2.a) list.get(i10)).f17929b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    public final void A(t tVar, y2.n nVar) {
        g2.h hVar = this.f16825z;
        Uri parse = Uri.parse(tVar.f17990c);
        Map map = Collections.EMPTY_MAP;
        yb.l(parse, "The uri must be set.");
        this.A.f(new y2.o(hVar, new g2.m(parse, 1, null, map, 0L, -1L, null, 1), 5, nVar), new d(this), 1);
    }

    public final synchronized void B(j0 j0Var) {
        this.P = j0Var;
    }

    public final void C() {
        Uri uri;
        this.D.removeCallbacks(this.v);
        if (this.A.b()) {
            return;
        }
        if (this.A.c()) {
            this.H = true;
            return;
        }
        synchronized (this.f16820t) {
            uri = this.E;
        }
        this.H = false;
        Map map = Collections.EMPTY_MAP;
        yb.l(uri, "The uri must be set.");
        y2.o oVar = new y2.o(this.f16825z, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, this.f16818r);
        jg.i iVar = this.f16819s;
        this.f16813m.getClass();
        this.A.f(oVar, iVar, 3);
    }

    @Override
    public final boolean a(p0 p0Var) {
        k0 k0Var = i().f3345b;
        k0Var.getClass();
        k0 k0Var2 = p0Var.f3345b;
        if (k0Var2 != null && k0Var2.f3255a.equals(k0Var.f3255a) && k0Var2.e.equals(k0Var.e) && Objects.equals(k0Var2.f3257c, k0Var.f3257c)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, h0 h0Var, long j10) {
        int intValue = ((Integer) g0Var.f49297a).intValue() - this.N;
        ng b10 = b(g0Var);
        n2.j jVar = new n2.j(this.d.f18627c, 0, g0Var);
        int i10 = this.N + intValue;
        m2.c cVar = this.G;
        c0 c0Var = this.B;
        long j11 = this.K;
        j2.j jVar2 = this.f49243g;
        jVar2.getClass();
        b bVar = new b(i10, cVar, this.f16814n, intValue, this.f16810j, c0Var, this.f16812l, jVar, this.f16813m, b10, j11, this.f16824y, h0Var, this.f16811k, this.f16823x, jVar2);
        this.f16821u.put(i10, bVar);
        return bVar;
    }

    @Override
    public final synchronized p0 i() {
        return this.O;
    }

    @Override
    public final void k() {
        this.f16824y.d();
    }

    @Override
    public final void m(c0 c0Var) {
        this.B = c0Var;
        Looper myLooper = Looper.myLooper();
        j2.j jVar = this.f49243g;
        jVar.getClass();
        n2.m mVar = this.f16812l;
        mVar.f(myLooper, jVar);
        mVar.a();
        if (this.h) {
            z(false);
            return;
        }
        this.f16825z = this.f16809i.createDataSource();
        this.A = new y2.l("DashMediaSource");
        this.D = n0.q(null);
        C();
    }

    @Override
    public final void o(e0 e0Var) {
        b bVar = (b) e0Var;
        o oVar = bVar.f16795x;
        oVar.f16856r = true;
        oVar.d.removeCallbacksAndMessages(null);
        for (v2.i iVar : bVar.H) {
            iVar.C(bVar);
        }
        bVar.G = null;
        this.f16821u.remove(bVar.f16787a);
    }

    @Override
    public final void q() {
        this.H = false;
        this.f16825z = null;
        y2.l lVar = this.A;
        if (lVar != null) {
            lVar.e(null);
            this.A = null;
        }
        j0 j0Var = i().f3346c;
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
        this.f16821u.clear();
        ti.e eVar = this.f16814n;
        ((HashMap) eVar.f49184b).clear();
        ((HashMap) eVar.f49185c).clear();
        ((HashMap) eVar.d).clear();
        this.f16812l.release();
    }

    @Override
    public final synchronized void t(p0 p0Var) {
        this.O = p0Var;
        this.P = p0Var.f3346c;
    }

    public final synchronized j0 u() {
        return this.P;
    }

    public final void w() {
        boolean z10;
        y2.l lVar = this.A;
        d dVar = new d(this);
        synchronized (z2.b.f52636b) {
            z10 = z2.b.f52637c;
        }
        if (z10) {
            dVar.a();
            return;
        }
        if (lVar == null) {
            lVar = new y2.l("SntpClient");
        }
        lVar.f(new tb.a(27), new e3(dVar, 27), 1);
    }

    public final void x(y2.o oVar, long j10, long j11) {
        long j12 = oVar.f51967a;
        g2.m mVar = oVar.f51968b;
        b0 b0Var = oVar.d;
        u uVar = new u(mVar, b0Var.f12231c, b0Var.d, j10, j11, b0Var.f12230b);
        this.f16813m.getClass();
        this.f16817q.p(uVar, oVar.f51969c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void y(IOException iOException) {
        e2.a.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.K = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        z(true);
    }

    public final void z(boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: l2.g.z(boolean):void");
    }
}
