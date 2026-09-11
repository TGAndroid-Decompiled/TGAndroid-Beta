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
import g2.c0;
import j$.util.Objects;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ji.u4;
import m2.u;
import u2.d0;
import u2.t;
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
    public final g2.g f15206i;
    public final a5.a f15207j;
    public final qb.b f15208k;
    public final n2.m f15209l;
    public final rb.a f15210m;
    public final fg.f f15211n;
    public final long f15212o;
    public final long f15213p;
    public final a5.a f15214q;
    public final y2.o f15215r;
    public final l.d f15216s;
    public final Object f15217t;
    public final SparseArray f15218u;
    public final c v;
    public final c f15219w;
    public final u4 f15220x;
    public final y2.n f15221y;
    public g2.h f15222z;

    static {
        l0.a("media3.exoplayer.dash");
    }

    public g(k0 k0Var, g2.g gVar, y2.o oVar, a5.a aVar, qb.b bVar, n2.m mVar, rb.a aVar2, long j3, long j10) {
        this.P = k0Var;
        this.E = k0Var.f2128c;
        f0 f0Var = k0Var.f2127b;
        f0Var.getClass();
        Uri uri = f0Var.f2032a;
        this.F = uri;
        this.G = uri;
        this.H = null;
        this.f15206i = gVar;
        this.f15215r = oVar;
        this.f15207j = aVar;
        this.f15209l = mVar;
        this.f15210m = aVar2;
        this.f15212o = j3;
        this.f15213p = j10;
        this.f15208k = bVar;
        this.f15211n = new fg.f(5);
        this.h = false;
        this.f15214q = b(null);
        this.f15217t = new Object();
        this.f15218u = new SparseArray();
        this.f15220x = new u4(this, 3);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.f15216s = new l.d(this, 1);
        this.f15221y = new xa.c(this, 27);
        this.v = new Runnable(this) {
            public final g f15194b;

            {
                this.f15194b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f15194b.A();
                        return;
                    default:
                        this.f15194b.y(false);
                        return;
                }
            }
        };
        this.f15219w = new Runnable(this) {
            public final g f15194b;

            {
                this.f15194b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f15194b.A();
                        return;
                    default:
                        this.f15194b.y(false);
                        return;
                }
            }
        };
    }

    public static boolean u(m2.h hVar) {
        List list = hVar.f15786c;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = ((m2.a) list.get(i10)).f15749b;
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
        synchronized (this.f15217t) {
            uri = this.F;
        }
        this.I = false;
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        p pVar = new p(this.f15222z, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, this.f15215r);
        l.d dVar = this.f15216s;
        this.f15210m.getClass();
        this.A.f(pVar, dVar, 3);
    }

    @Override
    public final boolean a(k0 k0Var) {
        k0 i10 = i();
        f0 f0Var = i10.f2127b;
        f0Var.getClass();
        f0 f0Var2 = k0Var.f2127b;
        if (f0Var2 != null && f0Var2.f2032a.equals(f0Var.f2032a) && f0Var2.f2035e.equals(f0Var.f2035e) && Objects.equals(f0Var2.f2034c, f0Var.f2034c) && i10.f2128c.equals(k0Var.f2128c)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(u2.f0 f0Var, y2.d dVar, long j3) {
        int intValue = ((Integer) f0Var.f46667a).intValue() - this.O;
        a5.a b10 = b(f0Var);
        n2.j jVar = new n2.j(this.d.f16402c, 0, f0Var);
        int i10 = this.O + intValue;
        m2.c cVar = this.H;
        c0 c0Var = this.B;
        long j10 = this.L;
        j2.k kVar = this.f46609g;
        e2.d.h(kVar);
        b bVar = new b(i10, cVar, this.f15211n, intValue, this.f15207j, c0Var, this.f15209l, jVar, this.f15210m, b10, j10, this.f15221y, dVar, this.f15208k, this.f15220x, kVar);
        this.f15218u.put(i10, bVar);
        return bVar;
    }

    @Override
    public final synchronized k0 i() {
        return this.P;
    }

    @Override
    public final void k() {
        this.f15221y.b();
    }

    @Override
    public final void m(c0 c0Var) {
        this.B = c0Var;
        Looper myLooper = Looper.myLooper();
        j2.k kVar = this.f46609g;
        e2.d.h(kVar);
        n2.m mVar = this.f15209l;
        mVar.B(myLooper, kVar);
        mVar.b();
        if (this.h) {
            y(false);
            return;
        }
        this.f15222z = this.f15206i.createDataSource();
        this.A = new y2.m("DashMediaSource");
        this.D = e2.d0.o(null);
        A();
    }

    @Override
    public final void o(d0 d0Var) {
        b bVar = (b) d0Var;
        o oVar = bVar.f15191x;
        oVar.f15258r = true;
        oVar.d.removeCallbacksAndMessages(null);
        for (v2.h hVar : bVar.H) {
            hVar.C(bVar);
        }
        bVar.G = null;
        this.f15218u.remove(bVar.f15182a);
    }

    @Override
    public final void q() {
        this.I = false;
        this.f15222z = null;
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
        this.f15218u.clear();
        fg.f fVar = this.f15211n;
        ((HashMap) fVar.f9492a).clear();
        ((HashMap) fVar.f9493b).clear();
        ((HashMap) fVar.f9494c).clear();
        this.f15209l.release();
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
        synchronized (z2.c.f50680b) {
            z10 = z2.c.f50681c;
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
        long j10 = pVar.f49521a;
        Uri uri = pVar.d.f10298c;
        t tVar = new t(j3);
        this.f15210m.getClass();
        this.f15214q.n(tVar, pVar.f49523c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void x(IOException iOException) {
        e2.a.f("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        y(true);
    }

    public final void y(boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: l2.g.y(boolean):void");
    }

    public final void z(u uVar, y2.o oVar) {
        g2.h hVar = this.f15222z;
        Uri parse = Uri.parse(uVar.f15821c);
        Map map = Collections.EMPTY_MAP;
        e2.d.i(parse, "The uri must be set.");
        this.A.f(new p(hVar, new g2.m(parse, 1, null, map, 0L, -1L, null, 1), 5, oVar), new d(this), 1);
    }
}
