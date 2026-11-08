package org.telegram.messenger;
public final class rk implements Runnable {
    public final int f25300a;
    public final boolean[] f25301b;
    public final Runnable[] f25302c;

    public rk(boolean[] zArr, Runnable[] runnableArr, int i7) {
        this.f25300a = i7;
        this.f25301b = zArr;
        this.f25302c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f25300a) {
            case 0:
                this.f25301b[0] = true;
                Runnable runnable = this.f25302c[0];
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f25301b[0] = true;
                Runnable runnable2 = this.f25302c[0];
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
