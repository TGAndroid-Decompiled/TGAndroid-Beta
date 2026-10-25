package m2;

import b2.x;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
public final class p extends n {
    public final k6.c f17980j;
    public final k6.c f17981k;
    public final long f17982l;

    public p(j jVar, long j10, long j11, long j12, long j13, long j14, List list, long j15, k6.c cVar, k6.c cVar2, long j16, long j17) {
        super(jVar, j10, j11, j12, j14, list, j15, j16, j17);
        this.f17980j = cVar;
        this.f17981k = cVar2;
        this.f17982l = j13;
    }

    @Override
    public final j a(m mVar) {
        k6.c cVar = this.f17980j;
        if (cVar != null) {
            x xVar = mVar.f17972a;
            return new j(0L, -1L, cVar.k(xVar.f3577j, xVar.f3571a, 0L, 0L));
        }
        return this.f17985a;
    }

    @Override
    public final long d(long j10) {
        List list = this.f17976f;
        if (list != null) {
            return list.size();
        }
        long j11 = this.f17982l;
        if (j11 != -1) {
            return (j11 - this.d) + 1;
        }
        if (j10 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f17986b));
        BigInteger multiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i10 = h9.a.f12719a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override
    public final j h(k kVar, long j10) {
        long j11;
        long j12 = this.d;
        List list = this.f17976f;
        if (list != null) {
            j11 = ((q) list.get((int) (j10 - j12))).f17983a;
        } else {
            j11 = (j10 - j12) * this.e;
        }
        long j13 = j11;
        x xVar = kVar.f17972a;
        String str = xVar.f3571a;
        return new j(0L, -1L, this.f17981k.k(xVar.f3577j, str, j10, j13));
    }
}
