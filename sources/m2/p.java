package m2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import m.e3;
public final class p extends n {
    public final e3 f14438j;
    public final e3 f14439k;
    public final long f14440l;

    public p(j jVar, long j3, long j10, long j11, long j12, long j13, List list, long j14, e3 e3Var, e3 e3Var2, long j15, long j16) {
        super(jVar, j3, j10, j11, j13, list, j14, j15, j16);
        this.f14438j = e3Var;
        this.f14439k = e3Var2;
        this.f14440l = j12;
    }

    @Override
    public final j a(m mVar) {
        e3 e3Var = this.f14438j;
        if (e3Var != null) {
            b2.s sVar = mVar.f14430a;
            return new j(0L, -1L, e3Var.u(sVar.f3296j, sVar.f3290a, 0L, 0L));
        }
        return this.f14443a;
    }

    @Override
    public final long d(long j3) {
        List list = this.f14434f;
        if (list != null) {
            return list.size();
        }
        long j10 = this.f14440l;
        if (j10 != -1) {
            return (j10 - this.d) + 1;
        }
        if (j3 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j3).multiply(BigInteger.valueOf(this.f14444b));
        BigInteger multiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i10 = g9.a.f9523a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override
    public final j h(k kVar, long j3) {
        long j10;
        long j11 = this.d;
        List list = this.f14434f;
        if (list != null) {
            j10 = ((q) list.get((int) (j3 - j11))).f14441a;
        } else {
            j10 = (j3 - j11) * this.e;
        }
        long j12 = j10;
        b2.s sVar = kVar.f14430a;
        String str = sVar.f3290a;
        return new j(0L, -1L, this.f14439k.u(sVar.f3296j, str, j3, j12));
    }
}
