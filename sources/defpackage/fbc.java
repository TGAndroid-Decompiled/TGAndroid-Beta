package defpackage;
public final class fbc implements nx9 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;

    public fbc(long[] jArr, long[] jArr2, long j, long j2, long j3) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = jre.a(j3 - j2, j);
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
        return this.a[hac.f(this.b, j, true)];
    }

    @Override
    public final hx9 f(long j) {
        long[] jArr = this.a;
        int f = hac.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.b;
        kx9 kx9Var = new kx9(j2, jArr2[f]);
        if (j2 < j && f != jArr.length - 1) {
            int i = f + 1;
            return new hx9(kx9Var, new kx9(jArr[i], jArr2[i]));
        }
        return new hx9(kx9Var, kx9Var);
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
