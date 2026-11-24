package defpackage;
public final class w36 implements Runnable {
    public final byte a;
    public final a46 b;

    public w36(a46 a46Var, byte b) {
        this.a = b;
        this.b = a46Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        a46 a46Var = this.b;
        switch (b) {
            case 0:
                a46Var.b();
                return;
            default:
                a46Var.c();
                return;
        }
    }
}
