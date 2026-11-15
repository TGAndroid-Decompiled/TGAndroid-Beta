package org.telegram.messenger;

import java.util.Collections;
public final class k1 implements Runnable {
    public final int f24622a;
    public final r1 f24623b;

    public k1(r1 r1Var, int i7) {
        this.f24622a = i7;
        this.f24623b = r1Var;
    }

    @Override
    public final void run() {
        switch (this.f24622a) {
            case 0:
                r1 r1Var = this.f24623b;
                try {
                    r1Var.o(Collections.singletonList(r1.f26185k), new p1(r1Var));
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                this.f24623b.q();
                return;
        }
    }
}
