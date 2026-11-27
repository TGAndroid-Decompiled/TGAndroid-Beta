package defpackage;

import java.math.BigInteger;
public final class kc3 implements zy9 {
    public final lc3 a;

    public kc3(lc3 lc3Var) {
        this.a = lc3Var;
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
    public final yy9 e(long j) {
        lc3 lc3Var = this.a;
        long j2 = lc3Var.b;
        BigInteger valueOf = BigInteger.valueOf((lc3Var.d.i * j) / 1000000);
        long j3 = lc3Var.c;
        bz9 bz9Var = new bz9(j, gcc.j((valueOf.multiply(BigInteger.valueOf(j3 - j2)).divide(BigInteger.valueOf(lc3Var.f)).longValue() + j2) - 30000, lc3Var.b, j3 - 1));
        return new yy9(bz9Var, bz9Var);
    }

    @Override
    public final long h() {
        lc3 lc3Var = this.a;
        return (lc3Var.f * 1000000) / lc3Var.d.i;
    }
}
