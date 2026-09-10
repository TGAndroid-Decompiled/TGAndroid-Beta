package m2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import m.e3;
public final class p extends n {
    public final e3 f13276j;
    public final e3 f13277k;
    public final long f13278l;

    public p(j jVar, long j3, long j10, long j11, long j12, long j13, List list, long j14, e3 e3Var, e3 e3Var2, long j15, long j16) {
        super(jVar, j3, j10, j11, j13, list, j14, j15, j16);
        this.f13276j = e3Var;
        this.f13277k = e3Var2;
        this.f13278l = j12;
    }

    @Override
    public final j a(m mVar) {
        e3 e3Var = this.f13276j;
        if (e3Var != null) {
            b2.s sVar = mVar.f13268a;
            return new j(0L, -1L, e3Var.u(sVar.f1994j, sVar.f1988a, 0L, 0L));
        }
        return this.f13281a;
    }

    @Override
    public final long d(long j3) {
        List list = this.f13272f;
        if (list != null) {
            return list.size();
        }
        long j10 = this.f13278l;
        if (j10 != -1) {
            return (j10 - this.d) + 1;
        }
        if (j3 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j3).multiply(BigInteger.valueOf(this.f13282b));
        BigInteger multiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i10 = g9.a.f8656a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override
    public final j h(k kVar, long j3) {
        long j10;
        long j11 = this.d;
        List list = this.f13272f;
        if (list != null) {
            j10 = ((q) list.get((int) (j3 - j11))).f13279a;
        } else {
            j10 = (j3 - j11) * this.e;
        }
        long j12 = j10;
        b2.s sVar = kVar.f13268a;
        String str = sVar.f1988a;
        return new j(0L, -1L, this.f13277k.u(sVar.f1994j, str, j3, j12));
    }
}
