package c3;

import v7.u6;
public final class b0 implements e0 {
    public final c5.c0 f4587a;
    public final c5.c0 f4588b;
    public long f4589c;

    public b0(long j10, long[] jArr, long[] jArr2) {
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
            this.f4587a = c0Var;
            c5.c0 c0Var2 = new c5.c0(i10, 3);
            this.f4588b = c0Var2;
            c0Var.e(0L);
            c0Var2.e(0L);
        } else {
            this.f4587a = new c5.c0(length, 3);
            this.f4588b = new c5.c0(length, 3);
        }
        this.f4587a.f(jArr);
        this.f4588b.f(jArr2);
        this.f4589c = j10;
    }

    @Override
    public final boolean d() {
        if (this.f4588b.f4728b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final d0 f(long j10) {
        c5.c0 c0Var = this.f4588b;
        if (c0Var.f4728b == 0) {
            f0 f0Var = f0.f4620c;
            return new d0(f0Var, f0Var);
        }
        int c10 = e2.m0.c(c0Var, j10);
        long n10 = c0Var.n(c10);
        c5.c0 c0Var2 = this.f4587a;
        f0 f0Var2 = new f0(n10, c0Var2.n(c10));
        if (n10 != j10 && c10 != c0Var.f4728b - 1) {
            int i10 = c10 + 1;
            return new d0(f0Var2, new f0(c0Var.n(i10), c0Var2.n(i10)));
        }
        return new d0(f0Var2, f0Var2);
    }

    @Override
    public final long h() {
        return this.f4589c;
    }
}
