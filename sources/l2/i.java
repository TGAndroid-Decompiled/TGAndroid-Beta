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
import e2.d0;
import g2.c0;
import j$.util.Objects;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import u2.g0;
import u2.u;
public final class i extends u2.a {
    public y2.n A;
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
    public final g2.g f12722i;
    public final a5.a f12723j;
    public final ob.a f12724k;
    public final n2.n f12725l;
    public final rb.a f12726m;
    public final s f12727n;
    public final long f12728o;
    public final long f12729p;
    public final a5.a f12730q;
    public final y2.p f12731r;
    public final g f12732s;
    public final Object f12733t;
    public final SparseArray f12734u;
    public final c v;
    public final c f12735w;
    public final a4.m f12736x;
    public final y2.o f12737y;
    public g2.h f12738z;

    static {
        l0.a("media3.exoplayer.dash");
    }

    public i(k0 k0Var, g2.g gVar, y2.p pVar, a5.a aVar, ob.a aVar2, n2.n nVar, rb.a aVar3, long j3, long j10) {
        this.P = k0Var;
        this.E = k0Var.f1772c;
        f0 f0Var = k0Var.f1771b;
        f0Var.getClass();
        Uri uri = f0Var.f1686a;
        this.F = uri;
        this.G = uri;
        this.H = null;
        this.f12722i = gVar;
        this.f12731r = pVar;
        this.f12723j = aVar;
        this.f12725l = nVar;
        this.f12726m = aVar3;
        this.f12728o = j3;
        this.f12729p = j10;
        this.f12724k = aVar2;
        this.f12727n = new s(6);
        this.h = false;
        this.f12730q = b(null);
        this.f12733t = new Object();
        this.f12734u = new SparseArray();
        this.f12736x = new a4.m(this, 26);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.f12732s = new g(this, 0);
        this.f12737y = new h(this, 0);
        this.v = new Runnable(this) {
            public final i f12707b;

            {
                this.f12707b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f12707b.A();
                        return;
                    default:
                        this.f12707b.y(false);
                        return;
                }
            }
        };
        this.f12735w = new Runnable(this) {
            public final i f12707b;

            {
                this.f12707b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f12707b.A();
                        return;
                    default:
                        this.f12707b.y(false);
                        return;
                }
            }
        };
    }

    public static boolean u(m2.h hVar) {
        List list = hVar.f13258c;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = ((m2.a) list.get(i10)).f13225b;
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
        synchronized (this.f12733t) {
            uri = this.F;
        }
        this.I = false;
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.q qVar = new y2.q(this.f12738z, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, this.f12731r);
        g gVar = this.f12732s;
        this.f12726m.getClass();
        this.A.f(qVar, gVar, 3);
    }

    @Override
    public final boolean a(k0 k0Var) {
        k0 i10 = i();
        f0 f0Var = i10.f1771b;
        f0Var.getClass();
        f0 f0Var2 = k0Var.f1771b;
        if (f0Var2 != null && f0Var2.f1686a.equals(f0Var.f1686a) && f0Var2.e.equals(f0Var.e) && Objects.equals(f0Var2.f1688c, f0Var.f1688c) && i10.f1772c.equals(k0Var.f1772c)) {
            return true;
        }
        return false;
    }

    @Override
    public final u2.e0 c(g0 g0Var, y2.d dVar, long j3) {
        int intValue = ((Integer) g0Var.f42324a).intValue() - this.O;
        a5.a b10 = b(g0Var);
        n2.j jVar = new n2.j(this.d.f13736c, 0, g0Var);
        int i10 = this.O + intValue;
        m2.c cVar = this.H;
        c0 c0Var = this.B;
        long j10 = this.L;
        j2.k kVar = this.f42270g;
        e2.d.h(kVar);
        b bVar = new b(i10, cVar, this.f12727n, intValue, this.f12723j, c0Var, this.f12725l, jVar, this.f12726m, b10, j10, this.f12737y, dVar, this.f12724k, this.f12736x, kVar);
        this.f12734u.put(i10, bVar);
        return bVar;
    }

    @Override
    public final synchronized k0 i() {
        return this.P;
    }

    @Override
    public final void k() {
        this.f12737y.a();
    }

    @Override
    public final void m(c0 c0Var) {
        this.B = c0Var;
        Looper myLooper = Looper.myLooper();
        j2.k kVar = this.f42270g;
        e2.d.h(kVar);
        n2.n nVar = this.f12725l;
        nVar.C(myLooper, kVar);
        nVar.b();
        if (this.h) {
            y(false);
            return;
        }
        this.f12738z = this.f12722i.createDataSource();
        this.A = new y2.n("DashMediaSource");
        this.D = d0.o(null);
        A();
    }

    @Override
    public final void o(u2.e0 e0Var) {
        b bVar = (b) e0Var;
        q qVar = bVar.f12704x;
        qVar.f12769r = true;
        qVar.d.removeCallbacksAndMessages(null);
        for (v2.h hVar : bVar.H) {
            hVar.B(bVar);
        }
        bVar.G = null;
        this.f12734u.remove(bVar.f12696a);
    }

    @Override
    public final void q() {
        this.I = false;
        this.f12738z = null;
        y2.n nVar = this.A;
        if (nVar != null) {
            nVar.e(null);
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
        this.f12734u.clear();
        s sVar = this.f12727n;
        ((HashMap) sVar.f6118b).clear();
        ((HashMap) sVar.f6119c).clear();
        ((HashMap) sVar.d).clear();
        this.f12725l.release();
    }

    @Override
    public final synchronized void t(k0 k0Var) {
        this.P = k0Var;
    }

    public final void v() {
        boolean z10;
        y2.n nVar = this.A;
        d dVar = new d(this);
        synchronized (z2.b.f47194b) {
            z10 = z2.b.f47195c;
        }
        if (z10) {
            dVar.a();
            return;
        }
        if (nVar == null) {
            nVar = new y2.n("SntpClient");
        }
        nVar.f(new na.d(28), new h(dVar, 29), 1);
    }

    public final void w(y2.q qVar, long j3) {
        long j10 = qVar.f46448a;
        Uri uri = qVar.d.f8480c;
        u uVar = new u(j3);
        this.f12726m.getClass();
        this.f12730q.m(uVar, qVar.f46450c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void x(IOException iOException) {
        e2.a.f("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        y(true);
    }

    public final void y(boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: l2.i.y(boolean):void");
    }

    public final void z(lf.g gVar, y2.p pVar) {
        g2.h hVar = this.f12738z;
        Uri parse = Uri.parse(gVar.f12914c);
        Map map = Collections.EMPTY_MAP;
        e2.d.i(parse, "The uri must be set.");
        this.A.f(new y2.q(hVar, new g2.m(parse, 1, null, map, 0L, -1L, null, 1), 5, pVar), new d(this), 1);
    }
}
