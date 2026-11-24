package defpackage;
public final class h46 implements Runnable {
    public final byte a;
    public final i46 b;
    public final m46 c;

    public h46(i46 i46Var, m46 m46Var, byte b) {
        this.a = b;
        this.b = i46Var;
        this.c = m46Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        m46 m46Var = this.c;
        i46 i46Var = this.b;
        switch (b) {
            case 0:
                i46Var.l(m46Var, false);
                return;
            default:
                i46Var.l(m46Var, false);
                return;
        }
    }
}
