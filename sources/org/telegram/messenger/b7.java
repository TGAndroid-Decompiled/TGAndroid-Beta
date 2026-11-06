package org.telegram.messenger;
public final class b7 implements Runnable {
    public final int f21597a;
    public final h7 f21598b;

    public b7(h7 h7Var, int i7) {
        this.f21597a = i7;
        this.f21598b = h7Var;
    }

    @Override
    public final void run() {
        switch (this.f21597a) {
            case 0:
                Runnable runnable = this.f21598b.f22850l;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f21598b.f22850l;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
