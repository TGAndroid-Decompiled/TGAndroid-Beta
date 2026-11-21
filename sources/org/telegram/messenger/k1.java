package org.telegram.messenger;

import java.util.Collections;
public final class k1 implements Runnable {
    public final int f24991a;
    public final r1 f24992b;

    public k1(r1 r1Var, int i7) {
        this.f24991a = i7;
        this.f24992b = r1Var;
    }

    @Override
    public final void run() {
        switch (this.f24991a) {
            case 0:
                r1 r1Var = this.f24992b;
                try {
                    r1Var.o(Collections.singletonList(r1.f26551k), new p1(r1Var));
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                this.f24992b.q();
                return;
        }
    }
}
