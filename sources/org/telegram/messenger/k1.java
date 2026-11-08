package org.telegram.messenger;

import java.util.Collections;
public final class k1 implements Runnable {
    public final int f23645a;
    public final r1 f23646b;

    public k1(r1 r1Var, int i7) {
        this.f23645a = i7;
        this.f23646b = r1Var;
    }

    @Override
    public final void run() {
        switch (this.f23645a) {
            case 0:
                r1 r1Var = this.f23646b;
                try {
                    r1Var.o(Collections.singletonList(r1.f25197k), new p1(r1Var));
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                this.f23646b.q();
                return;
        }
    }
}
