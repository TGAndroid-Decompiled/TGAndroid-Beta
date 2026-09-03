package o4;

import android.net.Uri;
import android.os.Looper;
import j3.c1;
import j3.o2;
import j3.x0;
import j3.y0;
import l7.w0;
import lh.m5;
public final class f0 extends a {
    public final c1 h;
    public final y0 f16312i;
    public final g5.l f16313j;
    public final m5 f16314k;
    public final o3.p f16315l;
    public final z9.d f16316m;
    public final int f16317n;
    public boolean f16318o;
    public long f16319p;
    public boolean f16320q;
    public boolean f16321r;
    public g5.v0 f16322s;

    public f0(c1 c1Var, g5.l lVar, m5 m5Var, o3.p pVar, z9.d dVar, int i10) {
        y0 y0Var = c1Var.f8431b;
        y0Var.getClass();
        this.f16312i = y0Var;
        this.h = c1Var;
        this.f16313j = lVar;
        this.f16314k = m5Var;
        this.f16315l = pVar;
        this.f16316m = dVar;
        this.f16317n = i10;
        this.f16318o = true;
        this.f16319p = -9223372036854775807L;
    }

    @Override
    public final t b(v vVar, g5.q qVar, long j10) {
        g5.m createDataSource = this.f16313j.createDataSource();
        g5.v0 v0Var = this.f16322s;
        if (v0Var != null) {
            createDataSource.addTransferListener(v0Var);
        }
        y0 y0Var = this.f16312i;
        Uri uri = y0Var.f8871a;
        h5.a.j(this.f16273g);
        return new e0(uri, createDataSource, new w0((r3.i) this.f16314k.f12783b, 15), this.f16315l, new o3.m(this.d.f16256c, 0, vVar), this.f16316m, a(vVar), this, qVar, y0Var.f8874f, this.f16317n);
    }

    @Override
    public final c1 h() {
        return this.h;
    }

    @Override
    public final void l(g5.v0 v0Var) {
        this.f16322s = v0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        k3.k kVar = this.f16273g;
        h5.a.j(kVar);
        o3.p pVar = this.f16315l;
        pVar.e0(myLooper, kVar);
        pVar.b();
        s();
    }

    @Override
    public final void n(t tVar) {
        k0[] k0VarArr;
        e0 e0Var = (e0) tVar;
        if (e0Var.I) {
            for (k0 k0Var : e0Var.F) {
                k0Var.i();
                o3.j jVar = k0Var.h;
                if (jVar != null) {
                    jVar.c(k0Var.e);
                    k0Var.h = null;
                    k0Var.f16343g = null;
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
        this.f16315l.release();
    }

    public final void s() {
        x0 x0Var;
        long j10 = this.f16319p;
        boolean z4 = this.f16320q;
        boolean z10 = this.f16321r;
        c1 c1Var = this.h;
        if (z10) {
            x0Var = c1Var.f8432c;
        } else {
            x0Var = null;
        }
        o2 r0Var = new r0(-9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z4, false, false, null, c1Var, x0Var);
        if (this.f16318o) {
            r0Var = new k(r0Var, 1);
        }
        m(r0Var);
    }

    public final void t(long j10, boolean z4, boolean z10) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f16319p;
        }
        if (!this.f16318o && this.f16319p == j10 && this.f16320q == z4 && this.f16321r == z10) {
            return;
        }
        this.f16319p = j10;
        this.f16320q = z4;
        this.f16321r = z10;
        this.f16318o = false;
        s();
    }

    @Override
    public final void j() {
    }
}
