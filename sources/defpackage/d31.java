package defpackage;
public final class d31 implements wxb {
    public final int a;
    public final fm4 b;
    public final yn3 c = new yn3();
    public fm4 d;
    public wxb e;
    public long f;

    public d31(int i, int i2, fm4 fm4Var) {
        this.a = i2;
        this.b = fm4Var;
    }

    @Override
    public final void a(long j, int i, int i2, int i3, vxb vxbVar) {
        long j2 = this.f;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.e = this.c;
        }
        wxb wxbVar = this.e;
        String str = g8c.a;
        wxbVar.a(j, i, i2, i3, vxbVar);
    }

    @Override
    public final void b(xu7 xu7Var, int i, int i2) {
        wxb wxbVar = this.e;
        String str = g8c.a;
        wxbVar.e(i, xu7Var);
    }

    @Override
    public final int c(g63 g63Var, int i, boolean z) {
        wxb wxbVar = this.e;
        String str = g8c.a;
        return wxbVar.f(g63Var, i, z);
    }

    @Override
    public final void e(int i, xu7 xu7Var) {
        yjb.b(this, xu7Var, i);
    }

    @Override
    public final int f(g63 g63Var, int i, boolean z) {
        return c(g63Var, i, z);
    }

    @Override
    public final void g(fm4 fm4Var) {
        fm4 fm4Var2 = this.b;
        if (fm4Var2 != null) {
            fm4Var = fm4Var.d(fm4Var2);
        }
        this.d = fm4Var;
        wxb wxbVar = this.e;
        String str = g8c.a;
        wxbVar.g(fm4Var);
    }

    @Override
    public final void d(long j) {
    }
}
