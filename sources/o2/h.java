package o2;

import a8.ma;
import a8.xa;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import b3.q;
import b3.r;
import b3.s;
import e2.f0;
import e2.g0;
import e2.l0;
import e2.m0;
import j$.util.Objects;
import j2.b0;
import j2.c0;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import x2.e0;
import x2.u;
public final class h extends x2.a {
    public b3.p A;
    public c0 B;
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
    public final j2.g f21718i;
    public final xa f21719j;
    public final nb.a f21720k;
    public final q2.m f21721l;
    public final qb.a f21722m;
    public final xi.e f21723n;
    public final long f21724o;
    public final long f21725p;
    public final xa f21726q;
    public final r f21727r;
    public final j6.r f21728s;
    public final Object f21729t;
    public final SparseArray f21730u;
    public final c v;
    public final c f21731w;
    public final f f21732x;
    public final q f21733y;
    public j2.h f21734z;

    static {
        m0.a("media3.exoplayer.dash");
    }

    public h(l0 l0Var, j2.g gVar, r rVar, xa xaVar, nb.a aVar, q2.m mVar, qb.a aVar2, long j3, long j10) {
        this.O = l0Var;
        this.P = l0Var.f10495c;
        g0 g0Var = l0Var.f10494b;
        g0Var.getClass();
        Uri uri = g0Var.f10403a;
        this.E = uri;
        this.F = uri;
        this.G = null;
        this.f21718i = gVar;
        this.f21727r = rVar;
        this.f21719j = xaVar;
        this.f21721l = mVar;
        this.f21722m = aVar2;
        this.f21724o = j3;
        this.f21725p = j10;
        this.f21720k = aVar;
        this.f21723n = new xi.e(7);
        this.h = false;
        this.f21726q = b(null);
        this.f21729t = new Object();
        this.f21730u = new SparseArray();
        this.f21732x = new f(this);
        this.M = -9223372036854775807L;
        this.K = -9223372036854775807L;
        this.f21728s = new j6.r(this, 12);
        this.f21733y = new d(this);
        this.v = new Runnable(this) {
            public final h f21705b;

            {
                this.f21705b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f21705b.C();
                        return;
                    default:
                        h hVar = this.f21705b;
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
        this.f21731w = new Runnable(this) {
            public final h f21705b;

            {
                this.f21705b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f21705b.C();
                        return;
                    default:
                        h hVar = this.f21705b;
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
        List list = hVar.f55240c;
        for (int i7 = 0; i7 < list.size(); i7++) {
            int i10 = ((p2.a) list.get(i7)).f55203b;
            if (i10 == 1 || i10 == 2) {
                return true;
            }
        }
        return false;
    }

    public final void A(f5.a aVar, r rVar) {
        j2.h hVar = this.f21734z;
        Uri parse = Uri.parse(aVar.f11239c);
        Map map = Collections.EMPTY_MAP;
        ma.k(parse, "The uri must be set.");
        this.A.f(new s(hVar, new j2.m(parse, 1, null, map, 0L, -1L, null, 1), 5, rVar), new f(this), 1);
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
        synchronized (this.f21729t) {
            uri = this.E;
        }
        this.H = false;
        Map map = Collections.EMPTY_MAP;
        ma.k(uri, "The uri must be set.");
        s sVar = new s(this.f21734z, new j2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, this.f21727r);
        j6.r rVar = this.f21728s;
        this.f21722m.getClass();
        this.A.f(sVar, rVar, 3);
    }

    @Override
    public final boolean a(l0 l0Var) {
        g0 g0Var = i().f10494b;
        g0Var.getClass();
        g0 g0Var2 = l0Var.f10494b;
        if (g0Var2 != null && g0Var2.f10403a.equals(g0Var.f10403a) && g0Var2.f10406e.equals(g0Var.f10406e) && Objects.equals(g0Var2.f10405c, g0Var.f10405c)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(x2.g0 g0Var, h6.m mVar, long j3) {
        int intValue = ((Integer) g0Var.f60216a).intValue() - this.N;
        xa b10 = b(g0Var);
        q2.j jVar = new q2.j(this.d.f55884c, 0, g0Var);
        int i7 = this.N + intValue;
        p2.c cVar = this.G;
        c0 c0Var = this.B;
        long j10 = this.K;
        m2.i iVar = this.f60157g;
        iVar.getClass();
        b bVar = new b(i7, cVar, this.f21723n, intValue, this.f21719j, c0Var, this.f21721l, jVar, this.f21722m, b10, j10, this.f21733y, mVar, this.f21720k, this.f21732x, iVar);
        this.f21730u.put(i7, bVar);
        return bVar;
    }

    @Override
    public final synchronized l0 i() {
        return this.O;
    }

    @Override
    public final void k() {
        this.f21733y.a();
    }

    @Override
    public final void m(c0 c0Var) {
        this.B = c0Var;
        Looper myLooper = Looper.myLooper();
        m2.i iVar = this.f60157g;
        iVar.getClass();
        q2.m mVar = this.f21721l;
        mVar.r1(myLooper, iVar);
        mVar.a();
        if (this.h) {
            z(false);
            return;
        }
        this.f21734z = this.f21718i.createDataSource();
        this.A = new b3.p("DashMediaSource");
        this.D = h2.l0.q(null);
        C();
    }

    @Override
    public final void o(e0 e0Var) {
        b bVar = (b) e0Var;
        p pVar = bVar.f21703y;
        pVar.f21770r = true;
        pVar.d.removeCallbacksAndMessages(null);
        for (y2.i iVar : bVar.I) {
            iVar.D(bVar);
        }
        bVar.H = null;
        this.f21730u.remove(bVar.f21693a);
    }

    @Override
    public final void q() {
        this.H = false;
        this.f21734z = null;
        b3.p pVar = this.A;
        if (pVar != null) {
            pVar.e(null);
            this.A = null;
        }
        f0 f0Var = i().f10495c;
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
        this.f21730u.clear();
        xi.e eVar = this.f21723n;
        ((HashMap) eVar.f60749a).clear();
        ((HashMap) eVar.f60750b).clear();
        ((HashMap) eVar.f60751c).clear();
        this.f21721l.release();
    }

    @Override
    public final synchronized void t(l0 l0Var) {
        this.O = l0Var;
        this.P = l0Var.f10495c;
    }

    public final synchronized f0 u() {
        return this.P;
    }

    public final void w() {
        boolean z10;
        b3.p pVar = this.A;
        d dVar = new d(this);
        synchronized (c3.b.f4361b) {
            z10 = c3.b.f4362c;
        }
        if (z10) {
            dVar.b();
            return;
        }
        if (pVar == null) {
            pVar = new b3.p("SntpClient");
        }
        pVar.f(new qb.a(5), new d6.i(dVar, 6), 1);
    }

    public final void x(s sVar, long j3, long j10) {
        long j11 = sVar.f2888a;
        j2.m mVar = sVar.f2889b;
        b0 b0Var = sVar.d;
        u uVar = new u(mVar, b0Var.f17244c, b0Var.d, j3, j10, b0Var.f17243b);
        this.f21722m.getClass();
        this.f21726q.n(uVar, sVar.f2890c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
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
