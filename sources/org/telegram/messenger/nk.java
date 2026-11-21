package org.telegram.messenger;
public final class nk implements Runnable {
    public final int f25963a;
    public final boolean[] f25964b;
    public final Runnable[] f25965c;

    public nk(boolean[] zArr, Runnable[] runnableArr, int i7) {
        this.f25963a = i7;
        this.f25964b = zArr;
        this.f25965c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f25963a) {
            case 0:
                this.f25964b[0] = true;
                Runnable runnable = this.f25965c[0];
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f25964b[0] = true;
                Runnable runnable2 = this.f25965c[0];
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
