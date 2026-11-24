package defpackage;
public final class l2c implements zy5, yy5 {
    public final b3c a;
    public final k47 b;
    public final long c;
    public final int d;

    public l2c(b3c b3cVar, k47 k47Var, long j, int i) {
        this.a = b3cVar;
        this.b = k47Var;
        this.c = j;
        this.d = i;
    }

    @Override
    public final void a(String str) {
        gm.c3(new i2c(this.a, str, this.b, this.c, this.d, (byte) 1));
    }

    @Override
    public final void o(Exception exc) {
        gm.c3(new o77(this.a, this.b, this.c, this.d, (byte) 20));
    }
}
