package m2;

import b2.w;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import m.g3;
public final class p extends n {
    public final g3 f16462j;
    public final g3 f16463k;
    public final long f16464l;

    public p(j jVar, long j10, long j11, long j12, long j13, long j14, List list, long j15, g3 g3Var, g3 g3Var2, long j16, long j17) {
        super(jVar, j10, j11, j12, j14, list, j15, j16, j17);
        this.f16462j = g3Var;
        this.f16463k = g3Var2;
        this.f16464l = j13;
    }

    @Override
    public final j a(m mVar) {
        g3 g3Var = this.f16462j;
        if (g3Var != null) {
            w wVar = mVar.f16454a;
            return new j(0L, -1L, g3Var.s(wVar.f4121j, wVar.f4115a, 0L, 0L));
        }
        return this.f16467a;
    }

    @Override
    public final long d(long j10) {
        List list = this.f16458f;
        if (list != null) {
            return list.size();
        }
        long j11 = this.f16464l;
        if (j11 != -1) {
            return (j11 - this.d) + 1;
        }
        if (j10 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f16468b));
        BigInteger multiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i10 = g9.a.f10942a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override
    public final j h(k kVar, long j10) {
        long j11;
        long j12 = this.d;
        List list = this.f16458f;
        if (list != null) {
            j11 = ((q) list.get((int) (j10 - j12))).f16465a;
        } else {
            j11 = (j10 - j12) * this.e;
        }
        long j13 = j11;
        w wVar = kVar.f16454a;
        String str = wVar.f4115a;
        return new j(0L, -1L, this.f16463k.s(wVar.f4121j, str, j10, j13));
    }
}
