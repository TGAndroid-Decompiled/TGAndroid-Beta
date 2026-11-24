package defpackage;
public final class kl9 implements Runnable {
    public final byte a;
    public final g29 b;
    public final Exception c;

    public kl9(g29 g29Var, Exception exc, byte b) {
        this.a = b;
        this.b = g29Var;
        this.c = exc;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Exception exc = this.c;
        g29 g29Var = this.b;
        switch (b) {
            case 0:
                ul9 ul9Var = (ul9) g29Var.b;
                ul9Var.m.a("recording segment interrupted in state=".concat(de9.A(ul9Var.a0)), exc);
                int i = ul9Var.a0;
                if (i == 3) {
                    ul9Var.q();
                    return;
                } else if (i == 2) {
                    ul9Var.D = true;
                    return;
                } else {
                    return;
                }
            default:
                ((ul9) g29Var.b).h(exc);
                return;
        }
    }
}
