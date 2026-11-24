package defpackage;
public final class bz8 implements Runnable {
    public final byte a;
    public final jo0 b;
    public final ry8 c;

    public bz8(jo0 jo0Var, ry8 ry8Var, byte b) {
        this.a = b;
        this.b = jo0Var;
        this.c = ry8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ry8 ry8Var = this.c;
        jo0 jo0Var = this.b;
        switch (b) {
            case 0:
                gl.d3(new bz8(jo0Var, ry8Var, (byte) 1));
                return;
            default:
                jo0Var.removeView(ry8Var);
                return;
        }
    }
}
