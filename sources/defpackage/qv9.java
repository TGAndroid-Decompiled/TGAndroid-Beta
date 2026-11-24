package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
public final class qv9 extends ov9 {
    public final vk9 j;
    public final vk9 k;
    public final long l;

    public qv9(az8 az8Var, long j, long j2, long j3, long j4, long j5, ArrayList arrayList, long j6, vk9 vk9Var, vk9 vk9Var2, long j7, long j8) {
        super(az8Var, j, j2, j3, j5, arrayList, j6, j7, j8);
        this.j = vk9Var;
        this.k = vk9Var2;
        this.l = j4;
    }

    @Override
    public final tv9 a() {
        return new qv9(this.a, this.b, 0L, this.d, this.l, this.e, this.f, this.i, this.j, this.k, this.g, this.h);
    }

    @Override
    public final az8 b(i89 i89Var) {
        vk9 vk9Var = this.j;
        if (vk9Var != null) {
            fm4 fm4Var = i89Var.a;
            return new az8(0L, vk9Var.g(fm4Var.k, 0L, 0L, fm4Var.a), -1L);
        }
        return this.a;
    }

    @Override
    public final long e(long j) {
        ArrayList arrayList = this.f;
        if (arrayList != null) {
            return arrayList.size();
        }
        long j2 = this.l;
        if (j2 != -1) {
            return (j2 - this.d) + 1;
        }
        if (j == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.b));
        BigInteger multiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i = th0.a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override
    public final az8 i(g89 g89Var, long j) {
        long j2;
        ArrayList arrayList = this.f;
        long j3 = j - this.d;
        if (arrayList != null) {
            j2 = ((rv9) arrayList.get((int) j3)).a;
        } else {
            j2 = j3 * this.e;
        }
        long j4 = j2;
        fm4 fm4Var = g89Var.a;
        String str = fm4Var.a;
        return new az8(0L, this.k.g(fm4Var.k, j, j4, str), -1L);
    }
}
