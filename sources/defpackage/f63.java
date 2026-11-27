package defpackage;

import java.io.IOException;
public final class f63 implements la6 {
    public final i63 a;

    public f63(i63 i63Var) {
        this.a = i63Var;
    }

    public final void a() {
        long j;
        i63 i63Var = this.a;
        synchronized (rhd.b) {
            if (rhd.c) {
                j = rhd.d;
            } else {
                j = -9223372036854775807L;
            }
        }
        i63Var.N = j;
        i63Var.z(true);
    }

    @Override
    public final ma6 c2(oa6 oa6Var, long j, long j2, IOException iOException, int i) {
        jy7 jy7Var = (jy7) oa6Var;
        i63 i63Var = this.a;
        lp lpVar = i63Var.r;
        ia6 ia6Var = new ia6(jy7Var.a, jy7Var.b, j);
        b2b b2bVar = jy7Var.d;
        ia6Var.d = b2bVar.c;
        ia6Var.e = b2bVar.d;
        ia6Var.f = j2;
        ia6Var.g = b2bVar.b;
        lpVar.s(new ja6(ia6Var), jy7Var.c, iOException, true);
        i63Var.n.getClass();
        i63Var.y(iOException);
        return rx6.y;
    }

    @Override
    public final void f(oa6 oa6Var, long j, long j2, boolean z) {
        this.a.x((jy7) oa6Var, j, j2);
    }

    @Override
    public final void f0(oa6 oa6Var, long j, long j2) {
        jy7 jy7Var = (jy7) oa6Var;
        i63 i63Var = this.a;
        ia6 ia6Var = new ia6(jy7Var.a, jy7Var.b, j);
        b2b b2bVar = jy7Var.d;
        ia6Var.d = b2bVar.c;
        ia6Var.e = b2bVar.d;
        ia6Var.f = j2;
        ia6Var.g = b2bVar.b;
        ja6 ja6Var = new ja6(ia6Var);
        i63Var.n.getClass();
        i63Var.r.p(ja6Var, jy7Var.c);
        i63Var.N = ((Long) jy7Var.f).longValue() - j;
        i63Var.z(true);
    }

    @Override
    public final void R0(oa6 oa6Var, long j, long j2, int i) {
    }
}
