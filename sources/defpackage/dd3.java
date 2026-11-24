package defpackage;

import java.math.BigInteger;
public final class dd3 implements ix9 {
    public final ed3 a;

    public dd3(ed3 ed3Var) {
        this.a = ed3Var;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final hx9 f(long j) {
        ed3 ed3Var = this.a;
        long j2 = ed3Var.b;
        BigInteger valueOf = BigInteger.valueOf((ed3Var.d.i * j) / 1000000);
        long j3 = ed3Var.c;
        kx9 kx9Var = new kx9(j, hac.j((valueOf.multiply(BigInteger.valueOf(j3 - j2)).divide(BigInteger.valueOf(ed3Var.f)).longValue() + j2) - 30000, ed3Var.b, j3 - 1));
        return new hx9(kx9Var, kx9Var);
    }

    @Override
    public final long h() {
        ed3 ed3Var = this.a;
        return (ed3Var.f * 1000000) / ed3Var.d.i;
    }
}
