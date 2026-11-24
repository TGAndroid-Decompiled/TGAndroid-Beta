package defpackage;
public final class uu0 implements p8c {
    public final byte a;
    public final gt3 b;

    public uu0(gt3 gt3Var, byte b) {
        this.a = b;
        this.b = gt3Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        gt3 gt3Var = this.b;
        switch (b) {
            case 0:
                gl.t1(gt3Var);
                gl.e3((Runnable) obj, 80L);
                return;
            default:
                gt3Var.H(((Integer) obj).intValue());
                return;
        }
    }
}
