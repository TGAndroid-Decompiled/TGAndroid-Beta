package defpackage;
public final class an5 implements Runnable {
    public final byte a;
    public final dn5 b;

    public an5(dn5 dn5Var, byte b) {
        this.a = b;
        this.b = dn5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        dn5 dn5Var = this.b;
        switch (b) {
            case 0:
                in5 in5Var = dn5Var.h;
                ThreadLocal threadLocal = in5.I;
                in5Var.Q(true);
                return;
            case 1:
                dn5Var.h.u.remove(dn5Var.a.e);
                hl.c3(new an5(dn5Var, (byte) 3));
                return;
            case 2:
                in5 in5Var2 = dn5Var.h;
                ThreadLocal threadLocal2 = in5.I;
                in5Var2.Q(true);
                return;
            default:
                wm5 wm5Var = dn5Var.a;
                jn7.f(wm5Var.o).k(144, wm5Var.e, 1);
                return;
        }
    }
}
