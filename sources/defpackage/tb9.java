package defpackage;
public final class tb9 implements Runnable {
    public final byte a;
    public final xb9 b;

    public tb9(xb9 xb9Var, byte b) {
        this.a = b;
        this.b = xb9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        xb9 xb9Var = this.b;
        switch (b) {
            case 0:
                qb9 qb9Var = xb9Var.c;
                if (!qb9Var.j.isEmpty()) {
                    qb9Var.j.clear();
                    qb9Var.m();
                    return;
                }
                return;
            case 1:
                qb9 qb9Var2 = xb9Var.c;
                if (!qb9Var2.k.isEmpty()) {
                    qb9Var2.k.clear();
                    qb9Var2.m();
                    return;
                }
                return;
            case 2:
                qb9 qb9Var3 = xb9Var.c;
                if (!qb9Var3.l.isEmpty()) {
                    qb9Var3.l.clear();
                    qb9Var3.m();
                    return;
                }
                return;
            case 3:
                xb9Var.c.p(pb9.a);
                return;
            case 4:
                xb9Var.c.p(pb9.b);
                return;
            default:
                xb9Var.c.p(pb9.c);
                return;
        }
    }
}
