package defpackage;
public final class w98 implements Runnable {
    public final byte a;
    public final aa8 b;

    public w98(aa8 aa8Var, byte b) {
        this.a = b;
        this.b = aa8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        aa8 aa8Var = this.b;
        switch (b) {
            case 0:
                aa8Var.d();
                return;
            default:
                aa8Var.f();
                return;
        }
    }
}
