package c3;

import e2.m0;
import v7.u6;
public final class y implements b0 {
    public final c5.c0 f4308a;
    public final c5.c0 f4309b;
    public long f4310c;

    public y(long j10, long[] jArr, long[] jArr2) {
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
            this.f4308a = c0Var;
            c5.c0 c0Var2 = new c5.c0(i10, 3);
            this.f4309b = c0Var2;
            c0Var.c(0L);
            c0Var2.c(0L);
        } else {
            this.f4308a = new c5.c0(length, 3);
            this.f4309b = new c5.c0(length, 3);
        }
        this.f4308a.f(jArr);
        this.f4309b.f(jArr2);
        this.f4310c = j10;
    }

    @Override
    public final boolean d() {
        if (this.f4309b.f4352b > 0) {
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
        c5.c0 c0Var = this.f4309b;
        if (c0Var.f4352b == 0) {
            c0 c0Var2 = c0.f4218c;
            return new a0(c0Var2, c0Var2);
        }
        int c10 = m0.c(c0Var, j10);
        long m10 = c0Var.m(c10);
        c5.c0 c0Var3 = this.f4308a;
        c0 c0Var4 = new c0(m10, c0Var3.m(c10));
        if (m10 != j10 && c10 != c0Var.f4352b - 1) {
            int i10 = c10 + 1;
            return new a0(c0Var4, new c0(c0Var.m(i10), c0Var3.m(i10)));
        }
        return new a0(c0Var4, c0Var4);
    }

    @Override
    public final long h() {
        return this.f4310c;
    }
}
