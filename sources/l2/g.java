package l2;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import b2.j0;
import b2.k0;
import b2.p0;
import b2.q0;
import e2.m0;
import g2.b0;
import g2.c0;
import j$.util.Objects;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ji.h5;
import ji.w4;
import m2.t;
import u2.e0;
import u2.g0;
import u2.u;
import v7.u6;
public final class g extends u2.a {
    public y2.l A;
    public c0 B;
    public IOException C;
    public Handler D;
    public Uri E;
    public final Uri F;
    public m2.c G;
    public boolean H;
    public long I;
    public long J;
    public long K;
    public int L;
    public long M;
    public int N;
    public p0 O;
    public j0 P;
    public final boolean h;
    public final g2.g f14505i;
    public final a5.a f14506j;
    public final oa.d f14507k;
    public final n2.m f14508l;
    public final oa.d f14509m;
    public final pi.e f14510n;
    public final long f14511o;
    public final long f14512p;
    public final a5.a f14513q;
    public final y2.n f14514r;
    public final w4 f14515s;
    public final Object f14516t;
    public final SparseArray f14517u;
    public final c v;
    public final c f14518w;
    public final a6.m f14519x;
    public final y2.m f14520y;
    public g2.h f14521z;

    static {
        q0.a("media3.exoplayer.dash");
    }

    public g(p0 p0Var, g2.g gVar, y2.n nVar, a5.a aVar, oa.d dVar, n2.m mVar, oa.d dVar2, long j10, long j11) {
        this.O = p0Var;
        this.P = p0Var.f2283c;
        k0 k0Var = p0Var.f2282b;
        k0Var.getClass();
        Uri uri = k0Var.f2192a;
        this.E = uri;
        this.F = uri;
        this.G = null;
        this.f14505i = gVar;
        this.f14514r = nVar;
        this.f14506j = aVar;
        this.f14508l = mVar;
        this.f14509m = dVar2;
        this.f14511o = j10;
        this.f14512p = j11;
        this.f14507k = dVar;
        this.f14510n = new pi.e(5);
        this.h = false;
        this.f14513q = b(null);
        this.f14516t = new Object();
        this.f14517u = new SparseArray();
        this.f14519x = new a6.m(this, 29);
        this.M = -9223372036854775807L;
        this.K = -9223372036854775807L;
        this.f14515s = new w4(this, 3);
        this.f14520y = new h5(this, 3);
        this.v = new Runnable(this) {
            public final g f14494b;

            {
                this.f14494b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f14494b.C();
                        return;
                    default:
                        g gVar2 = this.f14494b;
                        gVar2.getClass();
                        try {
                            gVar2.z(false);
                            return;
                        } catch (Exception e) {
                            gVar2.C = new IOException(e);
                            return;
                        }
                }
            }
        };
        this.f14518w = new Runnable(this) {
            public final g f14494b;

            {
                this.f14494b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f14494b.C();
                        return;
                    default:
                        g gVar2 = this.f14494b;
                        gVar2.getClass();
                        try {
                            gVar2.z(false);
                            return;
                        } catch (Exception e) {
                            gVar2.C = new IOException(e);
                            return;
                        }
                }
            }
        };
    }

    public static boolean v(m2.h hVar) {
        List list = hVar.f15083c;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = ((m2.a) list.get(i10)).f15050b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    public final void A(t tVar, y2.n nVar) {
        g2.h hVar = this.f14521z;
        Uri parse = Uri.parse((String) tVar.f15111c);
        Map map = Collections.EMPTY_MAP;
        u6.l(parse, "The uri must be set.");
        this.A.f(new y2.o(hVar, new g2.m(parse, 1, null, map, 0L, -1L, null, 1), 5, nVar), new d(this), 1);
    }

    public final synchronized void B(j0 j0Var) {
        this.P = j0Var;
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
        synchronized (this.f14516t) {
            uri = this.E;
        }
        this.H = false;
        Map map = Collections.EMPTY_MAP;
        u6.l(uri, "The uri must be set.");
        y2.o oVar = new y2.o(this.f14521z, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, this.f14514r);
        w4 w4Var = this.f14515s;
        this.f14509m.getClass();
        this.A.f(oVar, w4Var, 3);
    }

    @Override
    public final boolean a(p0 p0Var) {
        k0 k0Var = i().f2282b;
        k0Var.getClass();
        k0 k0Var2 = p0Var.f2282b;
        if (k0Var2 != null && k0Var2.f2192a.equals(k0Var.f2192a) && k0Var2.e.equals(k0Var.e) && Objects.equals(k0Var2.f2194c, k0Var.f2194c)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, androidx.biometric.e eVar, long j10) {
        int intValue = ((Integer) g0Var.f45920a).intValue() - this.N;
        a5.a b10 = b(g0Var);
        n2.j jVar = new n2.j(this.d.f15676c, 0, g0Var);
        int i10 = this.N + intValue;
        m2.c cVar = this.G;
        c0 c0Var = this.B;
        long j11 = this.K;
        j2.k kVar = this.f45863g;
        kVar.getClass();
        b bVar = new b(i10, cVar, this.f14510n, intValue, this.f14506j, c0Var, this.f14508l, jVar, this.f14509m, b10, j11, this.f14520y, eVar, this.f14507k, this.f14519x, kVar);
        this.f14517u.put(i10, bVar);
        return bVar;
    }

    @Override
    public final synchronized p0 i() {
        return this.O;
    }

    @Override
    public final void k() {
        this.f14520y.b();
    }

    @Override
    public final void m(c0 c0Var) {
        this.B = c0Var;
        Looper myLooper = Looper.myLooper();
        j2.k kVar = this.f45863g;
        kVar.getClass();
        n2.m mVar = this.f14508l;
        mVar.F(myLooper, kVar);
        mVar.b();
        if (this.h) {
            z(false);
            return;
        }
        this.f14521z = this.f14505i.createDataSource();
        this.A = new y2.l("DashMediaSource");
        this.D = m0.q(null);
        C();
    }

    @Override
    public final void o(e0 e0Var) {
        b bVar = (b) e0Var;
        o oVar = bVar.f14491x;
        oVar.f14552r = true;
        oVar.d.removeCallbacksAndMessages(null);
        for (v2.i iVar : bVar.H) {
            iVar.C(bVar);
        }
        bVar.G = null;
        this.f14517u.remove(bVar.f14483a);
    }

    @Override
    public final void q() {
        this.H = false;
        this.f14521z = null;
        y2.l lVar = this.A;
        if (lVar != null) {
            lVar.e(null);
            this.A = null;
        }
        j0 j0Var = i().f2283c;
        synchronized (this) {
            this.P = j0Var;
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
        this.f14517u.clear();
        pi.e eVar = this.f14510n;
        ((HashMap) eVar.f42944a).clear();
        ((HashMap) eVar.f42945b).clear();
        ((HashMap) eVar.f42946c).clear();
        this.f14508l.release();
    }

    @Override
    public final synchronized void t(p0 p0Var) {
        this.O = p0Var;
        this.P = p0Var.f2283c;
    }

    public final synchronized j0 u() {
        return this.P;
    }

    public final void w() {
        boolean z10;
        y2.l lVar = this.A;
        d dVar = new d(this);
        synchronized (z2.b.f49244b) {
            z10 = z2.b.f49245c;
        }
        if (z10) {
            dVar.a();
            return;
        }
        if (lVar == null) {
            lVar = new y2.l("SntpClient");
        }
        lVar.f(new pb.a(28), new m.h(dVar, 25), 1);
    }

    public final void x(y2.o oVar, long j10, long j11) {
        long j12 = oVar.f48545a;
        g2.m mVar = oVar.f48546b;
        b0 b0Var = oVar.d;
        u uVar = new u(mVar, b0Var.f9859c, b0Var.d, j10, j11, b0Var.f9858b);
        this.f14509m.getClass();
        this.f14513q.q(uVar, oVar.f48547c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void y(IOException iOException) {
        e2.a.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.K = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        z(true);
    }

    public final void z(boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: l2.g.z(boolean):void");
    }
}
