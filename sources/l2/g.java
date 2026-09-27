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
public final class g extends u2.a {
    public y2.l A;
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
    public final g2.g f14050i;
    public final a5.a f14051j;
    public final ob.a f14052k;
    public final n2.m f14053l;
    public final qb.b f14054m;
    public final t f14055n;
    public final long f14056o;
    public final long f14057p;
    public final a5.a f14058q;
    public final y2.n f14059r;
    public final l.d f14060s;
    public final Object f14061t;
    public final SparseArray f14062u;
    public final c v;
    public final c f14063w;
    public final u f14064x;
    public final y2.m f14065y;
    public g2.h f14066z;

    static {
        l0.a("media3.exoplayer.dash");
    }

    public g(k0 k0Var, g2.g gVar, y2.n nVar, a5.a aVar, ob.a aVar2, n2.m mVar, qb.b bVar, long j3, long j10) {
        this.P = k0Var;
        this.E = k0Var.f3073c;
        f0 f0Var = k0Var.f3072b;
        f0Var.getClass();
        Uri uri = f0Var.f2987a;
        this.F = uri;
        this.G = uri;
        this.H = null;
        this.f14050i = gVar;
        this.f14059r = nVar;
        this.f14051j = aVar;
        this.f14053l = mVar;
        this.f14054m = bVar;
        this.f14056o = j3;
        this.f14057p = j10;
        this.f14052k = aVar2;
        this.f14055n = new t(6);
        this.h = false;
        this.f14058q = b(null);
        this.f14061t = new Object();
        this.f14062u = new SparseArray();
        this.f14064x = new u(this);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.f14060s = new l.d(this);
        this.f14065y = new a4.m(this, 25);
        this.v = new Runnable(this) {
            public final g f14039b;

            {
                this.f14039b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f14039b.A();
                        return;
                    default:
                        this.f14039b.y(false);
                        return;
                }
            }
        };
        this.f14063w = new Runnable(this) {
            public final g f14039b;

            {
                this.f14039b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f14039b.A();
                        return;
                    default:
                        this.f14039b.y(false);
                        return;
                }
            }
        };
    }

    public static boolean u(m2.h hVar) {
        List list = hVar.f14688c;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = ((m2.a) list.get(i10)).f14655b;
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
        synchronized (this.f14061t) {
            uri = this.F;
        }
        this.I = false;
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.o oVar = new y2.o(this.f14066z, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, this.f14059r);
        l.d dVar = this.f14060s;
        this.f14054m.getClass();
        this.A.f(oVar, dVar, 3);
    }

    @Override
    public final boolean a(k0 k0Var) {
        k0 i10 = i();
        f0 f0Var = i10.f3072b;
        f0Var.getClass();
        f0 f0Var2 = k0Var.f3072b;
        if (f0Var2 != null && f0Var2.f2987a.equals(f0Var.f2987a) && f0Var2.e.equals(f0Var.e) && Objects.equals(f0Var2.f2989c, f0Var.f2989c) && i10.f3073c.equals(k0Var.f3073c)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(u2.f0 f0Var, y2.d dVar, long j3) {
        int intValue = ((Integer) f0Var.f43687a).intValue() - this.O;
        a5.a b10 = b(f0Var);
        n2.j jVar = new n2.j(this.d.f15170c, 0, f0Var);
        int i10 = this.O + intValue;
        m2.c cVar = this.H;
        c0 c0Var = this.B;
        long j10 = this.L;
        j2.k kVar = this.f43633g;
        e2.d.h(kVar);
        b bVar = new b(i10, cVar, this.f14055n, intValue, this.f14051j, c0Var, this.f14053l, jVar, this.f14054m, b10, j10, this.f14065y, dVar, this.f14052k, this.f14064x, kVar);
        this.f14062u.put(i10, bVar);
        return bVar;
    }

    @Override
    public final synchronized k0 i() {
        return this.P;
    }

    @Override
    public final void k() {
        this.f14065y.a();
    }

    @Override
    public final void m(c0 c0Var) {
        this.B = c0Var;
        Looper myLooper = Looper.myLooper();
        j2.k kVar = this.f43633g;
        e2.d.h(kVar);
        n2.m mVar = this.f14053l;
        mVar.C(myLooper, kVar);
        mVar.b();
        if (this.h) {
            y(false);
            return;
        }
        this.f14066z = this.f14050i.createDataSource();
        this.A = new y2.l("DashMediaSource");
        this.D = e2.d0.o(null);
        A();
    }

    @Override
    public final void o(d0 d0Var) {
        b bVar = (b) d0Var;
        o oVar = bVar.f14036x;
        oVar.f14097r = true;
        oVar.d.removeCallbacksAndMessages(null);
        for (v2.h hVar : bVar.H) {
            hVar.B(bVar);
        }
        bVar.G = null;
        this.f14062u.remove(bVar.f14028a);
    }

    @Override
    public final void q() {
        this.I = false;
        this.f14066z = null;
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
        this.f14062u.clear();
        t tVar = this.f14055n;
        ((HashMap) tVar.f7336b).clear();
        ((HashMap) tVar.f7337c).clear();
        ((HashMap) tVar.d).clear();
        this.f14053l.release();
    }

    @Override
    public final synchronized void t(k0 k0Var) {
        this.P = k0Var;
    }

    public final void v() {
        boolean z10;
        y2.l lVar;
        y2.l lVar2 = this.A;
        d dVar = new d(this);
        synchronized (z2.b.f48395b) {
            z10 = z2.b.f48396c;
            lVar = lVar2;
        }
        if (z10) {
            dVar.a();
            return;
        }
        if (lVar2 == null) {
            lVar = new y2.l("SntpClient");
        }
        lVar.f(new Object(), new ka.c(dVar, 28), 1);
    }

    public final void w(y2.o oVar, long j3) {
        long j10 = oVar.f46622a;
        Uri uri = oVar.d.f9339c;
        u2.t tVar = new u2.t(j3);
        this.f14054m.getClass();
        this.f14058q.o(tVar, oVar.f46624c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void x(IOException iOException) {
        e2.a.f("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        y(true);
    }

    public final void y(boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: l2.g.y(boolean):void");
    }

    public final void z(lf.g gVar, y2.n nVar) {
        g2.h hVar = this.f14066z;
        Uri parse = Uri.parse(gVar.f14247c);
        Map map = Collections.EMPTY_MAP;
        e2.d.i(parse, "The uri must be set.");
        this.A.f(new y2.o(hVar, new g2.m(parse, 1, null, map, 0L, -1L, null, 1), 5, nVar), new d(this), 1);
    }
}
