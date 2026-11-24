package defpackage;
public final class gk9 implements Runnable {
    public final byte a;
    public final jk9 b;

    public gk9(jk9 jk9Var, byte b) {
        this.a = b;
        this.b = jk9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        jk9 jk9Var = this.b;
        switch (b) {
            case 0:
                if (jk9Var.W != 0) {
                    jk9Var.V = true;
                    return;
                }
                return;
            default:
                jk9Var.c();
                return;
        }
    }
}
