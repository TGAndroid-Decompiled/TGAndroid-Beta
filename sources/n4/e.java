package n4;

import f3.a0;
import f3.b0;
import f3.c0;
import h2.l0;
import i2.s;
import java.math.RoundingMode;
public final class e implements b0 {
    public final s f21359a;
    public final int f21360b;
    public final long f21361c;
    public final long d;
    public final long f21362e;

    public e(s sVar, int i7, long j3, long j10) {
        this.f21359a = sVar;
        this.f21360b = i7;
        this.f21361c = j3;
        long j11 = (j10 - j3) / sVar.f16022c;
        this.d = j11;
        this.f21362e = i(j11);
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
        s sVar = this.f21359a;
        long j10 = (sVar.f16021b * j3) / (this.f21360b * 1000000);
        long j11 = this.d;
        long j12 = l0.j(j10, 0L, j11 - 1);
        long j13 = this.f21361c;
        long i7 = i(j12);
        c0 c0Var = new c0(i7, (sVar.f16022c * j12) + j13);
        if (i7 < j3 && j12 != j11 - 1) {
            long j14 = j12 + 1;
            return new a0(c0Var, new c0(i(j14), (sVar.f16022c * j14) + j13));
        }
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long h() {
        return this.f21362e;
    }

    public final long i(long j3) {
        long j10 = j3 * this.f21360b;
        long j11 = this.f21359a.f16021b;
        String str = l0.f13815a;
        return l0.a0(j10, 1000000L, j11, RoundingMode.DOWN);
    }
}
