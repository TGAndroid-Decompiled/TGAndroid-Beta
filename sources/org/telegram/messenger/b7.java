package org.telegram.messenger;
public final class b7 implements Runnable {
    public final int f23043a;
    public final h7 f23044b;

    public b7(h7 h7Var, int i7) {
        this.f23043a = i7;
        this.f23044b = h7Var;
    }

    @Override
    public final void run() {
        switch (this.f23043a) {
            case 0:
                Runnable runnable = this.f23044b.f24401l;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f23044b.f24401l;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
