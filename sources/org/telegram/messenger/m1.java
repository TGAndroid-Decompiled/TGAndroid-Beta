package org.telegram.messenger;

import java.util.Collections;
public final class m1 implements Runnable {
    public final int f16855a;
    public final u1 f16856b;

    public m1(u1 u1Var, int i10) {
        this.f16855a = i10;
        this.f16856b = u1Var;
    }

    @Override
    public final void run() {
        switch (this.f16855a) {
            case 0:
                u1 u1Var = this.f16856b;
                try {
                    u1Var.o(Collections.singletonList(u1.f18209k), new p1(u1Var));
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            default:
                this.f16856b.q();
                return;
        }
    }
}
