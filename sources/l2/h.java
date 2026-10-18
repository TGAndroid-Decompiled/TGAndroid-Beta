package l2;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import b2.i0;
import b2.j0;
import b2.o0;
import b2.p0;
import e2.m0;
import g2.b0;
import g2.c0;
import j$.util.Objects;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ki.t1;
import m2.t;
import u2.d0;
import u2.f0;
import v7.u6;
public final class h extends u2.a {
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
    public o0 O;
    public i0 P;
    public final boolean h;
    public final g2.g f15846i;
    public final a5.a f15847j;
    public final oa.d f15848k;
    public final n2.n f15849l;
    public final oa.d f15850m;
    public final qi.e f15851n;
    public final long f15852o;
    public final long f15853p;
    public final a5.a f15854q;
    public final y2.n f15855r;
    public final t1 f15856s;
    public final Object f15857t;
    public final SparseArray f15858u;
    public final c v;
    public final c f15859w;
    public final f f15860x;
    public final y2.m f15861y;
    public g2.h f15862z;

    static {
        p0.a("media3.exoplayer.dash");
    }

    public h(o0 o0Var, g2.g gVar, y2.n nVar, a5.a aVar, oa.d dVar, n2.n nVar2, oa.d dVar2, long j10, long j11) {
        this.O = o0Var;
        this.P = o0Var.f3892c;
        j0 j0Var = o0Var.f3891b;
        j0Var.getClass();
        Uri uri = j0Var.f3801a;
        this.E = uri;
        this.F = uri;
        this.G = null;
        this.f15846i = gVar;
        this.f15855r = nVar;
        this.f15847j = aVar;
        this.f15849l = nVar2;
        this.f15850m = dVar2;
        this.f15852o = j10;
        this.f15853p = j11;
        this.f15848k = dVar;
        this.f15851n = new qi.e(5);
        this.h = false;
        this.f15854q = b(null);
        this.f15857t = new Object();
        this.f15858u = new SparseArray();
        this.f15860x = new f(this, 0);
        this.M = -9223372036854775807L;
        this.K = -9223372036854775807L;
        this.f15856s = new t1(this, 3);
        this.f15861y = new ag.b(this, 29);
        this.v = new Runnable(this) {
            public final h f15833b;

            {
                this.f15833b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f15833b.C();
                        return;
                    default:
                        h hVar = this.f15833b;
                        hVar.getClass();
                        try {
                            hVar.z(false);
                            return;
                        } catch (Exception e) {
                            hVar.C = new IOException(e);
                            return;
                        }
                }
            }
        };
        this.f15859w = new Runnable(this) {
            public final h f15833b;

            {
                this.f15833b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f15833b.C();
                        return;
                    default:
                        h hVar = this.f15833b;
                        hVar.getClass();
                        try {
                            hVar.z(false);
                            return;
                        } catch (Exception e) {
                            hVar.C = new IOException(e);
                            return;
                        }
                }
            }
        };
    }

    public static boolean v(m2.h hVar) {
        List list = hVar.f16443c;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = ((m2.a) list.get(i10)).f16410b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    public final void A(t tVar, y2.n nVar) {
        g2.h hVar = this.f15862z;
        Uri parse = Uri.parse(tVar.f16471c);
        Map map = Collections.EMPTY_MAP;
        u6.l(parse, "The uri must be set.");
        this.A.f(new y2.o(hVar, new g2.m(parse, 1, null, map, 0L, -1L, null, 1), 5, nVar), new d(this), 1);
    }

    public final synchronized void B(i0 i0Var) {
        this.P = i0Var;
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
        synchronized (this.f15857t) {
            uri = this.E;
        }
        this.H = false;
        Map map = Collections.EMPTY_MAP;
        u6.l(uri, "The uri must be set.");
        y2.o oVar = new y2.o(this.f15862z, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, this.f15855r);
        t1 t1Var = this.f15856s;
        this.f15850m.getClass();
        this.A.f(oVar, t1Var, 3);
    }

    @Override
    public final boolean a(o0 o0Var) {
        j0 j0Var = i().f3891b;
        j0Var.getClass();
        j0 j0Var2 = o0Var.f3891b;
        if (j0Var2 != null && j0Var2.f3801a.equals(j0Var.f3801a) && j0Var2.e.equals(j0Var.e) && Objects.equals(j0Var2.f3803c, j0Var.f3803c)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, androidx.biometric.e eVar, long j10) {
        int intValue = ((Integer) f0Var.f47347a).intValue() - this.N;
        a5.a b10 = b(f0Var);
        n2.k kVar = new n2.k(this.d.f17062c, 0, f0Var);
        int i10 = this.N + intValue;
        m2.c cVar = this.G;
        c0 c0Var = this.B;
        long j11 = this.K;
        j2.k kVar2 = this.f47295g;
        kVar2.getClass();
        b bVar = new b(i10, cVar, this.f15851n, intValue, this.f15847j, c0Var, this.f15849l, kVar, this.f15850m, b10, j11, this.f15861y, eVar, this.f15848k, this.f15860x, kVar2);
        this.f15858u.put(i10, bVar);
        return bVar;
    }

    @Override
    public final synchronized o0 i() {
        return this.O;
    }

    @Override
    public final void k() {
        this.f15861y.a();
    }

    @Override
    public final void m(c0 c0Var) {
        this.B = c0Var;
        Looper myLooper = Looper.myLooper();
        j2.k kVar = this.f47295g;
        kVar.getClass();
        n2.n nVar = this.f15849l;
        nVar.E(myLooper, kVar);
        nVar.b();
        if (this.h) {
            z(false);
            return;
        }
        this.f15862z = this.f15846i.createDataSource();
        this.A = new y2.l("DashMediaSource");
        this.D = m0.q(null);
        C();
    }

    @Override
    public final void o(d0 d0Var) {
        b bVar = (b) d0Var;
        p pVar = bVar.f15830x;
        pVar.f15893r = true;
        pVar.d.removeCallbacksAndMessages(null);
        for (v2.i iVar : bVar.H) {
            iVar.C(bVar);
        }
        bVar.G = null;
        this.f15858u.remove(bVar.f15822a);
    }

    @Override
    public final void q() {
        this.H = false;
        this.f15862z = null;
        y2.l lVar = this.A;
        if (lVar != null) {
            lVar.e(null);
            this.A = null;
        }
        i0 i0Var = i().f3892c;
        synchronized (this) {
            this.P = i0Var;
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
        this.f15858u.clear();
        qi.e eVar = this.f15851n;
        ((HashMap) eVar.f44797a).clear();
        ((HashMap) eVar.f44798b).clear();
        ((HashMap) eVar.f44799c).clear();
        this.f15849l.release();
    }

    @Override
    public final synchronized void t(o0 o0Var) {
        this.O = o0Var;
        this.P = o0Var.f3892c;
    }

    public final synchronized i0 u() {
        return this.P;
    }

    public final void w() {
        boolean z10;
        y2.l lVar = this.A;
        d dVar = new d(this);
        synchronized (z2.b.f50675b) {
            z10 = z2.b.f50676c;
        }
        if (z10) {
            dVar.a();
            return;
        }
        if (lVar == null) {
            lVar = new y2.l("SntpClient");
        }
        lVar.f(new pb.a(28), new f(dVar, 27), 1);
    }

    public final void x(y2.o oVar, long j10, long j11) {
        long j12 = oVar.f49975a;
        g2.m mVar = oVar.f49976b;
        b0 b0Var = oVar.d;
        u2.t tVar = new u2.t(mVar, b0Var.f10767c, b0Var.d, j10, j11, b0Var.f10766b);
        this.f15850m.getClass();
        this.f15854q.q(tVar, oVar.f49977c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void y(IOException iOException) {
        e2.a.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.K = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        z(true);
    }

    public final void z(boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: l2.h.z(boolean):void");
    }
}
