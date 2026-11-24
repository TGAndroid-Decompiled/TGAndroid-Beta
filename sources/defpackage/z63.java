package defpackage;

import java.io.IOException;
public final class z63 implements ga6 {
    public final c73 a;

    public z63(c73 c73Var) {
        this.a = c73Var;
    }

    public final void a() {
        long j;
        c73 c73Var = this.a;
        synchronized (afd.b) {
            if (afd.c) {
                j = afd.d;
            } else {
                j = -9223372036854775807L;
            }
        }
        c73Var.N = j;
        c73Var.z(true);
    }

    @Override
    public final ha6 f2(ja6 ja6Var, long j, long j2, IOException iOException, int i) {
        dx7 dx7Var = (dx7) ja6Var;
        c73 c73Var = this.a;
        kq kqVar = c73Var.r;
        da6 da6Var = new da6(dx7Var.a, dx7Var.b, j);
        c0b c0bVar = dx7Var.d;
        da6Var.d = c0bVar.c;
        da6Var.e = c0bVar.d;
        da6Var.f = j2;
        da6Var.g = c0bVar.b;
        kqVar.s(new ea6(da6Var), dx7Var.c, iOException, true);
        c73Var.n.getClass();
        c73Var.y(iOException);
        return mx6.y;
    }

    @Override
    public final void g0(ja6 ja6Var, long j, long j2) {
        dx7 dx7Var = (dx7) ja6Var;
        c73 c73Var = this.a;
        da6 da6Var = new da6(dx7Var.a, dx7Var.b, j);
        c0b c0bVar = dx7Var.d;
        da6Var.d = c0bVar.c;
        da6Var.e = c0bVar.d;
        da6Var.f = j2;
        da6Var.g = c0bVar.b;
        ea6 ea6Var = new ea6(da6Var);
        c73Var.n.getClass();
        c73Var.r.p(ea6Var, dx7Var.c);
        c73Var.N = ((Long) dx7Var.f).longValue() - j;
        c73Var.z(true);
    }

    @Override
    public final void w(ja6 ja6Var, long j, long j2, boolean z) {
        this.a.x((dx7) ja6Var, j, j2);
    }

    @Override
    public final void W0(ja6 ja6Var, long j, long j2, int i) {
    }
}
