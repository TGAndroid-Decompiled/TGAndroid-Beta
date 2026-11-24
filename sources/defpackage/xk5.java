package defpackage;
public final class xk5 implements Runnable {
    public final byte a;
    public final al5 b;

    public xk5(al5 al5Var, byte b) {
        this.a = b;
        this.b = al5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        al5 al5Var = this.b;
        switch (b) {
            case 0:
                fl5 fl5Var = al5Var.h;
                ThreadLocal threadLocal = fl5.I;
                fl5Var.Q(true);
                return;
            case 1:
                al5Var.h.u.remove(al5Var.a.e);
                gl.c3(new xk5(al5Var, (byte) 3));
                return;
            case 2:
                fl5 fl5Var2 = al5Var.h;
                ThreadLocal threadLocal2 = fl5.I;
                fl5Var2.Q(true);
                return;
            default:
                tk5 tk5Var = al5Var.a;
                kk7.f(tk5Var.o).k(143, tk5Var.e, 1);
                return;
        }
    }
}
