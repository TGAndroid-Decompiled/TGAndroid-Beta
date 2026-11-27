package defpackage;
public final class l42 implements Runnable {
    public final byte a;
    public final s42 b;
    public final xj5 c;

    public l42(s42 s42Var, xj5 xj5Var, byte b) {
        this.a = b;
        this.b = s42Var;
        this.c = xj5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        xj5 xj5Var = this.c;
        s42 s42Var = this.b;
        switch (b) {
            case 0:
                try {
                    ((am2) xj5Var).F();
                } catch (Exception unused) {
                }
                hl.c3(new l42(s42Var, xj5Var, (byte) 1));
                return;
            default:
                s42Var.T(xj5Var);
                return;
        }
    }
}
