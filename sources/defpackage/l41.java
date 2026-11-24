package defpackage;
public final class l41 implements yzb {
    public final int a;
    public final go4 b;
    public final ip3 c = new ip3();
    public go4 d;
    public yzb e;
    public long f;

    public l41(int i, int i2, go4 go4Var) {
        this.a = i2;
        this.b = go4Var;
    }

    @Override
    public final void a(long j, int i, int i2, int i3, xzb xzbVar) {
        long j2 = this.f;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.e = this.c;
        }
        yzb yzbVar = this.e;
        String str = hac.a;
        yzbVar.a(j, i, i2, i3, xzbVar);
    }

    @Override
    public final void b(yw7 yw7Var, int i, int i2) {
        yzb yzbVar = this.e;
        String str = hac.a;
        yzbVar.e(i, yw7Var);
    }

    @Override
    public final int c(s73 s73Var, int i, boolean z) {
        yzb yzbVar = this.e;
        String str = hac.a;
        return yzbVar.f(s73Var, i, z);
    }

    @Override
    public final void e(int i, yw7 yw7Var) {
        mlb.b(this, yw7Var, i);
    }

    @Override
    public final int f(s73 s73Var, int i, boolean z) {
        return c(s73Var, i, z);
    }

    @Override
    public final void g(go4 go4Var) {
        go4 go4Var2 = this.b;
        if (go4Var2 != null) {
            go4Var = go4Var.d(go4Var2);
        }
        this.d = go4Var;
        yzb yzbVar = this.e;
        String str = hac.a;
        yzbVar.g(go4Var);
    }

    @Override
    public final void d(long j) {
    }
}
