package defpackage;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
public final class vs8 extends qg0 {
    public final m63 i;
    public final k88 j;
    public final yq3 k;
    public final i2f l;
    public final int m;
    public final fm4 n;
    public boolean o = true;
    public long p = -9223372036854775807L;
    public boolean q;
    public boolean r;
    public boolean s;
    public vyb t;
    public br6 u;

    public vs8(br6 br6Var, m63 m63Var, k88 k88Var, yq3 yq3Var, i2f i2fVar, int i, fm4 fm4Var) {
        this.u = br6Var;
        this.i = m63Var;
        this.j = k88Var;
        this.k = yq3Var;
        this.l = i2fVar;
        this.m = i;
        this.n = fm4Var;
    }

    @Override
    public final boolean a(br6 br6Var) {
        xq6 xq6Var = i().b;
        xq6Var.getClass();
        xq6 xq6Var2 = br6Var.b;
        if (xq6Var2 != null && xq6Var2.a.equals(xq6Var.a) && xq6Var2.h == xq6Var.h && Objects.equals(xq6Var2.f, xq6Var.f)) {
            return true;
        }
        return false;
    }

    @Override
    public final sr6 c(rx6 rx6Var, mv6 mv6Var, long j) {
        o63 createDataSource = this.i.createDataSource();
        vyb vybVar = this.t;
        if (vybVar != null) {
            createDataSource.addTransferListener(vybVar);
        }
        xq6 xq6Var = i().b;
        xq6Var.getClass();
        Uri uri = xq6Var.a;
        this.g.getClass();
        return new ts8(uri, createDataSource, new mv6((m74) this.j.b, (byte) 11), this.k, new vq3(this.d.c, 0, rx6Var), this.l, b(rx6Var), this, mv6Var, xq6Var.f, this.m, this.n, g8c.T(xq6Var.h), null);
    }

    @Override
    public final synchronized br6 i() {
        return this.u;
    }

    @Override
    public final void m(vyb vybVar) {
        this.t = vybVar;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        uc8 uc8Var = this.g;
        uc8Var.getClass();
        yq3 yq3Var = this.k;
        yq3Var.u(myLooper, uc8Var);
        yq3Var.a();
        u();
    }

    @Override
    public final void o(sr6 sr6Var) {
        gp9[] gp9VarArr;
        ts8 ts8Var = (ts8) sr6Var;
        if (ts8Var.P) {
            for (gp9 gp9Var : ts8Var.M) {
                gp9Var.l();
                sq3 sq3Var = gp9Var.h;
                if (sq3Var != null) {
                    sq3Var.c(gp9Var.e);
                    gp9Var.h = null;
                    gp9Var.g = null;
                }
            }
        }
        ts8Var.y.b0(ts8Var);
        ts8Var.I.removeCallbacksAndMessages(null);
        ts8Var.J = null;
        ts8Var.k0 = true;
    }

    @Override
    public final void q() {
        this.k.release();
    }

    @Override
    public final synchronized void t(br6 br6Var) {
        this.u = br6Var;
    }

    public final void u() {
        wq6 wq6Var;
        long j = this.p;
        boolean z = this.q;
        boolean z2 = this.r;
        br6 i = i();
        if (z2) {
            wq6Var = i.c;
        } else {
            wq6Var = null;
        }
        aob liaVar = new lia(-9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, i, wq6Var);
        if (this.o) {
            liaVar = new yf6(liaVar, (byte) 1);
        }
        n(liaVar);
    }

    public final void v(long j, fv9 fv9Var, boolean z) {
        if (!this.s || !fv9Var.d()) {
            this.s = !fv9Var.d();
            if (j == -9223372036854775807L) {
                j = this.p;
            }
            boolean c = fv9Var.c();
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
