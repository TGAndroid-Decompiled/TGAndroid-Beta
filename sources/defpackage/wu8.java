package defpackage;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
public final class wu8 extends rh0 {
    public final y73 i;
    public final h68 j;
    public final is3 k;
    public final k4f l;
    public final int m;
    public final go4 n;
    public boolean o = true;
    public long p = -9223372036854775807L;
    public boolean q;
    public boolean r;
    public boolean s;
    public w0c t;
    public bt6 u;

    public wu8(bt6 bt6Var, y73 y73Var, h68 h68Var, is3 is3Var, k4f k4fVar, int i, go4 go4Var) {
        this.u = bt6Var;
        this.i = y73Var;
        this.j = h68Var;
        this.k = is3Var;
        this.l = k4fVar;
        this.m = i;
        this.n = go4Var;
    }

    @Override
    public final boolean a(bt6 bt6Var) {
        xs6 xs6Var = i().b;
        xs6Var.getClass();
        xs6 xs6Var2 = bt6Var.b;
        if (xs6Var2 != null && xs6Var2.a.equals(xs6Var.a) && xs6Var2.h == xs6Var.h && Objects.equals(xs6Var2.f, xs6Var.f)) {
            return true;
        }
        return false;
    }

    @Override
    public final tt6 c(rz6 rz6Var, mx6 mx6Var, long j) {
        a83 createDataSource = this.i.createDataSource();
        w0c w0cVar = this.t;
        if (w0cVar != null) {
            createDataSource.addTransferListener(w0cVar);
        }
        xs6 xs6Var = i().b;
        xs6Var.getClass();
        Uri uri = xs6Var.a;
        this.g.getClass();
        return new uu8(uri, createDataSource, new mx6((v84) this.j.b, (byte) 11), this.k, new fs3(this.d.c, 0, rz6Var), this.l, b(rz6Var), this, mx6Var, xs6Var.f, this.m, this.n, hac.T(xs6Var.h), null);
    }

    @Override
    public final synchronized bt6 i() {
        return this.u;
    }

    @Override
    public final void m(w0c w0cVar) {
        this.t = w0cVar;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        we8 we8Var = this.g;
        we8Var.getClass();
        is3 is3Var = this.k;
        is3Var.w(myLooper, we8Var);
        is3Var.a();
        u();
    }

    @Override
    public final void o(tt6 tt6Var) {
        hr9[] hr9VarArr;
        uu8 uu8Var = (uu8) tt6Var;
        if (uu8Var.P) {
            for (hr9 hr9Var : uu8Var.M) {
                hr9Var.l();
                cs3 cs3Var = hr9Var.h;
                if (cs3Var != null) {
                    cs3Var.c(hr9Var.e);
                    hr9Var.h = null;
                    hr9Var.g = null;
                }
            }
        }
        uu8Var.y.e0(uu8Var);
        uu8Var.I.removeCallbacksAndMessages(null);
        uu8Var.J = null;
        uu8Var.k0 = true;
    }

    @Override
    public final void q() {
        this.k.release();
    }

    @Override
    public final synchronized void t(bt6 bt6Var) {
        this.u = bt6Var;
    }

    public final void u() {
        ws6 ws6Var;
        long j = this.p;
        boolean z = this.q;
        boolean z2 = this.r;
        bt6 i = i();
        if (z2) {
            ws6Var = i.c;
        } else {
            ws6Var = null;
        }
        bqb nkaVar = new nka(-9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, i, ws6Var);
        if (this.o) {
            nkaVar = new yh6(nkaVar, (byte) 1);
        }
        n(nkaVar);
    }

    public final void v(long j, ix9 ix9Var, boolean z) {
        if (!this.s || !ix9Var.d()) {
            this.s = !ix9Var.d();
            if (j == -9223372036854775807L) {
                j = this.p;
            }
            boolean c = ix9Var.c();
            if (!this.o && this.p == j && this.q == c && this.r == z) {
                return;
            }
            this.p = j;
            this.q = c;
            this.r = z;
            this.o = false;
            u();
        }
    }
}
