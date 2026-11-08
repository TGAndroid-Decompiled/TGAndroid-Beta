package o2;

import a8.ia;
import a8.wa;
import ab.b0;
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
import h9.f1;
import j$.util.Objects;
import j2.c0;
import j2.d0;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.m6;
import x2.e0;
import x2.u;
public final class h extends x2.a {
    public b3.o A;
    public d0 B;
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
    public final j2.g f20740i;
    public final wa f20741j;
    public final sa.d f20742k;
    public final q2.m f20743l;
    public final pb.b f20744m;
    public final b0 f20745n;
    public final long f20746o;
    public final long f20747p;
    public final wa f20748q;
    public final q f20749r;
    public final f1 f20750s;
    public final Object f20751t;
    public final SparseArray f20752u;
    public final c v;
    public final c f20753w;
    public final f f20754x;
    public final b3.p f20755y;
    public j2.h f20756z;

    static {
        m0.a("media3.exoplayer.dash");
    }

    public h(l0 l0Var, j2.g gVar, q qVar, wa waVar, sa.d dVar, q2.m mVar, pb.b bVar, long j3, long j10) {
        this.O = l0Var;
        this.P = l0Var.f10351c;
        g0 g0Var = l0Var.f10350b;
        g0Var.getClass();
        Uri uri = g0Var.f10259a;
        this.E = uri;
        this.F = uri;
        this.G = null;
        this.f20740i = gVar;
        this.f20749r = qVar;
        this.f20741j = waVar;
        this.f20743l = mVar;
        this.f20744m = bVar;
        this.f20746o = j3;
        this.f20747p = j10;
        this.f20742k = dVar;
        this.f20745n = new b0(7);
        this.h = false;
        this.f20748q = b(null);
        this.f20751t = new Object();
        this.f20752u = new SparseArray();
        this.f20754x = new f(this);
        this.M = -9223372036854775807L;
        this.K = -9223372036854775807L;
        this.f20750s = new f1(this, 18);
        this.f20755y = new d(this);
        this.v = new Runnable(this) {
            public final h f20727b;

            {
                this.f20727b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f20727b.C();
                        return;
                    default:
                        h hVar = this.f20727b;
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
        this.f20753w = new Runnable(this) {
            public final h f20727b;

            {
                this.f20727b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f20727b.C();
                        return;
                    default:
                        h hVar = this.f20727b;
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
        List list = hVar.f53127c;
        for (int i7 = 0; i7 < list.size(); i7++) {
            int i10 = ((p2.a) list.get(i7)).f53090b;
            if (i10 == 1 || i10 == 2) {
                return true;
            }
        }
        return false;
    }

    public final void A(m6 m6Var, q qVar) {
        j2.h hVar = this.f20756z;
        Uri parse = Uri.parse(m6Var.f23990c);
        Map map = Collections.EMPTY_MAP;
        ia.k(parse, "The uri must be set.");
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
        synchronized (this.f20751t) {
            uri = this.E;
        }
        this.H = false;
        Map map = Collections.EMPTY_MAP;
        ia.k(uri, "The uri must be set.");
        r rVar = new r(this.f20756z, new j2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, this.f20749r);
        f1 f1Var = this.f20750s;
        this.f20744m.getClass();
        this.A.f(rVar, f1Var, 3);
    }

    @Override
    public final boolean a(l0 l0Var) {
        g0 g0Var = i().f10350b;
        g0Var.getClass();
        g0 g0Var2 = l0Var.f10350b;
        if (g0Var2 != null && g0Var2.f10259a.equals(g0Var.f10259a) && g0Var2.f10262e.equals(g0Var.f10262e) && Objects.equals(g0Var2.f10261c, g0Var.f10261c)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(x2.g0 g0Var, h6.m mVar, long j3) {
        int intValue = ((Integer) g0Var.f58329a).intValue() - this.N;
        wa b10 = b(g0Var);
        q2.j jVar = new q2.j(this.d.f53738c, 0, g0Var);
        int i7 = this.N + intValue;
        p2.c cVar = this.G;
        d0 d0Var = this.B;
        long j10 = this.K;
        m2.j jVar2 = this.f58269g;
        jVar2.getClass();
        b bVar = new b(i7, cVar, this.f20745n, intValue, this.f20741j, d0Var, this.f20743l, jVar, this.f20744m, b10, j10, this.f20755y, mVar, this.f20742k, this.f20754x, jVar2);
        this.f20752u.put(i7, bVar);
        return bVar;
    }

    @Override
    public final synchronized l0 i() {
        return this.O;
    }

    @Override
    public final void k() {
        this.f20755y.a();
    }

    @Override
    public final void m(d0 d0Var) {
        this.B = d0Var;
        Looper myLooper = Looper.myLooper();
        m2.j jVar = this.f58269g;
        jVar.getClass();
        q2.m mVar = this.f20743l;
        mVar.E(myLooper, jVar);
        mVar.a();
        if (this.h) {
            z(false);
            return;
        }
        this.f20756z = this.f20740i.createDataSource();
        this.A = new b3.o("DashMediaSource");
        this.D = h2.m0.q(null);
        C();
    }

    @Override
    public final void o(e0 e0Var) {
        b bVar = (b) e0Var;
        p pVar = bVar.f20725y;
        pVar.f20792r = true;
        pVar.d.removeCallbacksAndMessages(null);
        for (y2.i iVar : bVar.H) {
            iVar.z(bVar);
        }
        bVar.G = null;
        this.f20752u.remove(bVar.f20715a);
    }

    @Override
    public final void q() {
        this.H = false;
        this.f20756z = null;
        b3.o oVar = this.A;
        if (oVar != null) {
            oVar.e(null);
            this.A = null;
        }
        f0 f0Var = i().f10351c;
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
        this.f20752u.clear();
        b0 b0Var = this.f20745n;
        ((HashMap) b0Var.f907b).clear();
        ((HashMap) b0Var.f908c).clear();
        ((HashMap) b0Var.d).clear();
        this.f20743l.release();
    }

    @Override
    public final synchronized void t(l0 l0Var) {
        this.O = l0Var;
        this.P = l0Var.f10351c;
    }

    public final synchronized f0 u() {
        return this.P;
    }

    public final void w() {
        boolean z9;
        b3.o oVar = this.A;
        d dVar = new d(this);
        synchronized (c3.b.f5263b) {
            z9 = c3.b.f5264c;
        }
        if (z9) {
            dVar.b();
            return;
        }
        if (oVar == null) {
            oVar = new b3.o("SntpClient");
        }
        oVar.f(new pb.b(5), new cb.c(dVar, 12), 1);
    }

    public final void x(r rVar, long j3, long j10) {
        long j11 = rVar.f2965a;
        j2.m mVar = rVar.f2966b;
        c0 c0Var = rVar.d;
        u uVar = new u(mVar, c0Var.f16417c, c0Var.d, j3, j10, c0Var.f16416b);
        this.f20744m.getClass();
        this.f20748q.o(uVar, rVar.f2967c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
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
