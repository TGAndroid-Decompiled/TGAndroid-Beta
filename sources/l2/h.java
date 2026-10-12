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
    public final g2.g f15082i;
    public final a5.a f15083j;
    public final na.d f15084k;
    public final n2.m f15085l;
    public final t f15086m;
    public final s f15087n;
    public final long f15088o;
    public final long f15089p;
    public final a5.a f15090q;
    public final y2.n f15091r;
    public final g f15092s;
    public final Object f15093t;
    public final SparseArray f15094u;
    public final c v;
    public final c f15095w;
    public final a6.m f15096x;
    public final y2.m f15097y;
    public g2.h f15098z;

    static {
        l0.a("media3.exoplayer.dash");
    }

    public h(k0 k0Var, g2.g gVar, y2.n nVar, a5.a aVar, na.d dVar, n2.m mVar, t tVar, long j3, long j10) {
        this.P = k0Var;
        this.E = k0Var.f3399c;
        f0 f0Var = k0Var.f3398b;
        f0Var.getClass();
        Uri uri = f0Var.f3303a;
        this.F = uri;
        this.G = uri;
        this.H = null;
        this.f15082i = gVar;
        this.f15091r = nVar;
        this.f15083j = aVar;
        this.f15085l = mVar;
        this.f15086m = tVar;
        this.f15088o = j3;
        this.f15089p = j10;
        this.f15084k = dVar;
        this.f15087n = new s(6);
        this.h = false;
        this.f15090q = b(null);
        this.f15093t = new Object();
        this.f15094u = new SparseArray();
        this.f15096x = new a6.m(this, 29);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.f15092s = new g(this, 0);
        this.f15097y = new g0(this, 2);
        this.v = new Runnable(this) {
            public final h f15068b;

            {
                this.f15068b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f15068b.A();
                        return;
                    default:
                        this.f15068b.y(false);
                        return;
                }
            }
        };
        this.f15095w = new Runnable(this) {
            public final h f15068b;

            {
                this.f15068b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f15068b.A();
                        return;
                    default:
                        this.f15068b.y(false);
                        return;
                }
            }
        };
    }

    public static boolean u(m2.h hVar) {
        List list = hVar.f15691c;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = ((m2.a) list.get(i10)).f15654b;
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
        synchronized (this.f15093t) {
            uri = this.F;
        }
        this.I = false;
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.o oVar = new y2.o(this.f15098z, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, this.f15091r);
        g gVar = this.f15092s;
        this.f15086m.getClass();
        this.A.f(oVar, gVar, 3);
    }

    @Override
    public final boolean a(k0 k0Var) {
        k0 i10 = i();
        f0 f0Var = i10.f3398b;
        f0Var.getClass();
        f0 f0Var2 = k0Var.f3398b;
        if (f0Var2 != null && f0Var2.f3303a.equals(f0Var.f3303a) && f0Var2.f3306e.equals(f0Var.f3306e) && Objects.equals(f0Var2.f3305c, f0Var.f3305c) && i10.f3399c.equals(k0Var.f3399c)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(u2.f0 f0Var, y2.d dVar, long j3) {
        int intValue = ((Integer) f0Var.f48789a).intValue() - this.O;
        a5.a b10 = b(f0Var);
        n2.j jVar = new n2.j(this.d.f16269c, 0, f0Var);
        int i10 = this.O + intValue;
        m2.c cVar = this.H;
        c0 c0Var = this.B;
        long j10 = this.L;
        j2.k kVar = this.f48753g;
        e2.d.h(kVar);
        b bVar = new b(i10, cVar, this.f15087n, intValue, this.f15083j, c0Var, this.f15085l, jVar, this.f15086m, b10, j10, this.f15097y, dVar, this.f15084k, this.f15096x, kVar);
        this.f15094u.put(i10, bVar);
        return bVar;
    }

    @Override
    public final synchronized k0 i() {
        return this.P;
    }

    @Override
    public final void k() {
        this.f15097y.a();
    }

    @Override
    public final void m(c0 c0Var) {
        this.B = c0Var;
        Looper myLooper = Looper.myLooper();
        j2.k kVar = this.f48753g;
        e2.d.h(kVar);
        n2.m mVar = this.f15085l;
        mVar.D(myLooper, kVar);
        mVar.b();
        if (this.h) {
            y(false);
            return;
        }
        this.f15098z = this.f15082i.createDataSource();
        this.A = new y2.l("DashMediaSource");
        this.D = e2.d0.o(null);
        A();
    }

    @Override
    public final void o(d0 d0Var) {
        b bVar = (b) d0Var;
        p pVar = bVar.f15065x;
        pVar.f15134r = true;
        pVar.d.removeCallbacksAndMessages(null);
        for (v2.h hVar : bVar.H) {
            hVar.A(bVar);
        }
        bVar.G = null;
        this.f15094u.remove(bVar.f15056a);
    }

    @Override
    public final void q() {
        this.I = false;
        this.f15098z = null;
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
        this.f15094u.clear();
        s sVar = this.f15087n;
        ((HashMap) sVar.f7967b).clear();
        ((HashMap) sVar.f7968c).clear();
        ((HashMap) sVar.d).clear();
        this.f15085l.release();
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
        synchronized (z2.b.f53718b) {
            z10 = z2.b.f53719c;
            lVar = lVar2;
        }
        if (z10) {
            dVar.a();
            return;
        }
        if (lVar2 == null) {
            lVar = new y2.l("SntpClient");
        }
        lVar.f(new Object(), new n4.l(dVar), 1);
    }

    public final void w(y2.o oVar, long j3) {
        long j10 = oVar.f51931a;
        Uri uri = oVar.d.f10233c;
        u2.t tVar = new u2.t(j3);
        this.f15086m.getClass();
        this.f15090q.p(tVar, oVar.f51933c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void x(IOException iOException) {
        e2.a.f("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        y(true);
    }

    public final void y(boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: l2.h.y(boolean):void");
    }

    public final void z(pf.b bVar, y2.n nVar) {
        g2.h hVar = this.f15098z;
        Uri parse = Uri.parse((String) bVar.f45449c);
        Map map = Collections.EMPTY_MAP;
        e2.d.i(parse, "The uri must be set.");
        this.A.f(new y2.o(hVar, new g2.m(parse, 1, null, map, 0L, -1L, null, 1), 5, nVar), new d(this), 1);
    }
}
