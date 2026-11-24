package defpackage;
public final class y64 implements x76 {
    public final byte a;
    public final h74 b;

    public y64(h74 h74Var, byte b) {
        this.a = b;
        this.b = h74Var;
    }

    @Override
    public final void invoke(Object obj) {
        byte b = this.a;
        h74 h74Var = this.b;
        pe8 pe8Var = (pe8) obj;
        switch (b) {
            case 2:
                pe8Var.K(h74Var.P);
                return;
            default:
                pe8Var.C(h74Var.R);
                return;
        }
    }
}
