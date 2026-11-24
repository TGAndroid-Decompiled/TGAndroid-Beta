package defpackage;
public final class w56 implements Runnable {
    public final byte a;
    public final a66 b;

    public w56(a66 a66Var, byte b) {
        this.a = b;
        this.b = a66Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        a66 a66Var = this.b;
        switch (b) {
            case 0:
                a66Var.b();
                return;
            default:
                a66Var.c();
                return;
        }
    }
}
