package m2;

import b2.x;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import m.h3;
public final class p extends n {
    public final h3 f15101j;
    public final h3 f15102k;
    public final long f15103l;

    public p(j jVar, long j10, long j11, long j12, long j13, long j14, List list, long j15, h3 h3Var, h3 h3Var2, long j16, long j17) {
        super(jVar, j10, j11, j12, j14, list, j15, j16, j17);
        this.f15101j = h3Var;
        this.f15102k = h3Var2;
        this.f15103l = j13;
    }

    @Override
    public final j a(m mVar) {
        h3 h3Var = this.f15101j;
        if (h3Var != null) {
            x xVar = mVar.f15093a;
            return new j(0L, -1L, h3Var.s(xVar.f2514j, xVar.f2508a, 0L, 0L));
        }
        return this.f15106a;
    }

    @Override
    public final long d(long j10) {
        List list = this.f15097f;
        if (list != null) {
            return list.size();
        }
        long j11 = this.f15103l;
        if (j11 != -1) {
            return (j11 - this.d) + 1;
        }
        if (j10 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f15107b));
        BigInteger multiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i10 = g9.a.f10035a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override
    public final j h(k kVar, long j10) {
        long j11;
        long j12 = this.d;
        List list = this.f15097f;
        if (list != null) {
            j11 = ((q) list.get((int) (j10 - j12))).f15104a;
        } else {
            j11 = (j10 - j12) * this.e;
        }
        long j13 = j11;
        x xVar = kVar.f15093a;
        String str = xVar.f2508a;
        return new j(0L, -1L, this.f15102k.s(xVar.f2514j, str, j10, j13));
    }
}
