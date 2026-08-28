package m4;

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
import com.google.firebase.messaging.t;
import d5.f0;
import h3.b1;
import h3.c1;
import h3.f1;
import j4.a0;
import j4.d0;
import j4.h0;
import j4.q;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
public final class g extends j4.a {
    public q0 A;
    public y0 B;
    public z4 C;
    public Handler D;
    public b1 E;
    public Uri F;
    public final Uri G;
    public n4.c H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long N;
    public int O;
    public final f1 h;
    public final boolean f17299i;
    public final com.google.android.exoplayer2.upstream.l f17300j;
    public final android.support.v4.media.c f17301k;
    public final za.a f17302l;
    public final l3.i f17303m;
    public final v9.d f17304n;
    public final t f17305o;
    public final long f17306p;
    public final h0 f17307q;
    public final s0 f17308r;
    public final xa.c f17309s;
    public final Object f17310t;
    public final SparseArray f17311u;
    public final c v;
    public final c f17312w;
    public final android.support.v4.media.c f17313x;
    public final r0 f17314y;
    public com.google.android.exoplayer2.upstream.m f17315z;

    static {
        h3.r0.a("goog.exo.dash");
    }

    public g(f1 f1Var, com.google.android.exoplayer2.upstream.l lVar, s0 s0Var, android.support.v4.media.c cVar, za.a aVar, l3.i iVar, v9.d dVar, long j10) {
        this.h = f1Var;
        this.E = f1Var.f9400c;
        c1 c1Var = f1Var.f9399b;
        c1Var.getClass();
        Uri uri = c1Var.f9362a;
        this.F = uri;
        this.G = uri;
        this.H = null;
        this.f17300j = lVar;
        this.f17308r = s0Var;
        this.f17301k = cVar;
        this.f17303m = iVar;
        this.f17304n = dVar;
        this.f17306p = j10;
        this.f17302l = aVar;
        this.f17305o = new t(18);
        this.f17299i = false;
        this.f17307q = a(null);
        this.f17310t = new Object();
        this.f17311u = new SparseArray();
        this.f17313x = new android.support.v4.media.c(this, 27);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.f17309s = new xa.c(this, 27);
        this.f17314y = new zd.b(this);
        this.v = new Runnable(this) {
            public final g f17289b;

            {
                this.f17289b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f17289b.v();
                        return;
                    default:
                        this.f17289b.u(false);
                        return;
                }
            }
        };
        this.f17312w = new Runnable(this) {
            public final g f17289b;

            {
                this.f17289b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f17289b.v();
                        return;
                    default:
                        this.f17289b.u(false);
                        return;
                }
            }
        };
    }

    public static boolean s(n4.h hVar) {
        List list = hVar.f18419c;
        for (int i9 = 0; i9 < list.size(); i9++) {
            int i10 = ((n4.a) list.get(i9)).f18383b;
            if (i10 == 1 || i10 == 2) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final a0 b(d0 d0Var, r rVar, long j10) {
        int intValue = ((Integer) d0Var.f13426a).intValue() - this.O;
        h0 h0Var = new h0(this.f13399c.f13466c, 0, d0Var, this.H.b(intValue).f18418b);
        a6.a aVar = new a6.a((CopyOnWriteArrayList) this.d.d, 0, d0Var, 14);
        int i9 = this.O + intValue;
        n4.c cVar = this.H;
        y0 y0Var = this.B;
        long j11 = this.L;
        i3.l lVar = this.f13402g;
        d5.a.j(lVar);
        b bVar = new b(i9, cVar, this.f17305o, intValue, this.f17301k, y0Var, this.f17303m, aVar, this.f17304n, h0Var, j11, this.f17314y, rVar, this.f17302l, this.f17313x, lVar);
        this.f17311u.put(i9, bVar);
        return bVar;
    }

    @Override
    public final f1 h() {
        return this.h;
    }

    @Override
    public final void j() {
        this.f17314y.a();
    }

    @Override
    public final void l(y0 y0Var) {
        this.B = y0Var;
        l3.i iVar = this.f17303m;
        iVar.a();
        Looper myLooper = Looper.myLooper();
        i3.l lVar = this.f13402g;
        d5.a.j(lVar);
        iVar.H(myLooper, lVar);
        if (this.f17299i) {
            u(false);
            return;
        }
        this.f17315z = this.f17300j.createDataSource();
        this.A = new q0("DashMediaSource");
        this.D = f0.k(null);
        v();
    }

    @Override
    public final void n(a0 a0Var) {
        b bVar = (b) a0Var;
        o oVar = bVar.f17286x;
        oVar.f17350r = true;
        oVar.d.removeCallbacksAndMessages(null);
        for (l4.h hVar : bVar.D) {
            hVar.B(bVar);
        }
        bVar.C = null;
        this.f17311u.remove(bVar.f17277a);
    }

    @Override
    public final void p() {
        n4.c cVar;
        this.I = false;
        this.f17315z = null;
        q0 q0Var = this.A;
        if (q0Var != null) {
            q0Var.e(null);
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
        if (this.f17299i) {
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
        this.f17311u.clear();
        t tVar = this.f17305o;
        ((HashMap) tVar.f4177b).clear();
        ((HashMap) tVar.f4178c).clear();
        ((HashMap) tVar.d).clear();
        this.f17303m.release();
    }

    public final void t() {
        boolean z10;
        q0 q0Var = this.A;
        d dVar = new d(this);
        synchronized (d5.a.f4327i) {
            z10 = d5.a.f4328j;
        }
        if (z10) {
            dVar.a();
            return;
        }
        if (q0Var == null) {
            q0Var = new q0("SntpClient");
        }
        q0Var.f(new ya.b(4), new k5.i(dVar, 11), 1);
    }

    public final void u(boolean r45) {
        throw new UnsupportedOperationException("Method not decompiled: m4.g.u(boolean):void");
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
        synchronized (this.f17310t) {
            uri = this.F;
        }
        this.I = false;
        t0 t0Var = new t0(this.f17315z, uri, 4, this.f17308r);
        xa.c cVar = this.f17309s;
        this.f17304n.getClass();
        this.A.f(t0Var, cVar, 3);
        this.f17307q.k(new q(t0Var.f2607b), t0Var.f2608c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
