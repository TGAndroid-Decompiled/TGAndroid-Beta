package defpackage;
public final class bc9 implements Runnable {
    public final byte a;
    public final nd9 b;

    public bc9(nd9 nd9Var, byte b) {
        this.a = b;
        this.b = nd9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        nd9 nd9Var = this.b;
        switch (b) {
            case 0:
                ed9 ed9Var = nd9Var.e;
                if (ed9Var != null) {
                    ed9Var.s(nd9Var.K);
                    return;
                }
                return;
            case 1:
                nd9Var.e.t(dd9.a);
                return;
            case 2:
                nd9Var.e.t(dd9.b);
                return;
            default:
                nd9Var.e.t(dd9.c);
                return;
        }
    }
}
