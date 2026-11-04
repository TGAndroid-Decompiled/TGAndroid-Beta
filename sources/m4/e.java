package m4;

import e3.a0;
import e3.b0;
import e3.c0;
import g2.n0;
import h2.s;
import java.math.RoundingMode;
public final class e implements b0 {
    public final s f19086a;
    public final int f19087b;
    public final long f19088c;
    public final long d;
    public final long f19089e;

    public e(s sVar, int i3, long j10, long j11) {
        this.f19086a = sVar;
        this.f19087b = i3;
        this.f19088c = j10;
        long j12 = (j11 - j10) / sVar.f14178c;
        this.d = j12;
        this.f19089e = i(j12);
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
    public final a0 f(long j10) {
        s sVar = this.f19086a;
        long j11 = (sVar.f14177b * j10) / (this.f19087b * 1000000);
        long j12 = this.d;
        long j13 = n0.j(j11, 0L, j12 - 1);
        long j14 = this.f19088c;
        long i3 = i(j13);
        c0 c0Var = new c0(i3, (sVar.f14178c * j13) + j14);
        if (i3 < j10 && j13 != j12 - 1) {
            long j15 = j13 + 1;
            return new a0(c0Var, new c0(i(j15), (sVar.f14178c * j15) + j14));
        }
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long h() {
        return this.f19089e;
    }

    public final long i(long j10) {
        long j11 = j10 * this.f19087b;
        long j12 = this.f19086a.f14177b;
        String str = n0.f11873a;
        return n0.a0(j11, 1000000L, j12, RoundingMode.DOWN);
    }
}
