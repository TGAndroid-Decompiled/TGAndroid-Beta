package defpackage;
public final class h0c implements zw5, yw5 {
    public final b1c a;
    public final k27 b;
    public final m11 c;
    public final go2 d;

    public h0c(b1c b1cVar, k27 k27Var, m11 m11Var, go2 go2Var) {
        this.a = b1cVar;
        this.b = k27Var;
        this.c = m11Var;
        this.d = go2Var;
    }

    @Override
    public final void a(String str) {
        gl.c3(new tsa(this.a, this.b, str, this.c, this.d, (byte) 7));
    }

    @Override
    public final void n(Exception exc) {
        gl.c3(new exa(this.a, this.b, this.c, this.d, (byte) 15));
    }
}
