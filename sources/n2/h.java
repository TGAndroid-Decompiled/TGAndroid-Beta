package n2;

import a3.q;
import a3.r;
import a3.s;
import a3.t;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.a0;
import android.util.SparseArray;
import b8.kg;
import b8.zb;
import d2.h0;
import d2.i0;
import d2.n0;
import d2.o0;
import i2.c0;
import i2.d0;
import j$.util.Objects;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import w2.e0;
import w2.g0;
import w2.u;
public final class h extends w2.a {
    public q A;
    public d0 B;
    public IOException C;
    public Handler D;
    public Uri E;
    public final Uri F;
    public o2.c G;
    public boolean H;
    public long I;
    public long J;
    public long K;
    public int L;
    public long M;
    public int N;
    public n0 O;
    public h0 P;
    public final boolean h;
    public final i2.g f20159i;
    public final kg f20160j;
    public final ra.e f20161k;
    public final p2.m f20162l;
    public final kb.a f20163m;
    public final za.p f20164n;
    public final long f20165o;
    public final long f20166p;
    public final kg f20167q;
    public final s f20168r;
    public final hi.d f20169s;
    public final Object f20170t;
    public final SparseArray f20171u;
    public final c v;
    public final c f20172w;
    public final f f20173x;
    public final r f20174y;
    public i2.h f20175z;

    static {
        o0.a("media3.exoplayer.dash");
    }

    public h(n0 n0Var, i2.g gVar, s sVar, kg kgVar, ra.e eVar, p2.m mVar, kb.a aVar, long j10, long j11) {
        this.O = n0Var;
        this.P = n0Var.f8242c;
        i0 i0Var = n0Var.f8241b;
        i0Var.getClass();
        Uri uri = i0Var.f8139a;
        this.E = uri;
        this.F = uri;
        this.G = null;
        this.f20159i = gVar;
        this.f20168r = sVar;
        this.f20160j = kgVar;
        this.f20162l = mVar;
        this.f20163m = aVar;
        this.f20165o = j10;
        this.f20166p = j11;
        this.f20161k = eVar;
        this.f20164n = new za.p(6);
        this.h = false;
        this.f20167q = b(null);
        this.f20170t = new Object();
        this.f20171u = new SparseArray();
        this.f20173x = new f(this);
        this.M = -9223372036854775807L;
        this.K = -9223372036854775807L;
        this.f20169s = new hi.d(this, 17);
        this.f20174y = new d(this);
        this.v = new Runnable(this) {
            public final h f20146b;

            {
                this.f20146b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f20146b.C();
                        return;
                    default:
                        h hVar = this.f20146b;
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
        this.f20172w = new Runnable(this) {
            public final h f20146b;

            {
                this.f20146b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f20146b.C();
                        return;
                    default:
                        h hVar = this.f20146b;
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

    public static boolean v(o2.h hVar) {
        List list = hVar.f20542c;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int i10 = ((o2.a) list.get(i3)).f20505b;
            if (i10 == 1 || i10 == 2) {
                return true;
            }
        }
        return false;
    }

    public final void A(e5.a aVar, s sVar) {
        i2.h hVar = this.f20175z;
        Uri parse = Uri.parse(aVar.f9555c);
        Map map = Collections.EMPTY_MAP;
        zb.k(parse, "The uri must be set.");
        this.A.f(new t(hVar, new i2.n(parse, 1, null, map, 0L, -1L, null, 1), 5, sVar), new f(this), 1);
    }

    public final synchronized void B(h0 h0Var) {
        this.P = h0Var;
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
        synchronized (this.f20170t) {
            uri = this.E;
        }
        this.H = false;
        Map map = Collections.EMPTY_MAP;
        zb.k(uri, "The uri must be set.");
        t tVar = new t(this.f20175z, new i2.n(uri, 1, null, map, 0L, -1L, null, 1), 4, this.f20168r);
        hi.d dVar = this.f20169s;
        this.f20163m.getClass();
        this.A.f(tVar, dVar, 3);
    }

    @Override
    public final boolean a(n0 n0Var) {
        i0 i0Var = i().f8241b;
        i0Var.getClass();
        i0 i0Var2 = n0Var.f8241b;
        if (i0Var2 != null && i0Var2.f8139a.equals(i0Var.f8139a) && i0Var2.f8142e.equals(i0Var.f8142e) && Objects.equals(i0Var2.f8141c, i0Var.f8141c)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, a0 a0Var, long j10) {
        int intValue = ((Integer) g0Var.f57081a).intValue() - this.N;
        kg b10 = b(g0Var);
        p2.j jVar = new p2.j(this.d.f53117c, 0, g0Var);
        int i3 = this.N + intValue;
        o2.c cVar = this.G;
        d0 d0Var = this.B;
        long j11 = this.K;
        l2.k kVar = this.f57022g;
        kVar.getClass();
        b bVar = new b(i3, cVar, this.f20164n, intValue, this.f20160j, d0Var, this.f20162l, jVar, this.f20163m, b10, j11, this.f20174y, a0Var, this.f20161k, this.f20173x, kVar);
        this.f20171u.put(i3, bVar);
        return bVar;
    }

    @Override
    public final synchronized n0 i() {
        return this.O;
    }

    @Override
    public final void k() {
        this.f20174y.a();
    }

    @Override
    public final void m(d0 d0Var) {
        this.B = d0Var;
        Looper myLooper = Looper.myLooper();
        l2.k kVar = this.f57022g;
        kVar.getClass();
        p2.m mVar = this.f20162l;
        mVar.k(myLooper, kVar);
        mVar.a();
        if (this.h) {
            z(false);
            return;
        }
        this.f20175z = this.f20159i.createDataSource();
        this.A = new q("DashMediaSource");
        this.D = g2.n0.q(null);
        C();
    }

    @Override
    public final void o(e0 e0Var) {
        b bVar = (b) e0Var;
        p pVar = bVar.f20144y;
        pVar.f20211r = true;
        pVar.d.removeCallbacksAndMessages(null);
        for (x2.i iVar : bVar.I) {
            iVar.B(bVar);
        }
        bVar.H = null;
        this.f20171u.remove(bVar.f20134a);
    }

    @Override
    public final void q() {
        this.H = false;
        this.f20175z = null;
        q qVar = this.A;
        if (qVar != null) {
            qVar.e(null);
            this.A = null;
        }
        h0 h0Var = i().f8242c;
        synchronized (this) {
            this.P = h0Var;
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
        this.f20171u.clear();
        za.p pVar = this.f20164n;
        ((HashMap) pVar.f60311a).clear();
        ((HashMap) pVar.f60312b).clear();
        ((HashMap) pVar.f60313c).clear();
        this.f20162l.release();
    }

    @Override
    public final synchronized void t(n0 n0Var) {
        this.O = n0Var;
        this.P = n0Var.f8242c;
    }

    public final synchronized h0 u() {
        return this.P;
    }

    public final void w() {
        boolean z10;
        q qVar = this.A;
        d dVar = new d(this);
        synchronized (b3.b.f2346b) {
            z10 = b3.b.f2347c;
        }
        if (z10) {
            dVar.b();
            return;
        }
        if (qVar == null) {
            qVar = new q("SntpClient");
        }
        qVar.f(new ra.e(3), new c6.i(dVar, 5), 1);
    }

    public final void x(t tVar, long j10, long j11) {
        long j12 = tVar.f110a;
        i2.n nVar = tVar.f111b;
        c0 c0Var = tVar.d;
        u uVar = new u(nVar, c0Var.f14529c, c0Var.d, j10, j11, c0Var.f14528b);
        this.f20163m.getClass();
        this.f20167q.p(uVar, tVar.f112c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void y(IOException iOException) {
        g2.a.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.K = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        z(true);
    }

    public final void z(boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: n2.h.z(boolean):void");
    }
}
