package a4;

import h5.d0;
import java.math.BigInteger;
import r3.r;
import r3.s;
import r3.t;
public final class a implements s {
    public final b f47a;

    public a(b bVar) {
        this.f47a = bVar;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final r f(long j10) {
        b bVar = this.f47a;
        long j11 = bVar.f49b;
        BigInteger valueOf = BigInteger.valueOf((bVar.d.f80i * j10) / 1000000);
        long j12 = bVar.f50c;
        t tVar = new t(j10, d0.i((valueOf.multiply(BigInteger.valueOf(j12 - j11)).divide(BigInteger.valueOf(bVar.f51f)).longValue() + j11) - 30000, bVar.f49b, j12 - 1));
        return new r(tVar, tVar);
    }

    @Override
    public final long g() {
        b bVar = this.f47a;
        return (bVar.f51f * 1000000) / bVar.d.f80i;
    }
}
