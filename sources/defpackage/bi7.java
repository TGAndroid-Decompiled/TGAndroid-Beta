package defpackage;
public final class bi7 implements Runnable {
    public final byte a;
    public final ji7 b;

    public bi7(ji7 ji7Var, byte b) {
        this.a = b;
        this.b = ji7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ji7 ji7Var = this.b;
        switch (b) {
            case 0:
                ji7Var.dismiss();
                return;
            case 1:
                ji7Var.b1(true, false);
                return;
            default:
                ji7Var.b1(true, false);
                return;
        }
    }
}
