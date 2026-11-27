package defpackage;
public final class m31 implements x1c {
    public final int a;
    public final ko4 b;
    public final po3 c = new po3();
    public ko4 d;
    public x1c e;
    public long f;

    public m31(int i, int i2, ko4 ko4Var) {
        this.a = i2;
        this.b = ko4Var;
    }

    @Override
    public final void a(long j, int i, int i2, int i3, w1c w1cVar) {
        long j2 = this.f;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.e = this.c;
        }
        x1c x1cVar = this.e;
        String str = gcc.a;
        x1cVar.a(j, i, i2, i3, w1cVar);
    }

    @Override
    public final void b(ey7 ey7Var, int i, int i2) {
        x1c x1cVar = this.e;
        String str = gcc.a;
        x1cVar.e(i, ey7Var);
    }

    @Override
    public final int c(z63 z63Var, int i, boolean z) {
        x1c x1cVar = this.e;
        String str = gcc.a;
        return x1cVar.f(z63Var, i, z);
    }

    @Override
    public final void e(int i, ey7 ey7Var) {
        xnb.b(this, ey7Var, i);
    }

    @Override
    public final int f(z63 z63Var, int i, boolean z) {
        return c(z63Var, i, z);
    }

    @Override
    public final void g(ko4 ko4Var) {
        ko4 ko4Var2 = this.b;
        if (ko4Var2 != null) {
            ko4Var = ko4Var.d(ko4Var2);
        }
        this.d = ko4Var;
        x1c x1cVar = this.e;
        String str = gcc.a;
        x1cVar.g(ko4Var);
    }

    @Override
    public final void d(long j) {
    }
}
