package defpackage;
public final class hp2 extends jp2 {
    public final byte f;
    public final lp2 h;

    public hp2(lp2 lp2Var, byte b) {
        super(lp2Var);
        this.f = b;
        this.h = lp2Var;
    }

    @Override
    public final Object a(int i) {
        byte b = this.f;
        lp2 lp2Var = this.h;
        switch (b) {
            case 0:
                return lp2Var.g(i);
            case 1:
                return new kp2(lp2Var, i);
            default:
                return lp2Var.l(i);
        }
    }
}
