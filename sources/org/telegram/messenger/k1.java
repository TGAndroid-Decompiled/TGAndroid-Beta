package org.telegram.messenger;

import java.util.Collections;
public final class k1 implements Runnable {
    public final int f23649a;
    public final r1 f23650b;

    public k1(r1 r1Var, int i7) {
        this.f23649a = i7;
        this.f23650b = r1Var;
    }

    @Override
    public final void run() {
        switch (this.f23649a) {
            case 0:
                r1 r1Var = this.f23650b;
                try {
                    r1Var.o(Collections.singletonList(r1.f25201k), new p1(r1Var));
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                this.f23650b.q();
                return;
        }
    }
}
