package defpackage;
public final class jt2 implements Runnable {
    public final byte a;
    public final tx6 b;
    public final sw6 c;

    public jt2(tx6 tx6Var, sw6 sw6Var, byte b) {
        this.a = b;
        this.b = tx6Var;
        this.c = sw6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        sw6 sw6Var = this.c;
        tx6 tx6Var = this.b;
        switch (b) {
            case 0:
                if (!tx6Var.i()) {
                    if (tx6Var.x) {
                        if (!tx6.j(sw6Var)) {
                            if (tx6Var.h(sw6Var)) {
                                tx6Var.x = false;
                            }
                        } else {
                            return;
                        }
                    }
                    tx6Var.e.getClass();
                    return;
                }
                return;
            case 1:
                tx6Var.g.S(sw6Var, Integer.MIN_VALUE, 1, oz6.X(new yy6((byte) 17)));
                return;
            case 2:
                tx6Var.g.S(sw6Var, Integer.MIN_VALUE, 9, oz6.X(new yy6((byte) 22)));
                return;
            case 3:
                tx6Var.g.S(sw6Var, Integer.MIN_VALUE, 7, oz6.X(new yy6((byte) 19)));
                return;
            case 4:
                tx6Var.g.S(sw6Var, Integer.MIN_VALUE, 12, oz6.X(new yy6((byte) 21)));
                return;
            case 5:
                tx6Var.g.S(sw6Var, Integer.MIN_VALUE, 11, oz6.X(new yy6((byte) 18)));
                return;
            case 6:
                tx6Var.g.S(sw6Var, Integer.MIN_VALUE, 3, oz6.X(new yy6((byte) 23)));
                return;
            case 7:
                tx6Var.g.S(sw6Var, Integer.MIN_VALUE, 1, oz6.X(new yy6((byte) 17)));
                return;
            case 8:
                tx6Var.g.Q(sw6Var, Integer.MIN_VALUE);
                return;
            default:
                tx6Var.g.Q(sw6Var, Integer.MIN_VALUE);
                return;
        }
    }
}
