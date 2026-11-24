package defpackage;
public final class xm5 implements Runnable {
    public final byte a;
    public final an5 b;

    public xm5(an5 an5Var, byte b) {
        this.a = b;
        this.b = an5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        an5 an5Var = this.b;
        switch (b) {
            case 0:
                fn5 fn5Var = an5Var.h;
                ThreadLocal threadLocal = fn5.I;
                fn5Var.Q(true);
                return;
            case 1:
                an5Var.h.u.remove(an5Var.a.e);
                gm.c3(new xm5(an5Var, (byte) 3));
                return;
            case 2:
                fn5 fn5Var2 = an5Var.h;
                ThreadLocal threadLocal2 = fn5.I;
                fn5Var2.Q(true);
                return;
            default:
                tm5 tm5Var = an5Var.a;
                nm7.f(tm5Var.o).k(144, tm5Var.e, 1);
                return;
        }
    }
}
