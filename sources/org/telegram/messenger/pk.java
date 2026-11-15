package org.telegram.messenger;
public final class pk implements Runnable {
    public final int f25940a;
    public final boolean[] f25941b;
    public final Runnable[] f25942c;

    public pk(boolean[] zArr, Runnable[] runnableArr, int i7) {
        this.f25940a = i7;
        this.f25941b = zArr;
        this.f25942c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f25940a) {
            case 0:
                this.f25941b[0] = true;
                Runnable runnable = this.f25942c[0];
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f25941b[0] = true;
                Runnable runnable2 = this.f25942c[0];
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
