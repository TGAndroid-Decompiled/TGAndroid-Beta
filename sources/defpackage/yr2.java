package defpackage;
public final class yr2 implements Runnable {
    public final byte a;
    public final tv6 b;
    public final su6 c;

    public yr2(tv6 tv6Var, su6 su6Var, byte b) {
        this.a = b;
        this.b = tv6Var;
        this.c = su6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        su6 su6Var = this.c;
        tv6 tv6Var = this.b;
        switch (b) {
            case 0:
                if (!tv6Var.i()) {
                    if (tv6Var.x) {
                        if (!tv6.j(su6Var)) {
                            if (tv6Var.h(su6Var)) {
                                tv6Var.x = false;
                            }
                        } else {
                            return;
                        }
                    }
                    tv6Var.e.getClass();
                    return;
                }
                return;
            case 1:
                tv6Var.g.S(su6Var, Integer.MIN_VALUE, 1, ox6.X(new yw6((byte) 15)));
                return;
            case 2:
                tv6Var.g.S(su6Var, Integer.MIN_VALUE, 9, ox6.X(new yw6((byte) 20)));
                return;
            case 3:
                tv6Var.g.S(su6Var, Integer.MIN_VALUE, 7, ox6.X(new yw6((byte) 17)));
                return;
            case 4:
                tv6Var.g.S(su6Var, Integer.MIN_VALUE, 12, ox6.X(new yw6((byte) 19)));
                return;
            case 5:
                tv6Var.g.S(su6Var, Integer.MIN_VALUE, 11, ox6.X(new yw6((byte) 16)));
                return;
            case 6:
                tv6Var.g.S(su6Var, Integer.MIN_VALUE, 3, ox6.X(new yw6((byte) 21)));
                return;
            case 7:
                tv6Var.g.S(su6Var, Integer.MIN_VALUE, 1, ox6.X(new yw6((byte) 15)));
                return;
            case 8:
                tv6Var.g.Q(su6Var, Integer.MIN_VALUE);
                return;
            default:
                tv6Var.g.Q(su6Var, Integer.MIN_VALUE);
                return;
        }
    }
}
