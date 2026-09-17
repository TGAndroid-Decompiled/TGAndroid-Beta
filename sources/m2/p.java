package m2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
public final class p extends n {
    public final t f15834j;
    public final t f15835k;
    public final long f15836l;

    public p(j jVar, long j3, long j10, long j11, long j12, long j13, List list, long j14, t tVar, t tVar2, long j15, long j16) {
        super(jVar, j3, j10, j11, j13, list, j14, j15, j16);
        this.f15834j = tVar;
        this.f15835k = tVar2;
        this.f15836l = j12;
    }

    @Override
    public final j a(m mVar) {
        t tVar = this.f15834j;
        if (tVar != null) {
            b2.s sVar = mVar.f15824a;
            return new j(0L, -1L, tVar.p(sVar.f2389j, sVar.f2382a, 0L, 0L));
        }
        return this.f15840a;
    }

    @Override
    public final long d(long j3) {
        List list = this.f15830f;
        if (list != null) {
            return list.size();
        }
        long j10 = this.f15836l;
        if (j10 != -1) {
            return (j10 - this.d) + 1;
        }
        if (j3 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j3).multiply(BigInteger.valueOf(this.f15841b));
        BigInteger multiply2 = BigInteger.valueOf(this.f15829e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i10 = g9.a.f10520a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override
    public final j h(k kVar, long j3) {
        long j10;
        long j11 = this.d;
        List list = this.f15830f;
        if (list != null) {
            j10 = ((q) list.get((int) (j3 - j11))).f15837a;
        } else {
            j10 = (j3 - j11) * this.f15829e;
        }
        long j12 = j10;
        b2.s sVar = kVar.f15824a;
        String str = sVar.f2382a;
        return new j(0L, -1L, this.f15835k.p(sVar.f2389j, str, j3, j12));
    }
}
