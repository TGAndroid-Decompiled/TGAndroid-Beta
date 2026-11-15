package o2;

import a8.ja;
import a8.xa;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import b3.q;
import b3.r;
import e2.f0;
import e2.g0;
import e2.l0;
import e2.m0;
import j$.util.Objects;
import j2.b0;
import j2.c0;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import x2.d0;
import x2.t;
public final class h extends x2.a {
    public b3.o A;
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
    public final j2.g f21261i;
    public final xa f21262j;
    public final nb.a f21263k;
    public final q2.n f21264l;
    public final qb.a f21265m;
    public final xi.e f21266n;
    public final long f21267o;
    public final long f21268p;
    public final xa f21269q;
    public final q f21270r;
    public final hi.l0 f21271s;
    public final Object f21272t;
    public final SparseArray f21273u;
    public final c v;
    public final c f21274w;
    public final f f21275x;
    public final b3.p f21276y;
    public j2.h f21277z;

    static {
        m0.a("media3.exoplayer.dash");
    }

    public h(l0 l0Var, j2.g gVar, q qVar, xa xaVar, nb.a aVar, q2.n nVar, qb.a aVar2, long j3, long j10) {
        this.O = l0Var;
        this.P = l0Var.f10187c;
        g0 g0Var = l0Var.f10186b;
        g0Var.getClass();
        Uri uri = g0Var.f10095a;
        this.E = uri;
        this.F = uri;
        this.G = null;
        this.f21261i = gVar;
        this.f21270r = qVar;
        this.f21262j = xaVar;
        this.f21264l = nVar;
        this.f21265m = aVar2;
        this.f21267o = j3;
        this.f21268p = j10;
        this.f21263k = aVar;
        this.f21266n = new xi.e(7);
        this.h = false;
        this.f21269q = b(null);
        this.f21272t = new Object();
        this.f21273u = new SparseArray();
        this.f21275x = new f(this);
        this.M = -9223372036854775807L;
        this.K = -9223372036854775807L;
        this.f21271s = new hi.l0(this, 16);
        this.f21276y = new d(this);
        this.v = new Runnable(this) {
            public final h f21248b;

            {
                this.f21248b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f21248b.C();
                        return;
                    default:
                        h hVar = this.f21248b;
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
        this.f21274w = new Runnable(this) {
            public final h f21248b;

            {
                this.f21248b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f21248b.C();
                        return;
                    default:
                        h hVar = this.f21248b;
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
        List list = hVar.f54545c;
        for (int i7 = 0; i7 < list.size(); i7++) {
            int i10 = ((p2.a) list.get(i7)).f54508b;
            if (i10 == 1 || i10 == 2) {
                return true;
            }
        }
        return false;
    }

    public final void A(f5.a aVar, q qVar) {
        j2.h hVar = this.f21277z;
        Uri parse = Uri.parse(aVar.f10926c);
        Map map = Collections.EMPTY_MAP;
        ja.k(parse, "The uri must be set.");
        this.A.f(new r(hVar, new j2.m(parse, 1, null, map, 0L, -1L, null, 1), 5, qVar), new f(this), 1);
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
        synchronized (this.f21272t) {
            uri = this.E;
        }
        this.H = false;
        Map map = Collections.EMPTY_MAP;
        ja.k(uri, "The uri must be set.");
        r rVar = new r(this.f21277z, new j2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, this.f21270r);
        hi.l0 l0Var = this.f21271s;
        this.f21265m.getClass();
        this.A.f(rVar, l0Var, 3);
    }

    @Override
    public final boolean a(l0 l0Var) {
        g0 g0Var = i().f10186b;
        g0Var.getClass();
        g0 g0Var2 = l0Var.f10186b;
        if (g0Var2 != null && g0Var2.f10095a.equals(g0Var.f10095a) && g0Var2.f10098e.equals(g0Var.f10098e) && Objects.equals(g0Var2.f10097c, g0Var.f10097c)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(x2.f0 f0Var, h6.m mVar, long j3) {
        int intValue = ((Integer) f0Var.f59523a).intValue() - this.N;
        xa b10 = b(f0Var);
        q2.k kVar = new q2.k(this.d.f55187c, 0, f0Var);
        int i7 = this.N + intValue;
        p2.c cVar = this.G;
        c0 c0Var = this.B;
        long j10 = this.K;
        m2.j jVar = this.f59464g;
        jVar.getClass();
        b bVar = new b(i7, cVar, this.f21266n, intValue, this.f21262j, c0Var, this.f21264l, kVar, this.f21265m, b10, j10, this.f21276y, mVar, this.f21263k, this.f21275x, jVar);
        this.f21273u.put(i7, bVar);
        return bVar;
    }

    @Override
    public final synchronized l0 i() {
        return this.O;
    }

    @Override
    public final void k() {
        this.f21276y.a();
    }

    @Override
    public final void m(c0 c0Var) {
        this.B = c0Var;
        Looper myLooper = Looper.myLooper();
        m2.j jVar = this.f59464g;
        jVar.getClass();
        q2.n nVar = this.f21264l;
        nVar.r1(myLooper, jVar);
        nVar.a();
        if (this.h) {
            z(false);
            return;
        }
        this.f21277z = this.f21261i.createDataSource();
        this.A = new b3.o("DashMediaSource");
        this.D = h2.l0.q(null);
        C();
    }

    @Override
    public final void o(d0 d0Var) {
        b bVar = (b) d0Var;
        p pVar = bVar.f21246y;
        pVar.f21313r = true;
        pVar.d.removeCallbacksAndMessages(null);
        for (y2.i iVar : bVar.I) {
            iVar.D(bVar);
        }
        bVar.H = null;
        this.f21273u.remove(bVar.f21236a);
    }

    @Override
    public final void q() {
        this.H = false;
        this.f21277z = null;
        b3.o oVar = this.A;
        if (oVar != null) {
            oVar.e(null);
            this.A = null;
        }
        f0 f0Var = i().f10187c;
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
        this.f21273u.clear();
        xi.e eVar = this.f21266n;
        ((HashMap) eVar.f60055a).clear();
        ((HashMap) eVar.f60056b).clear();
        ((HashMap) eVar.f60057c).clear();
        this.f21264l.release();
    }

    @Override
    public final synchronized void t(l0 l0Var) {
        this.O = l0Var;
        this.P = l0Var.f10187c;
    }

    public final synchronized f0 u() {
        return this.P;
    }

    public final void w() {
        boolean z10;
        b3.o oVar = this.A;
        d dVar = new d(this);
        synchronized (c3.b.f4088b) {
            z10 = c3.b.f4089c;
        }
        if (z10) {
            dVar.b();
            return;
        }
        if (oVar == null) {
            oVar = new b3.o("SntpClient");
        }
        oVar.f(new qb.a(5), new cb.c(dVar, 9), 1);
    }

    public final void x(r rVar, long j3, long j10) {
        long j11 = rVar.f2922a;
        j2.m mVar = rVar.f2923b;
        b0 b0Var = rVar.d;
        t tVar = new t(mVar, b0Var.f16771c, b0Var.d, j3, j10, b0Var.f16770b);
        this.f21265m.getClass();
        this.f21269q.n(tVar, rVar.f2924c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
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
