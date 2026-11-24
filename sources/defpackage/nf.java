package defpackage;
public final class nf implements fn7 {
    public final byte a;
    public final hn7 b;
    public final hn7 c;
    public final hn7 d;

    public nf(hn7 hn7Var, hn7 hn7Var2, hn7 hn7Var3, byte b) {
        this.a = b;
        this.b = hn7Var;
        this.c = hn7Var2;
        this.d = hn7Var3;
    }

    @Override
    public final void i(hn7 hn7Var, int i) {
        byte b = this.a;
        hn7 hn7Var2 = this.d;
        hn7 hn7Var3 = this.c;
        hn7 hn7Var4 = this.b;
        switch (b) {
            case 0:
                ij.v0(hn7Var4, hn7Var3, hn7Var2);
                return;
            case 1:
                ij.v0(hn7Var4, hn7Var3, hn7Var2);
                return;
            default:
                ij.b(hn7Var4, hn7Var3, hn7Var2);
                return;
        }
    }
}
