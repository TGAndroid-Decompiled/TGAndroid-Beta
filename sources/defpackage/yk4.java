package defpackage;
public final class yk4 implements ik4 {
    public final byte a;
    public final c59 b;

    public yk4(c59 c59Var, byte b) {
        this.a = b;
        this.b = c59Var;
    }

    @Override
    public final Object c(Object obj, fw2 fw2Var) {
        byte b = this.a;
        c59 c59Var = this.b;
        switch (b) {
            case 0:
                c59Var.a = obj;
                throw new i1(this);
            default:
                c59Var.a = obj;
                throw new i1(this);
        }
    }
}
