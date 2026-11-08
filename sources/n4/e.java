package n4;

import f3.b0;
import f3.c0;
import f3.d0;
import h2.m0;
import i2.s;
import java.math.RoundingMode;
public final class e implements c0 {
    public final s f20398a;
    public final int f20399b;
    public final long f20400c;
    public final long d;
    public final long f20401e;

    public e(s sVar, int i7, long j3, long j10) {
        this.f20398a = sVar;
        this.f20399b = i7;
        this.f20400c = j3;
        long j11 = (j10 - j3) / sVar.f15225c;
        this.d = j11;
        this.f20401e = i(j11);
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final b0 f(long j3) {
        s sVar = this.f20398a;
        long j10 = (sVar.f15224b * j3) / (this.f20399b * 1000000);
        long j11 = this.d;
        long j12 = m0.j(j10, 0L, j11 - 1);
        long j13 = this.f20400c;
        long i7 = i(j12);
        d0 d0Var = new d0(i7, (sVar.f15225c * j12) + j13);
        if (i7 < j3 && j12 != j11 - 1) {
            long j14 = j12 + 1;
            return new b0(d0Var, new d0(i(j14), (sVar.f15225c * j14) + j13));
        }
        return new b0(d0Var, d0Var);
    }

    @Override
    public final long h() {
        return this.f20401e;
    }

    public final long i(long j3) {
        long j10 = j3 * this.f20399b;
        long j11 = this.f20398a.f15224b;
        String str = m0.f14112a;
        return m0.a0(j10, 1000000L, j11, RoundingMode.DOWN);
    }
}
