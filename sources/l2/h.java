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
import com.google.firebase.messaging.s;
import g2.c0;
import ii.n4;
import j$.util.Objects;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import u2.d0;
import u2.t;
public final class h extends u2.a {
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
    public final g2.g f15267i;
    public final a5.a f15268j;
    public final ob.a f15269k;
    public final n2.n f15270l;
    public final qb.b f15271m;
    public final s f15272n;
    public final long f15273o;
    public final long f15274p;
    public final a5.a f15275q;
    public final y2.n f15276r;
    public final a4.m f15277s;
    public final Object f15278t;
    public final SparseArray f15279u;
    public final c v;
    public final c f15280w;
    public final n4 f15281x;
    public final y2.m f15282y;
    public g2.h f15283z;

    static {
        l0.a("media3.exoplayer.dash");
    }

    public h(k0 k0Var, g2.g gVar, y2.n nVar, a5.a aVar, ob.a aVar2, n2.n nVar2, qb.b bVar, long j3, long j10) {
        this.P = k0Var;
        this.E = k0Var.f3322c;
        f0 f0Var = k0Var.f3321b;
        f0Var.getClass();
        Uri uri = f0Var.f3226a;
        this.F = uri;
        this.G = uri;
        this.H = null;
        this.f15267i = gVar;
        this.f15276r = nVar;
        this.f15268j = aVar;
        this.f15270l = nVar2;
        this.f15271m = bVar;
        this.f15273o = j3;
        this.f15274p = j10;
        this.f15269k = aVar2;
        this.f15272n = new s(6);
        this.h = false;
        this.f15275q = b(null);
        this.f15278t = new Object();
        this.f15279u = new SparseArray();
        this.f15281x = new n4(this, 4);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.f15277s = new a4.m(this, 26);
        this.f15282y = new g(this, 0);
        this.v = new Runnable(this) {
            public final h f15253b;

            {
                this.f15253b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f15253b.A();
                        return;
                    default:
                        this.f15253b.y(false);
                        return;
                }
            }
        };
        this.f15280w = new Runnable(this) {
            public final h f15253b;

            {
                this.f15253b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f15253b.A();
                        return;
                    default:
                        this.f15253b.y(false);
                        return;
                }
            }
        };
    }

    public static boolean u(m2.h hVar) {
        List list = hVar.f16001c;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = ((m2.a) list.get(i10)).f15964b;
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
        synchronized (this.f15278t) {
            uri = this.F;
        }
        this.I = false;
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.o oVar = new y2.o(this.f15283z, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, this.f15276r);
        a4.m mVar = this.f15277s;
        this.f15271m.getClass();
        this.A.f(oVar, mVar, 3);
    }

    @Override
    public final boolean a(k0 k0Var) {
        k0 i10 = i();
        f0 f0Var = i10.f3321b;
        f0Var.getClass();
        f0 f0Var2 = k0Var.f3321b;
        if (f0Var2 != null && f0Var2.f3226a.equals(f0Var.f3226a) && f0Var2.f3229e.equals(f0Var.f3229e) && Objects.equals(f0Var2.f3228c, f0Var.f3228c) && i10.f3322c.equals(k0Var.f3322c)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(u2.f0 f0Var, y2.d dVar, long j3) {
        int intValue = ((Integer) f0Var.f47254a).intValue() - this.O;
        a5.a b10 = b(f0Var);
        n2.k kVar = new n2.k(this.d.f16545c, 0, f0Var);
        int i10 = this.O + intValue;
        m2.c cVar = this.H;
        c0 c0Var = this.B;
        long j10 = this.L;
        j2.k kVar2 = this.f47199g;
        e2.d.h(kVar2);
        b bVar = new b(i10, cVar, this.f15272n, intValue, this.f15268j, c0Var, this.f15270l, kVar, this.f15271m, b10, j10, this.f15282y, dVar, this.f15269k, this.f15281x, kVar2);
        this.f15279u.put(i10, bVar);
        return bVar;
    }

    @Override
    public final synchronized k0 i() {
        return this.P;
    }

    @Override
    public final void k() {
        this.f15282y.a();
    }

    @Override
    public final void m(c0 c0Var) {
        this.B = c0Var;
        Looper myLooper = Looper.myLooper();
        j2.k kVar = this.f47199g;
        e2.d.h(kVar);
        n2.n nVar = this.f15270l;
        nVar.C(myLooper, kVar);
        nVar.b();
        if (this.h) {
            y(false);
            return;
        }
        this.f15283z = this.f15267i.createDataSource();
        this.A = new y2.l("DashMediaSource");
        this.D = e2.d0.o(null);
        A();
    }

    @Override
    public final void o(d0 d0Var) {
        b bVar = (b) d0Var;
        p pVar = bVar.f15250x;
        pVar.f15319r = true;
        pVar.d.removeCallbacksAndMessages(null);
        for (v2.h hVar : bVar.H) {
            hVar.B(bVar);
        }
        bVar.G = null;
        this.f15279u.remove(bVar.f15241a);
    }

    @Override
    public final void q() {
        this.I = false;
        this.f15283z = null;
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
        this.f15279u.clear();
        s sVar = this.f15272n;
        ((HashMap) sVar.f7921b).clear();
        ((HashMap) sVar.f7922c).clear();
        ((HashMap) sVar.d).clear();
        this.f15270l.release();
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
        synchronized (z2.b.f52351b) {
            z10 = z2.b.f52352c;
            lVar = lVar2;
        }
        if (z10) {
            dVar.a();
            return;
        }
        if (lVar2 == null) {
            lVar = new y2.l("SntpClient");
        }
        lVar.f(new Object(), new n2.c(dVar, 27), 1);
    }

    public final void w(y2.o oVar, long j3) {
        long j10 = oVar.f50402a;
        Uri uri = oVar.d.f10161c;
        t tVar = new t(j3);
        this.f15271m.getClass();
        this.f15275q.o(tVar, oVar.f50404c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void x(IOException iOException) {
        e2.a.f("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        y(true);
    }

    public final void y(boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: l2.h.y(boolean):void");
    }

    public final void z(lf.g gVar, y2.n nVar) {
        g2.h hVar = this.f15283z;
        Uri parse = Uri.parse(gVar.f15487c);
        Map map = Collections.EMPTY_MAP;
        e2.d.i(parse, "The uri must be set.");
        this.A.f(new y2.o(hVar, new g2.m(parse, 1, null, map, 0L, -1L, null, 1), 5, nVar), new d(this), 1);
    }
}
