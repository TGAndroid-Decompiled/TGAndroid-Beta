package defpackage;
public final class edc implements ez9 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;

    public edc(long[] jArr, long[] jArr2, long j, long j2, long j3) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = cue.a(j3 - j2, j);
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
    public final yy9 e(long j) {
        long[] jArr = this.a;
        int f = gcc.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.b;
        bz9 bz9Var = new bz9(j2, jArr2[f]);
        if (j2 < j && f != jArr.length - 1) {
            int i = f + 1;
            return new yy9(bz9Var, new bz9(jArr[i], jArr2[i]));
        }
        return new yy9(bz9Var, bz9Var);
    }

    @Override
    public final long f(long j) {
        return this.a[gcc.f(this.b, j, true)];
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
