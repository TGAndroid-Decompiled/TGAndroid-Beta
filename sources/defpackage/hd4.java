package defpackage;
public final class hd4 implements Runnable {
    public final byte a;
    public final jd4 b;

    public hd4(jd4 jd4Var, byte b) {
        this.a = b;
        this.b = jd4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        jd4 jd4Var = this.b;
        switch (b) {
            case 0:
                jd4Var.d();
                return;
            case 1:
                jd4Var.a();
                return;
            default:
                jd4Var.b(jd4Var.E);
                return;
        }
    }
}
