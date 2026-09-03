package a4;

import h5.d0;
import java.math.BigInteger;
import r3.r;
import r3.s;
import r3.t;
public final class a implements s {
    public final b f46a;

    public a(b bVar) {
        this.f46a = bVar;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final r f(long j10) {
        b bVar = this.f46a;
        long j11 = bVar.f48b;
        BigInteger valueOf = BigInteger.valueOf((bVar.d.f79i * j10) / 1000000);
        long j12 = bVar.f49c;
        t tVar = new t(j10, d0.i((valueOf.multiply(BigInteger.valueOf(j12 - j11)).divide(BigInteger.valueOf(bVar.f50f)).longValue() + j11) - 30000, bVar.f48b, j12 - 1));
        return new r(tVar, tVar);
    }

    @Override
    public final long g() {
        b bVar = this.f46a;
        return (bVar.f50f * 1000000) / bVar.d.f79i;
    }
}
