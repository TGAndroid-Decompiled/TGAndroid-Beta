package defpackage;
public final class y89 implements Runnable {
    public final byte a;
    public final e99 b;

    public y89(e99 e99Var, byte b) {
        this.a = b;
        this.b = e99Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        e99 e99Var = this.b;
        switch (b) {
            case 0:
                d99 d99Var = e99Var.a;
                if (d99Var != null) {
                    d99Var.z();
                    return;
                }
                return;
            case 1:
                e99Var.c.a(e99Var.r);
                c99 c99Var = e99Var.d;
                c99Var.getClass();
                c99Var.postRunnable(new b99(c99Var, (byte) 2));
                e99Var.d = null;
                return;
            default:
                e99Var.c.q(e99Var.y);
                return;
        }
    }
}
