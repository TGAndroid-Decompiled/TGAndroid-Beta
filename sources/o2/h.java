package o2;

import a8.la;
import a8.xa;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import b3.q;
import b3.r;
import b3.s;
import e2.f0;
import e2.g0;
import e2.l0;
import e2.m0;
import h9.g1;
import j$.util.Objects;
import j2.b0;
import j2.c0;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import x2.e0;
import x2.u;
public final class h extends x2.a {
    public b3.p A;
    public c0 B;
    public IOException C;
    public Handler D;
    public Uri E;
    public final Uri F;
    public p2.c G;
    public boolean H;
    public long I;
    public long J;
    public long K;
    public int L;
    public long M;
    public int N;
    public l0 O;
    public f0 P;
    public final boolean h;
    public final j2.g f21650i;
    public final xa f21651j;
    public final nb.a f21652k;
    public final q2.m f21653l;
    public final qb.a f21654m;
    public final xi.e f21655n;
    public final long f21656o;
    public final long f21657p;
    public final xa f21658q;
    public final r f21659r;
    public final g1 f21660s;
    public final Object f21661t;
    public final SparseArray f21662u;
    public final c v;
    public final c f21663w;
    public final f f21664x;
    public final q f21665y;
    public j2.h f21666z;

    static {
        m0.a("media3.exoplayer.dash");
    }

    public h(l0 l0Var, j2.g gVar, r rVar, xa xaVar, nb.a aVar, q2.m mVar, qb.a aVar2, long j3, long j10) {
        this.O = l0Var;
        this.P = l0Var.f10531c;
        g0 g0Var = l0Var.f10530b;
        g0Var.getClass();
        Uri uri = g0Var.f10439a;
        this.E = uri;
        this.F = uri;
        this.G = null;
        this.f21650i = gVar;
        this.f21659r = rVar;
        this.f21651j = xaVar;
        this.f21653l = mVar;
        this.f21654m = aVar2;
        this.f21656o = j3;
        this.f21657p = j10;
        this.f21652k = aVar;
        this.f21655n = new xi.e(7);
        this.h = false;
        this.f21658q = b(null);
        this.f21661t = new Object();
        this.f21662u = new SparseArray();
        this.f21664x = new f(this);
        this.M = -9223372036854775807L;
        this.K = -9223372036854775807L;
        this.f21660s = new g1(this, 16);
        this.f21665y = new d(this);
        this.v = new Runnable(this) {
            public final h f21637b;

            {
                this.f21637b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f21637b.C();
                        return;
                    default:
                        h hVar = this.f21637b;
                        hVar.getClass();
                        try {
                            hVar.z(false);
                            return;
                        } catch (Exception e10) {
                            hVar.C = new IOException(e10);
                            return;
                        }
                }
            }
        };
        this.f21663w = new Runnable(this) {
            public final h f21637b;

            {
                this.f21637b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f21637b.C();
                        return;
                    default:
                        h hVar = this.f21637b;
                        hVar.getClass();
                        try {
                            hVar.z(false);
                            return;
                        } catch (Exception e10) {
                            hVar.C = new IOException(e10);
                            return;
                        }
                }
            }
        };
    }

    public static boolean v(p2.h hVar) {
        List list = hVar.f55155c;
        for (int i7 = 0; i7 < list.size(); i7++) {
            int i10 = ((p2.a) list.get(i7)).f55118b;
            if (i10 == 1 || i10 == 2) {
                return true;
            }
        }
        return false;
    }

    public final void A(f5.a aVar, r rVar) {
        j2.h hVar = this.f21666z;
        Uri parse = Uri.parse(aVar.f11274c);
        Map map = Collections.EMPTY_MAP;
        la.k(parse, "The uri must be set.");
        this.A.f(new s(hVar, new j2.m(parse, 1, null, map, 0L, -1L, null, 1), 5, rVar), new f(this), 1);
    }

    public final synchronized void B(f0 f0Var) {
        this.P = f0Var;
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
        synchronized (this.f21661t) {
            uri = this.E;
        }
        this.H = false;
        Map map = Collections.EMPTY_MAP;
        la.k(uri, "The uri must be set.");
        s sVar = new s(this.f21666z, new j2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, this.f21659r);
        g1 g1Var = this.f21660s;
        this.f21654m.getClass();
        this.A.f(sVar, g1Var, 3);
    }

    @Override
    public final boolean a(l0 l0Var) {
        g0 g0Var = i().f10530b;
        g0Var.getClass();
        g0 g0Var2 = l0Var.f10530b;
        if (g0Var2 != null && g0Var2.f10439a.equals(g0Var.f10439a) && g0Var2.f10442e.equals(g0Var.f10442e) && Objects.equals(g0Var2.f10441c, g0Var.f10441c)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(x2.g0 g0Var, h6.m mVar, long j3) {
        int intValue = ((Integer) g0Var.f60129a).intValue() - this.N;
        xa b10 = b(g0Var);
        q2.j jVar = new q2.j(this.d.f55802c, 0, g0Var);
        int i7 = this.N + intValue;
        p2.c cVar = this.G;
        c0 c0Var = this.B;
        long j10 = this.K;
        m2.i iVar = this.f60070g;
        iVar.getClass();
        b bVar = new b(i7, cVar, this.f21655n, intValue, this.f21651j, c0Var, this.f21653l, jVar, this.f21654m, b10, j10, this.f21665y, mVar, this.f21652k, this.f21664x, iVar);
        this.f21662u.put(i7, bVar);
        return bVar;
    }

    @Override
    public final synchronized l0 i() {
        return this.O;
    }

    @Override
    public final void k() {
        this.f21665y.a();
    }

    @Override
    public final void m(c0 c0Var) {
        this.B = c0Var;
        Looper myLooper = Looper.myLooper();
        m2.i iVar = this.f60070g;
        iVar.getClass();
        q2.m mVar = this.f21653l;
        mVar.r1(myLooper, iVar);
        mVar.a();
        if (this.h) {
            z(false);
            return;
        }
        this.f21666z = this.f21650i.createDataSource();
        this.A = new b3.p("DashMediaSource");
        this.D = h2.l0.q(null);
        C();
    }

    @Override
    public final void o(e0 e0Var) {
        b bVar = (b) e0Var;
        p pVar = bVar.f21635y;
        pVar.f21702r = true;
        pVar.d.removeCallbacksAndMessages(null);
        for (y2.i iVar : bVar.I) {
            iVar.D(bVar);
        }
        bVar.H = null;
        this.f21662u.remove(bVar.f21625a);
    }

    @Override
    public final void q() {
        this.H = false;
        this.f21666z = null;
        b3.p pVar = this.A;
        if (pVar != null) {
            pVar.e(null);
            this.A = null;
        }
        f0 f0Var = i().f10531c;
        synchronized (this) {
            this.P = f0Var;
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
        this.f21662u.clear();
        xi.e eVar = this.f21655n;
        ((HashMap) eVar.f60662a).clear();
        ((HashMap) eVar.f60663b).clear();
        ((HashMap) eVar.f60664c).clear();
        this.f21653l.release();
    }

    @Override
    public final synchronized void t(l0 l0Var) {
        this.O = l0Var;
        this.P = l0Var.f10531c;
    }

    public final synchronized f0 u() {
        return this.P;
    }

    public final void w() {
        boolean z10;
        b3.p pVar = this.A;
        d dVar = new d(this);
        synchronized (c3.b.f4395b) {
            z10 = c3.b.f4396c;
        }
        if (z10) {
            dVar.b();
            return;
        }
        if (pVar == null) {
            pVar = new b3.p("SntpClient");
        }
        pVar.f(new qb.a(5), new d6.i(dVar, 5), 1);
    }

    public final void x(s sVar, long j3, long j10) {
        long j11 = sVar.f2929a;
        j2.m mVar = sVar.f2930b;
        b0 b0Var = sVar.d;
        u uVar = new u(mVar, b0Var.f17178c, b0Var.d, j3, j10, b0Var.f17177b);
        this.f21654m.getClass();
        this.f21658q.o(uVar, sVar.f2931c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void y(IOException iOException) {
        h2.a.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.K = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        z(true);
    }

    public final void z(boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: o2.h.z(boolean):void");
    }
}
