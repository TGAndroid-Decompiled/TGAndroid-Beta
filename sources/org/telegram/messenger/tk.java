package org.telegram.messenger;
public final class tk implements Runnable {
    public final int f25625a;
    public final boolean[] f25626b;
    public final Runnable[] f25627c;

    public tk(boolean[] zArr, Runnable[] runnableArr, int i7) {
        this.f25625a = i7;
        this.f25626b = zArr;
        this.f25627c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f25625a) {
            case 0:
                this.f25626b[0] = true;
                Runnable runnable = this.f25627c[0];
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f25626b[0] = true;
                Runnable runnable2 = this.f25627c[0];
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
