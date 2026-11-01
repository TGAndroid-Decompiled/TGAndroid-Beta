package org.telegram.messenger;

import java.util.Collections;
public final class m1 implements Runnable {
    public final int f17025a;
    public final u1 f17026b;

    public m1(u1 u1Var, int i10) {
        this.f17025a = i10;
        this.f17026b = u1Var;
    }

    @Override
    public final void run() {
        switch (this.f17025a) {
            case 0:
                u1 u1Var = this.f17026b;
                try {
                    u1Var.o(Collections.singletonList(u1.f18337k), new p1(u1Var));
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            default:
                this.f17026b.q();
                return;
        }
    }
}
