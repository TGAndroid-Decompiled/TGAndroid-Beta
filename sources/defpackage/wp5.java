package defpackage;
public final class wp5 implements Runnable {
    public final byte a;
    public final yp5 b;
    public final f08 c;

    public wp5(yp5 yp5Var, f08 f08Var, byte b) {
        this.a = b;
        this.b = yp5Var;
        this.c = f08Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        f08 f08Var = this.c;
        yp5 yp5Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new wp5(yp5Var, f08Var, (byte) 1));
                return;
            default:
                yp5Var.i = f08Var.a;
                return;
        }
    }
}
