package defpackage;
public final class l66 implements Runnable {
    public final byte a;
    public final m66 b;
    public final q66 c;

    public l66(m66 m66Var, q66 q66Var, byte b) {
        this.a = b;
        this.b = m66Var;
        this.c = q66Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        q66 q66Var = this.c;
        m66 m66Var = this.b;
        switch (b) {
            case 0:
                m66Var.l(q66Var, false);
                return;
            default:
                m66Var.l(q66Var, false);
                return;
        }
    }
}
