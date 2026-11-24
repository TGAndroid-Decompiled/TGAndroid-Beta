package defpackage;
public final class s48 extends qn {
    public final byte b;
    public final v48 c;

    public s48(v48 v48Var, byte b) {
        super("thumbAnimationProgress", (byte) 0);
        this.b = b;
        switch (b) {
            case 1:
                this.c = v48Var;
                super("thumbImageVisibleProgress", (byte) 0);
                return;
            default:
                this.c = v48Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f) {
        byte b = this.b;
        v48 v48Var = this.c;
        switch (b) {
            case 0:
                v48Var.r = f;
                ((v48) obj).invalidate();
                return;
            default:
                v48Var.n = f;
                ((v48) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        byte b = this.b;
        v48 v48Var = this.c;
        switch (b) {
            case 0:
                v48 v48Var2 = (v48) obj;
                return Float.valueOf(v48Var.r);
            default:
                v48 v48Var3 = (v48) obj;
                return Float.valueOf(v48Var.n);
        }
    }
}
