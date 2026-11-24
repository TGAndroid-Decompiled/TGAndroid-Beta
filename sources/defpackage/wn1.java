package defpackage;
public final class wn1 implements Runnable {
    public final byte a;
    public final m8 b;

    public wn1(m8 m8Var, byte b) {
        this.a = b;
        this.b = m8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        m8 m8Var = this.b;
        switch (b) {
            case 0:
                m8Var.d(true);
                return;
            default:
                m8Var.d(true);
                return;
        }
    }
}
