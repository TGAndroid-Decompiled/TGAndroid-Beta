package o2;

import d2.v;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
public final class p extends n {
    public final k4.j f20563j;
    public final k4.j f20564k;
    public final long f20565l;

    public p(j jVar, long j10, long j11, long j12, long j13, long j14, List list, long j15, k4.j jVar2, k4.j jVar3, long j16, long j17) {
        super(jVar, j10, j11, j12, j14, list, j15, j16, j17);
        this.f20563j = jVar2;
        this.f20564k = jVar3;
        this.f20565l = j13;
    }

    @Override
    public final j a(m mVar) {
        k4.j jVar = this.f20563j;
        if (jVar != null) {
            v vVar = mVar.f20553a;
            return new j(0L, jVar.n(vVar.f8480j, 0L, 0L, vVar.f8473a), -1L);
        }
        return this.f20569a;
    }

    @Override
    public final long d(long j10) {
        List list = this.f20559f;
        if (list != null) {
            return list.size();
        }
        long j11 = this.f20565l;
        if (j11 != -1) {
            return (j11 - this.d) + 1;
        }
        if (j10 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f20570b));
        BigInteger multiply2 = BigInteger.valueOf(this.f20558e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i3 = i9.a.f14711a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override
    public final j h(k kVar, long j10) {
        long j11;
        long j12 = this.d;
        List list = this.f20559f;
        if (list != null) {
            j11 = ((q) list.get((int) (j10 - j12))).f20566a;
        } else {
            j11 = (j10 - j12) * this.f20558e;
        }
        long j13 = j11;
        v vVar = kVar.f20553a;
        String str = vVar.f8473a;
        return new j(0L, this.f20564k.n(vVar.f8480j, j10, j13, str), -1L);
    }
}
