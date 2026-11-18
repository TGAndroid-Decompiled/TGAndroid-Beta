package org.telegram.messenger;
public final class nk implements Runnable {
    public final int f25935a;
    public final boolean[] f25936b;
    public final Runnable[] f25937c;

    public nk(boolean[] zArr, Runnable[] runnableArr, int i7) {
        this.f25935a = i7;
        this.f25936b = zArr;
        this.f25937c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f25935a) {
            case 0:
                this.f25936b[0] = true;
                Runnable runnable = this.f25937c[0];
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f25936b[0] = true;
                Runnable runnable2 = this.f25937c[0];
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
