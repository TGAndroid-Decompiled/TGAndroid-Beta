package m2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
public final class p extends n {
    public final la.h f16032j;
    public final la.h f16033k;
    public final long f16034l;

    public p(j jVar, long j3, long j10, long j11, long j12, long j13, List list, long j14, la.h hVar, la.h hVar2, long j15, long j16) {
        super(jVar, j3, j10, j11, j13, list, j14, j15, j16);
        this.f16032j = hVar;
        this.f16033k = hVar2;
        this.f16034l = j12;
    }

    @Override
    public final j a(m mVar) {
        la.h hVar = this.f16032j;
        if (hVar != null) {
            b2.s sVar = mVar.f16022a;
            return new j(0L, -1L, hVar.o(sVar.f3556j, sVar.f3549a, 0L, 0L));
        }
        return this.f16038a;
    }

    @Override
    public final long d(long j3) {
        List list = this.f16028f;
        if (list != null) {
            return list.size();
        }
        long j10 = this.f16034l;
        if (j10 != -1) {
            return (j10 - this.d) + 1;
        }
        if (j3 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j3).multiply(BigInteger.valueOf(this.f16039b));
        BigInteger multiply2 = BigInteger.valueOf(this.f16027e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i10 = g9.a.f10356a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override
    public final j h(k kVar, long j3) {
        long j10;
        long j11 = this.d;
        List list = this.f16028f;
        if (list != null) {
            j10 = ((q) list.get((int) (j3 - j11))).f16035a;
        } else {
            j10 = (j3 - j11) * this.f16027e;
        }
        long j12 = j10;
        b2.s sVar = kVar.f16022a;
        String str = sVar.f3549a;
        return new j(0L, -1L, this.f16033k.o(sVar.f3556j, str, j3, j12));
    }
}
