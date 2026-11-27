package defpackage;
public final class id9 implements Runnable {
    public final byte a;
    public final ld9 b;

    public id9(ld9 ld9Var, byte b) {
        this.a = b;
        this.b = ld9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ld9 ld9Var = this.b;
        switch (b) {
            case 0:
                ed9 ed9Var = ld9Var.c;
                if (!ed9Var.k.isEmpty()) {
                    ed9Var.k.clear();
                    ed9Var.p();
                    return;
                }
                return;
            case 1:
                ed9 ed9Var2 = ld9Var.c;
                if (!ed9Var2.l.isEmpty()) {
                    ed9Var2.l.clear();
                    ed9Var2.p();
                    return;
                }
                return;
            case 2:
                ed9 ed9Var3 = ld9Var.c;
                if (!ed9Var3.m.isEmpty()) {
                    ed9Var3.m.clear();
                    ed9Var3.p();
                    return;
                }
                return;
            case 3:
                ld9Var.c.t(dd9.a);
                return;
            case 4:
                ld9Var.c.t(dd9.b);
                return;
            default:
                ld9Var.c.t(dd9.c);
                return;
        }
    }
}
