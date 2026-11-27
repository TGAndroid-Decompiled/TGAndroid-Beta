package defpackage;

import java.util.Collections;
public final class yh0 implements Runnable {
    public final byte a;
    public final di0 b;

    public yh0(di0 di0Var, byte b) {
        this.a = b;
        this.b = di0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        di0 di0Var = this.b;
        switch (b) {
            case 0:
                di0Var.getClass();
                try {
                    di0Var.o(Collections.singletonList(di0.k), new zh0(di0Var, (byte) 0));
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            default:
                di0Var.q();
                return;
        }
    }
}
