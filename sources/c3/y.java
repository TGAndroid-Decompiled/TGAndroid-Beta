package c3;
public final class y implements b0 {
    public final c5.b0 f4241a;
    public final c5.b0 f4242b;
    public long f4243c;

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
            c5.b0 b0Var = new c5.b0(i10, 2);
            this.f4241a = b0Var;
            c5.b0 b0Var2 = new c5.b0(i10, 2);
            this.f4242b = b0Var2;
            b0Var.b(0L);
            b0Var2.b(0L);
        } else {
            this.f4241a = new c5.b0(length, 2);
            this.f4242b = new c5.b0(length, 2);
        }
        this.f4241a.c(jArr);
        this.f4242b.c(jArr2);
        this.f4243c = j3;
    }

    @Override
    public final boolean f() {
        if (this.f4242b.f4260b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final a0 j(long j3) {
        c5.b0 b0Var = this.f4242b;
        if (b0Var.f4260b == 0) {
            c0 c0Var = c0.f4153c;
            return new a0(c0Var, c0Var);
        }
        int b10 = e2.d0.b(b0Var, j3);
        long f7 = b0Var.f(b10);
        c5.b0 b0Var2 = this.f4241a;
        c0 c0Var2 = new c0(f7, b0Var2.f(b10));
        if (f7 != j3 && b10 != b0Var.f4260b - 1) {
            int i10 = b10 + 1;
            return new a0(c0Var2, new c0(b0Var.f(i10), b0Var2.f(i10)));
        }
        return new a0(c0Var2, c0Var2);
    }

    @Override
    public final long l() {
        return this.f4243c;
    }
}
