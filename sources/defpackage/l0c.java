package defpackage;
public final class l0c implements zw5, yw5 {
    public final b1c a;
    public final k27 b;
    public final long c;
    public final int d;

    public l0c(b1c b1cVar, k27 k27Var, long j, int i) {
        this.a = b1cVar;
        this.b = k27Var;
        this.c = j;
        this.d = i;
    }

    @Override
    public final void a(String str) {
        gl.c3(new i0c(this.a, str, this.b, this.c, this.d, (byte) 1));
    }

    @Override
    public final void n(Exception exc) {
        gl.c3(new o57(this.a, this.b, this.c, this.d, (byte) 20));
    }
}
