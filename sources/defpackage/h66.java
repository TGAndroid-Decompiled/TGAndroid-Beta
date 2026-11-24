package defpackage;
public final class h66 implements Runnable {
    public final byte a;
    public final i66 b;
    public final m66 c;

    public h66(i66 i66Var, m66 m66Var, byte b) {
        this.a = b;
        this.b = i66Var;
        this.c = m66Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        m66 m66Var = this.c;
        i66 i66Var = this.b;
        switch (b) {
            case 0:
                i66Var.l(m66Var, false);
                return;
            default:
                i66Var.l(m66Var, false);
                return;
        }
    }
}
