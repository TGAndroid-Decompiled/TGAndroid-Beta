package n4;

import f3.a0;
import f3.b0;
import f3.c0;
import h2.l0;
import i2.s;
import java.math.RoundingMode;
public final class e implements b0 {
    public final s f20967a;
    public final int f20968b;
    public final long f20969c;
    public final long d;
    public final long f20970e;

    public e(s sVar, int i7, long j3, long j10) {
        this.f20967a = sVar;
        this.f20968b = i7;
        this.f20969c = j3;
        long j11 = (j10 - j3) / sVar.f15679c;
        this.d = j11;
        this.f20970e = i(j11);
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
    public final a0 f(long j3) {
        s sVar = this.f20967a;
        long j10 = (sVar.f15678b * j3) / (this.f20968b * 1000000);
        long j11 = this.d;
        long j12 = l0.j(j10, 0L, j11 - 1);
        long j13 = this.f20969c;
        long i7 = i(j12);
        c0 c0Var = new c0(i7, (sVar.f15679c * j12) + j13);
        if (i7 < j3 && j12 != j11 - 1) {
            long j14 = j12 + 1;
            return new a0(c0Var, new c0(i(j14), (sVar.f15679c * j14) + j13));
        }
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long h() {
        return this.f20970e;
    }

    public final long i(long j3) {
        long j10 = j3 * this.f20968b;
        long j11 = this.f20967a.f15678b;
        String str = l0.f13471a;
        return l0.a0(j10, 1000000L, j11, RoundingMode.DOWN);
    }
}
