package defpackage;
public final class vv5 implements vs2 {
    public final byte a;
    public final q88 b;

    public vv5(q88 q88Var, byte b) {
        this.a = b;
        this.b = q88Var;
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        q88 q88Var = this.b;
        Integer num = (Integer) obj;
        switch (b) {
            case 0:
                q88Var.m0(num);
                return;
            default:
                q88Var.l0(num);
                return;
        }
    }
}
