package m2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import m.f3;
public final class p extends n {
    public final f3 f15712j;
    public final f3 f15713k;
    public final long f15714l;

    public p(j jVar, long j3, long j10, long j11, long j12, long j13, List list, long j14, f3 f3Var, f3 f3Var2, long j15, long j16) {
        super(jVar, j3, j10, j11, j13, list, j14, j15, j16);
        this.f15712j = f3Var;
        this.f15713k = f3Var2;
        this.f15714l = j12;
    }

    @Override
    public final j a(m mVar) {
        f3 f3Var = this.f15712j;
        if (f3Var != null) {
            b2.s sVar = mVar.f15702a;
            return new j(0L, -1L, f3Var.u(sVar.f3633j, sVar.f3626a, 0L, 0L));
        }
        return this.f15718a;
    }

    @Override
    public final long d(long j3) {
        List list = this.f15708f;
        if (list != null) {
            return list.size();
        }
        long j10 = this.f15714l;
        if (j10 != -1) {
            return (j10 - this.d) + 1;
        }
        if (j3 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j3).multiply(BigInteger.valueOf(this.f15719b));
        BigInteger multiply2 = BigInteger.valueOf(this.f15707e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i10 = g9.a.f10427a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override
    public final j h(k kVar, long j3) {
        long j10;
        long j11 = this.d;
        List list = this.f15708f;
        if (list != null) {
            j10 = ((q) list.get((int) (j3 - j11))).f15715a;
        } else {
            j10 = (j3 - j11) * this.f15707e;
        }
        long j12 = j10;
        b2.s sVar = kVar.f15702a;
        String str = sVar.f3626a;
        return new j(0L, -1L, this.f15713k.u(sVar.f3633j, str, j3, j12));
    }
}
