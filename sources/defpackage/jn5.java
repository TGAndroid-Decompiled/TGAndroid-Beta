package defpackage;
public final class jn5 implements kv9 {
    public final long a;
    public final long b;
    public final int c;
    public final in5 d;

    public jn5(long j, long j2, long j3) {
        this.d = new in5(j, new long[]{j2}, new long[]{0});
        this.a = j2;
        this.b = j3;
        this.c = gpe.a(j3 - j2, j);
    }

    @Override
    public final long a() {
        return this.b;
    }

    @Override
    public final long b() {
        return this.a;
    }

    @Override
    public final boolean c() {
        return this.d.c();
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final long e(long j) {
        in5 in5Var = this.d;
        dd ddVar = in5Var.b;
        if (ddVar.b == 0) {
            return -9223372036854775807L;
        }
        return ddVar.f0(g8c.c(in5Var.a, j));
    }

    @Override
    public final ev9 f(long j) {
        return this.d.f(j);
    }

    @Override
    public final int g() {
        return this.c;
    }

    @Override
    public final long h() {
        return this.d.c;
    }
}
