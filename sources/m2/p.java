package m2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
public final class p extends n {
    public final lf.i f14436j;
    public final lf.i f14437k;
    public final long f14438l;

    public p(j jVar, long j3, long j10, long j11, long j12, long j13, List list, long j14, lf.i iVar, lf.i iVar2, long j15, long j16) {
        super(jVar, j3, j10, j11, j13, list, j14, j15, j16);
        this.f14436j = iVar;
        this.f14437k = iVar2;
        this.f14438l = j12;
    }

    @Override
    public final j a(m mVar) {
        lf.i iVar = this.f14436j;
        if (iVar != null) {
            b2.s sVar = mVar.f14428a;
            return new j(0L, -1L, iVar.u(sVar.f3298j, sVar.f3292a, 0L, 0L));
        }
        return this.f14441a;
    }

    @Override
    public final long d(long j3) {
        List list = this.f14432f;
        if (list != null) {
            return list.size();
        }
        long j10 = this.f14438l;
        if (j10 != -1) {
            return (j10 - this.d) + 1;
        }
        if (j3 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j3).multiply(BigInteger.valueOf(this.f14442b));
        BigInteger multiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i10 = g9.a.f9525a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override
    public final j h(k kVar, long j3) {
        long j10;
        long j11 = this.d;
        List list = this.f14432f;
        if (list != null) {
            j10 = ((q) list.get((int) (j3 - j11))).f14439a;
        } else {
            j10 = (j3 - j11) * this.e;
        }
        long j12 = j10;
        b2.s sVar = kVar.f14428a;
        String str = sVar.f3292a;
        return new j(0L, -1L, this.f14437k.u(sVar.f3298j, str, j3, j12));
    }
}
