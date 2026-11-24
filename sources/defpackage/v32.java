package defpackage;
public final class v32 implements Runnable {
    public final byte a;
    public final c42 b;
    public final vh5 c;

    public v32(c42 c42Var, vh5 vh5Var, byte b) {
        this.a = b;
        this.b = c42Var;
        this.c = vh5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        vh5 vh5Var = this.c;
        c42 c42Var = this.b;
        switch (b) {
            case 0:
                try {
                    ((gl2) vh5Var).G();
                } catch (Exception unused) {
                }
                gl.d3(new v32(c42Var, vh5Var, (byte) 1));
                return;
            default:
                c42Var.U(vh5Var);
                return;
        }
    }
}
