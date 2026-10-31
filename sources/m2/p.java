package m2;

import b2.x;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
public final class p extends n {
    public final li.k f12675j;
    public final li.k f12676k;
    public final long f12677l;

    public p(j jVar, long j10, long j11, long j12, long j13, long j14, List list, long j15, li.k kVar, li.k kVar2, long j16, long j17) {
        super(jVar, j10, j11, j12, j14, list, j15, j16, j17);
        this.f12675j = kVar;
        this.f12676k = kVar2;
        this.f12677l = j13;
    }

    @Override
    public final j a(m mVar) {
        li.k kVar = this.f12675j;
        if (kVar != null) {
            x xVar = mVar.f12667a;
            return new j(0L, kVar.j(xVar.f2414j, 0L, 0L, xVar.f2408a), -1L);
        }
        return this.f12680a;
    }

    @Override
    public final long d(long j10) {
        List list = this.f12671f;
        if (list != null) {
            return list.size();
        }
        long j11 = this.f12677l;
        if (j11 != -1) {
            return (j11 - this.d) + 1;
        }
        if (j10 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f12681b));
        BigInteger multiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i10 = g9.a.f7464a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override
    public final j h(k kVar, long j10) {
        long j11;
        long j12 = this.d;
        List list = this.f12671f;
        if (list != null) {
            j11 = ((q) list.get((int) (j10 - j12))).f12678a;
        } else {
            j11 = (j10 - j12) * this.e;
        }
        long j13 = j11;
        x xVar = kVar.f12667a;
        String str = xVar.f2408a;
        return new j(0L, this.f12676k.j(xVar.f2414j, j10, j13, str), -1L);
    }
}
