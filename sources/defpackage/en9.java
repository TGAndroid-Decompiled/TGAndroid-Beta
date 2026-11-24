package defpackage;
public final class en9 implements Runnable {
    public final byte a;
    public final un9 b;
    public final Exception c;

    public en9(un9 un9Var, Exception exc, byte b) {
        this.a = b;
        this.b = un9Var;
        this.c = exc;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Exception exc = this.c;
        un9 un9Var = this.b;
        switch (b) {
            case 0:
                un9Var.h(exc);
                return;
            case 1:
                un9Var.h(exc);
                return;
            case 2:
                un9Var.h(exc);
                return;
            default:
                un9Var.h(exc);
                return;
        }
    }
}
