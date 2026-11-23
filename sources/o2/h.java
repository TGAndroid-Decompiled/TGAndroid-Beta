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
    public final j2.g f21653i;
    public final xa f21654j;
    public final nb.a f21655k;
    public final q2.m f21656l;
    public final qb.a f21657m;
    public final xi.e f21658n;
    public final long f21659o;
    public final long f21660p;
    public final xa f21661q;
    public final r f21662r;
    public final g1 f21663s;
    public final Object f21664t;
    public final SparseArray f21665u;
    public final c v;
    public final c f21666w;
    public final f f21667x;
    public final q f21668y;
    public j2.h f21669z;

    static {
        m0.a("media3.exoplayer.dash");
    }

    public h(l0 l0Var, j2.g gVar, r rVar, xa xaVar, nb.a aVar, q2.m mVar, qb.a aVar2, long j3, long j10) {
        this.O = l0Var;
        this.P = l0Var.f10534c;
        g0 g0Var = l0Var.f10533b;
        g0Var.getClass();
        Uri uri = g0Var.f10442a;
        this.E = uri;
        this.F = uri;
        this.G = null;
        this.f21653i = gVar;
        this.f21662r = rVar;
        this.f21654j = xaVar;
        this.f21656l = mVar;
        this.f21657m = aVar2;
        this.f21659o = j3;
        this.f21660p = j10;
        this.f21655k = aVar;
        this.f21658n = new xi.e(7);
        this.h = false;
        this.f21661q = b(null);
        this.f21664t = new Object();
        this.f21665u = new SparseArray();
        this.f21667x = new f(this);
        this.M = -9223372036854775807L;
        this.K = -9223372036854775807L;
        this.f21663s = new g1(this, 16);
        this.f21668y = new d(this);
        this.v = new Runnable(this) {
            public final h f21640b;

            {
                this.f21640b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f21640b.C();
                        return;
                    default:
                        h hVar = this.f21640b;
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
        this.f21666w = new Runnable(this) {
            public final h f21640b;

            {
                this.f21640b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f21640b.C();
                        return;
                    default:
                        h hVar = this.f21640b;
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
        List list = hVar.f55159c;
        for (int i7 = 0; i7 < list.size(); i7++) {
            int i10 = ((p2.a) list.get(i7)).f55122b;
            if (i10 == 1 || i10 == 2) {
                return true;
            }
        }
        return false;
    }

    public final void A(f5.a aVar, r rVar) {
        j2.h hVar = this.f21669z;
        Uri parse = Uri.parse(aVar.f11277c);
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
        synchronized (this.f21664t) {
            uri = this.E;
        }
        this.H = false;
        Map map = Collections.EMPTY_MAP;
        la.k(uri, "The uri must be set.");
        s sVar = new s(this.f21669z, new j2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, this.f21662r);
        g1 g1Var = this.f21663s;
        this.f21657m.getClass();
        this.A.f(sVar, g1Var, 3);
    }

    @Override
    public final boolean a(l0 l0Var) {
        g0 g0Var = i().f10533b;
        g0Var.getClass();
        g0 g0Var2 = l0Var.f10533b;
        if (g0Var2 != null && g0Var2.f10442a.equals(g0Var.f10442a) && g0Var2.f10445e.equals(g0Var.f10445e) && Objects.equals(g0Var2.f10444c, g0Var.f10444c)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(x2.g0 g0Var, h6.m mVar, long j3) {
        int intValue = ((Integer) g0Var.f60133a).intValue() - this.N;
        xa b10 = b(g0Var);
        q2.j jVar = new q2.j(this.d.f55806c, 0, g0Var);
        int i7 = this.N + intValue;
        p2.c cVar = this.G;
        c0 c0Var = this.B;
        long j10 = this.K;
        m2.i iVar = this.f60074g;
        iVar.getClass();
        b bVar = new b(i7, cVar, this.f21658n, intValue, this.f21654j, c0Var, this.f21656l, jVar, this.f21657m, b10, j10, this.f21668y, mVar, this.f21655k, this.f21667x, iVar);
        this.f21665u.put(i7, bVar);
        return bVar;
    }

    @Override
    public final synchronized l0 i() {
        return this.O;
    }

    @Override
    public final void k() {
        this.f21668y.a();
    }

    @Override
    public final void m(c0 c0Var) {
        this.B = c0Var;
        Looper myLooper = Looper.myLooper();
        m2.i iVar = this.f60074g;
        iVar.getClass();
        q2.m mVar = this.f21656l;
        mVar.r1(myLooper, iVar);
        mVar.a();
        if (this.h) {
            z(false);
            return;
        }
        this.f21669z = this.f21653i.createDataSource();
        this.A = new b3.p("DashMediaSource");
        this.D = h2.l0.q(null);
        C();
    }

    @Override
    public final void o(e0 e0Var) {
        b bVar = (b) e0Var;
        p pVar = bVar.f21638y;
        pVar.f21705r = true;
        pVar.d.removeCallbacksAndMessages(null);
        for (y2.i iVar : bVar.I) {
            iVar.D(bVar);
        }
        bVar.H = null;
        this.f21665u.remove(bVar.f21628a);
    }

    @Override
    public final void q() {
        this.H = false;
        this.f21669z = null;
        b3.p pVar = this.A;
        if (pVar != null) {
            pVar.e(null);
            this.A = null;
        }
        f0 f0Var = i().f10534c;
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
        this.f21665u.clear();
        xi.e eVar = this.f21658n;
        ((HashMap) eVar.f60666a).clear();
        ((HashMap) eVar.f60667b).clear();
        ((HashMap) eVar.f60668c).clear();
        this.f21656l.release();
    }

    @Override
    public final synchronized void t(l0 l0Var) {
        this.O = l0Var;
        this.P = l0Var.f10534c;
    }

    public final synchronized f0 u() {
        return this.P;
    }

    public final void w() {
        boolean z10;
        b3.p pVar = this.A;
        d dVar = new d(this);
        synchronized (c3.b.f4398b) {
            z10 = c3.b.f4399c;
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
        long j11 = sVar.f2936a;
        j2.m mVar = sVar.f2937b;
        b0 b0Var = sVar.d;
        u uVar = new u(mVar, b0Var.f17181c, b0Var.d, j3, j10, b0Var.f17180b);
        this.f21657m.getClass();
        this.f21661q.o(uVar, sVar.f2938c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
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
