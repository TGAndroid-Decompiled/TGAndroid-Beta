package defpackage;
public final class rs2 implements Runnable {
    public final byte a;
    public final yx6 b;
    public final xw6 c;

    public rs2(yx6 yx6Var, xw6 xw6Var, byte b) {
        this.a = b;
        this.b = yx6Var;
        this.c = xw6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        xw6 xw6Var = this.c;
        yx6 yx6Var = this.b;
        switch (b) {
            case 0:
                if (!yx6Var.i()) {
                    if (yx6Var.x) {
                        if (!yx6.j(xw6Var)) {
                            if (yx6Var.h(xw6Var)) {
                                yx6Var.x = false;
                            }
                        } else {
                            return;
                        }
                    }
                    yx6Var.e.getClass();
                    return;
                }
                return;
            case 1:
                yx6Var.g.S(xw6Var, Integer.MIN_VALUE, 1, sz6.X(new tq6((byte) 27)));
                return;
            case 2:
                yx6Var.g.S(xw6Var, Integer.MIN_VALUE, 9, sz6.X(new hz6((byte) 2)));
                return;
            case 3:
                yx6Var.g.S(xw6Var, Integer.MIN_VALUE, 7, sz6.X(new tq6((byte) 29)));
                return;
            case 4:
                yx6Var.g.S(xw6Var, Integer.MIN_VALUE, 12, sz6.X(new hz6((byte) 1)));
                return;
            case 5:
                yx6Var.g.S(xw6Var, Integer.MIN_VALUE, 11, sz6.X(new tq6((byte) 28)));
                return;
            case 6:
                yx6Var.g.S(xw6Var, Integer.MIN_VALUE, 3, sz6.X(new hz6((byte) 3)));
                return;
            case 7:
                yx6Var.g.S(xw6Var, Integer.MIN_VALUE, 1, sz6.X(new tq6((byte) 27)));
                return;
            case 8:
                yx6Var.g.Q(xw6Var, Integer.MIN_VALUE);
                return;
            default:
                yx6Var.g.Q(xw6Var, Integer.MIN_VALUE);
                return;
        }
    }
}
