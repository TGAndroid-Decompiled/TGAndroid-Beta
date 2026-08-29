package l4;

import ag.j2;
import android.net.Uri;
import android.os.Looper;
import j3.r2;
import java.util.concurrent.CopyOnWriteArrayList;
public final class u0 extends a {
    public final j3.f1 h;
    public final j3.c1 f14435i;
    public final com.google.android.exoplayer2.upstream.l f14436j;
    public final s0 f14437k;
    public final n3.i f14438l;
    public final f7.v f14439m;
    public final int f14440n;
    public boolean f14441o;
    public long f14442p;
    public boolean f14443q;
    public boolean f14444r;
    public com.google.android.exoplayer2.upstream.y0 f14445s;

    public u0(j3.f1 f1Var, com.google.android.exoplayer2.upstream.l lVar, s0 s0Var, n3.i iVar, f7.v vVar, int i10) {
        j3.c1 c1Var = f1Var.f10437b;
        c1Var.getClass();
        this.f14435i = c1Var;
        this.h = f1Var;
        this.f14436j = lVar;
        this.f14437k = s0Var;
        this.f14438l = iVar;
        this.f14439m = vVar;
        this.f14440n = i10;
        this.f14441o = true;
        this.f14442p = -9223372036854775807L;
    }

    @Override
    public final z b(c0 c0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        com.google.android.exoplayer2.upstream.m createDataSource = this.f14436j.createDataSource();
        com.google.android.exoplayer2.upstream.y0 y0Var = this.f14445s;
        if (y0Var != null) {
            createDataSource.addTransferListener(y0Var);
        }
        j3.c1 c1Var = this.f14435i;
        Uri uri = c1Var.f10401a;
        f5.a.j(this.f14261g);
        return new r0(uri, createDataSource, new l3.g0((o3.i) this.f14437k.f14423b), this.f14438l, new j2((CopyOnWriteArrayList) this.d.d, 0, c0Var), this.f14439m, a(c0Var), this, rVar, c1Var.d, this.f14440n);
    }

    @Override
    public final j3.f1 h() {
        return this.h;
    }

    @Override
    public final void l(com.google.android.exoplayer2.upstream.y0 y0Var) {
        this.f14445s = y0Var;
        n3.i iVar = this.f14438l;
        iVar.a();
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        k3.k kVar = this.f14261g;
        f5.a.j(kVar);
        iVar.q(myLooper, kVar);
        s();
    }

    @Override
    public final void n(z zVar) {
        b1[] b1VarArr;
        r0 r0Var = (r0) zVar;
        if (r0Var.H) {
            for (b1 b1Var : r0Var.E) {
                b1Var.i();
                n3.e eVar = b1Var.h;
                if (eVar != null) {
                    eVar.p(b1Var.f14269e);
                    b1Var.h = null;
                    b1Var.f14271g = null;
                }
            }
        }
        r0Var.v.e(r0Var);
        r0Var.B.removeCallbacksAndMessages(null);
        r0Var.C = null;
        r0Var.X = true;
    }

    @Override
    public final void p() {
        this.f14438l.release();
    }

    public final void s() {
        j3.b1 b1Var;
        long j10 = this.f14442p;
        boolean z10 = this.f14443q;
        boolean z11 = this.f14444r;
        j3.f1 f1Var = this.h;
        if (z11) {
            b1Var = f1Var.f10438c;
        } else {
            b1Var = null;
        }
        r2 i1Var = new i1(-9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, f1Var, b1Var);
        if (this.f14441o) {
            i1Var = new q(i1Var, 1);
        }
        m(i1Var);
    }

    public final void t(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f14442p;
        }
        if (!this.f14441o && this.f14442p == j10 && this.f14443q == z10 && this.f14444r == z11) {
            return;
        }
        this.f14442p = j10;
        this.f14443q = z10;
        this.f14444r = z11;
        this.f14441o = false;
        s();
    }

    @Override
    public final void j() {
    }
}
