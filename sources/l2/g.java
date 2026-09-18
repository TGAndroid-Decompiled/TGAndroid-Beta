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
import com.google.android.gms.internal.cast.b5;
import com.google.firebase.messaging.t;
import g2.c0;
import j$.util.Objects;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k2.u;
import u2.d0;
import y2.p;
public final class g extends u2.a {
    public y2.m A;
    public c0 B;
    public b5 C;
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
    public final g2.g f13983i;
    public final a5.a f13984j;
    public final ob.a f13985k;
    public final n2.n f13986l;
    public final qb.b f13987m;
    public final t f13988n;
    public final long f13989o;
    public final long f13990p;
    public final a5.a f13991q;
    public final y2.o f13992r;
    public final l.d f13993s;
    public final Object f13994t;
    public final SparseArray f13995u;
    public final c v;
    public final c f13996w;
    public final u f13997x;
    public final y2.n f13998y;
    public g2.h f13999z;

    static {
        l0.a("media3.exoplayer.dash");
    }

    public g(k0 k0Var, g2.g gVar, y2.o oVar, a5.a aVar, ob.a aVar2, n2.n nVar, qb.b bVar, long j3, long j10) {
        this.P = k0Var;
        this.E = k0Var.f3079c;
        f0 f0Var = k0Var.f3078b;
        f0Var.getClass();
        Uri uri = f0Var.f2993a;
        this.F = uri;
        this.G = uri;
        this.H = null;
        this.f13983i = gVar;
        this.f13992r = oVar;
        this.f13984j = aVar;
        this.f13986l = nVar;
        this.f13987m = bVar;
        this.f13989o = j3;
        this.f13990p = j10;
        this.f13985k = aVar2;
        this.f13988n = new t(6);
        this.h = false;
        this.f13991q = b(null);
        this.f13994t = new Object();
        this.f13995u = new SparseArray();
        this.f13997x = new u(this, 2);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.f13993s = new l.d(this);
        this.f13998y = new a4.m(this, 26);
        this.v = new Runnable(this) {
            public final g f13972b;

            {
                this.f13972b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f13972b.A();
                        return;
                    default:
                        this.f13972b.y(false);
                        return;
                }
            }
        };
        this.f13996w = new Runnable(this) {
            public final g f13972b;

            {
                this.f13972b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f13972b.A();
                        return;
                    default:
                        this.f13972b.y(false);
                        return;
                }
            }
        };
    }

    public static boolean u(m2.h hVar) {
        List list = hVar.f14605c;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = ((m2.a) list.get(i10)).f14572b;
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
        synchronized (this.f13994t) {
            uri = this.F;
        }
        this.I = false;
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        p pVar = new p(this.f13999z, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, this.f13992r);
        l.d dVar = this.f13993s;
        this.f13987m.getClass();
        this.A.f(pVar, dVar, 3);
    }

    @Override
    public final boolean a(k0 k0Var) {
        k0 i10 = i();
        f0 f0Var = i10.f3078b;
        f0Var.getClass();
        f0 f0Var2 = k0Var.f3078b;
        if (f0Var2 != null && f0Var2.f2993a.equals(f0Var.f2993a) && f0Var2.e.equals(f0Var.e) && Objects.equals(f0Var2.f2995c, f0Var.f2995c) && i10.f3079c.equals(k0Var.f3079c)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(u2.f0 f0Var, y2.d dVar, long j3) {
        int intValue = ((Integer) f0Var.f43612a).intValue() - this.O;
        a5.a b10 = b(f0Var);
        n2.k kVar = new n2.k(this.d.f15092c, 0, f0Var);
        int i10 = this.O + intValue;
        m2.c cVar = this.H;
        c0 c0Var = this.B;
        long j10 = this.L;
        j2.k kVar2 = this.f43558g;
        e2.d.h(kVar2);
        b bVar = new b(i10, cVar, this.f13988n, intValue, this.f13984j, c0Var, this.f13986l, kVar, this.f13987m, b10, j10, this.f13998y, dVar, this.f13985k, this.f13997x, kVar2);
        this.f13995u.put(i10, bVar);
        return bVar;
    }

    @Override
    public final synchronized k0 i() {
        return this.P;
    }

    @Override
    public final void k() {
        this.f13998y.a();
    }

    @Override
    public final void m(c0 c0Var) {
        this.B = c0Var;
        Looper myLooper = Looper.myLooper();
        j2.k kVar = this.f43558g;
        e2.d.h(kVar);
        n2.n nVar = this.f13986l;
        nVar.C(myLooper, kVar);
        nVar.b();
        if (this.h) {
            y(false);
            return;
        }
        this.f13999z = this.f13983i.createDataSource();
        this.A = new y2.m("DashMediaSource");
        this.D = e2.d0.o(null);
        A();
    }

    @Override
    public final void o(d0 d0Var) {
        b bVar = (b) d0Var;
        o oVar = bVar.f13969x;
        oVar.f14030r = true;
        oVar.d.removeCallbacksAndMessages(null);
        for (v2.h hVar : bVar.H) {
            hVar.B(bVar);
        }
        bVar.G = null;
        this.f13995u.remove(bVar.f13961a);
    }

    @Override
    public final void q() {
        this.I = false;
        this.f13999z = null;
        y2.m mVar = this.A;
        if (mVar != null) {
            mVar.e(null);
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
        this.f13995u.clear();
        t tVar = this.f13988n;
        ((HashMap) tVar.f7345b).clear();
        ((HashMap) tVar.f7346c).clear();
        ((HashMap) tVar.d).clear();
        this.f13986l.release();
    }

    @Override
    public final synchronized void t(k0 k0Var) {
        this.P = k0Var;
    }

    public final void v() {
        boolean z10;
        y2.m mVar;
        y2.m mVar2 = this.A;
        d dVar = new d(this);
        synchronized (z2.c.f48332b) {
            z10 = z2.c.f48333c;
            mVar = mVar2;
        }
        if (z10) {
            dVar.a();
            return;
        }
        if (mVar2 == null) {
            mVar = new y2.m("SntpClient");
        }
        mVar.f(new Object(), new z2.b(dVar), 1);
    }

    public final void w(p pVar, long j3) {
        long j10 = pVar.f46553a;
        Uri uri = pVar.d.f9351c;
        u2.t tVar = new u2.t(j3);
        this.f13987m.getClass();
        this.f13991q.o(tVar, pVar.f46555c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void x(IOException iOException) {
        e2.a.f("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        y(true);
    }

    public final void y(boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: l2.g.y(boolean):void");
    }

    public final void z(lf.g gVar, y2.o oVar) {
        g2.h hVar = this.f13999z;
        Uri parse = Uri.parse(gVar.f14175c);
        Map map = Collections.EMPTY_MAP;
        e2.d.i(parse, "The uri must be set.");
        this.A.f(new p(hVar, new g2.m(parse, 1, null, map, 0L, -1L, null, 1), 5, oVar), new d(this), 1);
    }
}
