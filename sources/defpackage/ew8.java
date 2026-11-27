package defpackage;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
public final class ew8 extends rg0 {
    public final f73 i;
    public final jz7 j;
    public final pr3 k;
    public final z6f l;
    public final int m;
    public final ko4 n;
    public boolean o = true;
    public long p = -9223372036854775807L;
    public boolean q;
    public boolean r;
    public boolean s;
    public v2c t;
    public ft6 u;

    public ew8(ft6 ft6Var, f73 f73Var, jz7 jz7Var, pr3 pr3Var, z6f z6fVar, int i, ko4 ko4Var) {
        this.u = ft6Var;
        this.i = f73Var;
        this.j = jz7Var;
        this.k = pr3Var;
        this.l = z6fVar;
        this.m = i;
        this.n = ko4Var;
    }

    @Override
    public final boolean a(ft6 ft6Var) {
        bt6 bt6Var = i().b;
        bt6Var.getClass();
        bt6 bt6Var2 = ft6Var.b;
        if (bt6Var2 != null && bt6Var2.a.equals(bt6Var.a) && bt6Var2.h == bt6Var.h && Objects.equals(bt6Var2.f, bt6Var.f)) {
            return true;
        }
        return false;
    }

    @Override
    public final xt6 c(vz6 vz6Var, rx6 rx6Var, long j) {
        h73 createDataSource = this.i.createDataSource();
        v2c v2cVar = this.t;
        if (v2cVar != null) {
            createDataSource.addTransferListener(v2cVar);
        }
        bt6 bt6Var = i().b;
        bt6Var.getClass();
        Uri uri = bt6Var.a;
        this.g.getClass();
        return new cw8(uri, createDataSource, new rx6((h84) this.j.b, (byte) 11), this.k, new mr3(this.d.c, 0, vz6Var), this.l, b(vz6Var), this, rx6Var, bt6Var.f, this.m, this.n, gcc.T(bt6Var.h), null);
    }

    @Override
    public final synchronized ft6 i() {
        return this.u;
    }

    @Override
    public final void m(v2c v2cVar) {
        this.t = v2cVar;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        ig8 ig8Var = this.g;
        ig8Var.getClass();
        pr3 pr3Var = this.k;
        pr3Var.w(myLooper, ig8Var);
        pr3Var.a();
        u();
    }

    @Override
    public final void o(xt6 xt6Var) {
        ys9[] ys9VarArr;
        cw8 cw8Var = (cw8) xt6Var;
        if (cw8Var.P) {
            for (ys9 ys9Var : cw8Var.M) {
                ys9Var.l();
                jr3 jr3Var = ys9Var.h;
                if (jr3Var != null) {
                    jr3Var.c(ys9Var.e);
                    ys9Var.h = null;
                    ys9Var.g = null;
                }
            }
        }
        cw8Var.y.g0(cw8Var);
        cw8Var.I.removeCallbacksAndMessages(null);
        cw8Var.J = null;
        cw8Var.k0 = true;
    }

    @Override
    public final void q() {
        this.k.release();
    }

    @Override
    public final synchronized void t(ft6 ft6Var) {
        this.u = ft6Var;
    }

    public final void u() {
        at6 at6Var;
        long j = this.p;
        boolean z = this.q;
        boolean z2 = this.r;
        ft6 i = i();
        if (z2) {
            at6Var = i.c;
        } else {
            at6Var = null;
        }
        asb gmaVar = new gma(-9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, i, at6Var);
        if (this.o) {
            gmaVar = new ci6(gmaVar, (byte) 1);
        }
        n(gmaVar);
    }

    public final void v(long j, zy9 zy9Var, boolean z) {
        if (!this.s || !zy9Var.d()) {
            this.s = !zy9Var.d();
            if (j == -9223372036854775807L) {
                j = this.p;
            }
            boolean c = zy9Var.c();
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
