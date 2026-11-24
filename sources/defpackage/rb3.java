package defpackage;

import java.math.BigInteger;
public final class rb3 implements fv9 {
    public final sb3 a;

    public rb3(sb3 sb3Var) {
        this.a = sb3Var;
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
    public final ev9 f(long j) {
        sb3 sb3Var = this.a;
        long j2 = sb3Var.b;
        BigInteger valueOf = BigInteger.valueOf((sb3Var.d.i * j) / 1000000);
        long j3 = sb3Var.c;
        hv9 hv9Var = new hv9(j, g8c.j((valueOf.multiply(BigInteger.valueOf(j3 - j2)).divide(BigInteger.valueOf(sb3Var.f)).longValue() + j2) - 30000, sb3Var.b, j3 - 1));
        return new ev9(hv9Var, hv9Var);
    }

    @Override
    public final long h() {
        sb3 sb3Var = this.a;
        return (sb3Var.f * 1000000) / sb3Var.d.i;
    }
}
