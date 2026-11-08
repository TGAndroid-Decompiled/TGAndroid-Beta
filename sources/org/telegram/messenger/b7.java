package org.telegram.messenger;
public final class b7 implements Runnable {
    public final int f21624a;
    public final h7 f21625b;

    public b7(h7 h7Var, int i7) {
        this.f21624a = i7;
        this.f21625b = h7Var;
    }

    @Override
    public final void run() {
        switch (this.f21624a) {
            case 0:
                Runnable runnable = this.f21625b.f22856l;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f21625b.f22856l;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
