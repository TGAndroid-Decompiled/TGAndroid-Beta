package defpackage;
public final class j64 implements b86 {
    public final byte a;
    public final s64 b;

    public j64(s64 s64Var, byte b) {
        this.a = b;
        this.b = s64Var;
    }

    @Override
    public final void invoke(Object obj) {
        byte b = this.a;
        s64 s64Var = this.b;
        bg8 bg8Var = (bg8) obj;
        switch (b) {
            case 2:
                bg8Var.K(s64Var.P);
                return;
            default:
                bg8Var.C(s64Var.R);
                return;
        }
    }
}
