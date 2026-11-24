package defpackage;
public final class h2c implements zy5, yy5 {
    public final b3c a;
    public final k47 b;
    public final u21 c;
    public final rp2 d;

    public h2c(b3c b3cVar, k47 k47Var, u21 u21Var, rp2 rp2Var) {
        this.a = b3cVar;
        this.b = k47Var;
        this.c = u21Var;
        this.d = rp2Var;
    }

    @Override
    public final void a(String str) {
        gm.c3(new vua(this.a, this.b, str, this.c, this.d, (byte) 7));
    }

    @Override
    public final void o(Exception exc) {
        gm.c3(new hza(this.a, this.b, this.c, this.d, (byte) 15));
    }
}
