package defpackage;
public final class w69 implements Runnable {
    public final byte a;
    public final c79 b;

    public w69(c79 c79Var, byte b) {
        this.a = b;
        this.b = c79Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        c79 c79Var = this.b;
        switch (b) {
            case 0:
                b79 b79Var = c79Var.a;
                if (b79Var != null) {
                    b79Var.r();
                    return;
                }
                return;
            case 1:
                c79Var.c.a(c79Var.r);
                a79 a79Var = c79Var.d;
                a79Var.getClass();
                a79Var.postRunnable(new z69(a79Var, (byte) 2));
                c79Var.d = null;
                return;
            default:
                c79Var.c.q(c79Var.y);
                return;
        }
    }
}
