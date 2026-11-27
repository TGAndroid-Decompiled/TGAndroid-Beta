package defpackage;
public final class wo9 implements Runnable {
    public final byte a;
    public final jp9 b;
    public final Exception c;

    public wo9(jp9 jp9Var, Exception exc, byte b) {
        this.a = b;
        this.b = jp9Var;
        this.c = exc;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Exception exc = this.c;
        jp9 jp9Var = this.b;
        switch (b) {
            case 0:
                jp9Var.h(exc);
                return;
            case 1:
                jp9Var.h(exc);
                return;
            case 2:
                jp9Var.h(exc);
                return;
            default:
                jp9Var.h(exc);
                return;
        }
    }
}
