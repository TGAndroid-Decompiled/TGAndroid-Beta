package defpackage;
public final class oo2 extends qo2 {
    public final byte f;
    public final so2 h;

    public oo2(so2 so2Var, byte b) {
        super(so2Var);
        this.f = b;
        this.h = so2Var;
    }

    @Override
    public final Object a(int i) {
        byte b = this.f;
        so2 so2Var = this.h;
        switch (b) {
            case 0:
                return so2Var.g(i);
            case 1:
                return new ro2(so2Var, i);
            default:
                return so2Var.l(i);
        }
    }
}
