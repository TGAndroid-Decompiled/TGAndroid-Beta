package defpackage;
public final class u68 extends ro {
    public final byte b;
    public final x68 c;

    public u68(x68 x68Var, byte b) {
        super("thumbAnimationProgress", (byte) 0);
        this.b = b;
        switch (b) {
            case 1:
                this.c = x68Var;
                super("thumbImageVisibleProgress", (byte) 0);
                return;
            default:
                this.c = x68Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f) {
        byte b = this.b;
        x68 x68Var = this.c;
        switch (b) {
            case 0:
                x68Var.r = f;
                ((x68) obj).invalidate();
                return;
            default:
                x68Var.n = f;
                ((x68) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        byte b = this.b;
        x68 x68Var = this.c;
        switch (b) {
            case 0:
                x68 x68Var2 = (x68) obj;
                return Float.valueOf(x68Var.r);
            default:
                x68 x68Var3 = (x68) obj;
                return Float.valueOf(x68Var.n);
        }
    }
}
