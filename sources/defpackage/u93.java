package defpackage;

import java.io.IOException;
public final class u93 {
    public final f31 a;
    public final i89 b;
    public final wg0 c;
    public final r53 d;
    public final long e;
    public final long f;

    public u93(long j, i89 i89Var, wg0 wg0Var, f31 f31Var, long j2, r53 r53Var) {
        this.e = j;
        this.b = i89Var;
        this.c = wg0Var;
        this.f = j2;
        this.a = f31Var;
        this.d = r53Var;
    }

    public final u93 a(long j, i89 i89Var) {
        long C;
        long j2;
        r53 b = this.b.b();
        r53 b2 = i89Var.b();
        if (b != null && b2 != null && b.V() && b.g0(j) != 0 && b2.g0(j) != 0) {
            long g0 = b.g0(j);
            long c0 = b.c0();
            long e = b.e(c0);
            long j3 = g0 + c0;
            long j4 = j3 - 1;
            long k = b.k(j4, j) + b.e(j4);
            long c02 = b2.c0();
            long e2 = b2.e(c02);
            int i = (k > e2 ? 1 : (k == e2 ? 0 : -1));
            long j5 = this.f;
            if (i == 0) {
                j2 = (j3 - c02) + j5;
            } else if (i >= 0) {
                if (e2 < e) {
                    C = j5 - (b2.C(e, j) - c0);
                } else {
                    C = (b.C(e2, j) - c02) + j5;
                }
                j2 = C;
            } else {
                throw new IOException();
            }
            return new u93(j, i89Var, this.c, this.a, j2, b2);
        }
        return new u93(j, i89Var, this.c, this.a, this.f, b2);
    }

    public final long b(long j) {
        r53 r53Var = this.d;
        r53Var.getClass();
        long j2 = this.e;
        r53Var.getClass();
        return (r53Var.h0(j2, j) + (r53Var.r(j2, j) + this.f)) - 1;
    }

    public final long c() {
        r53 r53Var = this.d;
        r53Var.getClass();
        return r53Var.g0(this.e);
    }

    public final long d(long j) {
        long e = e(j);
        r53 r53Var = this.d;
        r53Var.getClass();
        return r53Var.k(j - this.f, this.e) + e;
    }

    public final long e(long j) {
        r53 r53Var = this.d;
        r53Var.getClass();
        return r53Var.e(j - this.f);
    }

    public final boolean f(long j, long j2) {
        r53 r53Var = this.d;
        r53Var.getClass();
        if (!r53Var.V() && j2 != -9223372036854775807L && d(j) > j2) {
            return false;
        }
        return true;
    }
}
