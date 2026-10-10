package l2;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import b2.e0;
import b2.f0;
import b2.k0;
import b2.l0;
import com.google.android.gms.internal.cast.z4;
import com.google.firebase.messaging.s;
import g2.c0;
import j$.util.Objects;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k2.g0;
import m.f3;
import t7.t;
import u2.d0;
public final class h extends u2.a {
    public y2.l A;
    public c0 B;
    public z4 C;
    public Handler D;
    public e0 E;
    public Uri F;
    public final Uri G;
    public m2.c H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long N;
    public int O;
    public k0 P;
    public final boolean h;
    public final g2.g f15337i;
    public final a5.a f15338j;
    public final t f15339k;
    public final n2.m f15340l;
    public final rb.a f15341m;
    public final s f15342n;
    public final long f15343o;
    public final long f15344p;
    public final a5.a f15345q;
    public final y2.n f15346r;
    public final g0 f15347s;
    public final Object f15348t;
    public final SparseArray f15349u;
    public final c v;
    public final c f15350w;
    public final f f15351x;
    public final y2.m f15352y;
    public g2.h f15353z;

    static {
        l0.a("media3.exoplayer.dash");
    }

    public h(k0 k0Var, g2.g gVar, y2.n nVar, a5.a aVar, t tVar, n2.m mVar, rb.a aVar2, long j3, long j10) {
        this.P = k0Var;
        this.E = k0Var.f3401c;
        f0 f0Var = k0Var.f3400b;
        f0Var.getClass();
        Uri uri = f0Var.f3305a;
        this.F = uri;
        this.G = uri;
        this.H = null;
        this.f15337i = gVar;
        this.f15346r = nVar;
        this.f15338j = aVar;
        this.f15340l = mVar;
        this.f15341m = aVar2;
        this.f15343o = j3;
        this.f15344p = j10;
        this.f15339k = tVar;
        this.f15342n = new s(6);
        this.h = false;
        this.f15345q = b(null);
        this.f15348t = new Object();
        this.f15349u = new SparseArray();
        this.f15351x = new f(this, 0);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.f15347s = new g0(this, 2);
        this.f15352y = new a4.l(this, 28);
        this.v = new Runnable(this) {
            public final h f15323b;

            {
                this.f15323b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f15323b.A();
                        return;
                    default:
                        this.f15323b.y(false);
                        return;
                }
            }
        };
        this.f15350w = new Runnable(this) {
            public final h f15323b;

            {
                this.f15323b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f15323b.A();
                        return;
                    default:
                        this.f15323b.y(false);
                        return;
                }
            }
        };
    }

    public static boolean u(m2.h hVar) {
        List list = hVar.f15945c;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = ((m2.a) list.get(i10)).f15908b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    public final void A() {
        Uri uri;
        this.D.removeCallbacks(this.v);
        if (this.A.c()) {
            return;
        }
        if (this.A.d()) {
            this.I = true;
            return;
        }
        synchronized (this.f15348t) {
            uri = this.F;
        }
        this.I = false;
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.o oVar = new y2.o(this.f15353z, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, this.f15346r);
        g0 g0Var = this.f15347s;
        this.f15341m.getClass();
        this.A.f(oVar, g0Var, 3);
    }

    @Override
    public final boolean a(k0 k0Var) {
        k0 i10 = i();
        f0 f0Var = i10.f3400b;
        f0Var.getClass();
        f0 f0Var2 = k0Var.f3400b;
        if (f0Var2 != null && f0Var2.f3305a.equals(f0Var.f3305a) && f0Var2.f3308e.equals(f0Var.f3308e) && Objects.equals(f0Var2.f3307c, f0Var.f3307c) && i10.f3401c.equals(k0Var.f3401c)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(u2.f0 f0Var, y2.d dVar, long j3) {
        int intValue = ((Integer) f0Var.f48616a).intValue() - this.O;
        a5.a b10 = b(f0Var);
        n2.j jVar = new n2.j(this.d.f16524c, 0, f0Var);
        int i10 = this.O + intValue;
        m2.c cVar = this.H;
        c0 c0Var = this.B;
        long j10 = this.L;
        j2.k kVar = this.f48558g;
        e2.d.h(kVar);
        b bVar = new b(i10, cVar, this.f15342n, intValue, this.f15338j, c0Var, this.f15340l, jVar, this.f15341m, b10, j10, this.f15352y, dVar, this.f15339k, this.f15351x, kVar);
        this.f15349u.put(i10, bVar);
        return bVar;
    }

    @Override
    public final synchronized k0 i() {
        return this.P;
    }

    @Override
    public final void k() {
        this.f15352y.a();
    }

    @Override
    public final void m(c0 c0Var) {
        this.B = c0Var;
        Looper myLooper = Looper.myLooper();
        j2.k kVar = this.f48558g;
        e2.d.h(kVar);
        n2.m mVar = this.f15340l;
        mVar.F(myLooper, kVar);
        mVar.b();
        if (this.h) {
            y(false);
            return;
        }
        this.f15353z = this.f15337i.createDataSource();
        this.A = new y2.l("DashMediaSource");
        this.D = e2.d0.o(null);
        A();
    }

    @Override
    public final void o(d0 d0Var) {
        b bVar = (b) d0Var;
        p pVar = bVar.f15320x;
        pVar.f15389r = true;
        pVar.d.removeCallbacksAndMessages(null);
        for (v2.h hVar : bVar.H) {
            hVar.z(bVar);
        }
        bVar.G = null;
        this.f15349u.remove(bVar.f15311a);
    }

    @Override
    public final void q() {
        this.I = false;
        this.f15353z = null;
        y2.l lVar = this.A;
        if (lVar != null) {
            lVar.e(null);
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
        this.F = this.G;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.L = -9223372036854775807L;
        this.M = 0;
        this.N = -9223372036854775807L;
        this.f15349u.clear();
        s sVar = this.f15342n;
        ((HashMap) sVar.f7971b).clear();
        ((HashMap) sVar.f7972c).clear();
        ((HashMap) sVar.d).clear();
        this.f15340l.release();
    }

    @Override
    public final synchronized void t(k0 k0Var) {
        this.P = k0Var;
    }

    public final void v() {
        boolean z10;
        y2.l lVar = this.A;
        d dVar = new d(this);
        synchronized (z2.b.f53530b) {
            z10 = z2.b.f53531c;
        }
        if (z10) {
            dVar.a();
            return;
        }
        if (lVar == null) {
            lVar = new y2.l("SntpClient");
        }
        lVar.f(new rb.a(27), new f3(dVar, 25), 1);
    }

    public final void w(y2.o oVar, long j3) {
        long j10 = oVar.f51743a;
        Uri uri = oVar.d.f10235c;
        u2.t tVar = new u2.t(j3);
        this.f15341m.getClass();
        this.f15345q.p(tVar, oVar.f51745c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void x(IOException iOException) {
        e2.a.f("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        y(true);
    }

    public final void y(boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: l2.h.y(boolean):void");
    }

    public final void z(c5.a aVar, y2.n nVar) {
        g2.h hVar = this.f15353z;
        Uri parse = Uri.parse(aVar.f4199c);
        Map map = Collections.EMPTY_MAP;
        e2.d.i(parse, "The uri must be set.");
        this.A.f(new y2.o(hVar, new g2.m(parse, 1, null, map, 0L, -1L, null, 1), 5, nVar), new d(this), 1);
    }
}
