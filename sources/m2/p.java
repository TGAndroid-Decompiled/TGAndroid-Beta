package m2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
public final class p extends n {
    public final la.h f14695j;
    public final la.h f14696k;
    public final long f14697l;

    public p(j jVar, long j3, long j10, long j11, long j12, long j13, List list, long j14, la.h hVar, la.h hVar2, long j15, long j16) {
        super(jVar, j3, j10, j11, j13, list, j14, j15, j16);
        this.f14695j = hVar;
        this.f14696k = hVar2;
        this.f14697l = j12;
    }

    @Override
    public final j a(m mVar) {
        la.h hVar = this.f14695j;
        if (hVar != null) {
            b2.s sVar = mVar.f14687a;
            return new j(0L, -1L, hVar.t(sVar.f3300j, sVar.f3294a, 0L, 0L));
        }
        return this.f14700a;
    }

    @Override
    public final long d(long j3) {
        List list = this.f14691f;
        if (list != null) {
            return list.size();
        }
        long j10 = this.f14697l;
        if (j10 != -1) {
            return (j10 - this.d) + 1;
        }
        if (j3 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j3).multiply(BigInteger.valueOf(this.f14701b));
        BigInteger multiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i10 = g9.a.f9522a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override
    public final j h(k kVar, long j3) {
        long j10;
        long j11 = this.d;
        List list = this.f14691f;
        if (list != null) {
            j10 = ((q) list.get((int) (j3 - j11))).f14698a;
        } else {
            j10 = (j3 - j11) * this.e;
        }
        long j12 = j10;
        b2.s sVar = kVar.f14687a;
        String str = sVar.f3294a;
        return new j(0L, -1L, this.f14696k.t(sVar.f3300j, str, j3, j12));
    }
}
