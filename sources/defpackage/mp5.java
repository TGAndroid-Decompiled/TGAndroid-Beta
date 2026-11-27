package defpackage;
public final class mp5 implements ez9 {
    public final long a;
    public final long b;
    public final int c;
    public final lp5 d;

    public mp5(long j, long j2, long j3) {
        this.d = new lp5(j, new long[]{j2}, new long[]{0});
        this.a = j2;
        this.b = j3;
        this.c = cue.a(j3 - j2, j);
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
    public final yy9 e(long j) {
        return this.d.e(j);
    }

    @Override
    public final long f(long j) {
        lp5 lp5Var = this.d;
        ed edVar = lp5Var.b;
        if (edVar.b == 0) {
            return -9223372036854775807L;
        }
        return edVar.h0(gcc.c(lp5Var.a, j));
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
