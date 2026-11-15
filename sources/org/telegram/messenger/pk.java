package org.telegram.messenger;
public final class pk implements Runnable {
    public final int f25938a;
    public final boolean[] f25939b;
    public final Runnable[] f25940c;

    public pk(boolean[] zArr, Runnable[] runnableArr, int i7) {
        this.f25938a = i7;
        this.f25939b = zArr;
        this.f25940c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f25938a) {
            case 0:
                this.f25939b[0] = true;
                Runnable runnable = this.f25940c[0];
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f25939b[0] = true;
                Runnable runnable2 = this.f25940c[0];
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
