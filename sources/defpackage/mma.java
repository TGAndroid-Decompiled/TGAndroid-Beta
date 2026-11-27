package defpackage;
public final class mma extends pg0 {
    public final int F;
    public final ko4 G;
    public long H;
    public boolean I;

    public mma(h73 h73Var, n73 n73Var, ko4 ko4Var, int i, Object obj, long j, long j2, long j3, int i2, ko4 ko4Var2) {
        super(h73Var, n73Var, ko4Var, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.F = i2;
        this.G = ko4Var2;
    }

    @Override
    public final void a() {
        ys9[] ys9VarArr;
        b2b b2bVar = this.r;
        lh2 lh2Var = this.y;
        lh2Var.getClass();
        int i = 0;
        for (ys9 ys9Var : (ys9[]) lh2Var.c) {
            if (ys9Var.I != 0) {
                ys9Var.I = 0L;
                ys9Var.C = true;
            }
        }
        x1c V = lh2Var.V(this.F);
        V.g(this.G);
        try {
            long open = b2bVar.open(this.b.b(this.H));
            if (open != -1) {
                open += this.H;
            }
            cb3 cb3Var = new cb3(b2bVar, this.H, open);
            while (true) {
                long j = this.H;
                if (i != -1) {
                    this.H = j + i;
                    i = V.f(cb3Var, Integer.MAX_VALUE, true);
                } else {
                    V.a(this.h, 1, (int) j, 0, null);
                    lge.a(b2bVar);
                    this.I = true;
                    return;
                }
            }
        } catch (Throwable th) {
            lge.a(b2bVar);
            throw th;
        }
    }

    @Override
    public final boolean d() {
        return this.I;
    }

    @Override
    public final void c() {
    }
}
