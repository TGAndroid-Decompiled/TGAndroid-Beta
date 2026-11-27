package defpackage;
public final class ay5 implements pt2 {
    public final byte a;
    public final hc8 b;

    public ay5(hc8 hc8Var, byte b) {
        this.a = b;
        this.b = hc8Var;
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        hc8 hc8Var = this.b;
        Integer num = (Integer) obj;
        switch (b) {
            case 0:
                hc8Var.m0(num);
                return;
            default:
                hc8Var.l0(num);
                return;
        }
    }
}
