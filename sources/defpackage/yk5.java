package defpackage;
public final class yk5 implements Runnable {
    public final byte a;
    public final al5 b;
    public final Boolean c;

    public yk5(al5 al5Var, Boolean bool, byte b) {
        this.a = b;
        this.b = al5Var;
        this.c = bool;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Boolean bool = this.c;
        al5 al5Var = this.b;
        switch (b) {
            case 0:
                al5Var.h.u.remove(al5Var.a.e);
                gl.c3(new yk5(al5Var, bool, (byte) 1));
                return;
            default:
                boolean booleanValue = bool.booleanValue();
                tk5 tk5Var = al5Var.a;
                if (booleanValue) {
                    kk7.f(tk5Var.o).k(142, tk5Var.e, tk5Var.p);
                    return;
                } else {
                    kk7.f(tk5Var.o).k(143, tk5Var.e, 2);
                    return;
                }
        }
    }
}
