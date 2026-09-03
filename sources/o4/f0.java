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
    public final y0 f16477i;
    public final g5.l f16478j;
    public final m5 f16479k;
    public final o3.o f16480l;
    public final ab.a f16481m;
    public final int f16482n;
    public boolean f16483o;
    public long f16484p;
    public boolean f16485q;
    public boolean f16486r;
    public g5.v0 f16487s;

    public f0(c1 c1Var, g5.l lVar, m5 m5Var, o3.o oVar, ab.a aVar, int i10) {
        y0 y0Var = c1Var.f9008b;
        y0Var.getClass();
        this.f16477i = y0Var;
        this.h = c1Var;
        this.f16478j = lVar;
        this.f16479k = m5Var;
        this.f16480l = oVar;
        this.f16481m = aVar;
        this.f16482n = i10;
        this.f16483o = true;
        this.f16484p = -9223372036854775807L;
    }

    @Override
    public final t b(v vVar, g5.q qVar, long j10) {
        g5.m createDataSource = this.f16478j.createDataSource();
        g5.v0 v0Var = this.f16487s;
        if (v0Var != null) {
            createDataSource.addTransferListener(v0Var);
        }
        y0 y0Var = this.f16477i;
        Uri uri = y0Var.f9487a;
        h5.a.j(this.f16435g);
        return new e0(uri, createDataSource, new w0((r3.i) this.f16479k.f14452b, 15), this.f16480l, new o3.l(this.d.f16414c, 0, vVar), this.f16481m, a(vVar), this, qVar, y0Var.f9491f, this.f16482n);
    }

    @Override
    public final c1 h() {
        return this.h;
    }

    @Override
    public final void l(g5.v0 v0Var) {
        this.f16487s = v0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        k3.k kVar = this.f16435g;
        h5.a.j(kVar);
        o3.o oVar = this.f16480l;
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
                    iVar.c(k0Var.f16509e);
                    k0Var.h = null;
                    k0Var.f16511g = null;
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
        this.f16480l.release();
    }

    public final void s() {
        x0 x0Var;
        long j10 = this.f16484p;
        boolean z4 = this.f16485q;
        boolean z10 = this.f16486r;
        c1 c1Var = this.h;
        if (z10) {
            x0Var = c1Var.f9009c;
        } else {
            x0Var = null;
        }
        o2 r0Var = new r0(-9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z4, false, false, null, c1Var, x0Var);
        if (this.f16483o) {
            r0Var = new k(r0Var, 1);
        }
        m(r0Var);
    }

    public final void t(long j10, boolean z4, boolean z10) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f16484p;
        }
        if (!this.f16483o && this.f16484p == j10 && this.f16485q == z4 && this.f16486r == z10) {
            return;
        }
        this.f16484p = j10;
        this.f16485q = z4;
        this.f16486r = z10;
        this.f16483o = false;
        s();
    }

    @Override
    public final void j() {
    }
}
