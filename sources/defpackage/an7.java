package defpackage;
public final class an7 implements Runnable {
    public final byte a;
    public final jn7 b;

    public an7(jn7 jn7Var, byte b) {
        this.a = b;
        this.b = jn7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        jn7 jn7Var = this.b;
        switch (b) {
            case 0:
            case 2:
                jn7Var.c();
                return;
            case 1:
                jn7Var.getClass();
                jn7Var.i = new an7(jn7Var, (byte) 2);
                return;
            default:
                jn7Var.o();
                return;
        }
    }
}
