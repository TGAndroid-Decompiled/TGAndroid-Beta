package c3;

import e2.m0;
import v7.u6;
public final class y implements b0 {
    public final c5.c0 f4312a;
    public final c5.c0 f4313b;
    public long f4314c;

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
            this.f4312a = c0Var;
            c5.c0 c0Var2 = new c5.c0(i10, 3);
            this.f4313b = c0Var2;
            c0Var.b(0L);
            c0Var2.b(0L);
        } else {
            this.f4312a = new c5.c0(length, 3);
            this.f4313b = new c5.c0(length, 3);
        }
        this.f4312a.c(jArr);
        this.f4313b.c(jArr2);
        this.f4314c = j10;
    }

    @Override
    public final boolean d() {
        if (this.f4313b.f4355b > 0) {
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
        c5.c0 c0Var = this.f4313b;
        if (c0Var.f4355b == 0) {
            c0 c0Var2 = c0.f4222c;
            return new a0(c0Var2, c0Var2);
        }
        int c10 = m0.c(c0Var, j10);
        long h = c0Var.h(c10);
        c5.c0 c0Var3 = this.f4312a;
        c0 c0Var4 = new c0(h, c0Var3.h(c10));
        if (h != j10 && c10 != c0Var.f4355b - 1) {
            int i10 = c10 + 1;
            return new a0(c0Var4, new c0(c0Var.h(i10), c0Var3.h(i10)));
        }
        return new a0(c0Var4, c0Var4);
    }

    @Override
    public final long h() {
        return this.f4314c;
    }
}
