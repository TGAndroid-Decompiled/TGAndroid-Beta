package n4;

import h3.t0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

public final class p extends n {

    public final u5.k f18267j;

    public final u5.k f18268k;

    public final long f18269l;

    public p(j jVar, long j10, long j11, long j12, long j13, long j14, List list, long j15, u5.k kVar, u5.k kVar2, long j16, long j17) {
        super(jVar, j10, j11, j12, j14, list, j15, j16, j17);
        this.f18267j = kVar;
        this.f18268k = kVar2;
        this.f18269l = j13;
    }

    @Override
    public final j a(m mVar) {
        u5.k kVar = this.f18267j;
        if (kVar == null) {
            return this.f18273a;
        }
        t0 t0Var = mVar.f18257a;
        return new j(0L, -1L, kVar.a(t0Var.f8189n, t0Var.f8184a, 0L, 0L));
    }

    @Override
    public final long d(long j10) {
        List list = this.f18263f;
        if (list != null) {
            return list.size();
        }
        long j11 = this.f18269l;
        if (j11 != -1) {
            return (j11 - this.d) + 1;
        }
        if (j10 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f18274b));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.f18262e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i10 = q8.a.f46174a;
        return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override
    public final j h(k kVar, long j10) {
        long j11 = this.d;
        List list = this.f18263f;
        long j12 = list != null ? ((q) list.get((int) (j10 - j11))).f18270a : (j10 - j11) * this.f18262e;
        t0 t0Var = kVar.f18257a;
        return new j(0L, -1L, this.f18268k.a(t0Var.f8189n, t0Var.f8184a, j10, j12));
    }
}
