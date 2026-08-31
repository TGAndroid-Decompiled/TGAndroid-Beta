package o4;

import android.net.Uri;
import android.os.Looper;
import j3.c1;
import j3.o2;
import j3.x0;
import j3.y0;
import l7.w0;
import mh.m5;
public final class f0 extends a {
    public final c1 h;
    public final y0 f16475i;
    public final g5.l f16476j;
    public final m5 f16477k;
    public final o3.o f16478l;
    public final ab.a f16479m;
    public final int f16480n;
    public boolean f16481o;
    public long f16482p;
    public boolean f16483q;
    public boolean f16484r;
    public g5.v0 f16485s;

    public f0(c1 c1Var, g5.l lVar, m5 m5Var, o3.o oVar, ab.a aVar, int i10) {
        y0 y0Var = c1Var.f9008b;
        y0Var.getClass();
        this.f16475i = y0Var;
        this.h = c1Var;
        this.f16476j = lVar;
        this.f16477k = m5Var;
        this.f16478l = oVar;
        this.f16479m = aVar;
        this.f16480n = i10;
        this.f16481o = true;
        this.f16482p = -9223372036854775807L;
    }

    @Override
    public final t b(v vVar, g5.q qVar, long j10) {
        g5.m createDataSource = this.f16476j.createDataSource();
        g5.v0 v0Var = this.f16485s;
        if (v0Var != null) {
            createDataSource.addTransferListener(v0Var);
        }
        y0 y0Var = this.f16475i;
        Uri uri = y0Var.f9487a;
        h5.a.j(this.f16433g);
        return new e0(uri, createDataSource, new w0((r3.i) this.f16477k.f14450b, 15), this.f16478l, new o3.l(this.d.f16412c, 0, vVar), this.f16479m, a(vVar), this, qVar, y0Var.f9491f, this.f16480n);
    }

    @Override
    public final c1 h() {
        return this.h;
    }

    @Override
    public final void l(g5.v0 v0Var) {
        this.f16485s = v0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        k3.k kVar = this.f16433g;
        h5.a.j(kVar);
        o3.o oVar = this.f16478l;
        oVar.h(myLooper, kVar);
        oVar.a();
        s();
    }

    @Override
    public final void n(t tVar) {
        k0[] k0VarArr;
        e0 e0Var = (e0) tVar;
        if (e0Var.I) {
            for (k0 k0Var : e0Var.F) {
                k0Var.i();
                o3.i iVar = k0Var.h;
                if (iVar != null) {
                    iVar.c(k0Var.f16507e);
                    k0Var.h = null;
                    k0Var.f16509g = null;
                }
            }
        }
        e0Var.v.e(e0Var);
        e0Var.C.removeCallbacksAndMessages(null);
        e0Var.D = null;
        e0Var.Y = true;
    }

    @Override
    public final void p() {
        this.f16478l.release();
    }

    public final void s() {
        x0 x0Var;
        long j10 = this.f16482p;
        boolean z4 = this.f16483q;
        boolean z10 = this.f16484r;
        c1 c1Var = this.h;
        if (z10) {
            x0Var = c1Var.f9009c;
        } else {
            x0Var = null;
        }
        o2 r0Var = new r0(-9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z4, false, false, null, c1Var, x0Var);
        if (this.f16481o) {
            r0Var = new k(r0Var, 1);
        }
        m(r0Var);
    }

    public final void t(long j10, boolean z4, boolean z10) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f16482p;
        }
        if (!this.f16481o && this.f16482p == j10 && this.f16483q == z4 && this.f16484r == z10) {
            return;
        }
        this.f16482p = j10;
        this.f16483q = z4;
        this.f16484r = z10;
        this.f16481o = false;
        s();
    }

    @Override
    public final void j() {
    }
}
