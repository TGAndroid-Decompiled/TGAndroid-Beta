package defpackage;
public final class no0 implements Runnable {
    public final byte a;
    public final to0 b;

    public no0(to0 to0Var, byte b) {
        this.a = b;
        this.b = to0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        to0 to0Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new no0(to0Var, (byte) 1));
                return;
            default:
                to0Var.a(null);
                return;
        }
    }
}
