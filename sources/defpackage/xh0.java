package defpackage;

import java.util.Collections;
public final class xh0 implements Runnable {
    public final byte a;
    public final ci0 b;

    public xh0(ci0 ci0Var, byte b) {
        this.a = b;
        this.b = ci0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ci0 ci0Var = this.b;
        switch (b) {
            case 0:
                ci0Var.getClass();
                try {
                    ci0Var.o(Collections.singletonList(ci0.k), new yh0(ci0Var, (byte) 0));
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            default:
                ci0Var.q();
                return;
        }
    }
}
