package defpackage;
public final class xe7 implements Runnable {
    public final byte a;
    public final ye7 b;

    public xe7(ye7 ye7Var, byte b) {
        this.a = b;
        this.b = ye7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ye7 ye7Var = this.b;
        switch (b) {
            case 0:
                ye7Var.x();
                return;
            default:
                ye7Var.m(true);
                return;
        }
    }
}
