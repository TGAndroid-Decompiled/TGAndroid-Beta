package defpackage;
public final class z23 implements Runnable {
    public final byte a;
    public final h23 b;
    public final yu4 c;

    public z23(h23 h23Var, yu4 yu4Var, byte b) {
        this.a = b;
        this.b = h23Var;
        this.c = yu4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        h23 h23Var = this.b;
        switch (b) {
            case 0:
                h23Var.B(obj);
                return;
            case 1:
                if (obj == null) {
                    obj = new xu4("No provider data returned", (byte) 2);
                }
                h23Var.B(obj);
                return;
            default:
                h23Var.B(obj);
                return;
        }
    }
}
