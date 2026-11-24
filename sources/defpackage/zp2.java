package defpackage;
public final class zp2 extends bq2 {
    public final byte f;
    public final dq2 h;

    public zp2(dq2 dq2Var, byte b) {
        super(dq2Var);
        this.f = b;
        this.h = dq2Var;
    }

    @Override
    public final Object a(int i) {
        byte b = this.f;
        dq2 dq2Var = this.h;
        switch (b) {
            case 0:
                return dq2Var.g(i);
            case 1:
                return new cq2(dq2Var, i);
            default:
                return dq2Var.l(i);
        }
    }
}
