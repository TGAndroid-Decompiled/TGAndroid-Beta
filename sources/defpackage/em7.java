package defpackage;
public final class em7 implements Runnable {
    public final byte a;
    public final nm7 b;

    public em7(nm7 nm7Var, byte b) {
        this.a = b;
        this.b = nm7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        nm7 nm7Var = this.b;
        switch (b) {
            case 0:
            case 2:
                nm7Var.c();
                return;
            case 1:
                nm7Var.getClass();
                nm7Var.i = new em7(nm7Var, (byte) 2);
                return;
            default:
                nm7Var.o();
                return;
        }
    }
}
