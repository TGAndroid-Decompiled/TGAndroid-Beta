package m2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
public final class p extends n {
    public final lf.i f14426j;
    public final lf.i f14427k;
    public final long f14428l;

    public p(j jVar, long j3, long j10, long j11, long j12, long j13, List list, long j14, lf.i iVar, lf.i iVar2, long j15, long j16) {
        super(jVar, j3, j10, j11, j13, list, j14, j15, j16);
        this.f14426j = iVar;
        this.f14427k = iVar2;
        this.f14428l = j12;
    }

    @Override
    public final j a(m mVar) {
        lf.i iVar = this.f14426j;
        if (iVar != null) {
            b2.s sVar = mVar.f14418a;
            return new j(0L, -1L, iVar.u(sVar.f3293j, sVar.f3287a, 0L, 0L));
        }
        return this.f14431a;
    }

    @Override
    public final long d(long j3) {
        List list = this.f14422f;
        if (list != null) {
            return list.size();
        }
        long j10 = this.f14428l;
        if (j10 != -1) {
            return (j10 - this.d) + 1;
        }
        if (j3 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j3).multiply(BigInteger.valueOf(this.f14432b));
        BigInteger multiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i10 = g9.a.f9511a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override
    public final j h(k kVar, long j3) {
        long j10;
        long j11 = this.d;
        List list = this.f14422f;
        if (list != null) {
            j10 = ((q) list.get((int) (j3 - j11))).f14429a;
        } else {
            j10 = (j3 - j11) * this.e;
        }
        long j12 = j10;
        b2.s sVar = kVar.f14418a;
        String str = sVar.f3287a;
        return new j(0L, -1L, this.f14427k.u(sVar.f3293j, str, j3, j12));
    }
}
