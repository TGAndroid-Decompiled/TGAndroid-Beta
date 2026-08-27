package j4;

import android.net.Uri;
import android.os.Looper;
import h3.s2;
import java.util.concurrent.CopyOnWriteArrayList;

public final class t0 extends a {
    public final h3.f1 h;

    public final h3.c1 f12672i;

    public final com.google.android.exoplayer2.upstream.l f12673j;

    public final h3.x f12674k;

    public final l3.j f12675l;

    public final ab.a f12676m;

    public final int f12677n;

    public boolean f12678o;

    public long f12679p;

    public boolean f12680q;

    public boolean f12681r;

    public com.google.android.exoplayer2.upstream.y0 f12682s;

    public t0(h3.f1 f1Var, com.google.android.exoplayer2.upstream.l lVar, h3.x xVar, l3.j jVar, ab.a aVar, int i10) {
        h3.c1 c1Var = f1Var.f7830b;
        c1Var.getClass();
        this.f12672i = c1Var;
        this.h = f1Var;
        this.f12673j = lVar;
        this.f12674k = xVar;
        this.f12675l = jVar;
        this.f12676m = aVar;
        this.f12677n = i10;
        this.f12678o = true;
        this.f12679p = -9223372036854775807L;
    }

    @Override
    public final z b(c0 c0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        com.google.android.exoplayer2.upstream.m mVarCreateDataSource = this.f12673j.createDataSource();
        com.google.android.exoplayer2.upstream.y0 y0Var = this.f12682s;
        if (y0Var != null) {
            mVarCreateDataSource.addTransferListener(y0Var);
        }
        Uri uri = this.f12672i.f7795a;
        d5.a.j(this.f12502g);
        return new r0(uri, mVarCreateDataSource, new a5.n((m3.i) this.f12674k.f8237b), this.f12675l, new b6.a((CopyOnWriteArrayList) this.d.d, 0, c0Var, 14), this.f12676m, a(c0Var), this, rVar, this.f12677n);
    }

    @Override
    public final h3.f1 h() {
        return this.h;
    }

    @Override
    public final void l(com.google.android.exoplayer2.upstream.y0 y0Var) {
        this.f12682s = y0Var;
        l3.j jVar = this.f12675l;
        jVar.a();
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        i3.k kVar = this.f12502g;
        d5.a.j(kVar);
        jVar.w(looperMyLooper, kVar);
        s();
    }

    @Override
    public final void n(z zVar) {
        r0 r0Var = (r0) zVar;
        if (r0Var.G) {
            for (a1 a1Var : r0Var.D) {
                a1Var.i();
                l3.f fVar = a1Var.h;
                if (fVar != null) {
                    fVar.h(a1Var.f12510e);
                    a1Var.h = null;
                    a1Var.f12512g = null;
                }
            }
        }
        r0Var.f12656s.e(r0Var);
        r0Var.A.removeCallbacksAndMessages(null);
        r0Var.B = null;
        r0Var.W = true;
    }

    @Override
    public final void p() {
        this.f12675l.release();
    }

    public final void s() {
        long j10 = this.f12679p;
        boolean z10 = this.f12680q;
        boolean z11 = this.f12681r;
        h3.f1 f1Var = this.h;
        s2 h1Var = new h1(-9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, f1Var, z11 ? f1Var.f7831c : null);
        if (this.f12678o) {
            h1Var = new q(h1Var, 1);
        }
        m(h1Var);
    }

    public final void t(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f12679p;
        }
        if (!this.f12678o && this.f12679p == j10 && this.f12680q == z10 && this.f12681r == z11) {
            return;
        }
        this.f12679p = j10;
        this.f12680q = z10;
        this.f12681r = z11;
        this.f12678o = false;
        s();
    }

    @Override
    public final void j() {
    }
}
