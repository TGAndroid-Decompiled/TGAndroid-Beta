package defpackage;

import java.io.IOException;
public final class rs8 implements ip9 {
    public final int a;
    public final boolean b;
    public final ts8 c;

    public rs8(ts8 ts8Var, int i, boolean z) {
        this.c = ts8Var;
        this.a = i;
        this.b = z;
    }

    @Override
    public final int a() {
        if (this.b) {
            return 4;
        }
        return 0;
    }

    @Override
    public final void b() {
        int i = this.a;
        ts8 ts8Var = this.c;
        ts8Var.M[i].C();
        mv6 mv6Var = ts8Var.y;
        int v3 = ts8Var.d.v3(ts8Var.W);
        IOException iOException = (IOException) mv6Var.d;
        if (iOException == null) {
            j86 j86Var = (j86) mv6Var.c;
            if (j86Var != null) {
                if (v3 == Integer.MIN_VALUE) {
                    v3 = j86Var.a;
                }
                IOException iOException2 = j86Var.e;
                if (iOException2 != null && j86Var.f > v3) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    @Override
    public final int h(sk4 sk4Var, z83 z83Var, int i) {
        ts8 ts8Var = this.c;
        if (ts8Var.C()) {
            return -3;
        }
        int i2 = this.a;
        ts8Var.w(i2);
        int F = ts8Var.M[i2].F(sk4Var, z83Var, i, ts8Var.j0);
        if (F == -3) {
            ts8Var.x(i2);
        }
        return F;
    }

    @Override
    public final boolean j() {
        ts8 ts8Var = this.c;
        if (!ts8Var.C() && ts8Var.M[this.a].A(ts8Var.j0)) {
            return true;
        }
        return false;
    }

    @Override
    public final int n(long j) {
        ts8 ts8Var = this.c;
        if (ts8Var.C()) {
            return 0;
        }
        int i = this.a;
        ts8Var.w(i);
        gp9 gp9Var = ts8Var.M[i];
        int x = gp9Var.x(j, ts8Var.j0);
        gp9Var.L(x);
        if (x == 0) {
            ts8Var.x(i);
        }
        return x;
    }
}
