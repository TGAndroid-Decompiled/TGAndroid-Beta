package defpackage;
public final class vf8 implements Runnable {
    public final byte a;
    public final yf8 b;

    public vf8(yf8 yf8Var, byte b) {
        this.a = b;
        this.b = yf8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        yf8 yf8Var = this.b;
        switch (b) {
            case 0:
                yf8Var.a(true);
                return;
            default:
                yf8Var.d();
                return;
        }
    }
}
