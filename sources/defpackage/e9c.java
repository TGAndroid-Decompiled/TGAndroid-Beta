package defpackage;
public final class e9c implements kv9 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;

    public e9c(long[] jArr, long[] jArr2, long j, long j2, long j3) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = gpe.a(j3 - j2, j);
    }

    @Override
    public final long a() {
        return this.e;
    }

    @Override
    public final long b() {
        return this.d;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final long e(long j) {
        return this.a[g8c.f(this.b, j, true)];
    }

    @Override
    public final ev9 f(long j) {
        long[] jArr = this.a;
        int f = g8c.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.b;
        hv9 hv9Var = new hv9(j2, jArr2[f]);
        if (j2 < j && f != jArr.length - 1) {
            int i = f + 1;
            return new ev9(hv9Var, new hv9(jArr[i], jArr2[i]));
        }
        return new ev9(hv9Var, hv9Var);
    }

    @Override
    public final int g() {
        return this.f;
    }

    @Override
    public final long h() {
        return this.c;
    }
}
