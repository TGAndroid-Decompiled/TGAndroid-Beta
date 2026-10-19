package c3;

import e2.m0;
import v7.u6;
public final class z implements c0 {
    public final c5.c0 f4687a;
    public final c5.c0 f4688b;
    public long f4689c;

    public z(long j10, long[] jArr, long[] jArr2) {
        boolean z10;
        if (jArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        int length = jArr2.length;
        if (length > 0 && jArr2[0] > 0) {
            int i10 = length + 1;
            c5.c0 c0Var = new c5.c0(i10, 3);
            this.f4687a = c0Var;
            c5.c0 c0Var2 = new c5.c0(i10, 3);
            this.f4688b = c0Var2;
            c0Var.d(0L);
            c0Var2.d(0L);
        } else {
            this.f4687a = new c5.c0(length, 3);
            this.f4688b = new c5.c0(length, 3);
        }
        this.f4687a.e(jArr);
        this.f4688b.e(jArr2);
        this.f4689c = j10;
    }

    @Override
    public final boolean d() {
        if (this.f4688b.f4725b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final b0 f(long j10) {
        c5.c0 c0Var = this.f4688b;
        if (c0Var.f4725b == 0) {
            d0 d0Var = d0.f4605c;
            return new b0(d0Var, d0Var);
        }
        int c10 = m0.c(c0Var, j10);
        long n10 = c0Var.n(c10);
        c5.c0 c0Var2 = this.f4687a;
        d0 d0Var2 = new d0(n10, c0Var2.n(c10));
        if (n10 != j10 && c10 != c0Var.f4725b - 1) {
            int i10 = c10 + 1;
            return new b0(d0Var2, new d0(c0Var.n(i10), c0Var2.n(i10)));
        }
        return new b0(d0Var2, d0Var2);
    }

    @Override
    public final long h() {
        return this.f4689c;
    }
}
