package defpackage;
public final class el9 implements Runnable {
    public final byte a;
    public final ul9 b;
    public final Exception c;

    public el9(ul9 ul9Var, Exception exc, byte b) {
        this.a = b;
        this.b = ul9Var;
        this.c = exc;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Exception exc = this.c;
        ul9 ul9Var = this.b;
        switch (b) {
            case 0:
                ul9Var.h(exc);
                return;
            case 1:
                ul9Var.h(exc);
                return;
            case 2:
                ul9Var.h(exc);
                return;
            default:
                ul9Var.h(exc);
                return;
        }
    }
}
