package defpackage;
public final class h88 extends rn {
    public final byte b;
    public final k88 c;

    public h88(k88 k88Var, byte b) {
        super("thumbAnimationProgress", (byte) 0);
        this.b = b;
        switch (b) {
            case 1:
                this.c = k88Var;
                super("thumbImageVisibleProgress", (byte) 0);
                return;
            default:
                this.c = k88Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f) {
        byte b = this.b;
        k88 k88Var = this.c;
        switch (b) {
            case 0:
                k88Var.r = f;
                ((k88) obj).invalidate();
                return;
            default:
                k88Var.n = f;
                ((k88) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        byte b = this.b;
        k88 k88Var = this.c;
        switch (b) {
            case 0:
                k88 k88Var2 = (k88) obj;
                return Float.valueOf(k88Var.r);
            default:
                k88 k88Var3 = (k88) obj;
                return Float.valueOf(k88Var.n);
        }
    }
}
