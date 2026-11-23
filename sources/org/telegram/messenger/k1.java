package org.telegram.messenger;

import java.util.Collections;
public final class k1 implements Runnable {
    public final int f25064a;
    public final r1 f25065b;

    public k1(r1 r1Var, int i7) {
        this.f25064a = i7;
        this.f25065b = r1Var;
    }

    @Override
    public final void run() {
        switch (this.f25064a) {
            case 0:
                r1 r1Var = this.f25065b;
                try {
                    r1Var.o(Collections.singletonList(r1.f26621k), new p1(r1Var));
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                this.f25065b.q();
                return;
        }
    }
}
