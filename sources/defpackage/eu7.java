package defpackage;
public final class eu7 implements Runnable {
    public final byte a;
    public final gu7 b;
    public final qx c;

    public eu7(gu7 gu7Var, qx qxVar, byte b) {
        this.a = b;
        this.b = gu7Var;
        this.c = qxVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        qx qxVar = this.c;
        gu7 gu7Var = this.b;
        switch (b) {
            case 0:
                gu7Var.p(qxVar, true);
                return;
            default:
                gu7Var.f.f(new eu7(gu7Var, qxVar, (byte) 0));
                return;
        }
    }
}
