package defpackage;
public final class jp5 implements nx9 {
    public final long a;
    public final long b;
    public final int c;
    public final ip5 d;

    public jp5(long j, long j2, long j3) {
        this.d = new ip5(j, new long[]{j2}, new long[]{0});
        this.a = j2;
        this.b = j3;
        this.c = jre.a(j3 - j2, j);
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
        ip5 ip5Var = this.d;
        de deVar = ip5Var.b;
        if (deVar.b == 0) {
            return -9223372036854775807L;
        }
        return deVar.g0(hac.c(ip5Var.a, j));
    }

    @Override
    public final hx9 f(long j) {
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
