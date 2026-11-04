package org.telegram.messenger;

import java.util.Collections;
public final class j1 implements Runnable {
    public final int f23627a;
    public final r1 f23628b;

    public j1(r1 r1Var, int i3) {
        this.f23627a = i3;
        this.f23628b = r1Var;
    }

    @Override
    public final void run() {
        switch (this.f23627a) {
            case 0:
                r1 r1Var = this.f23628b;
                try {
                    r1Var.o(Collections.singletonList(r1.f25027k), new m1(r1Var));
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                this.f23628b.q();
                return;
        }
    }
}
