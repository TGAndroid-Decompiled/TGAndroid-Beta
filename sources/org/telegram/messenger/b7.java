package org.telegram.messenger;
public final class b7 implements Runnable {
    public final int f23071a;
    public final h7 f23072b;

    public b7(h7 h7Var, int i7) {
        this.f23071a = i7;
        this.f23072b = h7Var;
    }

    @Override
    public final void run() {
        switch (this.f23071a) {
            case 0:
                Runnable runnable = this.f23072b.f24429l;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f23072b.f24429l;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
