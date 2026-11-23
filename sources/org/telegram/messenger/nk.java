package org.telegram.messenger;
public final class nk implements Runnable {
    public final int f26031a;
    public final boolean[] f26032b;
    public final Runnable[] f26033c;

    public nk(boolean[] zArr, Runnable[] runnableArr, int i7) {
        this.f26031a = i7;
        this.f26032b = zArr;
        this.f26033c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f26031a) {
            case 0:
                this.f26032b[0] = true;
                Runnable runnable = this.f26033c[0];
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f26032b[0] = true;
                Runnable runnable2 = this.f26033c[0];
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
