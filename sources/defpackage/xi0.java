package defpackage;

import java.util.Collections;
public final class xi0 implements Runnable {
    public final byte a;
    public final cj0 b;

    public xi0(cj0 cj0Var, byte b) {
        this.a = b;
        this.b = cj0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        cj0 cj0Var = this.b;
        switch (b) {
            case 0:
                cj0Var.getClass();
                try {
                    cj0Var.o(Collections.singletonList(cj0.k), new yi0(cj0Var, (byte) 0));
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            default:
                cj0Var.q();
                return;
        }
    }
}
