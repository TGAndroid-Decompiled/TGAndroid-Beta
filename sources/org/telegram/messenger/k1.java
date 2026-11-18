package org.telegram.messenger;

import java.util.Collections;
public final class k1 implements Runnable {
    public final int f24963a;
    public final r1 f24964b;

    public k1(r1 r1Var, int i7) {
        this.f24963a = i7;
        this.f24964b = r1Var;
    }

    @Override
    public final void run() {
        switch (this.f24963a) {
            case 0:
                r1 r1Var = this.f24964b;
                try {
                    r1Var.o(Collections.singletonList(r1.f26523k), new p1(r1Var));
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                this.f24964b.q();
                return;
        }
    }
}
