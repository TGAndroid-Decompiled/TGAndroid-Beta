package defpackage;
public final class vx5 implements gu2 {
    public final byte a;
    public final sa8 b;

    public vx5(sa8 sa8Var, byte b) {
        this.a = b;
        this.b = sa8Var;
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        sa8 sa8Var = this.b;
        Integer num = (Integer) obj;
        switch (b) {
            case 0:
                sa8Var.m0(num);
                return;
            default:
                sa8Var.l0(num);
                return;
        }
    }
}
