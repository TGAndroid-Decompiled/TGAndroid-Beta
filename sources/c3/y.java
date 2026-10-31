package c3;

import v7.t6;
public final class y implements b0 {
    public final c5.x f3716a;
    public final c5.x f3717b;
    public long f3718c;

    public y(long j10, long[] jArr, long[] jArr2) {
        boolean z10;
        if (jArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.f(z10);
        int length = jArr2.length;
        if (length > 0 && jArr2[0] > 0) {
            int i10 = length + 1;
            c5.x xVar = new c5.x(i10, 4);
            this.f3716a = xVar;
            c5.x xVar2 = new c5.x(i10, 4);
            this.f3717b = xVar2;
            xVar.e(0L);
            xVar2.e(0L);
        } else {
            this.f3716a = new c5.x(length, 4);
            this.f3717b = new c5.x(length, 4);
        }
        this.f3716a.f(jArr);
        this.f3717b.f(jArr2);
        this.f3718c = j10;
    }

    @Override
    public final boolean d() {
        if (this.f3717b.f3827b > 0) {
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
        c5.x xVar = this.f3717b;
        if (xVar.f3827b == 0) {
            c0 c0Var = c0.f3623c;
            return new a0(c0Var, c0Var);
        }
        int c10 = e2.l0.c(xVar, j10);
        long k10 = xVar.k(c10);
        c5.x xVar2 = this.f3716a;
        c0 c0Var2 = new c0(k10, xVar2.k(c10));
        if (k10 != j10 && c10 != xVar.f3827b - 1) {
            int i10 = c10 + 1;
            return new a0(c0Var2, new c0(xVar.k(i10), xVar2.k(i10)));
        }
        return new a0(c0Var2, c0Var2);
    }

    @Override
    public final long h() {
        return this.f3718c;
    }
}
