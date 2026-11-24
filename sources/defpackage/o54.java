package defpackage;
public final class o54 implements x56 {
    public final byte a;
    public final y54 b;

    public o54(y54 y54Var, byte b) {
        this.a = b;
        this.b = y54Var;
    }

    @Override
    public final void invoke(Object obj) {
        byte b = this.a;
        y54 y54Var = this.b;
        mc8 mc8Var = (mc8) obj;
        switch (b) {
            case 2:
                mc8Var.K(y54Var.P);
                return;
            default:
                mc8Var.C(y54Var.R);
                return;
        }
    }
}
