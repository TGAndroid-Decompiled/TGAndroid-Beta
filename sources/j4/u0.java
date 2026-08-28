package j4;

import android.net.Uri;
import android.os.Looper;
import gh.i3;
import h3.r2;
import java.util.concurrent.CopyOnWriteArrayList;
public final class u0 extends a {
    public final h3.f1 h;
    public final h3.c1 f13575i;
    public final com.google.android.exoplayer2.upstream.l f13576j;
    public final i3 f13577k;
    public final l3.i f13578l;
    public final v9.d f13579m;
    public final int f13580n;
    public boolean f13581o;
    public long f13582p;
    public boolean f13583q;
    public boolean f13584r;
    public com.google.android.exoplayer2.upstream.y0 f13585s;

    public u0(h3.f1 f1Var, com.google.android.exoplayer2.upstream.l lVar, i3 i3Var, l3.i iVar, v9.d dVar, int i9) {
        h3.c1 c1Var = f1Var.f9399b;
        c1Var.getClass();
        this.f13575i = c1Var;
        this.h = f1Var;
        this.f13576j = lVar;
        this.f13577k = i3Var;
        this.f13578l = iVar;
        this.f13579m = dVar;
        this.f13580n = i9;
        this.f13581o = true;
        this.f13582p = -9223372036854775807L;
    }

    @Override
    public final a0 b(d0 d0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        com.google.android.exoplayer2.upstream.m createDataSource = this.f13576j.createDataSource();
        com.google.android.exoplayer2.upstream.y0 y0Var = this.f13585s;
        if (y0Var != null) {
            createDataSource.addTransferListener(y0Var);
        }
        h3.c1 c1Var = this.f13575i;
        Uri uri = c1Var.f9362a;
        d5.a.j(this.f13402g);
        return new s0(uri, createDataSource, new c((m3.i) this.f13577k.f8278b), this.f13578l, new a6.a((CopyOnWriteArrayList) this.d.d, 0, d0Var, 14), this.f13579m, a(d0Var), this, rVar, c1Var.d, this.f13580n);
    }

    @Override
    public final h3.f1 h() {
        return this.h;
    }

    @Override
    public final void l(com.google.android.exoplayer2.upstream.y0 y0Var) {
        this.f13585s = y0Var;
        l3.i iVar = this.f13578l;
        iVar.a();
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        i3.l lVar = this.f13402g;
        d5.a.j(lVar);
        iVar.H(myLooper, lVar);
        s();
    }

    @Override
    public final void n(a0 a0Var) {
        a1[] a1VarArr;
        s0 s0Var = (s0) a0Var;
        if (s0Var.H) {
            for (a1 a1Var : s0Var.E) {
                a1Var.i();
                l3.e eVar = a1Var.h;
                if (eVar != null) {
                    eVar.k(a1Var.f13406e);
                    a1Var.h = null;
                    a1Var.f13408g = null;
                }
            }
        }
        s0Var.v.e(s0Var);
        s0Var.B.removeCallbacksAndMessages(null);
        s0Var.C = null;
        s0Var.X = true;
    }

    @Override
    public final void p() {
        this.f13578l.release();
    }

    public final void s() {
        h3.b1 b1Var;
        long j10 = this.f13582p;
        boolean z10 = this.f13583q;
        boolean z11 = this.f13584r;
        h3.f1 f1Var = this.h;
        if (z11) {
            b1Var = f1Var.f9400c;
        } else {
            b1Var = null;
        }
        r2 h1Var = new h1(-9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, f1Var, b1Var);
        if (this.f13581o) {
            h1Var = new r(h1Var, 1);
        }
        m(h1Var);
    }

    public final void t(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f13582p;
        }
        if (!this.f13581o && this.f13582p == j10 && this.f13583q == z10 && this.f13584r == z11) {
            return;
        }
        this.f13582p = j10;
        this.f13583q = z10;
        this.f13584r = z11;
        this.f13581o = false;
        s();
    }

    @Override
    public final void j() {
    }
}
