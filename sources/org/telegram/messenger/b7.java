package org.telegram.messenger;
public final class b7 implements Runnable {
    public final int f21629a;
    public final h7 f21630b;

    public b7(h7 h7Var, int i7) {
        this.f21629a = i7;
        this.f21630b = h7Var;
    }

    @Override
    public final void run() {
        switch (this.f21629a) {
            case 0:
                Runnable runnable = this.f21630b.f22860l;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f21630b.f22860l;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
