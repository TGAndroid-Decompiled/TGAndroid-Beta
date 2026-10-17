package c3;

import e2.m0;
import v7.u6;
public final class z implements c0 {
    public final c5.b0 f4688a;
    public final c5.b0 f4689b;
    public long f4690c;

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
            c5.b0 b0Var = new c5.b0(i10, 3);
            this.f4688a = b0Var;
            c5.b0 b0Var2 = new c5.b0(i10, 3);
            this.f4689b = b0Var2;
            b0Var.c(0L);
            b0Var2.c(0L);
        } else {
            this.f4688a = new c5.b0(length, 3);
            this.f4689b = new c5.b0(length, 3);
        }
        this.f4688a.d(jArr);
        this.f4689b.d(jArr2);
        this.f4690c = j10;
    }

    @Override
    public final boolean d() {
        if (this.f4689b.f4702b > 0) {
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
        c5.b0 b0Var = this.f4689b;
        if (b0Var.f4702b == 0) {
            d0 d0Var = d0.f4606c;
            return new b0(d0Var, d0Var);
        }
        int c10 = m0.c(b0Var, j10);
        long m10 = b0Var.m(c10);
        c5.b0 b0Var2 = this.f4688a;
        d0 d0Var2 = new d0(m10, b0Var2.m(c10));
        if (m10 != j10 && c10 != b0Var.f4702b - 1) {
            int i10 = c10 + 1;
            return new b0(d0Var2, new d0(b0Var.m(i10), b0Var2.m(i10)));
        }
        return new b0(d0Var2, d0Var2);
    }

    @Override
    public final long h() {
        return this.f4690c;
    }
}
