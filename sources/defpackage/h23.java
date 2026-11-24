package defpackage;
public final class h23 implements Runnable {
    public final byte a;
    public final o13 b;
    public final us4 c;

    public h23(o13 o13Var, us4 us4Var, byte b) {
        this.a = b;
        this.b = o13Var;
        this.c = us4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        o13 o13Var = this.b;
        switch (b) {
            case 0:
                o13Var.L(obj);
                return;
            case 1:
                if (obj == null) {
                    obj = new ts4("No provider data returned", (byte) 2);
                }
                o13Var.L(obj);
                return;
            default:
                o13Var.L(obj);
                return;
        }
    }
}
