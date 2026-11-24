package defpackage;
public final class kn9 implements Runnable {
    public final byte a;
    public final et8 b;
    public final Exception c;

    public kn9(et8 et8Var, Exception exc, byte b) {
        this.a = b;
        this.b = et8Var;
        this.c = exc;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Exception exc = this.c;
        et8 et8Var = this.b;
        switch (b) {
            case 0:
                un9 un9Var = (un9) et8Var.b;
                un9Var.m.a("recording segment interrupted in state=".concat(hg9.A(un9Var.a0)), exc);
                int i = un9Var.a0;
                if (i == 3) {
                    un9Var.q();
                    return;
                } else if (i == 2) {
                    un9Var.D = true;
                    return;
                } else {
                    return;
                }
            default:
                ((un9) et8Var.b).h(exc);
                return;
        }
    }
}
