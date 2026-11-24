package defpackage;
public final class ria extends og0 {
    public final int F;
    public final fm4 G;
    public long H;
    public boolean I;

    public ria(o63 o63Var, u63 u63Var, fm4 fm4Var, int i, Object obj, long j, long j2, long j3, int i2, fm4 fm4Var2) {
        super(o63Var, u63Var, fm4Var, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.F = i2;
        this.G = fm4Var2;
    }

    @Override
    public final void a() {
        gp9[] gp9VarArr;
        zxa zxaVar = this.r;
        tg2 tg2Var = this.y;
        tg2Var.getClass();
        int i = 0;
        for (gp9 gp9Var : (gp9[]) tg2Var.c) {
            if (gp9Var.I != 0) {
                gp9Var.I = 0L;
                gp9Var.C = true;
            }
        }
        wxb b0 = tg2Var.b0(this.F);
        b0.g(this.G);
        try {
            long open = zxaVar.open(this.b.b(this.H));
            if (open != -1) {
                open += this.H;
            }
            ja3 ja3Var = new ja3(zxaVar, this.H, open);
            while (true) {
                long j = this.H;
                if (i != -1) {
                    this.H = j + i;
                    i = b0.f(ja3Var, Integer.MAX_VALUE, true);
                } else {
                    b0.a(this.h, 1, (int) j, 0, null);
                    vbe.a(zxaVar);
                    this.I = true;
                    return;
                }
            }
        } catch (Throwable th) {
            vbe.a(zxaVar);
            throw th;
        }
    }

    @Override
    public final boolean c() {
        return this.I;
    }

    @Override
    public final void d() {
    }
}
