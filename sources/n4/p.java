package n4;

import h3.t0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
public final class p extends n {
    public final t5.l f18440j;
    public final t5.l f18441k;
    public final long f18442l;

    public p(j jVar, long j10, long j11, long j12, long j13, long j14, List list, long j15, t5.l lVar, t5.l lVar2, long j16, long j17) {
        super(jVar, j10, j11, j12, j14, list, j15, j16, j17);
        this.f18440j = lVar;
        this.f18441k = lVar2;
        this.f18442l = j13;
    }

    @Override
    public final j a(m mVar) {
        t5.l lVar = this.f18440j;
        if (lVar != null) {
            t0 t0Var = mVar.f18430a;
            return new j(0L, -1L, lVar.a(t0Var.f9765n, t0Var.f9760a, 0L, 0L));
        }
        return this.f18446a;
    }

    @Override
    public final long d(long j10) {
        List list = this.f18436f;
        if (list != null) {
            return list.size();
        }
        long j11 = this.f18442l;
        if (j11 != -1) {
            return (j11 - this.d) + 1;
        }
        if (j10 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f18447b));
        BigInteger multiply2 = BigInteger.valueOf(this.f18435e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i9 = p8.a.f45504a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override
    public final j h(k kVar, long j10) {
        long j11;
        long j12 = this.d;
        List list = this.f18436f;
        if (list != null) {
            j11 = ((q) list.get((int) (j10 - j12))).f18443a;
        } else {
            j11 = (j10 - j12) * this.f18435e;
        }
        long j13 = j11;
        t0 t0Var = kVar.f18430a;
        String str = t0Var.f9760a;
        return new j(0L, -1L, this.f18441k.a(t0Var.f9765n, str, j10, j13));
    }
}
