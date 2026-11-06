package org.telegram.messenger;

import java.util.Collections;
public final class j1 implements Runnable {
    public final int f23443a;
    public final r1 f23444b;

    public j1(r1 r1Var, int i7) {
        this.f23443a = i7;
        this.f23444b = r1Var;
    }

    @Override
    public final void run() {
        switch (this.f23443a) {
            case 0:
                r1 r1Var = this.f23444b;
                try {
                    r1Var.o(Collections.singletonList(r1.f25184k), new m1(r1Var));
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                this.f23444b.q();
                return;
        }
    }
}
