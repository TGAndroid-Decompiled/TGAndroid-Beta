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
    public final g2.g f14048i;
    public final a5.a f14049j;
    public final ob.a f14050k;
    public final n2.n f14051l;
    public final qb.b f14052m;
    public final t f14053n;
    public final long f14054o;
    public final long f14055p;
    public final a5.a f14056q;
    public final y2.n f14057r;
    public final l.d f14058s;
    public final Object f14059t;
    public final SparseArray f14060u;
    public final c v;
    public final c f14061w;
    public final u f14062x;
    public final y2.m f14063y;
    public g2.h f14064z;

    static {
        l0.a("media3.exoplayer.dash");
    }

    public g(k0 k0Var, g2.g gVar, y2.n nVar, a5.a aVar, ob.a aVar2, n2.n nVar2, qb.b bVar, long j3, long j10) {
        this.P = k0Var;
        this.E = k0Var.f3071c;
        f0 f0Var = k0Var.f3070b;
        f0Var.getClass();
        Uri uri = f0Var.f2985a;
        this.F = uri;
        this.G = uri;
        this.H = null;
        this.f14048i = gVar;
        this.f14057r = nVar;
        this.f14049j = aVar;
        this.f14051l = nVar2;
        this.f14052m = bVar;
        this.f14054o = j3;
        this.f14055p = j10;
        this.f14050k = aVar2;
        this.f14053n = new t(6);
        this.h = false;
        this.f14056q = b(null);
        this.f14059t = new Object();
        this.f14060u = new SparseArray();
        this.f14062x = new u(this, 2);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.f14058s = new l.d(this);
        this.f14063y = new a4.m(this, 26);
        this.v = new Runnable(this) {
            public final g f14037b;

            {
                this.f14037b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f14037b.A();
                        return;
                    default:
                        this.f14037b.y(false);
                        return;
                }
            }
        };
        this.f14061w = new Runnable(this) {
            public final g f14037b;

            {
                this.f14037b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f14037b.A();
                        return;
                    default:
                        this.f14037b.y(false);
                        return;
                }
            }
        };
    }

    public static boolean u(m2.h hVar) {
        List list = hVar.f14661c;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = ((m2.a) list.get(i10)).f14628b;
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
        synchronized (this.f14059t) {
            uri = this.F;
        }
        this.I = false;
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.o oVar = new y2.o(this.f14064z, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, this.f14057r);
        l.d dVar = this.f14058s;
        this.f14052m.getClass();
        this.A.f(oVar, dVar, 3);
    }

    @Override
    public final boolean a(k0 k0Var) {
        k0 i10 = i();
        f0 f0Var = i10.f3070b;
        f0Var.getClass();
        f0 f0Var2 = k0Var.f3070b;
        if (f0Var2 != null && f0Var2.f2985a.equals(f0Var.f2985a) && f0Var2.e.equals(f0Var.e) && Objects.equals(f0Var2.f2987c, f0Var.f2987c) && i10.f3071c.equals(k0Var.f3071c)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(u2.f0 f0Var, y2.d dVar, long j3) {
        int intValue = ((Integer) f0Var.f43640a).intValue() - this.O;
        a5.a b10 = b(f0Var);
        n2.k kVar = new n2.k(this.d.f15135c, 0, f0Var);
        int i10 = this.O + intValue;
        m2.c cVar = this.H;
        c0 c0Var = this.B;
        long j10 = this.L;
        j2.k kVar2 = this.f43586g;
        e2.d.h(kVar2);
        b bVar = new b(i10, cVar, this.f14053n, intValue, this.f14049j, c0Var, this.f14051l, kVar, this.f14052m, b10, j10, this.f14063y, dVar, this.f14050k, this.f14062x, kVar2);
        this.f14060u.put(i10, bVar);
        return bVar;
    }

    @Override
    public final synchronized k0 i() {
        return this.P;
    }

    @Override
    public final void k() {
        this.f14063y.a();
    }

    @Override
    public final void m(c0 c0Var) {
        this.B = c0Var;
        Looper myLooper = Looper.myLooper();
        j2.k kVar = this.f43586g;
        e2.d.h(kVar);
        n2.n nVar = this.f14051l;
        nVar.C(myLooper, kVar);
        nVar.b();
        if (this.h) {
            y(false);
            return;
        }
        this.f14064z = this.f14048i.createDataSource();
        this.A = new y2.l("DashMediaSource");
        this.D = e2.d0.o(null);
        A();
    }

    @Override
    public final void o(d0 d0Var) {
        b bVar = (b) d0Var;
        o oVar = bVar.f14034x;
        oVar.f14095r = true;
        oVar.d.removeCallbacksAndMessages(null);
        for (v2.h hVar : bVar.H) {
            hVar.B(bVar);
        }
        bVar.G = null;
        this.f14060u.remove(bVar.f14026a);
    }

    @Override
    public final void q() {
        this.I = false;
        this.f14064z = null;
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
        this.f14060u.clear();
        t tVar = this.f14053n;
        ((HashMap) tVar.f7328b).clear();
        ((HashMap) tVar.f7329c).clear();
        ((HashMap) tVar.d).clear();
        this.f14051l.release();
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
        synchronized (z2.c.f48351b) {
            z10 = z2.c.f48352c;
            lVar = lVar2;
        }
        if (z10) {
            dVar.a();
            return;
        }
        if (lVar2 == null) {
            lVar = new y2.l("SntpClient");
        }
        lVar.f(new Object(), new z2.b(dVar), 1);
    }

    public final void w(y2.o oVar, long j3) {
        long j10 = oVar.f46576a;
        Uri uri = oVar.d.f9334c;
        u2.t tVar = new u2.t(j3);
        this.f14052m.getClass();
        this.f14056q.o(tVar, oVar.f46578c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
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
        g2.h hVar = this.f14064z;
        Uri parse = Uri.parse(gVar.f14245c);
        Map map = Collections.EMPTY_MAP;
        e2.d.i(parse, "The uri must be set.");
        this.A.f(new y2.o(hVar, new g2.m(parse, 1, null, map, 0L, -1L, null, 1), 5, nVar), new d(this), 1);
    }
}
