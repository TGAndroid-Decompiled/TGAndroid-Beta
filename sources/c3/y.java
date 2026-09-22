package c3;
public final class y implements b0 {
    public final c5.a0 f3826a;
    public final c5.a0 f3827b;
    public long f3828c;

    public y(long j3, long[] jArr, long[] jArr2) {
        boolean z10;
        if (jArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        int length = jArr2.length;
        if (length > 0 && jArr2[0] > 0) {
            int i10 = length + 1;
            c5.a0 a0Var = new c5.a0(i10, 2);
            this.f3826a = a0Var;
            c5.a0 a0Var2 = new c5.a0(i10, 2);
            this.f3827b = a0Var2;
            a0Var.c(0L);
            a0Var2.c(0L);
        } else {
            this.f3826a = new c5.a0(length, 2);
            this.f3827b = new c5.a0(length, 2);
        }
        this.f3826a.d(jArr);
        this.f3827b.d(jArr2);
        this.f3828c = j3;
    }

    @Override
    public final boolean f() {
        if (this.f3827b.f3844b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final a0 j(long j3) {
        c5.a0 a0Var = this.f3827b;
        if (a0Var.f3844b == 0) {
            c0 c0Var = c0.f3738c;
            return new a0(c0Var, c0Var);
        }
        int b10 = e2.d0.b(a0Var, j3);
        long f7 = a0Var.f(b10);
        c5.a0 a0Var2 = this.f3826a;
        c0 c0Var2 = new c0(f7, a0Var2.f(b10));
        if (f7 != j3 && b10 != a0Var.f3844b - 1) {
            int i10 = b10 + 1;
            return new a0(c0Var2, new c0(a0Var.f(i10), a0Var2.f(i10)));
        }
        return new a0(c0Var2, c0Var2);
    }

    @Override
    public final long l() {
        return this.f3828c;
    }
}
