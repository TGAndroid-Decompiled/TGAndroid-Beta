package defpackage;
public final class it1 implements Runnable {
    public final byte a;
    public final jt1 b;

    public it1(jt1 jt1Var, byte b) {
        this.a = b;
        this.b = jt1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        jt1 jt1Var = this.b;
        switch (b) {
            case 0:
                ms1 ms1Var = jt1Var.I.a0;
                if (ms1Var != null) {
                    ms1Var.j1();
                    return;
                }
                return;
            default:
                ms1 ms1Var2 = jt1Var.I.a0;
                if (ms1Var2 != null) {
                    ms1Var2.U0 = false;
                    jz1 jz1Var = ms1Var2.V0;
                    if (jz1Var != null) {
                        jz1Var.s(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
