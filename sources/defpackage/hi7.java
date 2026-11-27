package defpackage;
public final class hi7 implements Runnable {
    public final byte a;
    public final pi7 b;

    public hi7(pi7 pi7Var, byte b) {
        this.a = b;
        this.b = pi7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        pi7 pi7Var = this.b;
        switch (b) {
            case 0:
                pi7Var.dismiss();
                return;
            case 1:
                pi7Var.c1(true, false);
                return;
            default:
                pi7Var.c1(true, false);
                return;
        }
    }
}
