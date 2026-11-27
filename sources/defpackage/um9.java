package defpackage;
public final class um9 implements Runnable {
    public final byte a;
    public final wm9 b;

    public um9(wm9 wm9Var, byte b) {
        this.a = b;
        this.b = wm9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        wm9 wm9Var = this.b;
        switch (b) {
            case 0:
                wm9Var.g(false);
                return;
            default:
                jn7.f(wm9Var.c).k(311, new Object[0]);
                return;
        }
    }
}
