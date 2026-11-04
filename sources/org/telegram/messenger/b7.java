package org.telegram.messenger;
public final class b7 implements Runnable {
    public final int f21748a;
    public final h7 f21749b;

    public b7(h7 h7Var, int i3) {
        this.f21748a = i3;
        this.f21749b = h7Var;
    }

    @Override
    public final void run() {
        switch (this.f21748a) {
            case 0:
                Runnable runnable = this.f21749b.f22899l;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f21749b.f22899l;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
