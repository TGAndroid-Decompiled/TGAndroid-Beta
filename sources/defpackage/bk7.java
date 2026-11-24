package defpackage;
public final class bk7 implements Runnable {
    public final byte a;
    public final kk7 b;

    public bk7(kk7 kk7Var, byte b) {
        this.a = b;
        this.b = kk7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        kk7 kk7Var = this.b;
        switch (b) {
            case 0:
            case 2:
                kk7Var.c();
                return;
            case 1:
                kk7Var.getClass();
                kk7Var.i = new bk7(kk7Var, (byte) 2);
                return;
            default:
                kk7Var.o();
                return;
        }
    }
}
