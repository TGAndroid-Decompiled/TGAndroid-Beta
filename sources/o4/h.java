package o4;

import ag.j2;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.r;
import com.google.android.exoplayer2.upstream.r0;
import com.google.android.exoplayer2.upstream.s0;
import com.google.android.exoplayer2.upstream.t0;
import com.google.android.exoplayer2.upstream.y0;
import com.google.android.gms.internal.cast.z4;
import com.google.firebase.messaging.s;
import f5.d0;
import f7.v;
import j3.b1;
import j3.c1;
import j3.f1;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l4.c0;
import l4.g0;
import l4.z;
import nh.d6;
public final class h extends l4.a {
    public q0 A;
    public y0 B;
    public z4 C;
    public Handler D;
    public b1 E;
    public Uri F;
    public final Uri G;
    public p4.c H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long N;
    public int O;
    public final f1 h;
    public final boolean f19160i;
    public final com.google.android.exoplayer2.upstream.l f19161j;
    public final d6 f19162k;
    public final bb.a f19163l;
    public final n3.i f19164m;
    public final v f19165n;
    public final s f19166o;
    public final long f19167p;
    public final g0 f19168q;
    public final s0 f19169r;
    public final o1.a f19170s;
    public final Object f19171t;
    public final SparseArray f19172u;
    public final c v;
    public final c f19173w;
    public final d6 f19174x;
    public final r0 f19175y;
    public com.google.android.exoplayer2.upstream.m f19176z;

    static {
        j3.r0.a("goog.exo.dash");
    }

    public h(f1 f1Var, com.google.android.exoplayer2.upstream.l lVar, s0 s0Var, d6 d6Var, bb.a aVar, n3.i iVar, v vVar, long j10) {
        this.h = f1Var;
        this.E = f1Var.f10438c;
        c1 c1Var = f1Var.f10437b;
        c1Var.getClass();
        Uri uri = c1Var.f10401a;
        this.F = uri;
        this.G = uri;
        this.H = null;
        this.f19161j = lVar;
        this.f19169r = s0Var;
        this.f19162k = d6Var;
        this.f19164m = iVar;
        this.f19165n = vVar;
        this.f19167p = j10;
        this.f19163l = aVar;
        this.f19166o = new s(20);
        this.f19160i = false;
        this.f19168q = a(null);
        this.f19171t = new Object();
        this.f19172u = new SparseArray();
        this.f19174x = new d6(this, 3);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.f19170s = new o1.a(this, 2);
        this.f19175y = new g(this, 0);
        this.v = new Runnable(this) {
            public final h f19148b;

            {
                this.f19148b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f19148b.v();
                        return;
                    default:
                        this.f19148b.u(false);
                        return;
                }
            }
        };
        this.f19173w = new Runnable(this) {
            public final h f19148b;

            {
                this.f19148b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f19148b.v();
                        return;
                    default:
                        this.f19148b.u(false);
                        return;
                }
            }
        };
    }

    public static boolean s(p4.h hVar) {
        List list = hVar.f45568c;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = ((p4.a) list.get(i10)).f45532b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final z b(c0 c0Var, r rVar, long j10) {
        int intValue = ((Integer) c0Var.f14262a).intValue() - this.O;
        g0 g0Var = new g0(this.f14258c.f14321c, 0, c0Var, this.H.b(intValue).f45567b);
        j2 j2Var = new j2((CopyOnWriteArrayList) this.d.d, 0, c0Var);
        int i10 = this.O + intValue;
        p4.c cVar = this.H;
        y0 y0Var = this.B;
        long j11 = this.L;
        k3.k kVar = this.f14261g;
        f5.a.j(kVar);
        b bVar = new b(i10, cVar, this.f19166o, intValue, this.f19162k, y0Var, this.f19164m, j2Var, this.f19165n, g0Var, j11, this.f19175y, rVar, this.f19163l, this.f19174x, kVar);
        this.f19172u.put(i10, bVar);
        return bVar;
    }

    @Override
    public final f1 h() {
        return this.h;
    }

    @Override
    public final void j() {
        this.f19175y.a();
    }

    @Override
    public final void l(y0 y0Var) {
        this.B = y0Var;
        n3.i iVar = this.f19164m;
        iVar.a();
        Looper myLooper = Looper.myLooper();
        k3.k kVar = this.f14261g;
        f5.a.j(kVar);
        iVar.q(myLooper, kVar);
        if (this.f19160i) {
            u(false);
            return;
        }
        this.f19176z = this.f19161j.createDataSource();
        this.A = new q0("DashMediaSource");
        this.D = d0.k(null);
        v();
    }

    @Override
    public final void n(z zVar) {
        b bVar = (b) zVar;
        p pVar = bVar.f19145x;
        pVar.f19211r = true;
        pVar.d.removeCallbacksAndMessages(null);
        for (n4.h hVar : bVar.D) {
            hVar.w(bVar);
        }
        bVar.C = null;
        this.f19172u.remove(bVar.f19136a);
    }

    @Override
    public final void p() {
        p4.c cVar;
        this.I = false;
        this.f19176z = null;
        q0 q0Var = this.A;
        if (q0Var != null) {
            q0Var.e(null);
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
        if (this.f19160i) {
            cVar = this.H;
        } else {
            cVar = null;
        }
        this.H = cVar;
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
        this.O = 0;
        this.f19172u.clear();
        s sVar = this.f19166o;
        ((HashMap) sVar.f5185b).clear();
        ((HashMap) sVar.f5186c).clear();
        ((HashMap) sVar.d).clear();
        this.f19164m.release();
    }

    public final void t() {
        boolean z10;
        q0 q0Var = this.A;
        d dVar = new d(this);
        synchronized (f5.a.f6564i) {
            z10 = f5.a.f6565j;
        }
        if (z10) {
            dVar.a();
            return;
        }
        if (q0Var == null) {
            q0Var = new q0("SntpClient");
        }
        q0Var.f(new x9.d(6), new m5.i(dVar, 13), 1);
    }

    public final void u(boolean r45) {
        throw new UnsupportedOperationException("Method not decompiled: o4.h.u(boolean):void");
    }

    public final void v() {
        Uri uri;
        this.D.removeCallbacks(this.v);
        if (this.A.c()) {
            return;
        }
        if (this.A.d()) {
            this.I = true;
            return;
        }
        synchronized (this.f19171t) {
            uri = this.F;
        }
        this.I = false;
        t0 t0Var = new t0(this.f19176z, uri, 4, this.f19169r);
        o1.a aVar = this.f19170s;
        this.f19165n.getClass();
        this.A.f(t0Var, aVar, 3);
        this.f19168q.k(new l4.p(t0Var.f3621b), t0Var.f3622c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
