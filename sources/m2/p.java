package m2;

import b2.x;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
public final class p extends n {
    public final li.k f15366j;
    public final li.k f15367k;
    public final long f15368l;

    public p(j jVar, long j10, long j11, long j12, long j13, long j14, List list, long j15, li.k kVar, li.k kVar2, long j16, long j17) {
        super(jVar, j10, j11, j12, j14, list, j15, j16, j17);
        this.f15366j = kVar;
        this.f15367k = kVar2;
        this.f15368l = j13;
    }

    @Override
    public final j a(m mVar) {
        li.k kVar = this.f15366j;
        if (kVar != null) {
            x xVar = mVar.f15358a;
            return new j(0L, -1L, kVar.q(xVar.f2510j, xVar.f2504a, 0L, 0L));
        }
        return this.f15371a;
    }

    @Override
    public final long d(long j10) {
        List list = this.f15362f;
        if (list != null) {
            return list.size();
        }
        long j11 = this.f15368l;
        if (j11 != -1) {
            return (j11 - this.d) + 1;
        }
        if (j10 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f15372b));
        BigInteger multiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i10 = g9.a.f10032a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override
    public final j h(k kVar, long j10) {
        long j11;
        long j12 = this.d;
        List list = this.f15362f;
        if (list != null) {
            j11 = ((q) list.get((int) (j10 - j12))).f15369a;
        } else {
            j11 = (j10 - j12) * this.e;
        }
        long j13 = j11;
        x xVar = kVar.f15358a;
        String str = xVar.f2504a;
        return new j(0L, -1L, this.f15367k.q(xVar.f2510j, str, j10, j13));
    }
}
