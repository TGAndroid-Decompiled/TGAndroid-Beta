package defpackage;
public final class ng implements jp7 {
    public final byte a;
    public final lp7 b;
    public final lp7 c;
    public final lp7 d;

    public ng(lp7 lp7Var, lp7 lp7Var2, lp7 lp7Var3, byte b) {
        this.a = b;
        this.b = lp7Var;
        this.c = lp7Var2;
        this.d = lp7Var3;
    }

    @Override
    public final void g(lp7 lp7Var, int i) {
        byte b = this.a;
        lp7 lp7Var2 = this.d;
        lp7 lp7Var3 = this.c;
        lp7 lp7Var4 = this.b;
        switch (b) {
            case 0:
                ik.v0(lp7Var4, lp7Var3, lp7Var2);
                return;
            case 1:
                ik.v0(lp7Var4, lp7Var3, lp7Var2);
                return;
            default:
                ik.b(lp7Var4, lp7Var3, lp7Var2);
                return;
        }
    }
}
