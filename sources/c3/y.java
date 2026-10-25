package c3;

import a8.yb;
import e2.n0;
public final class y implements b0 {
    public final d5.z f6121a;
    public final d5.z f6122b;
    public long f6123c;

    public y(long j10, long[] jArr, long[] jArr2) {
        boolean z10;
        if (jArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        int length = jArr2.length;
        if (length > 0 && jArr2[0] > 0) {
            int i10 = length + 1;
            d5.z zVar = new d5.z(i10, 3);
            this.f6121a = zVar;
            d5.z zVar2 = new d5.z(i10, 3);
            this.f6122b = zVar2;
            zVar.c(0L);
            zVar2.c(0L);
        } else {
            this.f6121a = new d5.z(length, 3);
            this.f6122b = new d5.z(length, 3);
        }
        this.f6121a.d(jArr);
        this.f6122b.d(jArr2);
        this.f6123c = j10;
    }

    @Override
    public final boolean d() {
        if (this.f6122b.f8026b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final a0 f(long j10) {
        d5.z zVar = this.f6122b;
        if (zVar.f8026b == 0) {
            c0 c0Var = c0.f6030c;
            return new a0(c0Var, c0Var);
        }
        int c10 = n0.c(zVar, j10);
        long j11 = zVar.j(c10);
        d5.z zVar2 = this.f6121a;
        c0 c0Var2 = new c0(j11, zVar2.j(c10));
        if (j11 != j10 && c10 != zVar.f8026b - 1) {
            int i10 = c10 + 1;
            return new a0(c0Var2, new c0(zVar.j(i10), zVar2.j(i10)));
        }
        return new a0(c0Var2, c0Var2);
    }

    @Override
    public final long h() {
        return this.f6123c;
    }
}
