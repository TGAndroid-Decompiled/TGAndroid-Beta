package org.telegram.messenger;
public final class rk implements Runnable {
    public final int f25304a;
    public final boolean[] f25305b;
    public final Runnable[] f25306c;

    public rk(boolean[] zArr, Runnable[] runnableArr, int i7) {
        this.f25304a = i7;
        this.f25305b = zArr;
        this.f25306c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f25304a) {
            case 0:
                this.f25305b[0] = true;
                Runnable runnable = this.f25306c[0];
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f25305b[0] = true;
                Runnable runnable2 = this.f25306c[0];
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
