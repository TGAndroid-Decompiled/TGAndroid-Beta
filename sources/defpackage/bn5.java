package defpackage;
public final class bn5 implements Runnable {
    public final byte a;
    public final dn5 b;
    public final Boolean c;

    public bn5(dn5 dn5Var, Boolean bool, byte b) {
        this.a = b;
        this.b = dn5Var;
        this.c = bool;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Boolean bool = this.c;
        dn5 dn5Var = this.b;
        switch (b) {
            case 0:
                dn5Var.h.u.remove(dn5Var.a.e);
                hl.c3(new bn5(dn5Var, bool, (byte) 1));
                return;
            default:
                boolean booleanValue = bool.booleanValue();
                wm5 wm5Var = dn5Var.a;
                if (booleanValue) {
                    jn7.f(wm5Var.o).k(143, wm5Var.e, wm5Var.p);
                    return;
                } else {
                    jn7.f(wm5Var.o).k(144, wm5Var.e, 2);
                    return;
                }
        }
    }
}
